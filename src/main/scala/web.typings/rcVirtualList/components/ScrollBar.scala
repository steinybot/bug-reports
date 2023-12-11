package web.typings.rcVirtualList.components

import web.typings.StBuildingComponent
import web.typings.rcVirtualList.esScrollBarMod.ScrollBarProps
import web.typings.rcVirtualList.esScrollBarMod.ScrollBarRef
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScrollBar {
  
  @scala.inline
  def apply(
    containerSize: Double,
    onScroll: (Double, js.UndefOr[Boolean]) => Unit,
    onStartMove: () => Unit,
    onStopMove: () => Unit,
    prefixCls: String,
    rtl: Boolean,
    scrollOffset: Double,
    scrollRange: Double,
    spinSize: Double
  ): Builder = {
    val __props = js.Dynamic.literal(containerSize = containerSize.asInstanceOf[js.Any], onScroll = js.Any.fromFunction2(onScroll), onStartMove = js.Any.fromFunction0(onStartMove), onStopMove = js.Any.fromFunction0(onStopMove), prefixCls = prefixCls.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], scrollRange = scrollRange.asInstanceOf[js.Any], spinSize = spinSize.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ScrollBarProps with RefAttributes[ScrollBarRef]]))
  }
  
  @JSImport("rc-virtual-list/es/ScrollBar", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ScrollBarRef] {
    
    @scala.inline
    def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thumbStyle(value: CSSProperties): this.type = set("thumbStyle", value.asInstanceOf[js.Any])
  }
  
  type Props = ScrollBarProps with RefAttributes[ScrollBarRef]
  
  def withProps(p: ScrollBarProps with RefAttributes[ScrollBarRef]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
