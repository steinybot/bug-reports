package web.typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("IDBKeyRange")
@js.native
/* standard dom */
class IDBKeyRange ()
  extends StObject
     with web.typings.std.IDBKeyRange
object IDBKeyRange {
  
  @JSGlobal("IDBKeyRange")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a new IDBKeyRange spanning from lower to upper. If lowerOpen is true, lower is not included in the range. If upperOpen is true, upper is not included in the range.
    */
  /* standard dom */
  @scala.inline
  def bound(lower: Any, upper: Any): org.scalajs.dom.IDBKeyRange = (^.asInstanceOf[js.Dynamic].applyDynamic("bound")(lower.asInstanceOf[js.Any], upper.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.IDBKeyRange]
  @scala.inline
  def bound(lower: Any, upper: Any, lowerOpen: scala.Boolean): org.scalajs.dom.IDBKeyRange = (^.asInstanceOf[js.Dynamic].applyDynamic("bound")(lower.asInstanceOf[js.Any], upper.asInstanceOf[js.Any], lowerOpen.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.IDBKeyRange]
  @scala.inline
  def bound(lower: Any, upper: Any, lowerOpen: scala.Boolean, upperOpen: scala.Boolean): org.scalajs.dom.IDBKeyRange = (^.asInstanceOf[js.Dynamic].applyDynamic("bound")(lower.asInstanceOf[js.Any], upper.asInstanceOf[js.Any], lowerOpen.asInstanceOf[js.Any], upperOpen.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.IDBKeyRange]
  @scala.inline
  def bound(lower: Any, upper: Any, lowerOpen: Unit, upperOpen: scala.Boolean): org.scalajs.dom.IDBKeyRange = (^.asInstanceOf[js.Dynamic].applyDynamic("bound")(lower.asInstanceOf[js.Any], upper.asInstanceOf[js.Any], lowerOpen.asInstanceOf[js.Any], upperOpen.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.IDBKeyRange]
  
  /**
    * Returns a new IDBKeyRange starting at key with no upper bound. If open is true, key is not included in the range.
    */
  /* standard dom */
  @scala.inline
  def lowerBound(lower: Any): org.scalajs.dom.IDBKeyRange = ^.asInstanceOf[js.Dynamic].applyDynamic("lowerBound")(lower.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.IDBKeyRange]
  @scala.inline
  def lowerBound(lower: Any, open: scala.Boolean): org.scalajs.dom.IDBKeyRange = (^.asInstanceOf[js.Dynamic].applyDynamic("lowerBound")(lower.asInstanceOf[js.Any], open.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.IDBKeyRange]
  
  /**
    * Returns a new IDBKeyRange spanning only key.
    */
  /* standard dom */
  @scala.inline
  def only(value: Any): org.scalajs.dom.IDBKeyRange = ^.asInstanceOf[js.Dynamic].applyDynamic("only")(value.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.IDBKeyRange]
  
  /**
    * Returns a new IDBKeyRange with no lower bound and ending at key. If open is true, key is not included in the range.
    */
  /* standard dom */
  @scala.inline
  def upperBound(upper: Any): org.scalajs.dom.IDBKeyRange = ^.asInstanceOf[js.Dynamic].applyDynamic("upperBound")(upper.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.IDBKeyRange]
  @scala.inline
  def upperBound(upper: Any, open: scala.Boolean): org.scalajs.dom.IDBKeyRange = (^.asInstanceOf[js.Dynamic].applyDynamic("upperBound")(upper.asInstanceOf[js.Any], open.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.IDBKeyRange]
}
