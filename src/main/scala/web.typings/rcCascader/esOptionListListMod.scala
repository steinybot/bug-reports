package web.typings.rcCascader

import web.typings.rcSelect.libOptionListMod.RefOptionListProps
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esOptionListListMod extends Shortcut {
  
  @JSImport("rc-cascader/es/OptionList/List", JSImport.Default)
  @js.native
  val default: ReactComponentClass[RawOptionListProps with RefAttributes[RefOptionListProps]] = js.native
  
  /* Inlined std.Pick<std.ReturnType<(): rc-select.rc-select/lib/hooks/useBaseProps.BaseSelectContextProps>, 'prefixCls' | 'multiple' | 'searchValue' | 'toggleOpen' | 'notFoundContent' | 'direction' | 'open'> */
  @js.native
  trait RawOptionListProps extends StObject {
    
    var direction: js.UndefOr[Any] = js.native
    
    var multiple: js.UndefOr[Any] = js.native
    
    var notFoundContent: js.UndefOr[Any] = js.native
    
    var open: js.UndefOr[Any] = js.native
    
    var prefixCls: js.UndefOr[Any] = js.native
    
    var searchValue: js.UndefOr[Any] = js.native
    
    var toggleOpen: js.UndefOr[Any] = js.native
  }
  object RawOptionListProps {
    
    @scala.inline
    def apply(): RawOptionListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RawOptionListProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: RawOptionListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: Any): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setMultiple(value: Any): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setNotFoundContent(value: Any): Self = StObject.set(x, "notFoundContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotFoundContentUndefined: Self = StObject.set(x, "notFoundContent", js.undefined)
      
      @scala.inline
      def setOpen(value: Any): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: Any): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setSearchValue(value: Any): Self = StObject.set(x, "searchValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchValueUndefined: Self = StObject.set(x, "searchValue", js.undefined)
      
      @scala.inline
      def setToggleOpen(value: Any): Self = StObject.set(x, "toggleOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleOpenUndefined: Self = StObject.set(x, "toggleOpen", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[RawOptionListProps with RefAttributes[RefOptionListProps]]
  
  /* This means you don't have to write `default`, but can instead just say `esOptionListListMod.foo` */
  override def _to: ReactComponentClass[RawOptionListProps with RefAttributes[RefOptionListProps]] = default
}
