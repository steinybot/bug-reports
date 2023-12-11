package web.typings.rcCascader

import web.typings.rcCascader.anon.DisplayName
import web.typings.rcCascader.anon.Ref
import web.typings.rcCascader.esCascaderMod.CascaderProps
import web.typings.rcCascader.esCascaderMod.DefaultOptionType
import web.typings.rcCascader.esPanelMod.PanelProps
import web.typings.react.mod.JSX.Element
import web.typings.react.mod.PropsWithChildren
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-cascader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-cascader", JSImport.Default)
  @js.native
  val default: (js.Function1[
    /* props */ PropsWithChildren[CascaderProps[DefaultOptionType]] with Ref, 
    ReactElement
  ]) with DisplayName = js.native
  
  @scala.inline
  def Panel(props: PanelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Panel")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
