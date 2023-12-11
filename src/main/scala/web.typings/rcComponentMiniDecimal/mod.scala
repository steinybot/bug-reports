package web.typings.rcComponentMiniDecimal

import web.typings.rcComponentMiniDecimal.anon.DecimalStr
import web.typings.rcComponentMiniDecimal.esInterfaceMod.DecimalClass
import web.typings.rcComponentMiniDecimal.esInterfaceMod.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rc-component/mini-decimal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(value: ValueType): DecimalClass = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[DecimalClass]
  
  @JSImport("@rc-component/mini-decimal", "BigIntDecimal")
  @js.native
  class BigIntDecimal protected ()
    extends web.typings.rcComponentMiniDecimal.esMiniDecimalMod.BigIntDecimal {
    def this(value: String) = this()
    def this(value: Double) = this()
  }
  
  @JSImport("@rc-component/mini-decimal", "NumberDecimal")
  @js.native
  class NumberDecimal protected ()
    extends web.typings.rcComponentMiniDecimal.esMiniDecimalMod.NumberDecimal {
    def this(value: ValueType) = this()
  }
  
  @scala.inline
  def getNumberPrecision(number: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberPrecision")(number.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getNumberPrecision(number: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberPrecision")(number.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def num2str(number: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("num2str")(number.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def toFixed(numStr: String, separatorStr: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toFixed")(numStr.asInstanceOf[js.Any], separatorStr.asInstanceOf[js.Any])).asInstanceOf[Any]
  @scala.inline
  def toFixed(numStr: String, separatorStr: String, precision: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toFixed")(numStr.asInstanceOf[js.Any], separatorStr.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Any]
  @scala.inline
  def toFixed(numStr: String, separatorStr: String, precision: Double, cutOnly: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toFixed")(numStr.asInstanceOf[js.Any], separatorStr.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], cutOnly.asInstanceOf[js.Any])).asInstanceOf[Any]
  @scala.inline
  def toFixed(numStr: String, separatorStr: String, precision: Unit, cutOnly: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toFixed")(numStr.asInstanceOf[js.Any], separatorStr.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], cutOnly.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @scala.inline
  def trimNumber(numStr: String): DecimalStr = ^.asInstanceOf[js.Dynamic].applyDynamic("trimNumber")(numStr.asInstanceOf[js.Any]).asInstanceOf[DecimalStr]
  
  @scala.inline
  def validateNumber(num: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNumber")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def validateNumber(num: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNumber")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
