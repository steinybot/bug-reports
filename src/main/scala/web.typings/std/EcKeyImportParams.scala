package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EcKeyImportParams
  extends StObject
     with Algorithm {
  
  /* standard dom */
  var namedCurve: NamedCurve = js.native
}
object EcKeyImportParams {
  
  @scala.inline
  def apply(name: java.lang.String, namedCurve: NamedCurve): EcKeyImportParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namedCurve = namedCurve.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcKeyImportParams]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: EcKeyImportParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamedCurve(value: NamedCurve): Self = StObject.set(x, "namedCurve", value.asInstanceOf[js.Any])
  }
}
