package web.typings.rcUtil

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esChildrenToArrayMod {
  
  @JSImport("rc-util/es/Children/toArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(children: ReactElement): js.Array[ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[ReactElement]]
  @scala.inline
  def default(children: ReactElement, option: Option): js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(children.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactElement]]
  
  @js.native
  trait Option extends StObject {
    
    var keepEmpty: js.UndefOr[Boolean] = js.native
  }
  object Option {
    
    @scala.inline
    def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeepEmpty(value: Boolean): Self = StObject.set(x, "keepEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepEmptyUndefined: Self = StObject.set(x, "keepEmpty", js.undefined)
    }
  }
}
