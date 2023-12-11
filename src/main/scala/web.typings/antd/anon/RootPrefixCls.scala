package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RootPrefixCls extends StObject {
  
  var rootPrefixCls: String = js.native
}
object RootPrefixCls {
  
  @scala.inline
  def apply(rootPrefixCls: String): RootPrefixCls = {
    val __obj = js.Dynamic.literal(rootPrefixCls = rootPrefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootPrefixCls]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: RootPrefixCls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRootPrefixCls(value: String): Self = StObject.set(x, "rootPrefixCls", value.asInstanceOf[js.Any])
  }
}
