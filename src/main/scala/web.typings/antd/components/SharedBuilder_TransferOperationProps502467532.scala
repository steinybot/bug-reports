package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esConfigProviderContextMod.DirectionType
import web.typings.react.mod.CSSProperties
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.button.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_TransferOperationProps502467532 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def direction(value: DirectionType): this.type = set("direction", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def leftActive(value: Boolean): this.type = set("leftActive", value.asInstanceOf[js.Any])
  
  @scala.inline
  def leftArrowText(value: String): this.type = set("leftArrowText", value.asInstanceOf[js.Any])
  
  @scala.inline
  def moveToLeft(value: SyntheticMouseEvent[HTMLButtonElement | HTMLAnchorElement] => Unit): this.type = set("moveToLeft", js.Any.fromFunction1(value))
  
  @scala.inline
  def moveToRight(value: SyntheticMouseEvent[HTMLButtonElement | HTMLAnchorElement] => Unit): this.type = set("moveToRight", js.Any.fromFunction1(value))
  
  @scala.inline
  def oneWay(value: Boolean): this.type = set("oneWay", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rightActive(value: Boolean): this.type = set("rightActive", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rightArrowText(value: String): this.type = set("rightArrowText", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
}
