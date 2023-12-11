package web.typings.dayjs

import web.typings.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmPluginCustomParseFormatMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/customParseFormat", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[PluginOptions] = js.native
  
  @js.native
  trait PluginOptions extends StObject {
    
    var parseTwoDigitYear: js.UndefOr[js.Function1[/* yearString */ String, Double]] = js.native
  }
  object PluginOptions {
    
    @scala.inline
    def apply(): PluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginOptions]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParseTwoDigitYear(value: /* yearString */ String => Double): Self = StObject.set(x, "parseTwoDigitYear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParseTwoDigitYearUndefined: Self = StObject.set(x, "parseTwoDigitYear", js.undefined)
    }
  }
  
  type _To = PluginFunc[PluginOptions]
  
  /* This means you don't have to write `^`, but can instead just say `esmPluginCustomParseFormatMod.foo` */
  override def _to: PluginFunc[PluginOptions] = ^
}
