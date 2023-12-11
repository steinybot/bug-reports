package web.typings.antd

import web.typings.react.mod.CSSProperties
import web.typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esEmptyMod extends Shortcut {
  
  @JSImport("antd/es/empty", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  @js.native
  trait CompoundedComponent
    extends StObject
       with FunctionComponent[EmptyProps] {
    
    var PRESENTED_IMAGE_DEFAULT: ReactElement = js.native
    
    var PRESENTED_IMAGE_SIMPLE: ReactElement = js.native
  }
  
  @js.native
  trait EmptyProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var description: js.UndefOr[ReactElement] = js.native
    
    var image: js.UndefOr[ReactElement] = js.native
    
    /** @since 3.16.0 */
    var imageStyle: js.UndefOr[CSSProperties] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object EmptyProps {
    
    @scala.inline
    def apply(): EmptyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmptyProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: EmptyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDescription(value: ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setImage(value: ReactElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageStyle(value: CSSProperties): Self = StObject.set(x, "imageStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageStyleUndefined: Self = StObject.set(x, "imageStyle", js.undefined)
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
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
    }
  }
  
  @js.native
  trait TransferLocale extends StObject {
    
    var description: String = js.native
  }
  object TransferLocale {
    
    @scala.inline
    def apply(description: String): TransferLocale = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferLocale]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TransferLocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `esEmptyMod.foo` */
  override def _to: CompoundedComponent = default
}
