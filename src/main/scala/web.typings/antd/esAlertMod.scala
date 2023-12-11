package web.typings.antd

import web.typings.antd.esAlertAlertMod.AlertProps
import web.typings.antd.esAlertErrorBoundaryMod.default
import web.typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAlertMod {
  
  object default extends Shortcut {
    
    @JSImport("antd/es/alert", JSImport.Default)
    @js.native
    val ^ : CompoundedComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("antd/es/alert", "default.ErrorBoundary")
    @js.native
    class ErrorBoundary ()
      extends web.typings.antd.esAlertErrorBoundaryMod.default
    
    type _To = CompoundedComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CompoundedComponent = ^
  }
  
  @js.native
  trait CompoundedComponent
    extends StObject
       with FunctionComponent[AlertProps] {
    
    var ErrorBoundary: Instantiable0[default] = js.native
  }
}
