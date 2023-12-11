package web.typings.std.global

import web.typings.std.DOMMatrixInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("DOMMatrixReadOnly")
@js.native
/* standard dom */
class DOMMatrixReadOnly ()
  extends StObject
     with web.typings.std.DOMMatrixReadOnly {
  def this(init: java.lang.String) = this()
  def this(init: js.Array[Double]) = this()
}
object DOMMatrixReadOnly {
  
  @JSGlobal("DOMMatrixReadOnly")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard dom */
  @scala.inline
  def fromFloat32Array(array32: js.typedarray.Float32Array): web.typings.std.DOMMatrixReadOnly = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFloat32Array")(array32.asInstanceOf[js.Any]).asInstanceOf[web.typings.std.DOMMatrixReadOnly]
  
  /* standard dom */
  @scala.inline
  def fromFloat64Array(array64: js.typedarray.Float64Array): web.typings.std.DOMMatrixReadOnly = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFloat64Array")(array64.asInstanceOf[js.Any]).asInstanceOf[web.typings.std.DOMMatrixReadOnly]
  
  /* standard dom */
  @scala.inline
  def fromMatrix(): web.typings.std.DOMMatrixReadOnly = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMatrix")().asInstanceOf[web.typings.std.DOMMatrixReadOnly]
  @scala.inline
  def fromMatrix(other: DOMMatrixInit): web.typings.std.DOMMatrixReadOnly = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMatrix")(other.asInstanceOf[js.Any]).asInstanceOf[web.typings.std.DOMMatrixReadOnly]
  
  /* standard dom */
  @scala.inline
  def toString_(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[java.lang.String]
}
