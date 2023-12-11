package web.typings.rcPicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsMiscUtilMod {
  
  @JSImport("rc-picker/es/utils/miscUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def executeValue[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("executeValue")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def executeValue[T](value: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("executeValue")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def getValue[T](values: js.Array[T | Null], index: Double): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getValue")(values.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  @scala.inline
  def getValue[T](values: Null, index: Double): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getValue")(values.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  @scala.inline
  def getValue[T](values: Unit, index: Double): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getValue")(values.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  
  @scala.inline
  def leftPad(str: String, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(str.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def leftPad(str: String, length: Double, fill: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(str.asInstanceOf[js.Any], length.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def leftPad(str: Double, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(str.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def leftPad(str: Double, length: Double, fill: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("leftPad")(str.asInstanceOf[js.Any], length.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def toArray[T](`val`: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  @scala.inline
  def toArray[T](`val`: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def tuple[T /* <: js.Array[String] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): T = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(args.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def updateValues[T, R](values: js.Tuple2[T | Null, T | Null], value: T, index: Double): R = (^.asInstanceOf[js.Dynamic].applyDynamic("updateValues")(values.asInstanceOf[js.Any], value.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[R]
  @scala.inline
  def updateValues[T, R](values: js.Tuple2[T | Null, T | Null], value: UpdateValue[T], index: Double): R = (^.asInstanceOf[js.Dynamic].applyDynamic("updateValues")(values.asInstanceOf[js.Any], value.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[R]
  @scala.inline
  def updateValues[T, R](values: Null, value: T, index: Double): R = (^.asInstanceOf[js.Dynamic].applyDynamic("updateValues")(values.asInstanceOf[js.Any], value.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[R]
  @scala.inline
  def updateValues[T, R](values: Null, value: UpdateValue[T], index: Double): R = (^.asInstanceOf[js.Dynamic].applyDynamic("updateValues")(values.asInstanceOf[js.Any], value.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[R]
  
  type UpdateValue[T] = js.Function1[/* prev */ T, T]
}
