scalaVersion := "2.13.10"

libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value

addCompilerPlugin("org.augustjune" %% "context-applied" % "0.1.4")
