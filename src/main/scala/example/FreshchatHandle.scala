package example

import example.FreshchatHandle.FreshchatConfig

import scala.scalajs.js
import scala.scalajs.js.UndefOr

trait FreshchatHandle extends js.Object {
  val freshchat: FreshchatConfig
}

object FreshchatHandle {

  trait FreshchatConfig extends js.Object {
    val tags: js.Array[String]
  }

  def apply(tags: js.Array[String]): FreshchatHandle = {
    val _tags = tags
    new FreshchatHandle {
      override val freshchat: FreshchatConfig = new FreshchatConfig {
        override val tags: js.Array[String] = _tags
      }
    }
  }

  def fromAny(any: Any): UndefOr[FreshchatHandle] =
    any.asInstanceOf[FreshchatHandle]
}
