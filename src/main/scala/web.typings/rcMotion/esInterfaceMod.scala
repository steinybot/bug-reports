package web.typings.rcMotion

import web.typings.rcMotion.rcMotionStrings.active
import web.typings.rcMotion.rcMotionStrings.appear
import web.typings.rcMotion.rcMotionStrings.end
import web.typings.rcMotion.rcMotionStrings.enter
import web.typings.rcMotion.rcMotionStrings.leave
import web.typings.rcMotion.rcMotionStrings.none
import web.typings.rcMotion.rcMotionStrings.prepare
import web.typings.rcMotion.rcMotionStrings.prepared
import web.typings.rcMotion.rcMotionStrings.start
import web.typings.react.mod.CSSProperties
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInterfaceMod {
  
  @JSImport("rc-motion/es/interface", "STATUS_APPEAR")
  @js.native
  val STATUS_APPEAR: appear = js.native
  
  @JSImport("rc-motion/es/interface", "STATUS_ENTER")
  @js.native
  val STATUS_ENTER: enter = js.native
  
  @JSImport("rc-motion/es/interface", "STATUS_LEAVE")
  @js.native
  val STATUS_LEAVE: leave = js.native
  
  @JSImport("rc-motion/es/interface", "STATUS_NONE")
  @js.native
  val STATUS_NONE: none = js.native
  
  @JSImport("rc-motion/es/interface", "STEP_ACTIVATED")
  @js.native
  val STEP_ACTIVATED: end = js.native
  
  @JSImport("rc-motion/es/interface", "STEP_ACTIVE")
  @js.native
  val STEP_ACTIVE: active = js.native
  
  @JSImport("rc-motion/es/interface", "STEP_NONE")
  @js.native
  val STEP_NONE: none = js.native
  
  @JSImport("rc-motion/es/interface", "STEP_PREPARE")
  @js.native
  val STEP_PREPARE: prepare = js.native
  
  @JSImport("rc-motion/es/interface", "STEP_PREPARED")
  @js.native
  val STEP_PREPARED: prepared = js.native
  
  @JSImport("rc-motion/es/interface", "STEP_START")
  @js.native
  val STEP_START: start = js.native
  
  type MotionEndEventHandler = js.Function2[/* element */ HTMLElement, /* event */ MotionEvent, Boolean | Unit]
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcMotion.anon.TransitionEventdeadlinebo
    - `web.typings`.rcMotion.anon.AnimationEventdeadlineboo
  */
  trait MotionEvent extends StObject
  
  type MotionEventHandler = js.Function2[/* element */ HTMLElement, /* event */ MotionEvent, CSSProperties | Unit]
  
  type MotionPrepareEventHandler = js.Function1[/* element */ HTMLElement, js.Promise[Any] | Unit]
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcMotion.rcMotionStrings.none
    - `web.typings`.rcMotion.rcMotionStrings.appear
    - `web.typings`.rcMotion.rcMotionStrings.enter
    - `web.typings`.rcMotion.rcMotionStrings.leave
  */
  trait MotionStatus extends StObject
  object MotionStatus {
    
    @scala.inline
    def appear: web.typings.rcMotion.rcMotionStrings.appear = "appear".asInstanceOf[web.typings.rcMotion.rcMotionStrings.appear]
    
    @scala.inline
    def enter: web.typings.rcMotion.rcMotionStrings.enter = "enter".asInstanceOf[web.typings.rcMotion.rcMotionStrings.enter]
    
    @scala.inline
    def leave: web.typings.rcMotion.rcMotionStrings.leave = "leave".asInstanceOf[web.typings.rcMotion.rcMotionStrings.leave]
    
    @scala.inline
    def none: web.typings.rcMotion.rcMotionStrings.none = "none".asInstanceOf[web.typings.rcMotion.rcMotionStrings.none]
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcMotion.rcMotionStrings.none
    - `web.typings`.rcMotion.rcMotionStrings.prepare
    - `web.typings`.rcMotion.rcMotionStrings.start
    - `web.typings`.rcMotion.rcMotionStrings.active
    - `web.typings`.rcMotion.rcMotionStrings.end
    - `web.typings`.rcMotion.rcMotionStrings.prepared
  */
  trait StepStatus extends StObject
  object StepStatus {
    
    @scala.inline
    def active: web.typings.rcMotion.rcMotionStrings.active = "active".asInstanceOf[web.typings.rcMotion.rcMotionStrings.active]
    
    @scala.inline
    def end: web.typings.rcMotion.rcMotionStrings.end = "end".asInstanceOf[web.typings.rcMotion.rcMotionStrings.end]
    
    @scala.inline
    def none: web.typings.rcMotion.rcMotionStrings.none = "none".asInstanceOf[web.typings.rcMotion.rcMotionStrings.none]
    
    @scala.inline
    def prepare: web.typings.rcMotion.rcMotionStrings.prepare = "prepare".asInstanceOf[web.typings.rcMotion.rcMotionStrings.prepare]
    
    @scala.inline
    def prepared: web.typings.rcMotion.rcMotionStrings.prepared = "prepared".asInstanceOf[web.typings.rcMotion.rcMotionStrings.prepared]
    
    @scala.inline
    def start: web.typings.rcMotion.rcMotionStrings.start = "start".asInstanceOf[web.typings.rcMotion.rcMotionStrings.start]
  }
}
