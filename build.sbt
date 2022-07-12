scalaVersion := "2.13.8"

//libraryDependencies ++= Seq(
//  "com.typesafe.akka" %% "akka-actor" % "2.6.19",
//  "com.typesafe.akka" %% "akka-http" % "10.2.9"
//).map(_.cross(platformDepsCrossVersion.value))
//

import Dependencies._

libraryDependencies ++=
  Seq.empty[ModuleID].map(_.crossPlatform.value)
