package web.typings.rcTree.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Key extends StObject {
  
  var key: web.typings.rcTree.esInterfaceMod.Key = js.native
  
  var title: js.UndefOr[ReactElement | (js.Function1[/* data */ this.type, ReactElement])] = js.native
}
object Key {
  
  @scala.inline
  def apply(key: web.typings.rcTree.esInterfaceMod.Key): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: web.typings.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: ReactElement | (js.Function1[Key, ReactElement])): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFunction1(value: Key => ReactElement): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
