package web.typings.std

import web.typings.std.stdStrings.compassneedscalibration
import web.typings.std.stdStrings.devicemotion
import web.typings.std.stdStrings.deviceorientation
import web.typings.std.stdStrings.deviceorientationabsolute
import web.typings.std.stdStrings.gamepadconnected
import web.typings.std.stdStrings.gamepaddisconnected
import web.typings.std.stdStrings.mousewheel
import web.typings.std.stdStrings.orientationchange
import web.typings.std.stdStrings.readystatechange
import web.typings.std.stdStrings.vrdisplayactivate
import web.typings.std.stdStrings.vrdisplayblur
import web.typings.std.stdStrings.vrdisplayconnect
import web.typings.std.stdStrings.vrdisplaydeactivate
import web.typings.std.stdStrings.vrdisplaydisconnect
import web.typings.std.stdStrings.vrdisplaypresentchange
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A window containing a DOM document; the document property points to the DOM document loaded in that window. */
@js.native
trait Window
  extends StObject
     with EventTarget
     with AnimationFrameProvider
     with GlobalEventHandlers
     with WindowEventHandlers
     with WindowLocalStorage
     with WindowOrWorkerGlobalScope
     with WindowSessionStorage
     with /* standard dom */
/* index */ NumberDictionary[org.scalajs.dom.Window] {
  
  /* standard dom */
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compassneedscalibration(
    `type`: compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compassneedscalibration(
    `type`: compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compassneedscalibration(
    `type`: compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceMotionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceMotionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceMotionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceOrientationEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceOrientationEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceOrientationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientationabsolute(
    `type`: deviceorientationabsolute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceOrientationEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientationabsolute(
    `type`: deviceorientationabsolute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceOrientationEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientationabsolute(
    `type`: deviceorientationabsolute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceOrientationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gamepadconnected(
    `type`: gamepadconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.GamepadEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gamepadconnected(
    `type`: gamepadconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.GamepadEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gamepadconnected(
    `type`: gamepadconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.GamepadEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gamepaddisconnected(
    `type`: gamepaddisconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.GamepadEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gamepaddisconnected(
    `type`: gamepaddisconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.GamepadEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gamepaddisconnected(
    `type`: gamepaddisconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.GamepadEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousewheel(
    `type`: mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousewheel(
    `type`: mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousewheel(
    `type`: mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ProgressEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ProgressEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ProgressEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(
    `type`: vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(
    `type`: vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(
    `type`: vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(
    `type`: vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(
    `type`: vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(
    `type`: vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(
    `type`: vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(
    `type`: vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(
    `type`: vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(
    `type`: vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(
    `type`: vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(
    `type`: vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(
    `type`: vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(
    `type`: vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(
    `type`: vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /* standard dom */
  def alert(): Unit = js.native
  def alert(message: Any): Unit = js.native
  
  /* standard dom */
  val applicationCache: org.scalajs.dom.ApplicationCache = js.native
  
  /* standard dom */
  def blur(): Unit = js.native
  
  /** @deprecated */
  /* standard dom */
  def captureEvents(): Unit = js.native
  
  /* standard dom */
  val clientInformation: org.scalajs.dom.Navigator = js.native
  
  /* standard dom */
  def close(): Unit = js.native
  
  /* standard dom */
  val closed: scala.Boolean = js.native
  
  /* standard dom */
  def confirm(): scala.Boolean = js.native
  def confirm(message: java.lang.String): scala.Boolean = js.native
  
  /* standard dom */
  var customElements: CustomElementRegistry = js.native
  
  /* standard dom */
  var defaultStatus: java.lang.String = js.native
  
  /* standard dom */
  def departFocus(navigationReason: NavigationReason, origin: FocusNavigationOrigin): Unit = js.native
  
  /* standard dom */
  val devicePixelRatio: Double = js.native
  
  /* standard dom */
  val doNotTrack: java.lang.String = js.native
  
  /* standard dom */
  val document: org.scalajs.dom.Document = js.native
  
  /** @deprecated */
  /* standard dom */
  val event: js.UndefOr[org.scalajs.dom.Event] = js.native
  
  /** @deprecated */
  /* standard dom */
  val external: org.scalajs.dom.External = js.native
  
  /* standard dom */
  def focus(): Unit = js.native
  
  /* standard dom */
  val frameElement: org.scalajs.dom.Element | Null = js.native
  
  /* standard dom */
  val frames: org.scalajs.dom.Window = js.native
  
  /* standard dom */
  def getComputedStyle(elt: org.scalajs.dom.Element): org.scalajs.dom.CSSStyleDeclaration = js.native
  def getComputedStyle(elt: org.scalajs.dom.Element, pseudoElt: java.lang.String): org.scalajs.dom.CSSStyleDeclaration = js.native
  
  /* standard dom */
  def getMatchedCSSRules(elt: org.scalajs.dom.Element): org.scalajs.dom.CSSRuleList = js.native
  def getMatchedCSSRules(elt: org.scalajs.dom.Element, pseudoElt: java.lang.String): org.scalajs.dom.CSSRuleList = js.native
  
  /* standard dom */
  def getSelection(): org.scalajs.dom.Selection | Null = js.native
  
  /* standard dom */
  val history: org.scalajs.dom.History = js.native
  
  /* standard dom */
  val innerHeight: Double = js.native
  
  /* standard dom */
  val innerWidth: Double = js.native
  
  /* standard dom */
  val length: Double = js.native
  
  /* standard dom */
  var location: org.scalajs.dom.Location = js.native
  
  /* standard dom */
  val locationbar: BarProp = js.native
  
  /* standard dom */
  def matchMedia(query: java.lang.String): org.scalajs.dom.MediaQueryList = js.native
  
  /* standard dom */
  val menubar: BarProp = js.native
  
  /* standard dom */
  def moveBy(x: Double, y: Double): Unit = js.native
  
  /* standard dom */
  def moveTo(x: Double, y: Double): Unit = js.native
  
  /* standard dom */
  val msContentScript: ExtensionScriptApis = js.native
  
  /* standard dom */
  def msWriteProfilerMark(profilerMarkName: java.lang.String): Unit = js.native
  
  /* standard dom */
  var name: java.lang.String = js.native
  
  /* standard dom */
  val navigator: org.scalajs.dom.Navigator = js.native
  
  /* standard dom */
  var offscreenBuffering: java.lang.String | scala.Boolean = js.native
  
  /* standard dom */
  var oncompassneedscalibration: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard dom */
  var ondevicemotion: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceMotionEvent, Any]) | Null = js.native
  
  /* standard dom */
  var ondeviceorientation: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceOrientationEvent, Any]) | Null = js.native
  
  /* standard dom */
  var ondeviceorientationabsolute: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceOrientationEvent, Any]) | Null = js.native
  
  /* standard dom */
  var ongamepadconnected: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.GamepadEvent, Any]) | Null = js.native
  
  /* standard dom */
  var ongamepaddisconnected: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.GamepadEvent, Any]) | Null = js.native
  
  /* standard dom */
  var onmousewheel: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /** @deprecated */
  /* standard dom */
  var onorientationchange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard dom */
  var onreadystatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ProgressEvent, Any]) | Null = js.native
  
  /* standard dom */
  var onvrdisplayactivate: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard dom */
  var onvrdisplayblur: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard dom */
  var onvrdisplayconnect: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard dom */
  var onvrdisplaydeactivate: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard dom */
  var onvrdisplaydisconnect: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard dom */
  var onvrdisplaypresentchange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard dom */
  def open(): org.scalajs.dom.Window | Null = js.native
  def open(url: java.lang.String): org.scalajs.dom.Window | Null = js.native
  def open(url: java.lang.String, target: java.lang.String): org.scalajs.dom.Window | Null = js.native
  def open(url: java.lang.String, target: java.lang.String, features: java.lang.String): org.scalajs.dom.Window | Null = js.native
  def open(
    url: java.lang.String,
    target: java.lang.String,
    features: java.lang.String,
    replace: scala.Boolean
  ): org.scalajs.dom.Window | Null = js.native
  def open(url: java.lang.String, target: java.lang.String, features: Unit, replace: scala.Boolean): org.scalajs.dom.Window | Null = js.native
  def open(url: java.lang.String, target: Unit, features: java.lang.String): org.scalajs.dom.Window | Null = js.native
  def open(url: java.lang.String, target: Unit, features: java.lang.String, replace: scala.Boolean): org.scalajs.dom.Window | Null = js.native
  def open(url: java.lang.String, target: Unit, features: Unit, replace: scala.Boolean): org.scalajs.dom.Window | Null = js.native
  def open(url: Unit, target: java.lang.String): org.scalajs.dom.Window | Null = js.native
  def open(url: Unit, target: java.lang.String, features: java.lang.String): org.scalajs.dom.Window | Null = js.native
  def open(url: Unit, target: java.lang.String, features: java.lang.String, replace: scala.Boolean): org.scalajs.dom.Window | Null = js.native
  def open(url: Unit, target: java.lang.String, features: Unit, replace: scala.Boolean): org.scalajs.dom.Window | Null = js.native
  def open(url: Unit, target: Unit, features: java.lang.String): org.scalajs.dom.Window | Null = js.native
  def open(url: Unit, target: Unit, features: java.lang.String, replace: scala.Boolean): org.scalajs.dom.Window | Null = js.native
  def open(url: Unit, target: Unit, features: Unit, replace: scala.Boolean): org.scalajs.dom.Window | Null = js.native
  
  /* standard dom */
  var opener: org.scalajs.dom.Window | Null = js.native
  
  /** @deprecated */
  /* standard dom */
  val orientation: java.lang.String | Double = js.native
  
  /* standard dom */
  val outerHeight: Double = js.native
  
  /* standard dom */
  val outerWidth: Double = js.native
  
  /* standard dom */
  val pageXOffset: Double = js.native
  
  /* standard dom */
  val pageYOffset: Double = js.native
  
  /* standard dom */
  val parent: org.scalajs.dom.Window = js.native
  
  /* standard dom */
  val personalbar: BarProp = js.native
  
  /* standard dom */
  def postMessage(message: Any, targetOrigin: java.lang.String): Unit = js.native
  def postMessage(message: Any, targetOrigin: java.lang.String, transfer: js.Array[Transferable]): Unit = js.native
  
  /* standard dom */
  def print(): Unit = js.native
  
  /* standard dom */
  def prompt(): java.lang.String | Null = js.native
  def prompt(message: java.lang.String): java.lang.String | Null = js.native
  def prompt(message: java.lang.String, _default: java.lang.String): java.lang.String | Null = js.native
  def prompt(message: Unit, _default: java.lang.String): java.lang.String | Null = js.native
  
  /** @deprecated */
  /* standard dom */
  def releaseEvents(): Unit = js.native
  
  /* standard dom */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compassneedscalibration(
    `type`: compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compassneedscalibration(
    `type`: compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compassneedscalibration(
    `type`: compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceMotionEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceMotionEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceMotionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceOrientationEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceOrientationEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceOrientationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientationabsolute(
    `type`: deviceorientationabsolute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceOrientationEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientationabsolute(
    `type`: deviceorientationabsolute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceOrientationEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientationabsolute(
    `type`: deviceorientationabsolute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.DeviceOrientationEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gamepadconnected(
    `type`: gamepadconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.GamepadEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gamepadconnected(
    `type`: gamepadconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.GamepadEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gamepadconnected(
    `type`: gamepadconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.GamepadEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gamepaddisconnected(
    `type`: gamepaddisconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.GamepadEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gamepaddisconnected(
    `type`: gamepaddisconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.GamepadEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gamepaddisconnected(
    `type`: gamepaddisconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.GamepadEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousewheel(
    `type`: mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousewheel(
    `type`: mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousewheel(
    `type`: mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ProgressEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ProgressEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.ProgressEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayactivate(
    `type`: vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayactivate(
    `type`: vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayactivate(
    `type`: vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayblur(
    `type`: vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayblur(
    `type`: vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayblur(
    `type`: vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayconnect(
    `type`: vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayconnect(
    `type`: vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayconnect(
    `type`: vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydeactivate(
    `type`: vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydeactivate(
    `type`: vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydeactivate(
    `type`: vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydisconnect(
    `type`: vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydisconnect(
    `type`: vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydisconnect(
    `type`: vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypresentchange(
    `type`: vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypresentchange(
    `type`: vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypresentchange(
    `type`: vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /* standard dom */
  def resizeBy(x: Double, y: Double): Unit = js.native
  
  /* standard dom */
  def resizeTo(width: Double, height: Double): Unit = js.native
  
  /* standard dom */
  val screen: org.scalajs.dom.Screen = js.native
  
  /* standard dom */
  val screenLeft: Double = js.native
  
  /* standard dom */
  val screenTop: Double = js.native
  
  /* standard dom */
  val screenX: Double = js.native
  
  /* standard dom */
  val screenY: Double = js.native
  
  /* standard dom */
  def scroll(): Unit = js.native
  def scroll(options: ScrollToOptions): Unit = js.native
  /* standard dom */
  def scroll(x: Double, y: Double): Unit = js.native
  
  /* standard dom */
  def scrollBy(): Unit = js.native
  def scrollBy(options: ScrollToOptions): Unit = js.native
  /* standard dom */
  def scrollBy(x: Double, y: Double): Unit = js.native
  
  /* standard dom */
  def scrollTo(): Unit = js.native
  def scrollTo(options: ScrollToOptions): Unit = js.native
  /* standard dom */
  def scrollTo(x: Double, y: Double): Unit = js.native
  
  /* standard dom */
  val scrollX: Double = js.native
  
  /* standard dom */
  val scrollY: Double = js.native
  
  /* standard dom */
  val scrollbars: BarProp = js.native
  
  /* standard dom */
  val self: org.scalajs.dom.Window with (/* globalThis */ Any) = js.native
  
  /* standard dom */
  val speechSynthesis: SpeechSynthesis = js.native
  
  /* standard dom */
  var status: java.lang.String = js.native
  
  /* standard dom */
  val statusbar: BarProp = js.native
  
  /* standard dom */
  def stop(): Unit = js.native
  
  /* standard dom */
  val styleMedia: org.scalajs.dom.StyleMedia = js.native
  
  /* standard dom */
  val toolbar: BarProp = js.native
  
  /* standard dom */
  val top: org.scalajs.dom.Window = js.native
  
  /* standard dom */
  val visualViewport: VisualViewport = js.native
  
  /* standard dom */
  def webkitCancelAnimationFrame(handle: Double): Unit = js.native
  
  /* standard dom */
  def webkitConvertPointFromNodeToPage(node: org.scalajs.dom.Node, pt: WebKitPoint): WebKitPoint = js.native
  
  /* standard dom */
  def webkitConvertPointFromPageToNode(node: org.scalajs.dom.Node, pt: WebKitPoint): WebKitPoint = js.native
  
  /* standard dom */
  def webkitRequestAnimationFrame(callback: FrameRequestCallback): Double = js.native
  
  /* standard dom */
  val window: org.scalajs.dom.Window with (/* globalThis */ Any) = js.native
}
