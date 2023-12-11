package web.typings.rcDrawer

import web.typings.rcDrawer.esDrawerMod.DrawerProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-drawer", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DrawerProps] = js.native
  
  type _To = ReactComponentClass[DrawerProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ReactComponentClass[DrawerProps] = default
}
