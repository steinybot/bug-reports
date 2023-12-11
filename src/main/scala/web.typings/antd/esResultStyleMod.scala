package web.typings.antd

import web.typings.antd.antdStrings.Result
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esResultStyleMod {
  
  @JSImport("antd/es/result/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/result/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Result] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 额外区域外间距
      * @descEN Margin of extra area
      */
    var extraMargin: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['margin'] */ js.Any = js.native
    
    /**
      * @desc 图标大小
      * @descEN Icon size
      */
    var iconFontSize: Double = js.native
    
    /**
      * @desc 副标题字体大小
      * @descEN Subtitle font size
      */
    var subtitleFontSize: Double = js.native
    
    /**
      * @desc 标题字体大小
      * @descEN Title font size
      */
    var titleFontSize: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      extraMargin: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['margin'] */ js.Any,
      iconFontSize: Double,
      subtitleFontSize: Double,
      titleFontSize: Double
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(extraMargin = extraMargin.asInstanceOf[js.Any], iconFontSize = iconFontSize.asInstanceOf[js.Any], subtitleFontSize = subtitleFontSize.asInstanceOf[js.Any], titleFontSize = titleFontSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtraMargin(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['margin'] */ js.Any
      ): Self = StObject.set(x, "extraMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFontSize(value: Double): Self = StObject.set(x, "iconFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleFontSize(value: Double): Self = StObject.set(x, "subtitleFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontSize(value: Double): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
    }
  }
}
