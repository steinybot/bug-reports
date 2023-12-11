package web.typings.antd

import web.typings.antd.esSkeletonSkeletonMod.CompoundedComponent
import web.typings.antd.esSkeletonSkeletonMod.SkeletonProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSkeletonMod extends Shortcut {
  
  @JSImport("antd/es/skeleton", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SkeletonProps] with CompoundedComponent = js.native
  
  type _To = ReactComponentClass[SkeletonProps] with CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `esSkeletonMod.foo` */
  override def _to: ReactComponentClass[SkeletonProps] with CompoundedComponent = default
}
