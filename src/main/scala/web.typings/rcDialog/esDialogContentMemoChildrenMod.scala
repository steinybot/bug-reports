package web.typings.rcDialog

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDialogContentMemoChildrenMod extends Shortcut {
  
  @JSImport("rc-dialog/es/Dialog/Content/MemoChildren", JSImport.Default)
  @js.native
  val default: ReactComponentClass[js.Function1[/* param0 */ MemoChildrenProps, ReactElement]] = js.native
  
  @js.native
  trait MemoChildrenProps extends StObject {
    
    var children: ReactElement = js.native
    
    var shouldUpdate: Boolean = js.native
  }
  object MemoChildrenProps {
    
    @scala.inline
    def apply(children: ReactElement, shouldUpdate: Boolean): MemoChildrenProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], shouldUpdate = shouldUpdate.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemoChildrenProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MemoChildrenProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldUpdate(value: Boolean): Self = StObject.set(x, "shouldUpdate", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[js.Function1[/* param0 */ MemoChildrenProps, ReactElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esDialogContentMemoChildrenMod.foo` */
  override def _to: ReactComponentClass[js.Function1[/* param0 */ MemoChildrenProps, ReactElement]] = default
}
