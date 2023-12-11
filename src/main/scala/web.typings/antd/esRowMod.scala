package web.typings.antd

import web.typings.antd.esGridRowMod.RowProps
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esRowMod extends Shortcut {
  
  @JSImport("antd/es/row", JSImport.Default)
  @js.native
  val default: ReactComponentClass[RowProps with RefAttributes[HTMLDivElement]] = js.native
  
  type _To = ReactComponentClass[RowProps with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esRowMod.foo` */
  override def _to: ReactComponentClass[RowProps with RefAttributes[HTMLDivElement]] = default
}
