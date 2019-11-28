
scalaVersion := "2.13.1"

enablePlugins(AkkaGrpcPlugin, JavaAgent)

javaAgents += "org.mortbay.jetty.alpn" % "jetty-alpn-agent" % "2.0.9" % "runtime;test"

libraryDependencies ++= Seq(
  "com.google.protobuf" % "protobuf-java" % "3.8.0",
  "com.lightbend.akka.grpc" %% "akka-grpc-runtime" % "0.7.2",
  "com.thesamet.scalapb" %% "lenses" % "0.9.1",
  "com.typesafe" % "config" % "1.3.4",
  "com.typesafe.akka" %% "akka-actor" % "2.5.25",
  "com.typesafe.akka" %% "akka-http-core" % "10.1.10",
  "com.typesafe.akka" %% "akka-stream" % "2.5.25",
  "io.grpc" % "grpc-api" % "1.24.0",
)
