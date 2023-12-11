package web.typings.rcSelect

import web.typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOptionMod extends Shortcut {
  
  /** This is a placeholder, not real render in dom */
  @JSImport("rc-select/lib/Option", JSImport.Default)
  @js.native
  val default: OptionFC = js.native
  
  @js.native
  trait OptionFC
    extends StObject
       with FunctionComponent[OptionProps] {
    
    /** Legacy for check if is a Option Group */
    var isSelectOption: Boolean = js.native
  }
  
  /* Inlined parent std.Omit<rc-select.rc-select/lib/Select.DefaultOptionType, 'label'> */
  @js.native
  trait OptionProps
    extends StObject
       with /* name */ StringDictionary[Any] {
    
    var children: ReactElement = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var value: js.UndefOr[String | Double | Null] = js.native
  }
  object OptionProps {
    
    @scala.inline
    def apply(children: ReactElement): OptionProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: OptionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = OptionFC
  
  /* This means you don't have to write `default`, but can instead just say `libOptionMod.foo` */
  override def _to: OptionFC = default
}
