package web.typings.std.global

import web.typings.std.AddEventListenerOptions
import web.typings.std.EventListenerOrEventListenerObject
import org.scalajs.dom.EventListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SVGTextPathElement")
@js.native
/* standard dom */
class SVGTextPathElement ()
  extends StObject
     with web.typings.std.SVGTextPathElement {
  
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
object SVGTextPathElement {
  
  /* standard dom */
  @JSGlobal("SVGTextPathElement.TEXTPATH_METHODTYPE_ALIGN")
  @js.native
  val TEXTPATH_METHODTYPE_ALIGN: Double = js.native
  
  /* standard dom */
  @JSGlobal("SVGTextPathElement.TEXTPATH_METHODTYPE_STRETCH")
  @js.native
  val TEXTPATH_METHODTYPE_STRETCH: Double = js.native
  
  /* standard dom */
  @JSGlobal("SVGTextPathElement.TEXTPATH_METHODTYPE_UNKNOWN")
  @js.native
  val TEXTPATH_METHODTYPE_UNKNOWN: Double = js.native
  
  /* standard dom */
  @JSGlobal("SVGTextPathElement.TEXTPATH_SPACINGTYPE_AUTO")
  @js.native
  val TEXTPATH_SPACINGTYPE_AUTO: Double = js.native
  
  /* standard dom */
  @JSGlobal("SVGTextPathElement.TEXTPATH_SPACINGTYPE_EXACT")
  @js.native
  val TEXTPATH_SPACINGTYPE_EXACT: Double = js.native
  
  /* standard dom */
  @JSGlobal("SVGTextPathElement.TEXTPATH_SPACINGTYPE_UNKNOWN")
  @js.native
  val TEXTPATH_SPACINGTYPE_UNKNOWN: Double = js.native
}
