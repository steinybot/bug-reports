package web.typings.rcPicker

import web.typings.rcPicker.esInterfaceMod.PanelMode
import web.typings.react.mod.JSX.Element
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsGetExtraFooterMod {
  
  @JSImport("rc-picker/es/utils/getExtraFooter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String, mode: PanelMode): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Element]
  @scala.inline
  def default(
    prefixCls: String,
    mode: PanelMode,
    renderExtraFooter: js.Function1[/* mode */ PanelMode, ReactElement]
  ): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], renderExtraFooter.asInstanceOf[js.Any])).asInstanceOf[Element]
}
