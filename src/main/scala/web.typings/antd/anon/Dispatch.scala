package web.typings.antd.anon

import web.typings.antd.esUtilResponsiveObserverMod.BreakpointMap
import web.typings.antd.esUtilResponsiveObserverMod.ScreenMap
import web.typings.antd.esUtilResponsiveObserverMod.SubscribeFunc
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dispatch extends StObject {
  
  def dispatch(pointMap: ScreenMap): Boolean = js.native
  
  var matchHandlers: StringDictionary[Listener] = js.native
  
  def register(): scala.Unit = js.native
  
  var responsiveMap: BreakpointMap = js.native
  
  def subscribe(func: SubscribeFunc): Double = js.native
  
  def unregister(): scala.Unit = js.native
  
  def unsubscribe(paramToken: Double): scala.Unit = js.native
}
object Dispatch {
  
  @scala.inline
  def apply(
    dispatch: ScreenMap => Boolean,
    matchHandlers: StringDictionary[Listener],
    register: () => scala.Unit,
    responsiveMap: BreakpointMap,
    subscribe: SubscribeFunc => Double,
    unregister: () => scala.Unit,
    unsubscribe: Double => scala.Unit
  ): Dispatch = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), matchHandlers = matchHandlers.asInstanceOf[js.Any], register = js.Any.fromFunction0(register), responsiveMap = responsiveMap.asInstanceOf[js.Any], subscribe = js.Any.fromFunction1(subscribe), unregister = js.Any.fromFunction0(unregister), unsubscribe = js.Any.fromFunction1(unsubscribe))
    __obj.asInstanceOf[Dispatch]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Dispatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispatch(value: ScreenMap => Boolean): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMatchHandlers(value: StringDictionary[Listener]): Self = StObject.set(x, "matchHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegister(value: () => scala.Unit): Self = StObject.set(x, "register", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResponsiveMap(value: BreakpointMap): Self = StObject.set(x, "responsiveMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribe(value: SubscribeFunc => Double): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnregister(value: () => scala.Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnsubscribe(value: Double => scala.Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction1(value))
  }
}
