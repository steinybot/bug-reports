object Main extends App {

  while (!Thread.currentThread().isInterrupted) {
    println("Kill me!")
    Thread.sleep(1000)
  }
}
