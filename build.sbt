scalaVersion := "2.13.3"

enablePlugins(PrayPlugin)

cantTouchThis in LocalProject("mc") := "This doesn't work."
