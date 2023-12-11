package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.anon.ShowLeafIcon
import web.typings.antd.esTreeTreeMod.AntTreeNodeProps
import web.typings.antd.esTreeTreeMod.SwitcherIcon
import web.typings.antd.esTreeUtilsIconUtilMod.SwitcherIconProps
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IconUtil {
  
  @scala.inline
  def apply(prefixCls: String, treeNodeProps: AntTreeNodeProps): Builder = {
    val __props = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], treeNodeProps = treeNodeProps.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SwitcherIconProps]))
  }
  
  @JSImport("antd/es/tree/utils/iconUtil", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def showLine(value: Boolean | ShowLeafIcon): this.type = set("showLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def switcherIcon(value: SwitcherIcon): this.type = set("switcherIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def switcherIconFunction1(value: /* props */ AntTreeNodeProps => ReactElement): this.type = set("switcherIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def switcherIconReactElement(value: ReactElement): this.type = set("switcherIcon", value.asInstanceOf[js.Any])
  }
  
  type Props = SwitcherIconProps
  
  def withProps(p: SwitcherIconProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
