package web.typings.rcDrawer

import web.typings.rcDrawer.esDrawerMod.DrawerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilMod {
  
  @JSImport("rc-drawer/es/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parseWidthHeight(): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseWidthHeight")().asInstanceOf[String | Double]
  @scala.inline
  def parseWidthHeight(value: String): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseWidthHeight")(value.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  @scala.inline
  def parseWidthHeight(value: Double): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseWidthHeight")(value.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  
  @scala.inline
  def warnCheck(props: DrawerProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warnCheck")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
