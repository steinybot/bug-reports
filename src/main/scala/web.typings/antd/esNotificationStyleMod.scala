package web.typings.antd

import web.typings.antd.anon.AntCls
import web.typings.antd.anon.CloseBtnHoverBg
import web.typings.antd.esThemeInterfaceAliasMod.AliasToken
import web.typings.antd.esThemeInterfaceMod.GlobalToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.CSSUtil
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esNotificationStyleMod {
  
  @JSImport("antd/es/notification/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @scala.inline
  def genNoticeStyle(token: NotificationToken): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("genNoticeStyle")(token.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  def prepareComponentToken(token: AliasToken): CloseBtnHoverBg = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareComponentToken")(token.asInstanceOf[js.Any]).asInstanceOf[CloseBtnHoverBg]
  
  @scala.inline
  def prepareNotificationToken(
    token: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<antd.antd/es/theme/util/genComponentStyleHook.GenStyleFn<'Notification'>>[0] */ js.Any
  ): NotificationToken = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareNotificationToken")(token.asInstanceOf[js.Any]).asInstanceOf[NotificationToken]
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 提醒框宽度
      * @descEN Width of Notification
      */
    var width: Double = js.native
    
    /**
      * @desc 提醒框 z-index
      * @descEN z-index of Notification
      */
    var zIndexPopup: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(width: Double, zIndexPopup: Double): ComponentToken = {
      val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any], zIndexPopup = zIndexPopup.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexPopup(value: Double): Self = StObject.set(x, "zIndexPopup", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped antd.antd/es/theme/interface/components.ComponentTokenMap['Notification'] */ @js.native
  trait NotificationToken
    extends StObject
       with GlobalToken
       with AntCls
       with CSSUtil {
    
    var animationMaxHeight: Double = js.native
    
    var notificationBg: String = js.native
    
    var notificationCloseButtonSize: Double | String = js.native
    
    var notificationIconSize: Double | String = js.native
    
    var notificationMarginBottom: Double = js.native
    
    var notificationMarginEdge: Double = js.native
    
    var notificationPadding: String = js.native
    
    var notificationPaddingHorizontal: Double = js.native
    
    var notificationPaddingVertical: Double = js.native
    
    var notificationStackLayer: Double = js.native
  }
  object NotificationToken {
    
    @scala.inline
    def apply(
      AntCls: AntCls,
      CSSUtil: CSSUtil,
      animationMaxHeight: Double,
      notificationBg: String,
      notificationCloseButtonSize: Double | String,
      notificationIconSize: Double | String,
      notificationMarginBottom: Double,
      notificationMarginEdge: Double,
      notificationPadding: String,
      notificationPaddingHorizontal: Double,
      notificationPaddingVertical: Double,
      notificationStackLayer: Double
    ): NotificationToken = {
      val __obj = js.Dynamic.literal(animationMaxHeight = animationMaxHeight.asInstanceOf[js.Any], notificationBg = notificationBg.asInstanceOf[js.Any], notificationCloseButtonSize = notificationCloseButtonSize.asInstanceOf[js.Any], notificationIconSize = notificationIconSize.asInstanceOf[js.Any], notificationMarginBottom = notificationMarginBottom.asInstanceOf[js.Any], notificationMarginEdge = notificationMarginEdge.asInstanceOf[js.Any], notificationPadding = notificationPadding.asInstanceOf[js.Any], notificationPaddingHorizontal = notificationPaddingHorizontal.asInstanceOf[js.Any], notificationPaddingVertical = notificationPaddingVertical.asInstanceOf[js.Any], notificationStackLayer = notificationStackLayer.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, AntCls)
      js.Dynamic.global.Object.assign(__obj, CSSUtil)
      __obj.asInstanceOf[NotificationToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: NotificationToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationMaxHeight(value: Double): Self = StObject.set(x, "animationMaxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationBg(value: String): Self = StObject.set(x, "notificationBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationCloseButtonSize(value: Double | String): Self = StObject.set(x, "notificationCloseButtonSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationIconSize(value: Double | String): Self = StObject.set(x, "notificationIconSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationMarginBottom(value: Double): Self = StObject.set(x, "notificationMarginBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationMarginEdge(value: Double): Self = StObject.set(x, "notificationMarginEdge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationPadding(value: String): Self = StObject.set(x, "notificationPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationPaddingHorizontal(value: Double): Self = StObject.set(x, "notificationPaddingHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationPaddingVertical(value: Double): Self = StObject.set(x, "notificationPaddingVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationStackLayer(value: Double): Self = StObject.set(x, "notificationStackLayer", value.asInstanceOf[js.Any])
    }
  }
}
