package web.typings.rcComponentTour

import web.typings.rcComponentTour.esTourMod.TourProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@rc-component/tour", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TourProps] = js.native
  
  type _To = ReactComponentClass[TourProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ReactComponentClass[TourProps] = default
}
