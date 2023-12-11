package web.typings.antd.anon

import web.typings.antd.esThemeInterfaceMod.GlobalToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Theme extends StObject {
  
  var hashId: String = js.native
  
  var theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cssinjs.Theme<imported_interface.SeedToken, imported_interface.MapToken> */ Any = js.native
  
  var token: GlobalToken = js.native
}
object Theme {
  
  @scala.inline
  def apply(
    hashId: String,
    theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cssinjs.Theme<imported_interface.SeedToken, imported_interface.MapToken> */ Any,
    token: GlobalToken
  ): Theme = {
    val __obj = js.Dynamic.literal(hashId = hashId.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHashId(value: String): Self = StObject.set(x, "hashId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cssinjs.Theme<imported_interface.SeedToken, imported_interface.MapToken> */ Any
    ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: GlobalToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
