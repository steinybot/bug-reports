package web.typings.antd

import web.typings.antd.esInputInputMod.InputProps
import web.typings.rcInput.esInterfaceMod.InputRef
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInputPasswordMod extends Shortcut {
  
  @JSImport("antd/es/input/Password", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PasswordProps with RefAttributes[InputRef]] = js.native
  
  @js.native
  trait PasswordProps
    extends StObject
       with InputProps {
    
    val action: js.UndefOr[String] = js.native
    
    var iconRender: js.UndefOr[js.Function1[/* visible */ Boolean, ReactElement]] = js.native
    
    val inputPrefixCls: js.UndefOr[String] = js.native
    
    var visibilityToggle: js.UndefOr[Boolean | VisibilityToggle] = js.native
  }
  object PasswordProps {
    
    @scala.inline
    def apply(): PasswordProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PasswordProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PasswordProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setIconRender(value: /* visible */ Boolean => ReactElement): Self = StObject.set(x, "iconRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIconRenderUndefined: Self = StObject.set(x, "iconRender", js.undefined)
      
      @scala.inline
      def setInputPrefixCls(value: String): Self = StObject.set(x, "inputPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPrefixClsUndefined: Self = StObject.set(x, "inputPrefixCls", js.undefined)
      
      @scala.inline
      def setVisibilityToggle(value: Boolean | VisibilityToggle): Self = StObject.set(x, "visibilityToggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilityToggleUndefined: Self = StObject.set(x, "visibilityToggle", js.undefined)
    }
  }
  
  @js.native
  trait VisibilityToggle extends StObject {
    
    var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
  }
  object VisibilityToggle {
    
    @scala.inline
    def apply(): VisibilityToggle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VisibilityToggle]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: VisibilityToggle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PasswordProps with RefAttributes[InputRef]]
  
  /* This means you don't have to write `default`, but can instead just say `esInputPasswordMod.foo` */
  override def _to: ReactComponentClass[PasswordProps with RefAttributes[InputRef]] = default
}
