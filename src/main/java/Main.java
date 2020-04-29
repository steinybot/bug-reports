import java.awt.*;

public class Main {

    public static void main(String[] args) {
        while (true) {
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            for (GraphicsDevice gd : ge.getScreenDevices()) {
                GraphicsConfiguration gc = gd.getDefaultConfiguration();
                gc.getBounds();
            }
        }
    }
}
