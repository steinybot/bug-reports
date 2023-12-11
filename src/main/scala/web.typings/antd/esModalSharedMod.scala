package web.typings.antd

import web.typings.antd.anon.FooterPropsPickModalProps
import web.typings.react.mod.JSX.Element
import web.typings.react.mod.MouseEventHandler
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLButtonElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esModalSharedMod {
  
  @JSImport("antd/es/modal/shared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd/es/modal/shared", "Footer")
  @js.native
  val Footer: ReactComponentClass[FooterPropsPickModalProps] = js.native
  
  @scala.inline
  def renderCloseIcon(prefixCls: String): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("renderCloseIcon")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[Element]
  @scala.inline
  def renderCloseIcon(prefixCls: String, closeIcon: ReactElement): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("renderCloseIcon")(prefixCls.asInstanceOf[js.Any], closeIcon.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  @js.native
  trait FooterProps extends StObject {
    
    var onCancel: js.UndefOr[MouseEventHandler[HTMLButtonElement | HTMLAnchorElement]] = js.native
    
    var onOk: js.UndefOr[MouseEventHandler[HTMLButtonElement | HTMLAnchorElement]] = js.native
  }
  object FooterProps {
    
    @scala.inline
    def apply(): FooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FooterProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FooterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnCancel(value: SyntheticMouseEvent[HTMLButtonElement | HTMLAnchorElement] => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnOk(value: SyntheticMouseEvent[HTMLButtonElement | HTMLAnchorElement] => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
    }
  }
}
