package web.typings.antd.anon

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeElement[NativeELementType /* <: HTMLElement */] extends StObject {
  
  var nativeElement: NativeELementType = js.native
}
object NativeElement {
  
  @scala.inline
  def apply[NativeELementType /* <: HTMLElement */](nativeElement: NativeELementType): NativeElement[NativeELementType] = {
    val __obj = js.Dynamic.literal(nativeElement = nativeElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeElement[NativeELementType]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: NativeElement[_], NativeELementType /* <: HTMLElement */] (val x: Self with NativeElement[NativeELementType]) extends AnyVal {
    
    @scala.inline
    def setNativeElement(value: NativeELementType): Self = StObject.set(x, "nativeElement", value.asInstanceOf[js.Any])
  }
}
