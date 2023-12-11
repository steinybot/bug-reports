package web.typings.antd

import web.typings.antd.esProgressProgressMod.ProgressProps
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esProgressMod extends Shortcut {
  
  @JSImport("antd/es/progress", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ProgressProps with RefAttributes[HTMLDivElement]] = js.native
  
  type _To = ReactComponentClass[ProgressProps with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esProgressMod.foo` */
  override def _to: ReactComponentClass[ProgressProps with RefAttributes[HTMLDivElement]] = default
}
