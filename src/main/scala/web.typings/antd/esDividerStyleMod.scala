package web.typings.antd

import web.typings.antd.antdStrings.Divider
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDividerStyleMod {
  
  @JSImport("antd/es/divider/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/divider/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Divider] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 文本与边缘距离，取值 0 ～ 1
      * @descEN Distance between text and edge, which should be a number between 0 and 1.
      */
    var orientationMargin: Double = js.native
    
    /**
      * @desc 文本横向内间距
      * @descEN Horizontal padding of text
      */
    var textPaddingInline: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingInline'] */ js.Any = js.native
    
    /**
      * @desc 纵向分割线的横向外间距
      * @descEN Horizontal margin of vertical Divider
      */
    var verticalMarginInline: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['marginInline'] */ js.Any = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      orientationMargin: Double,
      textPaddingInline: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingInline'] */ js.Any,
      verticalMarginInline: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['marginInline'] */ js.Any
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(orientationMargin = orientationMargin.asInstanceOf[js.Any], textPaddingInline = textPaddingInline.asInstanceOf[js.Any], verticalMarginInline = verticalMarginInline.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrientationMargin(value: Double): Self = StObject.set(x, "orientationMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextPaddingInline(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingInline'] */ js.Any
      ): Self = StObject.set(x, "textPaddingInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalMarginInline(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['marginInline'] */ js.Any
      ): Self = StObject.set(x, "verticalMarginInline", value.asInstanceOf[js.Any])
    }
  }
}
