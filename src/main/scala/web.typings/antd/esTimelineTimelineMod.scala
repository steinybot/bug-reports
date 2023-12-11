package web.typings.antd

import web.typings.antd.antdStrings.alternate
import web.typings.antd.antdStrings.left
import web.typings.antd.antdStrings.right
import web.typings.antd.esTimelineTimelineItemMod.TimelineItemProps
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTimelineTimelineMod extends Shortcut {
  
  @JSImport("antd/es/timeline/Timeline", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  @js.native
  trait CompoundedComponent
    extends StObject
       with FunctionComponent[TimelineProps] {
    
    var Item: ReactComponentClass[TimelineItemProps] = js.native
  }
  
  @js.native
  trait TimelineProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var items: js.UndefOr[js.Array[TimelineItemProps]] = js.native
    
    var mode: js.UndefOr[left | alternate | right] = js.native
    
    /** 指定最后一个幽灵节点是否存在或内容 */
    var pending: js.UndefOr[ReactElement] = js.native
    
    var pendingDot: js.UndefOr[ReactElement] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var reverse: js.UndefOr[Boolean] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object TimelineProps {
    
    @scala.inline
    def apply(): TimelineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimelineProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TimelineProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[TimelineItemProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: TimelineItemProps*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setMode(value: left | alternate | right): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setPending(value: ReactElement): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPendingDot(value: ReactElement): Self = StObject.set(x, "pendingDot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPendingDotUndefined: Self = StObject.set(x, "pendingDot", js.undefined)
      
      @scala.inline
      def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `esTimelineTimelineMod.foo` */
  override def _to: CompoundedComponent = default
}
