package web.typings.rcTable.libInterfaceMod

import org.scalajs.dom.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reference extends StObject {
  
  var nativeElement: HTMLDivElement = js.native
  
  def scrollTo(config: ScrollConfig): Unit = js.native
}
object Reference {
  
  @scala.inline
  def apply(nativeElement: HTMLDivElement, scrollTo: ScrollConfig => Unit): Reference = {
    val __obj = js.Dynamic.literal(nativeElement = nativeElement.asInstanceOf[js.Any], scrollTo = js.Any.fromFunction1(scrollTo))
    __obj.asInstanceOf[Reference]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Reference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNativeElement(value: HTMLDivElement): Self = StObject.set(x, "nativeElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTo(value: ScrollConfig => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1(value))
  }
}
