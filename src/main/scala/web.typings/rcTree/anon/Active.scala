package web.typings.rcTree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Active extends StObject {
  
  var active: Boolean = js.native
  
  var checked: Boolean = js.native
  
  var dragOver: Boolean = js.native
  
  var dragOverGapBottom: Boolean = js.native
  
  var dragOverGapTop: Boolean = js.native
  
  var expanded: Boolean = js.native
  
  var halfChecked: Boolean = js.native
  
  var key: web.typings.rcTree.esInterfaceMod.Key = js.native
  
  var loaded: Boolean = js.native
  
  var loading: Boolean = js.native
  
  var pos: String = js.native
  
  var selected: Boolean = js.native
}
object Active {
  
  @scala.inline
  def apply(
    active: Boolean,
    checked: Boolean,
    dragOver: Boolean,
    dragOverGapBottom: Boolean,
    dragOverGapTop: Boolean,
    expanded: Boolean,
    halfChecked: Boolean,
    key: web.typings.rcTree.esInterfaceMod.Key,
    loaded: Boolean,
    loading: Boolean,
    pos: String,
    selected: Boolean
  ): Active = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], checked = checked.asInstanceOf[js.Any], dragOver = dragOver.asInstanceOf[js.Any], dragOverGapBottom = dragOverGapBottom.asInstanceOf[js.Any], dragOverGapTop = dragOverGapTop.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], halfChecked = halfChecked.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Active] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragOver(value: Boolean): Self = StObject.set(x, "dragOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragOverGapBottom(value: Boolean): Self = StObject.set(x, "dragOverGapBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragOverGapTop(value: Boolean): Self = StObject.set(x, "dragOverGapTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHalfChecked(value: Boolean): Self = StObject.set(x, "halfChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: web.typings.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
  }
}
