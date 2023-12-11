package web.typings.rcTree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Checked extends StObject {
  
  var checked: js.Array[web.typings.rcTree.esInterfaceMod.Key] = js.native
  
  var halfChecked: js.Array[web.typings.rcTree.esInterfaceMod.Key] = js.native
}
object Checked {
  
  @scala.inline
  def apply(
    checked: js.Array[web.typings.rcTree.esInterfaceMod.Key],
    halfChecked: js.Array[web.typings.rcTree.esInterfaceMod.Key]
  ): Checked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], halfChecked = halfChecked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checked]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Checked] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: js.Array[web.typings.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedVarargs(value: web.typings.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "checked", js.Array(value :_*))
    
    @scala.inline
    def setHalfChecked(value: js.Array[web.typings.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "halfChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHalfCheckedVarargs(value: web.typings.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "halfChecked", js.Array(value :_*))
  }
}
