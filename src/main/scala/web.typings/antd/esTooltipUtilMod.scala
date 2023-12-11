package web.typings.antd

import web.typings.antd.anon.ArrowStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTooltipUtilMod {
  
  @JSImport("antd/es/tooltip/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parseColor(prefixCls: String): ArrowStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("parseColor")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[ArrowStyle]
  @scala.inline
  def parseColor(prefixCls: String, color: String): ArrowStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("parseColor")(prefixCls.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[ArrowStyle]
}
