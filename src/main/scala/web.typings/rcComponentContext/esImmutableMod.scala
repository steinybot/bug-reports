package web.typings.rcComponentContext

import web.typings.rcComponentContext.anon.MakeImmutable
import web.typings.react.mod.ComponentProps
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esImmutableMod {
  
  @JSImport("@rc-component/context/es/Immutable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): MakeImmutable = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[MakeImmutable]
  
  type CompareProps[T /* <: ReactComponentClass[Any] */] = js.Function2[/* prevProps */ ComponentProps[T], /* nextProps */ ComponentProps[T], Boolean]
}
