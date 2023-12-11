package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Back extends StObject {
  
  var back: String = js.native
}
object Back {
  
  @scala.inline
  def apply(back: String): Back = {
    val __obj = js.Dynamic.literal(back = back.asInstanceOf[js.Any])
    __obj.asInstanceOf[Back]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Back] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBack(value: String): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
  }
}
