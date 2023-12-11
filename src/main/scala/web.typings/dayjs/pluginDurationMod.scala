package web.typings.dayjs

import web.typings.dayjs.dayjsStrings.d_
import web.typings.dayjs.dayjsStrings.m_
import web.typings.dayjs.mod.PluginFunc
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginDurationMod extends Shortcut {
  
  @JSImport("dayjs/plugin/duration", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  type AddDurationType = CreateDurationType with (js.Function1[/* duration */ Duration, Duration])
  
  type CreateDurationType = (js.Function1[/* units */ DurationUnitsObjectType, Duration]) with (js.Function2[/* time */ Double, /* unit */ js.UndefOr[DurationUnitType], Duration]) with (js.Function1[/* ISO_8601 */ String, Duration])
  
  @js.native
  trait Duration
    extends StObject
       with Instantiable1[(/* input */ Double) | (/* input */ js.Object) | (/* input */ String), Duration]
       with Instantiable2[
          (/* input */ Double) | (/* input */ js.Object) | (/* input */ String), 
          /* unit */ String, 
          Duration
        ]
       with Instantiable3[
          (/* input */ Double) | (/* input */ js.Object) | (/* input */ String), 
          (/* unit */ String) | (/* unit */ Unit), 
          /* locale */ String, 
          Duration
        ] {
    
    def add(ISO_8601: String): Duration = js.native
    def add(duration: Duration): Duration = js.native
    def add(time: Double): Duration = js.native
    def add(time: Double, unit: DurationUnitType): Duration = js.native
    def add(units: DurationUnitsObjectType): Duration = js.native
    @JSName("add")
    var add_Original: AddDurationType = js.native
    
    def as(unit: DurationUnitType): Double = js.native
    
    def asDays(): Double = js.native
    
    def asHours(): Double = js.native
    
    def asMilliseconds(): Double = js.native
    
    def asMinutes(): Double = js.native
    
    def asMonths(): Double = js.native
    
    def asSeconds(): Double = js.native
    
    def asWeeks(): Double = js.native
    
    def asYears(): Double = js.native
    
    def days(): Double = js.native
    
    def format(): String = js.native
    def format(formatStr: String): String = js.native
    
    def get(unit: DurationUnitType): Double = js.native
    
    def hours(): Double = js.native
    
    def humanize(): String = js.native
    def humanize(withSuffix: Boolean): String = js.native
    
    def locale(locale: String): Duration = js.native
    
    def milliseconds(): Double = js.native
    
    def minutes(): Double = js.native
    
    def months(): Double = js.native
    
    def seconds(): Double = js.native
    
    def subtract(ISO_8601: String): Duration = js.native
    def subtract(duration: Duration): Duration = js.native
    def subtract(time: Double): Duration = js.native
    def subtract(time: Double, unit: DurationUnitType): Duration = js.native
    def subtract(units: DurationUnitsObjectType): Duration = js.native
    @JSName("subtract")
    var subtract_Original: AddDurationType = js.native
    
    def toISOString(): String = js.native
    
    def toJSON(): String = js.native
    
    def weeks(): Double = js.native
    
    def years(): Double = js.native
  }
  
  /**
    * @deprecated Please use more strict types
    */
  type DurationAddType = Double | js.Object | Duration
  
  /**
    * @deprecated Please use more strict types
    */
  type DurationInputType = String | Double | js.Object
  
  /* Inlined std.Exclude<dayjs.dayjs.OpUnitType, 'date' | 'dates'> */
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.dayjs.dayjsStrings.hours
    - `web.typings`.dayjs.dayjsStrings.d_
    - `web.typings`.dayjs.dayjsStrings.w
    - `web.typings`.dayjs.dayjsStrings.y
    - `web.typings`.dayjs.dayjsStrings.M
    - `web.typings`.dayjs.dayjsStrings.years
    - `web.typings`.dayjs.dayjsStrings.seconds
    - `web.typings`.dayjs.dayjsStrings.m_
    - `web.typings`.dayjs.dayjsStrings.second
    - `web.typings`.dayjs.dayjsStrings.day
    - `web.typings`.dayjs.dayjsStrings.s
    - `web.typings`.dayjs.dayjsStrings.hour
    - `web.typings`.dayjs.dayjsStrings.days
    - `web.typings`.dayjs.dayjsStrings.week
    - `web.typings`.dayjs.dayjsStrings.minutes
    - `web.typings`.dayjs.dayjsStrings.minute
    - `web.typings`.dayjs.dayjsStrings.year
    - `web.typings`.dayjs.dayjsStrings.months
    - `web.typings`.dayjs.dayjsStrings.month
    - `web.typings`.dayjs.dayjsStrings.weeks
    - `web.typings`.dayjs.dayjsStrings.D
    - `web.typings`.dayjs.dayjsStrings.ms
    - `web.typings`.dayjs.dayjsStrings.milliseconds
    - `web.typings`.dayjs.dayjsStrings.h
    - `web.typings`.dayjs.dayjsStrings.millisecond
  */
  trait DurationUnitType extends StObject
  object DurationUnitType {
    
    @scala.inline
    def D: web.typings.dayjs.dayjsStrings.D = "D".asInstanceOf[web.typings.dayjs.dayjsStrings.D]
    
    @scala.inline
    def M: web.typings.dayjs.dayjsStrings.M = "M".asInstanceOf[web.typings.dayjs.dayjsStrings.M]
    
    @scala.inline
    def d: d_ = "d".asInstanceOf[d_]
    
    @scala.inline
    def day: web.typings.dayjs.dayjsStrings.day = "day".asInstanceOf[web.typings.dayjs.dayjsStrings.day]
    
    @scala.inline
    def days: web.typings.dayjs.dayjsStrings.days = "days".asInstanceOf[web.typings.dayjs.dayjsStrings.days]
    
    @scala.inline
    def h: web.typings.dayjs.dayjsStrings.h = "h".asInstanceOf[web.typings.dayjs.dayjsStrings.h]
    
    @scala.inline
    def hour: web.typings.dayjs.dayjsStrings.hour = "hour".asInstanceOf[web.typings.dayjs.dayjsStrings.hour]
    
    @scala.inline
    def hours: web.typings.dayjs.dayjsStrings.hours = "hours".asInstanceOf[web.typings.dayjs.dayjsStrings.hours]
    
    @scala.inline
    def m: m_ = "m".asInstanceOf[m_]
    
    @scala.inline
    def millisecond: web.typings.dayjs.dayjsStrings.millisecond = "millisecond".asInstanceOf[web.typings.dayjs.dayjsStrings.millisecond]
    
    @scala.inline
    def milliseconds: web.typings.dayjs.dayjsStrings.milliseconds = "milliseconds".asInstanceOf[web.typings.dayjs.dayjsStrings.milliseconds]
    
    @scala.inline
    def minute: web.typings.dayjs.dayjsStrings.minute = "minute".asInstanceOf[web.typings.dayjs.dayjsStrings.minute]
    
    @scala.inline
    def minutes: web.typings.dayjs.dayjsStrings.minutes = "minutes".asInstanceOf[web.typings.dayjs.dayjsStrings.minutes]
    
    @scala.inline
    def month: web.typings.dayjs.dayjsStrings.month = "month".asInstanceOf[web.typings.dayjs.dayjsStrings.month]
    
    @scala.inline
    def months: web.typings.dayjs.dayjsStrings.months = "months".asInstanceOf[web.typings.dayjs.dayjsStrings.months]
    
    @scala.inline
    def ms: web.typings.dayjs.dayjsStrings.ms = "ms".asInstanceOf[web.typings.dayjs.dayjsStrings.ms]
    
    @scala.inline
    def s: web.typings.dayjs.dayjsStrings.s = "s".asInstanceOf[web.typings.dayjs.dayjsStrings.s]
    
    @scala.inline
    def second: web.typings.dayjs.dayjsStrings.second = "second".asInstanceOf[web.typings.dayjs.dayjsStrings.second]
    
    @scala.inline
    def seconds: web.typings.dayjs.dayjsStrings.seconds = "seconds".asInstanceOf[web.typings.dayjs.dayjsStrings.seconds]
    
    @scala.inline
    def w: web.typings.dayjs.dayjsStrings.w = "w".asInstanceOf[web.typings.dayjs.dayjsStrings.w]
    
    @scala.inline
    def week: web.typings.dayjs.dayjsStrings.week = "week".asInstanceOf[web.typings.dayjs.dayjsStrings.week]
    
    @scala.inline
    def weeks: web.typings.dayjs.dayjsStrings.weeks = "weeks".asInstanceOf[web.typings.dayjs.dayjsStrings.weeks]
    
    @scala.inline
    def y: web.typings.dayjs.dayjsStrings.y = "y".asInstanceOf[web.typings.dayjs.dayjsStrings.y]
    
    @scala.inline
    def year: web.typings.dayjs.dayjsStrings.year = "year".asInstanceOf[web.typings.dayjs.dayjsStrings.year]
    
    @scala.inline
    def years: web.typings.dayjs.dayjsStrings.years = "years".asInstanceOf[web.typings.dayjs.dayjsStrings.years]
  }
  
  /* Inlined std.Partial<{[ unit in std.Exclude<dayjs.dayjs.UnitTypeLongPlural, 'dates'> | 'weeks' ]: number}> */
  @js.native
  trait DurationUnitsObjectType extends StObject {
    
    var days: js.UndefOr[Double] = js.native
    
    var hours: js.UndefOr[Double] = js.native
    
    var milliseconds: js.UndefOr[Double] = js.native
    
    var minutes: js.UndefOr[Double] = js.native
    
    var months: js.UndefOr[Double] = js.native
    
    var seconds: js.UndefOr[Double] = js.native
    
    var weeks: js.UndefOr[Double] = js.native
    
    var years: js.UndefOr[Double] = js.native
  }
  object DurationUnitsObjectType {
    
    @scala.inline
    def apply(): DurationUnitsObjectType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DurationUnitsObjectType]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DurationUnitsObjectType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
      
      @scala.inline
      def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
      
      @scala.inline
      def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMillisecondsUndefined: Self = StObject.set(x, "milliseconds", js.undefined)
      
      @scala.inline
      def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
      
      @scala.inline
      def setMonths(value: Double): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
      
      @scala.inline
      def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
      
      @scala.inline
      def setWeeks(value: Double): Self = StObject.set(x, "weeks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeeksUndefined: Self = StObject.set(x, "weeks", js.undefined)
      
      @scala.inline
      def setYears(value: Double): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearsUndefined: Self = StObject.set(x, "years", js.undefined)
    }
  }
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `pluginDurationMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsAugmentingMod {
    
    @js.native
    trait Dayjs extends StObject {
      
      def add(duration: Duration): Dayjs = js.native
      
      def subtract(duration: Duration): Dayjs = js.native
    }
    object Dayjs {
      
      @scala.inline
      def apply(add: Duration => Dayjs, subtract: Duration => Dayjs): Dayjs = {
        val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), subtract = js.Any.fromFunction1(subtract))
        __obj.asInstanceOf[Dayjs]
      }
      
      @scala.inline
      implicit class MutableBuilder[Self <: Dayjs] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdd(value: Duration => Dayjs): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSubtract(value: Duration => Dayjs): Self = StObject.set(x, "subtract", js.Any.fromFunction1(value))
      }
    }
  }
}
