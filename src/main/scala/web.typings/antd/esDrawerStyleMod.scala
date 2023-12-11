package web.typings.antd

import web.typings.antd.antdStrings.Drawer
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.FullToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDrawerStyleMod {
  
  @JSImport("antd/es/drawer/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/drawer/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Drawer] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 底部区域纵向内间距
      * @descEN Vertical padding of footer
      */
    var footerPaddingBlock: Double = js.native
    
    /**
      * @desc 底部区域横向内间距
      * @descEN Horizontal padding of footer
      */
    var footerPaddingInline: Double = js.native
    
    /**
      * @desc 弹窗 z-index
      * @descEN z-index of drawer
      */
    var zIndexPopup: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(footerPaddingBlock: Double, footerPaddingInline: Double, zIndexPopup: Double): ComponentToken = {
      val __obj = js.Dynamic.literal(footerPaddingBlock = footerPaddingBlock.asInstanceOf[js.Any], footerPaddingInline = footerPaddingInline.asInstanceOf[js.Any], zIndexPopup = zIndexPopup.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFooterPaddingBlock(value: Double): Self = StObject.set(x, "footerPaddingBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterPaddingInline(value: Double): Self = StObject.set(x, "footerPaddingInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexPopup(value: Double): Self = StObject.set(x, "zIndexPopup", value.asInstanceOf[js.Any])
    }
  }
  
  type DrawerToken = FullToken[Drawer]
}
