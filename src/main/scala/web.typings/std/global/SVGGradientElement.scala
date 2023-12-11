package web.typings.std.global

import web.typings.std.AddEventListenerOptions
import web.typings.std.EventListenerOrEventListenerObject
import org.scalajs.dom.EventListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SVGGradientElement")
@js.native
/* standard dom */
class SVGGradientElement ()
  extends StObject
     with web.typings.std.SVGGradientElement {
  
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
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
}
object SVGGradientElement {
  
  /* standard dom */
  @JSGlobal("SVGGradientElement.SVG_SPREADMETHOD_PAD")
  @js.native
  val SVG_SPREADMETHOD_PAD: Double = js.native
  
  /* standard dom */
  @JSGlobal("SVGGradientElement.SVG_SPREADMETHOD_REFLECT")
  @js.native
  val SVG_SPREADMETHOD_REFLECT: Double = js.native
  
  /* standard dom */
  @JSGlobal("SVGGradientElement.SVG_SPREADMETHOD_REPEAT")
  @js.native
  val SVG_SPREADMETHOD_REPEAT: Double = js.native
  
  /* standard dom */
  @JSGlobal("SVGGradientElement.SVG_SPREADMETHOD_UNKNOWN")
  @js.native
  val SVG_SPREADMETHOD_UNKNOWN: Double = js.native
}
