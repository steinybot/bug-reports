package web.typings.rcCascader

import web.typings.rcCascader.esCascaderMod.DefaultOptionType
import web.typings.rcCascader.esCascaderMod.InternalFieldNames
import web.typings.rcTree.esInterfaceMod.DataEntity
import web.typings.rcTree.esInterfaceMod.DataNode
import web.typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseEntitiesMod {
  
  @JSImport("rc-cascader/es/hooks/useEntities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** Lazy parse options data into conduct-able info to avoid perf issue in single mode */
  @scala.inline
  def default(options: js.Array[DefaultOptionType], fieldNames: InternalFieldNames): GetEntities = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any])).asInstanceOf[GetEntities]
  
  type GetEntities = js.Function0[Record[String, DataEntity[DataNode]]]
  
  @js.native
  trait OptionsInfo extends StObject {
    
    var keyEntities: Record[String, DataEntity[DataNode]] = js.native
    
    var pathKeyEntities: Record[String, DataEntity[DataNode]] = js.native
  }
  object OptionsInfo {
    
    @scala.inline
    def apply(
      keyEntities: Record[String, DataEntity[DataNode]],
      pathKeyEntities: Record[String, DataEntity[DataNode]]
    ): OptionsInfo = {
      val __obj = js.Dynamic.literal(keyEntities = keyEntities.asInstanceOf[js.Any], pathKeyEntities = pathKeyEntities.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsInfo]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: OptionsInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyEntities(value: Record[String, DataEntity[DataNode]]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathKeyEntities(value: Record[String, DataEntity[DataNode]]): Self = StObject.set(x, "pathKeyEntities", value.asInstanceOf[js.Any])
    }
  }
}
