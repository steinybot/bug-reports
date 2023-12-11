package web.typings.std.global

import web.typings.std.Intl.Collator
import web.typings.std.Intl.CollatorOptions
import web.typings.std.Intl.DateTimeFormat
import web.typings.std.Intl.DateTimeFormatOptions
import web.typings.std.Intl.NumberFormat
import web.typings.std.Intl.NumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////
/// ECMAScript Internationalization API
/////////////////////////////
object Intl {
  
  object Collator {
    
    /* standard es5 */
    @scala.inline
    def apply(): web.typings.std.Intl.Collator = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[web.typings.std.Intl.Collator]
    @scala.inline
    def apply(locales: java.lang.String): web.typings.std.Intl.Collator = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[web.typings.std.Intl.Collator]
    @scala.inline
    def apply(locales: java.lang.String, options: CollatorOptions): web.typings.std.Intl.Collator = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[web.typings.std.Intl.Collator]
    @scala.inline
    def apply(locales: js.Array[java.lang.String]): web.typings.std.Intl.Collator = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[web.typings.std.Intl.Collator]
    @scala.inline
    def apply(locales: js.Array[java.lang.String], options: CollatorOptions): web.typings.std.Intl.Collator = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[web.typings.std.Intl.Collator]
    @scala.inline
    def apply(locales: Unit, options: CollatorOptions): web.typings.std.Intl.Collator = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[web.typings.std.Intl.Collator]
    
    @JSGlobal("Intl.Collator")
    @js.native
    val ^ : js.Any = js.native
    
    /* standard es5 */
    @scala.inline
    def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
    @scala.inline
    def supportedLocalesOf(locales: java.lang.String, options: CollatorOptions): js.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
    @scala.inline
    def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
    @scala.inline
    def supportedLocalesOf(locales: js.Array[java.lang.String], options: CollatorOptions): js.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.Collator")
  @js.native
  /* standard es5 */
  class CollatorCls ()
    extends StObject
       with Collator {
    def this(locales: java.lang.String) = this()
    def this(locales: js.Array[java.lang.String]) = this()
    def this(locales: java.lang.String, options: CollatorOptions) = this()
    def this(locales: js.Array[java.lang.String], options: CollatorOptions) = this()
    def this(locales: Unit, options: CollatorOptions) = this()
  }
  
  object DateTimeFormat {
    
    /* standard es5 */
    @scala.inline
    def apply(): web.typings.std.Intl.DateTimeFormat = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[web.typings.std.Intl.DateTimeFormat]
    @scala.inline
    def apply(locales: java.lang.String): web.typings.std.Intl.DateTimeFormat = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[web.typings.std.Intl.DateTimeFormat]
    @scala.inline
    def apply(locales: java.lang.String, options: DateTimeFormatOptions): web.typings.std.Intl.DateTimeFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[web.typings.std.Intl.DateTimeFormat]
    @scala.inline
    def apply(locales: js.Array[java.lang.String]): web.typings.std.Intl.DateTimeFormat = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[web.typings.std.Intl.DateTimeFormat]
    @scala.inline
    def apply(locales: js.Array[java.lang.String], options: DateTimeFormatOptions): web.typings.std.Intl.DateTimeFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[web.typings.std.Intl.DateTimeFormat]
    @scala.inline
    def apply(locales: Unit, options: DateTimeFormatOptions): web.typings.std.Intl.DateTimeFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[web.typings.std.Intl.DateTimeFormat]
    
    @JSGlobal("Intl.DateTimeFormat")
    @js.native
    val ^ : js.Any = js.native
    
    /* standard es5 */
    @scala.inline
    def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
    @scala.inline
    def supportedLocalesOf(locales: java.lang.String, options: DateTimeFormatOptions): js.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
    @scala.inline
    def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
    @scala.inline
    def supportedLocalesOf(locales: js.Array[java.lang.String], options: DateTimeFormatOptions): js.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.DateTimeFormat")
  @js.native
  /* standard es5 */
  class DateTimeFormatCls ()
    extends StObject
       with DateTimeFormat {
    def this(locales: java.lang.String) = this()
    def this(locales: js.Array[java.lang.String]) = this()
    def this(locales: java.lang.String, options: DateTimeFormatOptions) = this()
    def this(locales: js.Array[java.lang.String], options: DateTimeFormatOptions) = this()
    def this(locales: Unit, options: DateTimeFormatOptions) = this()
  }
  
  object NumberFormat {
    
    /* standard es5 */
    @scala.inline
    def apply(): web.typings.std.Intl.NumberFormat = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[web.typings.std.Intl.NumberFormat]
    @scala.inline
    def apply(locales: java.lang.String): web.typings.std.Intl.NumberFormat = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[web.typings.std.Intl.NumberFormat]
    @scala.inline
    def apply(locales: java.lang.String, options: NumberFormatOptions): web.typings.std.Intl.NumberFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[web.typings.std.Intl.NumberFormat]
    @scala.inline
    def apply(locales: js.Array[java.lang.String]): web.typings.std.Intl.NumberFormat = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[web.typings.std.Intl.NumberFormat]
    @scala.inline
    def apply(locales: js.Array[java.lang.String], options: NumberFormatOptions): web.typings.std.Intl.NumberFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[web.typings.std.Intl.NumberFormat]
    @scala.inline
    def apply(locales: Unit, options: NumberFormatOptions): web.typings.std.Intl.NumberFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[web.typings.std.Intl.NumberFormat]
    
    @JSGlobal("Intl.NumberFormat")
    @js.native
    val ^ : js.Any = js.native
    
    /* standard es5 */
    @scala.inline
    def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
    @scala.inline
    def supportedLocalesOf(locales: java.lang.String, options: NumberFormatOptions): js.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
    @scala.inline
    def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
    @scala.inline
    def supportedLocalesOf(locales: js.Array[java.lang.String], options: NumberFormatOptions): js.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.NumberFormat")
  @js.native
  /* standard es5 */
  class NumberFormatCls ()
    extends StObject
       with NumberFormat {
    def this(locales: java.lang.String) = this()
    def this(locales: js.Array[java.lang.String]) = this()
    def this(locales: java.lang.String, options: NumberFormatOptions) = this()
    def this(locales: js.Array[java.lang.String], options: NumberFormatOptions) = this()
    def this(locales: Unit, options: NumberFormatOptions) = this()
  }
}
