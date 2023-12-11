package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AntCls extends StObject {
  
  /** Wrap ant prefixCls class with `.` prefix */
  var antCls: String = js.native
  
  /** Wrap component class with `.` prefix */
  var componentCls: String = js.native
  
  /** Wrap icon class with `.` prefix */
  var iconCls: String = js.native
  
  /** Origin prefix which do not have `.` prefix */
  var prefixCls: String = js.native
}
object AntCls {
  
  @scala.inline
  def apply(antCls: String, componentCls: String, iconCls: String, prefixCls: String): AntCls = {
    val __obj = js.Dynamic.literal(antCls = antCls.asInstanceOf[js.Any], componentCls = componentCls.asInstanceOf[js.Any], iconCls = iconCls.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntCls]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: AntCls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAntCls(value: String): Self = StObject.set(x, "antCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentCls(value: String): Self = StObject.set(x, "componentCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconCls(value: String): Self = StObject.set(x, "iconCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
  }
}
