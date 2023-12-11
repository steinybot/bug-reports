package web.typings.antd.anon

import web.typings.antd.esCollapseCollapseMod.ExpandIconPosition
import web.typings.antd.esCollapseCollapseMod.PanelProps
import web.typings.antd.esCollapseCollapsePanelMod.CollapsibleType
import web.typings.antd.esConfigProviderSizeContextMod.SizeType
import web.typings.rcCollapse.esInterfaceMod.ItemType
import web.typings.react.mod.CSSProperties
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<antd.antd/es/collapse/Collapse.CollapseProps & react.react.RefAttributes<std.HTMLDivElement>> */
@js.native
trait PartialCollapsePropsRefAt extends StObject {
  
  var accordion: js.UndefOr[Boolean] = js.native
  
  var activeKey: js.UndefOr[(js.Array[String | Double]) | String | Double] = js.native
  
  var bordered: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var collapsible: js.UndefOr[CollapsibleType] = js.native
  
  var defaultActiveKey: js.UndefOr[(js.Array[String | Double]) | String | Double] = js.native
  
  var destroyInactivePanel: js.UndefOr[Boolean] = js.native
  
  var expandIcon: js.UndefOr[js.Function1[/* panelProps */ PanelProps, ReactElement]] = js.native
  
  var expandIconPosition: js.UndefOr[ExpandIconPosition] = js.native
  
  var ghost: js.UndefOr[Boolean] = js.native
  
  var items: js.UndefOr[js.Array[ItemType]] = js.native
  
  var key: js.UndefOr[web.typings.react.mod.Key | Null] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* key */ String | js.Array[String], scala.Unit]] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var ref: js.UndefOr[web.typings.react.mod.Ref[HTMLDivElement]] = js.native
  
  var rootClassName: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[SizeType] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object PartialCollapsePropsRefAt {
  
  @scala.inline
  def apply(): PartialCollapsePropsRefAt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCollapsePropsRefAt]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PartialCollapsePropsRefAt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccordion(value: Boolean): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccordionUndefined: Self = StObject.set(x, "accordion", js.undefined)
    
    @scala.inline
    def setActiveKey(value: (js.Array[String | Double]) | String | Double): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
    
    @scala.inline
    def setActiveKeyVarargs(value: (String | Double)*): Self = StObject.set(x, "activeKey", js.Array(value :_*))
    
    @scala.inline
    def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCollapsible(value: CollapsibleType): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    
    @scala.inline
    def setDefaultActiveKey(value: (js.Array[String | Double]) | String | Double): Self = StObject.set(x, "defaultActiveKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultActiveKeyUndefined: Self = StObject.set(x, "defaultActiveKey", js.undefined)
    
    @scala.inline
    def setDefaultActiveKeyVarargs(value: (String | Double)*): Self = StObject.set(x, "defaultActiveKey", js.Array(value :_*))
    
    @scala.inline
    def setDestroyInactivePanel(value: Boolean): Self = StObject.set(x, "destroyInactivePanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyInactivePanelUndefined: Self = StObject.set(x, "destroyInactivePanel", js.undefined)
    
    @scala.inline
    def setExpandIcon(value: /* panelProps */ PanelProps => ReactElement): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpandIconPosition(value: ExpandIconPosition): Self = StObject.set(x, "expandIconPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandIconPositionUndefined: Self = StObject.set(x, "expandIconPosition", js.undefined)
    
    @scala.inline
    def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
    
    @scala.inline
    def setGhost(value: Boolean): Self = StObject.set(x, "ghost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGhostUndefined: Self = StObject.set(x, "ghost", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[ItemType]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ItemType*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: web.typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNull: Self = StObject.set(x, "key", null)
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* key */ String | js.Array[String] => scala.Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    @scala.inline
    def setRef(value: web.typings.react.mod.Ref[HTMLDivElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ HTMLDivElement | Null => scala.Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefReactRef(value: ReactRef[HTMLDivElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
    
    @scala.inline
    def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
