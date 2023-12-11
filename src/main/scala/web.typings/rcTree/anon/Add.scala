package web.typings.rcTree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Add extends StObject {
  
  var add: Boolean = js.native
  
  var key: web.typings.react.mod.Key = js.native
}
object Add {
  
  @scala.inline
  def apply(add: Boolean, key: web.typings.react.mod.Key): Add = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Add]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Add] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: Boolean): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: web.typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
