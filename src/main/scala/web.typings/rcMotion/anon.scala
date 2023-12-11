package web.typings.rcMotion

import web.typings.rcMotion.esCssmotionMod.MotionName
import web.typings.rcMotion.esInterfaceMod.MotionEndEventHandler
import web.typings.rcMotion.esInterfaceMod.MotionEvent
import web.typings.rcMotion.esInterfaceMod.MotionEventHandler
import web.typings.rcMotion.esInterfaceMod.MotionPrepareEventHandler
import web.typings.rcMotion.esUtilDiffMod.DiffStatus
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.Ref
import web.typings.std.Record
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.AnimationEvent & {  deadline :boolean | undefined} */
  @js.native
  trait AnimationEventdeadlineboo
    extends StObject
       with MotionEvent {
    
    /* standard dom */
    val AT_TARGET: Double = js.native
    
    /* standard dom */
    val BUBBLING_PHASE: Double = js.native
    
    /* standard dom */
    val CAPTURING_PHASE: Double = js.native
    
    /* standard dom */
    val NONE: Double = js.native
    
    /* standard dom */
    val animationName: String = js.native
    
    /**
      * Returns true or false depending on how event was initialized. True if event goes through its target's ancestors in reverse tree order, and false otherwise.
      */
    /* standard dom */
    val bubbles: Boolean = js.native
    
    /* standard dom */
    var cancelBubble: Boolean = js.native
    
    /**
      * Returns true or false depending on how event was initialized. Its return value does not always carry meaning, but true can indicate that part of the operation during which event was dispatched, can be canceled by invoking the preventDefault() method.
      */
    /* standard dom */
    val cancelable: Boolean = js.native
    
    /**
      * Returns true or false depending on how event was initialized. True if event invokes listeners past a ShadowRoot node that is the root of its target, and false otherwise.
      */
    /* standard dom */
    val composed: Boolean = js.native
    
    /**
      * Returns the invocation target objects of event's path (objects on which listeners will be invoked), except for any nodes in shadow trees of which the shadow root's mode is "closed" that are not reachable from event's currentTarget.
      */
    /* standard dom */
    def composedPath(): js.Array[EventTarget] = js.native
    
    /**
      * Returns the object whose event listener's callback is currently being invoked.
      */
    /* standard dom */
    val currentTarget: EventTarget | Null = js.native
    
    var deadline: js.UndefOr[Boolean] = js.native
    
    /**
      * Returns true if preventDefault() was invoked successfully to indicate cancelation, and false otherwise.
      */
    /* standard dom */
    val defaultPrevented: Boolean = js.native
    
    /* standard dom */
    val elapsedTime: Double = js.native
    
    /**
      * Returns the event's phase, which is one of NONE, CAPTURING_PHASE, AT_TARGET, and BUBBLING_PHASE.
      */
    /* standard dom */
    val eventPhase: Double = js.native
    
    /* standard dom */
    def initEvent(`type`: String): Unit = js.native
    def initEvent(`type`: String, bubbles: Boolean): Unit = js.native
    def initEvent(`type`: String, bubbles: Boolean, cancelable: Boolean): Unit = js.native
    def initEvent(`type`: String, bubbles: Unit, cancelable: Boolean): Unit = js.native
    
    /**
      * Returns true if event was dispatched by the user agent, and false otherwise.
      */
    /* standard dom */
    val isTrusted: Boolean = js.native
    
    /**
      * If invoked when the cancelable attribute value is true, and while executing a listener for the event with passive set to false, signals to the operation that caused event to be dispatched that it needs to be canceled.
      */
    /* standard dom */
    def preventDefault(): Unit = js.native
    
    /* standard dom */
    val pseudoElement: String = js.native
    
    /* standard dom */
    var returnValue: Boolean = js.native
    
    /** @deprecated */
    /* standard dom */
    val srcElement: EventTarget | Null = js.native
    
    /**
      * Invoking this method prevents event from reaching any registered event listeners after the current one finishes running and, when dispatched in a tree, also prevents event from reaching any other objects.
      */
    /* standard dom */
    def stopImmediatePropagation(): Unit = js.native
    
    /**
      * When dispatched in a tree, invoking this method prevents event from reaching any objects other than the current object.
      */
    /* standard dom */
    def stopPropagation(): Unit = js.native
    
    /**
      * Returns the object to which event is dispatched (its target).
      */
    /* standard dom */
    val target: EventTarget | Null = js.native
    
    /**
      * Returns the event's timestamp as the number of milliseconds measured relative to the time origin.
      */
    /* standard dom */
    val timeStamp: Double = js.native
    
    /**
      * Returns the type of event, e.g. "click", "hashchange", or "submit".
      */
    /* standard dom */
    val `type`: String = js.native
  }
  
  @js.native
  trait Animationend extends StObject {
    
    var animationend: Record[String, String] = js.native
    
    var transitionend: Record[String, String] = js.native
  }
  object Animationend {
    
    @scala.inline
    def apply(animationend: Record[String, String], transitionend: Record[String, String]): Animationend = {
      val __obj = js.Dynamic.literal(animationend = animationend.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any])
      __obj.asInstanceOf[Animationend]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Animationend] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationend(value: Record[String, String]): Self = StObject.set(x, "animationend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionend(value: Record[String, String]): Self = StObject.set(x, "transitionend", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Appear extends StObject {
    
    var appear: js.UndefOr[String] = js.native
    
    var appearActive: js.UndefOr[String] = js.native
    
    var enter: js.UndefOr[String] = js.native
    
    var enterActive: js.UndefOr[String] = js.native
    
    var leave: js.UndefOr[String] = js.native
    
    var leaveActive: js.UndefOr[String] = js.native
  }
  object Appear {
    
    @scala.inline
    def apply(): Appear = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Appear]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Appear] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppear(value: String): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppearActive(value: String): Self = StObject.set(x, "appearActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppearActiveUndefined: Self = StObject.set(x, "appearActive", js.undefined)
      
      @scala.inline
      def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
      
      @scala.inline
      def setEnter(value: String): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterActive(value: String): Self = StObject.set(x, "enterActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterActiveUndefined: Self = StObject.set(x, "enterActive", js.undefined)
      
      @scala.inline
      def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      @scala.inline
      def setLeave(value: String): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeaveActive(value: String): Self = StObject.set(x, "leaveActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeaveActiveUndefined: Self = StObject.set(x, "leaveActive", js.undefined)
      
      @scala.inline
      def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
    }
  }
  
  /* Inlined rc-motion.rc-motion/es/CSSMotion.CSSMotionProps & {  ref :react.react.Ref<any> | undefined} */
  @js.native
  trait CSSMotionPropsrefRefanyun extends StObject {
    
    var children: js.UndefOr[
        js.Function2[/* props */ Dictkey, /* ref */ js.Function1[/* node */ Any, Unit], ReactElement]
      ] = js.native
    
    /** @private Used by CSSMotionList. Do not use in your production. */
    var eventProps: js.UndefOr[js.Object] = js.native
    
    /**
      * Create element in view even the element is invisible.
      * Will patch `display: none` style on it.
      */
    var forceRender: js.UndefOr[Boolean] = js.native
    
    var internalRef: js.UndefOr[Ref[Any]] = js.native
    
    var leavedClassName: js.UndefOr[String] = js.native
    
    var motionAppear: js.UndefOr[Boolean] = js.native
    
    var motionDeadline: js.UndefOr[Double] = js.native
    
    var motionEnter: js.UndefOr[Boolean] = js.native
    
    var motionLeave: js.UndefOr[Boolean] = js.native
    
    var motionLeaveImmediately: js.UndefOr[Boolean] = js.native
    
    var motionName: js.UndefOr[MotionName] = js.native
    
    var onAppearActive: js.UndefOr[MotionEventHandler] = js.native
    
    var onAppearEnd: js.UndefOr[MotionEndEventHandler] = js.native
    
    /** Prepare phase is used for measure element info. It will always trigger even motion is off */
    var onAppearPrepare: js.UndefOr[MotionPrepareEventHandler] = js.native
    
    var onAppearStart: js.UndefOr[MotionEventHandler] = js.native
    
    var onEnterActive: js.UndefOr[MotionEventHandler] = js.native
    
    var onEnterEnd: js.UndefOr[MotionEndEventHandler] = js.native
    
    /** Prepare phase is used for measure element info. It will always trigger even motion is off */
    var onEnterPrepare: js.UndefOr[MotionPrepareEventHandler] = js.native
    
    var onEnterStart: js.UndefOr[MotionEventHandler] = js.native
    
    var onLeaveActive: js.UndefOr[MotionEventHandler] = js.native
    
    var onLeaveEnd: js.UndefOr[MotionEndEventHandler] = js.native
    
    /** Prepare phase is used for measure element info. It will always trigger even motion is off */
    var onLeavePrepare: js.UndefOr[MotionPrepareEventHandler] = js.native
    
    var onLeaveStart: js.UndefOr[MotionEventHandler] = js.native
    
    /** This will always trigger after final visible changed. Even if no motion configured. */
    var onVisibleChanged: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
    
    var ref: js.UndefOr[Ref[Any]] = js.native
    
    /**
      * Remove element when motion end. This will not work when `forceRender` is set.
      */
    var removeOnLeave: js.UndefOr[Boolean] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
  }
  object CSSMotionPropsrefRefanyun {
    
    @scala.inline
    def apply(): CSSMotionPropsrefRefanyun = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSSMotionPropsrefRefanyun]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CSSMotionPropsrefRefanyun] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: (/* props */ Dictkey, /* ref */ js.Function1[/* node */ Any, Unit]) => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setEventProps(value: js.Object): Self = StObject.set(x, "eventProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventPropsUndefined: Self = StObject.set(x, "eventProps", js.undefined)
      
      @scala.inline
      def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      @scala.inline
      def setInternalRef(value: Ref[Any]): Self = StObject.set(x, "internalRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "internalRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInternalRefNull: Self = StObject.set(x, "internalRef", null)
      
      @scala.inline
      def setInternalRefReactRef(value: ReactRef[Any]): Self = StObject.set(x, "internalRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalRefUndefined: Self = StObject.set(x, "internalRef", js.undefined)
      
      @scala.inline
      def setLeavedClassName(value: String): Self = StObject.set(x, "leavedClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeavedClassNameUndefined: Self = StObject.set(x, "leavedClassName", js.undefined)
      
      @scala.inline
      def setMotionAppear(value: Boolean): Self = StObject.set(x, "motionAppear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionAppearUndefined: Self = StObject.set(x, "motionAppear", js.undefined)
      
      @scala.inline
      def setMotionDeadline(value: Double): Self = StObject.set(x, "motionDeadline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionDeadlineUndefined: Self = StObject.set(x, "motionDeadline", js.undefined)
      
      @scala.inline
      def setMotionEnter(value: Boolean): Self = StObject.set(x, "motionEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionEnterUndefined: Self = StObject.set(x, "motionEnter", js.undefined)
      
      @scala.inline
      def setMotionLeave(value: Boolean): Self = StObject.set(x, "motionLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionLeaveImmediately(value: Boolean): Self = StObject.set(x, "motionLeaveImmediately", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionLeaveImmediatelyUndefined: Self = StObject.set(x, "motionLeaveImmediately", js.undefined)
      
      @scala.inline
      def setMotionLeaveUndefined: Self = StObject.set(x, "motionLeave", js.undefined)
      
      @scala.inline
      def setMotionName(value: MotionName): Self = StObject.set(x, "motionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionNameUndefined: Self = StObject.set(x, "motionName", js.undefined)
      
      @scala.inline
      def setOnAppearActive(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): Self = StObject.set(x, "onAppearActive", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnAppearActiveUndefined: Self = StObject.set(x, "onAppearActive", js.undefined)
      
      @scala.inline
      def setOnAppearEnd(value: (/* element */ HTMLElement, /* event */ MotionEvent) => Boolean | Unit): Self = StObject.set(x, "onAppearEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnAppearEndUndefined: Self = StObject.set(x, "onAppearEnd", js.undefined)
      
      @scala.inline
      def setOnAppearPrepare(value: /* element */ HTMLElement => js.Promise[Any] | Unit): Self = StObject.set(x, "onAppearPrepare", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAppearPrepareUndefined: Self = StObject.set(x, "onAppearPrepare", js.undefined)
      
      @scala.inline
      def setOnAppearStart(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): Self = StObject.set(x, "onAppearStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnAppearStartUndefined: Self = StObject.set(x, "onAppearStart", js.undefined)
      
      @scala.inline
      def setOnEnterActive(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): Self = StObject.set(x, "onEnterActive", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEnterActiveUndefined: Self = StObject.set(x, "onEnterActive", js.undefined)
      
      @scala.inline
      def setOnEnterEnd(value: (/* element */ HTMLElement, /* event */ MotionEvent) => Boolean | Unit): Self = StObject.set(x, "onEnterEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEnterEndUndefined: Self = StObject.set(x, "onEnterEnd", js.undefined)
      
      @scala.inline
      def setOnEnterPrepare(value: /* element */ HTMLElement => js.Promise[Any] | Unit): Self = StObject.set(x, "onEnterPrepare", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEnterPrepareUndefined: Self = StObject.set(x, "onEnterPrepare", js.undefined)
      
      @scala.inline
      def setOnEnterStart(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): Self = StObject.set(x, "onEnterStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEnterStartUndefined: Self = StObject.set(x, "onEnterStart", js.undefined)
      
      @scala.inline
      def setOnLeaveActive(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): Self = StObject.set(x, "onLeaveActive", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnLeaveActiveUndefined: Self = StObject.set(x, "onLeaveActive", js.undefined)
      
      @scala.inline
      def setOnLeaveEnd(value: (/* element */ HTMLElement, /* event */ MotionEvent) => Boolean | Unit): Self = StObject.set(x, "onLeaveEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnLeaveEndUndefined: Self = StObject.set(x, "onLeaveEnd", js.undefined)
      
      @scala.inline
      def setOnLeavePrepare(value: /* element */ HTMLElement => js.Promise[Any] | Unit): Self = StObject.set(x, "onLeavePrepare", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLeavePrepareUndefined: Self = StObject.set(x, "onLeavePrepare", js.undefined)
      
      @scala.inline
      def setOnLeaveStart(value: (/* element */ HTMLElement, /* event */ MotionEvent) => CSSProperties | Unit): Self = StObject.set(x, "onLeaveStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnLeaveStartUndefined: Self = StObject.set(x, "onLeaveStart", js.undefined)
      
      @scala.inline
      def setOnVisibleChanged(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onVisibleChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVisibleChangedUndefined: Self = StObject.set(x, "onVisibleChanged", js.undefined)
      
      @scala.inline
      def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefReactRef(value: ReactRef[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setRemoveOnLeave(value: Boolean): Self = StObject.set(x, "removeOnLeave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveOnLeaveUndefined: Self = StObject.set(x, "removeOnLeave", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait ClassName
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var className: js.UndefOr[String] = js.native
    
    var index: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
  }
  object ClassName {
    
    @scala.inline
    def apply(): ClassName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassName]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var className: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait Dictname
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var key: web.typings.react.mod.Key = js.native
  }
  object Dictname {
    
    @scala.inline
    def apply(key: web.typings.react.mod.Key): Dictname = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictname]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Dictname] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: web.typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ForwardRef extends StObject {
    
    /** @deprecated, no need this anymore since `rc-motion` only support latest react */
    var forwardRef: js.UndefOr[Boolean] = js.native
    
    var transitionSupport: js.UndefOr[Boolean] = js.native
  }
  object ForwardRef {
    
    @scala.inline
    def apply(): ForwardRef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ForwardRef]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ForwardRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForwardRef(value: Boolean): Self = StObject.set(x, "forwardRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForwardRefUndefined: Self = StObject.set(x, "forwardRef", js.undefined)
      
      @scala.inline
      def setTransitionSupport(value: Boolean): Self = StObject.set(x, "transitionSupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionSupportUndefined: Self = StObject.set(x, "transitionSupport", js.undefined)
    }
  }
  
  @js.native
  trait IsCanceled extends StObject {
    
    def isCanceled(): Boolean = js.native
  }
  object IsCanceled {
    
    @scala.inline
    def apply(isCanceled: () => Boolean): IsCanceled = {
      val __obj = js.Dynamic.literal(isCanceled = js.Any.fromFunction0(isCanceled))
      __obj.asInstanceOf[IsCanceled]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: IsCanceled] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsCanceled(value: () => Boolean): Self = StObject.set(x, "isCanceled", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Key extends StObject {
    
    var key: web.typings.react.mod.Key = js.native
  }
  object Key {
    
    @scala.inline
    def apply(key: web.typings.react.mod.Key): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: web.typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined rc-motion.rc-motion/es/context.MotionContextProps & {  children :react.react.ReactNode | undefined} */
  @js.native
  trait MotionContextPropschildre extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var motion: js.UndefOr[Boolean] = js.native
  }
  object MotionContextPropschildre {
    
    @scala.inline
    def apply(): MotionContextPropschildre = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MotionContextPropschildre]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MotionContextPropschildre] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setMotion(value: Boolean): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
    }
  }
  
  @js.native
  trait Status extends StObject {
    
    var key: String = js.native
    
    var status: js.UndefOr[DiffStatus] = js.native
  }
  object Status {
    
    @scala.inline
    def apply(key: String): Status = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Status]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: DiffStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /* Inlined std.TransitionEvent & {  deadline :boolean | undefined} */
  @js.native
  trait TransitionEventdeadlinebo
    extends StObject
       with MotionEvent {
    
    /* standard dom */
    val AT_TARGET: Double = js.native
    
    /* standard dom */
    val BUBBLING_PHASE: Double = js.native
    
    /* standard dom */
    val CAPTURING_PHASE: Double = js.native
    
    /* standard dom */
    val NONE: Double = js.native
    
    /**
      * Returns true or false depending on how event was initialized. True if event goes through its target's ancestors in reverse tree order, and false otherwise.
      */
    /* standard dom */
    val bubbles: Boolean = js.native
    
    /* standard dom */
    var cancelBubble: Boolean = js.native
    
    /**
      * Returns true or false depending on how event was initialized. Its return value does not always carry meaning, but true can indicate that part of the operation during which event was dispatched, can be canceled by invoking the preventDefault() method.
      */
    /* standard dom */
    val cancelable: Boolean = js.native
    
    /**
      * Returns true or false depending on how event was initialized. True if event invokes listeners past a ShadowRoot node that is the root of its target, and false otherwise.
      */
    /* standard dom */
    val composed: Boolean = js.native
    
    /**
      * Returns the invocation target objects of event's path (objects on which listeners will be invoked), except for any nodes in shadow trees of which the shadow root's mode is "closed" that are not reachable from event's currentTarget.
      */
    /* standard dom */
    def composedPath(): js.Array[EventTarget] = js.native
    
    /**
      * Returns the object whose event listener's callback is currently being invoked.
      */
    /* standard dom */
    val currentTarget: EventTarget | Null = js.native
    
    var deadline: js.UndefOr[Boolean] = js.native
    
    /**
      * Returns true if preventDefault() was invoked successfully to indicate cancelation, and false otherwise.
      */
    /* standard dom */
    val defaultPrevented: Boolean = js.native
    
    /* standard dom */
    val elapsedTime: Double = js.native
    
    /**
      * Returns the event's phase, which is one of NONE, CAPTURING_PHASE, AT_TARGET, and BUBBLING_PHASE.
      */
    /* standard dom */
    val eventPhase: Double = js.native
    
    /* standard dom */
    def initEvent(`type`: String): Unit = js.native
    def initEvent(`type`: String, bubbles: Boolean): Unit = js.native
    def initEvent(`type`: String, bubbles: Boolean, cancelable: Boolean): Unit = js.native
    def initEvent(`type`: String, bubbles: Unit, cancelable: Boolean): Unit = js.native
    
    /**
      * Returns true if event was dispatched by the user agent, and false otherwise.
      */
    /* standard dom */
    val isTrusted: Boolean = js.native
    
    /**
      * If invoked when the cancelable attribute value is true, and while executing a listener for the event with passive set to false, signals to the operation that caused event to be dispatched that it needs to be canceled.
      */
    /* standard dom */
    def preventDefault(): Unit = js.native
    
    /* standard dom */
    val propertyName: String = js.native
    
    /* standard dom */
    val pseudoElement: String = js.native
    
    /* standard dom */
    var returnValue: Boolean = js.native
    
    /** @deprecated */
    /* standard dom */
    val srcElement: EventTarget | Null = js.native
    
    /**
      * Invoking this method prevents event from reaching any registered event listeners after the current one finishes running and, when dispatched in a tree, also prevents event from reaching any other objects.
      */
    /* standard dom */
    def stopImmediatePropagation(): Unit = js.native
    
    /**
      * When dispatched in a tree, invoking this method prevents event from reaching any objects other than the current object.
      */
    /* standard dom */
    def stopPropagation(): Unit = js.native
    
    /**
      * Returns the object to which event is dispatched (its target).
      */
    /* standard dom */
    val target: EventTarget | Null = js.native
    
    /**
      * Returns the event's timestamp as the number of milliseconds measured relative to the time origin.
      */
    /* standard dom */
    val timeStamp: Double = js.native
    
    /**
      * Returns the type of event, e.g. "click", "hashchange", or "submit".
      */
    /* standard dom */
    val `type`: String = js.native
  }
}
