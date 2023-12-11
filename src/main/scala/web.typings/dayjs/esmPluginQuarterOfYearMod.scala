package web.typings.dayjs

import web.typings.dayjs.esmMod.ConfigType
import web.typings.dayjs.esmMod.OpUnitType
import web.typings.dayjs.esmMod.PluginFunc
import web.typings.dayjs.esmMod.QUnitType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmPluginQuarterOfYearMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/quarterOfYear", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `esmPluginQuarterOfYearMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
    @js.native
    trait Dayjs extends StObject {
      
      def add(value: Double, unit: QUnitType): Dayjs = js.native
      
      def endOf(unit: OpUnitType): Dayjs = js.native
      def endOf(unit: QUnitType): Dayjs = js.native
      
      def isAfter(): Boolean = js.native
      def isAfter(date: ConfigType): Boolean = js.native
      def isAfter(date: ConfigType, unit: QUnitType): Boolean = js.native
      def isAfter(date: Unit, unit: QUnitType): Boolean = js.native
      
      def isBefore(): Boolean = js.native
      def isBefore(date: ConfigType): Boolean = js.native
      def isBefore(date: ConfigType, unit: QUnitType): Boolean = js.native
      def isBefore(date: Unit, unit: QUnitType): Boolean = js.native
      
      def isSame(): Boolean = js.native
      def isSame(date: ConfigType): Boolean = js.native
      def isSame(date: ConfigType, unit: QUnitType): Boolean = js.native
      def isSame(date: Unit, unit: QUnitType): Boolean = js.native
      
      def quarter(): Double = js.native
      def quarter(quarter: Double): Dayjs = js.native
      
      def startOf(unit: OpUnitType): Dayjs = js.native
      def startOf(unit: QUnitType): Dayjs = js.native
      
      def subtract(value: Double, unit: QUnitType): Dayjs = js.native
    }
  }
}
