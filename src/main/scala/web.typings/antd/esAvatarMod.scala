package web.typings.antd

import web.typings.antd.esAvatarAvatarMod.AvatarProps
import web.typings.antd.esAvatarGroupMod.GroupProps
import web.typings.react.mod.ForwardRefExoticComponent
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLSpanElement
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAvatarMod extends Shortcut {
  
  @JSImport("antd/es/avatar", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  @JSImport("antd/es/avatar", "Group")
  @js.native
  val Group: ReactComponentClass[GroupProps] = js.native
  
  @js.native
  trait CompoundedComponent
    extends StObject
       with ForwardRefExoticComponent[AvatarProps with RefAttributes[HTMLSpanElement]] {
    
    var Group: ReactComponentClass[GroupProps] = js.native
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `esAvatarMod.foo` */
  override def _to: CompoundedComponent = default
}
