package web.typings.std

import web.typings.std.stdStrings.tonechange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCDtmfSender
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_tonechange(
    `type`: tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tonechange(
    `type`: tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tonechange(
    `type`: tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /* standard dom */
  val canInsertDTMF: scala.Boolean = js.native
  
  /* standard dom */
  val duration: Double = js.native
  
  /* standard dom */
  def insertDTMF(tones: java.lang.String): Unit = js.native
  def insertDTMF(tones: java.lang.String, duration: Double): Unit = js.native
  def insertDTMF(tones: java.lang.String, duration: Double, interToneGap: Double): Unit = js.native
  def insertDTMF(tones: java.lang.String, duration: Unit, interToneGap: Double): Unit = js.native
  
  /* standard dom */
  val interToneGap: Double = js.native
  
  /* standard dom */
  var ontonechange: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_tonechange(
    `type`: tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_tonechange(
    `type`: tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_tonechange(
    `type`: tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /* standard dom */
  val sender: RTCRtpSender = js.native
  
  /* standard dom */
  val toneBuffer: java.lang.String = js.native
}
