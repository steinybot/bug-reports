scalaVersion := "2.13.1"

val hedgehogVersion = "452df95337eb6d29485f34cd30e23e584b3987f0"

libraryDependencies ++= Seq(
  "qa.hedgehog" %% "hedgehog-core" % hedgehogVersion,
  "qa.hedgehog" %% "hedgehog-runner" % hedgehogVersion,
  "qa.hedgehog" %% "hedgehog-sbt" % hedgehogVersion
)

resolvers += "bintray-scala-hedgehog" at "https://dl.bintray.com/hedgehogqa/scala-hedgehog"
