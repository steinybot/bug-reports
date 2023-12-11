package web.typings.rcSteps.components

import web.typings.StBuildingComponent
import web.typings.rcSteps.anon.Description
import web.typings.rcSteps.anon.Index
import web.typings.rcSteps.libInterfaceMod.Icons
import web.typings.rcSteps.libInterfaceMod.Status
import web.typings.rcSteps.libStepsMod.ProgressDotRender
import web.typings.react.mod.CSSProperties
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_StepProps_830299305 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def description(value: ReactElement): this.type = set("description", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def iconPrefix(value: String): this.type = set("iconPrefix", value.asInstanceOf[js.Any])
  
  @scala.inline
  def icons(value: Icons): this.type = set("icons", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
  
  @scala.inline
  def onStepClick(value: /* index */ Double => Unit): this.type = set("onStepClick", js.Any.fromFunction1(value))
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def progressDot(value: ProgressDotRender | Boolean): this.type = set("progressDot", value.asInstanceOf[js.Any])
  
  @scala.inline
  def progressDotFunction2(value: (/* iconDot */ Any, /* info */ Index) => ReactElement): this.type = set("progressDot", js.Any.fromFunction2(value))
  
  @scala.inline
  def render(value: /* stepItem */ ReactElement => ReactElement): this.type = set("render", js.Any.fromFunction1(value))
  
  @scala.inline
  def status(value: Status): this.type = set("status", value.asInstanceOf[js.Any])
  
  @scala.inline
  def stepIcon(value: /* info */ Description => ReactElement): this.type = set("stepIcon", js.Any.fromFunction1(value))
  
  @scala.inline
  def stepIndex(value: Double): this.type = set("stepIndex", value.asInstanceOf[js.Any])
  
  @scala.inline
  def stepNumber(value: Double): this.type = set("stepNumber", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def subTitle(value: ReactElement): this.type = set("subTitle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tailContent(value: ReactElement): this.type = set("tailContent", value.asInstanceOf[js.Any])
  
  @scala.inline
  def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  
  @scala.inline
  def wrapperStyle(value: CSSProperties): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
}
