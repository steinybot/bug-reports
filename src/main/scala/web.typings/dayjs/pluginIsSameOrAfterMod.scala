package web.typings.dayjs

import web.typings.dayjs.mod.ConfigType
import web.typings.dayjs.mod.OpUnitType
import web.typings.dayjs.mod.PluginFunc
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginIsSameOrAfterMod extends Shortcut {
  
  @JSImport("dayjs/plugin/isSameOrAfter", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `pluginIsSameOrAfterMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsAugmentingMod {
    
    @js.native
    trait Dayjs extends StObject {
      
      def isSameOrAfter(): Boolean = js.native
      def isSameOrAfter(date: ConfigType): Boolean = js.native
      def isSameOrAfter(date: ConfigType, unit: OpUnitType): Boolean = js.native
      def isSameOrAfter(date: Unit, unit: OpUnitType): Boolean = js.native
    }
  }
}
