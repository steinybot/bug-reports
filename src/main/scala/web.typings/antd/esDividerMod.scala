package web.typings.antd

import web.typings.antd.antdStrings.center
import web.typings.antd.antdStrings.horizontal
import web.typings.antd.antdStrings.left
import web.typings.antd.antdStrings.right
import web.typings.antd.antdStrings.vertical
import web.typings.react.mod.CSSProperties
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDividerMod extends Shortcut {
  
  @JSImport("antd/es/divider", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DividerProps] = js.native
  
  @js.native
  trait DividerProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var dashed: js.UndefOr[Boolean] = js.native
    
    var orientation: js.UndefOr[left | right | center] = js.native
    
    var orientationMargin: js.UndefOr[String | Double] = js.native
    
    var plain: js.UndefOr[Boolean] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var `type`: js.UndefOr[horizontal | vertical] = js.native
  }
  object DividerProps {
    
    @scala.inline
    def apply(): DividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DividerProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DividerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDashed(value: Boolean): Self = StObject.set(x, "dashed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashedUndefined: Self = StObject.set(x, "dashed", js.undefined)
      
      @scala.inline
      def setOrientation(value: left | right | center): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationMargin(value: String | Double): Self = StObject.set(x, "orientationMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationMarginUndefined: Self = StObject.set(x, "orientationMargin", js.undefined)
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setType(value: horizontal | vertical): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DividerProps]
  
  /* This means you don't have to write `default`, but can instead just say `esDividerMod.foo` */
  override def _to: ReactComponentClass[DividerProps] = default
}
