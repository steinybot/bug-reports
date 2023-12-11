package web.typings.rcInput

import web.typings.rcInput.anon.Count
import web.typings.rcInput.anon.Formatter
import web.typings.rcInput.anon.Max
import web.typings.rcInput.esInterfaceMod.CountConfig
import web.typings.rcInput.esInterfaceMod.ExceedFormatter
import web.typings.rcInput.esInterfaceMod.ShowCountFormatter
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseCountMod {
  
  @JSImport("rc-input/es/hooks/useCount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): ForcedCountConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[ForcedCountConfig]
  @scala.inline
  def default(count: CountConfig): ForcedCountConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(count.asInstanceOf[js.Any]).asInstanceOf[ForcedCountConfig]
  @scala.inline
  def default(count: CountConfig, showCount: js.UndefOr[Boolean | Formatter]): ForcedCountConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(count.asInstanceOf[js.Any], showCount.asInstanceOf[js.Any])).asInstanceOf[ForcedCountConfig]
  @scala.inline
  def default(count: Unit, showCount: js.UndefOr[Boolean | Formatter]): ForcedCountConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(count.asInstanceOf[js.Any], showCount.asInstanceOf[js.Any])).asInstanceOf[ForcedCountConfig]
  
  @scala.inline
  def inCountRange(value: String, countConfig: ForcedCountConfig): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inCountRange")(value.asInstanceOf[js.Any], countConfig.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* Inlined std.Omit<rc-input.rc-input/es/interface.CountConfig, 'show'> & std.Pick<std.Required<rc-input.rc-input/es/interface.CountConfig>, 'strategy'> & {  show :boolean,   showFormatter :rc-input.rc-input/es/interface.ShowCountFormatter | undefined} */
  @js.native
  trait ForcedCountConfig extends StObject {
    
    var exceedFormatter: js.UndefOr[ExceedFormatter] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var show: Boolean = js.native
    
    var showFormatter: js.UndefOr[ShowCountFormatter] = js.native
    
    var strategy: js.UndefOr[js.Function1[/* value */ String, Double]] = js.native
  }
  object ForcedCountConfig {
    
    @scala.inline
    def apply(show: Boolean): ForcedCountConfig = {
      val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForcedCountConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ForcedCountConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExceedFormatter(value: (/* value */ String, /* config */ Max) => String): Self = StObject.set(x, "exceedFormatter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setExceedFormatterUndefined: Self = StObject.set(x, "exceedFormatter", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFormatter(value: /* args */ Count => ReactElement): Self = StObject.set(x, "showFormatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowFormatterUndefined: Self = StObject.set(x, "showFormatter", js.undefined)
      
      @scala.inline
      def setStrategy(value: /* value */ String => Double): Self = StObject.set(x, "strategy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
}
