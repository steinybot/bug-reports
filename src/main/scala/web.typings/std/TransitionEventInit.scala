package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitionEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var elapsedTime: js.UndefOr[Double] = js.native
  
  /* standard dom */
  var propertyName: js.UndefOr[java.lang.String] = js.native
  
  /* standard dom */
  var pseudoElement: js.UndefOr[java.lang.String] = js.native
}
object TransitionEventInit {
  
  @scala.inline
  def apply(): TransitionEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionEventInit]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: TransitionEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElapsedTime(value: Double): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElapsedTimeUndefined: Self = StObject.set(x, "elapsedTime", js.undefined)
    
    @scala.inline
    def setPropertyName(value: java.lang.String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
    
    @scala.inline
    def setPseudoElement(value: java.lang.String): Self = StObject.set(x, "pseudoElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPseudoElementUndefined: Self = StObject.set(x, "pseudoElement", js.undefined)
  }
}
