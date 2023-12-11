package web.typings.antd.anon

import web.typings.antd.antdStrings.italic
import web.typings.antd.antdStrings.light
import web.typings.antd.antdStrings.none
import web.typings.antd.antdStrings.normal
import web.typings.antd.antdStrings.oblique
import web.typings.antd.antdStrings.weight
import web.typings.std.CanvasTextAlign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontFamily extends StObject {
  
  var color: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: std.CanvasFillStrokeStyles['fillStyle'] */ js.Any
  ] = js.native
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[Double | String] = js.native
  
  var fontStyle: js.UndefOr[none | normal | italic | oblique] = js.native
  
  var fontWeight: js.UndefOr[normal | light | weight | Double] = js.native
  
  var textAlign: js.UndefOr[CanvasTextAlign] = js.native
}
object FontFamily {
  
  @scala.inline
  def apply(): FontFamily = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFamily]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: FontFamily] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.CanvasFillStrokeStyles['fillStyle'] */ js.Any
    ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: none | normal | italic | oblique): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontWeight(value: normal | light | weight | Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setTextAlign(value: CanvasTextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
  }
}
