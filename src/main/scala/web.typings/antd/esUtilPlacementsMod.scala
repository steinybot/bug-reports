package web.typings.antd

import web.typings.antd.anon.AdjustX
import web.typings.antd.anon.ContentRadius
import web.typings.antd.antdInts.`0`
import web.typings.antd.antdInts.`1`
import web.typings.antd.esStylePlacementArrowMod.ArrowOffsetToken
import web.typings.rcComponentTrigger.esInterfaceMod.BuildInPlacements
import web.typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilPlacementsMod {
  
  @JSImport("antd/es/_util/placements", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(config: PlacementsConfig): BuildInPlacements = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[BuildInPlacements]
  
  @scala.inline
  def getOverflowOptions(
    placement: String,
    arrowOffset: ReturnType[js.Function1[/* options */ ContentRadius, ArrowOffsetToken]],
    arrowWidth: Double
  ): AdjustX = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverflowOptions")(placement.asInstanceOf[js.Any], arrowOffset.asInstanceOf[js.Any], arrowWidth.asInstanceOf[js.Any])).asInstanceOf[AdjustX]
  @scala.inline
  def getOverflowOptions(
    placement: String,
    arrowOffset: ReturnType[js.Function1[/* options */ ContentRadius, ArrowOffsetToken]],
    arrowWidth: Double,
    autoAdjustOverflow: AdjustOverflow
  ): AdjustX = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverflowOptions")(placement.asInstanceOf[js.Any], arrowOffset.asInstanceOf[js.Any], arrowWidth.asInstanceOf[js.Any], autoAdjustOverflow.asInstanceOf[js.Any])).asInstanceOf[AdjustX]
  @scala.inline
  def getOverflowOptions(
    placement: String,
    arrowOffset: ReturnType[js.Function1[/* options */ ContentRadius, ArrowOffsetToken]],
    arrowWidth: Double,
    autoAdjustOverflow: Boolean
  ): AdjustX = (^.asInstanceOf[js.Dynamic].applyDynamic("getOverflowOptions")(placement.asInstanceOf[js.Any], arrowOffset.asInstanceOf[js.Any], arrowWidth.asInstanceOf[js.Any], autoAdjustOverflow.asInstanceOf[js.Any])).asInstanceOf[AdjustX]
  
  @js.native
  trait AdjustOverflow extends StObject {
    
    var adjustX: js.UndefOr[`0` | `1`] = js.native
    
    var adjustY: js.UndefOr[`0` | `1`] = js.native
  }
  object AdjustOverflow {
    
    @scala.inline
    def apply(): AdjustOverflow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdjustOverflow]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AdjustOverflow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjustX(value: `0` | `1`): Self = StObject.set(x, "adjustX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjustXUndefined: Self = StObject.set(x, "adjustX", js.undefined)
      
      @scala.inline
      def setAdjustY(value: `0` | `1`): Self = StObject.set(x, "adjustY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjustYUndefined: Self = StObject.set(x, "adjustY", js.undefined)
    }
  }
  
  @js.native
  trait PlacementsConfig extends StObject {
    
    var arrowPointAtCenter: js.UndefOr[Boolean] = js.native
    
    var arrowWidth: Double = js.native
    
    var autoAdjustOverflow: js.UndefOr[Boolean | AdjustOverflow] = js.native
    
    var borderRadius: Double = js.native
    
    var offset: Double = js.native
    
    var visibleFirst: js.UndefOr[Boolean] = js.native
  }
  object PlacementsConfig {
    
    @scala.inline
    def apply(arrowWidth: Double, borderRadius: Double, offset: Double): PlacementsConfig = {
      val __obj = js.Dynamic.literal(arrowWidth = arrowWidth.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlacementsConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PlacementsConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrowPointAtCenter(value: Boolean): Self = StObject.set(x, "arrowPointAtCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowPointAtCenterUndefined: Self = StObject.set(x, "arrowPointAtCenter", js.undefined)
      
      @scala.inline
      def setArrowWidth(value: Double): Self = StObject.set(x, "arrowWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAdjustOverflow(value: Boolean | AdjustOverflow): Self = StObject.set(x, "autoAdjustOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAdjustOverflowUndefined: Self = StObject.set(x, "autoAdjustOverflow", js.undefined)
      
      @scala.inline
      def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleFirst(value: Boolean): Self = StObject.set(x, "visibleFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleFirstUndefined: Self = StObject.set(x, "visibleFirst", js.undefined)
    }
  }
}
