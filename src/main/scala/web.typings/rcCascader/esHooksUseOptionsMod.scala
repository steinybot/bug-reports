package web.typings.rcCascader

import web.typings.rcCascader.esCascaderMod.DefaultOptionType
import web.typings.rcCascader.esCascaderMod.InternalFieldNames
import web.typings.rcCascader.esCascaderMod.SingleValueType
import web.typings.rcCascader.esHooksUseEntitiesMod.GetEntities
import web.typings.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseOptionsMod {
  
  @JSImport("rc-cascader/es/hooks/useOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(mergedFieldNames: InternalFieldNames): js.Tuple3[
    /* mergedOptions */ js.Array[DefaultOptionType], 
    /* getPathKeyEntities */ GetEntities, 
    /* getValueByKeyPath */ js.Function1[/* pathKeys */ js.Array[Key], js.Array[SingleValueType]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(mergedFieldNames.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[
    /* mergedOptions */ js.Array[DefaultOptionType], 
    /* getPathKeyEntities */ GetEntities, 
    /* getValueByKeyPath */ js.Function1[/* pathKeys */ js.Array[Key], js.Array[SingleValueType]]
  ]]
  @scala.inline
  def default(mergedFieldNames: InternalFieldNames, options: js.Array[DefaultOptionType]): js.Tuple3[
    /* mergedOptions */ js.Array[DefaultOptionType], 
    /* getPathKeyEntities */ GetEntities, 
    /* getValueByKeyPath */ js.Function1[/* pathKeys */ js.Array[Key], js.Array[SingleValueType]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(mergedFieldNames.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    /* mergedOptions */ js.Array[DefaultOptionType], 
    /* getPathKeyEntities */ GetEntities, 
    /* getValueByKeyPath */ js.Function1[/* pathKeys */ js.Array[Key], js.Array[SingleValueType]]
  ]]
}
