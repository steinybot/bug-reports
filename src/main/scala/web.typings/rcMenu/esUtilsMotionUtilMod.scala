package web.typings.rcMenu

import web.typings.rcMotion.esCssmotionMod.CSSMotionProps
import web.typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsMotionUtilMod {
  
  @JSImport("rc-menu/es/utils/motionUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getMotion(mode: String): CSSMotionProps = ^.asInstanceOf[js.Dynamic].applyDynamic("getMotion")(mode.asInstanceOf[js.Any]).asInstanceOf[CSSMotionProps]
  @scala.inline
  def getMotion(mode: String, motion: CSSMotionProps): CSSMotionProps = (^.asInstanceOf[js.Dynamic].applyDynamic("getMotion")(mode.asInstanceOf[js.Any], motion.asInstanceOf[js.Any])).asInstanceOf[CSSMotionProps]
  @scala.inline
  def getMotion(mode: String, motion: CSSMotionProps, defaultMotions: Record[String, CSSMotionProps]): CSSMotionProps = (^.asInstanceOf[js.Dynamic].applyDynamic("getMotion")(mode.asInstanceOf[js.Any], motion.asInstanceOf[js.Any], defaultMotions.asInstanceOf[js.Any])).asInstanceOf[CSSMotionProps]
  @scala.inline
  def getMotion(mode: String, motion: Unit, defaultMotions: Record[String, CSSMotionProps]): CSSMotionProps = (^.asInstanceOf[js.Dynamic].applyDynamic("getMotion")(mode.asInstanceOf[js.Any], motion.asInstanceOf[js.Any], defaultMotions.asInstanceOf[js.Any])).asInstanceOf[CSSMotionProps]
}
