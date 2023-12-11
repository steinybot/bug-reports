package web.typings.antd.anon

import web.typings.antd.antdStrings.alternate
import web.typings.antd.antdStrings.left
import web.typings.antd.antdStrings.right
import web.typings.antd.esTimelineTimelineItemMod.TimelineItemProps
import web.typings.react.mod.CSSProperties
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined antd.antd/es/timeline/Timeline.TimelineProps & {  hashId :string,   direction :string | undefined} */
@js.native
trait TimelinePropshashIdstring extends StObject {
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var direction: js.UndefOr[String] = js.native
  
  var hashId: String = js.native
  
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
object TimelinePropshashIdstring {
  
  @scala.inline
  def apply(hashId: String): TimelinePropshashIdstring = {
    val __obj = js.Dynamic.literal(hashId = hashId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelinePropshashIdstring]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: TimelinePropshashIdstring] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setHashId(value: String): Self = StObject.set(x, "hashId", value.asInstanceOf[js.Any])
    
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
