package web.typings.antd.anon

import web.typings.antd.esThemeInterfaceAliasMod.AliasToken
import web.typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverridePartial extends StObject {
  
  var `override`: Partial[AliasToken] = js.native
}
object OverridePartial {
  
  @scala.inline
  def apply(`override`: Partial[AliasToken]): OverridePartial = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverridePartial]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: OverridePartial] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverride(value: Partial[AliasToken]): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
  }
}
