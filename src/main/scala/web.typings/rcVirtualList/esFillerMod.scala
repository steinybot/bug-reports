package web.typings.rcVirtualList

import web.typings.react.mod.AriaRole
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esFillerMod extends Shortcut {
  
  /**
    * Fill component to provided the scroll content real height.
    */
  @JSImport("rc-virtual-list/es/Filler", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FillerProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait FillerProps extends StObject {
    
    var children: ReactElement = js.native
    
    var extra: js.UndefOr[ReactElement] = js.native
    
    /** Virtual filler height. Should be `count * itemMinHeight` */
    var height: Double = js.native
    
    var innerProps: js.UndefOr[InnerProps] = js.native
    
    var offsetX: js.UndefOr[Double] = js.native
    
    /** Set offset of visible items. Should be the top of start item position */
    var offsetY: js.UndefOr[Double] = js.native
    
    var onInnerResize: js.UndefOr[js.Function0[Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rtl: Boolean = js.native
    
    var scrollWidth: js.UndefOr[Double] = js.native
  }
  object FillerProps {
    
    @scala.inline
    def apply(children: ReactElement, height: Double, rtl: Boolean): FillerProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any])
      __obj.asInstanceOf[FillerProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FillerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtra(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerProps(value: InnerProps): Self = StObject.set(x, "innerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerPropsUndefined: Self = StObject.set(x, "innerProps", js.undefined)
      
      @scala.inline
      def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      @scala.inline
      def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      @scala.inline
      def setOnInnerResize(value: () => Unit): Self = StObject.set(x, "onInnerResize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnInnerResizeUndefined: Self = StObject.set(x, "onInnerResize", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollWidth(value: Double): Self = StObject.set(x, "scrollWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollWidthUndefined: Self = StObject.set(x, "scrollWidth", js.undefined)
    }
  }
  
  /* Inlined std.Pick<react.react.HTMLAttributes<std.HTMLDivElement>, 'role' | 'id'> */
  @js.native
  trait InnerProps extends StObject {
    
    var id: js.UndefOr[String] = js.native
    
    var role: js.UndefOr[AriaRole] = js.native
  }
  object InnerProps {
    
    @scala.inline
    def apply(): InnerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InnerProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: InnerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FillerProps with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esFillerMod.foo` */
  override def _to: ReactComponentClass[FillerProps with RefAttributes[HTMLDivElement]] = default
}
