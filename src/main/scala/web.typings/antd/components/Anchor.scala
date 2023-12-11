package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.anon.Href
import web.typings.antd.esAnchorAnchorLinkMod.AnchorLinkProps
import web.typings.antd.esAnchorAnchorMod.AnchorContainer
import web.typings.antd.esAnchorAnchorMod.AnchorDirection
import web.typings.antd.esAnchorAnchorMod.AnchorLinkItemProps
import web.typings.antd.esAnchorAnchorMod.AnchorProps
import web.typings.react.mod.CSSProperties
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Anchor {
  
  object Link {
    
    @scala.inline
    def apply(href: String, title: ReactElement): SharedBuilder_AnchorLinkProps1926377400 = {
      val __props = js.Dynamic.literal(href = href.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      new SharedBuilder_AnchorLinkProps1926377400(js.Array(this.component, __props.asInstanceOf[AnchorLinkProps]))
    }
    
    @JSImport("antd", "Anchor.Link")
    @js.native
    val component: js.Object = js.native
    
    type Props = AnchorLinkProps
    
    def withProps(p: AnchorLinkProps): SharedBuilder_AnchorLinkProps1926377400 = new SharedBuilder_AnchorLinkProps1926377400(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Anchor")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def affix(value: Boolean): this.type = set("affix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bounds(value: Double): this.type = set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: AnchorDirection): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getContainer(value: () => AnchorContainer): this.type = set("getContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def getCurrentAnchor(value: /* activeLink */ String => String): this.type = set("getCurrentAnchor", js.Any.fromFunction1(value))
    
    @scala.inline
    def items(value: js.Array[AnchorLinkItemProps]): this.type = set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemsVarargs(value: AnchorLinkItemProps*): this.type = set("items", js.Array(value :_*))
    
    @scala.inline
    def offsetTop(value: Double): this.type = set("offsetTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* currentActiveLink */ String => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClick(value: (/* e */ SyntheticMouseEvent[HTMLElement], /* link */ Href) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def replace(value: Boolean): this.type = set("replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showInkInFixed(value: Boolean): this.type = set("showInkInFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def targetOffset(value: Double): this.type = set("targetOffset", value.asInstanceOf[js.Any])
  }
  
  type Props = AnchorProps
  
  implicit def make(companion: Anchor.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AnchorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
