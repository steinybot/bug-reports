package web.typings.std.global

import web.typings.std.AddEventListenerOptions
import web.typings.std.EventListenerOrEventListenerObject
import org.scalajs.dom.EventListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SVGFECompositeElement")
@js.native
/* standard dom */
class SVGFECompositeElement ()
  extends StObject
     with web.typings.std.SVGFECompositeElement {
  
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
object SVGFECompositeElement {
  
  /* standard dom */
  @JSGlobal("SVGFECompositeElement.SVG_FECOMPOSITE_OPERATOR_ARITHMETIC")
  @js.native
  val SVG_FECOMPOSITE_OPERATOR_ARITHMETIC: Double = js.native
  
  /* standard dom */
  @JSGlobal("SVGFECompositeElement.SVG_FECOMPOSITE_OPERATOR_ATOP")
  @js.native
  val SVG_FECOMPOSITE_OPERATOR_ATOP: Double = js.native
  
  /* standard dom */
  @JSGlobal("SVGFECompositeElement.SVG_FECOMPOSITE_OPERATOR_IN")
  @js.native
  val SVG_FECOMPOSITE_OPERATOR_IN: Double = js.native
  
  /* standard dom */
  @JSGlobal("SVGFECompositeElement.SVG_FECOMPOSITE_OPERATOR_OUT")
  @js.native
  val SVG_FECOMPOSITE_OPERATOR_OUT: Double = js.native
  
  /* standard dom */
  @JSGlobal("SVGFECompositeElement.SVG_FECOMPOSITE_OPERATOR_OVER")
  @js.native
  val SVG_FECOMPOSITE_OPERATOR_OVER: Double = js.native
  
  /* standard dom */
  @JSGlobal("SVGFECompositeElement.SVG_FECOMPOSITE_OPERATOR_UNKNOWN")
  @js.native
  val SVG_FECOMPOSITE_OPERATOR_UNKNOWN: Double = js.native
  
  /* standard dom */
  @JSGlobal("SVGFECompositeElement.SVG_FECOMPOSITE_OPERATOR_XOR")
  @js.native
  val SVG_FECOMPOSITE_OPERATOR_XOR: Double = js.native
}
