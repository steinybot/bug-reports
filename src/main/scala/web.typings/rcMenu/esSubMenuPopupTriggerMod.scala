package web.typings.rcMenu

import web.typings.rcMenu.esInterfaceMod.MenuMode
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.JSX.Element
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSubMenuPopupTriggerMod {
  
  @JSImport("rc-menu/es/SubMenu/PopupTrigger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(param0: PopupTriggerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait PopupTriggerProps extends StObject {
    
    var children: ReactElement = js.native
    
    var disabled: Boolean = js.native
    
    var mode: MenuMode = js.native
    
    def onVisibleChange(visible: Boolean): Unit = js.native
    
    var popup: ReactElement = js.native
    
    var popupClassName: js.UndefOr[String] = js.native
    
    var popupOffset: js.UndefOr[js.Array[Double]] = js.native
    
    var popupStyle: js.UndefOr[CSSProperties] = js.native
    
    var prefixCls: String = js.native
    
    var visible: Boolean = js.native
  }
  object PopupTriggerProps {
    
    @scala.inline
    def apply(
      children: ReactElement,
      disabled: Boolean,
      mode: MenuMode,
      onVisibleChange: Boolean => Unit,
      popup: ReactElement,
      prefixCls: String,
      visible: Boolean
    ): PopupTriggerProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onVisibleChange = js.Any.fromFunction1(onVisibleChange), popup = popup.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopupTriggerProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PopupTriggerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: MenuMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnVisibleChange(value: Boolean => Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPopup(value: ReactElement): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
      
      @scala.inline
      def setPopupOffset(value: js.Array[Double]): Self = StObject.set(x, "popupOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupOffsetUndefined: Self = StObject.set(x, "popupOffset", js.undefined)
      
      @scala.inline
      def setPopupOffsetVarargs(value: Double*): Self = StObject.set(x, "popupOffset", js.Array(value :_*))
      
      @scala.inline
      def setPopupStyle(value: CSSProperties): Self = StObject.set(x, "popupStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupStyleUndefined: Self = StObject.set(x, "popupStyle", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
