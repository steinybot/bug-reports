package web.typings.antd

import web.typings.antd.anon.AntCls
import web.typings.antd.anon.BorderColor
import web.typings.antd.esThemeInterfaceMod.GlobalToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.CSSUtil
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esColorPickerStyleMod {
  
  @JSImport("antd/es/color-picker/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @scala.inline
  def genActiveStyle(token: ColorPickerToken, borderColor: String, outlineColor: String): BorderColor = (^.asInstanceOf[js.Dynamic].applyDynamic("genActiveStyle")(token.asInstanceOf[js.Any], borderColor.asInstanceOf[js.Any], outlineColor.asInstanceOf[js.Any])).asInstanceOf[BorderColor]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped antd.antd/es/theme/interface/components.ComponentTokenMap['ColorPicker'] */ @js.native
  trait ColorPickerToken
    extends StObject
       with GlobalToken
       with AntCls
       with CSSUtil {
    
    var colorPickerAlphaInputWidth: Double = js.native
    
    var colorPickerHandlerSize: Double = js.native
    
    var colorPickerHandlerSizeSM: Double = js.native
    
    var colorPickerInputNumberHandleWidth: Double = js.native
    
    var colorPickerInsetShadow: String = js.native
    
    var colorPickerPresetColorSize: Double = js.native
    
    var colorPickerPreviewSize: Double = js.native
    
    var colorPickerSliderHeight: Double = js.native
    
    var colorPickerWidth: Double = js.native
  }
  object ColorPickerToken {
    
    @scala.inline
    def apply(
      AntCls: AntCls,
      CSSUtil: CSSUtil,
      colorPickerAlphaInputWidth: Double,
      colorPickerHandlerSize: Double,
      colorPickerHandlerSizeSM: Double,
      colorPickerInputNumberHandleWidth: Double,
      colorPickerInsetShadow: String,
      colorPickerPresetColorSize: Double,
      colorPickerPreviewSize: Double,
      colorPickerSliderHeight: Double,
      colorPickerWidth: Double
    ): ColorPickerToken = {
      val __obj = js.Dynamic.literal(colorPickerAlphaInputWidth = colorPickerAlphaInputWidth.asInstanceOf[js.Any], colorPickerHandlerSize = colorPickerHandlerSize.asInstanceOf[js.Any], colorPickerHandlerSizeSM = colorPickerHandlerSizeSM.asInstanceOf[js.Any], colorPickerInputNumberHandleWidth = colorPickerInputNumberHandleWidth.asInstanceOf[js.Any], colorPickerInsetShadow = colorPickerInsetShadow.asInstanceOf[js.Any], colorPickerPresetColorSize = colorPickerPresetColorSize.asInstanceOf[js.Any], colorPickerPreviewSize = colorPickerPreviewSize.asInstanceOf[js.Any], colorPickerSliderHeight = colorPickerSliderHeight.asInstanceOf[js.Any], colorPickerWidth = colorPickerWidth.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, AntCls)
      js.Dynamic.global.Object.assign(__obj, CSSUtil)
      __obj.asInstanceOf[ColorPickerToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ColorPickerToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColorPickerAlphaInputWidth(value: Double): Self = StObject.set(x, "colorPickerAlphaInputWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPickerHandlerSize(value: Double): Self = StObject.set(x, "colorPickerHandlerSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPickerHandlerSizeSM(value: Double): Self = StObject.set(x, "colorPickerHandlerSizeSM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPickerInputNumberHandleWidth(value: Double): Self = StObject.set(x, "colorPickerInputNumberHandleWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPickerInsetShadow(value: String): Self = StObject.set(x, "colorPickerInsetShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPickerPresetColorSize(value: Double): Self = StObject.set(x, "colorPickerPresetColorSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPickerPreviewSize(value: Double): Self = StObject.set(x, "colorPickerPreviewSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPickerSliderHeight(value: Double): Self = StObject.set(x, "colorPickerSliderHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPickerWidth(value: Double): Self = StObject.set(x, "colorPickerWidth", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ComponentToken extends StObject
}
