package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A legacy interface kept for backwards compatibility and contains properties that offer performance timing information for various events which occur during the loading and use of the current page. You get a PerformanceTiming object describing your page using the window.performance.timing property.
  * @deprecated This interface is deprecated in the Navigation Timing Level 2 specification. Please use the PerformanceNavigationTiming interface instead.
  */
@js.native
trait PerformanceTiming extends StObject {
  
  /* standard dom */
  val connectEnd: Double = js.native
  
  /* standard dom */
  val connectStart: Double = js.native
  
  /* standard dom */
  val domComplete: Double = js.native
  
  /* standard dom */
  val domContentLoadedEventEnd: Double = js.native
  
  /* standard dom */
  val domContentLoadedEventStart: Double = js.native
  
  /* standard dom */
  val domInteractive: Double = js.native
  
  /* standard dom */
  val domLoading: Double = js.native
  
  /* standard dom */
  val domainLookupEnd: Double = js.native
  
  /* standard dom */
  val domainLookupStart: Double = js.native
  
  /* standard dom */
  val fetchStart: Double = js.native
  
  /* standard dom */
  val loadEventEnd: Double = js.native
  
  /* standard dom */
  val loadEventStart: Double = js.native
  
  /* standard dom */
  val navigationStart: Double = js.native
  
  /* standard dom */
  val redirectEnd: Double = js.native
  
  /* standard dom */
  val redirectStart: Double = js.native
  
  /* standard dom */
  val requestStart: Double = js.native
  
  /* standard dom */
  val responseEnd: Double = js.native
  
  /* standard dom */
  val responseStart: Double = js.native
  
  /* standard dom */
  val secureConnectionStart: Double = js.native
  
  /* standard dom */
  def toJSON(): Any = js.native
  
  /* standard dom */
  val unloadEventEnd: Double = js.native
  
  /* standard dom */
  val unloadEventStart: Double = js.native
}
object PerformanceTiming {
  
  @scala.inline
  def apply(
    connectEnd: Double,
    connectStart: Double,
    domComplete: Double,
    domContentLoadedEventEnd: Double,
    domContentLoadedEventStart: Double,
    domInteractive: Double,
    domLoading: Double,
    domainLookupEnd: Double,
    domainLookupStart: Double,
    fetchStart: Double,
    loadEventEnd: Double,
    loadEventStart: Double,
    navigationStart: Double,
    redirectEnd: Double,
    redirectStart: Double,
    requestStart: Double,
    responseEnd: Double,
    responseStart: Double,
    secureConnectionStart: Double,
    toJSON: () => Any,
    unloadEventEnd: Double,
    unloadEventStart: Double
  ): PerformanceTiming = {
    val __obj = js.Dynamic.literal(connectEnd = connectEnd.asInstanceOf[js.Any], connectStart = connectStart.asInstanceOf[js.Any], domComplete = domComplete.asInstanceOf[js.Any], domContentLoadedEventEnd = domContentLoadedEventEnd.asInstanceOf[js.Any], domContentLoadedEventStart = domContentLoadedEventStart.asInstanceOf[js.Any], domInteractive = domInteractive.asInstanceOf[js.Any], domLoading = domLoading.asInstanceOf[js.Any], domainLookupEnd = domainLookupEnd.asInstanceOf[js.Any], domainLookupStart = domainLookupStart.asInstanceOf[js.Any], fetchStart = fetchStart.asInstanceOf[js.Any], loadEventEnd = loadEventEnd.asInstanceOf[js.Any], loadEventStart = loadEventStart.asInstanceOf[js.Any], navigationStart = navigationStart.asInstanceOf[js.Any], redirectEnd = redirectEnd.asInstanceOf[js.Any], redirectStart = redirectStart.asInstanceOf[js.Any], requestStart = requestStart.asInstanceOf[js.Any], responseEnd = responseEnd.asInstanceOf[js.Any], responseStart = responseStart.asInstanceOf[js.Any], secureConnectionStart = secureConnectionStart.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), unloadEventEnd = unloadEventEnd.asInstanceOf[js.Any], unloadEventStart = unloadEventStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceTiming]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PerformanceTiming] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectEnd(value: Double): Self = StObject.set(x, "connectEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectStart(value: Double): Self = StObject.set(x, "connectStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomComplete(value: Double): Self = StObject.set(x, "domComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomContentLoadedEventEnd(value: Double): Self = StObject.set(x, "domContentLoadedEventEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomContentLoadedEventStart(value: Double): Self = StObject.set(x, "domContentLoadedEventStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomInteractive(value: Double): Self = StObject.set(x, "domInteractive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomLoading(value: Double): Self = StObject.set(x, "domLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainLookupEnd(value: Double): Self = StObject.set(x, "domainLookupEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainLookupStart(value: Double): Self = StObject.set(x, "domainLookupStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchStart(value: Double): Self = StObject.set(x, "fetchStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadEventEnd(value: Double): Self = StObject.set(x, "loadEventEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadEventStart(value: Double): Self = StObject.set(x, "loadEventStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationStart(value: Double): Self = StObject.set(x, "navigationStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectEnd(value: Double): Self = StObject.set(x, "redirectEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectStart(value: Double): Self = StObject.set(x, "redirectStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestStart(value: Double): Self = StObject.set(x, "requestStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseEnd(value: Double): Self = StObject.set(x, "responseEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseStart(value: Double): Self = StObject.set(x, "responseStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureConnectionStart(value: Double): Self = StObject.set(x, "secureConnectionStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnloadEventEnd(value: Double): Self = StObject.set(x, "unloadEventEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnloadEventStart(value: Double): Self = StObject.set(x, "unloadEventStart", value.asInstanceOf[js.Any])
  }
}
