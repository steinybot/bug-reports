package web.typings.antd

import web.typings.antd.antdStrings.Alert
import web.typings.antd.esThemeInterfaceMod.GenerateStyle
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.FullToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAlertStyleMod {
  
  @JSImport("antd/es/alert/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/alert/style", "genActionStyle")
  @js.native
  val genActionStyle: GenerateStyle[
    AlertToken, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSInterpolation */ Any
  ] = js.native
  
  @JSImport("antd/es/alert/style", "genBaseStyle")
  @js.native
  val genBaseStyle: GenerateStyle[
    AlertToken, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSInterpolation */ Any
  ] = js.native
  
  @JSImport("antd/es/alert/style", "genTypeStyle")
  @js.native
  val genTypeStyle: GenerateStyle[
    AlertToken, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSInterpolation */ Any
  ] = js.native
  
  @JSImport("antd/es/alert/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Alert] = js.native
  
  type AlertToken = FullToken[Alert]
  
  @js.native
  trait ComponentToken extends StObject {
    
    /**
      * @desc 默认内间距
      * @descEN Default padding
      */
    var defaultPadding: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any = js.native
    
    /**
      * @desc 带有描述时的图标尺寸
      * @descEN Icon size with description
      */
    var withDescriptionIconSize: Double = js.native
    
    /**
      * @desc 带有描述的内间距
      * @descEN Padding with description
      */
    var withDescriptionPadding: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      defaultPadding: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any,
      withDescriptionIconSize: Double,
      withDescriptionPadding: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(defaultPadding = defaultPadding.asInstanceOf[js.Any], withDescriptionIconSize = withDescriptionIconSize.asInstanceOf[js.Any], withDescriptionPadding = withDescriptionPadding.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultPadding(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any
      ): Self = StObject.set(x, "defaultPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithDescriptionIconSize(value: Double): Self = StObject.set(x, "withDescriptionIconSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithDescriptionPadding(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['padding'] */ js.Any
      ): Self = StObject.set(x, "withDescriptionPadding", value.asInstanceOf[js.Any])
    }
  }
}
