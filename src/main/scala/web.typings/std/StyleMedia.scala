package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleMedia extends StObject {
  
  /* standard dom */
  def matchMedium(mediaquery: java.lang.String): scala.Boolean = js.native
  
  /* standard dom */
  val `type`: java.lang.String = js.native
}
object StyleMedia {
  
  @scala.inline
  def apply(matchMedium: java.lang.String => scala.Boolean, `type`: java.lang.String): StyleMedia = {
    val __obj = js.Dynamic.literal(matchMedium = js.Any.fromFunction1(matchMedium))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleMedia]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: StyleMedia] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatchMedium(value: java.lang.String => scala.Boolean): Self = StObject.set(x, "matchMedium", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
