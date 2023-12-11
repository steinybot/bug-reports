package web.typings.antd

import web.typings.antd.anon.ClassName
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilWaveInterfaceMod {
  
  @JSImport("antd/es/_util/wave/interface", "TARGET_CLS")
  @js.native
  val TARGET_CLS: /* "ant-wave-target" */ String = js.native
  
  type ShowWave = js.Function1[/* event */ MouseEvent, Unit]
  
  type ShowWaveEffect = js.Function2[/* element */ HTMLElement, /* info */ ClassName, Unit]
}
