package web.typings.rcComponentMiniDecimal

import web.typings.rcComponentMiniDecimal.anon.DecimalStr
import web.typings.rcComponentMiniDecimal.esInterfaceMod.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esNumberUtilMod {
  
  @JSImport("@rc-component/mini-decimal/es/numberUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getNumberPrecision(number: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberPrecision")(number.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getNumberPrecision(number: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberPrecision")(number.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def isE(number: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isE")(number.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isE(number: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isE")(number.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isEmpty(value: ValueType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def num2str(number: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("num2str")(number.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def trimNumber(numStr: String): DecimalStr = ^.asInstanceOf[js.Dynamic].applyDynamic("trimNumber")(numStr.asInstanceOf[js.Any]).asInstanceOf[DecimalStr]
  
  @scala.inline
  def validateNumber(num: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNumber")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def validateNumber(num: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNumber")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
