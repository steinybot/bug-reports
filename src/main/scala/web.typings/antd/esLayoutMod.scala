package web.typings.antd

import web.typings.antd.esLayoutLayoutMod.BasicProps
import web.typings.antd.esLayoutSiderMod.SiderContextProps
import web.typings.antd.esLayoutSiderMod.SiderProps
import web.typings.react.mod.Context
import web.typings.react.mod.ForwardRefExoticComponent
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLayoutMod extends Shortcut {
  
  @JSImport("antd/es/layout", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  @js.native
  trait CompoundedComponent
    extends StObject
       with ForwardRefExoticComponent[BasicProps with RefAttributes[HTMLElement]] {
    
    var Content: ReactComponentClass[BasicProps with RefAttributes[HTMLElement]] = js.native
    
    var Footer: ReactComponentClass[BasicProps with RefAttributes[HTMLElement]] = js.native
    
    var Header: ReactComponentClass[BasicProps with RefAttributes[HTMLElement]] = js.native
    
    var Sider: ReactComponentClass[SiderProps with RefAttributes[HTMLDivElement]] = js.native
    
    /** @private Internal Context. Do not use in your production. */
    var _InternalSiderContext: Context[SiderContextProps] = js.native
  }
  
  type InternalLayoutType = ReactComponentClass[BasicProps with RefAttributes[HTMLElement]]
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `esLayoutMod.foo` */
  override def _to: CompoundedComponent = default
}
