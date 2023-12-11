package web.typings.rcComponentMiniDecimal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait DecimalStr extends StObject {
    
    var decimalStr: String = js.native
    
    var fullStr: String = js.native
    
    var integerStr: String = js.native
    
    var negative: Boolean = js.native
    
    var negativeStr: String = js.native
    
    var trimStr: String = js.native
  }
  object DecimalStr {
    
    @scala.inline
    def apply(
      decimalStr: String,
      fullStr: String,
      integerStr: String,
      negative: Boolean,
      negativeStr: String,
      trimStr: String
    ): DecimalStr = {
      val __obj = js.Dynamic.literal(decimalStr = decimalStr.asInstanceOf[js.Any], fullStr = fullStr.asInstanceOf[js.Any], integerStr = integerStr.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], negativeStr = negativeStr.asInstanceOf[js.Any], trimStr = trimStr.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecimalStr]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DecimalStr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecimalStr(value: String): Self = StObject.set(x, "decimalStr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullStr(value: String): Self = StObject.set(x, "fullStr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegerStr(value: String): Self = StObject.set(x, "integerStr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegativeStr(value: String): Self = StObject.set(x, "negativeStr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimStr(value: String): Self = StObject.set(x, "trimStr", value.asInstanceOf[js.Any])
    }
  }
}
