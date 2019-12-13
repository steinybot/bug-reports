scalaVersion := "2.13.1"
addCompilerPlugin("org.scalameta" % "semanticdb-scalac" % "4.3.0" cross CrossVersion.full)
scalacOptions ++= Seq("-Yrangepos", "-Ywarn-unused")
scalafixConfig := Some(file(".scalafixxx.conf"))
