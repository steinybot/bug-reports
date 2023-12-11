package web.typings.antd

import web.typings.antd.antdStrings.Transfer
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTransferStyleMod {
  
  @JSImport("antd/es/transfer/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/transfer/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Transfer] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 顶部高度
      * @descEN Height of header
      */
    var headerHeight: Double = js.native
    
    /**
      * @desc 列表项高度
      * @descEN Height of list item
      */
    var itemHeight: Double = js.native
    
    /**
      * @desc 列表项纵向内边距
      * @descEN Vertical padding of list item
      */
    var itemPaddingBlock: Double = js.native
    
    /**
      * @desc 列表高度
      * @descEN Height of list
      */
    var listHeight: Double = js.native
    
    /**
      * @desc 列表宽度
      * @descEN Width of list
      */
    var listWidth: Double = js.native
    
    /**
      * @desc 大号列表宽度
      * @descEN Width of large list
      */
    var listWidthLG: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      headerHeight: Double,
      itemHeight: Double,
      itemPaddingBlock: Double,
      listHeight: Double,
      listWidth: Double,
      listWidthLG: Double
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(headerHeight = headerHeight.asInstanceOf[js.Any], itemHeight = itemHeight.asInstanceOf[js.Any], itemPaddingBlock = itemPaddingBlock.asInstanceOf[js.Any], listHeight = listHeight.asInstanceOf[js.Any], listWidth = listWidth.asInstanceOf[js.Any], listWidthLG = listWidthLG.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaderHeight(value: Double): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPaddingBlock(value: Double): Self = StObject.set(x, "itemPaddingBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListHeight(value: Double): Self = StObject.set(x, "listHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListWidth(value: Double): Self = StObject.set(x, "listWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListWidthLG(value: Double): Self = StObject.set(x, "listWidthLG", value.asInstanceOf[js.Any])
    }
  }
}
