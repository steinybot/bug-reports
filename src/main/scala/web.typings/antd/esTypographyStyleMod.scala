package web.typings.antd

import web.typings.antd.antdStrings.Typography
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.FullToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTypographyStyleMod {
  
  @JSImport("antd/es/typography/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/typography/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Typography] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 标题下间距
      * @descEN Margin bottom of title
      */
    var titleMarginBottom: Double | String = js.native
    
    /**
      * @desc 标题上间距
      * @descEN Margin top of title
      */
    var titleMarginTop: Double | String = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(titleMarginBottom: Double | String, titleMarginTop: Double | String): ComponentToken = {
      val __obj = js.Dynamic.literal(titleMarginBottom = titleMarginBottom.asInstanceOf[js.Any], titleMarginTop = titleMarginTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTitleMarginBottom(value: Double | String): Self = StObject.set(x, "titleMarginBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleMarginTop(value: Double | String): Self = StObject.set(x, "titleMarginTop", value.asInstanceOf[js.Any])
    }
  }
  
  type TypographyToken = FullToken[Typography]
}
