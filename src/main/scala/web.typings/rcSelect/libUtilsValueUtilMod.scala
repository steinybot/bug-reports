package web.typings.rcSelect

import web.typings.rcSelect.anon.ChildrenAsData
import web.typings.rcSelect.anon.GroupLabel
import web.typings.rcSelect.libInterfaceMod.FlattenOptionData
import web.typings.rcSelect.libSelectMod.BaseOptionType
import web.typings.rcSelect.libSelectMod.FieldNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsValueUtilMod {
  
  @JSImport("rc-select/lib/utils/valueUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fillFieldNames(fieldNames: FieldNames, childrenAsData: Boolean): GroupLabel = (^.asInstanceOf[js.Dynamic].applyDynamic("fillFieldNames")(fieldNames.asInstanceOf[js.Any], childrenAsData.asInstanceOf[js.Any])).asInstanceOf[GroupLabel]
  @scala.inline
  def fillFieldNames(fieldNames: Unit, childrenAsData: Boolean): GroupLabel = (^.asInstanceOf[js.Dynamic].applyDynamic("fillFieldNames")(fieldNames.asInstanceOf[js.Any], childrenAsData.asInstanceOf[js.Any])).asInstanceOf[GroupLabel]
  
  @scala.inline
  def flattenOptions[OptionType /* <: BaseOptionType */](options: js.Array[OptionType]): js.Array[FlattenOptionData[OptionType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenOptions")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[FlattenOptionData[OptionType]]]
  @scala.inline
  def flattenOptions[OptionType /* <: BaseOptionType */](options: js.Array[OptionType], param1: ChildrenAsData): js.Array[FlattenOptionData[OptionType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenOptions")(options.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Array[FlattenOptionData[OptionType]]]
  
  @scala.inline
  def getSeparatedContent(text: String, tokens: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSeparatedContent")(text.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def injectPropsWithOption[T /* <: js.Object */](option: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("injectPropsWithOption")(option.asInstanceOf[js.Any]).asInstanceOf[T]
}
