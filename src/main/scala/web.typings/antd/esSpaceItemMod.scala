package web.typings.antd

import web.typings.react.mod.CSSProperties
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSpaceItemMod extends Shortcut {
  
  @JSImport("antd/es/space/Item", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ItemProps] = js.native
  
  @js.native
  trait ItemProps extends StObject {
    
    var children: ReactElement = js.native
    
    var className: String = js.native
    
    var index: Double = js.native
    
    var split: js.UndefOr[ReactElement] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object ItemProps {
    
    @scala.inline
    def apply(children: ReactElement, className: String, index: Double): ItemProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplit(value: ReactElement): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ItemProps]
  
  /* This means you don't have to write `default`, but can instead just say `esSpaceItemMod.foo` */
  override def _to: ReactComponentClass[ItemProps] = default
}
