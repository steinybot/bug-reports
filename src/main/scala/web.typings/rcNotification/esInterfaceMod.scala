package web.typings.rcNotification

import web.typings.rcNotification.anon.Gap
import web.typings.rcNotification.anon.keyinNoticeSemanticPropsC
import web.typings.rcNotification.anon.keyinNoticeSemanticPropss
import web.typings.rcNotification.rcNotificationStrings.wrapper
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.HTMLAttributes
import web.typings.react.mod.Key
import web.typings.react.mod.MouseEventHandler
import web.typings.std.Record
import web.typings.std.VoidFunction
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInterfaceMod {
  
  @js.native
  trait InnerOpenConfig
    extends StObject
       with OpenConfig {
    
    var times: js.UndefOr[Double] = js.native
  }
  object InnerOpenConfig {
    
    @scala.inline
    def apply(key: Key): InnerOpenConfig = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[InnerOpenConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: InnerOpenConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimes(value: Double): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
    }
  }
  
  @js.native
  trait NoticeConfig extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var classNames: js.UndefOr[keyinNoticeSemanticPropss] = js.native
    
    var closable: js.UndefOr[Boolean] = js.native
    
    var closeIcon: js.UndefOr[ReactElement] = js.native
    
    var content: js.UndefOr[ReactElement] = js.native
    
    var duration: js.UndefOr[Double | Null] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onClose: js.UndefOr[VoidFunction] = js.native
    
    /** @private Internal usage. Do not override in your code */
    var props: js.UndefOr[HTMLAttributes[HTMLDivElement] with (Record[String, Any])] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var styles: js.UndefOr[keyinNoticeSemanticPropsC] = js.native
  }
  object NoticeConfig {
    
    @scala.inline
    def apply(): NoticeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoticeConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: NoticeConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClassNames(value: keyinNoticeSemanticPropss): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      @scala.inline
      def setCloseIcon(value: ReactElement): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      @scala.inline
      def setContent(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationNull: Self = StObject.set(x, "duration", null)
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setProps(value: HTMLAttributes[HTMLDivElement] with (Record[String, Any])): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: keyinNoticeSemanticPropsC): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  type NoticeSemanticProps = wrapper
  
  @js.native
  trait OpenConfig
    extends StObject
       with NoticeConfig {
    
    var key: Key = js.native
    
    var placement: js.UndefOr[Placement] = js.native
  }
  object OpenConfig {
    
    @scala.inline
    def apply(key: Key): OpenConfig = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: OpenConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcNotification.rcNotificationStrings.top
    - `web.typings`.rcNotification.rcNotificationStrings.topLeft
    - `web.typings`.rcNotification.rcNotificationStrings.topRight
    - `web.typings`.rcNotification.rcNotificationStrings.bottom
    - `web.typings`.rcNotification.rcNotificationStrings.bottomLeft
    - `web.typings`.rcNotification.rcNotificationStrings.bottomRight
  */
  trait Placement extends StObject
  object Placement {
    
    @scala.inline
    def bottom: web.typings.rcNotification.rcNotificationStrings.bottom = "bottom".asInstanceOf[web.typings.rcNotification.rcNotificationStrings.bottom]
    
    @scala.inline
    def bottomLeft: web.typings.rcNotification.rcNotificationStrings.bottomLeft = "bottomLeft".asInstanceOf[web.typings.rcNotification.rcNotificationStrings.bottomLeft]
    
    @scala.inline
    def bottomRight: web.typings.rcNotification.rcNotificationStrings.bottomRight = "bottomRight".asInstanceOf[web.typings.rcNotification.rcNotificationStrings.bottomRight]
    
    @scala.inline
    def top: web.typings.rcNotification.rcNotificationStrings.top = "top".asInstanceOf[web.typings.rcNotification.rcNotificationStrings.top]
    
    @scala.inline
    def topLeft: web.typings.rcNotification.rcNotificationStrings.topLeft = "topLeft".asInstanceOf[web.typings.rcNotification.rcNotificationStrings.topLeft]
    
    @scala.inline
    def topRight: web.typings.rcNotification.rcNotificationStrings.topRight = "topRight".asInstanceOf[web.typings.rcNotification.rcNotificationStrings.topRight]
  }
  
  /* Inlined std.Partial<std.Record<rc-notification.rc-notification/es/interface.Placement, std.Array<rc-notification.rc-notification/es/interface.OpenConfig>>> */
  @js.native
  trait Placements extends StObject {
    
    var bottom: js.UndefOr[js.Array[OpenConfig]] = js.native
    
    var bottomLeft: js.UndefOr[js.Array[OpenConfig]] = js.native
    
    var bottomRight: js.UndefOr[js.Array[OpenConfig]] = js.native
    
    var top: js.UndefOr[js.Array[OpenConfig]] = js.native
    
    var topLeft: js.UndefOr[js.Array[OpenConfig]] = js.native
    
    var topRight: js.UndefOr[js.Array[OpenConfig]] = js.native
  }
  object Placements {
    
    @scala.inline
    def apply(): Placements = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Placements]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Placements] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: js.Array[OpenConfig]): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomLeft(value: js.Array[OpenConfig]): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomLeftUndefined: Self = StObject.set(x, "bottomLeft", js.undefined)
      
      @scala.inline
      def setBottomLeftVarargs(value: OpenConfig*): Self = StObject.set(x, "bottomLeft", js.Array(value :_*))
      
      @scala.inline
      def setBottomRight(value: js.Array[OpenConfig]): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomRightUndefined: Self = StObject.set(x, "bottomRight", js.undefined)
      
      @scala.inline
      def setBottomRightVarargs(value: OpenConfig*): Self = StObject.set(x, "bottomRight", js.Array(value :_*))
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setBottomVarargs(value: OpenConfig*): Self = StObject.set(x, "bottom", js.Array(value :_*))
      
      @scala.inline
      def setTop(value: js.Array[OpenConfig]): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopLeft(value: js.Array[OpenConfig]): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopLeftUndefined: Self = StObject.set(x, "topLeft", js.undefined)
      
      @scala.inline
      def setTopLeftVarargs(value: OpenConfig*): Self = StObject.set(x, "topLeft", js.Array(value :_*))
      
      @scala.inline
      def setTopRight(value: js.Array[OpenConfig]): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopRightUndefined: Self = StObject.set(x, "topRight", js.undefined)
      
      @scala.inline
      def setTopRightVarargs(value: OpenConfig*): Self = StObject.set(x, "topRight", js.Array(value :_*))
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setTopVarargs(value: OpenConfig*): Self = StObject.set(x, "top", js.Array(value :_*))
    }
  }
  
  type StackConfig = Boolean | Gap
}
