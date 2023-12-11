package web.typings.antd

import web.typings.antd.anon.Checked
import web.typings.antd.anon.ShowLeafIcon
import web.typings.antd.antdBooleans.`false`
import web.typings.antd.antdStrings.check
import web.typings.antd.antdStrings.select_
import web.typings.rcTree.anon.Direction
import web.typings.rcTree.anon.DragNode
import web.typings.rcTree.anon.Event
import web.typings.rcTree.anon.EventMouseEvent
import web.typings.rcTree.anon.EventNode
import web.typings.rcTree.anon.Expanded
import web.typings.rcTree.anon.ExpandedKeys
import web.typings.rcTree.esContextTypesMod.NodeDragEventParams
import web.typings.rcTree.esContextTypesMod.NodeMouseEventHandler
import web.typings.rcTree.esContextTypesMod.NodeMouseEventParams
import web.typings.rcTree.esInterfaceMod.BasicDataNode
import web.typings.rcTree.esInterfaceMod.DataNode
import web.typings.rcTree.esInterfaceMod.EventDataNode
import web.typings.rcTree.esInterfaceMod.FieldNames
import web.typings.rcTree.esInterfaceMod.IconType
import web.typings.rcTree.esInterfaceMod.Key
import web.typings.rcTree.esInterfaceMod.TreeNodeProps
import web.typings.rcTree.esTreeMod.AllowDrop
import web.typings.rcTree.esTreeMod.AllowDropOptions
import web.typings.rcTree.esTreeMod.CheckInfo
import web.typings.rcTree.esTreeMod.ExpandAction
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.DragEvent
import web.typings.react.mod.FocusEventHandler
import web.typings.react.mod.KeyboardEventHandler
import web.typings.react.mod.MouseEventHandler
import web.typings.react.mod.RefAttributes
import web.typings.react.mod.UIEventHandler
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLSpanElement
import org.scalajs.dom.MouseEvent
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticUIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTreeTreeMod extends Shortcut {
  
  @JSImport("antd/es/tree/Tree", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TreeProps[DataNode] with RefAttributes[web.typings.rcTree.mod.default[DataNode]]] = js.native
  
  type AntTreeNode = ReactComponentClass[AntTreeNodeProps]
  
  @js.native
  trait AntTreeNodeBaseEvent extends StObject {
    
    var nativeEvent: MouseEvent = js.native
    
    var node: ReactComponentClass[AntTreeNodeProps] = js.native
  }
  object AntTreeNodeBaseEvent {
    
    @scala.inline
    def apply(nativeEvent: MouseEvent, node: ReactComponentClass[AntTreeNodeProps]): AntTreeNodeBaseEvent = {
      val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntTreeNodeBaseEvent]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AntTreeNodeBaseEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNativeEvent(value: MouseEvent): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: ReactComponentClass[AntTreeNodeProps]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AntTreeNodeCheckedEvent
    extends StObject
       with AntTreeNodeBaseEvent {
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var checkedNodes: js.UndefOr[js.Array[ReactComponentClass[AntTreeNodeProps]]] = js.native
    
    var event: check = js.native
  }
  object AntTreeNodeCheckedEvent {
    
    @scala.inline
    def apply(nativeEvent: MouseEvent, node: ReactComponentClass[AntTreeNodeProps]): AntTreeNodeCheckedEvent = {
      val __obj = js.Dynamic.literal(event = "check", nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntTreeNodeCheckedEvent]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AntTreeNodeCheckedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedNodes(value: js.Array[ReactComponentClass[AntTreeNodeProps]]): Self = StObject.set(x, "checkedNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedNodesUndefined: Self = StObject.set(x, "checkedNodes", js.undefined)
      
      @scala.inline
      def setCheckedNodesVarargs(value: ReactComponentClass[AntTreeNodeProps]*): Self = StObject.set(x, "checkedNodes", js.Array(value :_*))
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setEvent(value: check): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AntTreeNodeDragEnterEvent
    extends StObject
       with AntTreeNodeMouseEvent {
    
    var expandedKeys: js.Array[Key] = js.native
  }
  object AntTreeNodeDragEnterEvent {
    
    @scala.inline
    def apply(
      event: DragEvent[HTMLElement],
      expandedKeys: js.Array[Key],
      node: ReactComponentClass[AntTreeNodeProps]
    ): AntTreeNodeDragEnterEvent = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntTreeNodeDragEnterEvent]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AntTreeNodeDragEnterEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "expandedKeys", js.Array(value :_*))
    }
  }
  
  @js.native
  trait AntTreeNodeDropEvent extends StObject {
    
    var dragNode: ReactComponentClass[AntTreeNodeProps] = js.native
    
    var dragNodesKeys: js.Array[Key] = js.native
    
    var dropPosition: Double = js.native
    
    var dropToGap: js.UndefOr[Boolean] = js.native
    
    var event: SyntheticMouseEvent[HTMLElement] = js.native
    
    var node: ReactComponentClass[AntTreeNodeProps] = js.native
  }
  object AntTreeNodeDropEvent {
    
    @scala.inline
    def apply(
      dragNode: ReactComponentClass[AntTreeNodeProps],
      dragNodesKeys: js.Array[Key],
      dropPosition: Double,
      event: SyntheticMouseEvent[HTMLElement],
      node: ReactComponentClass[AntTreeNodeProps]
    ): AntTreeNodeDropEvent = {
      val __obj = js.Dynamic.literal(dragNode = dragNode.asInstanceOf[js.Any], dragNodesKeys = dragNodesKeys.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntTreeNodeDropEvent]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AntTreeNodeDropEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDragNode(value: ReactComponentClass[AntTreeNodeProps]): Self = StObject.set(x, "dragNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragNodesKeys(value: js.Array[Key]): Self = StObject.set(x, "dragNodesKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragNodesKeysVarargs(value: Key*): Self = StObject.set(x, "dragNodesKeys", js.Array(value :_*))
      
      @scala.inline
      def setDropPosition(value: Double): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropToGap(value: Boolean): Self = StObject.set(x, "dropToGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropToGapUndefined: Self = StObject.set(x, "dropToGap", js.undefined)
      
      @scala.inline
      def setEvent(value: SyntheticMouseEvent[HTMLElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: ReactComponentClass[AntTreeNodeProps]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AntTreeNodeExpandedEvent
    extends StObject
       with AntTreeNodeBaseEvent {
    
    var expanded: js.UndefOr[Boolean] = js.native
  }
  object AntTreeNodeExpandedEvent {
    
    @scala.inline
    def apply(nativeEvent: MouseEvent, node: ReactComponentClass[AntTreeNodeProps]): AntTreeNodeExpandedEvent = {
      val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntTreeNodeExpandedEvent]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AntTreeNodeExpandedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    }
  }
  
  @js.native
  trait AntTreeNodeMouseEvent extends StObject {
    
    var event: DragEvent[HTMLElement] = js.native
    
    var node: ReactComponentClass[AntTreeNodeProps] = js.native
  }
  object AntTreeNodeMouseEvent {
    
    @scala.inline
    def apply(event: DragEvent[HTMLElement], node: ReactComponentClass[AntTreeNodeProps]): AntTreeNodeMouseEvent = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntTreeNodeMouseEvent]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AntTreeNodeMouseEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: DragEvent[HTMLElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: ReactComponentClass[AntTreeNodeProps]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AntTreeNodeProps
    extends StObject
       with /* name */ StringDictionary[Any] {
    
    var checkable: js.UndefOr[Boolean] = js.native
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var disableCheckbox: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var eventKey: js.UndefOr[String] = js.native
    
    var expanded: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[
        (js.Function1[/* treeNode */ AntdTreeNodeAttribute, ReactElement]) | ReactElement
      ] = js.native
    
    var isLeaf: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[Key] = js.native
    
    var loading: js.UndefOr[Boolean] = js.native
    
    var selectable: js.UndefOr[Boolean] = js.native
    
    var selected: js.UndefOr[Boolean] = js.native
    
    var title: js.UndefOr[String | ReactElement] = js.native
  }
  object AntTreeNodeProps {
    
    @scala.inline
    def apply(): AntTreeNodeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AntTreeNodeProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AntTreeNodeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisableCheckbox(value: Boolean): Self = StObject.set(x, "disableCheckbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCheckboxUndefined: Self = StObject.set(x, "disableCheckbox", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEventKey(value: String): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      @scala.inline
      def setIcon(value: (js.Function1[/* treeNode */ AntdTreeNodeAttribute, ReactElement]) | ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFunction1(value: /* treeNode */ AntdTreeNodeAttribute => ReactElement): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLeafUndefined: Self = StObject.set(x, "isLeaf", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setTitle(value: String | ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait AntTreeNodeSelectedEvent
    extends StObject
       with AntTreeNodeBaseEvent {
    
    var event: select_ = js.native
    
    var selected: js.UndefOr[Boolean] = js.native
    
    var selectedNodes: js.UndefOr[js.Array[DataNode]] = js.native
  }
  object AntTreeNodeSelectedEvent {
    
    @scala.inline
    def apply(nativeEvent: MouseEvent, node: ReactComponentClass[AntTreeNodeProps]): AntTreeNodeSelectedEvent = {
      val __obj = js.Dynamic.literal(event = "select", nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntTreeNodeSelectedEvent]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AntTreeNodeSelectedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: select_): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedNodes(value: js.Array[DataNode]): Self = StObject.set(x, "selectedNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedNodesUndefined: Self = StObject.set(x, "selectedNodes", js.undefined)
      
      @scala.inline
      def setSelectedNodesVarargs(value: DataNode*): Self = StObject.set(x, "selectedNodes", js.Array(value :_*))
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
  
  @js.native
  trait AntdTreeNodeAttribute extends StObject {
    
    var checked: Boolean = js.native
    
    var children: ReactElement = js.native
    
    var className: String = js.native
    
    var disableCheckbox: Boolean = js.native
    
    var disabled: Boolean = js.native
    
    var dragOver: Boolean = js.native
    
    var dragOverGapBottom: Boolean = js.native
    
    var dragOverGapTop: Boolean = js.native
    
    var eventKey: String = js.native
    
    var expanded: Boolean = js.native
    
    var halfChecked: Boolean = js.native
    
    var isLeaf: Boolean = js.native
    
    var pos: String = js.native
    
    var prefixCls: String = js.native
    
    var selectable: Boolean = js.native
    
    var selected: Boolean = js.native
    
    var title: ReactElement = js.native
  }
  object AntdTreeNodeAttribute {
    
    @scala.inline
    def apply(
      checked: Boolean,
      children: ReactElement,
      className: String,
      disableCheckbox: Boolean,
      disabled: Boolean,
      dragOver: Boolean,
      dragOverGapBottom: Boolean,
      dragOverGapTop: Boolean,
      eventKey: String,
      expanded: Boolean,
      halfChecked: Boolean,
      isLeaf: Boolean,
      pos: String,
      prefixCls: String,
      selectable: Boolean,
      selected: Boolean,
      title: ReactElement
    ): AntdTreeNodeAttribute = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], disableCheckbox = disableCheckbox.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], dragOver = dragOver.asInstanceOf[js.Any], dragOverGapBottom = dragOverGapBottom.asInstanceOf[js.Any], dragOverGapTop = dragOverGapTop.asInstanceOf[js.Any], eventKey = eventKey.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], halfChecked = halfChecked.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntdTreeNodeAttribute]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AntdTreeNodeAttribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCheckbox(value: Boolean): Self = StObject.set(x, "disableCheckbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragOver(value: Boolean): Self = StObject.set(x, "dragOver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragOverGapBottom(value: Boolean): Self = StObject.set(x, "dragOverGapBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragOverGapTop(value: Boolean): Self = StObject.set(x, "dragOverGapTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventKey(value: String): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfChecked(value: Boolean): Self = StObject.set(x, "halfChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DraggableConfig extends StObject {
    
    var icon: js.UndefOr[ReactElement | `false`] = js.native
    
    var nodeDraggable: js.UndefOr[DraggableFn] = js.native
  }
  object DraggableConfig {
    
    @scala.inline
    def apply(): DraggableConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DraggableConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DraggableConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: ReactElement | `false`): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setNodeDraggable(value: /* node */ DataNode => Boolean): Self = StObject.set(x, "nodeDraggable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNodeDraggableUndefined: Self = StObject.set(x, "nodeDraggable", js.undefined)
    }
  }
  
  type DraggableFn = js.Function1[/* node */ DataNode, Boolean]
  
  type SwitcherIcon = ReactElement | (js.Function1[/* props */ AntTreeNodeProps, ReactElement])
  
  type TreeLeafIcon = ReactElement | (js.Function1[/* props */ AntTreeNodeProps, ReactElement])
  
  type TreeNodeNormal = DataNode
  
  /* Inlined parent std.Omit<rc-tree.rc-tree.TreeProps<T>, 'prefixCls' | 'showLine' | 'direction' | 'draggable' | 'icon' | 'switcherIcon'> */
  @js.native
  trait TreeProps[T /* <: BasicDataNode */] extends StObject {
    
    var activeKey: js.UndefOr[Key | Null] = js.native
    
    var allowDrop: js.UndefOr[AllowDrop[T]] = js.native
    
    /** Whether to automatically expand the parent node */
    var autoExpandParent: js.UndefOr[Boolean] = js.native
    
    var blockNode: js.UndefOr[Boolean] = js.native
    
    /** Node selection in Checkable state is fully controlled (the selected state of parent and child nodes is no longer associated) */
    var checkStrictly: js.UndefOr[Boolean] = js.native
    
    /** Whether to support selection */
    var checkable: js.UndefOr[Boolean] = js.native
    
    /** (Controlled) Tree node with checked checkbox */
    var checkedKeys: js.UndefOr[js.Array[Key] | Checked] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    /** Tree node with checkbox checked by default */
    var defaultCheckedKeys: js.UndefOr[js.Array[Key]] = js.native
    
    /** Expand all tree nodes by default */
    var defaultExpandAll: js.UndefOr[Boolean] = js.native
    
    /** Expand the corresponding tree node by default */
    var defaultExpandParent: js.UndefOr[Boolean] = js.native
    
    /** Expand the specified tree node by default */
    var defaultExpandedKeys: js.UndefOr[js.Array[Key]] = js.native
    
    /** Tree node selected by default */
    var defaultSelectedKeys: js.UndefOr[js.Array[Key]] = js.native
    
    /** whether to disable the tree */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /** Set the node to be draggable (IE>8) */
    var draggable: js.UndefOr[DraggableFn | Boolean | DraggableConfig] = js.native
    
    var dropIndicatorRender: js.UndefOr[js.Function1[/* props */ Direction, ReactElement]] = js.native
    
    var expandAction: js.UndefOr[ExpandAction] = js.native
    
    /** (Controlled) Expand the specified tree node */
    var expandedKeys: js.UndefOr[js.Array[Key]] = js.native
    
    var fieldNames: js.UndefOr[FieldNames] = js.native
    
    /** Click on the tree node to trigger */
    var filterAntTreeNode: js.UndefOr[js.Function1[ReactComponentClass[AntTreeNodeProps], Boolean]] = js.native
    
    var filterTreeNode: js.UndefOr[js.Function1[/* treeNode */ EventDataNode[T], Boolean]] = js.native
    
    var focusable: js.UndefOr[Boolean] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var icon: js.UndefOr[
        (js.Function1[/* nodeProps */ AntdTreeNodeAttribute, ReactElement]) | ReactElement | IconType
      ] = js.native
    
    var itemHeight: js.UndefOr[Double] = js.native
    
    var itemScrollOffset: js.UndefOr[Double] = js.native
    
    var loadData: js.UndefOr[js.Function1[/* treeNode */ EventDataNode[T], js.Promise[Any]]] = js.native
    
    var loadedKeys: js.UndefOr[js.Array[Key]] = js.native
    
    var motion: js.UndefOr[Any] = js.native
    
    /** Whether to support multiple selection */
    var multiple: js.UndefOr[Boolean] = js.native
    
    var onActiveChange: js.UndefOr[js.Function1[/* key */ Key, Unit]] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
    
    var onCheck: js.UndefOr[
        js.Function2[
          /* checked */ web.typings.rcTree.anon.Checked | js.Array[Key], 
          /* info */ CheckInfo[T], 
          Unit
        ]
      ] = js.native
    
    var onClick: js.UndefOr[NodeMouseEventHandler[T, HTMLSpanElement]] = js.native
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onDoubleClick: js.UndefOr[NodeMouseEventHandler[T, HTMLSpanElement]] = js.native
    
    var onDragEnd: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[T, HTMLDivElement], Unit]] = js.native
    
    var onDragEnter: js.UndefOr[
        js.Function1[/* info */ (NodeDragEventParams[T, HTMLDivElement]) with ExpandedKeys, Unit]
      ] = js.native
    
    var onDragLeave: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[T, HTMLDivElement], Unit]] = js.native
    
    var onDragOver: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[T, HTMLDivElement], Unit]] = js.native
    
    var onDragStart: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[T, HTMLDivElement], Unit]] = js.native
    
    var onDrop: js.UndefOr[
        js.Function1[/* info */ (NodeDragEventParams[T, HTMLDivElement]) with DragNode[T], Unit]
      ] = js.native
    
    var onExpand: js.UndefOr[js.Function2[/* expandedKeys */ js.Array[Key], /* info */ Expanded[T], Unit]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    var onLoad: js.UndefOr[js.Function2[/* loadedKeys */ js.Array[Key], /* info */ EventNode[T], Unit]] = js.native
    
    var onMouseEnter: js.UndefOr[js.Function1[/* info */ NodeMouseEventParams[T, HTMLSpanElement], Unit]] = js.native
    
    var onMouseLeave: js.UndefOr[js.Function1[/* info */ NodeMouseEventParams[T, HTMLSpanElement], Unit]] = js.native
    
    var onRightClick: js.UndefOr[js.Function1[/* info */ EventMouseEvent[T], Unit]] = js.native
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLElement]] = js.native
    
    var onSelect: js.UndefOr[js.Function2[/* selectedKeys */ js.Array[Key], /* info */ Event[T], Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var rootStyle: js.UndefOr[CSSProperties] = js.native
    
    var selectable: js.UndefOr[Boolean] = js.native
    
    /** (Controlled) Set the selected tree node */
    var selectedKeys: js.UndefOr[js.Array[Key]] = js.native
    
    var showIcon: js.UndefOr[Boolean] = js.native
    
    var showLine: js.UndefOr[Boolean | ShowLeafIcon] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var switcherIcon: js.UndefOr[SwitcherIcon | IconType] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var titleRender: js.UndefOr[js.Function1[/* node */ T, ReactElement]] = js.native
    
    var treeData: js.UndefOr[js.Array[T]] = js.native
    
    var virtual: js.UndefOr[Boolean] = js.native
  }
  object TreeProps {
    
    @scala.inline
    def apply[T /* <: BasicDataNode */](): TreeProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeProps[T]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TreeProps[_], T /* <: BasicDataNode */] (val x: Self with TreeProps[T]) extends AnyVal {
      
      @scala.inline
      def setActiveKey(value: Key): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveKeyNull: Self = StObject.set(x, "activeKey", null)
      
      @scala.inline
      def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
      
      @scala.inline
      def setAllowDrop(value: /* options */ AllowDropOptions[T] => Boolean): Self = StObject.set(x, "allowDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAllowDropUndefined: Self = StObject.set(x, "allowDrop", js.undefined)
      
      @scala.inline
      def setAutoExpandParent(value: Boolean): Self = StObject.set(x, "autoExpandParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoExpandParentUndefined: Self = StObject.set(x, "autoExpandParent", js.undefined)
      
      @scala.inline
      def setBlockNode(value: Boolean): Self = StObject.set(x, "blockNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockNodeUndefined: Self = StObject.set(x, "blockNode", js.undefined)
      
      @scala.inline
      def setCheckStrictly(value: Boolean): Self = StObject.set(x, "checkStrictly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckStrictlyUndefined: Self = StObject.set(x, "checkStrictly", js.undefined)
      
      @scala.inline
      def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      @scala.inline
      def setCheckedKeys(value: js.Array[Key] | Checked): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedKeysUndefined: Self = StObject.set(x, "checkedKeys", js.undefined)
      
      @scala.inline
      def setCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "checkedKeys", js.Array(value :_*))
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDefaultCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "defaultCheckedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCheckedKeysUndefined: Self = StObject.set(x, "defaultCheckedKeys", js.undefined)
      
      @scala.inline
      def setDefaultCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "defaultCheckedKeys", js.Array(value :_*))
      
      @scala.inline
      def setDefaultExpandAll(value: Boolean): Self = StObject.set(x, "defaultExpandAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultExpandAllUndefined: Self = StObject.set(x, "defaultExpandAll", js.undefined)
      
      @scala.inline
      def setDefaultExpandParent(value: Boolean): Self = StObject.set(x, "defaultExpandParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultExpandParentUndefined: Self = StObject.set(x, "defaultExpandParent", js.undefined)
      
      @scala.inline
      def setDefaultExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "defaultExpandedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultExpandedKeysUndefined: Self = StObject.set(x, "defaultExpandedKeys", js.undefined)
      
      @scala.inline
      def setDefaultExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "defaultExpandedKeys", js.Array(value :_*))
      
      @scala.inline
      def setDefaultSelectedKeys(value: js.Array[Key]): Self = StObject.set(x, "defaultSelectedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSelectedKeysUndefined: Self = StObject.set(x, "defaultSelectedKeys", js.undefined)
      
      @scala.inline
      def setDefaultSelectedKeysVarargs(value: Key*): Self = StObject.set(x, "defaultSelectedKeys", js.Array(value :_*))
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDraggable(value: DraggableFn | Boolean | DraggableConfig): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableFunction1(value: /* node */ DataNode => Boolean): Self = StObject.set(x, "draggable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setDropIndicatorRender(value: /* props */ Direction => ReactElement): Self = StObject.set(x, "dropIndicatorRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDropIndicatorRenderUndefined: Self = StObject.set(x, "dropIndicatorRender", js.undefined)
      
      @scala.inline
      def setExpandAction(value: ExpandAction): Self = StObject.set(x, "expandAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandActionUndefined: Self = StObject.set(x, "expandAction", js.undefined)
      
      @scala.inline
      def setExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedKeysUndefined: Self = StObject.set(x, "expandedKeys", js.undefined)
      
      @scala.inline
      def setExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "expandedKeys", js.Array(value :_*))
      
      @scala.inline
      def setFieldNames(value: FieldNames): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
      
      @scala.inline
      def setFilterAntTreeNode(value: ReactComponentClass[AntTreeNodeProps] => Boolean): Self = StObject.set(x, "filterAntTreeNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterAntTreeNodeUndefined: Self = StObject.set(x, "filterAntTreeNode", js.undefined)
      
      @scala.inline
      def setFilterTreeNode(value: /* treeNode */ EventDataNode[T] => Boolean): Self = StObject.set(x, "filterTreeNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterTreeNodeUndefined: Self = StObject.set(x, "filterTreeNode", js.undefined)
      
      @scala.inline
      def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIcon(
        value: (js.Function1[/* nodeProps */ AntdTreeNodeAttribute, ReactElement]) | ReactElement | IconType
      ): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFunction1(
        value: (/* nodeProps */ AntdTreeNodeAttribute) | (/* props */ TreeNodeProps[DataNode]) => ReactElement
      ): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
      
      @scala.inline
      def setItemScrollOffset(value: Double): Self = StObject.set(x, "itemScrollOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemScrollOffsetUndefined: Self = StObject.set(x, "itemScrollOffset", js.undefined)
      
      @scala.inline
      def setLoadData(value: /* treeNode */ EventDataNode[T] => js.Promise[Any]): Self = StObject.set(x, "loadData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadDataUndefined: Self = StObject.set(x, "loadData", js.undefined)
      
      @scala.inline
      def setLoadedKeys(value: js.Array[Key]): Self = StObject.set(x, "loadedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedKeysUndefined: Self = StObject.set(x, "loadedKeys", js.undefined)
      
      @scala.inline
      def setLoadedKeysVarargs(value: Key*): Self = StObject.set(x, "loadedKeys", js.Array(value :_*))
      
      @scala.inline
      def setMotion(value: Any): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setOnActiveChange(value: /* key */ Key => Unit): Self = StObject.set(x, "onActiveChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnActiveChangeUndefined: Self = StObject.set(x, "onActiveChange", js.undefined)
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnCheck(
        value: (/* checked */ web.typings.rcTree.anon.Checked | js.Array[Key], /* info */ CheckInfo[T]) => Unit
      ): Self = StObject.set(x, "onCheck", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCheckUndefined: Self = StObject.set(x, "onCheck", js.undefined)
      
      @scala.inline
      def setOnClick(value: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode[T]) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(value: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode[T]) => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnDragEnd(value: /* info */ NodeDragEventParams[T, HTMLDivElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragEnter(value: /* info */ (NodeDragEventParams[T, HTMLDivElement]) with ExpandedKeys => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      @scala.inline
      def setOnDragLeave(value: /* info */ NodeDragEventParams[T, HTMLDivElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      @scala.inline
      def setOnDragOver(value: /* info */ NodeDragEventParams[T, HTMLDivElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: /* info */ NodeDragEventParams[T, HTMLDivElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDrop(value: /* info */ (NodeDragEventParams[T, HTMLDivElement]) with DragNode[T] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnExpand(value: (/* expandedKeys */ js.Array[Key], /* info */ Expanded[T]) => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnLoad(value: (/* loadedKeys */ js.Array[Key], /* info */ EventNode[T]) => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: /* info */ NodeMouseEventParams[T, HTMLSpanElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: /* info */ NodeMouseEventParams[T, HTMLSpanElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnRightClick(value: /* info */ EventMouseEvent[T] => Unit): Self = StObject.set(x, "onRightClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRightClickUndefined: Self = StObject.set(x, "onRightClick", js.undefined)
      
      @scala.inline
      def setOnScroll(value: SyntheticUIEvent[HTMLElement] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSelect(value: (/* selectedKeys */ js.Array[Key], /* info */ Event[T]) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setRootStyle(value: CSSProperties): Self = StObject.set(x, "rootStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootStyleUndefined: Self = StObject.set(x, "rootStyle", js.undefined)
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      @scala.inline
      def setSelectedKeys(value: js.Array[Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
      
      @scala.inline
      def setSelectedKeysVarargs(value: Key*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
      
      @scala.inline
      def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
      
      @scala.inline
      def setShowLine(value: Boolean | ShowLeafIcon): Self = StObject.set(x, "showLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLineUndefined: Self = StObject.set(x, "showLine", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSwitcherIcon(value: SwitcherIcon | IconType): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitcherIconFunction1(value: (/* props */ AntTreeNodeProps) | (/* props */ TreeNodeProps[DataNode]) => ReactElement): Self = StObject.set(x, "switcherIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSwitcherIconReactElement(value: ReactElement): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitcherIconUndefined: Self = StObject.set(x, "switcherIcon", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTitleRender(value: /* node */ T => ReactElement): Self = StObject.set(x, "titleRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitleRenderUndefined: Self = StObject.set(x, "titleRender", js.undefined)
      
      @scala.inline
      def setTreeData(value: js.Array[T]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeDataUndefined: Self = StObject.set(x, "treeData", js.undefined)
      
      @scala.inline
      def setTreeDataVarargs(value: T*): Self = StObject.set(x, "treeData", js.Array(value :_*))
      
      @scala.inline
      def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TreeProps[DataNode] with RefAttributes[web.typings.rcTree.mod.default[DataNode]]]
  
  /* This means you don't have to write `default`, but can instead just say `esTreeTreeMod.foo` */
  override def _to: ReactComponentClass[TreeProps[DataNode] with RefAttributes[web.typings.rcTree.mod.default[DataNode]]] = default
}
