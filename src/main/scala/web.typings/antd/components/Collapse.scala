package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esCollapseCollapseMod.CollapseProps
import web.typings.antd.esCollapseCollapseMod.ExpandIconPosition
import web.typings.antd.esCollapseCollapseMod.PanelProps
import web.typings.antd.esCollapseCollapsePanelMod.CollapsePanelProps
import web.typings.antd.esCollapseCollapsePanelMod.CollapsibleType
import web.typings.antd.esConfigProviderSizeContextMod.SizeType
import web.typings.rcCollapse.esInterfaceMod.ItemType
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collapse {
  
  object Panel {
    
    @scala.inline
    def apply(header: ReactElement): SharedBuilder_CollapsePanelPropsRefAttributes696689915[HTMLDivElement] = {
      val __props = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
      new SharedBuilder_CollapsePanelPropsRefAttributes696689915[HTMLDivElement](js.Array(this.component, __props.asInstanceOf[CollapsePanelProps with RefAttributes[HTMLDivElement]]))
    }
    
    @JSImport("antd", "Collapse.Panel")
    @js.native
    val component: js.Object = js.native
    
    type Props = CollapsePanelProps with RefAttributes[HTMLDivElement]
    
    def withProps(p: CollapsePanelProps with RefAttributes[HTMLDivElement]): SharedBuilder_CollapsePanelPropsRefAttributes696689915[HTMLDivElement] = new SharedBuilder_CollapsePanelPropsRefAttributes696689915[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Collapse")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLDivElement] {
    
    @scala.inline
    def accordion(value: Boolean): this.type = set("accordion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def activeKey(value: (js.Array[String | Double]) | String | Double): this.type = set("activeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def activeKeyVarargs(value: (String | Double)*): this.type = set("activeKey", js.Array(value :_*))
    
    @scala.inline
    def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def collapsible(value: CollapsibleType): this.type = set("collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultActiveKey(value: (js.Array[String | Double]) | String | Double): this.type = set("defaultActiveKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultActiveKeyVarargs(value: (String | Double)*): this.type = set("defaultActiveKey", js.Array(value :_*))
    
    @scala.inline
    def destroyInactivePanel(value: Boolean): this.type = set("destroyInactivePanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandIcon(value: /* panelProps */ PanelProps => ReactElement): this.type = set("expandIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def expandIconPosition(value: ExpandIconPosition): this.type = set("expandIconPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def ghost(value: Boolean): this.type = set("ghost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def items(value: js.Array[ItemType]): this.type = set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemsVarargs(value: ItemType*): this.type = set("items", js.Array(value :_*))
    
    @scala.inline
    def onChange(value: /* key */ String | js.Array[String] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  type Props = CollapseProps with RefAttributes[HTMLDivElement]
  
  implicit def make(companion: Collapse.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CollapseProps with RefAttributes[HTMLDivElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
