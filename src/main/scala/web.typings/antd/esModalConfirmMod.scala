package web.typings.antd

import web.typings.antd.anon.Destroy
import web.typings.antd.anon.RootPrefixCls
import web.typings.antd.anon.Update
import web.typings.antd.antdStrings.confirm
import web.typings.antd.antdStrings.error
import web.typings.antd.antdStrings.info
import web.typings.antd.antdStrings.success
import web.typings.antd.antdStrings.warn
import web.typings.antd.antdStrings.warning
import web.typings.antd.esModalInterfaceMod.ModalFuncProps
import web.typings.std.NonNullable
import web.typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esModalConfirmMod {
  
  @JSImport("antd/es/modal/confirm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(config: ModalFuncProps): Update = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[Update]
  
  @scala.inline
  def modalGlobalConfig(param0: RootPrefixCls): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("modalGlobalConfig")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def withConfirm(props: ModalFuncProps): ModalFuncProps = ^.asInstanceOf[js.Dynamic].applyDynamic("withConfirm")(props.asInstanceOf[js.Any]).asInstanceOf[ModalFuncProps]
  
  @scala.inline
  def withError(props: ModalFuncProps): ModalFuncProps = ^.asInstanceOf[js.Dynamic].applyDynamic("withError")(props.asInstanceOf[js.Any]).asInstanceOf[ModalFuncProps]
  
  @scala.inline
  def withInfo(props: ModalFuncProps): ModalFuncProps = ^.asInstanceOf[js.Dynamic].applyDynamic("withInfo")(props.asInstanceOf[js.Any]).asInstanceOf[ModalFuncProps]
  
  @scala.inline
  def withSuccess(props: ModalFuncProps): ModalFuncProps = ^.asInstanceOf[js.Dynamic].applyDynamic("withSuccess")(props.asInstanceOf[js.Any]).asInstanceOf[ModalFuncProps]
  
  @scala.inline
  def withWarn(props: ModalFuncProps): ModalFuncProps = ^.asInstanceOf[js.Dynamic].applyDynamic("withWarn")(props.asInstanceOf[js.Any]).asInstanceOf[ModalFuncProps]
  
  type ConfigUpdate = ModalFuncProps | (js.Function1[/* prevConfig */ ModalFuncProps, ModalFuncProps])
  
  type ModalFunc = js.Function1[/* props */ ModalFuncProps, Destroy]
  
  type ModalStaticFunctions = Record[
    NonNullable[js.UndefOr[info | success | error | warn | warning | confirm]], 
    ModalFunc
  ]
}
