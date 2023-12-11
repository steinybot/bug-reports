package web.typings.std.global

import web.typings.std.BlobPart
import org.scalajs.dom.BlobPropertyBag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Blob")
@js.native
/* standard dom */
class Blob ()
  extends StObject
     with web.typings.std.Blob {
  def this(blobParts: js.Array[BlobPart]) = this()
  def this(blobParts: js.Array[BlobPart], options: BlobPropertyBag) = this()
  def this(blobParts: Unit, options: BlobPropertyBag) = this()
}
