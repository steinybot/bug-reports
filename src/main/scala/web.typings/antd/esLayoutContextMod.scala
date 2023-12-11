package web.typings.antd

import web.typings.antd.anon.AddSider
import web.typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLayoutContextMod {
  
  @JSImport("antd/es/layout/context", "LayoutContext")
  @js.native
  val LayoutContext: Context[LayoutContextProps] = js.native
  
  @js.native
  trait LayoutContextProps extends StObject {
    
    var siderHook: AddSider = js.native
  }
  object LayoutContextProps {
    
    @scala.inline
    def apply(siderHook: AddSider): LayoutContextProps = {
      val __obj = js.Dynamic.literal(siderHook = siderHook.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: LayoutContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSiderHook(value: AddSider): Self = StObject.set(x, "siderHook", value.asInstanceOf[js.Any])
    }
  }
}
