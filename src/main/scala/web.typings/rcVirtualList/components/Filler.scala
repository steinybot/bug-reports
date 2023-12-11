package web.typings.rcVirtualList.components

import web.typings.StBuildingComponent
import web.typings.rcVirtualList.esFillerMod.FillerProps
import web.typings.rcVirtualList.esFillerMod.InnerProps
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Filler {
  
  @scala.inline
  def apply(height: Double, rtl: Boolean): Builder = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FillerProps with RefAttributes[HTMLDivElement]]))
  }
  
  @JSImport("rc-virtual-list/es/Filler", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLDivElement] {
    
    @scala.inline
    def extra(value: ReactElement): this.type = set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerProps(value: InnerProps): this.type = set("innerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetX(value: Double): this.type = set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetY(value: Double): this.type = set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onInnerResize(value: () => Unit): this.type = set("onInnerResize", js.Any.fromFunction0(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollWidth(value: Double): this.type = set("scrollWidth", value.asInstanceOf[js.Any])
  }
  
  type Props = FillerProps with RefAttributes[HTMLDivElement]
  
  def withProps(p: FillerProps with RefAttributes[HTMLDivElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
