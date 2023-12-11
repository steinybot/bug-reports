package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineHeight extends StObject {
  
  var lineHeight: Double = js.native
  
  var size: Double = js.native
}
object LineHeight {
  
  @scala.inline
  def apply(lineHeight: Double, size: Double): LineHeight = {
    val __obj = js.Dynamic.literal(lineHeight = lineHeight.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineHeight]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: LineHeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
