package web.typings.antd.anon

import web.typings.antd.esThemeInterfaceAliasMod.AliasToken
import web.typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `113` extends StObject {
  
  var `override`: js.UndefOr[Partial[AliasToken]] = js.native
}
object `113` {
  
  @scala.inline
  def apply(): `113` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`113`]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: `113`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverride(value: Partial[AliasToken]): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
  }
}
