package web.typings.rcSteps

import web.typings.rcSteps.anon.Description
import web.typings.rcSteps.anon.Index
import web.typings.rcSteps.libInterfaceMod.Icons
import web.typings.rcSteps.libInterfaceMod.Status
import web.typings.rcSteps.libStepMod.StepProps
import web.typings.rcSteps.rcStepsStrings.`inline`
import web.typings.rcSteps.rcStepsStrings.default
import web.typings.rcSteps.rcStepsStrings.horizontal
import web.typings.rcSteps.rcStepsStrings.navigation
import web.typings.rcSteps.rcStepsStrings.small
import web.typings.rcSteps.rcStepsStrings.vertical
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.JSX.Element
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStepsMod {
  
  object default {
    
    @scala.inline
    def apply(props: StepsProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("rc-steps/lib/Steps", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof imported_Step.default` */
    @scala.inline
    def Step(props: StepProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Step")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  }
  
  type ProgressDotRender = js.Function2[/* iconDot */ Any, /* info */ Index, ReactElement]
  
  type StepIconRender = js.Function1[/* info */ Description, ReactElement]
  
  @js.native
  trait StepsProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var current: js.UndefOr[Double] = js.native
    
    var direction: js.UndefOr[horizontal | vertical] = js.native
    
    var iconPrefix: js.UndefOr[String] = js.native
    
    var icons: js.UndefOr[Icons] = js.native
    
    var initial: js.UndefOr[Double] = js.native
    
    var itemRender: js.UndefOr[js.Function2[/* item */ StepProps, /* stepItem */ ReactElement, ReactElement]] = js.native
    
    var items: js.UndefOr[js.Array[StepProps]] = js.native
    
    var labelPlacement: js.UndefOr[horizontal | vertical] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* current */ Double, Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var progressDot: js.UndefOr[ProgressDotRender | Boolean] = js.native
    
    var size: js.UndefOr[default | small] = js.native
    
    var status: js.UndefOr[Status] = js.native
    
    var stepIcon: js.UndefOr[StepIconRender] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var `type`: js.UndefOr[default | navigation | `inline`] = js.native
  }
  object StepsProps {
    
    @scala.inline
    def apply(): StepsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepsProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: StepsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      @scala.inline
      def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setIconPrefix(value: String): Self = StObject.set(x, "iconPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconPrefixUndefined: Self = StObject.set(x, "iconPrefix", js.undefined)
      
      @scala.inline
      def setIcons(value: Icons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      @scala.inline
      def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      @scala.inline
      def setItemRender(value: (/* item */ StepProps, /* stepItem */ ReactElement) => ReactElement): Self = StObject.set(x, "itemRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setItemRenderUndefined: Self = StObject.set(x, "itemRender", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[StepProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: StepProps*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setLabelPlacement(value: horizontal | vertical): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* current */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
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
      def setSize(value: default | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setStepIcon(value: /* info */ Description => ReactElement): Self = StObject.set(x, "stepIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStepIconUndefined: Self = StObject.set(x, "stepIcon", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setType(value: default | navigation | `inline`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
