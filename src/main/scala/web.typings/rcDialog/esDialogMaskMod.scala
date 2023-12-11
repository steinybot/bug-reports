package web.typings.rcDialog

import web.typings.react.mod.CSSProperties
import web.typings.react.mod.HTMLAttributes
import web.typings.react.mod.JSX.Element
import org.scalajs.dom.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDialogMaskMod {
  
  @JSImport("rc-dialog/es/Dialog/Mask", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: MaskProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait MaskProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var maskProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
    
    var motionName: js.UndefOr[String] = js.native
    
    var prefixCls: String = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var visible: Boolean = js.native
  }
  object MaskProps {
    
    @scala.inline
    def apply(prefixCls: String, visible: Boolean): MaskProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaskProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MaskProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setMaskProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "maskProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskPropsUndefined: Self = StObject.set(x, "maskProps", js.undefined)
      
      @scala.inline
      def setMotionName(value: String): Self = StObject.set(x, "motionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionNameUndefined: Self = StObject.set(x, "motionName", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
