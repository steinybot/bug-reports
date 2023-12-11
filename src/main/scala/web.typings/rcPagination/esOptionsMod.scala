package web.typings.rcPagination

import web.typings.rcPagination.anon.Option
import web.typings.rcPagination.anon.PartialInternalSelectProp
import web.typings.rcPagination.esInterfaceMod.PaginationLocale
import web.typings.rcSelect.libSelectMod.DefaultOptionType
import web.typings.rcSelect.libSelectMod.SelectProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esOptionsMod extends Shortcut {
  
  @JSImport("rc-pagination/es/Options", JSImport.Default)
  @js.native
  val default: ReactComponentClass[OptionsProps] = js.native
  
  @js.native
  trait InternalSelectProps
    extends StObject
       with SelectProps[Any, DefaultOptionType] {
    
    /**
      * form antd v5.5.0, popupMatchSelectWidth default is true
      */
    var popupMatchSelectWidth: js.UndefOr[Boolean] = js.native
  }
  object InternalSelectProps {
    
    @scala.inline
    def apply(): InternalSelectProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternalSelectProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: InternalSelectProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPopupMatchSelectWidth(value: Boolean): Self = StObject.set(x, "popupMatchSelectWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupMatchSelectWidthUndefined: Self = StObject.set(x, "popupMatchSelectWidth", js.undefined)
    }
  }
  
  @js.native
  trait OptionsProps extends StObject {
    
    var buildOptionText: js.UndefOr[js.Function1[/* value */ String | Double, String]] = js.native
    
    var changeSize: js.UndefOr[js.Function1[/* size */ Double, Unit]] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var goButton: js.UndefOr[Boolean | String] = js.native
    
    var locale: PaginationLocale = js.native
    
    var pageSize: Double = js.native
    
    var pageSizeOptions: js.UndefOr[js.Array[String | Double]] = js.native
    
    var quickGo: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    var rootPrefixCls: String = js.native
    
    var selectComponentClass: ReactComponentClass[PartialInternalSelectProp] with Option = js.native
    
    var selectPrefixCls: js.UndefOr[String] = js.native
  }
  object OptionsProps {
    
    @scala.inline
    def apply(
      locale: PaginationLocale,
      pageSize: Double,
      rootPrefixCls: String,
      selectComponentClass: ReactComponentClass[PartialInternalSelectProp] with Option
    ): OptionsProps = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], rootPrefixCls = rootPrefixCls.asInstanceOf[js.Any], selectComponentClass = selectComponentClass.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: OptionsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuildOptionText(value: /* value */ String | Double => String): Self = StObject.set(x, "buildOptionText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBuildOptionTextUndefined: Self = StObject.set(x, "buildOptionText", js.undefined)
      
      @scala.inline
      def setChangeSize(value: /* size */ Double => Unit): Self = StObject.set(x, "changeSize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChangeSizeUndefined: Self = StObject.set(x, "changeSize", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setGoButton(value: Boolean | String): Self = StObject.set(x, "goButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoButtonUndefined: Self = StObject.set(x, "goButton", js.undefined)
      
      @scala.inline
      def setLocale(value: PaginationLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeOptions(value: js.Array[String | Double]): Self = StObject.set(x, "pageSizeOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeOptionsUndefined: Self = StObject.set(x, "pageSizeOptions", js.undefined)
      
      @scala.inline
      def setPageSizeOptionsVarargs(value: (String | Double)*): Self = StObject.set(x, "pageSizeOptions", js.Array(value :_*))
      
      @scala.inline
      def setQuickGo(value: /* value */ Double => Unit): Self = StObject.set(x, "quickGo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQuickGoUndefined: Self = StObject.set(x, "quickGo", js.undefined)
      
      @scala.inline
      def setRootPrefixCls(value: String): Self = StObject.set(x, "rootPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectComponentClass(value: ReactComponentClass[PartialInternalSelectProp] with Option): Self = StObject.set(x, "selectComponentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectPrefixCls(value: String): Self = StObject.set(x, "selectPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectPrefixClsUndefined: Self = StObject.set(x, "selectPrefixCls", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[OptionsProps]
  
  /* This means you don't have to write `default`, but can instead just say `esOptionsMod.foo` */
  override def _to: ReactComponentClass[OptionsProps] = default
}
