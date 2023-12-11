package web.typings.antd

import web.typings.antd.esFlexInterfaceMod.FlexProps
import web.typings.antd.esUtilTypeMod.AnyObject
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esFlexMod extends Shortcut {
  
  @JSImport("antd/es/flex", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FlexProps[AnyObject] with RefAttributes[HTMLElement]] = js.native
  
  type _To = ReactComponentClass[FlexProps[AnyObject] with RefAttributes[HTMLElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esFlexMod.foo` */
  override def _to: ReactComponentClass[FlexProps[AnyObject] with RefAttributes[HTMLElement]] = default
}
