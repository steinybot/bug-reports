package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A message received by a target object. */
@js.native
trait MessageEvent[T]
  extends StObject
     with Event {
  
  /**
    * Returns the data of the message.
    */
  /* standard dom */
  val data: T = js.native
  
  /**
    * Returns the last event ID string, for server-sent events.
    */
  /* standard dom */
  val lastEventId: java.lang.String = js.native
  
  /**
    * Returns the origin of the message, for server-sent events and cross-document messaging.
    */
  /* standard dom */
  val origin: java.lang.String = js.native
  
  /**
    * Returns the MessagePort array sent with the message, for cross-document messaging and channel messaging.
    */
  /* standard dom */
  val ports: js.Array[org.scalajs.dom.MessagePort] = js.native
  
  /**
    * Returns the WindowProxy of the source window, for cross-document messaging, and the MessagePort being attached, in the connect event fired at SharedWorkerGlobalScope objects.
    */
  /* standard dom */
  val source: MessageEventSource | Null = js.native
}
