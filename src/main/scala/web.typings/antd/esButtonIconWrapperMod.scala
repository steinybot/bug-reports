package web.typings.antd

import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLSpanElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esButtonIconWrapperMod extends Shortcut {
  
  @JSImport("antd/es/button/IconWrapper", JSImport.Default)
  @js.native
  val default: ReactComponentClass[IconWrapperProps with RefAttributes[HTMLSpanElement]] = js.native
  
  @js.native
  trait IconWrapperProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var prefixCls: String = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object IconWrapperProps {
    
    @scala.inline
    def apply(prefixCls: String): IconWrapperProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconWrapperProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: IconWrapperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[IconWrapperProps with RefAttributes[HTMLSpanElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esButtonIconWrapperMod.foo` */
  override def _to: ReactComponentClass[IconWrapperProps with RefAttributes[HTMLSpanElement]] = default
}
