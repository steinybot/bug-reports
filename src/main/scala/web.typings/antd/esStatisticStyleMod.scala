package web.typings.antd

import web.typings.antd.antdStrings.Statistic
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esStatisticStyleMod {
  
  @JSImport("antd/es/statistic/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/statistic/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Statistic] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 内容字体大小
      * @descEN Content font size
      */
    var contentFontSize: Double = js.native
    
    /**
      * @desc 标题字体大小
      * @descEN Title font size
      */
    var titleFontSize: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(contentFontSize: Double, titleFontSize: Double): ComponentToken = {
      val __obj = js.Dynamic.literal(contentFontSize = contentFontSize.asInstanceOf[js.Any], titleFontSize = titleFontSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentFontSize(value: Double): Self = StObject.set(x, "contentFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFontSize(value: Double): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
    }
  }
}
