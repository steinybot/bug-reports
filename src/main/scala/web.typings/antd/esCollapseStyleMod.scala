package web.typings.antd

import web.typings.antd.anon.CollapseHeaderPaddingLG
import web.typings.antd.antdStrings.Collapse
import web.typings.antd.esThemeInterfaceMod.GenerateStyle
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.FullToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esCollapseStyleMod {
  
  @JSImport("antd/es/collapse/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/collapse/style", "genBaseStyle")
  @js.native
  val genBaseStyle: GenerateStyle[
    CollapseToken, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSInterpolation */ Any
  ] = js.native
  
  @JSImport("antd/es/collapse/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Collapse] = js.native
  
  type CollapseToken = FullToken[Collapse] with CollapseHeaderPaddingLG
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 折叠面板内容背景
      * @descEN Background of content
      */
    var contentBg: String = js.native
    
    /**
      * @desc 折叠面板内容内部编辑
      * @descEN Padding of content
      */
    var contentPadding: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any = js.native
    
    /**
      * @desc 折叠面板头部背景
      * @descEN Background of header
      */
    var headerBg: String = js.native
    
    /**
      * @desc 折叠面板头部内边距
      * @descEN Padding of header
      */
    var headerPadding: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      contentBg: String,
      contentPadding: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any,
      headerBg: String,
      headerPadding: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(contentBg = contentBg.asInstanceOf[js.Any], contentPadding = contentPadding.asInstanceOf[js.Any], headerBg = headerBg.asInstanceOf[js.Any], headerPadding = headerPadding.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentBg(value: String): Self = StObject.set(x, "contentBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentPadding(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any
      ): Self = StObject.set(x, "contentPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderBg(value: String): Self = StObject.set(x, "headerBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderPadding(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any
      ): Self = StObject.set(x, "headerPadding", value.asInstanceOf[js.Any])
    }
  }
}
