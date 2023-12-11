package web.typings.antd

import web.typings.antd.antdStrings.Mentions
import web.typings.antd.esInputStyleMod.SharedComponentToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMentionsStyleMod {
  
  @JSImport("antd/es/mentions/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/mentions/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Mentions] = js.native
  
  @js.native
  trait ComponentToken
    extends StObject
       with SharedComponentToken {
    
    /**
      * @desc 菜单项高度
      * @descEN Height of menu item
      */
    var controlItemWidth: Double = js.native
    
    /**
      * @desc 弹层高度
      * @descEN Height of popup
      */
    var dropdownHeight: Double = js.native
    
    /**
      * @desc 弹层 z-index
      * @descEN z-index of popup
      */
    var zIndexPopup: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      activeBg: String,
      activeBorderColor: String,
      activeShadow: String,
      addonBg: String,
      controlItemWidth: Double,
      dropdownHeight: Double,
      errorActiveShadow: String,
      hoverBg: String,
      hoverBorderColor: String,
      paddingBlock: Double,
      paddingBlockLG: Double,
      paddingBlockSM: Double,
      paddingInline: Double,
      paddingInlineLG: Double,
      paddingInlineSM: Double,
      warningActiveShadow: String,
      zIndexPopup: Double
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(activeBg = activeBg.asInstanceOf[js.Any], activeBorderColor = activeBorderColor.asInstanceOf[js.Any], activeShadow = activeShadow.asInstanceOf[js.Any], addonBg = addonBg.asInstanceOf[js.Any], controlItemWidth = controlItemWidth.asInstanceOf[js.Any], dropdownHeight = dropdownHeight.asInstanceOf[js.Any], errorActiveShadow = errorActiveShadow.asInstanceOf[js.Any], hoverBg = hoverBg.asInstanceOf[js.Any], hoverBorderColor = hoverBorderColor.asInstanceOf[js.Any], paddingBlock = paddingBlock.asInstanceOf[js.Any], paddingBlockLG = paddingBlockLG.asInstanceOf[js.Any], paddingBlockSM = paddingBlockSM.asInstanceOf[js.Any], paddingInline = paddingInline.asInstanceOf[js.Any], paddingInlineLG = paddingInlineLG.asInstanceOf[js.Any], paddingInlineSM = paddingInlineSM.asInstanceOf[js.Any], warningActiveShadow = warningActiveShadow.asInstanceOf[js.Any], zIndexPopup = zIndexPopup.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setControlItemWidth(value: Double): Self = StObject.set(x, "controlItemWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownHeight(value: Double): Self = StObject.set(x, "dropdownHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexPopup(value: Double): Self = StObject.set(x, "zIndexPopup", value.asInstanceOf[js.Any])
    }
  }
}
