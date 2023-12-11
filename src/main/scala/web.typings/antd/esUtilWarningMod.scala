package web.typings.antd

import web.typings.antd.antdStrings.breaking
import web.typings.antd.antdStrings.deprecated
import web.typings.antd.antdStrings.usage
import web.typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilWarningMod {
  
  @JSImport("antd/es/_util/warning", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd/es/_util/warning", JSImport.Default)
  @js.native
  def default: Warning = js.native
  
  @JSImport("antd/es/_util/warning", "WarningContext")
  @js.native
  val WarningContext: Context[WarningContextProps] = js.native
  
  @scala.inline
  def default_=(x: Warning): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def devUseWarning(component: String): TypeWarning = ^.asInstanceOf[js.Dynamic].applyDynamic("devUseWarning")(component.asInstanceOf[js.Any]).asInstanceOf[TypeWarning]
  
  @scala.inline
  def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  @scala.inline
  def resetWarned(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetWarned")().asInstanceOf[Unit]
  
  type BaseTypeWarning = js.Function3[
    /* valid */ Boolean, 
    /* type */ deprecated | usage | breaking, 
    /* message */ js.UndefOr[String], 
    Unit
  ]
  
  @js.native
  trait TypeWarning extends BaseTypeWarning {
    
    def deprecated(valid: Boolean, oldProp: String, newProp: String): Unit = js.native
    def deprecated(valid: Boolean, oldProp: String, newProp: String, message: String): Unit = js.native
  }
  
  type Warning = js.Function3[/* valid */ Boolean, /* component */ String, /* message */ js.UndefOr[String], Unit]
  
  @js.native
  trait WarningContextProps extends StObject {
    
    var strict: js.UndefOr[Boolean] = js.native
  }
  object WarningContextProps {
    
    @scala.inline
    def apply(): WarningContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WarningContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: WarningContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
}
