package web.typings.rcTree

import web.typings.rcTree.anon.HalfCheckedKeys
import web.typings.rcTree.esInterfaceMod.BasicDataNode
import web.typings.rcTree.esInterfaceMod.GetCheckDisabled
import web.typings.rcTree.esInterfaceMod.Key
import web.typings.rcTree.esInterfaceMod.KeyEntities
import web.typings.rcTree.rcTreeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsConductUtilMod {
  
  @JSImport("rc-tree/es/utils/conductUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def conductCheck[TreeDataType /* <: BasicDataNode */](keyList: js.Array[Key], checked: HalfCheckedKeys, keyEntities: KeyEntities[TreeDataType]): ConductReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("conductCheck")(keyList.asInstanceOf[js.Any], checked.asInstanceOf[js.Any], keyEntities.asInstanceOf[js.Any])).asInstanceOf[ConductReturnType]
  @scala.inline
  def conductCheck[TreeDataType /* <: BasicDataNode */](
    keyList: js.Array[Key],
    checked: HalfCheckedKeys,
    keyEntities: KeyEntities[TreeDataType],
    getCheckDisabled: GetCheckDisabled[TreeDataType]
  ): ConductReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("conductCheck")(keyList.asInstanceOf[js.Any], checked.asInstanceOf[js.Any], keyEntities.asInstanceOf[js.Any], getCheckDisabled.asInstanceOf[js.Any])).asInstanceOf[ConductReturnType]
  
  @scala.inline
  def conductCheck_true[TreeDataType /* <: BasicDataNode */](keyList: js.Array[Key], checked: `true`, keyEntities: KeyEntities[TreeDataType]): ConductReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("conductCheck")(keyList.asInstanceOf[js.Any], checked.asInstanceOf[js.Any], keyEntities.asInstanceOf[js.Any])).asInstanceOf[ConductReturnType]
  @scala.inline
  def conductCheck_true[TreeDataType /* <: BasicDataNode */](
    keyList: js.Array[Key],
    checked: `true`,
    keyEntities: KeyEntities[TreeDataType],
    getCheckDisabled: GetCheckDisabled[TreeDataType]
  ): ConductReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("conductCheck")(keyList.asInstanceOf[js.Any], checked.asInstanceOf[js.Any], keyEntities.asInstanceOf[js.Any], getCheckDisabled.asInstanceOf[js.Any])).asInstanceOf[ConductReturnType]
  
  @scala.inline
  def isCheckDisabled[TreeDataType](node: TreeDataType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCheckDisabled")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @js.native
  trait ConductReturnType extends StObject {
    
    var checkedKeys: js.Array[Key] = js.native
    
    var halfCheckedKeys: js.Array[Key] = js.native
  }
  object ConductReturnType {
    
    @scala.inline
    def apply(checkedKeys: js.Array[Key], halfCheckedKeys: js.Array[Key]): ConductReturnType = {
      val __obj = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConductReturnType]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ConductReturnType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "checkedKeys", js.Array(value :_*))
      
      @scala.inline
      def setHalfCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "halfCheckedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "halfCheckedKeys", js.Array(value :_*))
    }
  }
}
