package web.typings.rcNotification

import web.typings.rcMotion.esCssmotionMod.CSSMotionProps
import web.typings.rcNotification.esInterfaceMod.OpenConfig
import web.typings.rcNotification.esInterfaceMod.Placement
import web.typings.rcNotification.esInterfaceMod.StackConfig
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.Key
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esNoticeListMod extends Shortcut {
  
  @JSImport("rc-notification/es/NoticeList", JSImport.Default)
  @js.native
  val default: ReactComponentClass[NoticeListProps] = js.native
  
  @js.native
  trait NoticeListProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var configList: js.UndefOr[js.Array[OpenConfig]] = js.native
    
    var motion: js.UndefOr[CSSMotionProps | (js.Function1[/* placement */ Placement, CSSMotionProps])] = js.native
    
    var onAllNoticeRemoved: js.UndefOr[js.Function1[/* placement */ Placement, Unit]] = js.native
    
    var onNoticeClose: js.UndefOr[js.Function1[/* key */ Key, Unit]] = js.native
    
    var placement: js.UndefOr[Placement] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var stack: js.UndefOr[StackConfig] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object NoticeListProps {
    
    @scala.inline
    def apply(): NoticeListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoticeListProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: NoticeListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setConfigList(value: js.Array[OpenConfig]): Self = StObject.set(x, "configList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigListUndefined: Self = StObject.set(x, "configList", js.undefined)
      
      @scala.inline
      def setConfigListVarargs(value: OpenConfig*): Self = StObject.set(x, "configList", js.Array(value :_*))
      
      @scala.inline
      def setMotion(value: CSSMotionProps | (js.Function1[/* placement */ Placement, CSSMotionProps])): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionFunction1(value: /* placement */ Placement => CSSMotionProps): Self = StObject.set(x, "motion", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      @scala.inline
      def setOnAllNoticeRemoved(value: /* placement */ Placement => Unit): Self = StObject.set(x, "onAllNoticeRemoved", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAllNoticeRemovedUndefined: Self = StObject.set(x, "onAllNoticeRemoved", js.undefined)
      
      @scala.inline
      def setOnNoticeClose(value: /* key */ Key => Unit): Self = StObject.set(x, "onNoticeClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNoticeCloseUndefined: Self = StObject.set(x, "onNoticeClose", js.undefined)
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStack(value: StackConfig): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[NoticeListProps]
  
  /* This means you don't have to write `default`, but can instead just say `esNoticeListMod.foo` */
  override def _to: ReactComponentClass[NoticeListProps] = default
}
