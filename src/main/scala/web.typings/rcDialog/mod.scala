package web.typings.rcDialog

import web.typings.rcDialog.esDialogContentPanelMod.ContentRef
import web.typings.rcDialog.esDialogContentPanelMod.PanelProps
import web.typings.rcDialog.esIdialogproptypesMod.IDialogPropTypes
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-dialog", JSImport.Default)
  @js.native
  val default: ReactComponentClass[IDialogPropTypes] = js.native
  
  @JSImport("rc-dialog", "Panel")
  @js.native
  val Panel: ReactComponentClass[PanelProps with RefAttributes[ContentRef]] = js.native
  
  type _To = ReactComponentClass[IDialogPropTypes]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ReactComponentClass[IDialogPropTypes] = default
}
