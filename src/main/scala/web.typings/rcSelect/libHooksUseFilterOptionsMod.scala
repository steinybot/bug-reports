package web.typings.rcSelect

import web.typings.rcSelect.libSelectMod.DefaultOptionType
import web.typings.rcSelect.libSelectMod.FieldNames
import web.typings.rcSelect.libSelectMod.FilterFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseFilterOptionsMod {
  
  @JSImport("rc-select/lib/hooks/useFilterOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(options: js.Array[DefaultOptionType], fieldNames: FieldNames): js.Array[DefaultOptionType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[DefaultOptionType]]
  @scala.inline
  def default(options: js.Array[DefaultOptionType], fieldNames: FieldNames, searchValue: String): js.Array[DefaultOptionType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any], searchValue.asInstanceOf[js.Any])).asInstanceOf[js.Array[DefaultOptionType]]
  @scala.inline
  def default(
    options: js.Array[DefaultOptionType],
    fieldNames: FieldNames,
    searchValue: String,
    filterOption: js.UndefOr[Boolean | FilterFunc[DefaultOptionType]]
  ): js.Array[DefaultOptionType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any], searchValue.asInstanceOf[js.Any], filterOption.asInstanceOf[js.Any])).asInstanceOf[js.Array[DefaultOptionType]]
  @scala.inline
  def default(
    options: js.Array[DefaultOptionType],
    fieldNames: FieldNames,
    searchValue: String,
    filterOption: js.UndefOr[Boolean | FilterFunc[DefaultOptionType]],
    optionFilterProp: String
  ): js.Array[DefaultOptionType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any], searchValue.asInstanceOf[js.Any], filterOption.asInstanceOf[js.Any], optionFilterProp.asInstanceOf[js.Any])).asInstanceOf[js.Array[DefaultOptionType]]
  @scala.inline
  def default(
    options: js.Array[DefaultOptionType],
    fieldNames: FieldNames,
    searchValue: String,
    filterOption: Unit,
    optionFilterProp: String
  ): js.Array[DefaultOptionType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any], searchValue.asInstanceOf[js.Any], filterOption.asInstanceOf[js.Any], optionFilterProp.asInstanceOf[js.Any])).asInstanceOf[js.Array[DefaultOptionType]]
  @scala.inline
  def default(
    options: js.Array[DefaultOptionType],
    fieldNames: FieldNames,
    searchValue: Unit,
    filterOption: js.UndefOr[Boolean | FilterFunc[DefaultOptionType]]
  ): js.Array[DefaultOptionType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any], searchValue.asInstanceOf[js.Any], filterOption.asInstanceOf[js.Any])).asInstanceOf[js.Array[DefaultOptionType]]
  @scala.inline
  def default(
    options: js.Array[DefaultOptionType],
    fieldNames: FieldNames,
    searchValue: Unit,
    filterOption: js.UndefOr[Boolean | FilterFunc[DefaultOptionType]],
    optionFilterProp: String
  ): js.Array[DefaultOptionType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any], searchValue.asInstanceOf[js.Any], filterOption.asInstanceOf[js.Any], optionFilterProp.asInstanceOf[js.Any])).asInstanceOf[js.Array[DefaultOptionType]]
  @scala.inline
  def default(
    options: js.Array[DefaultOptionType],
    fieldNames: FieldNames,
    searchValue: Unit,
    filterOption: Unit,
    optionFilterProp: String
  ): js.Array[DefaultOptionType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any], searchValue.asInstanceOf[js.Any], filterOption.asInstanceOf[js.Any], optionFilterProp.asInstanceOf[js.Any])).asInstanceOf[js.Array[DefaultOptionType]]
}
