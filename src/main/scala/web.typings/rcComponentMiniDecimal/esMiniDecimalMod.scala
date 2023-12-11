package web.typings.rcComponentMiniDecimal

import web.typings.rcComponentMiniDecimal.esBigIntDecimalMod.default
import web.typings.rcComponentMiniDecimal.esInterfaceMod.DecimalClass
import web.typings.rcComponentMiniDecimal.esInterfaceMod.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMiniDecimalMod {
  
  @JSImport("@rc-component/mini-decimal/es/MiniDecimal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(value: ValueType): DecimalClass = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[DecimalClass]
  
  @JSImport("@rc-component/mini-decimal/es/MiniDecimal", "BigIntDecimal")
  @js.native
  class BigIntDecimal protected () extends default {
    def this(value: String) = this()
    def this(value: Double) = this()
  }
  
  @JSImport("@rc-component/mini-decimal/es/MiniDecimal", "NumberDecimal")
  @js.native
  class NumberDecimal protected ()
    extends web.typings.rcComponentMiniDecimal.esNumberDecimalMod.default {
    def this(value: ValueType) = this()
  }
  
  @scala.inline
  def toFixed(numStr: String, separatorStr: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toFixed")(numStr.asInstanceOf[js.Any], separatorStr.asInstanceOf[js.Any])).asInstanceOf[Any]
  @scala.inline
  def toFixed(numStr: String, separatorStr: String, precision: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toFixed")(numStr.asInstanceOf[js.Any], separatorStr.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Any]
  @scala.inline
  def toFixed(numStr: String, separatorStr: String, precision: Double, cutOnly: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toFixed")(numStr.asInstanceOf[js.Any], separatorStr.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], cutOnly.asInstanceOf[js.Any])).asInstanceOf[Any]
  @scala.inline
  def toFixed(numStr: String, separatorStr: String, precision: Unit, cutOnly: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toFixed")(numStr.asInstanceOf[js.Any], separatorStr.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], cutOnly.asInstanceOf[js.Any])).asInstanceOf[Any]
}
