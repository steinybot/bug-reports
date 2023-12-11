package web.typings.antd

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTypographyBaseEllipsisMod extends Shortcut {
  
  @JSImport("antd/es/typography/Base/Ellipsis", JSImport.Default)
  @js.native
  val default: ReactComponentClass[EllipsisProps] = js.native
  
  @js.native
  trait EllipsisProps extends StObject {
    
    def children(cutChildren: js.Array[ReactElement], needEllipsis: Boolean): ReactElement = js.native
    
    var enabledMeasure: js.UndefOr[Boolean] = js.native
    
    var fontSize: Double = js.native
    
    def onEllipsis(isEllipsis: Boolean): Unit = js.native
    
    var rows: Double = js.native
    
    var text: js.UndefOr[ReactElement] = js.native
    
    var width: Double = js.native
  }
  object EllipsisProps {
    
    @scala.inline
    def apply(
      children: (js.Array[ReactElement], Boolean) => ReactElement,
      fontSize: Double,
      onEllipsis: Boolean => Unit,
      rows: Double,
      width: Double
    ): EllipsisProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), fontSize = fontSize.asInstanceOf[js.Any], onEllipsis = js.Any.fromFunction1(onEllipsis), rows = rows.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[EllipsisProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: EllipsisProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: (js.Array[ReactElement], Boolean) => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEnabledMeasure(value: Boolean): Self = StObject.set(x, "enabledMeasure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledMeasureUndefined: Self = StObject.set(x, "enabledMeasure", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEllipsis(value: Boolean => Unit): Self = StObject.set(x, "onEllipsis", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: ReactElement): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[EllipsisProps]
  
  /* This means you don't have to write `default`, but can instead just say `esTypographyBaseEllipsisMod.foo` */
  override def _to: ReactComponentClass[EllipsisProps] = default
}
