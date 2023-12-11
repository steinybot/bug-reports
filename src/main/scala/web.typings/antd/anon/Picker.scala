package web.typings.antd.anon

import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Picker extends StObject {
  
  var Picker: ReactComponentClass[js.Object] = js.native
  
  var Presets: ReactComponentClass[js.Object] = js.native
}
object Picker {
  
  @scala.inline
  def apply(Picker: ReactComponentClass[js.Object], Presets: ReactComponentClass[js.Object]): Picker = {
    val __obj = js.Dynamic.literal(Picker = Picker.asInstanceOf[js.Any], Presets = Presets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Picker]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Picker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPicker(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "Picker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresets(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "Presets", value.asInstanceOf[js.Any])
  }
}
