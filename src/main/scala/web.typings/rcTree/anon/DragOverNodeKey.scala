package web.typings.rcTree.anon

import web.typings.rcTree.rcTreeInts.`-1`
import web.typings.rcTree.rcTreeInts.`0`
import web.typings.rcTree.rcTreeInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragOverNodeKey extends StObject {
  
  var dragOverNodeKey: web.typings.rcTree.esInterfaceMod.Key = js.native
  
  var dropAllowed: Boolean = js.native
  
  var dropContainerKey: web.typings.rcTree.esInterfaceMod.Key = js.native
  
  var dropLevelOffset: Double = js.native
  
  var dropPosition: `-1` | `0` | `1` = js.native
  
  var dropTargetKey: web.typings.rcTree.esInterfaceMod.Key = js.native
  
  var dropTargetPos: String = js.native
}
object DragOverNodeKey {
  
  @scala.inline
  def apply(
    dragOverNodeKey: web.typings.rcTree.esInterfaceMod.Key,
    dropAllowed: Boolean,
    dropContainerKey: web.typings.rcTree.esInterfaceMod.Key,
    dropLevelOffset: Double,
    dropPosition: `-1` | `0` | `1`,
    dropTargetKey: web.typings.rcTree.esInterfaceMod.Key,
    dropTargetPos: String
  ): DragOverNodeKey = {
    val __obj = js.Dynamic.literal(dragOverNodeKey = dragOverNodeKey.asInstanceOf[js.Any], dropAllowed = dropAllowed.asInstanceOf[js.Any], dropContainerKey = dropContainerKey.asInstanceOf[js.Any], dropLevelOffset = dropLevelOffset.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], dropTargetKey = dropTargetKey.asInstanceOf[js.Any], dropTargetPos = dropTargetPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragOverNodeKey]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: DragOverNodeKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDragOverNodeKey(value: web.typings.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "dragOverNodeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropAllowed(value: Boolean): Self = StObject.set(x, "dropAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropContainerKey(value: web.typings.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "dropContainerKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropLevelOffset(value: Double): Self = StObject.set(x, "dropLevelOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropPosition(value: `-1` | `0` | `1`): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropTargetKey(value: web.typings.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "dropTargetKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropTargetPos(value: String): Self = StObject.set(x, "dropTargetPos", value.asInstanceOf[js.Any])
  }
}
