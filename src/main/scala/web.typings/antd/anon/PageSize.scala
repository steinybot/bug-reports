package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageSize extends StObject {
  
  var pageSize: js.UndefOr[Double] = js.native
  
  var showLessItems: js.UndefOr[Boolean] = js.native
  
  var showSizeChanger: js.UndefOr[Boolean] = js.native
  
  var simple: js.UndefOr[Boolean] = js.native
}
object PageSize {
  
  @scala.inline
  def apply(): PageSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageSize]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PageSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setShowLessItems(value: Boolean): Self = StObject.set(x, "showLessItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLessItemsUndefined: Self = StObject.set(x, "showLessItems", js.undefined)
    
    @scala.inline
    def setShowSizeChanger(value: Boolean): Self = StObject.set(x, "showSizeChanger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSizeChangerUndefined: Self = StObject.set(x, "showSizeChanger", js.undefined)
    
    @scala.inline
    def setSimple(value: Boolean): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimpleUndefined: Self = StObject.set(x, "simple", js.undefined)
  }
}
