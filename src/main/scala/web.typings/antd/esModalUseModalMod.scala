package web.typings.antd

import web.typings.antd.anon.Then
import web.typings.antd.antdStrings.warn
import web.typings.antd.esModalConfirmMod.ModalFunc
import web.typings.std.Omit
import web.typings.std.Parameters
import web.typings.std.Record
import web.typings.std.ReturnType
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esModalUseModalMod {
  
  @JSImport("antd/es/modal/useModal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): js.Tuple2[/* instance */ HookAPI, /* contextHolder */ ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Tuple2[/* instance */ HookAPI, /* contextHolder */ ReactElement]]
  
  type HookAPI = Omit[
    Record[
      /* keyof antd.antd/es/modal/confirm.ModalStaticFunctions */ String, 
      ModalFuncWithPromise
    ], 
    warn
  ]
  
  type ModalFuncWithPromise = js.Function1[/* args */ Parameters[ModalFunc], ReturnType[ModalFunc] with Then]
}
