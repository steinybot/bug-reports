package web.typings.antd

import web.typings.antd.anon.AntCls
import web.typings.antd.anon.BodyPadding
import web.typings.antd.esThemeInterfaceAliasMod.AliasToken
import web.typings.antd.esThemeInterfaceMod.GenerateStyle
import web.typings.antd.esThemeInterfaceMod.GlobalToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.CSSUtil
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.TokenWithCommonCls
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esModalStyleMod {
  
  @JSImport("antd/es/modal/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/modal/style", "genModalMaskStyle")
  @js.native
  val genModalMaskStyle: GenerateStyle[
    TokenWithCommonCls[AliasToken], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSInterpolation */ Any
  ] = js.native
  
  @scala.inline
  def prepareComponentToken(token: GlobalToken): BodyPadding = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareComponentToken")(token.asInstanceOf[js.Any]).asInstanceOf[BodyPadding]
  
  @scala.inline
  def prepareToken(
    token: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<antd.antd/es/theme/util/genComponentStyleHook.GenStyleFn<'Modal'>>[0] */ js.Any
  ): ModalToken = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareToken")(token.asInstanceOf[js.Any]).asInstanceOf[ModalToken]
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 内容区域背景色
      * @descEN Background color of content
      */
    var contentBg: String = js.native
    
    /**
      * @desc 底部区域背景色
      * @descEN Background color of footer
      */
    var footerBg: String = js.native
    
    /**
      * @desc 顶部背景色
      * @descEN Background color of header
      */
    var headerBg: String = js.native
    
    /**
      * @desc 标题字体颜色
      * @descEN Font color of title
      */
    var titleColor: String = js.native
    
    /**
      * @desc 标题字体大小
      * @descEN Font size of title
      */
    var titleFontSize: Double = js.native
    
    /**
      * @desc 标题行高
      * @descEN Line height of title
      */
    var titleLineHeight: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      contentBg: String,
      footerBg: String,
      headerBg: String,
      titleColor: String,
      titleFontSize: Double,
      titleLineHeight: Double
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(contentBg = contentBg.asInstanceOf[js.Any], footerBg = footerBg.asInstanceOf[js.Any], headerBg = headerBg.asInstanceOf[js.Any], titleColor = titleColor.asInstanceOf[js.Any], titleFontSize = titleFontSize.asInstanceOf[js.Any], titleLineHeight = titleLineHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentBg(value: String): Self = StObject.set(x, "contentBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterBg(value: String): Self = StObject.set(x, "footerBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderBg(value: String): Self = StObject.set(x, "headerBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleColor(value: String): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontSize(value: Double): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleLineHeight(value: Double): Self = StObject.set(x, "titleLineHeight", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped antd.antd/es/theme/interface/components.ComponentTokenMap['Modal'] */ @js.native
  trait ModalToken
    extends StObject
       with GlobalToken
       with AntCls
       with CSSUtil {
    
    var modalCloseBtnSize: Double | String = js.native
    
    var modalCloseIconColor: String = js.native
    
    var modalConfirmIconSize: Double | String = js.native
    
    var modalFooterBorderColorSplit: String = js.native
    
    var modalFooterBorderStyle: String = js.native
    
    var modalFooterBorderWidth: Double = js.native
    
    var modalHeaderHeight: Double | String = js.native
    
    var modalIconHoverColor: String = js.native
    
    var modalTitleHeight: Double | String = js.native
  }
  object ModalToken {
    
    @scala.inline
    def apply(
      AntCls: AntCls,
      CSSUtil: CSSUtil,
      modalCloseBtnSize: Double | String,
      modalCloseIconColor: String,
      modalConfirmIconSize: Double | String,
      modalFooterBorderColorSplit: String,
      modalFooterBorderStyle: String,
      modalFooterBorderWidth: Double,
      modalHeaderHeight: Double | String,
      modalIconHoverColor: String,
      modalTitleHeight: Double | String
    ): ModalToken = {
      val __obj = js.Dynamic.literal(modalCloseBtnSize = modalCloseBtnSize.asInstanceOf[js.Any], modalCloseIconColor = modalCloseIconColor.asInstanceOf[js.Any], modalConfirmIconSize = modalConfirmIconSize.asInstanceOf[js.Any], modalFooterBorderColorSplit = modalFooterBorderColorSplit.asInstanceOf[js.Any], modalFooterBorderStyle = modalFooterBorderStyle.asInstanceOf[js.Any], modalFooterBorderWidth = modalFooterBorderWidth.asInstanceOf[js.Any], modalHeaderHeight = modalHeaderHeight.asInstanceOf[js.Any], modalIconHoverColor = modalIconHoverColor.asInstanceOf[js.Any], modalTitleHeight = modalTitleHeight.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, AntCls)
      js.Dynamic.global.Object.assign(__obj, CSSUtil)
      __obj.asInstanceOf[ModalToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ModalToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModalCloseBtnSize(value: Double | String): Self = StObject.set(x, "modalCloseBtnSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalCloseIconColor(value: String): Self = StObject.set(x, "modalCloseIconColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalConfirmIconSize(value: Double | String): Self = StObject.set(x, "modalConfirmIconSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalFooterBorderColorSplit(value: String): Self = StObject.set(x, "modalFooterBorderColorSplit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalFooterBorderStyle(value: String): Self = StObject.set(x, "modalFooterBorderStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalFooterBorderWidth(value: Double): Self = StObject.set(x, "modalFooterBorderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalHeaderHeight(value: Double | String): Self = StObject.set(x, "modalHeaderHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalIconHoverColor(value: String): Self = StObject.set(x, "modalIconHoverColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalTitleHeight(value: Double | String): Self = StObject.set(x, "modalTitleHeight", value.asInstanceOf[js.Any])
    }
  }
}
