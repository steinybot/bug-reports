package web.typings.antDesignIcons

import web.typings.antDesignIcons.anon.PickIconComponentPropssta
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.HTMLProps
import web.typings.react.mod.SVGProps
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLSpanElement
import org.scalajs.dom.SVGSVGElement
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsIconMod extends Shortcut {
  
  @JSImport("@ant-design/icons/es/components/Icon", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PickIconComponentPropssta] = js.native
  
  @js.native
  trait CustomIconComponentProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var fill: String = js.native
    
    var height: String | Double = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var viewBox: js.UndefOr[String] = js.native
    
    var width: String | Double = js.native
  }
  object CustomIconComponentProps {
    
    @scala.inline
    def apply(fill: String, height: String | Double, width: String | Double): CustomIconComponentProps = {
      val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomIconComponentProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CustomIconComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IconBaseProps
    extends StObject
       with HTMLProps[HTMLSpanElement] {
    
    var rotate: js.UndefOr[Double] = js.native
    
    var spin: js.UndefOr[Boolean] = js.native
  }
  object IconBaseProps {
    
    @scala.inline
    def apply(): IconBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconBaseProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: IconBaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setSpin(value: Boolean): Self = StObject.set(x, "spin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinUndefined: Self = StObject.set(x, "spin", js.undefined)
    }
  }
  
  @js.native
  trait IconComponentProps
    extends StObject
       with IconBaseProps {
    
    var ariaLabel: js.UndefOr[String] = js.native
    
    var component: js.UndefOr[ReactComponentClass[CustomIconComponentProps | SVGProps[SVGSVGElement]]] = js.native
    
    var viewBox: js.UndefOr[String] = js.native
  }
  object IconComponentProps {
    
    @scala.inline
    def apply(): IconComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconComponentProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: IconComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setComponent(value: ReactComponentClass[CustomIconComponentProps | SVGProps[SVGSVGElement]]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PickIconComponentPropssta]
  
  /* This means you don't have to write `default`, but can instead just say `esComponentsIconMod.foo` */
  override def _to: ReactComponentClass[PickIconComponentPropssta] = default
}
