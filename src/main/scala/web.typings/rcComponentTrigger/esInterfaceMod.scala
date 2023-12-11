package web.typings.rcComponentTrigger

import web.typings.rcComponentTrigger.anon.AdjustX
import web.typings.rcComponentTrigger.rcComponentTriggerStrings.scroll
import web.typings.rcComponentTrigger.rcComponentTriggerStrings.visible
import web.typings.rcComponentTrigger.rcComponentTriggerStrings.visibleFirst
import web.typings.rcMotion.esCssmotionMod.CSSMotionProps
import web.typings.react.mod.CSSProperties
import web.typings.std.Record
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInterfaceMod {
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcComponentTrigger.rcComponentTriggerStrings.hover
    - `web.typings`.rcComponentTrigger.rcComponentTriggerStrings.focus
    - `web.typings`.rcComponentTrigger.rcComponentTriggerStrings.click
    - `web.typings`.rcComponentTrigger.rcComponentTriggerStrings.contextMenu
  */
  trait ActionType extends StObject
  object ActionType {
    
    @scala.inline
    def click: web.typings.rcComponentTrigger.rcComponentTriggerStrings.click = "click".asInstanceOf[web.typings.rcComponentTrigger.rcComponentTriggerStrings.click]
    
    @scala.inline
    def contextMenu: web.typings.rcComponentTrigger.rcComponentTriggerStrings.contextMenu = "contextMenu".asInstanceOf[web.typings.rcComponentTrigger.rcComponentTriggerStrings.contextMenu]
    
    @scala.inline
    def focus: web.typings.rcComponentTrigger.rcComponentTriggerStrings.focus = "focus".asInstanceOf[web.typings.rcComponentTrigger.rcComponentTriggerStrings.focus]
    
    @scala.inline
    def hover: web.typings.rcComponentTrigger.rcComponentTriggerStrings.hover = "hover".asInstanceOf[web.typings.rcComponentTrigger.rcComponentTriggerStrings.hover]
  }
  
  type AlignPoint = /* template literal string: ${AlignPointTopBottom}${AlignPointLeftRight} */ String
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcComponentTrigger.rcComponentTriggerStrings.l
    - `web.typings`.rcComponentTrigger.rcComponentTriggerStrings.r
    - `web.typings`.rcComponentTrigger.rcComponentTriggerStrings.c
  */
  trait AlignPointLeftRight extends StObject
  object AlignPointLeftRight {
    
    @scala.inline
    def c: web.typings.rcComponentTrigger.rcComponentTriggerStrings.c = "c".asInstanceOf[web.typings.rcComponentTrigger.rcComponentTriggerStrings.c]
    
    @scala.inline
    def l: web.typings.rcComponentTrigger.rcComponentTriggerStrings.l = "l".asInstanceOf[web.typings.rcComponentTrigger.rcComponentTriggerStrings.l]
    
    @scala.inline
    def r: web.typings.rcComponentTrigger.rcComponentTriggerStrings.r = "r".asInstanceOf[web.typings.rcComponentTrigger.rcComponentTriggerStrings.r]
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcComponentTrigger.rcComponentTriggerStrings.t
    - `web.typings`.rcComponentTrigger.rcComponentTriggerStrings.b
    - `web.typings`.rcComponentTrigger.rcComponentTriggerStrings.c
  */
  trait AlignPointTopBottom extends StObject
  object AlignPointTopBottom {
    
    @scala.inline
    def b: web.typings.rcComponentTrigger.rcComponentTriggerStrings.b = "b".asInstanceOf[web.typings.rcComponentTrigger.rcComponentTriggerStrings.b]
    
    @scala.inline
    def c: web.typings.rcComponentTrigger.rcComponentTriggerStrings.c = "c".asInstanceOf[web.typings.rcComponentTrigger.rcComponentTriggerStrings.c]
    
    @scala.inline
    def t: web.typings.rcComponentTrigger.rcComponentTriggerStrings.t = "t".asInstanceOf[web.typings.rcComponentTrigger.rcComponentTriggerStrings.t]
  }
  
  @js.native
  trait AlignType extends StObject {
    
    /**
      * @private Do not use in your production code
      */
    var _experimental: js.UndefOr[Record[String, Any]] = js.native
    
    /** Auto adjust arrow position */
    var autoArrow: js.UndefOr[Boolean] = js.native
    
    /**
      * Auto chose position with `top` or `bottom` by the align result
      */
    var dynamicInset: js.UndefOr[Boolean] = js.native
    
    /**
      * Config visible region check of html node. Default `visible`:
      *  - `visible`:
      *    The visible region of user browser window.
      *    Use `clientHeight` for check.
      *    If `visible` region not satisfy, fallback to `scroll`.
      *  - `scroll`:
      *    The whole region of the html scroll area.
      *    Use `scrollHeight` for check.
      *  - `visibleFirst`:
      *    Similar to `visible`, but if `visible` region not satisfy, fallback to `scroll`.
      */
    var htmlRegion: js.UndefOr[visible | scroll | visibleFirst] = js.native
    
    var ignoreShake: js.UndefOr[Boolean] = js.native
    
    /**
      * offset source node by offset[0] in x and offset[1] in y.
      * If offset contains percentage string value, it is relative to sourceNode region.
      */
    var offset: js.UndefOr[js.Array[OffsetType]] = js.native
    
    /**
      * If adjustX field is true, will adjust source node in x direction if source node is invisible.
      * If adjustY field is true, will adjust source node in y direction if source node is invisible.
      */
    var overflow: js.UndefOr[AdjustX] = js.native
    
    /**
      * move point of source node to align with point of target node.
      * Such as ['tr','cc'], align top right point of source node with center point of target node.
      * Point can be 't'(top), 'b'(bottom), 'c'(center), 'l'(left), 'r'(right) */
    var points: js.UndefOr[js.Array[String | AlignPoint]] = js.native
    
    /**
      * offset target node by offset[0] in x and offset[1] in y.
      * If targetOffset contains percentage string value, it is relative to targetNode region.
      */
    var targetOffset: js.UndefOr[js.Array[OffsetType]] = js.native
    
    /**
      * Whether use css bottom instead of top to position
      */
    var useCssBottom: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether use css right instead of left to position
      */
    var useCssRight: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether use css transform instead of left/top/right/bottom to position if browser supports.
      * Defaults to false.
      */
    var useCssTransform: js.UndefOr[Boolean] = js.native
  }
  object AlignType {
    
    @scala.inline
    def apply(): AlignType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignType]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AlignType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoArrow(value: Boolean): Self = StObject.set(x, "autoArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoArrowUndefined: Self = StObject.set(x, "autoArrow", js.undefined)
      
      @scala.inline
      def setDynamicInset(value: Boolean): Self = StObject.set(x, "dynamicInset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamicInsetUndefined: Self = StObject.set(x, "dynamicInset", js.undefined)
      
      @scala.inline
      def setHtmlRegion(value: visible | scroll | visibleFirst): Self = StObject.set(x, "htmlRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlRegionUndefined: Self = StObject.set(x, "htmlRegion", js.undefined)
      
      @scala.inline
      def setIgnoreShake(value: Boolean): Self = StObject.set(x, "ignoreShake", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreShakeUndefined: Self = StObject.set(x, "ignoreShake", js.undefined)
      
      @scala.inline
      def setOffset(value: js.Array[OffsetType]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOffsetVarargs(value: OffsetType*): Self = StObject.set(x, "offset", js.Array(value :_*))
      
      @scala.inline
      def setOverflow(value: AdjustX): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      @scala.inline
      def setPoints(value: js.Array[String | AlignPoint]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      @scala.inline
      def setPointsVarargs(value: (String | AlignPoint)*): Self = StObject.set(x, "points", js.Array(value :_*))
      
      @scala.inline
      def setTargetOffset(value: js.Array[OffsetType]): Self = StObject.set(x, "targetOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetOffsetUndefined: Self = StObject.set(x, "targetOffset", js.undefined)
      
      @scala.inline
      def setTargetOffsetVarargs(value: OffsetType*): Self = StObject.set(x, "targetOffset", js.Array(value :_*))
      
      @scala.inline
      def setUseCssBottom(value: Boolean): Self = StObject.set(x, "useCssBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCssBottomUndefined: Self = StObject.set(x, "useCssBottom", js.undefined)
      
      @scala.inline
      def setUseCssRight(value: Boolean): Self = StObject.set(x, "useCssRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCssRightUndefined: Self = StObject.set(x, "useCssRight", js.undefined)
      
      @scala.inline
      def setUseCssTransform(value: Boolean): Self = StObject.set(x, "useCssTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCssTransformUndefined: Self = StObject.set(x, "useCssTransform", js.undefined)
      
      @scala.inline
      def set_experimental(value: Record[String, Any]): Self = StObject.set(x, "_experimental", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_experimentalUndefined: Self = StObject.set(x, "_experimental", js.undefined)
    }
  }
  
  type AnimationType = String
  
  @js.native
  trait ArrowPos extends StObject {
    
    var x: js.UndefOr[Double] = js.native
    
    var y: js.UndefOr[Double] = js.native
  }
  object ArrowPos {
    
    @scala.inline
    def apply(): ArrowPos = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowPos]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ArrowPos] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait ArrowTypeOuter extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var content: js.UndefOr[ReactElement] = js.native
  }
  object ArrowTypeOuter {
    
    @scala.inline
    def apply(): ArrowTypeOuter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowTypeOuter]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ArrowTypeOuter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    }
  }
  
  type BuildInPlacements = Record[String, AlignType]
  
  @js.native
  trait CommonEventHandler extends StObject {
    
    def remove(): Unit = js.native
  }
  object CommonEventHandler {
    
    @scala.inline
    def apply(remove: () => Unit): CommonEventHandler = {
      val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
      __obj.asInstanceOf[CommonEventHandler]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CommonEventHandler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait MobileConfig extends StObject {
    
    var popupClassName: js.UndefOr[String] = js.native
    
    /** Set popup motion. You can ref `rc-motion` for more info. */
    var popupMotion: js.UndefOr[CSSMotionProps] = js.native
    
    var popupRender: js.UndefOr[js.Function1[/* originNode */ ReactElement, ReactElement]] = js.native
    
    var popupStyle: js.UndefOr[CSSProperties] = js.native
  }
  object MobileConfig {
    
    @scala.inline
    def apply(): MobileConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MobileConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MobileConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
      
      @scala.inline
      def setPopupMotion(value: CSSMotionProps): Self = StObject.set(x, "popupMotion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupMotionUndefined: Self = StObject.set(x, "popupMotion", js.undefined)
      
      @scala.inline
      def setPopupRender(value: /* originNode */ ReactElement => ReactElement): Self = StObject.set(x, "popupRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPopupRenderUndefined: Self = StObject.set(x, "popupRender", js.undefined)
      
      @scala.inline
      def setPopupStyle(value: CSSProperties): Self = StObject.set(x, "popupStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupStyleUndefined: Self = StObject.set(x, "popupStyle", js.undefined)
    }
  }
  
  type OffsetType = Double | (/* template literal string: ${number}% */ String)
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcComponentTrigger.rcComponentTriggerStrings.top
    - `web.typings`.rcComponentTrigger.rcComponentTriggerStrings.left
    - `web.typings`.rcComponentTrigger.rcComponentTriggerStrings.right
    - `web.typings`.rcComponentTrigger.rcComponentTriggerStrings.bottom
    - `web.typings`.rcComponentTrigger.rcComponentTriggerStrings.topLeft
    - `web.typings`.rcComponentTrigger.rcComponentTriggerStrings.topRight
    - `web.typings`.rcComponentTrigger.rcComponentTriggerStrings.bottomLeft
    - `web.typings`.rcComponentTrigger.rcComponentTriggerStrings.bottomRight
    - `web.typings`.rcComponentTrigger.rcComponentTriggerStrings.leftTop
    - `web.typings`.rcComponentTrigger.rcComponentTriggerStrings.leftBottom
    - `web.typings`.rcComponentTrigger.rcComponentTriggerStrings.rightTop
    - `web.typings`.rcComponentTrigger.rcComponentTriggerStrings.rightBottom
  */
  trait Placement extends StObject
  object Placement {
    
    @scala.inline
    def bottom: web.typings.rcComponentTrigger.rcComponentTriggerStrings.bottom = "bottom".asInstanceOf[web.typings.rcComponentTrigger.rcComponentTriggerStrings.bottom]
    
    @scala.inline
    def bottomLeft: web.typings.rcComponentTrigger.rcComponentTriggerStrings.bottomLeft = "bottomLeft".asInstanceOf[web.typings.rcComponentTrigger.rcComponentTriggerStrings.bottomLeft]
    
    @scala.inline
    def bottomRight: web.typings.rcComponentTrigger.rcComponentTriggerStrings.bottomRight = "bottomRight".asInstanceOf[web.typings.rcComponentTrigger.rcComponentTriggerStrings.bottomRight]
    
    @scala.inline
    def left: web.typings.rcComponentTrigger.rcComponentTriggerStrings.left = "left".asInstanceOf[web.typings.rcComponentTrigger.rcComponentTriggerStrings.left]
    
    @scala.inline
    def leftBottom: web.typings.rcComponentTrigger.rcComponentTriggerStrings.leftBottom = "leftBottom".asInstanceOf[web.typings.rcComponentTrigger.rcComponentTriggerStrings.leftBottom]
    
    @scala.inline
    def leftTop: web.typings.rcComponentTrigger.rcComponentTriggerStrings.leftTop = "leftTop".asInstanceOf[web.typings.rcComponentTrigger.rcComponentTriggerStrings.leftTop]
    
    @scala.inline
    def right: web.typings.rcComponentTrigger.rcComponentTriggerStrings.right = "right".asInstanceOf[web.typings.rcComponentTrigger.rcComponentTriggerStrings.right]
    
    @scala.inline
    def rightBottom: web.typings.rcComponentTrigger.rcComponentTriggerStrings.rightBottom = "rightBottom".asInstanceOf[web.typings.rcComponentTrigger.rcComponentTriggerStrings.rightBottom]
    
    @scala.inline
    def rightTop: web.typings.rcComponentTrigger.rcComponentTriggerStrings.rightTop = "rightTop".asInstanceOf[web.typings.rcComponentTrigger.rcComponentTriggerStrings.rightTop]
    
    @scala.inline
    def top: web.typings.rcComponentTrigger.rcComponentTriggerStrings.top = "top".asInstanceOf[web.typings.rcComponentTrigger.rcComponentTriggerStrings.top]
    
    @scala.inline
    def topLeft: web.typings.rcComponentTrigger.rcComponentTriggerStrings.topLeft = "topLeft".asInstanceOf[web.typings.rcComponentTrigger.rcComponentTriggerStrings.topLeft]
    
    @scala.inline
    def topRight: web.typings.rcComponentTrigger.rcComponentTriggerStrings.topRight = "topRight".asInstanceOf[web.typings.rcComponentTrigger.rcComponentTriggerStrings.topRight]
  }
  
  @js.native
  trait Point extends StObject {
    
    var pageX: Double = js.native
    
    var pageY: Double = js.native
  }
  object Point {
    
    @scala.inline
    def apply(pageX: Double, pageY: Double): Point = {
      val __obj = js.Dynamic.literal(pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    }
  }
  
  type StretchType = String
  
  type TransitionNameType = String
}
