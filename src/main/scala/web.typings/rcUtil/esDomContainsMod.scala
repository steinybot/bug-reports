package web.typings.rcUtil

import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDomContainsMod {
  
  @JSImport("rc-util/es/Dom/contains", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Boolean]
  @scala.inline
  def default(root: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(root.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def default(root: Node, n: Node): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(root.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def default(root: Null, n: Node): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(root.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def default(root: Unit, n: Node): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(root.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
