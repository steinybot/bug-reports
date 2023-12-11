package web.typings.rcImage

import web.typings.rcImage.libInterfaceMod.OnGroupPreview
import web.typings.rcImage.libInterfaceMod.PreviewImageElementProps
import web.typings.rcImage.libInterfaceMod.RegisterImage
import web.typings.react.mod.Context
import web.typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextMod {
  
  @JSImport("rc-image/lib/context", "PreviewGroupContext")
  @js.native
  val PreviewGroupContext: Context[PreviewGroupContextProps] = js.native
  
  @js.native
  trait PreviewGroupContextProps extends StObject {
    
    var onPreview: OnGroupPreview = js.native
    
    var register: RegisterImage = js.native
  }
  object PreviewGroupContextProps {
    
    @scala.inline
    def apply(
      onPreview: (/* id */ String, /* mouseX */ Double, /* mouseY */ Double) => Unit,
      register: (/* id */ String, /* data */ PreviewImageElementProps) => VoidFunction
    ): PreviewGroupContextProps = {
      val __obj = js.Dynamic.literal(onPreview = js.Any.fromFunction3(onPreview), register = js.Any.fromFunction2(register))
      __obj.asInstanceOf[PreviewGroupContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PreviewGroupContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnPreview(value: (/* id */ String, /* mouseX */ Double, /* mouseY */ Double) => Unit): Self = StObject.set(x, "onPreview", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRegister(value: (/* id */ String, /* data */ PreviewImageElementProps) => VoidFunction): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
    }
  }
}
