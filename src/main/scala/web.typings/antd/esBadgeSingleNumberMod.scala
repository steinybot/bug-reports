package web.typings.antd

import web.typings.react.mod.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esBadgeSingleNumberMod {
  
  @JSImport("antd/es/badge/SingleNumber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: SingleNumberProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait SingleNumberProps extends StObject {
    
    var count: Double = js.native
    
    var prefixCls: String = js.native
    
    var value: String = js.native
  }
  object SingleNumberProps {
    
    @scala.inline
    def apply(count: Double, prefixCls: String, value: String): SingleNumberProps = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleNumberProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SingleNumberProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UnitNumberProps extends StObject {
    
    var current: js.UndefOr[Boolean] = js.native
    
    var offset: js.UndefOr[Double] = js.native
    
    var prefixCls: String = js.native
    
    var value: String | Double = js.native
  }
  object UnitNumberProps {
    
    @scala.inline
    def apply(prefixCls: String, value: String | Double): UnitNumberProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnitNumberProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: UnitNumberProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
