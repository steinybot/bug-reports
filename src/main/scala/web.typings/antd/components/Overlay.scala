package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esButtonButtonMod.ButtonProps
import web.typings.antd.esButtonButtonMod.LegacyButtonType
import web.typings.antd.esPopconfirmPurePanelMod.OverlayProps
import web.typings.antd.esUtilGetRenderPropValueMod.RenderFunction
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.button.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Overlay {
  
  @scala.inline
  def apply(prefixCls: String, title: ReactElement | RenderFunction): Builder = {
    val __props = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OverlayProps]))
  }
  
  @JSImport("antd/es/popconfirm/PurePanel", "Overlay")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def cancelButtonProps(value: ButtonProps): this.type = set("cancelButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelText(value: ReactElement): this.type = set("cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def close(value: js.Function): this.type = set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def description(value: ReactElement | RenderFunction): this.type = set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def descriptionFunction0(value: () => ReactElement): this.type = set("description", js.Any.fromFunction0(value))
    
    @scala.inline
    def descriptionReactElement(value: ReactElement): this.type = set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def okButtonProps(value: ButtonProps): this.type = set("okButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def okText(value: ReactElement): this.type = set("okText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def okType(value: LegacyButtonType): this.type = set("okType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCancel(value: SyntheticMouseEvent[HTMLButtonElement | HTMLAnchorElement] => Unit): this.type = set("onCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onConfirm(value: SyntheticMouseEvent[HTMLButtonElement | HTMLAnchorElement] => Unit): this.type = set("onConfirm", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPopupClick(value: /* e */ SyntheticMouseEvent[HTMLElement] => Unit): this.type = set("onPopupClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def showCancel(value: Boolean): this.type = set("showCancel", value.asInstanceOf[js.Any])
  }
  
  type Props = OverlayProps
  
  def withProps(p: OverlayProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
