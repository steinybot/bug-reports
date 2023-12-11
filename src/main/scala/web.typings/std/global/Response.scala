package web.typings.std.global

import web.typings.std.BodyInit
import org.scalajs.dom.ResponseInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Response")
@js.native
/* standard dom */
class Response ()
  extends StObject
     with web.typings.std.Response {
  def this(body: BodyInit) = this()
  def this(body: BodyInit, init: ResponseInit) = this()
  def this(body: Null, init: ResponseInit) = this()
  def this(body: Unit, init: ResponseInit) = this()
}
object Response {
  
  @JSGlobal("Response")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard dom */
  @scala.inline
  def error(): org.scalajs.dom.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[org.scalajs.dom.Response]
  
  /* standard dom */
  @scala.inline
  def redirect(url: java.lang.String): org.scalajs.dom.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.Response]
  @scala.inline
  def redirect(url: java.lang.String, status: Double): org.scalajs.dom.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.Response]
}
