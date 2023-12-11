package web.typings.rcVirtualList

import web.typings.rcVirtualList.anon.Children
import web.typings.rcVirtualList.esListMod.ListProps
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMockMod {
  
  @JSImport("rc-virtual-list/es/mock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[Item](props: Children with ListProps[Item]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
}
