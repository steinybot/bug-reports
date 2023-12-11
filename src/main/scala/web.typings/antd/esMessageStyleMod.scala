package web.typings.antd

import web.typings.antd.antdStrings.Message
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMessageStyleMod {
  
  @JSImport("antd/es/message/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/message/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Message] = js.native
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 提示框背景色
      * @descEN Background color of Message
      */
    var contentBg: String = js.native
    
    /**
      * @desc 提示框内边距
      * @descEN Padding of Message
      */
    var contentPadding: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any = js.native
    
    /**
      * @desc 提示框 z-index
      * @descEN z-index of Message
      */
    var zIndexPopup: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      contentBg: String,
      contentPadding: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any,
      zIndexPopup: Double
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(contentBg = contentBg.asInstanceOf[js.Any], contentPadding = contentPadding.asInstanceOf[js.Any], zIndexPopup = zIndexPopup.asInstanceOf[js.Any])
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
      def setZIndexPopup(value: Double): Self = StObject.set(x, "zIndexPopup", value.asInstanceOf[js.Any])
    }
  }
}
