package web.typings.antd

import web.typings.antd.anon.AntCls
import web.typings.antd.antdStrings.Tag
import web.typings.antd.esThemeInterfaceMod.GlobalToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.CSSUtil
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTagStyleMod {
  
  @JSImport("antd/es/tag/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/tag/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Tag] = js.native
  
  @scala.inline
  def prepareToken(
    token: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<antd.antd/es/theme/util/genComponentStyleHook.GenStyleFn<'Tag'>>[0] */ js.Any
  ): TagToken = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareToken")(token.asInstanceOf[js.Any]).asInstanceOf[TagToken]
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 默认背景色
      * @descEN Default background color
      */
    var defaultBg: String = js.native
    
    /**
      * @desc 默认文字颜色
      * @descEN Default text color
      */
    var defaultColor: String = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(defaultBg: String, defaultColor: String): ComponentToken = {
      val __obj = js.Dynamic.literal(defaultBg = defaultBg.asInstanceOf[js.Any], defaultColor = defaultColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultBg(value: String): Self = StObject.set(x, "defaultBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultColor(value: String): Self = StObject.set(x, "defaultColor", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped antd.antd/es/theme/interface/components.ComponentTokenMap['Tag'] */ @js.native
  trait TagToken
    extends StObject
       with GlobalToken
       with AntCls
       with CSSUtil {
    
    var tagBorderlessBg: String = js.native
    
    var tagFontSize: Double = js.native
    
    var tagIconSize: Double | String = js.native
    
    var tagLineHeight: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['lineHeight'] */ js.Any = js.native
    
    var tagPaddingHorizontal: Double = js.native
  }
  object TagToken {
    
    @scala.inline
    def apply(
      AntCls: AntCls,
      CSSUtil: CSSUtil,
      tagBorderlessBg: String,
      tagFontSize: Double,
      tagIconSize: Double | String,
      tagLineHeight: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['lineHeight'] */ js.Any,
      tagPaddingHorizontal: Double
    ): TagToken = {
      val __obj = js.Dynamic.literal(tagBorderlessBg = tagBorderlessBg.asInstanceOf[js.Any], tagFontSize = tagFontSize.asInstanceOf[js.Any], tagIconSize = tagIconSize.asInstanceOf[js.Any], tagLineHeight = tagLineHeight.asInstanceOf[js.Any], tagPaddingHorizontal = tagPaddingHorizontal.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, AntCls)
      js.Dynamic.global.Object.assign(__obj, CSSUtil)
      __obj.asInstanceOf[TagToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TagToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTagBorderlessBg(value: String): Self = StObject.set(x, "tagBorderlessBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagFontSize(value: Double): Self = StObject.set(x, "tagFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagIconSize(value: Double | String): Self = StObject.set(x, "tagIconSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagLineHeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['lineHeight'] */ js.Any
      ): Self = StObject.set(x, "tagLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagPaddingHorizontal(value: Double): Self = StObject.set(x, "tagPaddingHorizontal", value.asInstanceOf[js.Any])
    }
  }
}
