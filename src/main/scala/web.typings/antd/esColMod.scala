package web.typings.antd

import web.typings.antd.esGridColMod.ColProps
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esColMod extends Shortcut {
  
  @JSImport("antd/es/col", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ColProps with RefAttributes[HTMLDivElement]] = js.native
  
  type _To = ReactComponentClass[ColProps with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esColMod.foo` */
  override def _to: ReactComponentClass[ColProps with RefAttributes[HTMLDivElement]] = default
}
