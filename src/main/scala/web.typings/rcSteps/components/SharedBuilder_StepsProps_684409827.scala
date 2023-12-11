package web.typings.rcSteps.components

import web.typings.StBuildingComponent
import web.typings.rcSteps.anon.Description
import web.typings.rcSteps.anon.Index
import web.typings.rcSteps.libInterfaceMod.Icons
import web.typings.rcSteps.libInterfaceMod.Status
import web.typings.rcSteps.libStepMod.StepProps
import web.typings.rcSteps.libStepsMod.ProgressDotRender
import web.typings.rcSteps.rcStepsStrings.`inline`
import web.typings.rcSteps.rcStepsStrings.default
import web.typings.rcSteps.rcStepsStrings.horizontal
import web.typings.rcSteps.rcStepsStrings.navigation
import web.typings.rcSteps.rcStepsStrings.small
import web.typings.rcSteps.rcStepsStrings.vertical
import web.typings.react.mod.CSSProperties
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_StepsProps_684409827 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def current(value: Double): this.type = set("current", value.asInstanceOf[js.Any])
  
  @scala.inline
  def direction(value: horizontal | vertical): this.type = set("direction", value.asInstanceOf[js.Any])
  
  @scala.inline
  def iconPrefix(value: String): this.type = set("iconPrefix", value.asInstanceOf[js.Any])
  
  @scala.inline
  def icons(value: Icons): this.type = set("icons", value.asInstanceOf[js.Any])
  
  @scala.inline
  def initial(value: Double): this.type = set("initial", value.asInstanceOf[js.Any])
  
  @scala.inline
  def itemRender(value: (/* item */ StepProps, /* stepItem */ ReactElement) => ReactElement): this.type = set("itemRender", js.Any.fromFunction2(value))
  
  @scala.inline
  def items(value: js.Array[StepProps]): this.type = set("items", value.asInstanceOf[js.Any])
  
  @scala.inline
  def itemsVarargs(value: StepProps*): this.type = set("items", js.Array(value :_*))
  
  @scala.inline
  def labelPlacement(value: horizontal | vertical): this.type = set("labelPlacement", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onChange(value: /* current */ Double => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def progressDot(value: ProgressDotRender | Boolean): this.type = set("progressDot", value.asInstanceOf[js.Any])
  
  @scala.inline
  def progressDotFunction2(value: (/* iconDot */ Any, /* info */ Index) => ReactElement): this.type = set("progressDot", js.Any.fromFunction2(value))
  
  @scala.inline
  def size(value: default | small): this.type = set("size", value.asInstanceOf[js.Any])
  
  @scala.inline
  def status(value: Status): this.type = set("status", value.asInstanceOf[js.Any])
  
  @scala.inline
  def stepIcon(value: /* info */ Description => ReactElement): this.type = set("stepIcon", js.Any.fromFunction1(value))
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def `type`(value: default | navigation | `inline`): this.type = set("type", value.asInstanceOf[js.Any])
}
