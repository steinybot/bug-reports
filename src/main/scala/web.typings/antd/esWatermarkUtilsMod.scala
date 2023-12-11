package web.typings.antd

import web.typings.react.mod.CSSProperties
import org.scalajs.dom.MutationRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esWatermarkUtilsMod {
  
  @JSImport("antd/es/watermark/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getPixelRatio(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getPixelRatio")().asInstanceOf[Double]
  
  @scala.inline
  def getStyleStr(style: CSSProperties): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyleStr")(style.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def reRendering(mutation: MutationRecord, isWatermarkEle: js.Function1[/* ele */ Any, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("reRendering")(mutation.asInstanceOf[js.Any], isWatermarkEle.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def toLowercaseSeparator(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLowercaseSeparator")(key.asInstanceOf[js.Any]).asInstanceOf[String]
}
