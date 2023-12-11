package web.typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollapseHeaderPaddingLG extends StObject {
  
  var collapseHeaderPaddingLG: String = js.native
  
  var collapseHeaderPaddingSM: String = js.native
  
  var collapsePanelBorderRadius: Double = js.native
}
object CollapseHeaderPaddingLG {
  
  @scala.inline
  def apply(
    collapseHeaderPaddingLG: String,
    collapseHeaderPaddingSM: String,
    collapsePanelBorderRadius: Double
  ): CollapseHeaderPaddingLG = {
    val __obj = js.Dynamic.literal(collapseHeaderPaddingLG = collapseHeaderPaddingLG.asInstanceOf[js.Any], collapseHeaderPaddingSM = collapseHeaderPaddingSM.asInstanceOf[js.Any], collapsePanelBorderRadius = collapsePanelBorderRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapseHeaderPaddingLG]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: CollapseHeaderPaddingLG] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapseHeaderPaddingLG(value: String): Self = StObject.set(x, "collapseHeaderPaddingLG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseHeaderPaddingSM(value: String): Self = StObject.set(x, "collapseHeaderPaddingSM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsePanelBorderRadius(value: Double): Self = StObject.set(x, "collapsePanelBorderRadius", value.asInstanceOf[js.Any])
  }
}
