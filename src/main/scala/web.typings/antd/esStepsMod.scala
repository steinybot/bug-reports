package web.typings.antd

import web.typings.antd.antdStrings.`inline`
import web.typings.antd.antdStrings.error
import web.typings.antd.antdStrings.finish
import web.typings.antd.antdStrings.horizontal
import web.typings.antd.antdStrings.navigation
import web.typings.antd.antdStrings.process
import web.typings.antd.antdStrings.small
import web.typings.antd.antdStrings.vertical
import web.typings.antd.antdStrings.wait
import web.typings.rcSteps.anon.Index
import web.typings.rcSteps.libStepsMod.ProgressDotRender
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.FunctionComponent
import web.typings.react.mod.MouseEventHandler
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esStepsMod extends Shortcut {
  
  @JSImport("antd/es/steps", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  @js.native
  trait CompoundedComponent
    extends StObject
       with FunctionComponent[StepsProps] {
    
    var Step: js.Function1[/* props */ web.typings.rcSteps.libStepMod.StepProps, ReactElement] = js.native
  }
  
  @js.native
  trait StepProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var description: js.UndefOr[ReactElement] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
    
    var status: js.UndefOr[wait | process | finish | error] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var subTitle: js.UndefOr[ReactElement] = js.native
    
    var title: js.UndefOr[ReactElement] = js.native
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
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setStatus(value: wait | process | finish | error): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSubTitle(value: ReactElement): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait StepsProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var current: js.UndefOr[Double] = js.native
    
    var direction: js.UndefOr[horizontal | vertical] = js.native
    
    var iconPrefix: js.UndefOr[String] = js.native
    
    var initial: js.UndefOr[Double] = js.native
    
    var items: js.UndefOr[js.Array[StepProps]] = js.native
    
    var labelPlacement: js.UndefOr[horizontal | vertical] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* current */ Double, Unit]] = js.native
    
    var percent: js.UndefOr[Double] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var progressDot: js.UndefOr[Boolean | ProgressDotRender] = js.native
    
    var responsive: js.UndefOr[Boolean] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[web.typings.antd.antdStrings.default | small] = js.native
    
    var status: js.UndefOr[wait | process | finish | error] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var `type`: js.UndefOr[web.typings.antd.antdStrings.default | navigation | `inline`] = js.native
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
      def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
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
      def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setProgressDot(value: Boolean | ProgressDotRender): Self = StObject.set(x, "progressDot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressDotFunction2(value: (/* iconDot */ Any, /* info */ Index) => ReactElement): Self = StObject.set(x, "progressDot", js.Any.fromFunction2(value))
      
      @scala.inline
      def setProgressDotUndefined: Self = StObject.set(x, "progressDot", js.undefined)
      
      @scala.inline
      def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setSize(value: web.typings.antd.antdStrings.default | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStatus(value: wait | process | finish | error): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setType(value: web.typings.antd.antdStrings.default | navigation | `inline`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `esStepsMod.foo` */
  override def _to: CompoundedComponent = default
}
