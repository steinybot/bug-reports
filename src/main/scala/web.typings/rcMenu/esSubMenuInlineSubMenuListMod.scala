package web.typings.rcMenu

import web.typings.react.mod.JSX.Element
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSubMenuInlineSubMenuListMod {
  
  @JSImport("rc-menu/es/SubMenu/InlineSubMenuList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(param0: InlineSubMenuListProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait InlineSubMenuListProps extends StObject {
    
    var children: ReactElement = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var keyPath: js.Array[String] = js.native
    
    var open: Boolean = js.native
  }
  object InlineSubMenuListProps {
    
    @scala.inline
    def apply(children: ReactElement, keyPath: js.Array[String], open: Boolean): InlineSubMenuListProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[InlineSubMenuListProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: InlineSubMenuListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setKeyPath(value: js.Array[String]): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPathVarargs(value: String*): Self = StObject.set(x, "keyPath", js.Array(value :_*))
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
}
