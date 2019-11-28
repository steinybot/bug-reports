
scalaVersion := "2.13.1"

enablePlugins(AkkaGrpcPlugin, JavaAgent)

javaAgents += "org.mortbay.jetty.alpn" % "jetty-alpn-agent" % "2.0.9" % "runtime;test"
