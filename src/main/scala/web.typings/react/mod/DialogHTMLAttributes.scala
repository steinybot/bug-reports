package web.typings.react.mod

import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var onCancel: js.UndefOr[ReactEventHandler[T]] = js.native
  
  var onClose: js.UndefOr[ReactEventHandler[T]] = js.native
  
  var open: js.UndefOr[Boolean] = js.native
}
object DialogHTMLAttributes {
  
  @scala.inline
  def apply[T](): DialogHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: DialogHTMLAttributes[_], T] (val x: Self with DialogHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setOnCancel(value: slinky.core.SyntheticEvent[Event, T] => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
    @scala.inline
    def setOnClose(value: slinky.core.SyntheticEvent[Event, T] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
