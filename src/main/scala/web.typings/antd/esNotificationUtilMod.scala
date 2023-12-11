package web.typings.antd

import web.typings.antd.esNotificationInterfaceMod.NotificationPlacement
import web.typings.rcMotion.esCssmotionMod.CSSMotionProps
import web.typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esNotificationUtilMod {
  
  @JSImport("antd/es/notification/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getMotion(prefixCls: String): CSSMotionProps = ^.asInstanceOf[js.Dynamic].applyDynamic("getMotion")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[CSSMotionProps]
  
  @scala.inline
  def getPlacementStyle(placement: NotificationPlacement, top: Double, bottom: Double): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlacementStyle")(placement.asInstanceOf[js.Any], top.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
}
