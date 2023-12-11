package web.typings.rcFieldForm.esInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateOptions extends StObject {
  
  /** Validate when a field is dirty (validated or touched) */
  var dirty: js.UndefOr[Boolean] = js.native
  
  /**
    * Recursive validate. It will validate all the name path that contains the provided one.
    * e.g. [['a']] will validate ['a'] , ['a', 'b'] and ['a', 1].
    */
  var recursive: js.UndefOr[Boolean] = js.native
  
  /**
    * Validate only and not trigger UI and Field status update
    */
  var validateOnly: js.UndefOr[Boolean] = js.native
}
object ValidateOptions {
  
  @scala.inline
  def apply(): ValidateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateOptions]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ValidateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    
    @scala.inline
    def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
