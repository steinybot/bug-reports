package web.typings.antd

import web.typings.antd.antdBooleans.`true`
import web.typings.antd.esButtonButtonMod.ButtonProps
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLButtonElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esModalComponentsNormalCancelBtnMod extends Shortcut {
  
  @JSImport("antd/es/modal/components/NormalCancelBtn", JSImport.Default)
  @js.native
  val default: ReactComponentClass[js.Object] = js.native
  
  /* Inlined parent std.Pick<antd.antd/es/modal/interface.ModalProps, 'cancelButtonProps' | 'onCancel'> */
  @js.native
  trait NormalCancelBtnProps extends StObject {
    
    var cancelButtonProps: js.UndefOr[ButtonProps] = js.native
    
    var cancelTextLocale: js.UndefOr[String | Double | `true` | ReactElement | js.Iterable[ReactElement]] = js.native
    
    var onCancel: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLButtonElement], Unit]] = js.native
  }
  object NormalCancelBtnProps {
    
    @scala.inline
    def apply(): NormalCancelBtnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NormalCancelBtnProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: NormalCancelBtnProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelButtonProps(value: ButtonProps): Self = StObject.set(x, "cancelButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelButtonPropsUndefined: Self = StObject.set(x, "cancelButtonProps", js.undefined)
      
      @scala.inline
      def setCancelTextLocale(value: String | Double | `true` | ReactElement | js.Iterable[ReactElement]): Self = StObject.set(x, "cancelTextLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelTextLocaleReactElement(value: ReactElement): Self = StObject.set(x, "cancelTextLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelTextLocaleUndefined: Self = StObject.set(x, "cancelTextLocale", js.undefined)
      
      @scala.inline
      def setOnCancel(value: /* e */ SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `esModalComponentsNormalCancelBtnMod.foo` */
  override def _to: ReactComponentClass[js.Object] = default
}
