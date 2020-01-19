scalaVersion := "2.13.1"

lazy val scalafmtCheckFails = taskKey[Unit]("alsdjglkdfhgl")

scalafmtCheckFails := (Compile / scalafmtCheck).failure.value

addCommandAlias(
  "foo",
  "clean;scalafmtCheckFails;scalafmt;scalafmtCheck;clean;scalafmtCheck"
)
