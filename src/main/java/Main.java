import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.swing.*;
import java.awt.*;
import java.io.PrintWriter;
import java.io.Writer;
import java.time.LocalDateTime;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Main {

    private static final float SAMPLE_RATE_PER_SECOND = 8000f;
    private static final int SAMPLE_SIZE_IN_BITS = 8;
    private static final int BUFFER_SIZE_IN_BYTES = ((int) Math.ceil(SAMPLE_RATE_PER_SECOND)) * SAMPLE_SIZE_IN_BITS / 8;
    // If true then play a tone when the buffer height & width are 0,
    // otherwise call the repaint manager to reproduce the IllegalArgumentException.
    private static final boolean PLAY_TONE = false;
    // If true then workaround the NullPointerException in java.awt.GraphicsConfiguration.getBounds.
    private static final boolean JAVA_12_NPE_WORKAROUND = true;

    public static void main(String[] args) throws InterruptedException, LineUnavailableException {
        final JFrame gui = createAndShowGUI();
        if (PLAY_TONE) {
            checkBoundsLoop();
        } else {
            reproduceExceptionLoop(gui);
        }
    }

    private static JFrame createAndShowGUI() {
        final JFrame frame = new JFrame("Swing IllegalArgumentException");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(500, 500));

        final JTextArea instructions = new JTextArea("Steps to reproduce:\n"
                + "1) Run this application on a laptop\n"
                + "2) Plug in an external monitor\n"
                + "3) Shut the lid of the laptop\n"
                + "4) Unplug the external monitor\n"
                + "5) Reopen the lid of the laptop");
        instructions.setMaximumSize(instructions.getPreferredSize());
        instructions.setEditable(false);

        final JLabel errorLabel = new JLabel("Uncaught exceptions:");

        final JTextArea errors = new JTextArea();
        errors.setEditable(false);

        final JScrollPane errorsPane = new JScrollPane(errors);

        Thread.setDefaultUncaughtExceptionHandler((t, e) -> {
            final LocalDateTime now = LocalDateTime.now();
            SwingUtilities.invokeLater(() -> {
                errors.append(now.toString());
                errors.append("Thread: " + t.toString() + "\n");
                errors.append("Exception: ");
                e.printStackTrace(new PrintWriter(new Writer() {
                    @Override
                    public void write(char[] cbuf, int off, int len) {
                        errors.append(String.copyValueOf(cbuf, off, len));
                    }

                    @Override
                    public void flush() {
                    }

                    @Override
                    public void close() {
                    }
                }));
                errors.append("\n\n");
            });
            System.err.println(now.toString());
            e.printStackTrace();
        });

        final Container contentPane = frame.getContentPane();
        contentPane.add(instructions);
        contentPane.add(errorLabel);
        contentPane.add(errorsPane);

        final SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        layout.putConstraint(SpringLayout.WEST, instructions, 5, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.EAST, instructions, -5, SpringLayout.EAST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, instructions, 5, SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST, errorLabel, 5, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, errorLabel, 5, SpringLayout.SOUTH, instructions);
        layout.putConstraint(SpringLayout.WEST, errors, 0, SpringLayout.WEST, errorsPane);
        layout.putConstraint(SpringLayout.NORTH, errors, 0, SpringLayout.SOUTH, errorsPane);
        layout.putConstraint(SpringLayout.EAST, errors, -0, SpringLayout.EAST, errorsPane);
        layout.putConstraint(SpringLayout.SOUTH, errors, -0, SpringLayout.SOUTH, errorsPane);
        layout.putConstraint(SpringLayout.WEST, errorsPane, 5, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, errorsPane, 5, SpringLayout.SOUTH, errorLabel);
        layout.putConstraint(SpringLayout.EAST, contentPane, 5, SpringLayout.EAST, errors);
        layout.putConstraint(SpringLayout.SOUTH, contentPane, 5, SpringLayout.SOUTH, errors);

        frame.pack();
        frame.setVisible(true);

        return frame;
    }

    private static void checkBoundsLoop() throws InterruptedException, LineUnavailableException {
        final SourceDataLine sourceDataLine = createSourceDataLine();
        Dimension buffer = getDoubleBufferMaximumSize();
        log(buffer.toString());
        TonePlayer latch = null;
        try {
            while (true) {
                Dimension nextBuffer = getDoubleBufferMaximumSize();
                if (!buffer.equals(nextBuffer)) {
                    log(nextBuffer.toString());
                    if (latch == null && nextBuffer.height == 0 && nextBuffer.width == 0) {
                        latch = playTone(300, 0.01, sourceDataLine);
                    } else if (latch != null) {
                        latch.stop();
                        latch = null;
                    }
                }
                buffer = nextBuffer;
            }
        } finally {
            if (latch != null) {
                latch.stop();
            }
        }
    }

    private static void reproduceExceptionLoop(Component component) {
        Dimension buffer = getDoubleBufferMaximumSize();
        log(buffer.toString());
        while (true) {
            final RepaintManager repaintManager = RepaintManager.currentManager(component);
            repaintManager.getVolatileOffscreenBuffer(component, component.getWidth(), component.getHeight());
        }
    }

    private static void log(String message) {
        System.out.println("[" + LocalDateTime.now() + "] " + message);
    }

    private static Dimension getDoubleBufferMaximumSize() {
        Rectangle virtualBounds = new Rectangle();
        GraphicsEnvironment ge = GraphicsEnvironment.
                getLocalGraphicsEnvironment();
        for (GraphicsDevice gd : ge.getScreenDevices()) {
            GraphicsConfiguration gc = gd.getDefaultConfiguration();
            Rectangle bounds;
            try {
                bounds = gc.getBounds();
            } catch (NullPointerException e) {
                // This is a new bug in Java 12.
                if (JAVA_12_NPE_WORKAROUND) {
                    bounds = new Rectangle(0, 0);
                } else {
                    throw e;
                }
            }
            virtualBounds = virtualBounds.union(bounds);
        }
        return new Dimension(virtualBounds.width, virtualBounds.height);
    }

    private static class TonePlayer {

        private final CountDownLatch latch;
        private final Thread thread;

        TonePlayer(CountDownLatch latch, Thread thread) {
            this.latch = latch;
            this.thread = thread;
        }

        void stop() throws InterruptedException {
            latch.countDown();
            thread.join();
        }
    }

    private static SourceDataLine createSourceDataLine() throws LineUnavailableException {
        AudioFormat af = new AudioFormat(
                SAMPLE_RATE_PER_SECOND,
                SAMPLE_SIZE_IN_BITS,
                1,
                true,
                false);
        SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
        sdl.open(af, BUFFER_SIZE_IN_BYTES);
        return sdl;
    }

    private static TonePlayer playTone(int hz, double vol, SourceDataLine sdl) {
        // TODO: What is this called?
        final float c = hz / SAMPLE_RATE_PER_SECOND;
        // TODO: What is this called?
        final double v = c * 2.0 * Math.PI;
        final CountDownLatch latch = new CountDownLatch(1);
        final Thread thread = new Thread(() -> {
            try {
                sdl.start();
                byte[] buf = new byte[1];
                int tick = 0;
                do {
                    for (int i = 0; i < sdl.available(); i++) {
                        double angle = tick * v;
                        tick++;
                        buf[0] = (byte) (Math.sin(angle) * 127.0 * vol);
                        sdl.write(buf, 0, 1);
                    }
                } while (!latch.await(100, TimeUnit.MILLISECONDS));
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                sdl.stop();
                sdl.flush();
            }
        });
        thread.start();
        return new TonePlayer(latch, thread);
    }
}
