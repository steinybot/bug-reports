package web.typings.rcUtil

import web.typings.react.mod.ReactInstance
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDomFindDOMNodeMod {
  
  @JSImport("rc-util/es/Dom/findDOMNode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](node: ReactInstance): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def default[T](node: HTMLElement): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def default[T](node: SVGElement): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def isDOM(node: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDOM")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
