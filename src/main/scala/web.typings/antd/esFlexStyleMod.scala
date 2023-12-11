package web.typings.antd

import web.typings.antd.anon.AntCls
import web.typings.antd.antdStrings.Flex
import web.typings.antd.esThemeInterfaceMod.GlobalToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.CSSUtil
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esFlexStyleMod {
  
  @JSImport("antd/es/flex/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/flex/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Flex] = js.native
  
  @js.native
  trait ComponentToken extends StObject
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped antd.antd/es/theme/interface/components.ComponentTokenMap['Flex'] */ @js.native
  trait FlexToken
    extends StObject
       with GlobalToken
       with AntCls
       with CSSUtil {
    
    /**
      * @nameZH 间隙
      * @nameEN Gap
      * @desc 控制元素的间隙。
      * @descEN Control the gap of the element.
      */
    var flexGap: Double = js.native
    
    /**
      * @nameZH 大间隙
      * @nameEN Large Gap
      * @desc 控制元素的大间隙。
      * @descEN Control the large gap of the element.
      */
    var flexGapLG: Double = js.native
    
    /**
      * @nameZH 小间隙
      * @nameEN Small Gap
      * @desc 控制元素的小间隙。
      * @descEN Control the small gap of the element.
      */
    var flexGapSM: Double = js.native
  }
  object FlexToken {
    
    @scala.inline
    def apply(AntCls: AntCls, CSSUtil: CSSUtil, flexGap: Double, flexGapLG: Double, flexGapSM: Double): FlexToken = {
      val __obj = js.Dynamic.literal(flexGap = flexGap.asInstanceOf[js.Any], flexGapLG = flexGapLG.asInstanceOf[js.Any], flexGapSM = flexGapSM.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, AntCls)
      js.Dynamic.global.Object.assign(__obj, CSSUtil)
      __obj.asInstanceOf[FlexToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FlexToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlexGap(value: Double): Self = StObject.set(x, "flexGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexGapLG(value: Double): Self = StObject.set(x, "flexGapLG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexGapSM(value: Double): Self = StObject.set(x, "flexGapSM", value.asInstanceOf[js.Any])
    }
  }
}
