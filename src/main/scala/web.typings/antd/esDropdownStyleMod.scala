package web.typings.antd

import web.typings.antd.anon.AntCls
import web.typings.antd.antdStrings.Dropdown
import web.typings.antd.esStylePlacementArrowMod.ArrowOffsetToken
import web.typings.antd.esStyleRoundedArrowMod.ArrowToken
import web.typings.antd.esThemeInterfaceMod.GlobalToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.CSSUtil
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDropdownStyleMod {
  
  @JSImport("antd/es/dropdown/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/dropdown/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Dropdown] = js.native
  
  @js.native
  trait ComponentToken
    extends StObject
       with ArrowToken
       with ArrowOffsetToken {
    
    /**
      * @desc 下拉菜单纵向内边距
      * @descEN Vertical padding of dropdown
      */
    var paddingBlock: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingBlock'] */ js.Any = js.native
    
    /**
      * @desc 下拉菜单 z-index
      * @descEN z-index of dropdown
      */
    var zIndexPopup: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      paddingBlock: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingBlock'] */ js.Any,
      zIndexPopup: Double
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(paddingBlock = paddingBlock.asInstanceOf[js.Any], zIndexPopup = zIndexPopup.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPaddingBlock(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['paddingBlock'] */ js.Any
      ): Self = StObject.set(x, "paddingBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexPopup(value: Double): Self = StObject.set(x, "zIndexPopup", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped antd.antd/es/theme/interface/components.ComponentTokenMap['Dropdown'] */ @js.native
  trait DropdownToken
    extends StObject
       with GlobalToken
       with AntCls
       with CSSUtil {
    
    var dropdownArrowDistance: Double | String = js.native
    
    var dropdownEdgeChildPadding: Double = js.native
    
    var menuCls: String = js.native
  }
  object DropdownToken {
    
    @scala.inline
    def apply(
      AntCls: AntCls,
      CSSUtil: CSSUtil,
      dropdownArrowDistance: Double | String,
      dropdownEdgeChildPadding: Double,
      menuCls: String
    ): DropdownToken = {
      val __obj = js.Dynamic.literal(dropdownArrowDistance = dropdownArrowDistance.asInstanceOf[js.Any], dropdownEdgeChildPadding = dropdownEdgeChildPadding.asInstanceOf[js.Any], menuCls = menuCls.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, AntCls)
      js.Dynamic.global.Object.assign(__obj, CSSUtil)
      __obj.asInstanceOf[DropdownToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DropdownToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDropdownArrowDistance(value: Double | String): Self = StObject.set(x, "dropdownArrowDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownEdgeChildPadding(value: Double): Self = StObject.set(x, "dropdownEdgeChildPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuCls(value: String): Self = StObject.set(x, "menuCls", value.asInstanceOf[js.Any])
    }
  }
}
