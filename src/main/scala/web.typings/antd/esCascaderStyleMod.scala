package web.typings.antd

import web.typings.antd.anon.ControlItemWidth
import web.typings.antd.antdStrings.Cascader
import web.typings.antd.esThemeInterfaceMod.GlobalToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.FullToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esCascaderStyleMod {
  
  @JSImport("antd/es/cascader/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @scala.inline
  def prepareComponentToken(token: GlobalToken): ControlItemWidth = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareComponentToken")(token.asInstanceOf[js.Any]).asInstanceOf[ControlItemWidth]
  
  type CascaderToken = FullToken[Cascader]
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 选项宽度
      * @descEN Width of item
      */
    var controlItemWidth: Double = js.native
    
    /**
      * @desc 选择器宽度
      * @descEN Width of Cascader
      */
    var controlWidth: Double = js.native
    
    /**
      * @desc 下拉菜单高度
      * @descEN Height of dropdown
      */
    var dropdownHeight: Double = js.native
    
    /**
      * @desc 选项菜单（单列）内间距
      * @descEN Padding of menu item (single column)
      */
    var menuPadding: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any = js.native
    
    /**
      * @desc 选项内间距
      * @descEN Padding of menu item
      */
    var optionPadding: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any = js.native
    
    /**
      * @desc 选项选中时背景色
      * @descEN Background color of selected item
      */
    var optionSelectedBg: String = js.native
    
    /**
      * @desc 选项选中时字重
      * @descEN Font weight of selected item
      */
    var optionSelectedFontWeight: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['fontWeight'] */ js.Any = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      controlItemWidth: Double,
      controlWidth: Double,
      dropdownHeight: Double,
      menuPadding: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any,
      optionPadding: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any,
      optionSelectedBg: String,
      optionSelectedFontWeight: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['fontWeight'] */ js.Any
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(controlItemWidth = controlItemWidth.asInstanceOf[js.Any], controlWidth = controlWidth.asInstanceOf[js.Any], dropdownHeight = dropdownHeight.asInstanceOf[js.Any], menuPadding = menuPadding.asInstanceOf[js.Any], optionPadding = optionPadding.asInstanceOf[js.Any], optionSelectedBg = optionSelectedBg.asInstanceOf[js.Any], optionSelectedFontWeight = optionSelectedFontWeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setControlItemWidth(value: Double): Self = StObject.set(x, "controlItemWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlWidth(value: Double): Self = StObject.set(x, "controlWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownHeight(value: Double): Self = StObject.set(x, "dropdownHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuPadding(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any
      ): Self = StObject.set(x, "menuPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionPadding(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any
      ): Self = StObject.set(x, "optionPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionSelectedBg(value: String): Self = StObject.set(x, "optionSelectedBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionSelectedFontWeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['fontWeight'] */ js.Any
      ): Self = StObject.set(x, "optionSelectedFontWeight", value.asInstanceOf[js.Any])
    }
  }
}
