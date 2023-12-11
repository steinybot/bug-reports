package web.typings.rcTree.components

import web.typings.StBuildingComponent
import web.typings.rcTree.esInterfaceMod.FlattenNode
import web.typings.rcTree.esInterfaceMod.Key
import web.typings.rcTree.esInterfaceMod.KeyEntities
import web.typings.rcTree.esNodeListMod.NodeListProps
import web.typings.rcTree.esNodeListMod.NodeListRef
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLDivElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NodeList {
  
  @scala.inline
  def apply(
    activeItem: FlattenNode[Any],
    checkedKeys: js.Array[Key],
    data: js.Array[FlattenNode[Any]],
    dragOverNodeKey: Key,
    dragging: Boolean,
    dropPosition: Double,
    expandedKeys: js.Array[Key],
    halfCheckedKeys: js.Array[Key],
    height: Double,
    itemHeight: Double,
    keyEntities: KeyEntities[Any],
    loadedKeys: js.Array[Key],
    loadingKeys: js.Array[Key],
    motion: Any,
    onActiveChange: Key => Unit,
    onListChangeEnd: () => Unit,
    onListChangeStart: () => Unit,
    prefixCls: String,
    selectedKeys: js.Array[Key],
    style: CSSProperties,
    tabIndex: Double
  ): Builder = {
    val __props = js.Dynamic.literal(activeItem = activeItem.asInstanceOf[js.Any], checkedKeys = checkedKeys.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dragOverNodeKey = dragOverNodeKey.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], itemHeight = itemHeight.asInstanceOf[js.Any], keyEntities = keyEntities.asInstanceOf[js.Any], loadedKeys = loadedKeys.asInstanceOf[js.Any], loadingKeys = loadingKeys.asInstanceOf[js.Any], motion = motion.asInstanceOf[js.Any], onActiveChange = js.Any.fromFunction1(onActiveChange), onListChangeEnd = js.Any.fromFunction0(onListChangeEnd), onListChangeStart = js.Any.fromFunction0(onListChangeStart), prefixCls = prefixCls.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[NodeListProps[Any] with RefAttributes[NodeListRef]]))
  }
  
  @JSImport("rc-tree/es/NodeList", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, NodeListRef] {
    
    @scala.inline
    def checkable(value: Boolean): this.type = set("checkable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focused(value: Boolean): this.type = set("focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDown(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def virtual(value: Boolean): this.type = set("virtual", value.asInstanceOf[js.Any])
  }
  
  type Props = NodeListProps[Any] with RefAttributes[NodeListRef]
  
  def withProps(p: NodeListProps[Any] with RefAttributes[NodeListRef]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
