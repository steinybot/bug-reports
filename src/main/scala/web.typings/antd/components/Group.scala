package web.typings.antd.components

import web.typings.antd.esRadioInterfaceMod.RadioGroupProps
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Group {
  
  @JSImport("antd/es/radio", "Group")
  @js.native
  val component: js.Object = js.native
  
  type Props = RadioGroupProps with RefAttributes[HTMLDivElement]
  
  implicit def make(companion: Group.type): SharedBuilder_RadioGroupPropsRefAttributes_343343742[HTMLDivElement] = new SharedBuilder_RadioGroupPropsRefAttributes_343343742[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RadioGroupProps with RefAttributes[HTMLDivElement]): SharedBuilder_RadioGroupPropsRefAttributes_343343742[HTMLDivElement] = new SharedBuilder_RadioGroupPropsRefAttributes_343343742[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
