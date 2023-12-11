package web.typings.antd

import web.typings.react.mod.HTMLAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLLIElement
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMenuMenuDividerMod extends Shortcut {
  
  @JSImport("antd/es/menu/MenuDivider", JSImport.Default)
  @js.native
  val default: ReactComponentClass[MenuDividerProps] = js.native
  
  @js.native
  trait MenuDividerProps
    extends StObject
       with HTMLAttributes[HTMLLIElement] {
    
    var dashed: js.UndefOr[Boolean] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
  }
  object MenuDividerProps {
    
    @scala.inline
    def apply(): MenuDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuDividerProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MenuDividerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDashed(value: Boolean): Self = StObject.set(x, "dashed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashedUndefined: Self = StObject.set(x, "dashed", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[MenuDividerProps]
  
  /* This means you don't have to write `default`, but can instead just say `esMenuMenuDividerMod.foo` */
  override def _to: ReactComponentClass[MenuDividerProps] = default
}
