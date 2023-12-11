package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Fetch API interface represents a resource request. */
@js.native
trait Request
  extends StObject
     with Body {
  
  /**
    * Returns the cache mode associated with request, which is a string indicating how the request will interact with the browser's cache when fetching.
    */
  /* standard dom */
  val cache: org.scalajs.dom.RequestCache = js.native
  
  /**
    * Returns the credentials mode associated with request, which is a string indicating whether credentials will be sent with the request always, never, or only when sent to a same-origin URL.
    */
  /* standard dom */
  val credentials: org.scalajs.dom.RequestCredentials = js.native
  
  /**
    * Returns the kind of resource requested by request, e.g., "document" or "script".
    */
  /* standard dom */
  val destination: org.scalajs.dom.RequestDestination = js.native
  
  /**
    * Returns a Headers object consisting of the headers associated with request. Note that headers added in the network layer by the user agent will not be accounted for in this object, e.g., the "Host" header.
    */
  /* standard dom */
  val headers: org.scalajs.dom.Headers = js.native
  
  /**
    * Returns request's subresource integrity metadata, which is a cryptographic hash of the resource being fetched. Its value consists of multiple hashes separated by whitespace. [SRI]
    */
  /* standard dom */
  val integrity: java.lang.String = js.native
  
  /**
    * Returns a boolean indicating whether or not request is for a history navigation (a.k.a. back-foward navigation).
    */
  /* standard dom */
  val isHistoryNavigation: scala.Boolean = js.native
  
  /**
    * Returns a boolean indicating whether or not request is for a reload navigation.
    */
  /* standard dom */
  val isReloadNavigation: scala.Boolean = js.native
  
  /**
    * Returns a boolean indicating whether or not request can outlive the global in which it was created.
    */
  /* standard dom */
  val keepalive: scala.Boolean = js.native
  
  /**
    * Returns request's HTTP method, which is "GET" by default.
    */
  /* standard dom */
  val method: java.lang.String = js.native
  
  /**
    * Returns the mode associated with request, which is a string indicating whether the request will use CORS, or will be restricted to same-origin URLs.
    */
  /* standard dom */
  val mode: org.scalajs.dom.RequestMode = js.native
  
  /**
    * Returns the redirect mode associated with request, which is a string indicating how redirects for the request will be handled during fetching. A request will follow redirects by default.
    */
  /* standard dom */
  val redirect: org.scalajs.dom.RequestRedirect = js.native
  
  /**
    * Returns the referrer of request. Its value can be a same-origin URL if explicitly set in init, the empty string to indicate no referrer, and "about:client" when defaulting to the global's default. This is used during fetching to determine the value of the `Referer` header of the request being made.
    */
  /* standard dom */
  val referrer: java.lang.String = js.native
  
  /**
    * Returns the referrer policy associated with request. This is used during fetching to compute the value of the request's referrer.
    */
  /* standard dom */
  val referrerPolicy: org.scalajs.dom.ReferrerPolicy = js.native
  
  /**
    * Returns the signal associated with request, which is an AbortSignal object indicating whether or not request has been aborted, and its abort event handler.
    */
  /* standard dom */
  val signal: org.scalajs.dom.AbortSignal = js.native
  
  /**
    * Returns the URL of request as a string.
    */
  /* standard dom */
  val url: java.lang.String = js.native
}
object Request {
  
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
    blob: () => js.Promise[org.scalajs.dom.Blob],
    bodyUsed: scala.Boolean,
    cache: org.scalajs.dom.RequestCache,
    credentials: org.scalajs.dom.RequestCredentials,
    destination: org.scalajs.dom.RequestDestination,
    formData: () => js.Promise[org.scalajs.dom.FormData],
    headers: org.scalajs.dom.Headers,
    integrity: java.lang.String,
    isHistoryNavigation: scala.Boolean,
    isReloadNavigation: scala.Boolean,
    json: () => js.Promise[Any],
    keepalive: scala.Boolean,
    method: java.lang.String,
    mode: org.scalajs.dom.RequestMode,
    redirect: org.scalajs.dom.RequestRedirect,
    referrer: java.lang.String,
    referrerPolicy: org.scalajs.dom.ReferrerPolicy,
    signal: org.scalajs.dom.AbortSignal,
    text: () => js.Promise[java.lang.String],
    url: java.lang.String
  ): Request = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), headers = headers.asInstanceOf[js.Any], integrity = integrity.asInstanceOf[js.Any], isHistoryNavigation = isHistoryNavigation.asInstanceOf[js.Any], isReloadNavigation = isReloadNavigation.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), keepalive = keepalive.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], referrerPolicy = referrerPolicy.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), url = url.asInstanceOf[js.Any], body = null)
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCache(value: org.scalajs.dom.RequestCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentials(value: org.scalajs.dom.RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination(value: org.scalajs.dom.RequestDestination): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: org.scalajs.dom.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegrity(value: java.lang.String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHistoryNavigation(value: scala.Boolean): Self = StObject.set(x, "isHistoryNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReloadNavigation(value: scala.Boolean): Self = StObject.set(x, "isReloadNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepalive(value: scala.Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: java.lang.String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: org.scalajs.dom.RequestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirect(value: org.scalajs.dom.RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrer(value: java.lang.String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerPolicy(value: org.scalajs.dom.ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignal(value: org.scalajs.dom.AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
