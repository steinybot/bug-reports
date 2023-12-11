package web.typings.antd

import web.typings.antd.esRadioInterfaceMod.RadioGroupProps
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esRadioGroupMod extends Shortcut {
  
  @JSImport("antd/es/radio/group", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ReactComponentClass[RadioGroupProps with RefAttributes[HTMLDivElement]]] = js.native
  
  type _To = ReactComponentClass[ReactComponentClass[RadioGroupProps with RefAttributes[HTMLDivElement]]]
  
  /* This means you don't have to write `default`, but can instead just say `esRadioGroupMod.foo` */
  override def _to: ReactComponentClass[ReactComponentClass[RadioGroupProps with RefAttributes[HTMLDivElement]]] = default
}
