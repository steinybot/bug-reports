package web.typings.antd

import web.typings.antd.anon.AntCls
import web.typings.antd.antdStrings.Select
import web.typings.antd.esThemeInterfaceMod.GlobalToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.CSSUtil
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSelectStyleMod {
  
  @JSImport("antd/es/select/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/select/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Select] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 清空按钮背景色
      * @descEN Background color of clear button
      */
    var clearBg: String = js.native
    
    /**
      * @desc 多选标签背景色
      * @descEN Background color of multiple tag
      */
    var multipleItemBg: String = js.native
    
    /**
      * @desc 多选标签边框色
      * @descEN Border color of multiple tag
      */
    var multipleItemBorderColor: String = js.native
    
    /**
      * @desc 多选标签禁用边框色
      * @descEN Border color of multiple tag when disabled
      */
    var multipleItemBorderColorDisabled: String = js.native
    
    /**
      * @desc 多选标签禁用文本颜色
      * @descEN Text color of multiple tag when disabled
      */
    var multipleItemColorDisabled: String = js.native
    
    /**
      * @desc 多选标签高度
      * @descEN Height of multiple tag
      */
    var multipleItemHeight: Double = js.native
    
    /**
      * @desc 大号多选标签高度
      * @descEN Height of multiple tag with large size
      */
    var multipleItemHeightLG: Double = js.native
    
    /**
      * @desc 多选框禁用背景
      * @descEN Background color of multiple selector when disabled
      */
    var multipleSelectorBgDisabled: String = js.native
    
    /**
      * @desc 选项激活态时背景色
      * @descEN Background color when option is active
      */
    var optionActiveBg: String = js.native
    
    /**
      * @desc 选项字体大小
      * @descEN Font size of option
      */
    var optionFontSize: Double = js.native
    
    /**
      * @desc 选项高度
      * @descEN Height of option
      */
    var optionHeight: Double = js.native
    
    /**
      * @desc 选项行高
      * @descEN Line height of option
      */
    var optionLineHeight: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['lineHeight'] */ js.Any = js.native
    
    /**
      * @desc 选项内间距
      * @descEN Padding of option
      */
    var optionPadding: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any = js.native
    
    /**
      * @desc 选项选中时背景色
      * @descEN Background color when option is selected
      */
    var optionSelectedBg: String = js.native
    
    /**
      * @desc 选项选中时文本颜色
      * @descEN Text color when option is selected
      */
    var optionSelectedColor: String = js.native
    
    /**
      * @desc 选项选中时文本字重
      * @descEN Font weight when option is selected
      */
    var optionSelectedFontWeight: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['fontWeight'] */ js.Any = js.native
    
    /**
      * @desc 选框背景色
      * @descEN Background color of selector
      */
    var selectorBg: String = js.native
    
    /**
      * @desc 单选大号回填项高度
      * @descEN Height of single selected item with large size
      */
    var singleItemHeightLG: Double = js.native
    
    /**
      * @desc 下拉菜单 z-index
      * @descEN z-index of dropdown
      */
    var zIndexPopup: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      clearBg: String,
      multipleItemBg: String,
      multipleItemBorderColor: String,
      multipleItemBorderColorDisabled: String,
      multipleItemColorDisabled: String,
      multipleItemHeight: Double,
      multipleItemHeightLG: Double,
      multipleSelectorBgDisabled: String,
      optionActiveBg: String,
      optionFontSize: Double,
      optionHeight: Double,
      optionLineHeight: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['lineHeight'] */ js.Any,
      optionPadding: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any,
      optionSelectedBg: String,
      optionSelectedColor: String,
      optionSelectedFontWeight: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['fontWeight'] */ js.Any,
      selectorBg: String,
      singleItemHeightLG: Double,
      zIndexPopup: Double
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(clearBg = clearBg.asInstanceOf[js.Any], multipleItemBg = multipleItemBg.asInstanceOf[js.Any], multipleItemBorderColor = multipleItemBorderColor.asInstanceOf[js.Any], multipleItemBorderColorDisabled = multipleItemBorderColorDisabled.asInstanceOf[js.Any], multipleItemColorDisabled = multipleItemColorDisabled.asInstanceOf[js.Any], multipleItemHeight = multipleItemHeight.asInstanceOf[js.Any], multipleItemHeightLG = multipleItemHeightLG.asInstanceOf[js.Any], multipleSelectorBgDisabled = multipleSelectorBgDisabled.asInstanceOf[js.Any], optionActiveBg = optionActiveBg.asInstanceOf[js.Any], optionFontSize = optionFontSize.asInstanceOf[js.Any], optionHeight = optionHeight.asInstanceOf[js.Any], optionLineHeight = optionLineHeight.asInstanceOf[js.Any], optionPadding = optionPadding.asInstanceOf[js.Any], optionSelectedBg = optionSelectedBg.asInstanceOf[js.Any], optionSelectedColor = optionSelectedColor.asInstanceOf[js.Any], optionSelectedFontWeight = optionSelectedFontWeight.asInstanceOf[js.Any], selectorBg = selectorBg.asInstanceOf[js.Any], singleItemHeightLG = singleItemHeightLG.asInstanceOf[js.Any], zIndexPopup = zIndexPopup.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearBg(value: String): Self = StObject.set(x, "clearBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleItemBg(value: String): Self = StObject.set(x, "multipleItemBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleItemBorderColor(value: String): Self = StObject.set(x, "multipleItemBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleItemBorderColorDisabled(value: String): Self = StObject.set(x, "multipleItemBorderColorDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleItemColorDisabled(value: String): Self = StObject.set(x, "multipleItemColorDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleItemHeight(value: Double): Self = StObject.set(x, "multipleItemHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleItemHeightLG(value: Double): Self = StObject.set(x, "multipleItemHeightLG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleSelectorBgDisabled(value: String): Self = StObject.set(x, "multipleSelectorBgDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionActiveBg(value: String): Self = StObject.set(x, "optionActiveBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionFontSize(value: Double): Self = StObject.set(x, "optionFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionHeight(value: Double): Self = StObject.set(x, "optionHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionLineHeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['lineHeight'] */ js.Any
      ): Self = StObject.set(x, "optionLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionPadding(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any
      ): Self = StObject.set(x, "optionPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionSelectedBg(value: String): Self = StObject.set(x, "optionSelectedBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionSelectedColor(value: String): Self = StObject.set(x, "optionSelectedColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionSelectedFontWeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['fontWeight'] */ js.Any
      ): Self = StObject.set(x, "optionSelectedFontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorBg(value: String): Self = StObject.set(x, "selectorBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleItemHeightLG(value: Double): Self = StObject.set(x, "singleItemHeightLG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexPopup(value: Double): Self = StObject.set(x, "zIndexPopup", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped antd.antd/es/theme/interface/components.ComponentTokenMap['Select'] */ @js.native
  trait SelectToken
    extends StObject
       with GlobalToken
       with AntCls
       with CSSUtil {
    
    var inputPaddingHorizontalBase: Double | String = js.native
    
    var multipleSelectItemHeight: Double = js.native
    
    var rootPrefixCls: String = js.native
    
    var selectHeight: Double = js.native
  }
  object SelectToken {
    
    @scala.inline
    def apply(
      AntCls: AntCls,
      CSSUtil: CSSUtil,
      inputPaddingHorizontalBase: Double | String,
      multipleSelectItemHeight: Double,
      rootPrefixCls: String,
      selectHeight: Double
    ): SelectToken = {
      val __obj = js.Dynamic.literal(inputPaddingHorizontalBase = inputPaddingHorizontalBase.asInstanceOf[js.Any], multipleSelectItemHeight = multipleSelectItemHeight.asInstanceOf[js.Any], rootPrefixCls = rootPrefixCls.asInstanceOf[js.Any], selectHeight = selectHeight.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, AntCls)
      js.Dynamic.global.Object.assign(__obj, CSSUtil)
      __obj.asInstanceOf[SelectToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SelectToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInputPaddingHorizontalBase(value: Double | String): Self = StObject.set(x, "inputPaddingHorizontalBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleSelectItemHeight(value: Double): Self = StObject.set(x, "multipleSelectItemHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootPrefixCls(value: String): Self = StObject.set(x, "rootPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectHeight(value: Double): Self = StObject.set(x, "selectHeight", value.asInstanceOf[js.Any])
    }
  }
}
