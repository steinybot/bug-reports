package web.typings.rcImage

import web.typings.rcImage.anon.Close
import web.typings.rcImage.anon.OmitToolbarRenderInfoType
import web.typings.rcImage.libHooksUseImageTransformMod.TransformType
import web.typings.rcImage.libPreviewMod.ToolbarRenderInfoType
import web.typings.rcImage.rcImageBooleans.`false`
import web.typings.rcUtil.esPortalWrapperMod.GetContainer
import web.typings.react.mod.MouseEventHandler
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOperationsMod extends Shortcut {
  
  @JSImport("rc-image/lib/Operations", JSImport.Default)
  @js.native
  val default: ReactComponentClass[OperationsProps] = js.native
  
  /* Inlined parent std.Pick<rc-image.rc-image/lib/Preview.PreviewProps, 'visible' | 'maskTransitionName' | 'getContainer' | 'prefixCls' | 'rootClassName' | 'icons' | 'countRender' | 'closeIcon' | 'onClose'> */
  @js.native
  trait OperationsProps extends StObject {
    
    var closeIcon: js.UndefOr[ReactElement] = js.native
    
    var count: Double = js.native
    
    var countRender: js.UndefOr[js.Function2[/* current */ Double, /* total */ Double, ReactElement]] = js.native
    
    var current: Double = js.native
    
    var getContainer: js.UndefOr[GetContainer | `false`] = js.native
    
    var icons: js.UndefOr[Close] = js.native
    
    var maskTransitionName: js.UndefOr[String] = js.native
    
    var maxScale: Double = js.native
    
    var minScale: Double = js.native
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    def onFlipX(): Unit = js.native
    
    def onFlipY(): Unit = js.native
    
    def onRotateLeft(): Unit = js.native
    
    def onRotateRight(): Unit = js.native
    
    var onSwitchLeft: MouseEventHandler[HTMLDivElement] = js.native
    
    var onSwitchRight: MouseEventHandler[HTMLDivElement] = js.native
    
    def onZoomIn(): Unit = js.native
    
    def onZoomOut(): Unit = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var scale: Double = js.native
    
    var showProgress: Boolean = js.native
    
    var showSwitch: Boolean = js.native
    
    def toolbarRender(originalNode: ReactElement, info: OmitToolbarRenderInfoType): ReactElement = js.native
    def toolbarRender(originalNode: ReactElement, info: ToolbarRenderInfoType): ReactElement = js.native
    
    var transform: TransformType = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  
  type _To = ReactComponentClass[OperationsProps]
  
  /* This means you don't have to write `default`, but can instead just say `libOperationsMod.foo` */
  override def _to: ReactComponentClass[OperationsProps] = default
}
