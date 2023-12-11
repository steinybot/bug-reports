package web.typings.antd

import web.typings.antd.antdStrings.TreeSelect
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import web.typings.antd.esTreeStyleMod.TreeSharedToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTreeSelectStyleMod {
  
  @JSImport("antd/es/tree-select/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String, treePrefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], treePrefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/tree-select/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[TreeSelect] = js.native
  
  type ComponentToken = TreeSharedToken
}
