package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Corresponds to the <pattern> element. */
@js.native
trait SVGPatternElement
  extends StObject
     with SVGElement
     with SVGFitToViewBox
     with SVGURIReference {
  
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
  val height: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /* standard dom */
  val patternContentUnits: org.scalajs.dom.SVGAnimatedEnumeration = js.native
  
  /* standard dom */
  val patternTransform: org.scalajs.dom.SVGAnimatedTransformList = js.native
  
  /* standard dom */
  val patternUnits: org.scalajs.dom.SVGAnimatedEnumeration = js.native
  
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
  val width: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /* standard dom */
  val x: org.scalajs.dom.SVGAnimatedLength = js.native
  
  /* standard dom */
  val y: org.scalajs.dom.SVGAnimatedLength = js.native
}
