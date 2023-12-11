package web.typings.dayjs

import web.typings.dayjs.anon.D
import web.typings.dayjs.anon.FnCall
import web.typings.dayjs.anon.PartialILocale
import web.typings.dayjs.dayjsStrings.`[]`
import web.typings.dayjs.dayjsStrings.d_
import web.typings.dayjs.dayjsStrings.long
import web.typings.dayjs.dayjsStrings.m_
import web.typings.dayjs.dayjsStrings.short
import web.typings.dayjs.esmPluginDurationMod.CreateDurationType
import web.typings.dayjs.esmPluginDurationMod.Duration
import web.typings.dayjs.esmPluginIsoWeekMod.ISOUnitType
import web.typings.dayjs.esmPluginToObjectMod.DayjsObject
import web.typings.std.Record
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMod {
  
  @scala.inline
  def apply(): Dayjs = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Dayjs]
  @scala.inline
  def apply(date: ConfigType): Dayjs = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[Dayjs]
  @scala.inline
  def apply(date: ConfigType, format: OptionType): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  @scala.inline
  def apply(date: ConfigType, format: OptionType, locale: String): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  @scala.inline
  def apply(date: ConfigType, format: OptionType, locale: String, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  @scala.inline
  def apply(date: ConfigType, format: OptionType, locale: Unit, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  @scala.inline
  def apply(date: ConfigType, format: OptionType, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  @scala.inline
  def apply(date: ConfigType, format: Unit, locale: String): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  @scala.inline
  def apply(date: ConfigType, format: Unit, locale: String, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  @scala.inline
  def apply(date: ConfigType, format: Unit, locale: Unit, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  @scala.inline
  def apply(date: ConfigType, format: Unit, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  @scala.inline
  def apply(date: Unit, format: OptionType): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  @scala.inline
  def apply(date: Unit, format: OptionType, locale: String): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  @scala.inline
  def apply(date: Unit, format: OptionType, locale: String, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  @scala.inline
  def apply(date: Unit, format: OptionType, locale: Unit, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  @scala.inline
  def apply(date: Unit, format: OptionType, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  @scala.inline
  def apply(date: Unit, format: Unit, locale: String): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  @scala.inline
  def apply(date: Unit, format: Unit, locale: String, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  @scala.inline
  def apply(date: Unit, format: Unit, locale: Unit, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  @scala.inline
  def apply(date: Unit, format: Unit, strict: Boolean): Dayjs = (^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  
  @JSImport("dayjs/esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dayjs/esm", "Dayjs")
  @js.native
  class Dayjs ()
    extends StObject
       with _ConfigType {
    def this(config: ConfigType) = this()
    
    def add(argument: js.Object): web.typings.dayjs.esmPluginObjectSupportMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def add(duration: Duration): web.typings.dayjs.esmPluginDurationMod.dayjsEsmAugmentingMod.Dayjs = js.native
    /**
      * Returns a cloned Day.js object with a specified amount of time added.
      * ```
      * dayjs().add(7, 'day')// => Dayjs
      * ```
      * Units are case insensitive, and support plural and short forms.
      *
      * Docs: https://day.js.org/docs/en/manipulate/add
      */
    def add(value: Double): Dayjs = js.native
    def add(value: Double, unit: ManipulateType): Dayjs = js.native
    def add(value: Double, unit: QUnitType): web.typings.dayjs.esmPluginQuarterOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def calendar(): String = js.native
    def calendar(referenceTime: ConfigType): String = js.native
    def calendar(referenceTime: ConfigType, formats: js.Object): String = js.native
    def calendar(referenceTime: Unit, formats: js.Object): String = js.native
    
    /**
      * Get the date of the month.
      * ```
      * dayjs().date()// => 1-31
      * ```
      * Docs: https://day.js.org/docs/en/get-set/date
      */
    def date(): Double = js.native
    /**
      * Set the date of the month.
      *
      * Accepts numbers from 1 to 31. If the range is exceeded, it will bubble up to the next months.
      * ```
      * dayjs().date(1)// => Dayjs
      * ```
      * Docs: https://day.js.org/docs/en/get-set/date
      */
    def date(value: Double): Dayjs = js.native
    
    def dates(): Double = js.native
    def dates(value: Double): web.typings.dayjs.esmPluginPluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    /**
      * Get the day of the week.
      *
      * Returns numbers from 0 (Sunday) to 6 (Saturday).
      * ```
      * dayjs().day()// 0-6
      * ```
      * Docs: https://day.js.org/docs/en/get-set/day
      */
    def day(): Double = js.native
    /**
      * Set the day of the week.
      *
      * Accepts numbers from 0 (Sunday) to 6 (Saturday). If the range is exceeded, it will bubble up to next weeks.
      * ```
      * dayjs().day(0)// => Dayjs
      * ```
      * Docs: https://day.js.org/docs/en/get-set/day
      */
    def day(value: Double): Dayjs = js.native
    
    def dayOfYear(): Double = js.native
    def dayOfYear(value: Double): web.typings.dayjs.esmPluginDayOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def days(): Double = js.native
    def days(value: Double): web.typings.dayjs.esmPluginPluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    /**
      * Get the number of days in the current month.
      * ```
      * dayjs('2019-01-25').daysInMonth() // 31
      * ```
      * Docs: https://day.js.org/docs/en/display/days-in-month
      */
    def daysInMonth(): Double = js.native
    
    /**
      * This indicates the difference between two date-time in the specified unit.
      *
      * To get the difference in milliseconds, use `dayjs#diff`
      * ```
      * const date1 = dayjs('2019-01-25')
      * const date2 = dayjs('2018-06-05')
      * date1.diff(date2) // 20214000000 default milliseconds
      * date1.diff() // milliseconds to current time
      * ```
      *
      * To get the difference in another unit of measurement, pass that measurement as the second argument.
      * ```
      * const date1 = dayjs('2019-01-25')
      * date1.diff('2018-06-05', 'month') // 7
      * ```
      * Units are case insensitive, and support plural and short forms.
      *
      * Docs: https://day.js.org/docs/en/display/difference
      */
    def diff(): Double = js.native
    def diff(date: ConfigType): Double = js.native
    def diff(date: ConfigType, unit: OpUnitType): Double = js.native
    def diff(date: ConfigType, unit: OpUnitType, float: Boolean): Double = js.native
    def diff(date: ConfigType, unit: QUnitType): Double = js.native
    def diff(date: ConfigType, unit: QUnitType, float: Boolean): Double = js.native
    def diff(date: ConfigType, unit: Unit, float: Boolean): Double = js.native
    def diff(date: Unit, unit: OpUnitType): Double = js.native
    def diff(date: Unit, unit: OpUnitType, float: Boolean): Double = js.native
    def diff(date: Unit, unit: QUnitType): Double = js.native
    def diff(date: Unit, unit: QUnitType, float: Boolean): Double = js.native
    def diff(date: Unit, unit: Unit, float: Boolean): Double = js.native
    
    def endOf(unit: OpUnitType): web.typings.dayjs.esmPluginQuarterOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def endOf(unit: QUnitType): web.typings.dayjs.esmPluginQuarterOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def endOf(unit: ISOUnitType): web.typings.dayjs.esmPluginIsoWeekMod.dayjsEsmAugmentingMod.Dayjs = js.native
    /**
      * Returns a cloned Day.js object and set it to the end of a unit of time.
      * ```
      * dayjs().endOf('month')// => Dayjs
      * ```
      * Units are case insensitive, and support plural and short forms.
      *
      * Docs: https://day.js.org/docs/en/manipulate/end-of
      */
    @JSName("endOf")
    def endOf_Dayjs(unit: OpUnitType): Dayjs = js.native
    
    /**
      * Get the formatted date according to the string of tokens passed in.
      *
      * To escape characters, wrap them in square brackets (e.g. [MM]).
      * ```
      * dayjs().format()// => current date in ISO8601, without fraction seconds e.g. '2020-04-02T08:02:17-05:00'
      * dayjs('2019-01-25').format('[YYYYescape] YYYY-MM-DDTHH:mm:ssZ[Z]')// 'YYYYescape 2019-01-25T00:00:00-02:00Z'
      * dayjs('2019-01-25').format('DD/MM/YYYY') // '25/01/2019'
      * ```
      * Docs: https://day.js.org/docs/en/display/format
      */
    def format(): String = js.native
    def format(template: String): String = js.native
    
    def from(compared: ConfigType): String = js.native
    def from(compared: ConfigType, withoutSuffix: Boolean): String = js.native
    
    def fromNow(): String = js.native
    def fromNow(withoutSuffix: Boolean): String = js.native
    
    /**
      * String getter, returns the corresponding information getting from Day.js object.
      *
      * In general:
      * ```
      * dayjs().get(unit) === dayjs()[unit]()
      * ```
      * Units are case insensitive, and support plural and short forms.
      * ```
      * dayjs().get('year')
      * dayjs().get('month') // start 0
      * dayjs().get('date')
      * ```
      * Docs: https://day.js.org/docs/en/get-set/get
      */
    def get(unit: UnitType): Double = js.native
    
    /**
      * Get the hour.
      * ```
      * dayjs().hour()// => 0-23
      * ```
      * Docs: https://day.js.org/docs/en/get-set/hour
      */
    def hour(): Double = js.native
    /**
      * Set the hour.
      *
      * Accepts numbers from 0 to 23. If the range is exceeded, it will bubble up to the next day.
      * ```
      * dayjs().hour(12)// => Dayjs
      * ```
      * Docs: https://day.js.org/docs/en/get-set/hour
      */
    def hour(value: Double): Dayjs = js.native
    
    def hours(): Double = js.native
    def hours(value: Double): web.typings.dayjs.esmPluginPluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    /**
      * This indicates whether the Day.js object is after the other supplied date-time.
      * ```
      * dayjs().isAfter(dayjs('2011-01-01')) // default milliseconds
      * ```
      * If you want to limit the granularity to a unit other than milliseconds, pass it as the second parameter.
      * ```
      * dayjs().isAfter('2011-01-01', 'year')// => boolean
      * ```
      * Units are case insensitive, and support plural and short forms.
      *
      * Docs: https://day.js.org/docs/en/query/is-after
      */
    def isAfter(): Boolean = js.native
    def isAfter(date: ConfigType): Boolean = js.native
    def isAfter(date: ConfigType, unit: OpUnitType): Boolean = js.native
    def isAfter(date: ConfigType, unit: QUnitType): Boolean = js.native
    def isAfter(date: ConfigType, unit: ISOUnitType): Boolean = js.native
    def isAfter(date: Unit, unit: OpUnitType): Boolean = js.native
    def isAfter(date: Unit, unit: QUnitType): Boolean = js.native
    def isAfter(date: Unit, unit: ISOUnitType): Boolean = js.native
    
    /**
      * This indicates whether the Day.js object is before the other supplied date-time.
      * ```
      * dayjs().isBefore(dayjs('2011-01-01')) // default milliseconds
      * ```
      * If you want to limit the granularity to a unit other than milliseconds, pass it as the second parameter.
      * ```
      * dayjs().isBefore('2011-01-01', 'year')// => boolean
      * ```
      * Units are case insensitive, and support plural and short forms.
      *
      * Docs: https://day.js.org/docs/en/query/is-before
      */
    def isBefore(): Boolean = js.native
    def isBefore(date: ConfigType): Boolean = js.native
    def isBefore(date: ConfigType, unit: OpUnitType): Boolean = js.native
    def isBefore(date: ConfigType, unit: QUnitType): Boolean = js.native
    def isBefore(date: ConfigType, unit: ISOUnitType): Boolean = js.native
    def isBefore(date: Unit, unit: OpUnitType): Boolean = js.native
    def isBefore(date: Unit, unit: QUnitType): Boolean = js.native
    def isBefore(date: Unit, unit: ISOUnitType): Boolean = js.native
    
    def isBetween(a: ConfigType, b: ConfigType): Boolean = js.native
    def isBetween(a: ConfigType, b: ConfigType, c: OpUnitType): Boolean = js.native
    def isBetween(a: ConfigType, b: ConfigType, c: OpUnitType, d: (/* () */ String) | `[]`): Boolean = js.native
    def isBetween(a: ConfigType, b: ConfigType, c: Null, d: (/* () */ String) | `[]`): Boolean = js.native
    def isBetween(a: ConfigType, b: ConfigType, c: Unit, d: (/* () */ String) | `[]`): Boolean = js.native
    
    def isLeapYear(): Boolean = js.native
    
    /**
      * This indicates whether the Day.js object is the same as the other supplied date-time.
      * ```
      * dayjs().isSame(dayjs('2011-01-01')) // default milliseconds
      * ```
      * If you want to limit the granularity to a unit other than milliseconds, pass it as the second parameter.
      * ```
      * dayjs().isSame('2011-01-01', 'year')// => boolean
      * ```
      * Docs: https://day.js.org/docs/en/query/is-same
      */
    def isSame(): Boolean = js.native
    def isSame(date: ConfigType): Boolean = js.native
    def isSame(date: ConfigType, unit: OpUnitType): Boolean = js.native
    def isSame(date: ConfigType, unit: QUnitType): Boolean = js.native
    def isSame(date: ConfigType, unit: ISOUnitType): Boolean = js.native
    def isSame(date: Unit, unit: OpUnitType): Boolean = js.native
    def isSame(date: Unit, unit: QUnitType): Boolean = js.native
    def isSame(date: Unit, unit: ISOUnitType): Boolean = js.native
    
    def isSameOrAfter(): Boolean = js.native
    def isSameOrAfter(date: ConfigType): Boolean = js.native
    def isSameOrAfter(date: ConfigType, unit: OpUnitType): Boolean = js.native
    def isSameOrAfter(date: Unit, unit: OpUnitType): Boolean = js.native
    
    def isSameOrBefore(): Boolean = js.native
    def isSameOrBefore(date: ConfigType): Boolean = js.native
    def isSameOrBefore(date: ConfigType, unit: OpUnitType): Boolean = js.native
    def isSameOrBefore(date: Unit, unit: OpUnitType): Boolean = js.native
    
    def isToday(): Boolean = js.native
    
    def isTomorrow(): Boolean = js.native
    
    def isUTC(): Boolean = js.native
    
    /**
      * This returns a `boolean` indicating whether the Day.js object contains a valid date or not.
      * ```
      * dayjs().isValid()// => boolean
      * ```
      * Docs: https://day.js.org/docs/en/parse/is-valid
      */
    def isValid(): Boolean = js.native
    
    def isYesterday(): Boolean = js.native
    
    def isoWeek(): Double = js.native
    def isoWeek(value: Double): web.typings.dayjs.esmPluginIsoWeekMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def isoWeekYear(): Double = js.native
    
    def isoWeekday(): Double = js.native
    def isoWeekday(value: Double): web.typings.dayjs.esmPluginIsoWeekMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def isoWeeksInYear(): Double = js.native
    
    def local(): web.typings.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def locale(): String = js.native
    def locale(preset: ILocale): Dayjs = js.native
    def locale(preset: ILocale, `object`: PartialILocale): Dayjs = js.native
    def locale(preset: String): Dayjs = js.native
    def locale(preset: String, `object`: PartialILocale): Dayjs = js.native
    
    def localeData(): web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.InstanceLocaleDataReturn = js.native
    
    /**
      * Get the milliseconds.
      * ```
      * dayjs().millisecond()// => 0-999
      * ```
      * Docs: https://day.js.org/docs/en/get-set/millisecond
      */
    def millisecond(): Double = js.native
    /**
      * Set the milliseconds.
      *
      * Accepts numbers from 0 to 999. If the range is exceeded, it will bubble up to the next seconds.
      * ```
      * dayjs().millisecond(1)// => Dayjs
      * ```
      * Docs: https://day.js.org/docs/en/get-set/millisecond
      */
    def millisecond(value: Double): Dayjs = js.native
    
    def milliseconds(): Double = js.native
    def milliseconds(value: Double): web.typings.dayjs.esmPluginPluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    /**
      * Get the minutes.
      * ```
      * dayjs().minute()// => 0-59
      * ```
      * Docs: https://day.js.org/docs/en/get-set/minute
      */
    def minute(): Double = js.native
    /**
      * Set the minutes.
      *
      * Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the next hour.
      * ```
      * dayjs().minute(59)// => Dayjs
      * ```
      * Docs: https://day.js.org/docs/en/get-set/minute
      */
    def minute(value: Double): Dayjs = js.native
    
    def minutes(): Double = js.native
    def minutes(value: Double): web.typings.dayjs.esmPluginPluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    /**
      * Get the month.
      *
      * Months are zero indexed, so January is month 0.
      * ```
      * dayjs().month()// => 0-11
      * ```
      * Docs: https://day.js.org/docs/en/get-set/month
      */
    def month(): Double = js.native
    /**
      * Set the month.
      *
      * Months are zero indexed, so January is month 0.
      *
      * Accepts numbers from 0 to 11. If the range is exceeded, it will bubble up to the next year.
      * ```
      * dayjs().month(0)// => Dayjs
      * ```
      * Docs: https://day.js.org/docs/en/get-set/month
      */
    def month(value: Double): Dayjs = js.native
    
    def months(): Double = js.native
    def months(value: Double): web.typings.dayjs.esmPluginPluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def offsetName(): js.UndefOr[String] = js.native
    def offsetName(`type`: short | long): js.UndefOr[String] = js.native
    
    def quarter(): Double = js.native
    def quarter(quarter: Double): web.typings.dayjs.esmPluginQuarterOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    /**
      * Get the seconds.
      * ```
      * dayjs().second()// => 0-59
      * ```
      * Docs: https://day.js.org/docs/en/get-set/second
      */
    def second(): Double = js.native
    /**
      * Set the seconds.
      *
      * Accepts numbers from 0 to 59. If the range is exceeded, it will bubble up to the next minutes.
      * ```
      * dayjs().second(1)// Dayjs
      * ```
      */
    def second(value: Double): Dayjs = js.native
    
    def seconds(): Double = js.native
    def seconds(value: Double): web.typings.dayjs.esmPluginPluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def set(argument: js.Object): web.typings.dayjs.esmPluginObjectSupportMod.dayjsEsmAugmentingMod.Dayjs = js.native
    /**
      * Generic setter, accepting unit as first argument, and value as second, returns a new instance with the applied changes.
      *
      * In general:
      * ```
      * dayjs().set(unit, value) === dayjs()[unit](value)
      * ```
      * Units are case insensitive, and support plural and short forms.
      * ```
      * dayjs().set('date', 1)
      * dayjs().set('month', 3) // April
      * dayjs().set('second', 30)
      * ```
      * Docs: https://day.js.org/docs/en/get-set/set
      */
    def set(unit: UnitType, value: Double): Dayjs = js.native
    
    def startOf(unit: OpUnitType): web.typings.dayjs.esmPluginQuarterOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def startOf(unit: QUnitType): web.typings.dayjs.esmPluginQuarterOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def startOf(unit: ISOUnitType): web.typings.dayjs.esmPluginIsoWeekMod.dayjsEsmAugmentingMod.Dayjs = js.native
    /**
      * Returns a cloned Day.js object and set it to the start of a unit of time.
      * ```
      * dayjs().startOf('year')// => Dayjs
      * ```
      * Units are case insensitive, and support plural and short forms.
      *
      * Docs: https://day.js.org/docs/en/manipulate/start-of
      */
    @JSName("startOf")
    def startOf_Dayjs(unit: OpUnitType): Dayjs = js.native
    
    def subtract(argument: js.Object): web.typings.dayjs.esmPluginObjectSupportMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def subtract(duration: Duration): web.typings.dayjs.esmPluginDurationMod.dayjsEsmAugmentingMod.Dayjs = js.native
    /**
      * Returns a cloned Day.js object with a specified amount of time subtracted.
      * ```
      * dayjs().subtract(7, 'year')// => Dayjs
      * ```
      * Units are case insensitive, and support plural and short forms.
      *
      * Docs: https://day.js.org/docs/en/manipulate/subtract
      */
    def subtract(value: Double): Dayjs = js.native
    def subtract(value: Double, unit: ManipulateType): Dayjs = js.native
    def subtract(value: Double, unit: QUnitType): web.typings.dayjs.esmPluginQuarterOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def to(compared: ConfigType): String = js.native
    def to(compared: ConfigType, withoutSuffix: Boolean): String = js.native
    
    def toArray(): js.Array[Double] = js.native
    
    /**
      * To get a copy of the native `Date` object parsed from the Day.js object use `dayjs#toDate`.
      * ```
      * dayjs('2019-01-25').toDate()// => Date
      * ```
      */
    def toDate(): js.Date = js.native
    
    /**
      * To format as an ISO 8601 string.
      * ```
      * dayjs('2019-01-25').toISOString() // '2019-01-25T02:00:00.000Z'
      * ```
      * Docs: https://day.js.org/docs/en/display/as-iso-string
      */
    def toISOString(): String = js.native
    
    /**
      * To serialize as an ISO 8601 string.
      * ```
      * dayjs('2019-01-25').toJSON() // '2019-01-25T02:00:00.000Z'
      * ```
      * Docs: https://day.js.org/docs/en/display/as-json
      */
    def toJSON(): String = js.native
    
    def toNow(): String = js.native
    def toNow(withoutSuffix: Boolean): String = js.native
    
    def toObject(): DayjsObject = js.native
    
    def tz(): web.typings.dayjs.esmPluginTimezoneMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def tz(timezone: String): web.typings.dayjs.esmPluginTimezoneMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def tz(timezone: String, keepLocalTime: Boolean): web.typings.dayjs.esmPluginTimezoneMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def tz(timezone: Unit, keepLocalTime: Boolean): web.typings.dayjs.esmPluginTimezoneMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    /**
      * This returns the Unix timestamp (the number of **seconds** since the Unix Epoch) of the Day.js object.
      * ```
      * dayjs('2019-01-25').unix() // 1548381600
      * ```
      * This value is floored to the nearest second, and does not include a milliseconds component.
      *
      * Docs: https://day.js.org/docs/en/display/unix-timestamp
      */
    def unix(): Double = js.native
    
    def utc(): web.typings.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def utc(keepLocalTime: Boolean): web.typings.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    /**
      * Get the UTC offset in minutes.
      * ```
      * dayjs().utcOffset()
      * ```
      * Docs: https://day.js.org/docs/en/manipulate/utc-offset
      */
    def utcOffset(): Double = js.native
    def utcOffset(offset: String): web.typings.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def utcOffset(offset: String, keepLocalTime: Boolean): web.typings.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def utcOffset(offset: Double): web.typings.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def utcOffset(offset: Double, keepLocalTime: Boolean): web.typings.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def week(): Double = js.native
    def week(value: Double): web.typings.dayjs.esmPluginWeekOfYearMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def weekYear(): Double = js.native
    
    def weekday(): Double = js.native
    def weekday(value: Double): web.typings.dayjs.esmPluginWeekdayMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def weeks(): Double = js.native
    def weeks(value: Double): web.typings.dayjs.esmPluginPluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    /**
      * Get the year.
      * ```
      * dayjs().year()// => 2020
      * ```
      * Docs: https://day.js.org/docs/en/get-set/year
      */
    def year(): Double = js.native
    /**
      * Set the year.
      * ```
      * dayjs().year(2000)// => Dayjs
      * ```
      * Docs: https://day.js.org/docs/en/get-set/year
      */
    def year(value: Double): Dayjs = js.native
    
    def years(): Double = js.native
    def years(value: Double): web.typings.dayjs.esmPluginPluralGetSetMod.dayjsEsmAugmentingMod.Dayjs = js.native
  }
  
  @JSImport("dayjs/esm", "duration")
  @js.native
  val duration: CreateDurationType = js.native
  
  @scala.inline
  def extend[T](plugin: PluginFunc[T]): Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(plugin.asInstanceOf[js.Any]).asInstanceOf[Dayjs]
  @scala.inline
  def extend[T](plugin: PluginFunc[T], option: T): Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(plugin.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Dayjs]
  
  @scala.inline
  def isDayjs(d: Any): /* is dayjs.dayjs/esm.Dayjs */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDayjs")(d.asInstanceOf[js.Any]).asInstanceOf[/* is dayjs.dayjs/esm.Dayjs */ Boolean]
  
  @scala.inline
  def isDuration(d: Any): /* is dayjs.dayjs/esm/plugin/duration.Duration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDuration")(d.asInstanceOf[js.Any]).asInstanceOf[/* is dayjs.dayjs/esm/plugin/duration.Duration */ Boolean]
  
  @scala.inline
  def isMoment(input: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMoment")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def locale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")().asInstanceOf[String]
  @scala.inline
  def locale(preset: ILocale): String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def locale(preset: ILocale, `object`: PartialILocale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def locale(preset: ILocale, `object`: PartialILocale, isLocal: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], isLocal.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def locale(preset: ILocale, `object`: Unit, isLocal: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], isLocal.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def locale(preset: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def locale(preset: String, `object`: PartialILocale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def locale(preset: String, `object`: PartialILocale, isLocal: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], isLocal.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def locale(preset: String, `object`: Unit, isLocal: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], isLocal.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def locale(preset: Unit, `object`: PartialILocale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def locale(preset: Unit, `object`: PartialILocale, isLocal: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], isLocal.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def locale(preset: Unit, `object`: Unit, isLocal: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("locale")(preset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], isLocal.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def localeData(): web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.GlobalLocaleDataReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("localeData")().asInstanceOf[web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.GlobalLocaleDataReturn]
  
  @scala.inline
  def max(dayjs: Dayjs*): Dayjs | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(dayjs.asInstanceOf[Seq[js.Any]] :_*)).asInstanceOf[Dayjs | Null]
  @scala.inline
  def max(dayjs: js.Array[Dayjs]): Dayjs | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(dayjs.asInstanceOf[js.Any]).asInstanceOf[Dayjs | Null]
  
  @scala.inline
  def min(dayjs: Dayjs*): Dayjs | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(dayjs.asInstanceOf[Seq[js.Any]] :_*)).asInstanceOf[Dayjs | Null]
  @scala.inline
  def min(dayjs: js.Array[Dayjs]): Dayjs | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(dayjs.asInstanceOf[js.Any]).asInstanceOf[Dayjs | Null]
  
  @scala.inline
  def months(): web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.MonthNames = ^.asInstanceOf[js.Dynamic].applyDynamic("months")().asInstanceOf[web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.MonthNames]
  
  @scala.inline
  def monthsShort(): web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.MonthNames = ^.asInstanceOf[js.Dynamic].applyDynamic("monthsShort")().asInstanceOf[web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.MonthNames]
  
  @scala.inline
  def unix(
    t: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigInt */ Any
  ): Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("unix")(t.asInstanceOf[js.Any]).asInstanceOf[Dayjs]
  @scala.inline
  def unix(t: Double): Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("unix")(t.asInstanceOf[js.Any]).asInstanceOf[Dayjs]
  
  @scala.inline
  def updateLocale(localeName: String, customConfig: Record[String, Any]): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateLocale")(localeName.asInstanceOf[js.Any], customConfig.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  
  @scala.inline
  def utc(): web.typings.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("utc")().asInstanceOf[web.typings.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs]
  @scala.inline
  def utc(config: ConfigType): web.typings.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs = ^.asInstanceOf[js.Dynamic].applyDynamic("utc")(config.asInstanceOf[js.Any]).asInstanceOf[web.typings.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs]
  @scala.inline
  def utc(config: ConfigType, format: String): web.typings.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(config.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[web.typings.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs]
  @scala.inline
  def utc(config: ConfigType, format: String, strict: Boolean): web.typings.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(config.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[web.typings.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs]
  @scala.inline
  def utc(config: ConfigType, format: Unit, strict: Boolean): web.typings.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(config.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[web.typings.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs]
  @scala.inline
  def utc(config: Unit, format: String): web.typings.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(config.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[web.typings.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs]
  @scala.inline
  def utc(config: Unit, format: String, strict: Boolean): web.typings.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(config.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[web.typings.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs]
  @scala.inline
  def utc(config: Unit, format: Unit, strict: Boolean): web.typings.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs = (^.asInstanceOf[js.Dynamic].applyDynamic("utc")(config.asInstanceOf[js.Any], format.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[web.typings.dayjs.esmPluginUtcMod.dayjsEsmAugmentingMod.Dayjs]
  
  @scala.inline
  def weekdays(): web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")().asInstanceOf[web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames]
  @scala.inline
  def weekdays(localOrder: Boolean): web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdays")(localOrder.asInstanceOf[js.Any]).asInstanceOf[web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames]
  
  @scala.inline
  def weekdaysMin(): web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")().asInstanceOf[web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames]
  @scala.inline
  def weekdaysMin(localOrder: Boolean): web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysMin")(localOrder.asInstanceOf[js.Any]).asInstanceOf[web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames]
  
  @scala.inline
  def weekdaysShort(): web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")().asInstanceOf[web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames]
  @scala.inline
  def weekdaysShort(localOrder: Boolean): web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames = ^.asInstanceOf[js.Dynamic].applyDynamic("weekdaysShort")(localOrder.asInstanceOf[js.Any]).asInstanceOf[web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - js.Date
    - `web.typings`.dayjs.esmMod.Dayjs
    - scala.Null
    - scala.Unit
    - js.Tuple7[
  js.UndefOr[scala.Double], 
  js.UndefOr[scala.Double], 
  js.UndefOr[scala.Double], 
  js.UndefOr[scala.Double], 
  js.UndefOr[scala.Double], 
  js.UndefOr[scala.Double], 
  js.UndefOr[scala.Double]]
    - `web.typings`.dayjs.anon.D
  */
  type ConfigType = js.UndefOr[
    _ConfigType | (js.Tuple7[
      js.UndefOr[Double], 
      js.UndefOr[Double], 
      js.UndefOr[Double], 
      js.UndefOr[Double], 
      js.UndefOr[Double], 
      js.UndefOr[Double], 
      js.UndefOr[Double]
    ]) | String | Double | js.Date | Null
  ]
  
  @js.native
  trait ConfigTypeMap extends StObject {
    
    var default: js.UndefOr[String | Double | js.Date | Dayjs | Null] = js.native
    
    var arraySupport: js.Tuple7[
        js.UndefOr[Double], 
        js.UndefOr[Double], 
        js.UndefOr[Double], 
        js.UndefOr[Double], 
        js.UndefOr[Double], 
        js.UndefOr[Double], 
        js.UndefOr[Double]
      ] = js.native
    
    var bigIntSupport: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigInt */ Any = js.native
    
    var objectSupport: D = js.native
  }
  object ConfigTypeMap {
    
    @scala.inline
    def apply(
      arraySupport: js.Tuple7[
          js.UndefOr[Double], 
          js.UndefOr[Double], 
          js.UndefOr[Double], 
          js.UndefOr[Double], 
          js.UndefOr[Double], 
          js.UndefOr[Double], 
          js.UndefOr[Double]
        ],
      bigIntSupport: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigInt */ Any,
      objectSupport: D
    ): ConfigTypeMap = {
      val __obj = js.Dynamic.literal(arraySupport = arraySupport.asInstanceOf[js.Any], bigIntSupport = bigIntSupport.asInstanceOf[js.Any], objectSupport = objectSupport.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigTypeMap]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ConfigTypeMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArraySupport(
        value: js.Tuple7[
              js.UndefOr[Double], 
              js.UndefOr[Double], 
              js.UndefOr[Double], 
              js.UndefOr[Double], 
              js.UndefOr[Double], 
              js.UndefOr[Double], 
              js.UndefOr[Double]
            ]
      ): Self = StObject.set(x, "arraySupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBigIntSupport(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigInt */ Any
      ): Self = StObject.set(x, "bigIntSupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault(value: String | Double | js.Date | Dayjs): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultNull: Self = StObject.set(x, "default", null)
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setObjectSupport(value: D): Self = StObject.set(x, "objectSupport", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DayjsTimezone extends StObject {
    
    def apply(): web.typings.dayjs.esmPluginTimezoneMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def apply(date: ConfigType): web.typings.dayjs.esmPluginTimezoneMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def apply(date: ConfigType, format: String, timezone: String): web.typings.dayjs.esmPluginTimezoneMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def apply(date: ConfigType, timezone: String): web.typings.dayjs.esmPluginTimezoneMod.dayjsEsmAugmentingMod.Dayjs = js.native
    def apply(date: Unit, timezone: String): web.typings.dayjs.esmPluginTimezoneMod.dayjsEsmAugmentingMod.Dayjs = js.native
    
    def guess(): String = js.native
    
    def setDefault(): Unit = js.native
    def setDefault(timezone: String): Unit = js.native
  }
  
  @js.native
  trait FormatObject extends StObject {
    
    var format: js.UndefOr[String] = js.native
    
    var locale: js.UndefOr[String] = js.native
    
    var utc: js.UndefOr[Boolean] = js.native
  }
  object FormatObject {
    
    @scala.inline
    def apply(): FormatObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatObject]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FormatObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setUtc(value: Boolean): Self = StObject.set(x, "utc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtcUndefined: Self = StObject.set(x, "utc", js.undefined)
    }
  }
  
  @js.native
  trait GlobalLocaleDataReturn extends StObject {
    
    def firstDayOfWeek(): Double = js.native
    
    def longDateFormat(format: String): String = js.native
    
    def meridiem(): String = js.native
    def meridiem(hour: Double): String = js.native
    def meridiem(hour: Double, minute: Double): String = js.native
    def meridiem(hour: Double, minute: Double, isLower: Boolean): String = js.native
    def meridiem(hour: Double, minute: Unit, isLower: Boolean): String = js.native
    def meridiem(hour: Unit, minute: Double): String = js.native
    def meridiem(hour: Unit, minute: Double, isLower: Boolean): String = js.native
    def meridiem(hour: Unit, minute: Unit, isLower: Boolean): String = js.native
    
    def months(): web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.MonthNames = js.native
    
    def monthsShort(): web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.MonthNames = js.native
    
    def ordinal(n: Double): String = js.native
    
    def weekdays(): web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
    
    def weekdaysMin(): web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
    
    def weekdaysShort(): web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
  }
  
  @js.native
  trait InstanceLocaleDataReturn extends StObject {
    
    def firstDayOfWeek(): Double = js.native
    
    def longDateFormat(format: String): String = js.native
    
    def meridiem(): String = js.native
    def meridiem(hour: Double): String = js.native
    def meridiem(hour: Double, minute: Double): String = js.native
    def meridiem(hour: Double, minute: Double, isLower: Boolean): String = js.native
    def meridiem(hour: Double, minute: Unit, isLower: Boolean): String = js.native
    def meridiem(hour: Unit, minute: Double): String = js.native
    def meridiem(hour: Unit, minute: Double, isLower: Boolean): String = js.native
    def meridiem(hour: Unit, minute: Unit, isLower: Boolean): String = js.native
    
    def months(): web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.MonthNames = js.native
    def months(instance: web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.Dayjs): web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.MonthNames = js.native
    
    def monthsShort(): web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.MonthNames = js.native
    def monthsShort(instance: web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.Dayjs): web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.MonthNames = js.native
    
    def ordinal(n: Double): String = js.native
    
    def weekdays(): web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
    def weekdays(instance: web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.Dayjs): web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
    
    def weekdaysMin(): web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
    def weekdaysMin(instance: web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.Dayjs): web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
    
    def weekdaysShort(): web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
    def weekdaysShort(instance: web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.Dayjs): web.typings.dayjs.esmPluginLocaleDataMod.dayjsEsmAugmentingMod.WeekdayNames = js.native
  }
  
  /* Inlined std.Exclude<dayjs.dayjs/esm.OpUnitType, 'date' | 'dates'> */
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
  trait ManipulateType extends StObject
  object ManipulateType {
    
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
  
  type MonthNames = js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.dayjs.dayjsStrings.week
    - `web.typings`.dayjs.dayjsStrings.weeks
    - `web.typings`.dayjs.dayjsStrings.w
    - `web.typings`.dayjs.dayjsStrings.millisecond
    - `web.typings`.dayjs.dayjsStrings.second
    - `web.typings`.dayjs.dayjsStrings.minute
    - `web.typings`.dayjs.dayjsStrings.hour
    - `web.typings`.dayjs.dayjsStrings.day
    - `web.typings`.dayjs.dayjsStrings.month
    - `web.typings`.dayjs.dayjsStrings.year
    - `web.typings`.dayjs.dayjsStrings.date
    - `web.typings`.dayjs.dayjsStrings.milliseconds
    - `web.typings`.dayjs.dayjsStrings.seconds
    - `web.typings`.dayjs.dayjsStrings.minutes
    - `web.typings`.dayjs.dayjsStrings.hours
    - `web.typings`.dayjs.dayjsStrings.days
    - `web.typings`.dayjs.dayjsStrings.months
    - `web.typings`.dayjs.dayjsStrings.years
    - `web.typings`.dayjs.dayjsStrings.dates
    - `web.typings`.dayjs.dayjsStrings.d_
    - `web.typings`.dayjs.dayjsStrings.D
    - `web.typings`.dayjs.dayjsStrings.M
    - `web.typings`.dayjs.dayjsStrings.y
    - `web.typings`.dayjs.dayjsStrings.h
    - `web.typings`.dayjs.dayjsStrings.m_
    - `web.typings`.dayjs.dayjsStrings.s
    - `web.typings`.dayjs.dayjsStrings.ms
  */
  trait OpUnitType extends StObject
  object OpUnitType {
    
    @scala.inline
    def D: web.typings.dayjs.dayjsStrings.D = "D".asInstanceOf[web.typings.dayjs.dayjsStrings.D]
    
    @scala.inline
    def M: web.typings.dayjs.dayjsStrings.M = "M".asInstanceOf[web.typings.dayjs.dayjsStrings.M]
    
    @scala.inline
    def d: d_ = "d".asInstanceOf[d_]
    
    @scala.inline
    def date: web.typings.dayjs.dayjsStrings.date = "date".asInstanceOf[web.typings.dayjs.dayjsStrings.date]
    
    @scala.inline
    def dates: web.typings.dayjs.dayjsStrings.dates = "dates".asInstanceOf[web.typings.dayjs.dayjsStrings.dates]
    
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
  
  type OptionType = FormatObject | String | js.Array[String]
  
  type PluginFunc[T] = js.Function3[
    /* option */ T, 
    /* c */ Instantiable1[/* config */ js.UndefOr[ConfigType], Dayjs], 
    /* d */ FnCall, 
    Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.dayjs.dayjsStrings.quarter
    - `web.typings`.dayjs.dayjsStrings.quarters
    - `web.typings`.dayjs.dayjsStrings.Q
    - `web.typings`.dayjs.dayjsStrings.millisecond
    - `web.typings`.dayjs.dayjsStrings.second
    - `web.typings`.dayjs.dayjsStrings.minute
    - `web.typings`.dayjs.dayjsStrings.hour
    - `web.typings`.dayjs.dayjsStrings.day
    - `web.typings`.dayjs.dayjsStrings.month
    - `web.typings`.dayjs.dayjsStrings.year
    - `web.typings`.dayjs.dayjsStrings.date
    - `web.typings`.dayjs.dayjsStrings.milliseconds
    - `web.typings`.dayjs.dayjsStrings.seconds
    - `web.typings`.dayjs.dayjsStrings.minutes
    - `web.typings`.dayjs.dayjsStrings.hours
    - `web.typings`.dayjs.dayjsStrings.days
    - `web.typings`.dayjs.dayjsStrings.months
    - `web.typings`.dayjs.dayjsStrings.years
    - `web.typings`.dayjs.dayjsStrings.dates
    - `web.typings`.dayjs.dayjsStrings.d_
    - `web.typings`.dayjs.dayjsStrings.D
    - `web.typings`.dayjs.dayjsStrings.M
    - `web.typings`.dayjs.dayjsStrings.y
    - `web.typings`.dayjs.dayjsStrings.h
    - `web.typings`.dayjs.dayjsStrings.m_
    - `web.typings`.dayjs.dayjsStrings.s
    - `web.typings`.dayjs.dayjsStrings.ms
  */
  trait QUnitType extends StObject
  object QUnitType {
    
    @scala.inline
    def D: web.typings.dayjs.dayjsStrings.D = "D".asInstanceOf[web.typings.dayjs.dayjsStrings.D]
    
    @scala.inline
    def M: web.typings.dayjs.dayjsStrings.M = "M".asInstanceOf[web.typings.dayjs.dayjsStrings.M]
    
    @scala.inline
    def Q: web.typings.dayjs.dayjsStrings.Q = "Q".asInstanceOf[web.typings.dayjs.dayjsStrings.Q]
    
    @scala.inline
    def d: d_ = "d".asInstanceOf[d_]
    
    @scala.inline
    def date: web.typings.dayjs.dayjsStrings.date = "date".asInstanceOf[web.typings.dayjs.dayjsStrings.date]
    
    @scala.inline
    def dates: web.typings.dayjs.dayjsStrings.dates = "dates".asInstanceOf[web.typings.dayjs.dayjsStrings.dates]
    
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
    def quarter: web.typings.dayjs.dayjsStrings.quarter = "quarter".asInstanceOf[web.typings.dayjs.dayjsStrings.quarter]
    
    @scala.inline
    def quarters: web.typings.dayjs.dayjsStrings.quarters = "quarters".asInstanceOf[web.typings.dayjs.dayjsStrings.quarters]
    
    @scala.inline
    def s: web.typings.dayjs.dayjsStrings.s = "s".asInstanceOf[web.typings.dayjs.dayjsStrings.s]
    
    @scala.inline
    def second: web.typings.dayjs.dayjsStrings.second = "second".asInstanceOf[web.typings.dayjs.dayjsStrings.second]
    
    @scala.inline
    def seconds: web.typings.dayjs.dayjsStrings.seconds = "seconds".asInstanceOf[web.typings.dayjs.dayjsStrings.seconds]
    
    @scala.inline
    def y: web.typings.dayjs.dayjsStrings.y = "y".asInstanceOf[web.typings.dayjs.dayjsStrings.y]
    
    @scala.inline
    def year: web.typings.dayjs.dayjsStrings.year = "year".asInstanceOf[web.typings.dayjs.dayjsStrings.year]
    
    @scala.inline
    def years: web.typings.dayjs.dayjsStrings.years = "years".asInstanceOf[web.typings.dayjs.dayjsStrings.years]
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.dayjs.dayjsStrings.millisecond
    - `web.typings`.dayjs.dayjsStrings.second
    - `web.typings`.dayjs.dayjsStrings.minute
    - `web.typings`.dayjs.dayjsStrings.hour
    - `web.typings`.dayjs.dayjsStrings.day
    - `web.typings`.dayjs.dayjsStrings.month
    - `web.typings`.dayjs.dayjsStrings.year
    - `web.typings`.dayjs.dayjsStrings.date
    - `web.typings`.dayjs.dayjsStrings.milliseconds
    - `web.typings`.dayjs.dayjsStrings.seconds
    - `web.typings`.dayjs.dayjsStrings.minutes
    - `web.typings`.dayjs.dayjsStrings.hours
    - `web.typings`.dayjs.dayjsStrings.days
    - `web.typings`.dayjs.dayjsStrings.months
    - `web.typings`.dayjs.dayjsStrings.years
    - `web.typings`.dayjs.dayjsStrings.dates
    - `web.typings`.dayjs.dayjsStrings.d_
    - `web.typings`.dayjs.dayjsStrings.D
    - `web.typings`.dayjs.dayjsStrings.M
    - `web.typings`.dayjs.dayjsStrings.y
    - `web.typings`.dayjs.dayjsStrings.h
    - `web.typings`.dayjs.dayjsStrings.m_
    - `web.typings`.dayjs.dayjsStrings.s
    - `web.typings`.dayjs.dayjsStrings.ms
  */
  trait UnitType extends StObject
  object UnitType {
    
    @scala.inline
    def D: web.typings.dayjs.dayjsStrings.D = "D".asInstanceOf[web.typings.dayjs.dayjsStrings.D]
    
    @scala.inline
    def M: web.typings.dayjs.dayjsStrings.M = "M".asInstanceOf[web.typings.dayjs.dayjsStrings.M]
    
    @scala.inline
    def d: d_ = "d".asInstanceOf[d_]
    
    @scala.inline
    def date: web.typings.dayjs.dayjsStrings.date = "date".asInstanceOf[web.typings.dayjs.dayjsStrings.date]
    
    @scala.inline
    def dates: web.typings.dayjs.dayjsStrings.dates = "dates".asInstanceOf[web.typings.dayjs.dayjsStrings.dates]
    
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
    def y: web.typings.dayjs.dayjsStrings.y = "y".asInstanceOf[web.typings.dayjs.dayjsStrings.y]
    
    @scala.inline
    def year: web.typings.dayjs.dayjsStrings.year = "year".asInstanceOf[web.typings.dayjs.dayjsStrings.year]
    
    @scala.inline
    def years: web.typings.dayjs.dayjsStrings.years = "years".asInstanceOf[web.typings.dayjs.dayjsStrings.years]
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.dayjs.dayjsStrings.millisecond
    - `web.typings`.dayjs.dayjsStrings.second
    - `web.typings`.dayjs.dayjsStrings.minute
    - `web.typings`.dayjs.dayjsStrings.hour
    - `web.typings`.dayjs.dayjsStrings.day
    - `web.typings`.dayjs.dayjsStrings.month
    - `web.typings`.dayjs.dayjsStrings.year
    - `web.typings`.dayjs.dayjsStrings.date
  */
  trait UnitTypeLong extends StObject
  object UnitTypeLong {
    
    @scala.inline
    def date: web.typings.dayjs.dayjsStrings.date = "date".asInstanceOf[web.typings.dayjs.dayjsStrings.date]
    
    @scala.inline
    def day: web.typings.dayjs.dayjsStrings.day = "day".asInstanceOf[web.typings.dayjs.dayjsStrings.day]
    
    @scala.inline
    def hour: web.typings.dayjs.dayjsStrings.hour = "hour".asInstanceOf[web.typings.dayjs.dayjsStrings.hour]
    
    @scala.inline
    def millisecond: web.typings.dayjs.dayjsStrings.millisecond = "millisecond".asInstanceOf[web.typings.dayjs.dayjsStrings.millisecond]
    
    @scala.inline
    def minute: web.typings.dayjs.dayjsStrings.minute = "minute".asInstanceOf[web.typings.dayjs.dayjsStrings.minute]
    
    @scala.inline
    def month: web.typings.dayjs.dayjsStrings.month = "month".asInstanceOf[web.typings.dayjs.dayjsStrings.month]
    
    @scala.inline
    def second: web.typings.dayjs.dayjsStrings.second = "second".asInstanceOf[web.typings.dayjs.dayjsStrings.second]
    
    @scala.inline
    def year: web.typings.dayjs.dayjsStrings.year = "year".asInstanceOf[web.typings.dayjs.dayjsStrings.year]
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.dayjs.dayjsStrings.milliseconds
    - `web.typings`.dayjs.dayjsStrings.seconds
    - `web.typings`.dayjs.dayjsStrings.minutes
    - `web.typings`.dayjs.dayjsStrings.hours
    - `web.typings`.dayjs.dayjsStrings.days
    - `web.typings`.dayjs.dayjsStrings.months
    - `web.typings`.dayjs.dayjsStrings.years
    - `web.typings`.dayjs.dayjsStrings.dates
  */
  trait UnitTypeLongPlural extends StObject
  object UnitTypeLongPlural {
    
    @scala.inline
    def dates: web.typings.dayjs.dayjsStrings.dates = "dates".asInstanceOf[web.typings.dayjs.dayjsStrings.dates]
    
    @scala.inline
    def days: web.typings.dayjs.dayjsStrings.days = "days".asInstanceOf[web.typings.dayjs.dayjsStrings.days]
    
    @scala.inline
    def hours: web.typings.dayjs.dayjsStrings.hours = "hours".asInstanceOf[web.typings.dayjs.dayjsStrings.hours]
    
    @scala.inline
    def milliseconds: web.typings.dayjs.dayjsStrings.milliseconds = "milliseconds".asInstanceOf[web.typings.dayjs.dayjsStrings.milliseconds]
    
    @scala.inline
    def minutes: web.typings.dayjs.dayjsStrings.minutes = "minutes".asInstanceOf[web.typings.dayjs.dayjsStrings.minutes]
    
    @scala.inline
    def months: web.typings.dayjs.dayjsStrings.months = "months".asInstanceOf[web.typings.dayjs.dayjsStrings.months]
    
    @scala.inline
    def seconds: web.typings.dayjs.dayjsStrings.seconds = "seconds".asInstanceOf[web.typings.dayjs.dayjsStrings.seconds]
    
    @scala.inline
    def years: web.typings.dayjs.dayjsStrings.years = "years".asInstanceOf[web.typings.dayjs.dayjsStrings.years]
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.dayjs.dayjsStrings.d_
    - `web.typings`.dayjs.dayjsStrings.D
    - `web.typings`.dayjs.dayjsStrings.M
    - `web.typings`.dayjs.dayjsStrings.y
    - `web.typings`.dayjs.dayjsStrings.h
    - `web.typings`.dayjs.dayjsStrings.m_
    - `web.typings`.dayjs.dayjsStrings.s
    - `web.typings`.dayjs.dayjsStrings.ms
  */
  trait UnitTypeShort extends StObject
  object UnitTypeShort {
    
    @scala.inline
    def D: web.typings.dayjs.dayjsStrings.D = "D".asInstanceOf[web.typings.dayjs.dayjsStrings.D]
    
    @scala.inline
    def M: web.typings.dayjs.dayjsStrings.M = "M".asInstanceOf[web.typings.dayjs.dayjsStrings.M]
    
    @scala.inline
    def d: d_ = "d".asInstanceOf[d_]
    
    @scala.inline
    def h: web.typings.dayjs.dayjsStrings.h = "h".asInstanceOf[web.typings.dayjs.dayjsStrings.h]
    
    @scala.inline
    def m: m_ = "m".asInstanceOf[m_]
    
    @scala.inline
    def ms: web.typings.dayjs.dayjsStrings.ms = "ms".asInstanceOf[web.typings.dayjs.dayjsStrings.ms]
    
    @scala.inline
    def s: web.typings.dayjs.dayjsStrings.s = "s".asInstanceOf[web.typings.dayjs.dayjsStrings.s]
    
    @scala.inline
    def y: web.typings.dayjs.dayjsStrings.y = "y".asInstanceOf[web.typings.dayjs.dayjsStrings.y]
  }
  
  type WeekdayNames = js.Tuple7[String, String, String, String, String, String, String]
  
  trait _ConfigType extends StObject
}
