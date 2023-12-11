package web.typings.antd

import web.typings.antd.anon.PartialCollapsePropsRefAt
import web.typings.antd.anon.WeakValidationMapCollapse
import web.typings.antd.esCollapseCollapsePanelMod.CollapsePanelProps
import web.typings.antd.esCollapseCollapsePanelMod.CollapsibleType
import web.typings.antd.esConfigProviderSizeContextMod.SizeType
import web.typings.rcCollapse.esInterfaceMod.ItemType
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esCollapseCollapseMod {
  
  /* Inlined react.react.ForwardRefExoticComponent<antd.antd/es/collapse/Collapse.CollapseProps & react.react.RefAttributes<std.HTMLDivElement>> & {  Panel :react.react.ForwardRefExoticComponent<antd.antd/es/collapse/CollapsePanel.CollapsePanelProps & react.react.RefAttributes<std.HTMLDivElement>>} */
  object default {
    
    /**
      * **NOTE**: Exotic components are not callable.
      */
    @scala.inline
    def apply(props: CollapseProps with RefAttributes[HTMLDivElement]): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("antd/es/collapse/Collapse", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/es/collapse/Collapse", "default.Panel")
    @js.native
    def Panel: ReactComponentClass[CollapsePanelProps with RefAttributes[HTMLDivElement]] = js.native
    @scala.inline
    def Panel_=(x: ReactComponentClass[CollapsePanelProps with RefAttributes[HTMLDivElement]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Panel")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/collapse/Collapse", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialCollapsePropsRefAt] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialCollapsePropsRefAt]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/collapse/Collapse", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/collapse/Collapse", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapCollapse] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapCollapse]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/collapse/Collapse", "default.$$typeof")
    @js.native
    val typeof: js.Symbol = js.native
  }
  
  /* Inlined parent std.Pick<rc-collapse.rc-collapse.CollapseProps, 'items'> */
  @js.native
  trait CollapseProps extends StObject {
    
    /** 手风琴效果 */
    var accordion: js.UndefOr[Boolean] = js.native
    
    var activeKey: js.UndefOr[(js.Array[String | Double]) | String | Double] = js.native
    
    var bordered: js.UndefOr[Boolean] = js.native
    
    /**
      * @deprecated use `items` instead
      */
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var collapsible: js.UndefOr[CollapsibleType] = js.native
    
    var defaultActiveKey: js.UndefOr[(js.Array[String | Double]) | String | Double] = js.native
    
    var destroyInactivePanel: js.UndefOr[Boolean] = js.native
    
    var expandIcon: js.UndefOr[js.Function1[/* panelProps */ PanelProps, ReactElement]] = js.native
    
    var expandIconPosition: js.UndefOr[ExpandIconPosition] = js.native
    
    var ghost: js.UndefOr[Boolean] = js.native
    
    var items: js.UndefOr[js.Array[ItemType]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* key */ String | js.Array[String], Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[SizeType] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object CollapseProps {
    
    @scala.inline
    def apply(): CollapseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapseProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CollapseProps] (val x: Self) extends AnyVal {
      
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
      def setOnChange(value: /* key */ String | js.Array[String] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
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
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.start
    - `web.typings`.antd.antdStrings.end
    - `web.typings`.antd.esCollapseCollapseMod.ExpandIconPositionLegacy
    - scala.Unit
  */
  type ExpandIconPosition = js.UndefOr[_ExpandIconPosition]
  
  /** @deprecated Please use `start` | `end` instead */
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.left
    - `web.typings`.antd.antdStrings.right
  */
  trait ExpandIconPositionLegacy
    extends StObject
       with _ExpandIconPosition
  object ExpandIconPositionLegacy {
    
    @scala.inline
    def left: web.typings.antd.antdStrings.left = "left".asInstanceOf[web.typings.antd.antdStrings.left]
    
    @scala.inline
    def right: web.typings.antd.antdStrings.right = "right".asInstanceOf[web.typings.antd.antdStrings.right]
  }
  
  @js.native
  trait PanelProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var collapsible: js.UndefOr[CollapsibleType] = js.native
    
    /** @deprecated Use `collapsible="disabled"` instead */
    var disabled: js.UndefOr[Boolean] = js.native
    
    var extra: js.UndefOr[ReactElement] = js.native
    
    var forceRender: js.UndefOr[Boolean] = js.native
    
    var header: js.UndefOr[ReactElement] = js.native
    
    var isActive: js.UndefOr[Boolean] = js.native
    
    var showArrow: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object PanelProps {
    
    @scala.inline
    def apply(): PanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCollapsible(value: CollapsibleType): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setExtra(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      @scala.inline
      def setHeader(value: ReactElement): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      @scala.inline
      def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait _ExpandIconPosition extends StObject
}
