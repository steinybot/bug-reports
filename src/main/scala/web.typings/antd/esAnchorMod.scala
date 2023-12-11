package web.typings.antd

import web.typings.antd.esAnchorAnchorLinkMod.AnchorLinkProps
import web.typings.antd.esAnchorAnchorMod.AnchorProps
import web.typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAnchorMod extends Shortcut {
  
  @JSImport("antd/es/anchor", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  @js.native
  trait CompoundedComponent
    extends StObject
       with FunctionComponent[AnchorProps] {
    
    var Link: ReactComponentClass[AnchorLinkProps] = js.native
  }
  
  type InternalAnchorType = ReactComponentClass[AnchorProps]
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `esAnchorMod.foo` */
  override def _to: CompoundedComponent = default
}
