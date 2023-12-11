package web.typings.antd

import web.typings.antd.antdStrings.Rate
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esRateStyleMod {
  
  @JSImport("antd/es/rate/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/rate/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Rate] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 星星背景色
      * @descEN Star background color
      */
    var starBg: String = js.native
    
    /**
      * @desc 星星颜色
      * @descEN Star color
      */
    var starColor: String = js.native
    
    /**
      * @desc 星星悬浮时的缩放
      * @descEN Scale of star when hover
      */
    var starHoverScale: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSObject * / any['transform'] */ js.Any = js.native
    
    /**
      * @desc 星星大小
      * @descEN Star size
      */
    var starSize: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      starBg: String,
      starColor: String,
      starHoverScale: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSObject * / any['transform'] */ js.Any,
      starSize: Double
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(starBg = starBg.asInstanceOf[js.Any], starColor = starColor.asInstanceOf[js.Any], starHoverScale = starHoverScale.asInstanceOf[js.Any], starSize = starSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStarBg(value: String): Self = StObject.set(x, "starBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStarColor(value: String): Self = StObject.set(x, "starColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStarHoverScale(
        value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSObject * / any['transform'] */ js.Any
      ): Self = StObject.set(x, "starHoverScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStarSize(value: Double): Self = StObject.set(x, "starSize", value.asInstanceOf[js.Any])
    }
  }
}
