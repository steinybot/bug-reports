package web.typings.antDesignIconsSvg

import web.typings.antDesignIconsSvg.anon.PrimaryColor
import web.typings.antDesignIconsSvg.esTypesMod.IconDefinition
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHelpersMod {
  
  @JSImport("@ant-design/icons-svg/es/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def renderIconDefinitionToSVGElement(icond: IconDefinition): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderIconDefinitionToSVGElement")(icond.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def renderIconDefinitionToSVGElement(icond: IconDefinition, options: HelperRenderOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderIconDefinitionToSVGElement")(icond.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @js.native
  trait HelperRenderOptions extends StObject {
    
    var extraSVGAttrs: js.UndefOr[StringDictionary[String]] = js.native
    
    var placeholders: js.UndefOr[PrimaryColor] = js.native
  }
  object HelperRenderOptions {
    
    @scala.inline
    def apply(): HelperRenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelperRenderOptions]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: HelperRenderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtraSVGAttrs(value: StringDictionary[String]): Self = StObject.set(x, "extraSVGAttrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraSVGAttrsUndefined: Self = StObject.set(x, "extraSVGAttrs", js.undefined)
      
      @scala.inline
      def setPlaceholders(value: PrimaryColor): Self = StObject.set(x, "placeholders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholdersUndefined: Self = StObject.set(x, "placeholders", js.undefined)
    }
  }
}
