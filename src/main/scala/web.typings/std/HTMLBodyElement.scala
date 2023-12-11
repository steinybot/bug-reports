package web.typings.std

import web.typings.std.stdStrings.orientationchange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides special properties (beyond those inherited from the regular HTMLElement interface) for manipulating <body> elements. */
@js.native
trait HTMLBodyElement
  extends StObject
     with HTMLElement
     with WindowEventHandlers {
  
  /** @deprecated */
  /* standard dom */
  var aLink: java.lang.String = js.native
  
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
  /* standard dom */
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
  
  /** @deprecated */
  /* standard dom */
  var background: java.lang.String = js.native
  
  /** @deprecated */
  /* standard dom */
  var bgColor: java.lang.String = js.native
  
  /** @deprecated */
  /* standard dom */
  var link: java.lang.String = js.native
  
  /** @deprecated */
  /* standard dom */
  var onorientationchange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
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
  /* standard dom */
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
  
  /** @deprecated */
  /* standard dom */
  var text: java.lang.String = js.native
  
  /** @deprecated */
  /* standard dom */
  var vLink: java.lang.String = js.native
}
