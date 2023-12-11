package web.typings.antd.anon

import web.typings.antd.antdStrings.horizontal
import web.typings.antd.antdStrings.vertical
import web.typings.antd.esConfigProviderSizeContextMod.SizeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompactDirection extends StObject {
  
  var compactDirection: js.UndefOr[horizontal | vertical] = js.native
  
  var compactItemClassnames: String = js.native
  
  var compactSize: SizeType = js.native
}
object CompactDirection {
  
  @scala.inline
  def apply(compactItemClassnames: String): CompactDirection = {
    val __obj = js.Dynamic.literal(compactItemClassnames = compactItemClassnames.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompactDirection]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: CompactDirection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompactDirection(value: horizontal | vertical): Self = StObject.set(x, "compactDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactDirectionUndefined: Self = StObject.set(x, "compactDirection", js.undefined)
    
    @scala.inline
    def setCompactItemClassnames(value: String): Self = StObject.set(x, "compactItemClassnames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactSize(value: SizeType): Self = StObject.set(x, "compactSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactSizeUndefined: Self = StObject.set(x, "compactSize", js.undefined)
  }
}
