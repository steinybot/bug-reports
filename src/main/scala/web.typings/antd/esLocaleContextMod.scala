package web.typings.antd

import web.typings.antd.esLocaleMod.Locale
import web.typings.react.mod.Context
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLocaleContextMod extends Shortcut {
  
  @JSImport("antd/es/locale/context", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[LocaleContextProps]] = js.native
  
  @js.native
  trait LocaleContextProps
    extends StObject
       with Locale {
    
    var exist: js.UndefOr[Boolean] = js.native
  }
  object LocaleContextProps {
    
    @scala.inline
    def apply(locale: String): LocaleContextProps = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocaleContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: LocaleContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExist(value: Boolean): Self = StObject.set(x, "exist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExistUndefined: Self = StObject.set(x, "exist", js.undefined)
    }
  }
  
  type _To = Context[js.UndefOr[LocaleContextProps]]
  
  /* This means you don't have to write `default`, but can instead just say `esLocaleContextMod.foo` */
  override def _to: Context[js.UndefOr[LocaleContextProps]] = default
}
