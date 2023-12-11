package web.typings.antd

import web.typings.antd.antdStrings.Spin
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSpinStyleMod {
  
  @JSImport("antd/es/spin/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/spin/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Spin] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 内容区域高度
      * @descEN Height of content area
      */
    var contentHeight: Double = js.native
    
    /**
      * @desc 加载图标尺寸
      * @descEN Loading icon size
      */
    var dotSize: Double = js.native
    
    /**
      * @desc 大号加载图标尺寸
      * @descEN Large loading icon size
      */
    var dotSizeLG: Double = js.native
    
    /**
      * @desc 小号加载图标尺寸
      * @descEN Small loading icon size
      */
    var dotSizeSM: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(contentHeight: Double, dotSize: Double, dotSizeLG: Double, dotSizeSM: Double): ComponentToken = {
      val __obj = js.Dynamic.literal(contentHeight = contentHeight.asInstanceOf[js.Any], dotSize = dotSize.asInstanceOf[js.Any], dotSizeLG = dotSizeLG.asInstanceOf[js.Any], dotSizeSM = dotSizeSM.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentHeight(value: Double): Self = StObject.set(x, "contentHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotSize(value: Double): Self = StObject.set(x, "dotSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotSizeLG(value: Double): Self = StObject.set(x, "dotSizeLG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotSizeSM(value: Double): Self = StObject.set(x, "dotSizeSM", value.asInstanceOf[js.Any])
    }
  }
}
