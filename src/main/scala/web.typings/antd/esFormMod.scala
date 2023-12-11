package web.typings.antd

import web.typings.antd.anon.ChildrenRef
import web.typings.antd.anon.Create
import web.typings.antd.anon.`2`
import web.typings.antd.esFormFormMod.FormProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esFormMod extends Shortcut {
  
  @JSImport("antd/es/form", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  type CompoundedComponent = InternalFormType with Create
  
  type InternalFormType = (js.Function1[/* props */ ChildrenRef[Any] with FormProps[Any], ReactElement]) with `2`
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `esFormMod.foo` */
  override def _to: CompoundedComponent = default
}
