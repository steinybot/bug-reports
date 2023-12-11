package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowEventHandlersEventMap extends StObject {
  
  /* standard dom */
  var afterprint: org.scalajs.dom.Event = js.native
  
  /* standard dom */
  var beforeprint: org.scalajs.dom.Event = js.native
  
  /* standard dom */
  var beforeunload: org.scalajs.dom.BeforeUnloadEvent = js.native
  
  /* standard dom */
  var hashchange: org.scalajs.dom.HashChangeEvent = js.native
  
  /* standard dom */
  var languagechange: org.scalajs.dom.Event = js.native
  
  /* standard dom */
  var message: org.scalajs.dom.MessageEvent = js.native
  
  /* standard dom */
  var messageerror: org.scalajs.dom.MessageEvent = js.native
  
  /* standard dom */
  var offline: org.scalajs.dom.Event = js.native
  
  /* standard dom */
  var online: org.scalajs.dom.Event = js.native
  
  /* standard dom */
  var pagehide: PageTransitionEvent = js.native
  
  /* standard dom */
  var pageshow: PageTransitionEvent = js.native
  
  /* standard dom */
  var popstate: org.scalajs.dom.PopStateEvent = js.native
  
  /* standard dom */
  var rejectionhandled: PromiseRejectionEvent = js.native
  
  /* standard dom */
  var storage: org.scalajs.dom.StorageEvent = js.native
  
  /* standard dom */
  var unhandledrejection: PromiseRejectionEvent = js.native
  
  /* standard dom */
  var unload: org.scalajs.dom.Event = js.native
}
object WindowEventHandlersEventMap {
  
  @scala.inline
  def apply(
    afterprint: org.scalajs.dom.Event,
    beforeprint: org.scalajs.dom.Event,
    beforeunload: org.scalajs.dom.BeforeUnloadEvent,
    hashchange: org.scalajs.dom.HashChangeEvent,
    languagechange: org.scalajs.dom.Event,
    message: org.scalajs.dom.MessageEvent,
    messageerror: org.scalajs.dom.MessageEvent,
    offline: org.scalajs.dom.Event,
    online: org.scalajs.dom.Event,
    pagehide: PageTransitionEvent,
    pageshow: PageTransitionEvent,
    popstate: org.scalajs.dom.PopStateEvent,
    rejectionhandled: PromiseRejectionEvent,
    storage: org.scalajs.dom.StorageEvent,
    unhandledrejection: PromiseRejectionEvent,
    unload: org.scalajs.dom.Event
  ): WindowEventHandlersEventMap = {
    val __obj = js.Dynamic.literal(afterprint = afterprint.asInstanceOf[js.Any], beforeprint = beforeprint.asInstanceOf[js.Any], beforeunload = beforeunload.asInstanceOf[js.Any], hashchange = hashchange.asInstanceOf[js.Any], languagechange = languagechange.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any], pagehide = pagehide.asInstanceOf[js.Any], pageshow = pageshow.asInstanceOf[js.Any], popstate = popstate.asInstanceOf[js.Any], rejectionhandled = rejectionhandled.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], unhandledrejection = unhandledrejection.asInstanceOf[js.Any], unload = unload.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEventHandlersEventMap]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: WindowEventHandlersEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterprint(value: org.scalajs.dom.Event): Self = StObject.set(x, "afterprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeprint(value: org.scalajs.dom.Event): Self = StObject.set(x, "beforeprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeunload(value: org.scalajs.dom.BeforeUnloadEvent): Self = StObject.set(x, "beforeunload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashchange(value: org.scalajs.dom.HashChangeEvent): Self = StObject.set(x, "hashchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguagechange(value: org.scalajs.dom.Event): Self = StObject.set(x, "languagechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: org.scalajs.dom.MessageEvent): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageerror(value: org.scalajs.dom.MessageEvent): Self = StObject.set(x, "messageerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffline(value: org.scalajs.dom.Event): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnline(value: org.scalajs.dom.Event): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagehide(value: PageTransitionEvent): Self = StObject.set(x, "pagehide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageshow(value: PageTransitionEvent): Self = StObject.set(x, "pageshow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopstate(value: org.scalajs.dom.PopStateEvent): Self = StObject.set(x, "popstate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectionhandled(value: PromiseRejectionEvent): Self = StObject.set(x, "rejectionhandled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorage(value: org.scalajs.dom.StorageEvent): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnhandledrejection(value: PromiseRejectionEvent): Self = StObject.set(x, "unhandledrejection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnload(value: org.scalajs.dom.Event): Self = StObject.set(x, "unload", value.asInstanceOf[js.Any])
  }
}
