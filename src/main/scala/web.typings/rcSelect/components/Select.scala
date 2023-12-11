package web.typings.rcSelect.components

import web.typings.rcSelect.anon.Children
import web.typings.rcSelect.libBaseSelectMod.BaseSelectRef
import web.typings.rcSelect.libOptGroupMod.OptGroupProps
import web.typings.rcSelect.libOptionMod.OptionProps
import web.typings.rcSelect.libSelectMod.DefaultOptionType
import web.typings.rcSelect.libSelectMod.SelectProps
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Select {
  
  object OptGroup {
    
    @scala.inline
    def apply(label: ReactElement): SharedBuilder_OptGroupProps_1412863601 = {
      val __props = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      new SharedBuilder_OptGroupProps_1412863601(js.Array(this.component, __props.asInstanceOf[OptGroupProps]))
    }
    
    @JSImport("rc-select/lib/Select", "default.OptGroup")
    @js.native
    val component: js.Object = js.native
    
    type Props = OptGroupProps
    
    def withProps(p: OptGroupProps): SharedBuilder_OptGroupProps_1412863601 = new SharedBuilder_OptGroupProps_1412863601(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Option {
    
    @JSImport("rc-select/lib/Select", "default.Option")
    @js.native
    val component: js.Object = js.native
    
    type Props = OptionProps
    
    implicit def make(companion: Option.type): SharedBuilder_OptionProps230298971 = new SharedBuilder_OptionProps230298971(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: OptionProps): SharedBuilder_OptionProps230298971 = new SharedBuilder_OptionProps230298971(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("rc-select/lib/Select", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = /* props */ Children with (SelectProps[Any, DefaultOptionType])
  
  implicit def make(companion: Select.type): SharedBuilder_ChildrenSelectProps_1914087428[BaseSelectRef] = new SharedBuilder_ChildrenSelectProps_1914087428[BaseSelectRef](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: /* props */ Children with (SelectProps[Any, DefaultOptionType])): SharedBuilder_ChildrenSelectProps_1914087428[BaseSelectRef] = new SharedBuilder_ChildrenSelectProps_1914087428[BaseSelectRef](js.Array(this.component, p.asInstanceOf[js.Any]))
}
