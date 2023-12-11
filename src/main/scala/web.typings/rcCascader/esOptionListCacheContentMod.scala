package web.typings.rcCascader

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esOptionListCacheContentMod extends Shortcut {
  
  @JSImport("rc-cascader/es/OptionList/CacheContent", JSImport.Default)
  @js.native
  val default: ReactComponentClass[js.Function1[/* param0 */ CacheContentProps, ReactElement]] = js.native
  
  @js.native
  trait CacheContentProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
  }
  object CacheContentProps {
    
    @scala.inline
    def apply(): CacheContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheContentProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CacheContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[js.Function1[/* param0 */ CacheContentProps, ReactElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esOptionListCacheContentMod.foo` */
  override def _to: ReactComponentClass[js.Function1[/* param0 */ CacheContentProps, ReactElement]] = default
}
