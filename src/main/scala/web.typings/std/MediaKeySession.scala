package web.typings.std

import web.typings.std.stdStrings.keystatuseschange
import web.typings.std.stdStrings.message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This EncryptedMediaExtensions API interface represents a context for message exchange with a content decryption module (CDM). */
@js.native
trait MediaKeySession
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_keystatuseschange(
    `type`: keystatuseschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keystatuseschange(
    `type`: keystatuseschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_keystatuseschange(
    `type`: keystatuseschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /* standard dom */
  def close(): js.Promise[Unit] = js.native
  
  /* standard dom */
  val closed: js.Promise[Unit] = js.native
  
  /* standard dom */
  val expiration: Double = js.native
  
  /* standard dom */
  def generateRequest(initDataType: java.lang.String, initData: BufferSource): js.Promise[Unit] = js.native
  
  /* standard dom */
  val keyStatuses: MediaKeyStatusMap = js.native
  
  /* standard dom */
  def load(sessionId: java.lang.String): js.Promise[scala.Boolean] = js.native
  
  /* standard dom */
  var onkeystatuseschange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard dom */
  var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, Any]) | Null = js.native
  
  /* standard dom */
  def remove(): js.Promise[Unit] = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_keystatuseschange(
    `type`: keystatuseschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keystatuseschange(
    `type`: keystatuseschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_keystatuseschange(
    `type`: keystatuseschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaKeyMessageEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /* standard dom */
  val sessionId: java.lang.String = js.native
  
  /* standard dom */
  def update(response: BufferSource): js.Promise[Unit] = js.native
}
