package web.typings.rcMenu

import web.typings.rcMenu.anon.Element2key
import web.typings.rcMenu.esInterfaceMod.MenuMode
import web.typings.react.mod.KeyboardEventHandler
import web.typings.std.Set
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLUListElement
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseAccessibilityMod {
  
  @JSImport("rc-menu/es/hooks/useAccessibility", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getFocusableElements(container: HTMLElement, elements: Set[HTMLElement]): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableElements")(container.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
  
  @scala.inline
  def refreshElements(keys: js.Array[String], id: String): Element2key = (^.asInstanceOf[js.Dynamic].applyDynamic("refreshElements")(keys.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Element2key]
  
  @scala.inline
  def useAccessibility[T /* <: HTMLElement */](
    mode: MenuMode,
    activeKey: String,
    isRtl: Boolean,
    id: String,
    containerRef: ReactRef[HTMLUListElement],
    getKeys: js.Function0[js.Array[String]],
    getKeyPath: js.Function2[/* key */ String, /* includeOverflow */ js.UndefOr[Boolean], js.Array[String]],
    triggerActiveKey: js.Function1[/* key */ String, Unit],
    triggerAccessibilityOpen: js.Function2[/* key */ String, /* open */ js.UndefOr[Boolean], Unit]
  ): KeyboardEventHandler[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAccessibility")(mode.asInstanceOf[js.Any], activeKey.asInstanceOf[js.Any], isRtl.asInstanceOf[js.Any], id.asInstanceOf[js.Any], containerRef.asInstanceOf[js.Any], getKeys.asInstanceOf[js.Any], getKeyPath.asInstanceOf[js.Any], triggerActiveKey.asInstanceOf[js.Any], triggerAccessibilityOpen.asInstanceOf[js.Any])).asInstanceOf[KeyboardEventHandler[T]]
  @scala.inline
  def useAccessibility[T /* <: HTMLElement */](
    mode: MenuMode,
    activeKey: String,
    isRtl: Boolean,
    id: String,
    containerRef: ReactRef[HTMLUListElement],
    getKeys: js.Function0[js.Array[String]],
    getKeyPath: js.Function2[/* key */ String, /* includeOverflow */ js.UndefOr[Boolean], js.Array[String]],
    triggerActiveKey: js.Function1[/* key */ String, Unit],
    triggerAccessibilityOpen: js.Function2[/* key */ String, /* open */ js.UndefOr[Boolean], Unit],
    originOnKeyDown: KeyboardEventHandler[T]
  ): KeyboardEventHandler[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAccessibility")(mode.asInstanceOf[js.Any], activeKey.asInstanceOf[js.Any], isRtl.asInstanceOf[js.Any], id.asInstanceOf[js.Any], containerRef.asInstanceOf[js.Any], getKeys.asInstanceOf[js.Any], getKeyPath.asInstanceOf[js.Any], triggerActiveKey.asInstanceOf[js.Any], triggerAccessibilityOpen.asInstanceOf[js.Any], originOnKeyDown.asInstanceOf[js.Any])).asInstanceOf[KeyboardEventHandler[T]]
}
