package web.typings.std

import web.typings.std.stdStrings.`2-digit`
import web.typings.std.stdStrings.`best fit`
import web.typings.std.stdStrings.basic
import web.typings.std.stdStrings.long
import web.typings.std.stdStrings.lookup
import web.typings.std.stdStrings.narrow
import web.typings.std.stdStrings.numeric
import web.typings.std.stdStrings.short
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////
/// ECMAScript Internationalization API
/////////////////////////////
object Intl {
  
  @js.native
  trait Collator extends StObject {
    
    /* standard es5 */
    def compare(x: java.lang.String, y: java.lang.String): Double = js.native
    
    /* standard es5 */
    def resolvedOptions(): ResolvedCollatorOptions = js.native
  }
  object Collator {
    
    @scala.inline
    def apply(
      compare: (java.lang.String, java.lang.String) => Double,
      resolvedOptions: () => ResolvedCollatorOptions
    ): Collator = {
      val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare), resolvedOptions = js.Any.fromFunction0(resolvedOptions))
      __obj.asInstanceOf[Collator]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Collator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompare(value: (java.lang.String, java.lang.String) => Double): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
      
      @scala.inline
      def setResolvedOptions(value: () => ResolvedCollatorOptions): Self = StObject.set(x, "resolvedOptions", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait CollatorOptions extends StObject {
    
    /* standard es5 */
    var caseFirst: js.UndefOr[java.lang.String] = js.native
    
    /* standard es5 */
    var ignorePunctuation: js.UndefOr[scala.Boolean] = js.native
    
    /* standard es5 */
    var localeMatcher: js.UndefOr[java.lang.String] = js.native
    
    /* standard es5 */
    var numeric: js.UndefOr[scala.Boolean] = js.native
    
    /* standard es5 */
    var sensitivity: js.UndefOr[java.lang.String] = js.native
    
    /* standard es5 */
    var usage: js.UndefOr[java.lang.String] = js.native
  }
  object CollatorOptions {
    
    @scala.inline
    def apply(): CollatorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollatorOptions]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CollatorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseFirst(value: java.lang.String): Self = StObject.set(x, "caseFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseFirstUndefined: Self = StObject.set(x, "caseFirst", js.undefined)
      
      @scala.inline
      def setIgnorePunctuation(value: scala.Boolean): Self = StObject.set(x, "ignorePunctuation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnorePunctuationUndefined: Self = StObject.set(x, "ignorePunctuation", js.undefined)
      
      @scala.inline
      def setLocaleMatcher(value: java.lang.String): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
      
      @scala.inline
      def setNumeric(value: scala.Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
      
      @scala.inline
      def setSensitivity(value: java.lang.String): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSensitivityUndefined: Self = StObject.set(x, "sensitivity", js.undefined)
      
      @scala.inline
      def setUsage(value: java.lang.String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    }
  }
  
  @js.native
  trait DateTimeFormat extends StObject {
    
    /* standard es5 */
    def format(): java.lang.String = js.native
    def format(date: js.Date): java.lang.String = js.native
    def format(date: Double): java.lang.String = js.native
    
    /* standard es5 */
    def resolvedOptions(): ResolvedDateTimeFormatOptions = js.native
  }
  
  @js.native
  trait DateTimeFormatOptions extends StObject {
    
    /* standard es5 */
    var day: js.UndefOr[numeric | `2-digit`] = js.native
    
    /* standard es5 */
    var era: js.UndefOr[long | short | narrow] = js.native
    
    /* standard es5 */
    var formatMatcher: js.UndefOr[(`best fit`) | basic] = js.native
    
    /* standard es5 */
    var hour: js.UndefOr[numeric | `2-digit`] = js.native
    
    /* standard es5 */
    var hour12: js.UndefOr[scala.Boolean] = js.native
    
    /* standard es5 */
    var localeMatcher: js.UndefOr[(`best fit`) | lookup] = js.native
    
    /* standard es5 */
    var minute: js.UndefOr[numeric | `2-digit`] = js.native
    
    /* standard es5 */
    var month: js.UndefOr[numeric | `2-digit` | long | short | narrow] = js.native
    
    /* standard es5 */
    var second: js.UndefOr[numeric | `2-digit`] = js.native
    
    /* standard es5 */
    var timeZone: js.UndefOr[java.lang.String] = js.native
    
    /* standard es5 */
    var timeZoneName: js.UndefOr[long | short] = js.native
    
    /* standard es5 */
    var weekday: js.UndefOr[long | short | narrow] = js.native
    
    /* standard es5 */
    var year: js.UndefOr[numeric | `2-digit`] = js.native
  }
  object DateTimeFormatOptions {
    
    @scala.inline
    def apply(): DateTimeFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateTimeFormatOptions]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DateTimeFormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDay(value: numeric | `2-digit`): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      @scala.inline
      def setEra(value: long | short | narrow): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEraUndefined: Self = StObject.set(x, "era", js.undefined)
      
      @scala.inline
      def setFormatMatcher(value: (`best fit`) | basic): Self = StObject.set(x, "formatMatcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatMatcherUndefined: Self = StObject.set(x, "formatMatcher", js.undefined)
      
      @scala.inline
      def setHour(value: numeric | `2-digit`): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHour12(value: scala.Boolean): Self = StObject.set(x, "hour12", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHour12Undefined: Self = StObject.set(x, "hour12", js.undefined)
      
      @scala.inline
      def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
      
      @scala.inline
      def setLocaleMatcher(value: (`best fit`) | lookup): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
      
      @scala.inline
      def setMinute(value: numeric | `2-digit`): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
      
      @scala.inline
      def setMonth(value: numeric | `2-digit` | long | short | narrow): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      @scala.inline
      def setSecond(value: numeric | `2-digit`): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
      
      @scala.inline
      def setTimeZone(value: java.lang.String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeZoneName(value: long | short): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeZoneNameUndefined: Self = StObject.set(x, "timeZoneName", js.undefined)
      
      @scala.inline
      def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
      
      @scala.inline
      def setWeekday(value: long | short | narrow): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
      
      @scala.inline
      def setYear(value: numeric | `2-digit`): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  @js.native
  trait NumberFormat extends StObject {
    
    /* standard es5 */
    def format(value: Double): java.lang.String = js.native
    
    /* standard es5 */
    def resolvedOptions(): ResolvedNumberFormatOptions = js.native
  }
  object NumberFormat {
    
    @scala.inline
    def apply(format: Double => java.lang.String, resolvedOptions: () => ResolvedNumberFormatOptions): NumberFormat = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), resolvedOptions = js.Any.fromFunction0(resolvedOptions))
      __obj.asInstanceOf[NumberFormat]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: NumberFormat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: Double => java.lang.String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolvedOptions(value: () => ResolvedNumberFormatOptions): Self = StObject.set(x, "resolvedOptions", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait NumberFormatOptions extends StObject {
    
    /* standard es5 */
    var currency: js.UndefOr[java.lang.String] = js.native
    
    /* standard es5 */
    var currencyDisplay: js.UndefOr[java.lang.String] = js.native
    
    /* standard es5 */
    var currencySign: js.UndefOr[java.lang.String] = js.native
    
    /* standard es5 */
    var localeMatcher: js.UndefOr[java.lang.String] = js.native
    
    /* standard es5 */
    var maximumFractionDigits: js.UndefOr[Double] = js.native
    
    /* standard es5 */
    var maximumSignificantDigits: js.UndefOr[Double] = js.native
    
    /* standard es5 */
    var minimumFractionDigits: js.UndefOr[Double] = js.native
    
    /* standard es5 */
    var minimumIntegerDigits: js.UndefOr[Double] = js.native
    
    /* standard es5 */
    var minimumSignificantDigits: js.UndefOr[Double] = js.native
    
    /* standard es5 */
    var style: js.UndefOr[java.lang.String] = js.native
    
    /* standard es5 */
    var useGrouping: js.UndefOr[scala.Boolean] = js.native
  }
  object NumberFormatOptions {
    
    @scala.inline
    def apply(): NumberFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberFormatOptions]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: NumberFormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrency(value: java.lang.String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyDisplay(value: java.lang.String): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyDisplayUndefined: Self = StObject.set(x, "currencyDisplay", js.undefined)
      
      @scala.inline
      def setCurrencySign(value: java.lang.String): Self = StObject.set(x, "currencySign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencySignUndefined: Self = StObject.set(x, "currencySign", js.undefined)
      
      @scala.inline
      def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      @scala.inline
      def setLocaleMatcher(value: java.lang.String): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
      
      @scala.inline
      def setMaximumFractionDigits(value: Double): Self = StObject.set(x, "maximumFractionDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumFractionDigitsUndefined: Self = StObject.set(x, "maximumFractionDigits", js.undefined)
      
      @scala.inline
      def setMaximumSignificantDigits(value: Double): Self = StObject.set(x, "maximumSignificantDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumSignificantDigitsUndefined: Self = StObject.set(x, "maximumSignificantDigits", js.undefined)
      
      @scala.inline
      def setMinimumFractionDigits(value: Double): Self = StObject.set(x, "minimumFractionDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumFractionDigitsUndefined: Self = StObject.set(x, "minimumFractionDigits", js.undefined)
      
      @scala.inline
      def setMinimumIntegerDigits(value: Double): Self = StObject.set(x, "minimumIntegerDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumIntegerDigitsUndefined: Self = StObject.set(x, "minimumIntegerDigits", js.undefined)
      
      @scala.inline
      def setMinimumSignificantDigits(value: Double): Self = StObject.set(x, "minimumSignificantDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumSignificantDigitsUndefined: Self = StObject.set(x, "minimumSignificantDigits", js.undefined)
      
      @scala.inline
      def setStyle(value: java.lang.String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setUseGrouping(value: scala.Boolean): Self = StObject.set(x, "useGrouping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseGroupingUndefined: Self = StObject.set(x, "useGrouping", js.undefined)
    }
  }
  
  @js.native
  trait ResolvedCollatorOptions extends StObject {
    
    /* standard es5 */
    var caseFirst: java.lang.String = js.native
    
    /* standard es5 */
    var collation: java.lang.String = js.native
    
    /* standard es5 */
    var ignorePunctuation: scala.Boolean = js.native
    
    /* standard es5 */
    var locale: java.lang.String = js.native
    
    /* standard es5 */
    var numeric: scala.Boolean = js.native
    
    /* standard es5 */
    var sensitivity: java.lang.String = js.native
    
    /* standard es5 */
    var usage: java.lang.String = js.native
  }
  object ResolvedCollatorOptions {
    
    @scala.inline
    def apply(
      caseFirst: java.lang.String,
      collation: java.lang.String,
      ignorePunctuation: scala.Boolean,
      locale: java.lang.String,
      numeric: scala.Boolean,
      sensitivity: java.lang.String,
      usage: java.lang.String
    ): ResolvedCollatorOptions = {
      val __obj = js.Dynamic.literal(caseFirst = caseFirst.asInstanceOf[js.Any], collation = collation.asInstanceOf[js.Any], ignorePunctuation = ignorePunctuation.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], sensitivity = sensitivity.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedCollatorOptions]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ResolvedCollatorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseFirst(value: java.lang.String): Self = StObject.set(x, "caseFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollation(value: java.lang.String): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnorePunctuation(value: scala.Boolean): Self = StObject.set(x, "ignorePunctuation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: java.lang.String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumeric(value: scala.Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSensitivity(value: java.lang.String): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsage(value: java.lang.String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResolvedDateTimeFormatOptions extends StObject {
    
    /* standard es5 */
    var calendar: java.lang.String = js.native
    
    /* standard es5 */
    var day: js.UndefOr[java.lang.String] = js.native
    
    /* standard es5 */
    var era: js.UndefOr[java.lang.String] = js.native
    
    /* standard es5 */
    var hour: js.UndefOr[java.lang.String] = js.native
    
    /* standard es5 */
    var hour12: js.UndefOr[scala.Boolean] = js.native
    
    /* standard es5 */
    var locale: java.lang.String = js.native
    
    /* standard es5 */
    var minute: js.UndefOr[java.lang.String] = js.native
    
    /* standard es5 */
    var month: js.UndefOr[java.lang.String] = js.native
    
    /* standard es5 */
    var numberingSystem: java.lang.String = js.native
    
    /* standard es5 */
    var second: js.UndefOr[java.lang.String] = js.native
    
    /* standard es5 */
    var timeZone: java.lang.String = js.native
    
    /* standard es5 */
    var timeZoneName: js.UndefOr[java.lang.String] = js.native
    
    /* standard es5 */
    var weekday: js.UndefOr[java.lang.String] = js.native
    
    /* standard es5 */
    var year: js.UndefOr[java.lang.String] = js.native
  }
  object ResolvedDateTimeFormatOptions {
    
    @scala.inline
    def apply(
      calendar: java.lang.String,
      locale: java.lang.String,
      numberingSystem: java.lang.String,
      timeZone: java.lang.String
    ): ResolvedDateTimeFormatOptions = {
      val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedDateTimeFormatOptions]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ResolvedDateTimeFormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalendar(value: java.lang.String): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDay(value: java.lang.String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      @scala.inline
      def setEra(value: java.lang.String): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEraUndefined: Self = StObject.set(x, "era", js.undefined)
      
      @scala.inline
      def setHour(value: java.lang.String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHour12(value: scala.Boolean): Self = StObject.set(x, "hour12", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHour12Undefined: Self = StObject.set(x, "hour12", js.undefined)
      
      @scala.inline
      def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
      
      @scala.inline
      def setLocale(value: java.lang.String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinute(value: java.lang.String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
      
      @scala.inline
      def setMonth(value: java.lang.String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      @scala.inline
      def setNumberingSystem(value: java.lang.String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecond(value: java.lang.String): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
      
      @scala.inline
      def setTimeZone(value: java.lang.String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeZoneName(value: java.lang.String): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeZoneNameUndefined: Self = StObject.set(x, "timeZoneName", js.undefined)
      
      @scala.inline
      def setWeekday(value: java.lang.String): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
      
      @scala.inline
      def setYear(value: java.lang.String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  @js.native
  trait ResolvedNumberFormatOptions extends StObject {
    
    /* standard es5 */
    var currency: js.UndefOr[java.lang.String] = js.native
    
    /* standard es5 */
    var currencyDisplay: js.UndefOr[java.lang.String] = js.native
    
    /* standard es5 */
    var locale: java.lang.String = js.native
    
    /* standard es5 */
    var maximumFractionDigits: Double = js.native
    
    /* standard es5 */
    var maximumSignificantDigits: js.UndefOr[Double] = js.native
    
    /* standard es5 */
    var minimumFractionDigits: Double = js.native
    
    /* standard es5 */
    var minimumIntegerDigits: Double = js.native
    
    /* standard es5 */
    var minimumSignificantDigits: js.UndefOr[Double] = js.native
    
    /* standard es5 */
    var numberingSystem: java.lang.String = js.native
    
    /* standard es5 */
    var style: java.lang.String = js.native
    
    /* standard es5 */
    var useGrouping: scala.Boolean = js.native
  }
  object ResolvedNumberFormatOptions {
    
    @scala.inline
    def apply(
      locale: java.lang.String,
      maximumFractionDigits: Double,
      minimumFractionDigits: Double,
      minimumIntegerDigits: Double,
      numberingSystem: java.lang.String,
      style: java.lang.String,
      useGrouping: scala.Boolean
    ): ResolvedNumberFormatOptions = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], maximumFractionDigits = maximumFractionDigits.asInstanceOf[js.Any], minimumFractionDigits = minimumFractionDigits.asInstanceOf[js.Any], minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], useGrouping = useGrouping.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedNumberFormatOptions]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ResolvedNumberFormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrency(value: java.lang.String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyDisplay(value: java.lang.String): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyDisplayUndefined: Self = StObject.set(x, "currencyDisplay", js.undefined)
      
      @scala.inline
      def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      @scala.inline
      def setLocale(value: java.lang.String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumFractionDigits(value: Double): Self = StObject.set(x, "maximumFractionDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumSignificantDigits(value: Double): Self = StObject.set(x, "maximumSignificantDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumSignificantDigitsUndefined: Self = StObject.set(x, "maximumSignificantDigits", js.undefined)
      
      @scala.inline
      def setMinimumFractionDigits(value: Double): Self = StObject.set(x, "minimumFractionDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumIntegerDigits(value: Double): Self = StObject.set(x, "minimumIntegerDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumSignificantDigits(value: Double): Self = StObject.set(x, "minimumSignificantDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumSignificantDigitsUndefined: Self = StObject.set(x, "minimumSignificantDigits", js.undefined)
      
      @scala.inline
      def setNumberingSystem(value: java.lang.String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: java.lang.String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseGrouping(value: scala.Boolean): Self = StObject.set(x, "useGrouping", value.asInstanceOf[js.Any])
    }
  }
}
