package web.typings.rcTree.anon

import web.typings.rcTree.rcTreeInts.`-1`
import web.typings.rcTree.rcTreeInts.`0`
import web.typings.rcTree.rcTreeInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropLevelOffset extends StObject {
  
  var dropLevelOffset: Double = js.native
  
  var dropPosition: `-1` | `0` | `1` = js.native
  
  var indent: Double = js.native
}
object DropLevelOffset {
  
  @scala.inline
  def apply(dropLevelOffset: Double, dropPosition: `-1` | `0` | `1`, indent: Double): DropLevelOffset = {
    val __obj = js.Dynamic.literal(dropLevelOffset = dropLevelOffset.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropLevelOffset]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: DropLevelOffset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDropLevelOffset(value: Double): Self = StObject.set(x, "dropLevelOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropPosition(value: `-1` | `0` | `1`): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
  }
}
