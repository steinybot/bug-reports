package web.typings.antd

import web.typings.antd.esConfigProviderSizeContextMod.SizeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esConfigProviderHooksUseSizeMod {
  
  @JSImport("antd/es/config-provider/hooks/useSize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[T]
  @scala.inline
  def default[T](customSize: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(customSize.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def default[T](customSize: js.Function1[/* ctxSize */ SizeType, T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(customSize.asInstanceOf[js.Any]).asInstanceOf[T]
}
