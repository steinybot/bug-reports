package web.typings.antd.anon

import web.typings.antd.esThemeInterfaceSeedsMod.SeedToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hashed extends StObject {
  
  var hashed: Boolean = js.native
  
  var `override`: Override = js.native
  
  var token: SeedToken = js.native
}
object Hashed {
  
  @scala.inline
  def apply(hashed: Boolean, `override`: Override, token: SeedToken): Hashed = {
    val __obj = js.Dynamic.literal(hashed = hashed.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hashed]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Hashed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHashed(value: Boolean): Self = StObject.set(x, "hashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverride(value: Override): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: SeedToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
