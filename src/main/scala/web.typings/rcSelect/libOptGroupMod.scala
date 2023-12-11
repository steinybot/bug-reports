package web.typings.rcSelect

import web.typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOptGroupMod extends Shortcut {
  
  /** This is a placeholder, not real render in dom */
  @JSImport("rc-select/lib/OptGroup", JSImport.Default)
  @js.native
  val default: OptionGroupFC = js.native
  
  /* Inlined parent std.Omit<rc-select.rc-select/lib/Select.DefaultOptionType, 'options'> */
  @js.native
  trait OptGroupProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var label: ReactElement = js.native
    
    var value: js.UndefOr[String | Double | Null] = js.native
  }
  object OptGroupProps {
    
    @scala.inline
    def apply(label: ReactElement): OptGroupProps = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptGroupProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: OptGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait OptionGroupFC
    extends StObject
       with FunctionComponent[OptGroupProps] {
    
    /** Legacy for check if is a Option Group */
    var isSelectOptGroup: Boolean = js.native
  }
  
  type _To = OptionGroupFC
  
  /* This means you don't have to write `default`, but can instead just say `libOptGroupMod.foo` */
  override def _to: OptionGroupFC = default
}
