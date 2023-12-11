package web.typings.std.global

import web.typings.std.AddEventListenerOptions
import web.typings.std.EventListenerOrEventListenerObject
import org.scalajs.dom.EventListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SVGFETurbulenceElement")
@js.native
/* standard dom */
class SVGFETurbulenceElement ()
  extends StObject
     with web.typings.std.SVGFETurbulenceElement {
  
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
object SVGFETurbulenceElement {
  
  /* standard dom */
  @JSGlobal("SVGFETurbulenceElement.SVG_STITCHTYPE_NOSTITCH")
  @js.native
  val SVG_STITCHTYPE_NOSTITCH: Double = js.native
  
  /* standard dom */
  @JSGlobal("SVGFETurbulenceElement.SVG_STITCHTYPE_STITCH")
  @js.native
  val SVG_STITCHTYPE_STITCH: Double = js.native
  
  /* standard dom */
  @JSGlobal("SVGFETurbulenceElement.SVG_STITCHTYPE_UNKNOWN")
  @js.native
  val SVG_STITCHTYPE_UNKNOWN: Double = js.native
  
  /* standard dom */
  @JSGlobal("SVGFETurbulenceElement.SVG_TURBULENCE_TYPE_FRACTALNOISE")
  @js.native
  val SVG_TURBULENCE_TYPE_FRACTALNOISE: Double = js.native
  
  /* standard dom */
  @JSGlobal("SVGFETurbulenceElement.SVG_TURBULENCE_TYPE_TURBULENCE")
  @js.native
  val SVG_TURBULENCE_TYPE_TURBULENCE: Double = js.native
  
  /* standard dom */
  @JSGlobal("SVGFETurbulenceElement.SVG_TURBULENCE_TYPE_UNKNOWN")
  @js.native
  val SVG_TURBULENCE_TYPE_UNKNOWN: Double = js.native
}
