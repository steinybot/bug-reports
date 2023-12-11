package web.typings.rcSelect

import web.typings.rcSelect.anon.Children
import web.typings.rcSelect.libBaseSelectMod.BaseSelectProps
import web.typings.rcSelect.libBaseSelectMod.BaseSelectRef
import web.typings.rcSelect.libHooksUseBasePropsMod.BaseSelectContextProps
import web.typings.rcSelect.libOptGroupMod.OptionGroupFC
import web.typings.rcSelect.libOptionMod.OptionFC
import web.typings.rcSelect.libSelectMod.DefaultOptionType
import web.typings.rcSelect.libSelectMod.SelectProps
import web.typings.react.mod.RefAttributes
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-select", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-select", JSImport.Default)
  @js.native
  val default: (js.Function1[/* props */ Children with (SelectProps[Any, DefaultOptionType]), ReactElement]) with web.typings.rcSelect.anon.OptGroup = js.native
  
  @JSImport("rc-select", "BaseSelect")
  @js.native
  val BaseSelect: ReactComponentClass[BaseSelectProps with RefAttributes[BaseSelectRef]] = js.native
  
  /** This is a placeholder, not real render in dom */
  @JSImport("rc-select", "OptGroup")
  @js.native
  val OptGroup: OptionGroupFC = js.native
  
  /** This is a placeholder, not real render in dom */
  @JSImport("rc-select", "Option")
  @js.native
  val Option: OptionFC = js.native
  
  @scala.inline
  def useBaseProps(): BaseSelectContextProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useBaseProps")().asInstanceOf[BaseSelectContextProps]
}
