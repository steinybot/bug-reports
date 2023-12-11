package web.typings.rcDrawer.components

import web.typings.StBuildingComponent
import web.typings.rcDrawer.esDrawerPanelMod.DrawerPanelProps
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.Ref
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DrawerPanel {
  
  @scala.inline
  def apply(prefixCls: String): Builder = {
    val __props = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DrawerPanelProps]))
  }
  
  @JSImport("rc-drawer/es/DrawerPanel", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerRef(value: Ref[HTMLDivElement]): this.type = set("containerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): this.type = set("containerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def containerRefNull: this.type = set("containerRef", null)
    
    @scala.inline
    def containerRefReactRef(value: ReactRef[HTMLDivElement]): this.type = set("containerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDown(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyUp(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseOver(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  type Props = DrawerPanelProps
  
  def withProps(p: DrawerPanelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
