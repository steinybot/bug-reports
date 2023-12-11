package web.typings.antd.anon

import web.typings.antd.antdInts.`-1`
import web.typings.antd.antdStrings.ltr
import web.typings.antd.antdStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropLevelOffset extends StObject {
  
  var direction: ltr | rtl = js.native
  
  var dropLevelOffset: Double = js.native
  
  var dropPosition: `-1` | web.typings.antd.antdInts.`0` | web.typings.antd.antdInts.`1` = js.native
  
  var indent: Double = js.native
  
  var prefixCls: String = js.native
}
object DropLevelOffset {
  
  @scala.inline
  def apply(
    direction: ltr | rtl,
    dropLevelOffset: Double,
    dropPosition: `-1` | web.typings.antd.antdInts.`0` | web.typings.antd.antdInts.`1`,
    indent: Double,
    prefixCls: String
  ): DropLevelOffset = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], dropLevelOffset = dropLevelOffset.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropLevelOffset]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: DropLevelOffset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropLevelOffset(value: Double): Self = StObject.set(x, "dropLevelOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropPosition(value: `-1` | web.typings.antd.antdInts.`0` | web.typings.antd.antdInts.`1`): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
  }
}
