package web.typings.antd

import web.typings.react.mod.HTMLAttributes
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilTransButtonMod extends Shortcut {
  
  @JSImport("antd/es/_util/transButton", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TransButtonProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait TransButtonProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var noStyle: js.UndefOr[Boolean] = js.native
    
    @JSName("onClick")
    var onClick_TransButtonProps: js.UndefOr[js.Function1[/* e */ js.UndefOr[SyntheticMouseEvent[HTMLDivElement]], Unit]] = js.native
  }
  object TransButtonProps {
    
    @scala.inline
    def apply(): TransButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransButtonProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TransButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setNoStyle(value: Boolean): Self = StObject.set(x, "noStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoStyleUndefined: Self = StObject.set(x, "noStyle", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* e */ js.UndefOr[SyntheticMouseEvent[HTMLDivElement]] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TransButtonProps with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esUtilTransButtonMod.foo` */
  override def _to: ReactComponentClass[TransButtonProps with RefAttributes[HTMLDivElement]] = default
}
