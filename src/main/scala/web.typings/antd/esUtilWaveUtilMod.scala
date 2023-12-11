package web.typings.antd

import web.typings.antd.antdStrings._empty
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilWaveUtilMod {
  
  @JSImport("antd/es/_util/wave/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getTargetWaveColor(node: HTMLElement): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getTargetWaveColor")(node.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  @scala.inline
  def isNotGrey(color: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotGrey")(color.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidWaveColor(color: String): Boolean | _empty = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidWaveColor")(color.asInstanceOf[js.Any]).asInstanceOf[Boolean | _empty]
}
