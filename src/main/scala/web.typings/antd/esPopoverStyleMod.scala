package web.typings.antd

import web.typings.antd.anon.PopoverBg
import web.typings.antd.antdStrings.Popover
import web.typings.antd.esStylePlacementArrowMod.ArrowOffsetToken
import web.typings.antd.esStyleRoundedArrowMod.ArrowToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.FullToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPopoverStyleMod {
  
  @JSImport("antd/es/popover/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @JSImport("antd/es/popover/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Popover] = js.native
  
  @js.native
  trait ComponentToken
    extends StObject
       with ArrowToken
       with ArrowOffsetToken {
    
    /**
      * @deprecated Please use `titleMinWidth` instead
      * @desc 气泡卡片最小宽度
      * @descEN Min width of Popover
      */
    var minWidth: js.UndefOr[Double] = js.native
    
    /**
      * @desc 气泡卡片标题最小宽度
      * @descEN Min width of Popover title
      */
    var titleMinWidth: Double = js.native
    
    /**
      * @deprecated Please use `titleMinWidth` instead
      * @desc 气泡卡片宽度
      * @descEN Width of Popover
      */
    var width: js.UndefOr[Double] = js.native
    
    /**
      * @desc 气泡卡片 z-index
      * @descEN z-index of Popover
      */
    var zIndexPopup: Double = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(titleMinWidth: Double, zIndexPopup: Double): ComponentToken = {
      val __obj = js.Dynamic.literal(titleMinWidth = titleMinWidth.asInstanceOf[js.Any], zIndexPopup = zIndexPopup.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setTitleMinWidth(value: Double): Self = StObject.set(x, "titleMinWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setZIndexPopup(value: Double): Self = StObject.set(x, "zIndexPopup", value.asInstanceOf[js.Any])
    }
  }
  
  type PopoverToken = FullToken[Popover] with PopoverBg
}
