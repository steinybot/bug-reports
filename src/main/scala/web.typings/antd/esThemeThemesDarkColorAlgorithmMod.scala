package web.typings.antd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esThemeThemesDarkColorAlgorithmMod {
  
  @JSImport("antd/es/theme/themes/dark/colorAlgorithm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getAlphaColor(baseColor: String, alpha: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlphaColor")(baseColor.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getSolidColor(baseColor: String, brightness: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSolidColor")(baseColor.asInstanceOf[js.Any], brightness.asInstanceOf[js.Any])).asInstanceOf[String]
}
