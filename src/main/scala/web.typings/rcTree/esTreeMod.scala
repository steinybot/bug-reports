package web.typings.rcTree

import web.typings.rcTree.anon.Checked
import web.typings.rcTree.anon.CheckedKeys
import web.typings.rcTree.anon.DragNode
import web.typings.rcTree.anon.DropLevelOffset
import web.typings.rcTree.anon.Event
import web.typings.rcTree.anon.EventMouseEvent
import web.typings.rcTree.anon.EventNode
import web.typings.rcTree.anon.Expanded
import web.typings.rcTree.anon.ExpandedKeys
import web.typings.rcTree.anon.Node
import web.typings.rcTree.anon.PartialTreeStateDataNode
import web.typings.rcTree.esContextTypesMod.NodeDragEventHandler
import web.typings.rcTree.esContextTypesMod.NodeDragEventParams
import web.typings.rcTree.esContextTypesMod.NodeMouseEventHandler
import web.typings.rcTree.esContextTypesMod.NodeMouseEventParams
import web.typings.rcTree.esInterfaceMod.BasicDataNode
import web.typings.rcTree.esInterfaceMod.DataNode
import web.typings.rcTree.esInterfaceMod.Direction
import web.typings.rcTree.esInterfaceMod.EventDataNode
import web.typings.rcTree.esInterfaceMod.FieldNames
import web.typings.rcTree.esInterfaceMod.FlattenNode
import web.typings.rcTree.esInterfaceMod.IconType
import web.typings.rcTree.esInterfaceMod.Key
import web.typings.rcTree.esInterfaceMod.KeyEntities
import web.typings.rcTree.esInterfaceMod.NodeInstance
import web.typings.rcTree.esInterfaceMod.SafeKey
import web.typings.rcTree.esInterfaceMod.TreeNodeProps
import web.typings.rcTree.esNodeListMod.NodeListRef
import web.typings.rcTree.rcTreeBooleans.`false`
import web.typings.rcTree.rcTreeInts.`-1`
import web.typings.rcTree.rcTreeInts.`0`
import web.typings.rcTree.rcTreeInts.`1`
import web.typings.rcTree.rcTreeStrings.check
import web.typings.rcVirtualList.esListMod.ScrollTo
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.Component
import web.typings.react.mod.DragEvent
import web.typings.react.mod.FocusEventHandler
import web.typings.react.mod.JSX.Element
import web.typings.react.mod.KeyboardEventHandler
import web.typings.react.mod.MouseEventHandler
import web.typings.react.mod.UIEventHandler
import web.typings.std.Partial
import web.typings.std.Record
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLSpanElement
import org.scalajs.dom.MouseEvent
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticUIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTreeMod {
  
  @JSImport("rc-tree/es/Tree", JSImport.Default)
  @js.native
  class default[TreeDataType /* <: DataNode | BasicDataNode */] () extends Tree[TreeDataType]
  object default {
    
    @JSImport("rc-tree/es/Tree", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("rc-tree/es/Tree", "default.TreeNode")
    @js.native
    def TreeNode: ReactComponentClass[TreeNodeProps[DataNode]] = js.native
    @scala.inline
    def TreeNode_=(x: ReactComponentClass[TreeNodeProps[DataNode]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TreeNode")(x.asInstanceOf[js.Any])
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def allowDrop(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("allowDrop")().asInstanceOf[Boolean]
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.autoExpandParent")
      @js.native
      def autoExpandParent: Boolean = js.native
      @scala.inline
      def autoExpandParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoExpandParent")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.checkStrictly")
      @js.native
      def checkStrictly: Boolean = js.native
      @scala.inline
      def checkStrictly_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checkStrictly")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.checkable")
      @js.native
      def checkable: Boolean = js.native
      @scala.inline
      def checkable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checkable")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.defaultCheckedKeys")
      @js.native
      def defaultCheckedKeys: js.Array[Any] = js.native
      @scala.inline
      def defaultCheckedKeys_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultCheckedKeys")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.defaultExpandAll")
      @js.native
      def defaultExpandAll: Boolean = js.native
      @scala.inline
      def defaultExpandAll_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultExpandAll")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.defaultExpandParent")
      @js.native
      def defaultExpandParent: Boolean = js.native
      @scala.inline
      def defaultExpandParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultExpandParent")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.defaultExpandedKeys")
      @js.native
      def defaultExpandedKeys: js.Array[Any] = js.native
      @scala.inline
      def defaultExpandedKeys_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultExpandedKeys")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.defaultSelectedKeys")
      @js.native
      def defaultSelectedKeys: js.Array[Any] = js.native
      @scala.inline
      def defaultSelectedKeys_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedKeys")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      @scala.inline
      def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.draggable")
      @js.native
      def draggable: Boolean = js.native
      @scala.inline
      def draggable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("draggable")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.dropIndicatorRender")
      @js.native
      def dropIndicatorRender: js.Function1[/* param0 */ DropLevelOffset, Element] = js.native
      @scala.inline
      def dropIndicatorRender_=(x: js.Function1[/* param0 */ DropLevelOffset, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dropIndicatorRender")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.expandAction")
      @js.native
      def expandAction: Boolean = js.native
      @scala.inline
      def expandAction_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expandAction")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.multiple")
      @js.native
      def multiple: Boolean = js.native
      @scala.inline
      def multiple_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multiple")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      @scala.inline
      def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.selectable")
      @js.native
      def selectable: Boolean = js.native
      @scala.inline
      def selectable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectable")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.showIcon")
      @js.native
      def showIcon: Boolean = js.native
      @scala.inline
      def showIcon_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showIcon")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree/es/Tree", "default.defaultProps.showLine")
      @js.native
      def showLine: Boolean = js.native
      @scala.inline
      def showLine_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showLine")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @scala.inline
    def getDerivedStateFromProps(props: TreeProps[DataNode], prevState: TreeState[DataNode]): PartialTreeStateDataNode = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[PartialTreeStateDataNode]
  }
  
  type AllowDrop[TreeDataType /* <: BasicDataNode */] = js.Function1[/* options */ AllowDropOptions[TreeDataType], Boolean]
  
  @js.native
  trait AllowDropOptions[TreeDataType /* <: BasicDataNode */] extends StObject {
    
    var dragNode: TreeDataType = js.native
    
    var dropNode: TreeDataType = js.native
    
    var dropPosition: `-1` | `0` | `1` = js.native
  }
  object AllowDropOptions {
    
    @scala.inline
    def apply[TreeDataType /* <: BasicDataNode */](dragNode: TreeDataType, dropNode: TreeDataType, dropPosition: `-1` | `0` | `1`): AllowDropOptions[TreeDataType] = {
      val __obj = js.Dynamic.literal(dragNode = dragNode.asInstanceOf[js.Any], dropNode = dropNode.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllowDropOptions[TreeDataType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AllowDropOptions[_], TreeDataType /* <: BasicDataNode */] (val x: Self with AllowDropOptions[TreeDataType]) extends AnyVal {
      
      @scala.inline
      def setDragNode(value: TreeDataType): Self = StObject.set(x, "dragNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropNode(value: TreeDataType): Self = StObject.set(x, "dropNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropPosition(value: `-1` | `0` | `1`): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CheckInfo[TreeDataType /* <: BasicDataNode */] extends StObject {
    
    var checked: Boolean = js.native
    
    var checkedNodes: js.Array[TreeDataType] = js.native
    
    var checkedNodesPositions: js.UndefOr[js.Array[Node[TreeDataType]]] = js.native
    
    var event: check = js.native
    
    var halfCheckedKeys: js.UndefOr[js.Array[Key]] = js.native
    
    var nativeEvent: MouseEvent = js.native
    
    var node: EventDataNode[TreeDataType] = js.native
  }
  object CheckInfo {
    
    @scala.inline
    def apply[TreeDataType /* <: BasicDataNode */](
      checked: Boolean,
      checkedNodes: js.Array[TreeDataType],
      nativeEvent: MouseEvent,
      node: EventDataNode[TreeDataType]
    ): CheckInfo[TreeDataType] = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], checkedNodes = checkedNodes.asInstanceOf[js.Any], event = "check", nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckInfo[TreeDataType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CheckInfo[_], TreeDataType /* <: BasicDataNode */] (val x: Self with CheckInfo[TreeDataType]) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedNodes(value: js.Array[TreeDataType]): Self = StObject.set(x, "checkedNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedNodesPositions(value: js.Array[Node[TreeDataType]]): Self = StObject.set(x, "checkedNodesPositions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedNodesPositionsUndefined: Self = StObject.set(x, "checkedNodesPositions", js.undefined)
      
      @scala.inline
      def setCheckedNodesPositionsVarargs(value: Node[TreeDataType]*): Self = StObject.set(x, "checkedNodesPositions", js.Array(value :_*))
      
      @scala.inline
      def setCheckedNodesVarargs(value: TreeDataType*): Self = StObject.set(x, "checkedNodes", js.Array(value :_*))
      
      @scala.inline
      def setEvent(value: check): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "halfCheckedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfCheckedKeysUndefined: Self = StObject.set(x, "halfCheckedKeys", js.undefined)
      
      @scala.inline
      def setHalfCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "halfCheckedKeys", js.Array(value :_*))
      
      @scala.inline
      def setNativeEvent(value: MouseEvent): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: EventDataNode[TreeDataType]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
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
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcTree.rcTreeBooleans.`false`
    - `web.typings`.rcTree.rcTreeStrings.click
    - `web.typings`.rcTree.rcTreeStrings.doubleClick
  */
  trait ExpandAction extends StObject
  object ExpandAction {
    
    @scala.inline
    def click: web.typings.rcTree.rcTreeStrings.click = "click".asInstanceOf[web.typings.rcTree.rcTreeStrings.click]
    
    @scala.inline
    def doubleClick: web.typings.rcTree.rcTreeStrings.doubleClick = "doubleClick".asInstanceOf[web.typings.rcTree.rcTreeStrings.doubleClick]
    
    @scala.inline
    def `false`: web.typings.rcTree.rcTreeBooleans.`false` = false.asInstanceOf[web.typings.rcTree.rcTreeBooleans.`false`]
  }
  
  @js.native
  trait Tree[TreeDataType /* <: DataNode | BasicDataNode */] extends Component[TreeProps[TreeDataType], TreeState[TreeDataType], Any] {
    
    def cleanDragState(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MTree(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTree(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MTree(): Unit = js.native
    
    var currentMouseOverDroppableNodeKey: Any = js.native
    
    var delayedDragEnterLogic: Record[SafeKey, Double] = js.native
    
    var destroyed: Boolean = js.native
    
    var dragNode: NodeInstance[TreeDataType] = js.native
    
    var dragStartMousePosition: Any = js.native
    
    def getActiveItem(): FlattenNode[TreeDataType] = js.native
    
    def getTreeNodeRequiredProps(): CheckedKeys[TreeDataType] = js.native
    
    var listRef: ReactRef[NodeListRef] = js.native
    
    var loadingRetryTimes: Record[SafeKey, Double] = js.native
    
    def offsetActiveKey(offset: Double): Unit = js.native
    
    def onActiveChange(): Unit = js.native
    def onActiveChange(newActiveKey: Key): Unit = js.native
    
    var onBlur: FocusEventHandler[HTMLDivElement] = js.native
    
    var onFocus: FocusEventHandler[HTMLDivElement] = js.native
    
    var onKeyDown: KeyboardEventHandler[HTMLDivElement] = js.native
    
    def onListChangeEnd(): Unit = js.native
    
    def onListChangeStart(): Unit = js.native
    
    def onNodeCheck(e: SyntheticMouseEvent[HTMLSpanElement], treeNode: EventDataNode[TreeDataType], checked: Boolean): Unit = js.native
    
    var onNodeClick: NodeMouseEventHandler[TreeDataType, HTMLSpanElement] = js.native
    
    var onNodeContextMenu: NodeMouseEventHandler[TreeDataType, HTMLSpanElement] = js.native
    
    var onNodeDoubleClick: NodeMouseEventHandler[TreeDataType, HTMLSpanElement] = js.native
    
    var onNodeDragEnd: NodeDragEventHandler[TreeDataType, HTMLDivElement] = js.native
    
    /**
      * [Legacy] Select handler is smaller than node,
      * so that this will trigger when drag enter node or select handler.
      * This is a little tricky if customize css without padding.
      * Better for use mouse move event to refresh drag state.
      * But let's just keep it to avoid event trigger logic change.
      */
    def onNodeDragEnter(event: DragEvent[HTMLDivElement], node: NodeInstance[TreeDataType]): Unit = js.native
    
    var onNodeDragLeave: NodeDragEventHandler[TreeDataType, HTMLDivElement] = js.native
    
    def onNodeDragOver(event: DragEvent[HTMLDivElement], node: NodeInstance[TreeDataType]): Unit = js.native
    
    var onNodeDragStart: NodeDragEventHandler[TreeDataType, HTMLDivElement] = js.native
    
    def onNodeDrop(event: DragEvent[HTMLDivElement], node: Any): Unit = js.native
    def onNodeDrop(event: DragEvent[HTMLDivElement], node: Any, outsideTree: Boolean): Unit = js.native
    
    def onNodeExpand(e: SyntheticMouseEvent[HTMLDivElement], treeNode: EventDataNode[TreeDataType]): Unit = js.native
    
    def onNodeLoad(treeNode: EventDataNode[TreeDataType]): js.Promise[Unit] = js.native
    
    var onNodeMouseEnter: NodeMouseEventHandler[TreeDataType, HTMLSpanElement] = js.native
    
    var onNodeMouseLeave: NodeMouseEventHandler[TreeDataType, HTMLSpanElement] = js.native
    
    var onNodeSelect: NodeMouseEventHandler[TreeDataType, HTMLSpanElement] = js.native
    
    def onUpdated(): Unit = js.native
    
    def onWindowDragEnd(event: Any): Unit = js.native
    
    def resetDragState(): Unit = js.native
    
    var scrollTo: ScrollTo = js.native
    
    /** Set uncontrolled `expandedKeys`. This will also auto update `flattenNodes`. */
    def setExpandedKeys(expandedKeys: js.Array[Key]): Unit = js.native
    
    /**
      * Only update the value which is not in props
      */
    def setUncontrolledState(state: Partial[TreeState[TreeDataType]]): Unit = js.native
    def setUncontrolledState(state: Partial[TreeState[TreeDataType]], atomic: Boolean): Unit = js.native
    def setUncontrolledState(
      state: Partial[TreeState[TreeDataType]],
      atomic: Boolean,
      forceState: Partial[TreeState[TreeDataType]]
    ): Unit = js.native
    def setUncontrolledState(
      state: Partial[TreeState[TreeDataType]],
      atomic: Unit,
      forceState: Partial[TreeState[TreeDataType]]
    ): Unit = js.native
    
    var triggerExpandActionExpand: NodeMouseEventHandler[DataNode, HTMLSpanElement] = js.native
  }
  
  @js.native
  trait TreeProps[TreeDataType /* <: BasicDataNode */] extends StObject {
    
    var activeKey: js.UndefOr[Key | Null] = js.native
    
    var allowDrop: js.UndefOr[AllowDrop[TreeDataType]] = js.native
    
    var autoExpandParent: js.UndefOr[Boolean] = js.native
    
    var checkStrictly: js.UndefOr[Boolean] = js.native
    
    var checkable: js.UndefOr[Boolean | ReactElement] = js.native
    
    var checkedKeys: js.UndefOr[js.Array[Key] | Checked] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var defaultCheckedKeys: js.UndefOr[js.Array[Key]] = js.native
    
    var defaultExpandAll: js.UndefOr[Boolean] = js.native
    
    var defaultExpandParent: js.UndefOr[Boolean] = js.native
    
    var defaultExpandedKeys: js.UndefOr[js.Array[Key]] = js.native
    
    var defaultSelectedKeys: js.UndefOr[js.Array[Key]] = js.native
    
    var direction: js.UndefOr[Direction] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var draggable: js.UndefOr[DraggableFn | Boolean | DraggableConfig] = js.native
    
    var dropIndicatorRender: js.UndefOr[js.Function1[/* props */ web.typings.rcTree.anon.Direction, ReactElement]] = js.native
    
    var expandAction: js.UndefOr[ExpandAction] = js.native
    
    var expandedKeys: js.UndefOr[js.Array[Key]] = js.native
    
    var fieldNames: js.UndefOr[FieldNames] = js.native
    
    var filterTreeNode: js.UndefOr[js.Function1[/* treeNode */ EventDataNode[TreeDataType], Boolean]] = js.native
    
    var focusable: js.UndefOr[Boolean] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var icon: js.UndefOr[IconType] = js.native
    
    var itemHeight: js.UndefOr[Double] = js.native
    
    var itemScrollOffset: js.UndefOr[Double] = js.native
    
    var loadData: js.UndefOr[js.Function1[/* treeNode */ EventDataNode[TreeDataType], js.Promise[Any]]] = js.native
    
    var loadedKeys: js.UndefOr[js.Array[Key]] = js.native
    
    var motion: js.UndefOr[Any] = js.native
    
    var multiple: js.UndefOr[Boolean] = js.native
    
    /**
      * Used for `rc-tree-select` only.
      * Do not use in your production code directly since this will be refactor.
      */
    var onActiveChange: js.UndefOr[js.Function1[/* key */ Key, Unit]] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
    
    var onCheck: js.UndefOr[
        js.Function2[/* checked */ Checked | js.Array[Key], /* info */ CheckInfo[TreeDataType], Unit]
      ] = js.native
    
    var onClick: js.UndefOr[NodeMouseEventHandler[TreeDataType, HTMLSpanElement]] = js.native
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onDoubleClick: js.UndefOr[NodeMouseEventHandler[TreeDataType, HTMLSpanElement]] = js.native
    
    var onDragEnd: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[TreeDataType, HTMLDivElement], Unit]] = js.native
    
    var onDragEnter: js.UndefOr[
        js.Function1[
          /* info */ (NodeDragEventParams[TreeDataType, HTMLDivElement]) with ExpandedKeys, 
          Unit
        ]
      ] = js.native
    
    var onDragLeave: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[TreeDataType, HTMLDivElement], Unit]] = js.native
    
    var onDragOver: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[TreeDataType, HTMLDivElement], Unit]] = js.native
    
    var onDragStart: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[TreeDataType, HTMLDivElement], Unit]] = js.native
    
    var onDrop: js.UndefOr[
        js.Function1[
          /* info */ (NodeDragEventParams[TreeDataType, HTMLDivElement]) with DragNode[TreeDataType], 
          Unit
        ]
      ] = js.native
    
    var onExpand: js.UndefOr[
        js.Function2[/* expandedKeys */ js.Array[Key], /* info */ Expanded[TreeDataType], Unit]
      ] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    var onLoad: js.UndefOr[
        js.Function2[/* loadedKeys */ js.Array[Key], /* info */ EventNode[TreeDataType], Unit]
      ] = js.native
    
    var onMouseEnter: js.UndefOr[
        js.Function1[/* info */ NodeMouseEventParams[TreeDataType, HTMLSpanElement], Unit]
      ] = js.native
    
    var onMouseLeave: js.UndefOr[
        js.Function1[/* info */ NodeMouseEventParams[TreeDataType, HTMLSpanElement], Unit]
      ] = js.native
    
    var onRightClick: js.UndefOr[js.Function1[/* info */ EventMouseEvent[TreeDataType], Unit]] = js.native
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLElement]] = js.native
    
    var onSelect: js.UndefOr[
        js.Function2[/* selectedKeys */ js.Array[Key], /* info */ Event[TreeDataType], Unit]
      ] = js.native
    
    var prefixCls: String = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var rootStyle: js.UndefOr[CSSProperties] = js.native
    
    var selectable: js.UndefOr[Boolean] = js.native
    
    var selectedKeys: js.UndefOr[js.Array[Key]] = js.native
    
    var showIcon: js.UndefOr[Boolean] = js.native
    
    var showLine: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var switcherIcon: js.UndefOr[IconType] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var titleRender: js.UndefOr[js.Function1[/* node */ TreeDataType, ReactElement]] = js.native
    
    var treeData: js.UndefOr[js.Array[TreeDataType]] = js.native
    
    var virtual: js.UndefOr[Boolean] = js.native
  }
  object TreeProps {
    
    @scala.inline
    def apply[TreeDataType /* <: BasicDataNode */](prefixCls: String): TreeProps[TreeDataType] = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeProps[TreeDataType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TreeProps[_], TreeDataType /* <: BasicDataNode */] (val x: Self with TreeProps[TreeDataType]) extends AnyVal {
      
      @scala.inline
      def setActiveKey(value: Key): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveKeyNull: Self = StObject.set(x, "activeKey", null)
      
      @scala.inline
      def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
      
      @scala.inline
      def setAllowDrop(value: /* options */ AllowDropOptions[TreeDataType] => Boolean): Self = StObject.set(x, "allowDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAllowDropUndefined: Self = StObject.set(x, "allowDrop", js.undefined)
      
      @scala.inline
      def setAutoExpandParent(value: Boolean): Self = StObject.set(x, "autoExpandParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoExpandParentUndefined: Self = StObject.set(x, "autoExpandParent", js.undefined)
      
      @scala.inline
      def setCheckStrictly(value: Boolean): Self = StObject.set(x, "checkStrictly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckStrictlyUndefined: Self = StObject.set(x, "checkStrictly", js.undefined)
      
      @scala.inline
      def setCheckable(value: Boolean | ReactElement): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckableReactElement(value: ReactElement): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
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
      def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
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
      def setDropIndicatorRender(value: /* props */ web.typings.rcTree.anon.Direction => ReactElement): Self = StObject.set(x, "dropIndicatorRender", js.Any.fromFunction1(value))
      
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
      def setFilterTreeNode(value: /* treeNode */ EventDataNode[TreeDataType] => Boolean): Self = StObject.set(x, "filterTreeNode", js.Any.fromFunction1(value))
      
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
      def setIcon(value: IconType): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFunction1(value: /* props */ TreeNodeProps[DataNode] => ReactElement): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
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
      def setLoadData(value: /* treeNode */ EventDataNode[TreeDataType] => js.Promise[Any]): Self = StObject.set(x, "loadData", js.Any.fromFunction1(value))
      
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
      def setOnCheck(value: (/* checked */ Checked | js.Array[Key], /* info */ CheckInfo[TreeDataType]) => Unit): Self = StObject.set(x, "onCheck", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCheckUndefined: Self = StObject.set(x, "onCheck", js.undefined)
      
      @scala.inline
      def setOnClick(
        value: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode[TreeDataType]) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(
        value: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode[TreeDataType]) => Unit
      ): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnDragEnd(value: /* info */ NodeDragEventParams[TreeDataType, HTMLDivElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragEnter(value: /* info */ (NodeDragEventParams[TreeDataType, HTMLDivElement]) with ExpandedKeys => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      @scala.inline
      def setOnDragLeave(value: /* info */ NodeDragEventParams[TreeDataType, HTMLDivElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      @scala.inline
      def setOnDragOver(value: /* info */ NodeDragEventParams[TreeDataType, HTMLDivElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: /* info */ NodeDragEventParams[TreeDataType, HTMLDivElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDrop(
        value: /* info */ (NodeDragEventParams[TreeDataType, HTMLDivElement]) with DragNode[TreeDataType] => Unit
      ): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnExpand(value: (/* expandedKeys */ js.Array[Key], /* info */ Expanded[TreeDataType]) => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction2(value))
      
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
      def setOnLoad(value: (/* loadedKeys */ js.Array[Key], /* info */ EventNode[TreeDataType]) => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: /* info */ NodeMouseEventParams[TreeDataType, HTMLSpanElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: /* info */ NodeMouseEventParams[TreeDataType, HTMLSpanElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnRightClick(value: /* info */ EventMouseEvent[TreeDataType] => Unit): Self = StObject.set(x, "onRightClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRightClickUndefined: Self = StObject.set(x, "onRightClick", js.undefined)
      
      @scala.inline
      def setOnScroll(value: SyntheticUIEvent[HTMLElement] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSelect(value: (/* selectedKeys */ js.Array[Key], /* info */ Event[TreeDataType]) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
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
      def setShowLine(value: Boolean): Self = StObject.set(x, "showLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLineUndefined: Self = StObject.set(x, "showLine", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSwitcherIcon(value: IconType): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitcherIconFunction1(value: /* props */ TreeNodeProps[DataNode] => ReactElement): Self = StObject.set(x, "switcherIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSwitcherIconReactElement(value: ReactElement): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitcherIconUndefined: Self = StObject.set(x, "switcherIcon", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTitleRender(value: /* node */ TreeDataType => ReactElement): Self = StObject.set(x, "titleRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitleRenderUndefined: Self = StObject.set(x, "titleRender", js.undefined)
      
      @scala.inline
      def setTreeData(value: js.Array[TreeDataType]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeDataUndefined: Self = StObject.set(x, "treeData", js.undefined)
      
      @scala.inline
      def setTreeDataVarargs(value: TreeDataType*): Self = StObject.set(x, "treeData", js.Array(value :_*))
      
      @scala.inline
      def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
  
  @js.native
  trait TreeState[TreeDataType /* <: BasicDataNode */] extends StObject {
    
    var activeKey: Key | Null = js.native
    
    var checkedKeys: js.Array[Key] = js.native
    
    var dragChildrenKeys: js.Array[Key] = js.native
    
    var dragOverNodeKey: Key | Null = js.native
    
    var draggingNodeKey: Key = js.native
    
    var dropAllowed: Boolean = js.native
    
    var dropContainerKey: Key | Null = js.native
    
    var dropLevelOffset: Double | Null = js.native
    
    var dropPosition: `-1` | `0` | `1` | Null = js.native
    
    var dropTargetKey: Key | Null = js.native
    
    var dropTargetPos: String | Null = js.native
    
    var expandedKeys: js.Array[Key] = js.native
    
    var fieldNames: FieldNames = js.native
    
    var flattenNodes: js.Array[FlattenNode[TreeDataType]] = js.native
    
    var focused: Boolean = js.native
    
    var halfCheckedKeys: js.Array[Key] = js.native
    
    var indent: Double | Null = js.native
    
    var keyEntities: KeyEntities[TreeDataType] = js.native
    
    var listChanging: Boolean = js.native
    
    var loadedKeys: js.Array[Key] = js.native
    
    var loadingKeys: js.Array[Key] = js.native
    
    var prevProps: TreeProps[DataNode] = js.native
    
    var selectedKeys: js.Array[Key] = js.native
    
    var treeData: js.Array[TreeDataType] = js.native
  }
  object TreeState {
    
    @scala.inline
    def apply[TreeDataType /* <: BasicDataNode */](
      checkedKeys: js.Array[Key],
      dragChildrenKeys: js.Array[Key],
      draggingNodeKey: Key,
      dropAllowed: Boolean,
      expandedKeys: js.Array[Key],
      fieldNames: FieldNames,
      flattenNodes: js.Array[FlattenNode[TreeDataType]],
      focused: Boolean,
      halfCheckedKeys: js.Array[Key],
      keyEntities: KeyEntities[TreeDataType],
      listChanging: Boolean,
      loadedKeys: js.Array[Key],
      loadingKeys: js.Array[Key],
      prevProps: TreeProps[DataNode],
      selectedKeys: js.Array[Key],
      treeData: js.Array[TreeDataType]
    ): TreeState[TreeDataType] = {
      val __obj = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], dragChildrenKeys = dragChildrenKeys.asInstanceOf[js.Any], draggingNodeKey = draggingNodeKey.asInstanceOf[js.Any], dropAllowed = dropAllowed.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], fieldNames = fieldNames.asInstanceOf[js.Any], flattenNodes = flattenNodes.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any], keyEntities = keyEntities.asInstanceOf[js.Any], listChanging = listChanging.asInstanceOf[js.Any], loadedKeys = loadedKeys.asInstanceOf[js.Any], loadingKeys = loadingKeys.asInstanceOf[js.Any], prevProps = prevProps.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any], activeKey = null, dragOverNodeKey = null, dropContainerKey = null, dropLevelOffset = null, dropPosition = null, dropTargetKey = null, dropTargetPos = null, indent = null)
      __obj.asInstanceOf[TreeState[TreeDataType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TreeState[_], TreeDataType /* <: BasicDataNode */] (val x: Self with TreeState[TreeDataType]) extends AnyVal {
      
      @scala.inline
      def setActiveKey(value: Key): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveKeyNull: Self = StObject.set(x, "activeKey", null)
      
      @scala.inline
      def setCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "checkedKeys", js.Array(value :_*))
      
      @scala.inline
      def setDragChildrenKeys(value: js.Array[Key]): Self = StObject.set(x, "dragChildrenKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragChildrenKeysVarargs(value: Key*): Self = StObject.set(x, "dragChildrenKeys", js.Array(value :_*))
      
      @scala.inline
      def setDragOverNodeKey(value: Key): Self = StObject.set(x, "dragOverNodeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragOverNodeKeyNull: Self = StObject.set(x, "dragOverNodeKey", null)
      
      @scala.inline
      def setDraggingNodeKey(value: Key): Self = StObject.set(x, "draggingNodeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropAllowed(value: Boolean): Self = StObject.set(x, "dropAllowed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropContainerKey(value: Key): Self = StObject.set(x, "dropContainerKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropContainerKeyNull: Self = StObject.set(x, "dropContainerKey", null)
      
      @scala.inline
      def setDropLevelOffset(value: Double): Self = StObject.set(x, "dropLevelOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropLevelOffsetNull: Self = StObject.set(x, "dropLevelOffset", null)
      
      @scala.inline
      def setDropPosition(value: `-1` | `0` | `1`): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropPositionNull: Self = StObject.set(x, "dropPosition", null)
      
      @scala.inline
      def setDropTargetKey(value: Key): Self = StObject.set(x, "dropTargetKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropTargetKeyNull: Self = StObject.set(x, "dropTargetKey", null)
      
      @scala.inline
      def setDropTargetPos(value: String): Self = StObject.set(x, "dropTargetPos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropTargetPosNull: Self = StObject.set(x, "dropTargetPos", null)
      
      @scala.inline
      def setExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "expandedKeys", js.Array(value :_*))
      
      @scala.inline
      def setFieldNames(value: FieldNames): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlattenNodes(value: js.Array[FlattenNode[TreeDataType]]): Self = StObject.set(x, "flattenNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlattenNodesVarargs(value: FlattenNode[TreeDataType]*): Self = StObject.set(x, "flattenNodes", js.Array(value :_*))
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "halfCheckedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "halfCheckedKeys", js.Array(value :_*))
      
      @scala.inline
      def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentNull: Self = StObject.set(x, "indent", null)
      
      @scala.inline
      def setKeyEntities(value: KeyEntities[TreeDataType]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListChanging(value: Boolean): Self = StObject.set(x, "listChanging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedKeys(value: js.Array[Key]): Self = StObject.set(x, "loadedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedKeysVarargs(value: Key*): Self = StObject.set(x, "loadedKeys", js.Array(value :_*))
      
      @scala.inline
      def setLoadingKeys(value: js.Array[Key]): Self = StObject.set(x, "loadingKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingKeysVarargs(value: Key*): Self = StObject.set(x, "loadingKeys", js.Array(value :_*))
      
      @scala.inline
      def setPrevProps(value: TreeProps[DataNode]): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedKeys(value: js.Array[Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedKeysVarargs(value: Key*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
      
      @scala.inline
      def setTreeData(value: js.Array[TreeDataType]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeDataVarargs(value: TreeDataType*): Self = StObject.set(x, "treeData", js.Array(value :_*))
    }
  }
}
