package web.typings.antd

import web.typings.antd.antdStrings.Segmented
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSegmentedStyleMod {
  
  @JSImport("antd/es/segmented/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/segmented/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Segmented] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 选项激活态背景颜色
      * @descEN Background color of item when active
      */
    var itemActiveBg: String = js.native
    
    /**
      * @desc 选项文本颜色
      * @descEN Text color of item
      */
    var itemColor: String = js.native
    
    /**
      * @desc 选项悬浮态背景颜色
      * @descEN Background color of item when hover
      */
    var itemHoverBg: String = js.native
    
    /**
      * @desc 选项悬浮态文本颜色
      * @descEN Text color of item when hover
      */
    var itemHoverColor: String = js.native
    
    /**
      * @desc 选项选中时背景颜色
      * @descEN Background color of item when selected
      */
    var itemSelectedBg: String = js.native
    
    /**
      * @desc 选项选中时文字颜色
      * @descEN Text color of item when selected
      */
    var itemSelectedColor: String = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      itemActiveBg: String,
      itemColor: String,
      itemHoverBg: String,
      itemHoverColor: String,
      itemSelectedBg: String,
      itemSelectedColor: String
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(itemActiveBg = itemActiveBg.asInstanceOf[js.Any], itemColor = itemColor.asInstanceOf[js.Any], itemHoverBg = itemHoverBg.asInstanceOf[js.Any], itemHoverColor = itemHoverColor.asInstanceOf[js.Any], itemSelectedBg = itemSelectedBg.asInstanceOf[js.Any], itemSelectedColor = itemSelectedColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItemActiveBg(value: String): Self = StObject.set(x, "itemActiveBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemColor(value: String): Self = StObject.set(x, "itemColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemHoverBg(value: String): Self = StObject.set(x, "itemHoverBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemHoverColor(value: String): Self = StObject.set(x, "itemHoverColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemSelectedBg(value: String): Self = StObject.set(x, "itemSelectedBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemSelectedColor(value: String): Self = StObject.set(x, "itemSelectedColor", value.asInstanceOf[js.Any])
    }
  }
}
