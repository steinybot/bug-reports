package web.typings.antd

import web.typings.antd.antdStrings.Tour
import web.typings.antd.esStylePlacementArrowMod.ArrowOffsetToken
import web.typings.antd.esStyleRoundedArrowMod.ArrowToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTourStyleMod {
  
  @JSImport("antd/es/tour/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/tour/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Tour] = js.native
  
  @js.native
  trait ComponentToken
    extends StObject
       with ArrowOffsetToken
       with ArrowToken {
    
    /**
      * @desc 关闭按钮尺寸
      * @descEN Close button size
      */
    var closeBtnSize: Double = js.native
    
    /**
      * @desc Primary 模式下一步按钮悬浮背景色
      * @descEN Hover background color of next button in primary type
      */
    var primaryNextBtnHoverBg: String = js.native
    
    /**
      * @desc Primary 模式上一步按钮背景色
      * @descEN Background color of previous button in primary type
      */
    var primaryPrevBtnBg: String = js.native
    
    /**
      * @desc 弹层 z-index
      * @descEN Tour popup z-index
      */
    var zIndexPopup: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(closeBtnSize: Double, primaryNextBtnHoverBg: String, primaryPrevBtnBg: String, zIndexPopup: Double): ComponentToken = {
      val __obj = js.Dynamic.literal(closeBtnSize = closeBtnSize.asInstanceOf[js.Any], primaryNextBtnHoverBg = primaryNextBtnHoverBg.asInstanceOf[js.Any], primaryPrevBtnBg = primaryPrevBtnBg.asInstanceOf[js.Any], zIndexPopup = zIndexPopup.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloseBtnSize(value: Double): Self = StObject.set(x, "closeBtnSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryNextBtnHoverBg(value: String): Self = StObject.set(x, "primaryNextBtnHoverBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryPrevBtnBg(value: String): Self = StObject.set(x, "primaryPrevBtnBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexPopup(value: Double): Self = StObject.set(x, "zIndexPopup", value.asInstanceOf[js.Any])
    }
  }
}
