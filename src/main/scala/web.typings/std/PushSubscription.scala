package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Push API interface provides a subcription's URL endpoint and allows unsubscription from a push service. */
@js.native
trait PushSubscription extends StObject {
  
  /* standard dom */
  val endpoint: java.lang.String = js.native
  
  /* standard dom */
  val expirationTime: Double | Null = js.native
  
  /* standard dom */
  def getKey(name: org.scalajs.dom.PushEncryptionKeyName): js.typedarray.ArrayBuffer | Null = js.native
  
  /* standard dom */
  val options: org.scalajs.dom.PushSubscriptionOptions = js.native
  
  /* standard dom */
  def toJSON(): org.scalajs.dom.PushSubscriptionJSON = js.native
  
  /* standard dom */
  def unsubscribe(): js.Promise[scala.Boolean] = js.native
}
object PushSubscription {
  
  @scala.inline
  def apply(
    endpoint: java.lang.String,
    getKey: org.scalajs.dom.PushEncryptionKeyName => js.typedarray.ArrayBuffer | Null,
    options: org.scalajs.dom.PushSubscriptionOptions,
    toJSON: () => org.scalajs.dom.PushSubscriptionJSON,
    unsubscribe: () => js.Promise[scala.Boolean]
  ): PushSubscription = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], getKey = js.Any.fromFunction1(getKey), options = options.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), unsubscribe = js.Any.fromFunction0(unsubscribe), expirationTime = null)
    __obj.asInstanceOf[PushSubscription]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PushSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoint(value: java.lang.String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTime(value: Double): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTimeNull: Self = StObject.set(x, "expirationTime", null)
    
    @scala.inline
    def setGetKey(value: org.scalajs.dom.PushEncryptionKeyName => js.typedarray.ArrayBuffer | Null): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptions(value: org.scalajs.dom.PushSubscriptionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => org.scalajs.dom.PushSubscriptionJSON): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnsubscribe(value: () => js.Promise[scala.Boolean]): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
  }
}
