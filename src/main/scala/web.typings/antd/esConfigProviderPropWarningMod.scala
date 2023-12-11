package web.typings.antd

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esConfigProviderPropWarningMod extends Shortcut {
  
  @JSImport("antd/es/config-provider/PropWarning", JSImport.Default)
  @js.native
  val default: (ReactComponentClass[js.Function1[/* param0 */ PropWarningProps, Null]]) | js.Function0[Null] = js.native
  
  @js.native
  trait PropWarningProps extends StObject {
    
    var dropdownMatchSelectWidth: js.UndefOr[Boolean] = js.native
  }
  object PropWarningProps {
    
    @scala.inline
    def apply(): PropWarningProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropWarningProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PropWarningProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDropdownMatchSelectWidth(value: Boolean): Self = StObject.set(x, "dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownMatchSelectWidthUndefined: Self = StObject.set(x, "dropdownMatchSelectWidth", js.undefined)
    }
  }
  
  type _To = (ReactComponentClass[js.Function1[/* param0 */ PropWarningProps, Null]]) | js.Function0[Null]
  
  /* This means you don't have to write `default`, but can instead just say `esConfigProviderPropWarningMod.foo` */
  override def _to: (ReactComponentClass[js.Function1[/* param0 */ PropWarningProps, Null]]) | js.Function0[Null] = default
}
