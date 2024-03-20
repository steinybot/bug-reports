package example

import example.AnySyntax._

import scala.scalajs.js
import scala.scalajs.js.UndefOr

trait TitleHandle extends js.Object {
  def title(): UndefOr[String]
}

object TitleHandle {
  def fromAny(any: Any): UndefOr[TitleHandle] =
    if (any.?.title.toFunction.isDefined) any.asInstanceOf[TitleHandle] else js.undefined
}
