package web.typings.antd

import web.typings.antd.antdStrings.icon_
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esCollapseCollapsePanelMod extends Shortcut {
  
  @JSImport("antd/es/collapse/CollapsePanel", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CollapsePanelProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait CollapsePanelProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var collapsible: js.UndefOr[CollapsibleType] = js.native
    
    /** @deprecated Use `collapsible="disabled"` instead */
    var disabled: js.UndefOr[Boolean] = js.native
    
    var extra: js.UndefOr[ReactElement] = js.native
    
    var forceRender: js.UndefOr[Boolean] = js.native
    
    var header: ReactElement = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var key: String | Double = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var showArrow: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object CollapsePanelProps {
    
    @scala.inline
    def apply(header: ReactElement, key: String | Double): CollapsePanelProps = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollapsePanelProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CollapsePanelProps] (val x: Self) extends AnyVal {
      
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
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
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
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.header
    - `web.typings`.antd.antdStrings.icon_
    - `web.typings`.antd.antdStrings.disabled
  */
  trait CollapsibleType extends StObject
  object CollapsibleType {
    
    @scala.inline
    def disabled: web.typings.antd.antdStrings.disabled = "disabled".asInstanceOf[web.typings.antd.antdStrings.disabled]
    
    @scala.inline
    def header: web.typings.antd.antdStrings.header = "header".asInstanceOf[web.typings.antd.antdStrings.header]
    
    @scala.inline
    def icon: icon_ = "icon".asInstanceOf[icon_]
  }
  
  type _To = ReactComponentClass[CollapsePanelProps with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esCollapseCollapsePanelMod.foo` */
  override def _to: ReactComponentClass[CollapsePanelProps with RefAttributes[HTMLDivElement]] = default
}
