package web.typings.antd.components

import web.typings.StBuildingComponent.Default
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.SubStyleComponentProps
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ConfirmCmp {
  
  @scala.inline
  def apply(prefixCls: String): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[SubStyleComponentProps]))
  }
  
  @JSImport("antd/es/modal/style/confirmCmp", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = SubStyleComponentProps
  
  def withProps(p: SubStyleComponentProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
