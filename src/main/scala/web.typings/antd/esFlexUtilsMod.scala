package web.typings.antd

import web.typings.antd.antdStrings.`flex-end`
import web.typings.antd.antdStrings.`flex-start`
import web.typings.antd.antdStrings.`self-end`
import web.typings.antd.antdStrings.`self-start`
import web.typings.antd.antdStrings.`space-around`
import web.typings.antd.antdStrings.`space-between`
import web.typings.antd.antdStrings.`space-evenly`
import web.typings.antd.antdStrings.`wrap-reverse`
import web.typings.antd.antdStrings.baseline
import web.typings.antd.antdStrings.center
import web.typings.antd.antdStrings.end
import web.typings.antd.antdStrings.left
import web.typings.antd.antdStrings.normal
import web.typings.antd.antdStrings.nowrap
import web.typings.antd.antdStrings.right
import web.typings.antd.antdStrings.start
import web.typings.antd.antdStrings.stretch
import web.typings.antd.antdStrings.wrap
import web.typings.antd.esFlexInterfaceMod.FlexProps
import web.typings.antd.esUtilTypeMod.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esFlexUtilsMod {
  
  @JSImport("antd/es/flex/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String, props: FlexProps[AnyObject]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("antd/es/flex/utils", "alignItemsValues")
  @js.native
  val alignItemsValues: js.Tuple10[center, start, end, `flex-start`, `flex-end`, `self-start`, `self-end`, baseline, normal, stretch] = js.native
  
  @JSImport("antd/es/flex/utils", "flexWrapValues")
  @js.native
  val flexWrapValues: js.Tuple3[wrap, nowrap, `wrap-reverse`] = js.native
  
  @JSImport("antd/es/flex/utils", "justifyContentValues")
  @js.native
  val justifyContentValues: js.Tuple12[
    `flex-start`, 
    `flex-end`, 
    start, 
    end, 
    center, 
    `space-between`, 
    `space-around`, 
    `space-evenly`, 
    stretch, 
    normal, 
    left, 
    right
  ] = js.native
}
