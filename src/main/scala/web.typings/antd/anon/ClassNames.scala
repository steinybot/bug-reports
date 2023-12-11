package web.typings.antd.anon

import web.typings.antd.esConfigProviderSizeContextMod.SizeType
import web.typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassNames extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var classNames: js.UndefOr[Item] = js.native
  
  var size: js.UndefOr[SizeType | Double] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var styles: js.UndefOr[ItemCSSProperties] = js.native
}
object ClassNames {
  
  @scala.inline
  def apply(): ClassNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassNames]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ClassNames] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setClassNames(value: Item): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    
    @scala.inline
    def setSize(value: SizeType | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setStyles(value: ItemCSSProperties): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
