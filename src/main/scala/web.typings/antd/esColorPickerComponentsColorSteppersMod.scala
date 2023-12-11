package web.typings.antd

import web.typings.rcInputNumber.anon.Input
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esColorPickerComponentsColorSteppersMod extends Shortcut {
  
  @JSImport("antd/es/color-picker/components/ColorSteppers", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ColorSteppersProps] = js.native
  
  /* Inlined parent std.Pick<antd.antd/es/color-picker/interface.ColorPickerBaseProps, 'prefixCls'> */
  @js.native
  trait ColorSteppersProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var formatter: js.UndefOr[js.Function2[/* value */ js.UndefOr[Double], /* info */ Input, String]] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ Double | Null, Unit]] = js.native
    
    var prefix: js.UndefOr[js.Function1[/* prefixCls */ String, ReactElement]] = js.native
    
    var prefixCls: String = js.native
    
    var value: js.UndefOr[Double] = js.native
  }
  object ColorSteppersProps {
    
    @scala.inline
    def apply(prefixCls: String): ColorSteppersProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorSteppersProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ColorSteppersProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setFormatter(value: (/* value */ js.UndefOr[Double], /* info */ Input) => String): Self = StObject.set(x, "formatter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ Double | Null => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setPrefix(value: /* prefixCls */ String => ReactElement): Self = StObject.set(x, "prefix", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ColorSteppersProps]
  
  /* This means you don't have to write `default`, but can instead just say `esColorPickerComponentsColorSteppersMod.foo` */
  override def _to: ReactComponentClass[ColorSteppersProps] = default
}
