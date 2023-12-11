package web.typings.rcTree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpandedKeys extends StObject {
  
  var expandedKeys: js.Array[web.typings.rcTree.esInterfaceMod.Key] = js.native
}
object ExpandedKeys {
  
  @scala.inline
  def apply(expandedKeys: js.Array[web.typings.rcTree.esInterfaceMod.Key]): ExpandedKeys = {
    val __obj = js.Dynamic.literal(expandedKeys = expandedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandedKeys]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ExpandedKeys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpandedKeys(value: js.Array[web.typings.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedKeysVarargs(value: web.typings.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "expandedKeys", js.Array(value :_*))
  }
}
