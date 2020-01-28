scalaVersion := "2.13.1"

addCompilerPlugin(
  ("com.github.ghik" % "silencer-plugin" % "1.4.4").cross(CrossVersion.full)
)

addCompilerPlugin(scalafixSemanticdb)
