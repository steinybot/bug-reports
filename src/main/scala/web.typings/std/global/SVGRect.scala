package web.typings.std.global

import web.typings.std.DOMRectInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SVGRect")
@js.native
/* standard dom */
class SVGRect ()
  extends StObject
     with web.typings.std.DOMRect {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  def this(x: Double, y: Double, width: Double) = this()
  def this(x: Double, y: Unit, width: Double) = this()
  def this(x: Unit, y: Double, width: Double) = this()
  def this(x: Unit, y: Unit, width: Double) = this()
  def this(x: Double, y: Double, width: Double, height: Double) = this()
  def this(x: Double, y: Double, width: Unit, height: Double) = this()
  def this(x: Double, y: Unit, width: Double, height: Double) = this()
  def this(x: Double, y: Unit, width: Unit, height: Double) = this()
  def this(x: Unit, y: Double, width: Double, height: Double) = this()
  def this(x: Unit, y: Double, width: Unit, height: Double) = this()
  def this(x: Unit, y: Unit, width: Double, height: Double) = this()
  def this(x: Unit, y: Unit, width: Unit, height: Double) = this()
}
/* was `typeof DOMRect` */
object SVGRect {
  
  @JSGlobal("SVGRect")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard dom */
  @scala.inline
  def fromRect(): org.scalajs.dom.DOMRect = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRect")().asInstanceOf[org.scalajs.dom.DOMRect]
  @scala.inline
  def fromRect(other: DOMRectInit): org.scalajs.dom.DOMRect = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRect")(other.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.DOMRect]
}
