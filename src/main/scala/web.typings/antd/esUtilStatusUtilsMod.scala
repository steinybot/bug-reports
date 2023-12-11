package web.typings.antd

import web.typings.antd.antdStrings._empty
import web.typings.antd.antdStrings.error
import web.typings.antd.antdStrings.success
import web.typings.antd.antdStrings.validating
import web.typings.antd.antdStrings.warning
import web.typings.antd.esFormFormItemMod.ValidateStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilStatusUtilsMod {
  
  @JSImport("antd/es/_util/statusUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getMergedStatus(): js.UndefOr[_empty | success | error | warning | validating] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMergedStatus")().asInstanceOf[js.UndefOr[_empty | success | error | warning | validating]]
  @scala.inline
  def getMergedStatus(contextStatus: ValidateStatus): js.UndefOr[_empty | success | error | warning | validating] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMergedStatus")(contextStatus.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[_empty | success | error | warning | validating]]
  @scala.inline
  def getMergedStatus(contextStatus: ValidateStatus, customStatus: InputStatus): js.UndefOr[_empty | success | error | warning | validating] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMergedStatus")(contextStatus.asInstanceOf[js.Any], customStatus.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[_empty | success | error | warning | validating]]
  @scala.inline
  def getMergedStatus(contextStatus: Unit, customStatus: InputStatus): js.UndefOr[_empty | success | error | warning | validating] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMergedStatus")(contextStatus.asInstanceOf[js.Any], customStatus.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[_empty | success | error | warning | validating]]
  
  @scala.inline
  def getStatusClassNames(prefixCls: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatusClassNames")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def getStatusClassNames(prefixCls: String, status: ValidateStatus): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStatusClassNames")(prefixCls.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def getStatusClassNames(prefixCls: String, status: ValidateStatus, hasFeedback: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStatusClassNames")(prefixCls.asInstanceOf[js.Any], status.asInstanceOf[js.Any], hasFeedback.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def getStatusClassNames(prefixCls: String, status: Unit, hasFeedback: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStatusClassNames")(prefixCls.asInstanceOf[js.Any], status.asInstanceOf[js.Any], hasFeedback.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.warning
    - `web.typings`.antd.antdStrings.error
    - `web.typings`.antd.antdStrings._empty
  */
  trait InputStatus extends StObject
}
