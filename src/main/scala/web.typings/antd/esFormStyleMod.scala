package web.typings.antd

import web.typings.antd.anon.AntCls
import web.typings.antd.antdStrings.Form
import web.typings.antd.esThemeInterfaceMod.GlobalToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.CSSUtil
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esFormStyleMod {
  
  @JSImport("antd/es/form/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/form/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Form] = js.native
  
  @scala.inline
  def prepareToken(
    token: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<antd.antd/es/theme/util/genComponentStyleHook.GenStyleFn<'Form'>>[0] */ js.Any,
    rootPrefixCls: String
  ): FormToken = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareToken")(token.asInstanceOf[js.Any], rootPrefixCls.asInstanceOf[js.Any])).asInstanceOf[FormToken]
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 表单项间距
      * @descEN Form item margin bottom
      */
    var itemMarginBottom: Double = js.native
    
    /**
      * @desc 标签冒号后间距
      * @descEN Label colon margin-inline-end
      */
    var labelColonMarginInlineEnd: Double = js.native
    
    /**
      * @desc 标签冒号前间距
      * @descEN Label colon margin-inline-start
      */
    var labelColonMarginInlineStart: Double = js.native
    
    /**
      * @desc 标签颜色
      * @descEN Label color
      */
    var labelColor: String = js.native
    
    /**
      * @desc 标签字体大小
      * @descEN Label font size
      */
    var labelFontSize: Double = js.native
    
    /**
      * @desc 标签高度
      * @descEN Label height
      */
    var labelHeight: Double = js.native
    
    /**
      * @desc 必填项标记颜色
      * @descEN Required mark color
      */
    var labelRequiredMarkColor: String = js.native
    
    /**
      * @desc 垂直布局标签外边距
      * @descEN Vertical layout label margin
      */
    var verticalLabelMargin: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['margin'] */ js.Any = js.native
    
    /**
      * @desc 垂直布局标签内边距
      * @descEN Vertical layout label padding
      */
    var verticalLabelPadding: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      itemMarginBottom: Double,
      labelColonMarginInlineEnd: Double,
      labelColonMarginInlineStart: Double,
      labelColor: String,
      labelFontSize: Double,
      labelHeight: Double,
      labelRequiredMarkColor: String,
      verticalLabelMargin: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['margin'] */ js.Any,
      verticalLabelPadding: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(itemMarginBottom = itemMarginBottom.asInstanceOf[js.Any], labelColonMarginInlineEnd = labelColonMarginInlineEnd.asInstanceOf[js.Any], labelColonMarginInlineStart = labelColonMarginInlineStart.asInstanceOf[js.Any], labelColor = labelColor.asInstanceOf[js.Any], labelFontSize = labelFontSize.asInstanceOf[js.Any], labelHeight = labelHeight.asInstanceOf[js.Any], labelRequiredMarkColor = labelRequiredMarkColor.asInstanceOf[js.Any], verticalLabelMargin = verticalLabelMargin.asInstanceOf[js.Any], verticalLabelPadding = verticalLabelPadding.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItemMarginBottom(value: Double): Self = StObject.set(x, "itemMarginBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelColonMarginInlineEnd(value: Double): Self = StObject.set(x, "labelColonMarginInlineEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelColonMarginInlineStart(value: Double): Self = StObject.set(x, "labelColonMarginInlineStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelColor(value: String): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFontSize(value: Double): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelHeight(value: Double): Self = StObject.set(x, "labelHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelRequiredMarkColor(value: String): Self = StObject.set(x, "labelRequiredMarkColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalLabelMargin(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['margin'] */ js.Any
      ): Self = StObject.set(x, "verticalLabelMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalLabelPadding(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any
      ): Self = StObject.set(x, "verticalLabelPadding", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped antd.antd/es/theme/interface/components.ComponentTokenMap['Form'] */ @js.native
  trait FormToken
    extends StObject
       with GlobalToken
       with AntCls
       with CSSUtil {
    
    var formItemCls: String = js.native
    
    var rootPrefixCls: String = js.native
  }
  object FormToken {
    
    @scala.inline
    def apply(AntCls: AntCls, CSSUtil: CSSUtil, formItemCls: String, rootPrefixCls: String): FormToken = {
      val __obj = js.Dynamic.literal(formItemCls = formItemCls.asInstanceOf[js.Any], rootPrefixCls = rootPrefixCls.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, AntCls)
      js.Dynamic.global.Object.assign(__obj, CSSUtil)
      __obj.asInstanceOf[FormToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FormToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormItemCls(value: String): Self = StObject.set(x, "formItemCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootPrefixCls(value: String): Self = StObject.set(x, "rootPrefixCls", value.asInstanceOf[js.Any])
    }
  }
}
