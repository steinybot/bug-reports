package web.typings.antd

import web.typings.antd.anon.FontFamily
import web.typings.std.NonNullable
import web.typings.std.Required
import org.scalajs.dom.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esWatermarkUseClipsMod {
  
  @JSImport("antd/es/watermark/useClips", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): js.Function8[
    /* content */ (NonNullable[js.UndefOr[String | js.Array[String]]]) | HTMLImageElement, 
    /* rotate */ Double, 
    /* ratio */ Double, 
    /* width */ Double, 
    /* height */ Double, 
    /* font */ Required[NonNullable[js.UndefOr[FontFamily]]], 
    /* gapX */ Double, 
    /* gapY */ Double, 
    js.Tuple3[/* dataURL */ String, /* finalWidth */ Double, /* finalHeight */ Double]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function8[
    /* content */ (NonNullable[js.UndefOr[String | js.Array[String]]]) | HTMLImageElement, 
    /* rotate */ Double, 
    /* ratio */ Double, 
    /* width */ Double, 
    /* height */ Double, 
    /* font */ Required[NonNullable[js.UndefOr[FontFamily]]], 
    /* gapX */ Double, 
    /* gapY */ Double, 
    js.Tuple3[/* dataURL */ String, /* finalWidth */ Double, /* finalHeight */ Double]
  ]]
  
  @JSImport("antd/es/watermark/useClips", "FontGap")
  @js.native
  val FontGap: /* 3 */ Double = js.native
}
