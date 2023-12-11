package web.typings.antd

import web.typings.antd.anon.AntCls
import web.typings.antd.antdStrings.Pagination
import web.typings.antd.esInputStyleMod.SharedComponentToken
import web.typings.antd.esInputStyleMod.SharedInputToken
import web.typings.antd.esThemeInterfaceMod.GlobalToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.CSSUtil
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPaginationStyleMod {
  
  @JSImport("antd/es/pagination/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/pagination/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Pagination] = js.native
  
  @scala.inline
  def prepareToken(
    token: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<antd.antd/es/theme/util/genComponentStyleHook.GenStyleFn<'Pagination'>>[0] */ js.Any
  ): PaginationToken = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareToken")(token.asInstanceOf[js.Any]).asInstanceOf[PaginationToken]
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 页码激活态背景色
      * @descEN Background color of active Pagination item
      */
    var itemActiveBg: String = js.native
    
    /**
      * @desc 页码激活态禁用状态背景色
      * @descEN Background color of disabled active Pagination item
      */
    var itemActiveBgDisabled: String = js.native
    
    /**
      * @desc 页码激活态禁用状态文字颜色
      * @descEN Text color of disabled active Pagination item
      */
    var itemActiveColorDisabled: String = js.native
    
    /**
      * @desc 页码选项背景色
      * @descEN Background color of Pagination item
      */
    var itemBg: String = js.native
    
    /**
      * @desc 输入框背景色
      * @descEN Background color of input
      */
    var itemInputBg: String = js.native
    
    /**
      * @desc 页码链接背景色
      * @descEN Background color of Pagination item link
      */
    var itemLinkBg: String = js.native
    
    /**
      * @desc 页码尺寸
      * @descEN Size of Pagination item
      */
    var itemSize: Double = js.native
    
    /**
      * @desc 小号页码尺寸
      * @descEN Size of small Pagination item
      */
    var itemSizeSM: Double = js.native
    
    /**
      * @desc 每页展示数量选择器 top
      * @descEN Top of Pagination size changer
      */
    var miniOptionsSizeChangerTop: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      itemActiveBg: String,
      itemActiveBgDisabled: String,
      itemActiveColorDisabled: String,
      itemBg: String,
      itemInputBg: String,
      itemLinkBg: String,
      itemSize: Double,
      itemSizeSM: Double,
      miniOptionsSizeChangerTop: Double
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(itemActiveBg = itemActiveBg.asInstanceOf[js.Any], itemActiveBgDisabled = itemActiveBgDisabled.asInstanceOf[js.Any], itemActiveColorDisabled = itemActiveColorDisabled.asInstanceOf[js.Any], itemBg = itemBg.asInstanceOf[js.Any], itemInputBg = itemInputBg.asInstanceOf[js.Any], itemLinkBg = itemLinkBg.asInstanceOf[js.Any], itemSize = itemSize.asInstanceOf[js.Any], itemSizeSM = itemSizeSM.asInstanceOf[js.Any], miniOptionsSizeChangerTop = miniOptionsSizeChangerTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItemActiveBg(value: String): Self = StObject.set(x, "itemActiveBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemActiveBgDisabled(value: String): Self = StObject.set(x, "itemActiveBgDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemActiveColorDisabled(value: String): Self = StObject.set(x, "itemActiveColorDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemBg(value: String): Self = StObject.set(x, "itemBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemInputBg(value: String): Self = StObject.set(x, "itemInputBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemLinkBg(value: String): Self = StObject.set(x, "itemLinkBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemSize(value: Double): Self = StObject.set(x, "itemSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemSizeSM(value: Double): Self = StObject.set(x, "itemSizeSM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiniOptionsSizeChangerTop(value: Double): Self = StObject.set(x, "miniOptionsSizeChangerTop", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped antd.antd/es/theme/interface/components.ComponentTokenMap['Pagination'] */ @js.native
  trait PaginationToken
    extends StObject
       with GlobalToken
       with AntCls
       with CSSUtil
       with SharedComponentToken
       with SharedInputToken {
    
    var inputOutlineOffset: Double = js.native
    
    var paginationEllipsisLetterSpacing: Double | String = js.native
    
    var paginationEllipsisTextIndent: String = js.native
    
    var paginationItemPaddingInline: Double | String = js.native
    
    var paginationMiniOptionsMarginInlineStart: Double | String = js.native
    
    var paginationMiniQuickJumperInputWidth: Double | String = js.native
    
    var paginationSlashMarginInlineEnd: Double = js.native
    
    var paginationSlashMarginInlineStart: Double = js.native
  }
  object PaginationToken {
    
    @scala.inline
    def apply(
      AntCls: AntCls,
      CSSUtil: CSSUtil,
      SharedComponentToken: SharedComponentToken,
      SharedInputToken: SharedInputToken,
      inputOutlineOffset: Double,
      paginationEllipsisLetterSpacing: Double | String,
      paginationEllipsisTextIndent: String,
      paginationItemPaddingInline: Double | String,
      paginationMiniOptionsMarginInlineStart: Double | String,
      paginationMiniQuickJumperInputWidth: Double | String,
      paginationSlashMarginInlineEnd: Double,
      paginationSlashMarginInlineStart: Double
    ): PaginationToken = {
      val __obj = js.Dynamic.literal(inputOutlineOffset = inputOutlineOffset.asInstanceOf[js.Any], paginationEllipsisLetterSpacing = paginationEllipsisLetterSpacing.asInstanceOf[js.Any], paginationEllipsisTextIndent = paginationEllipsisTextIndent.asInstanceOf[js.Any], paginationItemPaddingInline = paginationItemPaddingInline.asInstanceOf[js.Any], paginationMiniOptionsMarginInlineStart = paginationMiniOptionsMarginInlineStart.asInstanceOf[js.Any], paginationMiniQuickJumperInputWidth = paginationMiniQuickJumperInputWidth.asInstanceOf[js.Any], paginationSlashMarginInlineEnd = paginationSlashMarginInlineEnd.asInstanceOf[js.Any], paginationSlashMarginInlineStart = paginationSlashMarginInlineStart.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, AntCls)
      js.Dynamic.global.Object.assign(__obj, CSSUtil)
      js.Dynamic.global.Object.assign(__obj, SharedComponentToken)
      js.Dynamic.global.Object.assign(__obj, SharedInputToken)
      __obj.asInstanceOf[PaginationToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PaginationToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInputOutlineOffset(value: Double): Self = StObject.set(x, "inputOutlineOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationEllipsisLetterSpacing(value: Double | String): Self = StObject.set(x, "paginationEllipsisLetterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationEllipsisTextIndent(value: String): Self = StObject.set(x, "paginationEllipsisTextIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationItemPaddingInline(value: Double | String): Self = StObject.set(x, "paginationItemPaddingInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationMiniOptionsMarginInlineStart(value: Double | String): Self = StObject.set(x, "paginationMiniOptionsMarginInlineStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationMiniQuickJumperInputWidth(value: Double | String): Self = StObject.set(x, "paginationMiniQuickJumperInputWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationSlashMarginInlineEnd(value: Double): Self = StObject.set(x, "paginationSlashMarginInlineEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationSlashMarginInlineStart(value: Double): Self = StObject.set(x, "paginationSlashMarginInlineStart", value.asInstanceOf[js.Any])
    }
  }
}
