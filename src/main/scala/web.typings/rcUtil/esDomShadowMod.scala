package web.typings.rcUtil

import web.typings.std.ShadowRoot
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDomShadowMod {
  
  @JSImport("rc-util/es/Dom/shadow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getShadowRoot(ele: Node): ShadowRoot = ^.asInstanceOf[js.Dynamic].applyDynamic("getShadowRoot")(ele.asInstanceOf[js.Any]).asInstanceOf[ShadowRoot]
  
  @scala.inline
  def inShadow(ele: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("inShadow")(ele.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
