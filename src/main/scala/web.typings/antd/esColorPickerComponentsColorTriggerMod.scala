package web.typings.antd

import web.typings.antd.esColorPickerColorMod.Color
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.MouseEventHandler
import web.typings.react.mod.RefAttributes
import web.typings.std.Exclude
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esColorPickerComponentsColorTriggerMod extends Shortcut {
  
  @JSImport("antd/es/color-picker/components/ColorTrigger", JSImport.Default)
  @js.native
  val default: ReactComponentClass[colorTriggerProps with RefAttributes[HTMLDivElement]] = js.native
  
  type _To = ReactComponentClass[colorTriggerProps with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esColorPickerComponentsColorTriggerMod.foo` */
  override def _to: ReactComponentClass[colorTriggerProps with RefAttributes[HTMLDivElement]] = default
  
  /* Inlined parent std.Pick<antd.antd/es/color-picker/interface.ColorPickerBaseProps, 'prefixCls' | 'colorCleared' | 'disabled' | 'format'> */
  @js.native
  trait colorTriggerProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var color: Exclude[js.UndefOr[Color], Unit] = js.native
    
    var colorCleared: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var format: js.UndefOr[
        /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorFormat * / any */ String
      ] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var prefixCls: String = js.native
    
    var showText: js.UndefOr[Boolean | (js.Function1[/* color */ Color, ReactElement])] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object colorTriggerProps {
    
    @scala.inline
    def apply(prefixCls: String): colorTriggerProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[colorTriggerProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: colorTriggerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: Exclude[js.UndefOr[Color], Unit]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorCleared(value: Boolean): Self = StObject.set(x, "colorCleared", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorClearedUndefined: Self = StObject.set(x, "colorCleared", js.undefined)
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFormat(
        value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorFormat * / any */ String
      ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowText(value: Boolean | (js.Function1[/* color */ Color, ReactElement])): Self = StObject.set(x, "showText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTextFunction1(value: /* color */ Color => ReactElement): Self = StObject.set(x, "showText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowTextUndefined: Self = StObject.set(x, "showText", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
