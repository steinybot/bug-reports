package web.typings.rcCascader

import web.typings.rcCascader.esCascaderMod.DefaultOptionType
import web.typings.rcCascader.esCascaderMod.FieldNames
import web.typings.rcCascader.esCascaderMod.InternalFieldNames
import web.typings.rcCascader.esCascaderMod.SingleValueType
import web.typings.rcCascader.esCascaderMod.ValueType
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsCommonUtilMod {
  
  @JSImport("rc-cascader/es/utils/commonUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-cascader/es/utils/commonUtil", "SHOW_CHILD")
  @js.native
  val SHOW_CHILD: /* "SHOW_CHILD" */ String = js.native
  
  @JSImport("rc-cascader/es/utils/commonUtil", "SHOW_PARENT")
  @js.native
  val SHOW_PARENT: /* "SHOW_PARENT" */ String = js.native
  
  @JSImport("rc-cascader/es/utils/commonUtil", "VALUE_SPLIT")
  @js.native
  val VALUE_SPLIT: /* "__RC_CASCADER_SPLIT__" */ String = js.native
  
  @scala.inline
  def fillFieldNames(): InternalFieldNames = ^.asInstanceOf[js.Dynamic].applyDynamic("fillFieldNames")().asInstanceOf[InternalFieldNames]
  @scala.inline
  def fillFieldNames(fieldNames: FieldNames): InternalFieldNames = ^.asInstanceOf[js.Dynamic].applyDynamic("fillFieldNames")(fieldNames.asInstanceOf[js.Any]).asInstanceOf[InternalFieldNames]
  
  @scala.inline
  def getFullPathKeys(options: js.Array[DefaultOptionType], fieldNames: FieldNames): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFullPathKeys")(options.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  @scala.inline
  def isLeaf(option: DefaultOptionType, fieldNames: FieldNames): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isLeaf")(option.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @scala.inline
  def scrollIntoParentView(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoParentView")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def toPathKey(value: SingleValueType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toPathKey")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def toPathKeys(value: js.Array[SingleValueType]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toPathKeys")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def toPathValueStr(pathKey: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toPathValueStr")(pathKey.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def toRawValues(value: ValueType): js.Array[SingleValueType] = ^.asInstanceOf[js.Dynamic].applyDynamic("toRawValues")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[SingleValueType]]
}
