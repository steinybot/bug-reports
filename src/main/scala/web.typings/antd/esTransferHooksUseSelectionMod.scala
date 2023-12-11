package web.typings.antd

import web.typings.antd.anon.KeyString
import web.typings.react.mod.Dispatch
import web.typings.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTransferHooksUseSelectionMod {
  
  @JSImport("antd/es/transfer/hooks/useSelection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T /* <: KeyString */](leftDataSource: js.Array[T], rightDataSource: js.Array[T]): js.Tuple4[
    /* sourceSelectedKeys */ js.Array[String], 
    /* targetSelectedKeys */ js.Array[String], 
    /* setSourceSelectedKeys */ Dispatch[SetStateAction[js.Array[String]]], 
    /* setTargetSelectedKeys */ Dispatch[SetStateAction[js.Array[String]]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(leftDataSource.asInstanceOf[js.Any], rightDataSource.asInstanceOf[js.Any])).asInstanceOf[js.Tuple4[
    /* sourceSelectedKeys */ js.Array[String], 
    /* targetSelectedKeys */ js.Array[String], 
    /* setSourceSelectedKeys */ Dispatch[SetStateAction[js.Array[String]]], 
    /* setTargetSelectedKeys */ Dispatch[SetStateAction[js.Array[String]]]
  ]]
  @scala.inline
  def default[T /* <: KeyString */](leftDataSource: js.Array[T], rightDataSource: js.Array[T], selectedKeys: js.Array[String]): js.Tuple4[
    /* sourceSelectedKeys */ js.Array[String], 
    /* targetSelectedKeys */ js.Array[String], 
    /* setSourceSelectedKeys */ Dispatch[SetStateAction[js.Array[String]]], 
    /* setTargetSelectedKeys */ Dispatch[SetStateAction[js.Array[String]]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(leftDataSource.asInstanceOf[js.Any], rightDataSource.asInstanceOf[js.Any], selectedKeys.asInstanceOf[js.Any])).asInstanceOf[js.Tuple4[
    /* sourceSelectedKeys */ js.Array[String], 
    /* targetSelectedKeys */ js.Array[String], 
    /* setSourceSelectedKeys */ Dispatch[SetStateAction[js.Array[String]]], 
    /* setTargetSelectedKeys */ Dispatch[SetStateAction[js.Array[String]]]
  ]]
}
