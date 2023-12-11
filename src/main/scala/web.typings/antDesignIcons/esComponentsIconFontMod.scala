package web.typings.antDesignIcons

import web.typings.antDesignIcons.esComponentsIconMod.IconBaseProps
import web.typings.std.Record
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsIconFontMod {
  
  @JSImport("@ant-design/icons/es/components/IconFont", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T /* <: String */](): ReactComponentClass[IconFontProps[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[ReactComponentClass[IconFontProps[T]]]
  @scala.inline
  def default[T /* <: String */](options: CustomIconOptions): ReactComponentClass[IconFontProps[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[ReactComponentClass[IconFontProps[T]]]
  
  @js.native
  trait CustomIconOptions extends StObject {
    
    var extraCommonProps: js.UndefOr[Record[String, Any]] = js.native
    
    var scriptUrl: js.UndefOr[String | js.Array[String]] = js.native
  }
  object CustomIconOptions {
    
    @scala.inline
    def apply(): CustomIconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomIconOptions]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CustomIconOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtraCommonProps(value: Record[String, Any]): Self = StObject.set(x, "extraCommonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraCommonPropsUndefined: Self = StObject.set(x, "extraCommonProps", js.undefined)
      
      @scala.inline
      def setScriptUrl(value: String | js.Array[String]): Self = StObject.set(x, "scriptUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptUrlUndefined: Self = StObject.set(x, "scriptUrl", js.undefined)
      
      @scala.inline
      def setScriptUrlVarargs(value: String*): Self = StObject.set(x, "scriptUrl", js.Array(value :_*))
    }
  }
  
  @js.native
  trait IconFontProps[T /* <: String */]
    extends StObject
       with IconBaseProps {
    
    @JSName("type")
    var type_IconFontProps: T = js.native
  }
  object IconFontProps {
    
    @scala.inline
    def apply[T /* <: String */](`type`: T): IconFontProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconFontProps[T]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: IconFontProps[_], T /* <: String */] (val x: Self with IconFontProps[T]) extends AnyVal {
      
      @scala.inline
      def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
