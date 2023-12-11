package web.typings.rcComponentTour

import web.typings.rcComponentTour.anon.Placeholder
import web.typings.rcComponentTour.esHooksUseTargetMod.PosInfo
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMaskMod {
  
  @JSImport("@rc-component/tour/es/Mask", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: MaskProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait MaskProps extends StObject {
    
    var animated: js.UndefOr[Boolean | Placeholder] = js.native
    
    var fill: js.UndefOr[String] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var pos: PosInfo = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var showMask: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object MaskProps {
    
    @scala.inline
    def apply(pos: PosInfo): MaskProps = {
      val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaskProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MaskProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimated(value: Boolean | Placeholder): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPos(value: PosInfo): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setShowMask(value: Boolean): Self = StObject.set(x, "showMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMaskUndefined: Self = StObject.set(x, "showMask", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
