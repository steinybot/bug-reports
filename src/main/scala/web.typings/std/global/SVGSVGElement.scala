package web.typings.std.global

import web.typings.std.AddEventListenerOptions
import web.typings.std.EventListenerOrEventListenerObject
import org.scalajs.dom.EventListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SVGSVGElement")
@js.native
/* standard dom */
class SVGSVGElement ()
  extends StObject
     with web.typings.std.SVGSVGElement {
  
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
object SVGSVGElement {
  
  /* standard dom */
  @JSGlobal("SVGSVGElement.SVG_ZOOMANDPAN_DISABLE")
  @js.native
  val SVG_ZOOMANDPAN_DISABLE: Double = js.native
  
  /* standard dom */
  @JSGlobal("SVGSVGElement.SVG_ZOOMANDPAN_MAGNIFY")
  @js.native
  val SVG_ZOOMANDPAN_MAGNIFY: Double = js.native
  
  /* standard dom */
  @JSGlobal("SVGSVGElement.SVG_ZOOMANDPAN_UNKNOWN")
  @js.native
  val SVG_ZOOMANDPAN_UNKNOWN: Double = js.native
}
