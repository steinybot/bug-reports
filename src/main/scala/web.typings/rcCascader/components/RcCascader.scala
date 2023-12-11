package web.typings.rcCascader.components

import web.typings.StBuildingComponent.Default
import web.typings.rcCascader.anon.Ref
import web.typings.rcCascader.esCascaderMod.CascaderProps
import web.typings.rcCascader.esCascaderMod.DefaultOptionType
import web.typings.react.mod.PropsWithChildren
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object RcCascader {
  
  def apply(p: /* props */ PropsWithChildren[CascaderProps[DefaultOptionType]] with Ref): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("rc-cascader", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RcCascader.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
