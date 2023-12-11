package web.typings.antd.anon

import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Info extends StObject {
  
  var error: ReactComponentClass[PickAntdIconPropscitedata] = js.native
  
  var info: ReactComponentClass[PickAntdIconPropscitedata] = js.native
  
  var success: ReactComponentClass[PickAntdIconPropscitedata] = js.native
  
  var warning: ReactComponentClass[PickAntdIconPropscitedata] = js.native
}
object Info {
  
  @scala.inline
  def apply(
    error: ReactComponentClass[PickAntdIconPropscitedata],
    info: ReactComponentClass[PickAntdIconPropscitedata],
    success: ReactComponentClass[PickAntdIconPropscitedata],
    warning: ReactComponentClass[PickAntdIconPropscitedata]
  ): Info = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: ReactComponentClass[PickAntdIconPropscitedata]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: ReactComponentClass[PickAntdIconPropscitedata]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: ReactComponentClass[PickAntdIconPropscitedata]): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarning(value: ReactComponentClass[PickAntdIconPropscitedata]): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}
