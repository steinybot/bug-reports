package web.typings.std.global

import web.typings.std.RequestInfo
import org.scalajs.dom.RequestInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Request")
@js.native
class Request protected ()
  extends StObject
     with web.typings.std.Request {
  /* standard dom */
  def this(input: RequestInfo) = this()
  def this(input: RequestInfo, init: RequestInit) = this()
}
