package web.typings.rcTable.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollConfig extends StObject {
  
  var index: js.UndefOr[Double] = js.native
  
  var key: js.UndefOr[Key] = js.native
  
  var top: js.UndefOr[Double] = js.native
}
object ScrollConfig {
  
  @scala.inline
  def apply(): ScrollConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollConfig]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ScrollConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
