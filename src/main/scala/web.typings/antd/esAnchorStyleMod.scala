package web.typings.antd

import web.typings.antd.antdStrings.Anchor
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAnchorStyleMod {
  
  @JSImport("antd/es/anchor/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/anchor/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Anchor] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 链接纵向内间距
      * @descEN Vertical padding of link
      */
    var linkPaddingBlock: Double = js.native
    
    /**
      * @desc 链接横向内间距
      * @descEN Horizontal padding of link
      */
    var linkPaddingInlineStart: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(linkPaddingBlock: Double, linkPaddingInlineStart: Double): ComponentToken = {
      val __obj = js.Dynamic.literal(linkPaddingBlock = linkPaddingBlock.asInstanceOf[js.Any], linkPaddingInlineStart = linkPaddingInlineStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLinkPaddingBlock(value: Double): Self = StObject.set(x, "linkPaddingBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkPaddingInlineStart(value: Double): Self = StObject.set(x, "linkPaddingInlineStart", value.asInstanceOf[js.Any])
    }
  }
}
