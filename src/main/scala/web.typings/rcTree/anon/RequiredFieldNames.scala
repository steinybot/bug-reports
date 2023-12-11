package web.typings.rcTree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<rc-tree.rc-tree/es/interface.FieldNames> */
@js.native
trait RequiredFieldNames extends StObject {
  
  var _title: js.Array[String] = js.native
  
  var children: String = js.native
  
  var key: String = js.native
  
  var title: String = js.native
}
object RequiredFieldNames {
  
  @scala.inline
  def apply(_title: js.Array[String], children: String, key: String, title: String): RequiredFieldNames = {
    val __obj = js.Dynamic.literal(_title = _title.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredFieldNames]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: RequiredFieldNames] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_title(value: js.Array[String]): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_titleVarargs(value: String*): Self = StObject.set(x, "_title", js.Array(value :_*))
  }
}
