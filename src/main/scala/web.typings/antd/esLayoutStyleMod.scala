package web.typings.antd

import web.typings.antd.antdStrings.Layout
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.FullToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLayoutStyleMod {
  
  @JSImport("antd/es/layout/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/layout/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Layout] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 主体部分背景色
      * @descEN Background Color of body
      */
    var bodyBg: String = js.native
    
    /** @deprecated Use bodyBg instead */
    var colorBgBody: String = js.native
    
    /** @deprecated Use headerBg instead */
    var colorBgHeader: String = js.native
    
    /** @deprecated Use triggerBg instead */
    var colorBgTrigger: String = js.native
    
    /**
      * @desc 页脚背景色
      * @descEN Background Color of footer
      */
    var footerBg: String = js.native
    
    /**
      * @desc 页脚内边距
      * @descEN Padding of footer
      */
    var footerPadding: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any = js.native
    
    /**
      * @desc 顶部背景色
      * @descEN Background Color of header
      */
    var headerBg: String = js.native
    
    /**
      * @desc 顶部文字颜色
      * @descEN Text color of header
      */
    var headerColor: String = js.native
    
    /**
      * @desc 顶部高度
      * @descEN Height of header
      */
    var headerHeight: Double = js.native
    
    /**
      * @desc 顶部内边距
      * @descEN Padding of header
      */
    var headerPadding: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any = js.native
    
    /**
      * @desc 亮色主题侧边栏背景色
      * @descEN Background Color of light theme sider
      */
    var lightSiderBg: String = js.native
    
    /**
      * @desc 亮色主题侧边栏开关背景色
      * @descEN Background Color of light theme sider trigger
      */
    var lightTriggerBg: String = js.native
    
    /**
      * @desc 亮色主题侧边栏开关颜色
      * @descEN Color of light theme sider trigger
      */
    var lightTriggerColor: String = js.native
    
    /**
      * @desc 侧边栏背景色
      * @descEN Background Color of sider
      */
    var siderBg: String = js.native
    
    /**
      * @desc 侧边栏开关背景色
      * @descEN Background Color of sider trigger
      */
    var triggerBg: String = js.native
    
    /**
      * @desc 侧边栏开关颜色
      * @descEN Color of sider trigger
      */
    var triggerColor: String = js.native
    
    /**
      * @desc 侧边栏开关高度
      * @descEN Height of sider trigger
      */
    var triggerHeight: Double = js.native
    
    /**
      * @desc collapse 为 0 时侧边栏开关高度
      * @descEN Height of sider trigger when collapse is 0
      */
    var zeroTriggerHeight: Double = js.native
    
    /**
      * @desc collapse 为 0 时侧边栏开关宽度
      * @descEN Width of sider trigger when collapse is 0
      */
    var zeroTriggerWidth: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      bodyBg: String,
      colorBgBody: String,
      colorBgHeader: String,
      colorBgTrigger: String,
      footerBg: String,
      footerPadding: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any,
      headerBg: String,
      headerColor: String,
      headerHeight: Double,
      headerPadding: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any,
      lightSiderBg: String,
      lightTriggerBg: String,
      lightTriggerColor: String,
      siderBg: String,
      triggerBg: String,
      triggerColor: String,
      triggerHeight: Double,
      zeroTriggerHeight: Double,
      zeroTriggerWidth: Double
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(bodyBg = bodyBg.asInstanceOf[js.Any], colorBgBody = colorBgBody.asInstanceOf[js.Any], colorBgHeader = colorBgHeader.asInstanceOf[js.Any], colorBgTrigger = colorBgTrigger.asInstanceOf[js.Any], footerBg = footerBg.asInstanceOf[js.Any], footerPadding = footerPadding.asInstanceOf[js.Any], headerBg = headerBg.asInstanceOf[js.Any], headerColor = headerColor.asInstanceOf[js.Any], headerHeight = headerHeight.asInstanceOf[js.Any], headerPadding = headerPadding.asInstanceOf[js.Any], lightSiderBg = lightSiderBg.asInstanceOf[js.Any], lightTriggerBg = lightTriggerBg.asInstanceOf[js.Any], lightTriggerColor = lightTriggerColor.asInstanceOf[js.Any], siderBg = siderBg.asInstanceOf[js.Any], triggerBg = triggerBg.asInstanceOf[js.Any], triggerColor = triggerColor.asInstanceOf[js.Any], triggerHeight = triggerHeight.asInstanceOf[js.Any], zeroTriggerHeight = zeroTriggerHeight.asInstanceOf[js.Any], zeroTriggerWidth = zeroTriggerWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBodyBg(value: String): Self = StObject.set(x, "bodyBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorBgBody(value: String): Self = StObject.set(x, "colorBgBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorBgHeader(value: String): Self = StObject.set(x, "colorBgHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorBgTrigger(value: String): Self = StObject.set(x, "colorBgTrigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterBg(value: String): Self = StObject.set(x, "footerBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterPadding(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any
      ): Self = StObject.set(x, "footerPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderBg(value: String): Self = StObject.set(x, "headerBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderColor(value: String): Self = StObject.set(x, "headerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderHeight(value: Double): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderPadding(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any
      ): Self = StObject.set(x, "headerPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightSiderBg(value: String): Self = StObject.set(x, "lightSiderBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightTriggerBg(value: String): Self = StObject.set(x, "lightTriggerBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightTriggerColor(value: String): Self = StObject.set(x, "lightTriggerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiderBg(value: String): Self = StObject.set(x, "siderBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerBg(value: String): Self = StObject.set(x, "triggerBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerColor(value: String): Self = StObject.set(x, "triggerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerHeight(value: Double): Self = StObject.set(x, "triggerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZeroTriggerHeight(value: Double): Self = StObject.set(x, "zeroTriggerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZeroTriggerWidth(value: Double): Self = StObject.set(x, "zeroTriggerWidth", value.asInstanceOf[js.Any])
    }
  }
  
  type LayoutToken = FullToken[Layout]
}
