package web.typings.antd

import web.typings.react.mod.CSSProperties
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esWatermarkUseWatermarkMod {
  
  @JSImport("antd/es/watermark/useWatermark", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(markStyle: CSSProperties): js.Tuple3[
    /* appendWatermark */ AppendWatermark, 
    /* removeWatermark */ js.Function1[/* container */ HTMLElement, Unit], 
    /* isWatermarkEle */ js.Function1[/* ele */ Node, Boolean]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(markStyle.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[
    /* appendWatermark */ AppendWatermark, 
    /* removeWatermark */ js.Function1[/* container */ HTMLElement, Unit], 
    /* isWatermarkEle */ js.Function1[/* ele */ Node, Boolean]
  ]]
  
  @JSImport("antd/es/watermark/useWatermark", "BaseSize")
  @js.native
  val BaseSize: /* 2 */ Double = js.native
  
  @JSImport("antd/es/watermark/useWatermark", "FontGap")
  @js.native
  val FontGap: /* 3 */ Double = js.native
  
  type AppendWatermark = js.Function3[/* base64Url */ String, /* markWidth */ Double, /* container */ HTMLElement, Unit]
}
