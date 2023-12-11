package web.typings.std.global

import web.typings.std.DOMPointInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SVGPoint")
@js.native
/* standard dom */
class SVGPoint ()
  extends StObject
     with web.typings.std.DOMPoint {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Unit, z: Double) = this()
  def this(x: Unit, y: Double, z: Double) = this()
  def this(x: Unit, y: Unit, z: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
  def this(x: Double, y: Double, z: Unit, w: Double) = this()
  def this(x: Double, y: Unit, z: Double, w: Double) = this()
  def this(x: Double, y: Unit, z: Unit, w: Double) = this()
  def this(x: Unit, y: Double, z: Double, w: Double) = this()
  def this(x: Unit, y: Double, z: Unit, w: Double) = this()
  def this(x: Unit, y: Unit, z: Double, w: Double) = this()
  def this(x: Unit, y: Unit, z: Unit, w: Double) = this()
}
/* was `typeof DOMPoint` */
object SVGPoint {
  
  @JSGlobal("SVGPoint")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard dom */
  @scala.inline
  def fromPoint(): web.typings.std.DOMPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoint")().asInstanceOf[web.typings.std.DOMPoint]
  @scala.inline
  def fromPoint(other: DOMPointInit): web.typings.std.DOMPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoint")(other.asInstanceOf[js.Any]).asInstanceOf[web.typings.std.DOMPoint]
}
