package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `8` extends StObject {
  
  var theme: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme<SeedToken, MapToken> */ Any
  ] = js.native
}
object `8` {
  
  @scala.inline
  def apply(): `8` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`8`]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: `8`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTheme(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme<SeedToken, MapToken> */ Any
    ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
