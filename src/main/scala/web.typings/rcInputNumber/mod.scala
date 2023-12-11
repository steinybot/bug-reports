package web.typings.rcInputNumber

import web.typings.rcComponentMiniDecimal.esInterfaceMod.ValueType
import web.typings.rcInputNumber.anon.Children
import web.typings.rcInputNumber.anon.DisplayName
import web.typings.rcInputNumber.esInputNumberMod.InputNumberProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-input-number", JSImport.Default)
  @js.native
  val default: (js.Function1[/* props */ Children with InputNumberProps[ValueType], ReactElement]) with DisplayName = js.native
  
  type _To = (js.Function1[/* props */ Children with InputNumberProps[ValueType], ReactElement]) with DisplayName
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: (js.Function1[/* props */ Children with InputNumberProps[ValueType], ReactElement]) with DisplayName = default
}
