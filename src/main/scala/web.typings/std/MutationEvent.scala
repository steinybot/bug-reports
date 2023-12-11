package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides event properties that are specific to modifications to the Document Object Model (DOM) hierarchy and nodes.
  * @deprecated DOM4 [DOM] provides a new mechanism using a MutationObserver interface which addresses the use cases that mutation events solve, but in a more performant manner. Thus, this specification describes mutation events for reference and completeness of legacy behavior, but deprecates the use of the MutationEvent interface. */
@js.native
trait MutationEvent
  extends StObject
     with Event {
  
  /* standard dom */
  val ADDITION: Double = js.native
  
  /* standard dom */
  val MODIFICATION: Double = js.native
  
  /* standard dom */
  val REMOVAL: Double = js.native
  
  /* standard dom */
  val attrChange: Double = js.native
  
  /* standard dom */
  val attrName: java.lang.String = js.native
  
  /* standard dom */
  def initMutationEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    relatedNodeArg: org.scalajs.dom.Node,
    prevValueArg: java.lang.String,
    newValueArg: java.lang.String,
    attrNameArg: java.lang.String,
    attrChangeArg: Double
  ): Unit = js.native
  
  /* standard dom */
  val newValue: java.lang.String = js.native
  
  /* standard dom */
  val prevValue: java.lang.String = js.native
  
  /* standard dom */
  val relatedNode: org.scalajs.dom.Node = js.native
}
