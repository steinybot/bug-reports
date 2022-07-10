import scala.util.chaining._

scalaVersion := "2.13.8"

makeSite ~= (_.tap(_.mkdirs()))
