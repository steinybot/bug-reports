package web.typings.rcComponentTrigger

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPopupPopupContentMod extends Shortcut {
  
  @JSImport("@rc-component/trigger/es/Popup/PopupContent", JSImport.Default)
  @js.native
  val default: ReactComponentClass[js.Function1[/* param0 */ PopupContentProps, ReactElement]] = js.native
  
  @js.native
  trait PopupContentProps extends StObject {
    
    var cache: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
  }
  object PopupContentProps {
    
    @scala.inline
    def apply(): PopupContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopupContentProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PopupContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[js.Function1[/* param0 */ PopupContentProps, ReactElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esPopupPopupContentMod.foo` */
  override def _to: ReactComponentClass[js.Function1[/* param0 */ PopupContentProps, ReactElement]] = default
}
