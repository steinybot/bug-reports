package web.typings.react.mod

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FocusEvent[Target, RelatedTarget]
  extends StObject
     with BaseSyntheticEvent[org.scalajs.dom.FocusEvent, EventTarget with Target, EventTarget] {
  
  var relatedTarget: (EventTarget with RelatedTarget) | Null = js.native
  
  @JSName("target")
  var target_FocusEvent: EventTarget with Target = js.native
}
object FocusEvent {
  
  @scala.inline
  def apply[Target, RelatedTarget](
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: EventTarget with Target,
    defaultPrevented: Boolean,
    eventPhase: Double,
    isDefaultPrevented: () => Boolean,
    isPropagationStopped: () => Boolean,
    isTrusted: Boolean,
    nativeEvent: org.scalajs.dom.FocusEvent,
    persist: () => Unit,
    preventDefault: () => Unit,
    stopPropagation: () => Unit,
    target: EventTarget with Target,
    timeStamp: Double,
    `type`: String
  ): FocusEvent[Target, RelatedTarget] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], relatedTarget = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusEvent[Target, RelatedTarget]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: FocusEvent[_, _], Target, RelatedTarget] (val x: Self with (FocusEvent[Target, RelatedTarget])) extends AnyVal {
    
    @scala.inline
    def setRelatedTarget(value: EventTarget with RelatedTarget): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedTargetNull: Self = StObject.set(x, "relatedTarget", null)
    
    @scala.inline
    def setTarget(value: EventTarget with Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
