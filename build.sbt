lazy val boom = taskKey[Unit]("Blow up.")

boom := { throw new RuntimeException("Kaboom!") }
