package web.typings.react.mod

import web.typings.react.reactStrings.all
import web.typings.react.reactStrings.center
import web.typings.react.reactStrings.columns
import web.typings.react.reactStrings.groups
import web.typings.react.reactStrings.left
import web.typings.react.reactStrings.none
import web.typings.react.reactStrings.right
import web.typings.react.reactStrings.rows
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var align: js.UndefOr[left | center | right] = js.native
  
  var bgcolor: js.UndefOr[String] = js.native
  
  var border: js.UndefOr[Double] = js.native
  
  var cellPadding: js.UndefOr[Double | String] = js.native
  
  var cellSpacing: js.UndefOr[Double | String] = js.native
  
  var frame: js.UndefOr[Boolean] = js.native
  
  var rules: js.UndefOr[none | groups | rows | columns | all] = js.native
  
  var summary: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
}
object TableHTMLAttributes {
  
  @scala.inline
  def apply[T](): TableHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: TableHTMLAttributes[_], T] (val x: Self with TableHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    @scala.inline
    def setBorder(value: Double): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setCellPadding(value: Double | String): Self = StObject.set(x, "cellPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellPaddingUndefined: Self = StObject.set(x, "cellPadding", js.undefined)
    
    @scala.inline
    def setCellSpacing(value: Double | String): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
    
    @scala.inline
    def setFrame(value: Boolean): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
    
    @scala.inline
    def setRules(value: none | groups | rows | columns | all): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
