package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the serializeToString() method to construct an XML string representing a DOM tree. */
@js.native
trait XMLSerializer extends StObject {
  
  /* standard dom */
  def serializeToString(root: org.scalajs.dom.Node): java.lang.String = js.native
}
object XMLSerializer {
  
  @scala.inline
  def apply(serializeToString: org.scalajs.dom.Node => java.lang.String): XMLSerializer = {
    val __obj = js.Dynamic.literal(serializeToString = js.Any.fromFunction1(serializeToString))
    __obj.asInstanceOf[XMLSerializer]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: XMLSerializer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSerializeToString(value: org.scalajs.dom.Node => java.lang.String): Self = StObject.set(x, "serializeToString", js.Any.fromFunction1(value))
  }
}
