package web.typings.antd

import web.typings.antd.antdStrings.Tooltip
import web.typings.antd.esStylePlacementArrowMod.ArrowOffsetToken
import web.typings.antd.esStyleRoundedArrowMod.ArrowToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTooltipStyleMod {
  
  @JSImport("antd/es/tooltip/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, injectStyle: Boolean): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], injectStyle.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/tooltip/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Tooltip] = js.native
  
  @js.native
  trait ComponentToken
    extends StObject
       with ArrowOffsetToken
       with ArrowToken {
    
    /**
      * @desc 文字提示 z-index
      * @descEN z-index of tooltip
      */
    var zIndexPopup: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(zIndexPopup: Double): ComponentToken = {
      val __obj = js.Dynamic.literal(zIndexPopup = zIndexPopup.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setZIndexPopup(value: Double): Self = StObject.set(x, "zIndexPopup", value.asInstanceOf[js.Any])
    }
  }
}
