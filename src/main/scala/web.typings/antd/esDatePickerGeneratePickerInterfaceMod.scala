package web.typings.antd

import web.typings.antd.esDatePickerGeneratePickerMod.PickerProps
import web.typings.antd.esDatePickerGeneratePickerMod.RangePickerProps
import web.typings.react.mod.ComponentClass
import web.typings.react.mod.ForwardedRef
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDatePickerGeneratePickerInterfaceMod {
  
  @js.native
  trait CommonPickerMethods extends StObject {
    
    def blur(): Unit = js.native
    
    def focus(): Unit = js.native
  }
  object CommonPickerMethods {
    
    @scala.inline
    def apply(blur: () => Unit, focus: () => Unit): CommonPickerMethods = {
      val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[CommonPickerMethods]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CommonPickerMethods] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  type DatePickRef[DateType] = PickerRef[PickerProps[DateType]]
  
  @js.native
  trait PickerComponentClass[P, S]
    extends StObject
       with ComponentClass[P, S]
  
  type PickerRef[P] = ForwardedRef[ReactComponentClass[P] with CommonPickerMethods]
  
  type RangePickerRef[DateType] = PickerRef[RangePickerProps[DateType]]
}
