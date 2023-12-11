package web.typings.antd

import web.typings.antd.antdStrings.Carousel
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esCarouselStyleMod {
  
  @JSImport("antd/es/carousel/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/carousel/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Carousel] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 激活态指示点宽度
      * @descEN Width of active indicator
      */
    var dotActiveWidth: Double = js.native
    
    /**
      * @desc 指示点高度
      * @descEN Height of indicator
      */
    var dotHeight: Double = js.native
    
    /**
      * @desc 指示点宽度
      * @descEN Width of indicator
      */
    var dotWidth: Double = js.native
    
    /** @deprecated Use `dotActiveWidth` instead. */
    var dotWidthActive: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(dotActiveWidth: Double, dotHeight: Double, dotWidth: Double, dotWidthActive: Double): ComponentToken = {
      val __obj = js.Dynamic.literal(dotActiveWidth = dotActiveWidth.asInstanceOf[js.Any], dotHeight = dotHeight.asInstanceOf[js.Any], dotWidth = dotWidth.asInstanceOf[js.Any], dotWidthActive = dotWidthActive.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDotActiveWidth(value: Double): Self = StObject.set(x, "dotActiveWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotHeight(value: Double): Self = StObject.set(x, "dotHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotWidth(value: Double): Self = StObject.set(x, "dotWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotWidthActive(value: Double): Self = StObject.set(x, "dotWidthActive", value.asInstanceOf[js.Any])
    }
  }
}
