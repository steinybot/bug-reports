package web.typings.antd

import web.typings.antd.anon.ComponentName
import web.typings.antd.anon.ItemIcon
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSelectUseIconsMod {
  
  @JSImport("antd/es/select/useIcons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(param0: ComponentName): ItemIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[ItemIcon]
  
  type RenderNode = ReactElement | (js.Function1[/* props */ Any, ReactElement])
}
