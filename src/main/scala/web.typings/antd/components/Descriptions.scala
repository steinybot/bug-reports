package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.anon.PartialRecordBreakpointnu
import web.typings.antd.antdStrings.default
import web.typings.antd.antdStrings.horizontal
import web.typings.antd.antdStrings.middle
import web.typings.antd.antdStrings.small
import web.typings.antd.antdStrings.vertical
import web.typings.antd.esDescriptionsItemMod.DescriptionsItemProps
import web.typings.antd.esDescriptionsMod.DescriptionsItemType
import web.typings.antd.esDescriptionsMod.DescriptionsProps
import web.typings.react.mod.CSSProperties
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Descriptions {
  
  object Item {
    
    @JSImport("antd", "Descriptions.Item")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def contentStyle(value: CSSProperties): this.type = set("contentStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def label(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def labelStyle(value: CSSProperties): this.type = set("labelStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def span(value: Double): this.type = set("span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    }
    
    type Props = DescriptionsItemProps
    
    implicit def make(companion: Item.type): web.typings.antd.components.Descriptions.Item.Builder = new web.typings.antd.components.Descriptions.Item.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: DescriptionsItemProps): web.typings.antd.components.Descriptions.Item.Builder = new web.typings.antd.components.Descriptions.Item.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Descriptions")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colon(value: Boolean): this.type = set("colon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def column(value: Double | PartialRecordBreakpointnu): this.type = set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentStyle(value: CSSProperties): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extra(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def items(value: js.Array[DescriptionsItemType]): this.type = set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemsVarargs(value: DescriptionsItemType*): this.type = set("items", js.Array(value :_*))
    
    @scala.inline
    def labelStyle(value: CSSProperties): this.type = set("labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def layout(value: horizontal | vertical): this.type = set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: middle | small | default): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  type Props = DescriptionsProps
  
  implicit def make(companion: Descriptions.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DescriptionsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
