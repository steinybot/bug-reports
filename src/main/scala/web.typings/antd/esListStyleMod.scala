package web.typings.antd

import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esListStyleMod {
  
  @JSImport("antd/es/list/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/list/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[web.typings.antd.antdStrings.List] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 头像右间距
      * @descEN Right margin of avatar
      */
    var avatarMarginRight: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['marginRight'] */ js.Any = js.native
    
    /**
      * @desc 内容宽度
      * @descEN Width of content
      */
    var contentWidth: Double = js.native
    
    /**
      * @desc 描述文字大小
      * @descEN Font size of description
      */
    var descriptionFontSize: Double = js.native
    
    /**
      * @desc 空文本内边距
      * @descEN Padding of empty text
      */
    var emptyTextPadding: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any = js.native
    
    /**
      * @desc 底部区域背景色
      * @descEN Background color of footer
      */
    var footerBg: String = js.native
    
    /**
      * @desc 头部区域背景色
      * @descEN Background color of header
      */
    var headerBg: String = js.native
    
    /**
      * @desc 列表项内间距
      * @descEN Padding of item
      */
    var itemPadding: String = js.native
    
    /**
      * @desc 大号列表项内间距
      * @descEN Padding of large item
      */
    var itemPaddingLG: String = js.native
    
    /**
      * @desc 小号列表项内间距
      * @descEN Padding of small item
      */
    var itemPaddingSM: String = js.native
    
    /**
      * @desc Meta 下间距
      * @descEN Margin bottom of meta
      */
    var metaMarginBottom: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['marginBottom'] */ js.Any = js.native
    
    /**
      * @desc 标题下间距
      * @descEN Margin bottom of title
      */
    var titleMarginBottom: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['marginBottom'] */ js.Any = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      avatarMarginRight: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['marginRight'] */ js.Any,
      contentWidth: Double,
      descriptionFontSize: Double,
      emptyTextPadding: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any,
      footerBg: String,
      headerBg: String,
      itemPadding: String,
      itemPaddingLG: String,
      itemPaddingSM: String,
      metaMarginBottom: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['marginBottom'] */ js.Any,
      titleMarginBottom: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['marginBottom'] */ js.Any
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(avatarMarginRight = avatarMarginRight.asInstanceOf[js.Any], contentWidth = contentWidth.asInstanceOf[js.Any], descriptionFontSize = descriptionFontSize.asInstanceOf[js.Any], emptyTextPadding = emptyTextPadding.asInstanceOf[js.Any], footerBg = footerBg.asInstanceOf[js.Any], headerBg = headerBg.asInstanceOf[js.Any], itemPadding = itemPadding.asInstanceOf[js.Any], itemPaddingLG = itemPaddingLG.asInstanceOf[js.Any], itemPaddingSM = itemPaddingSM.asInstanceOf[js.Any], metaMarginBottom = metaMarginBottom.asInstanceOf[js.Any], titleMarginBottom = titleMarginBottom.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvatarMarginRight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['marginRight'] */ js.Any
      ): Self = StObject.set(x, "avatarMarginRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentWidth(value: Double): Self = StObject.set(x, "contentWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionFontSize(value: Double): Self = StObject.set(x, "descriptionFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyTextPadding(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any
      ): Self = StObject.set(x, "emptyTextPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterBg(value: String): Self = StObject.set(x, "footerBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderBg(value: String): Self = StObject.set(x, "headerBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPadding(value: String): Self = StObject.set(x, "itemPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPaddingLG(value: String): Self = StObject.set(x, "itemPaddingLG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPaddingSM(value: String): Self = StObject.set(x, "itemPaddingSM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaMarginBottom(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['marginBottom'] */ js.Any
      ): Self = StObject.set(x, "metaMarginBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleMarginBottom(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['marginBottom'] */ js.Any
      ): Self = StObject.set(x, "titleMarginBottom", value.asInstanceOf[js.Any])
    }
  }
}
