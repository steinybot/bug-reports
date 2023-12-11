package web.typings.antd

import web.typings.rcMotion.esCssmotionMod.CSSMotionProps
import web.typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMessageUtilMod {
  
  @JSImport("antd/es/message/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getMotion(prefixCls: String): CSSMotionProps = ^.asInstanceOf[js.Dynamic].applyDynamic("getMotion")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[CSSMotionProps]
  @scala.inline
  def getMotion(prefixCls: String, transitionName: String): CSSMotionProps = (^.asInstanceOf[js.Dynamic].applyDynamic("getMotion")(prefixCls.asInstanceOf[js.Any], transitionName.asInstanceOf[js.Any])).asInstanceOf[CSSMotionProps]
  
  @scala.inline
  def wrapPromiseFn(openFn: js.Function1[/* resolve */ VoidFunction, VoidFunction]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapPromiseFn")(openFn.asInstanceOf[js.Any]).asInstanceOf[Any]
}
