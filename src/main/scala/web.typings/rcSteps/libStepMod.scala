package web.typings.rcSteps

import web.typings.rcSteps.anon.Description
import web.typings.rcSteps.anon.Index
import web.typings.rcSteps.libInterfaceMod.Icons
import web.typings.rcSteps.libInterfaceMod.Status
import web.typings.rcSteps.libStepsMod.ProgressDotRender
import web.typings.rcSteps.libStepsMod.StepIconRender
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.MouseEventHandler
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStepMod {
  
  @JSImport("rc-steps/lib/Step", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: StepProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @js.native
  trait StepProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var description: js.UndefOr[ReactElement] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var iconPrefix: js.UndefOr[String] = js.native
    
    var icons: js.UndefOr[Icons] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onStepClick: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var progressDot: js.UndefOr[ProgressDotRender | Boolean] = js.native
    
    var render: js.UndefOr[js.Function1[/* stepItem */ ReactElement, ReactElement]] = js.native
    
    var status: js.UndefOr[Status] = js.native
    
    var stepIcon: js.UndefOr[StepIconRender] = js.native
    
    var stepIndex: js.UndefOr[Double] = js.native
    
    var stepNumber: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var subTitle: js.UndefOr[ReactElement] = js.native
    
    var tailContent: js.UndefOr[ReactElement] = js.native
    
    var title: js.UndefOr[ReactElement] = js.native
    
    var wrapperStyle: js.UndefOr[CSSProperties] = js.native
  }
  object StepProps {
    
    @scala.inline
    def apply(): StepProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: StepProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDescription(value: ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconPrefix(value: String): Self = StObject.set(x, "iconPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconPrefixUndefined: Self = StObject.set(x, "iconPrefix", js.undefined)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setIcons(value: Icons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnStepClick(value: /* index */ Double => Unit): Self = StObject.set(x, "onStepClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStepClickUndefined: Self = StObject.set(x, "onStepClick", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setProgressDot(value: ProgressDotRender | Boolean): Self = StObject.set(x, "progressDot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressDotFunction2(value: (/* iconDot */ Any, /* info */ Index) => ReactElement): Self = StObject.set(x, "progressDot", js.Any.fromFunction2(value))
      
      @scala.inline
      def setProgressDotUndefined: Self = StObject.set(x, "progressDot", js.undefined)
      
      @scala.inline
      def setRender(value: /* stepItem */ ReactElement => ReactElement): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setStepIcon(value: /* info */ Description => ReactElement): Self = StObject.set(x, "stepIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStepIconUndefined: Self = StObject.set(x, "stepIcon", js.undefined)
      
      @scala.inline
      def setStepIndex(value: Double): Self = StObject.set(x, "stepIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepIndexUndefined: Self = StObject.set(x, "stepIndex", js.undefined)
      
      @scala.inline
      def setStepNumber(value: Double): Self = StObject.set(x, "stepNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepNumberUndefined: Self = StObject.set(x, "stepNumber", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSubTitle(value: ReactElement): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
      
      @scala.inline
      def setTailContent(value: ReactElement): Self = StObject.set(x, "tailContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTailContentUndefined: Self = StObject.set(x, "tailContent", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setWrapperStyle(value: CSSProperties): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
    }
  }
}
