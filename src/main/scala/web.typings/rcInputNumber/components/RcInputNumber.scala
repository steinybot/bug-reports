package web.typings.rcInputNumber.components

import web.typings.rcComponentMiniDecimal.esInterfaceMod.ValueType
import web.typings.rcInputNumber.anon.Children
import web.typings.rcInputNumber.esInputNumberMod.InputNumberProps
import org.scalajs.dom.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcInputNumber {
  
  @JSImport("rc-input-number", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = /* props */ Children with InputNumberProps[ValueType]
  
  implicit def make(companion: RcInputNumber.type): SharedBuilder_ChildrenInputNumberProps2052148856[HTMLInputElement] = new SharedBuilder_ChildrenInputNumberProps2052148856[HTMLInputElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: /* props */ Children with InputNumberProps[ValueType]): SharedBuilder_ChildrenInputNumberProps2052148856[HTMLInputElement] = new SharedBuilder_ChildrenInputNumberProps2052148856[HTMLInputElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
