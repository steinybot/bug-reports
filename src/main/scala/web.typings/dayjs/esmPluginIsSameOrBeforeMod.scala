package web.typings.dayjs

import web.typings.dayjs.esmMod.ConfigType
import web.typings.dayjs.esmMod.OpUnitType
import web.typings.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmPluginIsSameOrBeforeMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/isSameOrBefore", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `esmPluginIsSameOrBeforeMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
    @js.native
    trait Dayjs extends StObject {
      
      def isSameOrBefore(): Boolean = js.native
      def isSameOrBefore(date: ConfigType): Boolean = js.native
      def isSameOrBefore(date: ConfigType, unit: OpUnitType): Boolean = js.native
      def isSameOrBefore(date: Unit, unit: OpUnitType): Boolean = js.native
    }
  }
}
