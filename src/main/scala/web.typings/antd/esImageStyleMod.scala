package web.typings.antd

import web.typings.antd.anon.AntCls
import web.typings.antd.antdStrings.Image
import web.typings.antd.esThemeInterfaceMod.GenerateStyle
import web.typings.antd.esThemeInterfaceMod.GlobalToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.CSSUtil
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esImageStyleMod {
  
  @JSImport("antd/es/image/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @scala.inline
  def genBoxStyle(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("genBoxStyle")().asInstanceOf[Any]
  @scala.inline
  def genBoxStyle(position: PositionType): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("genBoxStyle")(position.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  def genImageMaskStyle(token: ImageToken): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("genImageMaskStyle")(token.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("antd/es/image/style", "genImagePreviewStyle")
  @js.native
  val genImagePreviewStyle: GenerateStyle[
    ImageToken, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSInterpolation */ Any
  ] = js.native
  
  @scala.inline
  def genPreviewOperationsStyle(token: ImageToken): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("genPreviewOperationsStyle")(token.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  def genPreviewSwitchStyle(token: ImageToken): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("genPreviewSwitchStyle")(token.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("antd/es/image/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Image] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 预览操作图标颜色
      * @descEN Color of preview operation icon
      */
    var previewOperationColor: String = js.native
    
    /**
      * @desc 预览操作图标禁用颜色
      * @descEN Disabled color of preview operation icon
      */
    var previewOperationColorDisabled: String = js.native
    
    /**
      * @desc 预览操作图标悬浮颜色
      * @descEN Color of hovered preview operation icon
      */
    var previewOperationHoverColor: String = js.native
    
    /**
      * @desc 预览操作图标大小
      * @descEN Size of preview operation icon
      */
    var previewOperationSize: Double = js.native
    
    /**
      * @desc 预览浮层 z-index
      * @descEN z-index of preview popup
      */
    var zIndexPopup: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      previewOperationColor: String,
      previewOperationColorDisabled: String,
      previewOperationHoverColor: String,
      previewOperationSize: Double,
      zIndexPopup: Double
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(previewOperationColor = previewOperationColor.asInstanceOf[js.Any], previewOperationColorDisabled = previewOperationColorDisabled.asInstanceOf[js.Any], previewOperationHoverColor = previewOperationHoverColor.asInstanceOf[js.Any], previewOperationSize = previewOperationSize.asInstanceOf[js.Any], zIndexPopup = zIndexPopup.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPreviewOperationColor(value: String): Self = StObject.set(x, "previewOperationColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewOperationColorDisabled(value: String): Self = StObject.set(x, "previewOperationColorDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewOperationHoverColor(value: String): Self = StObject.set(x, "previewOperationHoverColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewOperationSize(value: Double): Self = StObject.set(x, "previewOperationSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexPopup(value: Double): Self = StObject.set(x, "zIndexPopup", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped antd.antd/es/theme/interface/components.ComponentTokenMap['Image'] */ @js.native
  trait ImageToken
    extends StObject
       with GlobalToken
       with AntCls
       with CSSUtil {
    
    var imagePreviewSwitchSize: Double = js.native
    
    var modalMaskBg: String = js.native
    
    var previewCls: String = js.native
  }
  object ImageToken {
    
    @scala.inline
    def apply(
      AntCls: AntCls,
      CSSUtil: CSSUtil,
      imagePreviewSwitchSize: Double,
      modalMaskBg: String,
      previewCls: String
    ): ImageToken = {
      val __obj = js.Dynamic.literal(imagePreviewSwitchSize = imagePreviewSwitchSize.asInstanceOf[js.Any], modalMaskBg = modalMaskBg.asInstanceOf[js.Any], previewCls = previewCls.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, AntCls)
      js.Dynamic.global.Object.assign(__obj, CSSUtil)
      __obj.asInstanceOf[ImageToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ImageToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImagePreviewSwitchSize(value: Double): Self = StObject.set(x, "imagePreviewSwitchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalMaskBg(value: String): Self = StObject.set(x, "modalMaskBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewCls(value: String): Self = StObject.set(x, "previewCls", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.static
    - `web.typings`.antd.antdStrings.relative
    - `web.typings`.antd.antdStrings.fixed
    - `web.typings`.antd.antdStrings.absolute
    - `web.typings`.antd.antdStrings.sticky
    - scala.Unit
  */
  type PositionType = js.UndefOr[_PositionType]
  
  trait _PositionType extends StObject
}
