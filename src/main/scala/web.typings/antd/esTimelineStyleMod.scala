package web.typings.antd

import web.typings.antd.antdStrings.Timeline
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTimelineStyleMod {
  
  @JSImport("antd/es/timeline/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/timeline/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Timeline] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 节点背景色
      * @descEN Background color of node
      */
    var dotBg: String = js.native
    
    /**
      * @desc 节点边框宽度
      * @descEN Border width of node
      */
    var dotBorderWidth: Double = js.native
    
    /**
      * @desc 时间项下间距
      * @descEN Bottom padding of item
      */
    var itemPaddingBottom: Double = js.native
    
    /**
      * @desc 轨迹颜色
      * @descEN Line color
      */
    var tailColor: String = js.native
    
    /**
      * @desc 轨迹宽度
      * @descEN Line width
      */
    var tailWidth: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      dotBg: String,
      dotBorderWidth: Double,
      itemPaddingBottom: Double,
      tailColor: String,
      tailWidth: Double
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(dotBg = dotBg.asInstanceOf[js.Any], dotBorderWidth = dotBorderWidth.asInstanceOf[js.Any], itemPaddingBottom = itemPaddingBottom.asInstanceOf[js.Any], tailColor = tailColor.asInstanceOf[js.Any], tailWidth = tailWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDotBg(value: String): Self = StObject.set(x, "dotBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotBorderWidth(value: Double): Self = StObject.set(x, "dotBorderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPaddingBottom(value: Double): Self = StObject.set(x, "itemPaddingBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTailColor(value: String): Self = StObject.set(x, "tailColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTailWidth(value: Double): Self = StObject.set(x, "tailWidth", value.asInstanceOf[js.Any])
    }
  }
}
