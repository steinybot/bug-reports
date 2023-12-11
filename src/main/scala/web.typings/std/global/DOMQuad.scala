package web.typings.std.global

import web.typings.std.DOMPointInit
import web.typings.std.DOMQuadInit
import web.typings.std.DOMRectInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("DOMQuad")
@js.native
/* standard dom */
class DOMQuad ()
  extends StObject
     with web.typings.std.DOMQuad {
  def this(p1: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit) = this()
  def this(p1: Unit, p2: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: Unit, p3: DOMPointInit) = this()
  def this(p1: Unit, p2: DOMPointInit, p3: DOMPointInit) = this()
  def this(p1: Unit, p2: Unit, p3: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit, p4: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit, p3: Unit, p4: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: Unit, p3: DOMPointInit, p4: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: Unit, p3: Unit, p4: DOMPointInit) = this()
  def this(p1: Unit, p2: DOMPointInit, p3: DOMPointInit, p4: DOMPointInit) = this()
  def this(p1: Unit, p2: DOMPointInit, p3: Unit, p4: DOMPointInit) = this()
  def this(p1: Unit, p2: Unit, p3: DOMPointInit, p4: DOMPointInit) = this()
  def this(p1: Unit, p2: Unit, p3: Unit, p4: DOMPointInit) = this()
}
object DOMQuad {
  
  @JSGlobal("DOMQuad")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard dom */
  @scala.inline
  def fromQuad(): web.typings.std.DOMQuad = ^.asInstanceOf[js.Dynamic].applyDynamic("fromQuad")().asInstanceOf[web.typings.std.DOMQuad]
  @scala.inline
  def fromQuad(other: DOMQuadInit): web.typings.std.DOMQuad = ^.asInstanceOf[js.Dynamic].applyDynamic("fromQuad")(other.asInstanceOf[js.Any]).asInstanceOf[web.typings.std.DOMQuad]
  
  /* standard dom */
  @scala.inline
  def fromRect(): web.typings.std.DOMQuad = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRect")().asInstanceOf[web.typings.std.DOMQuad]
  @scala.inline
  def fromRect(other: DOMRectInit): web.typings.std.DOMQuad = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRect")(other.asInstanceOf[js.Any]).asInstanceOf[web.typings.std.DOMQuad]
}
