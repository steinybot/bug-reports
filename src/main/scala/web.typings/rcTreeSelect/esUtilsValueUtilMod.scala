package web.typings.rcTreeSelect

import web.typings.rcTreeSelect.anon.Key
import web.typings.rcTreeSelect.esInterfaceMod.DataNode
import web.typings.rcTreeSelect.esInterfaceMod.FieldNames
import web.typings.rcTreeSelect.esTreeSelectMod.DefaultOptionType
import web.typings.rcTreeSelect.esTreeSelectMod.InternalFieldName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsValueUtilMod {
  
  @JSImport("rc-tree-select/es/utils/valueUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fillFieldNames(): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("fillFieldNames")().asInstanceOf[Key]
  @scala.inline
  def fillFieldNames(fieldNames: FieldNames): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("fillFieldNames")(fieldNames.asInstanceOf[js.Any]).asInstanceOf[Key]
  
  @scala.inline
  def getAllKeys(treeData: js.Array[DefaultOptionType], fieldNames: InternalFieldName): js.Array[web.typings.react.mod.Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllKeys")(treeData.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[web.typings.react.mod.Key]]
  
  @scala.inline
  def isCheckDisabled(node: DataNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCheckDisabled")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isNil(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNil")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def toArray[T](value: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  @scala.inline
  def toArray[T](value: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
