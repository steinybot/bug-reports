package web.typings.rcTabs

import web.typings.rcTabs.esInterfaceMod.EditableConfig
import web.typings.rcTabs.esInterfaceMod.Tab
import web.typings.rcTabs.esInterfaceMod.TabsLocale
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTabNavListOperationNodeMod extends Shortcut {
  
  @JSImport("rc-tabs/es/TabNavList/OperationNode", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ReactComponentClass[OperationNodeProps with RefAttributes[HTMLDivElement]]] = js.native
  
  @js.native
  trait OperationNodeProps extends StObject {
    
    var activeKey: String = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var editable: js.UndefOr[EditableConfig] = js.native
    
    var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.native
    
    var id: String = js.native
    
    var locale: js.UndefOr[TabsLocale] = js.native
    
    var mobile: Boolean = js.native
    
    var moreIcon: js.UndefOr[ReactElement] = js.native
    
    var moreTransitionName: js.UndefOr[String] = js.native
    
    def onTabClick(key: String, e: SyntheticKeyboardEvent[Element]): Unit = js.native
    def onTabClick(key: String, e: SyntheticMouseEvent[Element]): Unit = js.native
    
    var popupClassName: js.UndefOr[String] = js.native
    
    var prefixCls: String = js.native
    
    var removeAriaLabel: js.UndefOr[String] = js.native
    
    var rtl: Boolean = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tabBarGutter: js.UndefOr[Double] = js.native
    
    var tabMoving: js.UndefOr[Boolean] = js.native
    
    var tabs: js.Array[Tab] = js.native
  }
  
  type _To = ReactComponentClass[ReactComponentClass[OperationNodeProps with RefAttributes[HTMLDivElement]]]
  
  /* This means you don't have to write `default`, but can instead just say `esTabNavListOperationNodeMod.foo` */
  override def _to: ReactComponentClass[ReactComponentClass[OperationNodeProps with RefAttributes[HTMLDivElement]]] = default
}
