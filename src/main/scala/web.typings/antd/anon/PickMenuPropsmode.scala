package web.typings.antd.anon

import web.typings.rcMenu.esInterfaceMod.MenuMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<antd.antd/es/menu/menu.MenuProps, 'mode'> */
@js.native
trait PickMenuPropsmode extends StObject {
  
  var mode: js.UndefOr[MenuMode] = js.native
}
object PickMenuPropsmode {
  
  @scala.inline
  def apply(): PickMenuPropsmode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMenuPropsmode]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PickMenuPropsmode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: MenuMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
