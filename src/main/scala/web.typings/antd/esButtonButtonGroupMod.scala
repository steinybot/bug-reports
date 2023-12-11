package web.typings.antd

import web.typings.antd.esConfigProviderSizeContextMod.SizeType
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.Context
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esButtonButtonGroupMod extends Shortcut {
  
  @JSImport("antd/es/button/button-group", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ButtonGroupProps] = js.native
  
  @JSImport("antd/es/button/button-group", "GroupSizeContext")
  @js.native
  val GroupSizeContext: Context[SizeType] = js.native
  
  @js.native
  trait ButtonGroupProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[SizeType] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object ButtonGroupProps {
    
    @scala.inline
    def apply(): ButtonGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonGroupProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ButtonGroupProps] (val x: Self) extends AnyVal {
      
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
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ButtonGroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `esButtonButtonGroupMod.foo` */
  override def _to: ReactComponentClass[ButtonGroupProps] = default
}
