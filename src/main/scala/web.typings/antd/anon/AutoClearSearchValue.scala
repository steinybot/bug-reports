package web.typings.antd.anon

import web.typings.antd.esConfigProviderSizeContextMod.SizeType
import web.typings.antd.esUtilMotionMod.SelectCommonPlacement
import web.typings.antd.esUtilStatusUtilsMod.InputStatus
import web.typings.rcCascader.esCascaderMod.BaseOptionType
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoClearSearchValue[DataNodeType /* <: BaseOptionType */] extends StObject {
  
  var autoClearSearchValue: js.UndefOr[Boolean] = js.native
  
  var bordered: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  /** @deprecated Please use `popupClassName` instead */
  var dropdownClassName: js.UndefOr[String] = js.native
  
  var multiple: js.UndefOr[Boolean] = js.native
  
  var options: js.UndefOr[js.Array[DataNodeType]] = js.native
  
  var placement: js.UndefOr[SelectCommonPlacement] = js.native
  
  var popupClassName: js.UndefOr[String] = js.native
  
  var rootClassName: js.UndefOr[String] = js.native
  
  /**
    * @deprecated `showArrow` is deprecated which will be removed in next major version. It will be a
    *   default behavior, you can hide it by setting `suffixIcon` to null.
    */
  var showArrow: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[SizeType] = js.native
  
  var status: js.UndefOr[InputStatus] = js.native
  
  var suffixIcon: js.UndefOr[ReactElement] = js.native
}
object AutoClearSearchValue {
  
  @scala.inline
  def apply[DataNodeType /* <: BaseOptionType */](): AutoClearSearchValue[DataNodeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoClearSearchValue[DataNodeType]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: AutoClearSearchValue[_], DataNodeType /* <: BaseOptionType */] (val x: Self with AutoClearSearchValue[DataNodeType]) extends AnyVal {
    
    @scala.inline
    def setAutoClearSearchValue(value: Boolean): Self = StObject.set(x, "autoClearSearchValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoClearSearchValueUndefined: Self = StObject.set(x, "autoClearSearchValue", js.undefined)
    
    @scala.inline
    def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDropdownClassName(value: String): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdownClassNameUndefined: Self = StObject.set(x, "dropdownClassName", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Array[DataNodeType]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: DataNodeType*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setPlacement(value: SelectCommonPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
    
    @scala.inline
    def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
    
    @scala.inline
    def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
    
    @scala.inline
    def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStatus(value: InputStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSuffixIcon(value: ReactElement): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
  }
}
