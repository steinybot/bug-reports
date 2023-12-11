package web.typings.antd

import web.typings.antd.anon.Unit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esThemeUtilCalcCalculatorMod {
  
  /* note: abstract class */ @JSImport("antd/es/theme/util/calc/calculator", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with AbstractCalculator
  
  @js.native
  trait AbstractCalculator extends StObject {
    
    def add(num: AbstractCalculator): this.type = js.native
    def add(num: String): this.type = js.native
    /**
      * @descCN 计算两数的和，例如：1 + 2
      * @descEN Calculate the sum of two numbers, e.g. 1 + 2
      */
    def add(num: Double): this.type = js.native
    
    def div(num: AbstractCalculator): this.type = js.native
    def div(num: String): this.type = js.native
    /**
      * @descCN 计算两数的商，例如：1 / 2
      * @descEN Calculate the quotient of two numbers, e.g. 1 / 2
      */
    def div(num: Double): this.type = js.native
    
    /**
      * @descCN 获取计算结果
      * @descEN Get the calculation result
      */
    def equal(): String | Double = js.native
    def equal(options: Unit): String | Double = js.native
    
    def mul(num: AbstractCalculator): this.type = js.native
    def mul(num: String): this.type = js.native
    /**
      * @descCN 计算两数的积，例如：1 * 2
      * @descEN Calculate the product of two numbers, e.g. 1 * 2
      */
    def mul(num: Double): this.type = js.native
    
    def sub(num: AbstractCalculator): this.type = js.native
    def sub(num: String): this.type = js.native
    /**
      * @descCN 计算两数的差，例如：1 - 2
      * @descEN Calculate the difference between two numbers, e.g. 1 - 2
      */
    def sub(num: Double): this.type = js.native
  }
}
