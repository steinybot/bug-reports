package web.typings.antd

import web.typings.antd.anon.`6`
import web.typings.antd.esInputInputMod.InputProps
import web.typings.rcInput.esInterfaceMod.InputRef
import web.typings.react.mod.ChangeEvent
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInputSearchMod extends Shortcut {
  
  @JSImport("antd/es/input/Search", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SearchProps with RefAttributes[InputRef]] = js.native
  
  @js.native
  trait SearchProps
    extends StObject
       with InputProps {
    
    var enterButton: js.UndefOr[ReactElement] = js.native
    
    var inputPrefixCls: js.UndefOr[String] = js.native
    
    var loading: js.UndefOr[Boolean] = js.native
    
    var onSearch: js.UndefOr[
        js.Function3[
          /* value */ String, 
          /* event */ js.UndefOr[
            ChangeEvent[HTMLInputElement] | SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLInputElement]
          ], 
          /* info */ js.UndefOr[`6`], 
          Unit
        ]
      ] = js.native
  }
  object SearchProps {
    
    @scala.inline
    def apply(): SearchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SearchProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnterButton(value: ReactElement): Self = StObject.set(x, "enterButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterButtonUndefined: Self = StObject.set(x, "enterButton", js.undefined)
      
      @scala.inline
      def setInputPrefixCls(value: String): Self = StObject.set(x, "inputPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPrefixClsUndefined: Self = StObject.set(x, "inputPrefixCls", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setOnSearch(
        value: (/* value */ String, /* event */ js.UndefOr[
              ChangeEvent[HTMLInputElement] | SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLInputElement]
            ], /* info */ js.UndefOr[`6`]) => Unit
      ): Self = StObject.set(x, "onSearch", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SearchProps with RefAttributes[InputRef]]
  
  /* This means you don't have to write `default`, but can instead just say `esInputSearchMod.foo` */
  override def _to: ReactComponentClass[SearchProps with RefAttributes[InputRef]] = default
}
