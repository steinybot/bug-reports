package web.typings.rcUtil

import web.typings.rcUtil.anon.Height
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esGetScrollBarSizeMod {
  
  @JSImport("rc-util/es/getScrollBarSize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Double]
  @scala.inline
  def default(fresh: Boolean): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fresh.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getTargetScrollBarSize(target: HTMLElement): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("getTargetScrollBarSize")(target.asInstanceOf[js.Any]).asInstanceOf[Height]
}
