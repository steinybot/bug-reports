package example

import scala.scalajs.js
import scala.scalajs.js.UndefOr

trait TitleHandle extends js.Object {
  def title(): UndefOr[String]
}

object TitleHandle {
  def fromAny(any: Any): UndefOr[TitleHandle] =
    any.asInstanceOf[TitleHandle]
}
