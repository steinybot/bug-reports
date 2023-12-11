package web.typings.rcComponentTrigger

import web.typings.rcComponentTrigger.anon.Bottom
import web.typings.rcComponentTrigger.esInterfaceMod.AlignType
import web.typings.rcComponentTrigger.esInterfaceMod.AnimationType
import web.typings.rcComponentTrigger.esInterfaceMod.BuildInPlacements
import web.typings.rcComponentTrigger.esInterfaceMod.TransitionNameType
import web.typings.rcMotion.esCssmotionMod.CSSMotionProps
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilMod {
  
  @JSImport("@rc-component/trigger/es/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def collectScroller(ele: HTMLElement): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("collectScroller")(ele.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
  
  @scala.inline
  def getAlignPopupClassName(builtinPlacements: BuildInPlacements, prefixCls: String, align: AlignType, isAlignPoint: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlignPopupClassName")(builtinPlacements.asInstanceOf[js.Any], prefixCls.asInstanceOf[js.Any], align.asInstanceOf[js.Any], isAlignPoint.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getMotion(
    prefixCls: String,
    motion: CSSMotionProps,
    animation: AnimationType,
    transitionName: TransitionNameType
  ): CSSMotionProps = (^.asInstanceOf[js.Dynamic].applyDynamic("getMotion")(prefixCls.asInstanceOf[js.Any], motion.asInstanceOf[js.Any], animation.asInstanceOf[js.Any], transitionName.asInstanceOf[js.Any])).asInstanceOf[CSSMotionProps]
  
  @scala.inline
  def getVisibleArea(initArea: VisibleArea): Bottom = ^.asInstanceOf[js.Dynamic].applyDynamic("getVisibleArea")(initArea.asInstanceOf[js.Any]).asInstanceOf[Bottom]
  @scala.inline
  def getVisibleArea(initArea: VisibleArea, scrollerList: js.Array[HTMLElement]): Bottom = (^.asInstanceOf[js.Dynamic].applyDynamic("getVisibleArea")(initArea.asInstanceOf[js.Any], scrollerList.asInstanceOf[js.Any])).asInstanceOf[Bottom]
  
  @scala.inline
  def getWin(ele: HTMLElement): Window with (/* globalThis */ Any) = ^.asInstanceOf[js.Dynamic].applyDynamic("getWin")(ele.asInstanceOf[js.Any]).asInstanceOf[Window with (/* globalThis */ Any)]
  
  @scala.inline
  def toNum(num: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toNum")(num.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def toNum(num: Double, defaultValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toNum")(num.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @js.native
  trait VisibleArea extends StObject {
    
    var bottom: Double = js.native
    
    var left: Double = js.native
    
    var right: Double = js.native
    
    var top: Double = js.native
  }
  object VisibleArea {
    
    @scala.inline
    def apply(bottom: Double, left: Double, right: Double, top: Double): VisibleArea = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[VisibleArea]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: VisibleArea] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
