package web.typings.std.global

import web.typings.std.DOMRectInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("DOMRectReadOnly")
@js.native
/* standard dom */
class DOMRectReadOnly ()
  extends StObject
     with web.typings.std.DOMRectReadOnly {
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
object DOMRectReadOnly {
  
  @JSGlobal("DOMRectReadOnly")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard dom */
  @scala.inline
  def fromRect(): web.typings.std.DOMRectReadOnly = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRect")().asInstanceOf[web.typings.std.DOMRectReadOnly]
  @scala.inline
  def fromRect(other: DOMRectInit): web.typings.std.DOMRectReadOnly = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRect")(other.asInstanceOf[js.Any]).asInstanceOf[web.typings.std.DOMRectReadOnly]
}
