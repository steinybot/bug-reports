package web.typings.std.global

import web.typings.std.MouseEventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MouseEvent")
@js.native
class MouseEvent protected ()
  extends StObject
     with web.typings.std.MouseEvent {
  /* standard dom */
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: MouseEventInit) = this()
}
