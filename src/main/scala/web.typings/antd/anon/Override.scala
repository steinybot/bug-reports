package web.typings.antd.anon

import web.typings.antd.esThemeInterfaceSeedsMod.SeedToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Override extends StObject {
  
  var `override`: SeedToken = js.native
}
object Override {
  
  @scala.inline
  def apply(`override`: SeedToken): Override = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Override]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Override] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverride(value: SeedToken): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
  }
}
