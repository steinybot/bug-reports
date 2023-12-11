package web.typings.antd

import web.typings.antd.antdBooleans.`false`
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilStyleCheckerMod {
  
  @JSImport("antd/es/_util/styleChecker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def canUseDocElement(): `false` | HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("canUseDocElement")().asInstanceOf[`false` | HTMLElement]
  
  @scala.inline
  def isStyleSupport(styleName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStyleSupport")(styleName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isStyleSupport(styleName: String, styleValue: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStyleSupport")(styleName.asInstanceOf[js.Any], styleValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isStyleSupport(styleName: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStyleSupport")(styleName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
