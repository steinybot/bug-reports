package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PresetEmpty extends StObject {
  
  var presetEmpty: String = js.native
}
object PresetEmpty {
  
  @scala.inline
  def apply(presetEmpty: String): PresetEmpty = {
    val __obj = js.Dynamic.literal(presetEmpty = presetEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresetEmpty]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PresetEmpty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPresetEmpty(value: String): Self = StObject.set(x, "presetEmpty", value.asInstanceOf[js.Any])
  }
}
