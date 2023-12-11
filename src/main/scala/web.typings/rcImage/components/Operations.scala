package web.typings.rcImage.components

import web.typings.StBuildingComponent
import web.typings.rcImage.anon.Close
import web.typings.rcImage.anon.OmitToolbarRenderInfoType
import web.typings.rcImage.libHooksUseImageTransformMod.TransformType
import web.typings.rcImage.libOperationsMod.OperationsProps
import web.typings.rcImage.libPreviewMod.ToolbarRenderInfoType
import web.typings.rcImage.rcImageBooleans.`false`
import web.typings.rcUtil.esPortalWrapperMod.GetContainer
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Operations {
  
  @scala.inline
  def apply(
    count: Double,
    current: Double,
    maxScale: Double,
    minScale: Double,
    onFlipX: () => Unit,
    onFlipY: () => Unit,
    onRotateLeft: () => Unit,
    onRotateRight: () => Unit,
    onSwitchLeft: SyntheticMouseEvent[HTMLDivElement] => Unit,
    onSwitchRight: SyntheticMouseEvent[HTMLDivElement] => Unit,
    onZoomIn: () => Unit,
    onZoomOut: () => Unit,
    scale: Double,
    showProgress: Boolean,
    showSwitch: Boolean,
    toolbarRender: (ReactElement, OmitToolbarRenderInfoType | ToolbarRenderInfoType) => ReactElement,
    transform: TransformType
  ): Builder = {
    val __props = js.Dynamic.literal(count = count.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], maxScale = maxScale.asInstanceOf[js.Any], minScale = minScale.asInstanceOf[js.Any], onFlipX = js.Any.fromFunction0(onFlipX), onFlipY = js.Any.fromFunction0(onFlipY), onRotateLeft = js.Any.fromFunction0(onRotateLeft), onRotateRight = js.Any.fromFunction0(onRotateRight), onSwitchLeft = js.Any.fromFunction1(onSwitchLeft), onSwitchRight = js.Any.fromFunction1(onSwitchRight), onZoomIn = js.Any.fromFunction0(onZoomIn), onZoomOut = js.Any.fromFunction0(onZoomOut), scale = scale.asInstanceOf[js.Any], showProgress = showProgress.asInstanceOf[js.Any], showSwitch = showSwitch.asInstanceOf[js.Any], toolbarRender = js.Any.fromFunction2(toolbarRender), transform = transform.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OperationsProps]))
  }
  
  @JSImport("rc-image/lib/Operations", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def closeIcon(value: ReactElement): this.type = set("closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def countRender(value: (/* current */ Double, /* total */ Double) => ReactElement): this.type = set("countRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def getContainer(value: GetContainer | `false`): this.type = set("getContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getContainerFunction0(value: () => HTMLElement): this.type = set("getContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def icons(value: Close): this.type = set("icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maskTransitionName(value: String): this.type = set("maskTransitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClose(value: () => Unit): this.type = set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  type Props = OperationsProps
  
  def withProps(p: OperationsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
