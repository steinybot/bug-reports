package web.typings.rcComponentMiniDecimal

import web.typings.rcComponentMiniDecimal.esInterfaceMod.DecimalClass
import web.typings.rcComponentMiniDecimal.esInterfaceMod.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esNumberDecimalMod {
  
  @JSImport("@rc-component/mini-decimal/es/NumberDecimal", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with NumberDecimal {
    def this(value: ValueType) = this()
  }
  
  @js.native
  trait NumberDecimal
    extends StObject
       with DecimalClass {
    
    var empty: Boolean = js.native
    
    var number: Double = js.native
    
    var origin: String = js.native
  }
}
