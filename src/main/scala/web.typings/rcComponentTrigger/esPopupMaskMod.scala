package web.typings.rcComponentTrigger

import web.typings.rcMotion.esCssmotionMod.CSSMotionProps
import web.typings.react.mod.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPopupMaskMod {
  
  @JSImport("@rc-component/trigger/es/Popup/Mask", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: MaskProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait MaskProps extends StObject {
    
    var mask: js.UndefOr[Boolean] = js.native
    
    var motion: js.UndefOr[CSSMotionProps] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var prefixCls: String = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object MaskProps {
    
    @scala.inline
    def apply(prefixCls: String): MaskProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaskProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MaskProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setMotion(value: CSSMotionProps): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
