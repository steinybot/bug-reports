package web.typings.rcPicker

import web.typings.rcPicker.anon.Label
import web.typings.rcPicker.esInterfaceMod.Components
import web.typings.rcPicker.esInterfaceMod.Locale
import web.typings.rcPicker.esInterfaceMod.RangeList
import web.typings.rcPicker.rcPickerBooleans.`false`
import web.typings.react.mod.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsGetRangesMod {
  
  @JSImport("rc-picker/es/utils/getRanges", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(param0: RangesProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait RangesProps extends StObject {
    
    var components: js.UndefOr[Components] = js.native
    
    var locale: Locale = js.native
    
    var needConfirmButton: Boolean = js.native
    
    var okDisabled: js.UndefOr[Boolean] = js.native
    
    var onNow: js.UndefOr[Null | js.Function0[Unit] | `false`] = js.native
    
    var onOk: js.UndefOr[Null | js.Function0[Unit] | `false`] = js.native
    
    var prefixCls: String = js.native
    
    var rangeList: js.UndefOr[RangeList] = js.native
    
    var showNow: js.UndefOr[Boolean] = js.native
  }
  object RangesProps {
    
    @scala.inline
    def apply(locale: Locale, needConfirmButton: Boolean, prefixCls: String): RangesProps = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], needConfirmButton = needConfirmButton.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangesProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: RangesProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponents(value: Components): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeedConfirmButton(value: Boolean): Self = StObject.set(x, "needConfirmButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkDisabled(value: Boolean): Self = StObject.set(x, "okDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkDisabledUndefined: Self = StObject.set(x, "okDisabled", js.undefined)
      
      @scala.inline
      def setOnNow(value: js.Function0[Unit] | `false`): Self = StObject.set(x, "onNow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnNowFunction0(value: () => Unit): Self = StObject.set(x, "onNow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnNowNull: Self = StObject.set(x, "onNow", null)
      
      @scala.inline
      def setOnNowUndefined: Self = StObject.set(x, "onNow", js.undefined)
      
      @scala.inline
      def setOnOk(value: js.Function0[Unit] | `false`): Self = StObject.set(x, "onOk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnOkFunction0(value: () => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOkNull: Self = StObject.set(x, "onOk", null)
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeList(value: RangeList): Self = StObject.set(x, "rangeList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeListUndefined: Self = StObject.set(x, "rangeList", js.undefined)
      
      @scala.inline
      def setRangeListVarargs(value: Label*): Self = StObject.set(x, "rangeList", js.Array(value :_*))
      
      @scala.inline
      def setShowNow(value: Boolean): Self = StObject.set(x, "showNow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNowUndefined: Self = StObject.set(x, "showNow", js.undefined)
    }
  }
}
