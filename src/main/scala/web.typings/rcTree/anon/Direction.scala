package web.typings.rcTree.anon

import web.typings.rcTree.rcTreeInts.`-1`
import web.typings.rcTree.rcTreeInts.`0`
import web.typings.rcTree.rcTreeInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Direction extends StObject {
  
  var direction: web.typings.rcTree.esInterfaceMod.Direction = js.native
  
  var dropLevelOffset: Double = js.native
  
  var dropPosition: `-1` | `0` | `1` = js.native
  
  var indent: Double = js.native
  
  var prefixCls: String = js.native
}
object Direction {
  
  @scala.inline
  def apply(dropLevelOffset: Double, dropPosition: `-1` | `0` | `1`, indent: Double, prefixCls: String): Direction = {
    val __obj = js.Dynamic.literal(dropLevelOffset = dropLevelOffset.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Direction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: web.typings.rcTree.esInterfaceMod.Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDropLevelOffset(value: Double): Self = StObject.set(x, "dropLevelOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropPosition(value: `-1` | `0` | `1`): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
  }
}
