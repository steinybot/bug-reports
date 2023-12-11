package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.anon.ClassNames
import web.typings.antd.anon.ComponentStyleConfigPickT
import web.typings.antd.anon.ComponentStyleConfigclass
import web.typings.antd.anon.ComponentStyleConfigshowS
import web.typings.antd.anon.ComponentStyleConfigshowSClassName
import web.typings.antd.anon.ComponentStyleConfigvalid
import web.typings.antd.anon.Ghost
import web.typings.antd.esConfigProviderContextMod.BadgeConfig
import web.typings.antd.esConfigProviderContextMod.ButtonConfig
import web.typings.antd.esConfigProviderContextMod.CSPConfig
import web.typings.antd.esConfigProviderContextMod.ComponentStyleConfig
import web.typings.antd.esConfigProviderContextMod.DirectionType
import web.typings.antd.esConfigProviderContextMod.DrawerConfig
import web.typings.antd.esConfigProviderContextMod.FlexConfig
import web.typings.antd.esConfigProviderContextMod.ModalConfig
import web.typings.antd.esConfigProviderContextMod.PopupOverflow
import web.typings.antd.esConfigProviderContextMod.ThemeConfig
import web.typings.antd.esConfigProviderContextMod.WaveConfig
import web.typings.antd.esConfigProviderMod.ConfigProviderProps
import web.typings.antd.esConfigProviderSizeContextMod.SizeType
import web.typings.antd.esUtilWarningMod.WarningContextProps
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ConfigProvider {
  
  @JSImport("antd", "ConfigProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[slinky.web.html.`*`.tag.type, js.Object] {
    
    @scala.inline
    def alert(value: ComponentStyleConfig): this.type = set("alert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def anchor(value: ComponentStyleConfig): this.type = set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoInsertSpaceInButton(value: Boolean): this.type = set("autoInsertSpaceInButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def avatar(value: ComponentStyleConfig): this.type = set("avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def badge(value: BadgeConfig): this.type = set("badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def breadcrumb(value: ComponentStyleConfig): this.type = set("breadcrumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def button(value: ButtonConfig): this.type = set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def calendar(value: ComponentStyleConfig): this.type = set("calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def card(value: ComponentStyleConfig): this.type = set("card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def carousel(value: ComponentStyleConfig): this.type = set("carousel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cascader(value: ComponentStyleConfig): this.type = set("cascader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def checkbox(value: ComponentStyleConfig): this.type = set("checkbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def collapse(value: ComponentStyleConfig): this.type = set("collapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colorPicker(value: ComponentStyleConfig): this.type = set("colorPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentDisabled(value: Boolean): this.type = set("componentDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentSize(value: SizeType): this.type = set("componentSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def csp(value: CSPConfig): this.type = set("csp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def datePicker(value: ComponentStyleConfig): this.type = set("datePicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def descriptions(value: ComponentStyleConfig): this.type = set("descriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: DirectionType): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def divider(value: ComponentStyleConfig): this.type = set("divider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def drawer(value: DrawerConfig): this.type = set("drawer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropdown(value: ComponentStyleConfig): this.type = set("dropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropdownMatchSelectWidth(value: Boolean): this.type = set("dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def empty(value: ComponentStyleConfig): this.type = set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flex(value: FlexConfig): this.type = set("flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def form(value: ComponentStyleConfigvalid): this.type = set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getPopupContainer(value: /* triggerNode */ js.UndefOr[HTMLElement] => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def getTargetContainer(value: () => HTMLElement | Window): this.type = set("getTargetContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def iconPrefixCls(value: String): this.type = set("iconPrefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def image(value: ComponentStyleConfig): this.type = set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def input(value: ComponentStyleConfigclass): this.type = set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def layout(value: ComponentStyleConfig): this.type = set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def list(value: ComponentStyleConfig): this.type = set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def locale(value: web.typings.antd.esLocaleMod.Locale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mentions(value: ComponentStyleConfig): this.type = set("mentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def menu(value: ComponentStyleConfig): this.type = set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def message(value: ComponentStyleConfig): this.type = set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def modal(value: ModalConfig): this.type = set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def notification(value: ComponentStyleConfig): this.type = set("notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pageHeader(value: Ghost): this.type = set("pageHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pagination(value: ComponentStyleConfigshowS): this.type = set("pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popupMatchSelectWidth(value: Boolean): this.type = set("popupMatchSelectWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popupOverflow(value: PopupOverflow): this.type = set("popupOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def progress(value: ComponentStyleConfig): this.type = set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def radio(value: ComponentStyleConfig): this.type = set("radio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rangePicker(value: ComponentStyleConfig): this.type = set("rangePicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rate(value: ComponentStyleConfig): this.type = set("rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderEmpty(value: /* componentName */ js.UndefOr[String] => ReactElement): this.type = set("renderEmpty", js.Any.fromFunction1(value))
    
    @scala.inline
    def result(value: ComponentStyleConfig): this.type = set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def segmented(value: ComponentStyleConfig): this.type = set("segmented", value.asInstanceOf[js.Any])
    
    @scala.inline
    def select(value: ComponentStyleConfigshowSClassName): this.type = set("select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def skeleton(value: ComponentStyleConfig): this.type = set("skeleton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def slider(value: ComponentStyleConfig): this.type = set("slider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def space(value: ClassNames): this.type = set("space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def spin(value: ComponentStyleConfig): this.type = set("spin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def statistic(value: ComponentStyleConfig): this.type = set("statistic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def steps(value: ComponentStyleConfig): this.type = set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def switch(value: ComponentStyleConfig): this.type = set("switch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def table(value: ComponentStyleConfig): this.type = set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabs(value: ComponentStyleConfigPickT): this.type = set("tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tag(value: ComponentStyleConfig): this.type = set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: ThemeConfig): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def timePicker(value: ComponentStyleConfig): this.type = set("timePicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def timeline(value: ComponentStyleConfig): this.type = set("timeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transfer(value: ComponentStyleConfig): this.type = set("transfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tree(value: ComponentStyleConfig): this.type = set("tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def typography(value: ComponentStyleConfig): this.type = set("typography", value.asInstanceOf[js.Any])
    
    @scala.inline
    def upload(value: ComponentStyleConfig): this.type = set("upload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def virtual(value: Boolean): this.type = set("virtual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def warning(value: WarningContextProps): this.type = set("warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wave(value: WaveConfig): this.type = set("wave", value.asInstanceOf[js.Any])
  }
  
  type Props = ConfigProviderProps
  
  implicit def make(companion: ConfigProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ConfigProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
