package web.typings.dayjs

import web.typings.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmPluginIsoWeeksInYearMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/isoWeeksInYear", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `esmPluginIsoWeeksInYearMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
    @js.native
    trait Dayjs extends StObject {
      
      def isoWeeksInYear(): Double = js.native
    }
    object Dayjs {
      
      @scala.inline
      def apply(isoWeeksInYear: () => Double): Dayjs = {
        val __obj = js.Dynamic.literal(isoWeeksInYear = js.Any.fromFunction0(isoWeeksInYear))
        __obj.asInstanceOf[Dayjs]
      }
      
      @scala.inline
      implicit class MutableBuilder[Self <: Dayjs] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIsoWeeksInYear(value: () => Double): Self = StObject.set(x, "isoWeeksInYear", js.Any.fromFunction0(value))
      }
    }
  }
}
