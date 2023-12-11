package web.typings.antd

import web.typings.antd.antdStrings.Breadcrumb
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esBreadcrumbStyleMod {
  
  @JSImport("antd/es/breadcrumb/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/breadcrumb/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Breadcrumb] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 图标大小
      * @descEN Icon size
      */
    var iconFontSize: Double = js.native
    
    /**
      * @desc 面包屑项文字颜色
      * @descEN Text color of Breadcrumb item
      */
    var itemColor: String = js.native
    
    /**
      * @desc 最后一项文字颜色
      * @descEN Text color of the last item
      */
    var lastItemColor: String = js.native
    
    /**
      * @desc 链接文字颜色
      * @descEN Text color of link
      */
    var linkColor: String = js.native
    
    /**
      * @desc 链接文字悬浮颜色
      * @descEN Color of hovered link
      */
    var linkHoverColor: String = js.native
    
    /**
      * @desc 分隔符颜色
      * @descEN Color of separator
      */
    var separatorColor: String = js.native
    
    /**
      * @desc 分隔符外间距
      * @descEN Margin of separator
      */
    var separatorMargin: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      iconFontSize: Double,
      itemColor: String,
      lastItemColor: String,
      linkColor: String,
      linkHoverColor: String,
      separatorColor: String,
      separatorMargin: Double
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(iconFontSize = iconFontSize.asInstanceOf[js.Any], itemColor = itemColor.asInstanceOf[js.Any], lastItemColor = lastItemColor.asInstanceOf[js.Any], linkColor = linkColor.asInstanceOf[js.Any], linkHoverColor = linkHoverColor.asInstanceOf[js.Any], separatorColor = separatorColor.asInstanceOf[js.Any], separatorMargin = separatorMargin.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIconFontSize(value: Double): Self = StObject.set(x, "iconFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemColor(value: String): Self = StObject.set(x, "itemColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastItemColor(value: String): Self = StObject.set(x, "lastItemColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkColor(value: String): Self = StObject.set(x, "linkColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkHoverColor(value: String): Self = StObject.set(x, "linkHoverColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorColor(value: String): Self = StObject.set(x, "separatorColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorMargin(value: Double): Self = StObject.set(x, "separatorMargin", value.asInstanceOf[js.Any])
    }
  }
}
