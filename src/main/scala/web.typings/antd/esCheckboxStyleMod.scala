package web.typings.antd

import web.typings.antd.anon.AntCls
import web.typings.antd.antdStrings.Checkbox
import web.typings.antd.esThemeInterfaceMod.GenerateStyle
import web.typings.antd.esThemeInterfaceMod.GlobalToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.CSSUtil
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.FullToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esCheckboxStyleMod {
  
  @JSImport("antd/es/checkbox/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/checkbox/style", "genCheckboxStyle")
  @js.native
  val genCheckboxStyle: GenerateStyle[
    CheckboxToken, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSInterpolation */ Any
  ] = js.native
  
  @scala.inline
  def getStyle_Checkbox(prefixCls: String, token: FullToken[Checkbox]): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cssinjs.CSSInterpolation */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyle")(prefixCls.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_cssinjs.CSSInterpolation */ Any
  ]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped antd.antd/es/theme/interface/components.ComponentTokenMap['Checkbox'] */ @js.native
  trait CheckboxToken
    extends StObject
       with GlobalToken
       with AntCls
       with CSSUtil {
    
    var checkboxCls: String = js.native
    
    var checkboxSize: Double = js.native
  }
  object CheckboxToken {
    
    @scala.inline
    def apply(AntCls: AntCls, CSSUtil: CSSUtil, checkboxCls: String, checkboxSize: Double): CheckboxToken = {
      val __obj = js.Dynamic.literal(checkboxCls = checkboxCls.asInstanceOf[js.Any], checkboxSize = checkboxSize.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, AntCls)
      js.Dynamic.global.Object.assign(__obj, CSSUtil)
      __obj.asInstanceOf[CheckboxToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CheckboxToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckboxCls(value: String): Self = StObject.set(x, "checkboxCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckboxSize(value: Double): Self = StObject.set(x, "checkboxSize", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ComponentToken extends StObject
}
