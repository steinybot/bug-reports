package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentRadius extends StObject {
  
  var contentRadius: Double = js.native
  
  var limitVerticalRadius: js.UndefOr[Boolean] = js.native
}
object ContentRadius {
  
  @scala.inline
  def apply(contentRadius: Double): ContentRadius = {
    val __obj = js.Dynamic.literal(contentRadius = contentRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentRadius]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ContentRadius] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentRadius(value: Double): Self = StObject.set(x, "contentRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitVerticalRadius(value: Boolean): Self = StObject.set(x, "limitVerticalRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitVerticalRadiusUndefined: Self = StObject.set(x, "limitVerticalRadius", js.undefined)
  }
}
