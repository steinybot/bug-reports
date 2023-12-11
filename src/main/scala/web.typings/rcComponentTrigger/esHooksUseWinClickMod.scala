package web.typings.rcComponentTrigger

import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseWinClickMod {
  
  @JSImport("@rc-component/trigger/es/hooks/useWinClick", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    open: Boolean,
    clickToHide: Boolean,
    targetEle: HTMLElement,
    popupEle: HTMLElement,
    mask: Boolean,
    maskClosable: Boolean,
    inPopupOrChild: js.Function1[/* target */ EventTarget, Boolean],
    triggerOpen: js.Function1[/* open */ Boolean, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(open.asInstanceOf[js.Any], clickToHide.asInstanceOf[js.Any], targetEle.asInstanceOf[js.Any], popupEle.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], maskClosable.asInstanceOf[js.Any], inPopupOrChild.asInstanceOf[js.Any], triggerOpen.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
