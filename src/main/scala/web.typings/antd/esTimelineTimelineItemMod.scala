package web.typings.antd

import web.typings.antd.esUtilTypeMod.LiteralUnion
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.Key
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTimelineTimelineItemMod extends Shortcut {
  
  @JSImport("antd/es/timeline/TimelineItem", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TimelineItemProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.blue
    - `web.typings`.antd.antdStrings.red
    - `web.typings`.antd.antdStrings.green
    - `web.typings`.antd.antdStrings.gray
  */
  trait Color extends StObject
  object Color {
    
    @scala.inline
    def blue: web.typings.antd.antdStrings.blue = "blue".asInstanceOf[web.typings.antd.antdStrings.blue]
    
    @scala.inline
    def gray: web.typings.antd.antdStrings.gray = "gray".asInstanceOf[web.typings.antd.antdStrings.gray]
    
    @scala.inline
    def green: web.typings.antd.antdStrings.green = "green".asInstanceOf[web.typings.antd.antdStrings.green]
    
    @scala.inline
    def red: web.typings.antd.antdStrings.red = "red".asInstanceOf[web.typings.antd.antdStrings.red]
  }
  
  @js.native
  trait TimeLineItemProps_
    extends StObject
       with TimelineItemProps {
    
    var __deprecated_do_not_use_it__ : js.UndefOr[Any] = js.native
  }
  object TimeLineItemProps_ {
    
    @scala.inline
    def apply(): TimeLineItemProps_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeLineItemProps_]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TimeLineItemProps_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set__deprecated_do_not_use_it__(value: Any): Self = StObject.set(x, "__deprecated_do_not_use_it__", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__deprecated_do_not_use_it__Undefined: Self = StObject.set(x, "__deprecated_do_not_use_it__", js.undefined)
    }
  }
  
  @js.native
  trait TimelineItemProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[LiteralUnion[Color]] = js.native
    
    var dot: js.UndefOr[ReactElement] = js.native
    
    var key: js.UndefOr[Key] = js.native
    
    var label: js.UndefOr[ReactElement] = js.native
    
    var pending: js.UndefOr[Boolean] = js.native
    
    var position: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object TimelineItemProps {
    
    @scala.inline
    def apply(): TimelineItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimelineItemProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TimelineItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: LiteralUnion[Color]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDot(value: ReactElement): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TimelineItemProps]
  
  /* This means you don't have to write `default`, but can instead just say `esTimelineTimelineItemMod.foo` */
  override def _to: ReactComponentClass[TimelineItemProps] = default
}
