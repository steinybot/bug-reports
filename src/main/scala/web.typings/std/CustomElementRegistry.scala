package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomElementRegistry extends StObject {
  
  /* standard dom */
  def define(name: java.lang.String, constructor: CustomElementConstructor): Unit = js.native
  def define(name: java.lang.String, constructor: CustomElementConstructor, options: ElementDefinitionOptions): Unit = js.native
  
  /* standard dom */
  def get(name: java.lang.String): Any = js.native
  
  /* standard dom */
  def upgrade(root: org.scalajs.dom.Node): Unit = js.native
  
  /* standard dom */
  def whenDefined(name: java.lang.String): js.Promise[Unit] = js.native
}
