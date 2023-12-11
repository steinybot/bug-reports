package web.typings.antd

import web.typings.antd.anon.AntCls
import web.typings.antd.antdStrings.Upload
import web.typings.antd.esThemeInterfaceMod.GlobalToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.CSSUtil
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUploadStyleMod {
  
  @JSImport("antd/es/upload/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/upload/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Upload] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 操作按扭颜色
      * @descEN Action button color
      */
    var actionsColor: String = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(actionsColor: String): ComponentToken = {
      val __obj = js.Dynamic.literal(actionsColor = actionsColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionsColor(value: String): Self = StObject.set(x, "actionsColor", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped antd.antd/es/theme/interface/components.ComponentTokenMap['Upload'] */ @js.native
  trait UploadToken
    extends StObject
       with GlobalToken
       with AntCls
       with CSSUtil {
    
    var uploadPicCardSize: Double | String = js.native
    
    var uploadProgressOffset: Double | String = js.native
    
    var uploadThumbnailSize: Double | String = js.native
  }
  object UploadToken {
    
    @scala.inline
    def apply(
      AntCls: AntCls,
      CSSUtil: CSSUtil,
      uploadPicCardSize: Double | String,
      uploadProgressOffset: Double | String,
      uploadThumbnailSize: Double | String
    ): UploadToken = {
      val __obj = js.Dynamic.literal(uploadPicCardSize = uploadPicCardSize.asInstanceOf[js.Any], uploadProgressOffset = uploadProgressOffset.asInstanceOf[js.Any], uploadThumbnailSize = uploadThumbnailSize.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, AntCls)
      js.Dynamic.global.Object.assign(__obj, CSSUtil)
      __obj.asInstanceOf[UploadToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: UploadToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUploadPicCardSize(value: Double | String): Self = StObject.set(x, "uploadPicCardSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadProgressOffset(value: Double | String): Self = StObject.set(x, "uploadProgressOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadThumbnailSize(value: Double | String): Self = StObject.set(x, "uploadThumbnailSize", value.asInstanceOf[js.Any])
    }
  }
}
