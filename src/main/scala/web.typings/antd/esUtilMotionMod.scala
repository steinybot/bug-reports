package web.typings.antd

import web.typings.rcMotion.esCssmotionMod.CSSMotionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilMotionMod {
  
  @JSImport("antd/es/_util/motion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): CSSMotionProps = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[CSSMotionProps]
  @scala.inline
  def default(rootCls: String): CSSMotionProps = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(rootCls.asInstanceOf[js.Any]).asInstanceOf[CSSMotionProps]
  
  @scala.inline
  def getTransitionName(rootPrefixCls: String, motion: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionName")(rootPrefixCls.asInstanceOf[js.Any], motion.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def getTransitionName(rootPrefixCls: String, motion: String, transitionName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionName")(rootPrefixCls.asInstanceOf[js.Any], motion.asInstanceOf[js.Any], transitionName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.bottomLeft
    - `web.typings`.antd.antdStrings.bottomRight
    - `web.typings`.antd.antdStrings.topLeft
    - `web.typings`.antd.antdStrings.topRight
  */
  trait SelectCommonPlacement extends StObject
}
