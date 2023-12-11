package web.typings.std.global

import web.typings.std.AddEventListenerOptions
import web.typings.std.EventListenerOrEventListenerObject
import org.scalajs.dom.EventListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SVGMarkerElement")
@js.native
/* standard dom */
class SVGMarkerElement ()
  extends StObject
     with web.typings.std.SVGMarkerElement {
  
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
object SVGMarkerElement {
  
  /* standard dom */
  @JSGlobal("SVGMarkerElement.SVG_MARKERUNITS_STROKEWIDTH")
  @js.native
  val SVG_MARKERUNITS_STROKEWIDTH: Double = js.native
  
  /* standard dom */
  @JSGlobal("SVGMarkerElement.SVG_MARKERUNITS_UNKNOWN")
  @js.native
  val SVG_MARKERUNITS_UNKNOWN: Double = js.native
  
  /* standard dom */
  @JSGlobal("SVGMarkerElement.SVG_MARKERUNITS_USERSPACEONUSE")
  @js.native
  val SVG_MARKERUNITS_USERSPACEONUSE: Double = js.native
  
  /* standard dom */
  @JSGlobal("SVGMarkerElement.SVG_MARKER_ORIENT_ANGLE")
  @js.native
  val SVG_MARKER_ORIENT_ANGLE: Double = js.native
  
  /* standard dom */
  @JSGlobal("SVGMarkerElement.SVG_MARKER_ORIENT_AUTO")
  @js.native
  val SVG_MARKER_ORIENT_AUTO: Double = js.native
  
  /* standard dom */
  @JSGlobal("SVGMarkerElement.SVG_MARKER_ORIENT_UNKNOWN")
  @js.native
  val SVG_MARKER_ORIENT_UNKNOWN: Double = js.native
}
