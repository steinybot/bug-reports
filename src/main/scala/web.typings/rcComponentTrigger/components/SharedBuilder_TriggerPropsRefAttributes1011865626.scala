package web.typings.rcComponentTrigger.components

import web.typings.StBuildingComponent
import web.typings.rcComponentTrigger.esInterfaceMod.ActionType
import web.typings.rcComponentTrigger.esInterfaceMod.AlignType
import web.typings.rcComponentTrigger.esInterfaceMod.AnimationType
import web.typings.rcComponentTrigger.esInterfaceMod.ArrowTypeOuter
import web.typings.rcComponentTrigger.esInterfaceMod.BuildInPlacements
import web.typings.rcComponentTrigger.esInterfaceMod.TransitionNameType
import web.typings.rcMotion.esCssmotionMod.CSSMotionProps
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.ReactInstance
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_TriggerPropsRefAttributes1011865626[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def action(value: ActionType | js.Array[ActionType]): this.type = set("action", value.asInstanceOf[js.Any])
  
  @scala.inline
  def actionVarargs(value: ActionType*): this.type = set("action", js.Array(value :_*))
  
  @scala.inline
  def afterPopupVisibleChange(value: /* visible */ Boolean => Unit): this.type = set("afterPopupVisibleChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def alignPoint(value: Boolean): this.type = set("alignPoint", value.asInstanceOf[js.Any])
  
  @scala.inline
  def arrow(value: Boolean | ArrowTypeOuter): this.type = set("arrow", value.asInstanceOf[js.Any])
  
  @scala.inline
  def autoDestroy(value: Boolean): this.type = set("autoDestroy", value.asInstanceOf[js.Any])
  
  @scala.inline
  def blurDelay(value: Double): this.type = set("blurDelay", value.asInstanceOf[js.Any])
  
  @scala.inline
  def builtinPlacements(value: BuildInPlacements): this.type = set("builtinPlacements", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultPopupVisible(value: Boolean): this.type = set("defaultPopupVisible", value.asInstanceOf[js.Any])
  
  @scala.inline
  def destroyPopupOnHide(value: Boolean): this.type = set("destroyPopupOnHide", value.asInstanceOf[js.Any])
  
  @scala.inline
  def focusDelay(value: Double): this.type = set("focusDelay", value.asInstanceOf[js.Any])
  
  @scala.inline
  def forceRender(value: Boolean): this.type = set("forceRender", value.asInstanceOf[js.Any])
  
  @scala.inline
  def fresh(value: Boolean): this.type = set("fresh", value.asInstanceOf[js.Any])
  
  @scala.inline
  def getPopupClassNameFromAlign(value: /* align */ AlignType => String): this.type = set("getPopupClassNameFromAlign", js.Any.fromFunction1(value))
  
  @scala.inline
  def getPopupContainer(value: /* node */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
  
  @scala.inline
  def getTriggerDOMNode(value: /* node */ ReactInstance => HTMLElement): this.type = set("getTriggerDOMNode", js.Any.fromFunction1(value))
  
  @scala.inline
  def hideAction(value: js.Array[ActionType]): this.type = set("hideAction", value.asInstanceOf[js.Any])
  
  @scala.inline
  def hideActionVarargs(value: ActionType*): this.type = set("hideAction", js.Array(value :_*))
  
  @scala.inline
  def mask(value: Boolean): this.type = set("mask", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maskAnimation(value: AnimationType): this.type = set("maskAnimation", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maskClosable(value: Boolean): this.type = set("maskClosable", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maskMotion(value: CSSMotionProps): this.type = set("maskMotion", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maskTransitionName(value: TransitionNameType): this.type = set("maskTransitionName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def mouseEnterDelay(value: Double): this.type = set("mouseEnterDelay", value.asInstanceOf[js.Any])
  
  @scala.inline
  def mouseLeaveDelay(value: Double): this.type = set("mouseLeaveDelay", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onPopupAlign(value: (/* element */ HTMLElement, /* align */ AlignType) => Unit): this.type = set("onPopupAlign", js.Any.fromFunction2(value))
  
  @scala.inline
  def onPopupClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onPopupClick", js.Any.fromFunction1(value))
  
  @scala.inline
  def onPopupVisibleChange(value: /* visible */ Boolean => Unit): this.type = set("onPopupVisibleChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def popupAlign(value: AlignType): this.type = set("popupAlign", value.asInstanceOf[js.Any])
  
  @scala.inline
  def popupAnimation(value: AnimationType): this.type = set("popupAnimation", value.asInstanceOf[js.Any])
  
  @scala.inline
  def popupClassName(value: String): this.type = set("popupClassName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def popupMotion(value: CSSMotionProps): this.type = set("popupMotion", value.asInstanceOf[js.Any])
  
  @scala.inline
  def popupPlacement(value: String): this.type = set("popupPlacement", value.asInstanceOf[js.Any])
  
  @scala.inline
  def popupStyle(value: CSSProperties): this.type = set("popupStyle", value.asInstanceOf[js.Any])
  
  @scala.inline
  def popupTransitionName(value: TransitionNameType): this.type = set("popupTransitionName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def popupVisible(value: Boolean): this.type = set("popupVisible", value.asInstanceOf[js.Any])
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def showAction(value: js.Array[ActionType]): this.type = set("showAction", value.asInstanceOf[js.Any])
  
  @scala.inline
  def showActionVarargs(value: ActionType*): this.type = set("showAction", js.Array(value :_*))
  
  @scala.inline
  def stretch(value: String): this.type = set("stretch", value.asInstanceOf[js.Any])
  
  @scala.inline
  def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
}
