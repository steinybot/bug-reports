package web.typings.rcNotification

import web.typings.react.mod.CSSProperties
import web.typings.react.mod.HTMLAttributes
import web.typings.react.mod.MouseEventHandler
import web.typings.react.mod.Ref
import web.typings.std.Record
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Gap extends StObject {
    
    /**
      * Spacing between each notification when expanded.
      */
    var gap: js.UndefOr[Double] = js.native
    
    /**
      * Offset when notifications are stacked together.
      * @default 8
      */
    var offset: js.UndefOr[Double] = js.native
    
    /**
      * When number is greater than threshold, notifications will be stacked together.
      * @default 3
      */
    var threshold: js.UndefOr[Double] = js.native
  }
  object Gap {
    
    @scala.inline
    def apply(): Gap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Gap]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Gap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
  
  @js.native
  trait Key extends StObject {
    
    var key: web.typings.react.mod.Key = js.native
    
    var prefixCls: String = js.native
  }
  object Key {
    
    @scala.inline
    def apply(key: web.typings.react.mod.Key, prefixCls: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: web.typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait List extends StObject {
    
    var list: js.UndefOr[String] = js.native
    
    var notice: js.UndefOr[String] = js.native
  }
  object List {
    
    @scala.inline
    def apply(): web.typings.rcNotification.anon.List = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[web.typings.rcNotification.anon.List]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: web.typings.rcNotification.anon.List] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setNotice(value: String): Self = StObject.set(x, "notice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoticeUndefined: Self = StObject.set(x, "notice", js.undefined)
    }
  }
  
  /* Inlined rc-notification.rc-notification/es/Notice.NoticeProps & {  times :number | undefined} & react.react.RefAttributes<std.HTMLDivElement> */
  @js.native
  trait NoticePropstimesnumberund extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var classNames: js.UndefOr[keyinNoticeSemanticPropss] = js.native
    
    var closable: js.UndefOr[Boolean] = js.native
    
    var closeIcon: js.UndefOr[ReactElement] = js.native
    
    var content: js.UndefOr[ReactElement] = js.native
    
    var duration: js.UndefOr[Double | Null] = js.native
    
    var eventKey: web.typings.react.mod.Key = js.native
    
    var hovering: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[web.typings.react.mod.Key | Null] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onNoticeClose: js.UndefOr[js.Function1[/* key */ web.typings.react.mod.Key, Unit]] = js.native
    
    var prefixCls: String = js.native
    
    var props: js.UndefOr[HTMLAttributes[HTMLDivElement] with (Record[String, Any])] = js.native
    
    /**
      * Allows getting a ref to the component instance.
      * Once the component unmounts, React will set `ref.current` to `null` (or call the ref with `null` if you passed a callback ref).
      * @see https://react.dev/learn/referencing-values-with-refs#refs-and-the-dom
      */
    var ref: js.UndefOr[Ref[HTMLDivElement]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var styles: js.UndefOr[keyinNoticeSemanticPropsC] = js.native
    
    var times: js.UndefOr[Double] = js.native
  }
  object NoticePropstimesnumberund {
    
    @scala.inline
    def apply(eventKey: web.typings.react.mod.Key, prefixCls: String): NoticePropstimesnumberund = {
      val __obj = js.Dynamic.literal(eventKey = eventKey.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoticePropstimesnumberund]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: NoticePropstimesnumberund] (val x: Self) extends AnyVal {
      
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
      def setEventKey(value: web.typings.react.mod.Key): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHovering(value: Boolean): Self = StObject.set(x, "hovering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoveringUndefined: Self = StObject.set(x, "hovering", js.undefined)
      
      @scala.inline
      def setKey(value: web.typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNull: Self = StObject.set(x, "key", null)
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnNoticeClose(value: /* key */ web.typings.react.mod.Key => Unit): Self = StObject.set(x, "onNoticeClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNoticeCloseUndefined: Self = StObject.set(x, "onNoticeClose", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: HTMLAttributes[HTMLDivElement] with (Record[String, Any])): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      @scala.inline
      def setRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefReactRef(value: ReactRef[HTMLDivElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: keyinNoticeSemanticPropsC): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTimes(value: Double): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
    }
  }
  
  /* Inlined {[ key in rc-notification.rc-notification/es/interface.NoticeSemanticProps ]:? react.react.CSSProperties} */
  @js.native
  trait keyinNoticeSemanticPropsC extends StObject {
    
    var wrapper: js.UndefOr[CSSProperties] = js.native
  }
  object keyinNoticeSemanticPropsC {
    
    @scala.inline
    def apply(): keyinNoticeSemanticPropsC = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[keyinNoticeSemanticPropsC]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: keyinNoticeSemanticPropsC] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWrapper(value: CSSProperties): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  /* Inlined {[ key in rc-notification.rc-notification/es/interface.NoticeSemanticProps ]:? string} */
  @js.native
  trait keyinNoticeSemanticPropss extends StObject {
    
    var wrapper: js.UndefOr[String] = js.native
  }
  object keyinNoticeSemanticPropss {
    
    @scala.inline
    def apply(): keyinNoticeSemanticPropss = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[keyinNoticeSemanticPropss]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: keyinNoticeSemanticPropss] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWrapper(value: String): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
}
