package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Expired extends StObject {
  
  var expired: String = js.native
  
  var refresh: String = js.native
}
object Expired {
  
  @scala.inline
  def apply(expired: String, refresh: String): Expired = {
    val __obj = js.Dynamic.literal(expired = expired.asInstanceOf[js.Any], refresh = refresh.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expired]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Expired] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpired(value: String): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: String): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
  }
}
