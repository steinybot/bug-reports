package web.typings.rcMentions

import web.typings.rcMentions.esMentionsMod.DataDrivenOptionProps
import web.typings.react.mod.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDropdownMenuMod {
  
  @JSImport("rc-mentions/es/DropdownMenu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * We only use Menu to display the candidate.
    * The focus is controlled by textarea to make accessibility easy.
    */
  @scala.inline
  def default(props: DropdownMenuProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait DropdownMenuProps extends StObject {
    
    var options: js.Array[DataDrivenOptionProps] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
  }
  object DropdownMenuProps {
    
    @scala.inline
    def apply(options: js.Array[DataDrivenOptionProps]): DropdownMenuProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownMenuProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DropdownMenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: js.Array[DataDrivenOptionProps]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: DataDrivenOptionProps*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
}
