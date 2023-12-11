package web.typings.rcTable

import web.typings.rcTable.libInterfaceMod.DataIndex
import web.typings.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsValueUtilMod {
  
  @JSImport("rc-table/lib/utils/valueUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getColumnsKey(columns: js.Array[GetColumnKeyColumn]): js.Array[Key] = ^.asInstanceOf[js.Dynamic].applyDynamic("getColumnsKey")(columns.asInstanceOf[js.Any]).asInstanceOf[js.Array[Key]]
  
  @scala.inline
  def validateValue[T](`val`: T): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @js.native
  trait GetColumnKeyColumn extends StObject {
    
    var dataIndex: js.UndefOr[DataIndex] = js.native
    
    var key: js.UndefOr[web.typings.rcTable.libInterfaceMod.Key] = js.native
  }
  object GetColumnKeyColumn {
    
    @scala.inline
    def apply(): GetColumnKeyColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetColumnKeyColumn]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: GetColumnKeyColumn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataIndex(value: DataIndex): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataIndexUndefined: Self = StObject.set(x, "dataIndex", js.undefined)
      
      @scala.inline
      def setDataIndexVarargs(value: (String | Double)*): Self = StObject.set(x, "dataIndex", js.Array(value :_*))
      
      @scala.inline
      def setKey(value: web.typings.rcTable.libInterfaceMod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
}
