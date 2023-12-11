package web.typings.std.global

import web.typings.std.AddEventListenerOptions
import web.typings.std.EventListenerOrEventListenerObject
import org.scalajs.dom.EventListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SVGFEConvolveMatrixElement")
@js.native
/* standard dom */
class SVGFEConvolveMatrixElement ()
  extends StObject
     with web.typings.std.SVGFEConvolveMatrixElement {
  
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
object SVGFEConvolveMatrixElement {
  
  /* standard dom */
  @JSGlobal("SVGFEConvolveMatrixElement.SVG_EDGEMODE_DUPLICATE")
  @js.native
  val SVG_EDGEMODE_DUPLICATE: Double = js.native
  
  /* standard dom */
  @JSGlobal("SVGFEConvolveMatrixElement.SVG_EDGEMODE_NONE")
  @js.native
  val SVG_EDGEMODE_NONE: Double = js.native
  
  /* standard dom */
  @JSGlobal("SVGFEConvolveMatrixElement.SVG_EDGEMODE_UNKNOWN")
  @js.native
  val SVG_EDGEMODE_UNKNOWN: Double = js.native
  
  /* standard dom */
  @JSGlobal("SVGFEConvolveMatrixElement.SVG_EDGEMODE_WRAP")
  @js.native
  val SVG_EDGEMODE_WRAP: Double = js.native
}
