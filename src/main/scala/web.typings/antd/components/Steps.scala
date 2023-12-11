package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.antdStrings.`inline`
import web.typings.antd.antdStrings.default
import web.typings.antd.antdStrings.error
import web.typings.antd.antdStrings.finish
import web.typings.antd.antdStrings.horizontal
import web.typings.antd.antdStrings.navigation
import web.typings.antd.antdStrings.process
import web.typings.antd.antdStrings.small
import web.typings.antd.antdStrings.vertical
import web.typings.antd.antdStrings.wait
import web.typings.antd.esStepsMod.StepsProps
import web.typings.rcSteps.anon.Description
import web.typings.rcSteps.anon.Index
import web.typings.rcSteps.libInterfaceMod.Icons
import web.typings.rcSteps.libStepMod.StepProps
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

object Steps {
  
  object Step {
    
    @JSImport("antd", "Steps.Step")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
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
      def status(value: web.typings.rcSteps.libInterfaceMod.Status): this.type = set("status", value.asInstanceOf[js.Any])
      
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
    
    type Props = /* props */ StepProps
    
    implicit def make(companion: Step.type): web.typings.antd.components.Steps.Step.Builder = new web.typings.antd.components.Steps.Step.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: /* props */ StepProps): web.typings.antd.components.Steps.Step.Builder = new web.typings.antd.components.Steps.Step.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Steps")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[slinky.web.html.`*`.tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def current(value: Double): this.type = set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: horizontal | vertical): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconPrefix(value: String): this.type = set("iconPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initial(value: Double): this.type = set("initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def items(value: js.Array[web.typings.antd.esStepsMod.StepProps]): this.type = set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemsVarargs(value: web.typings.antd.esStepsMod.StepProps*): this.type = set("items", js.Array(value :_*))
    
    @scala.inline
    def labelPlacement(value: horizontal | vertical): this.type = set("labelPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* current */ Double => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def percent(value: Double): this.type = set("percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def progressDot(value: Boolean | ProgressDotRender): this.type = set("progressDot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def progressDotFunction2(value: (/* iconDot */ Any, /* info */ Index) => ReactElement): this.type = set("progressDot", js.Any.fromFunction2(value))
    
    @scala.inline
    def responsive(value: Boolean): this.type = set("responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: default | small): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def status(value: wait | process | finish | error): this.type = set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: default | navigation | `inline`): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  type Props = StepsProps
  
  implicit def make(companion: Steps.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StepsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
