package web.typings.antd

import web.typings.antd.antdStrings.Descriptions
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDescriptionsStyleMod {
  
  @JSImport("antd/es/descriptions/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/descriptions/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Descriptions] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 冒号左间距
      * @descEN Left margin of colon
      */
    var colonMarginLeft: Double = js.native
    
    /**
      * @desc 冒号右间距
      * @descEN Right margin of colon
      */
    var colonMarginRight: Double = js.native
    
    /**
      * @desc 内容区域文字颜色
      * @descEN Text color of content
      */
    var contentColor: String = js.native
    
    /**
      * @desc 额外区域文字颜色
      * @descEN Text color of extra area
      */
    var extraColor: String = js.native
    
    /**
      * @desc 子项下间距
      * @descEN Bottom padding of item
      */
    var itemPaddingBottom: Double = js.native
    
    /**
      * @desc 标签背景色
      * @descEN Background color of label
      */
    var labelBg: String = js.native
    
    /**
      * @desc 标题文字颜色
      * @descEN Text color of title
      */
    var titleColor: String = js.native
    
    /**
      * @desc 标题下间距
      * @descEN Bottom margin of title
      */
    var titleMarginBottom: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      colonMarginLeft: Double,
      colonMarginRight: Double,
      contentColor: String,
      extraColor: String,
      itemPaddingBottom: Double,
      labelBg: String,
      titleColor: String,
      titleMarginBottom: Double
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(colonMarginLeft = colonMarginLeft.asInstanceOf[js.Any], colonMarginRight = colonMarginRight.asInstanceOf[js.Any], contentColor = contentColor.asInstanceOf[js.Any], extraColor = extraColor.asInstanceOf[js.Any], itemPaddingBottom = itemPaddingBottom.asInstanceOf[js.Any], labelBg = labelBg.asInstanceOf[js.Any], titleColor = titleColor.asInstanceOf[js.Any], titleMarginBottom = titleMarginBottom.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColonMarginLeft(value: Double): Self = StObject.set(x, "colonMarginLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonMarginRight(value: Double): Self = StObject.set(x, "colonMarginRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentColor(value: String): Self = StObject.set(x, "contentColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraColor(value: String): Self = StObject.set(x, "extraColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPaddingBottom(value: Double): Self = StObject.set(x, "itemPaddingBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelBg(value: String): Self = StObject.set(x, "labelBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleColor(value: String): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleMarginBottom(value: Double): Self = StObject.set(x, "titleMarginBottom", value.asInstanceOf[js.Any])
    }
  }
}
