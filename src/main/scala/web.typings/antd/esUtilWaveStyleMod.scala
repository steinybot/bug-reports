package web.typings.antd

import web.typings.antd.antdStrings.Wave
import web.typings.antd.esThemeInterfaceMod.UseComponentStyleResult
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.FullToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilWaveStyleMod {
  
  @JSImport("antd/es/_util/wave/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): UseComponentStyleResult = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[UseComponentStyleResult]
  
  @js.native
  trait ComponentToken extends StObject
  
  type WaveToken = FullToken[Wave]
}
