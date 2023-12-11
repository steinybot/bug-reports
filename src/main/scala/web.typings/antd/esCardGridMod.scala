package web.typings.antd

import web.typings.react.mod.HTMLAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esCardGridMod extends Shortcut {
  
  @JSImport("antd/es/card/Grid", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CardGridProps] = js.native
  
  @js.native
  trait CardGridProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var hoverable: js.UndefOr[Boolean] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
  }
  object CardGridProps {
    
    @scala.inline
    def apply(): CardGridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardGridProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CardGridProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHoverable(value: Boolean): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverableUndefined: Self = StObject.set(x, "hoverable", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[CardGridProps]
  
  /* This means you don't have to write `default`, but can instead just say `esCardGridMod.foo` */
  override def _to: ReactComponentClass[CardGridProps] = default
}
