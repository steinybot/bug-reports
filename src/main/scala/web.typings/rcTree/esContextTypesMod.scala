package web.typings.rcTree

import web.typings.rcTree.anon.DropPosition
import web.typings.rcTree.esInterfaceMod.BasicDataNode
import web.typings.rcTree.esInterfaceMod.DataNode
import web.typings.rcTree.esInterfaceMod.Direction
import web.typings.rcTree.esInterfaceMod.EventDataNode
import web.typings.rcTree.esInterfaceMod.IconType
import web.typings.rcTree.esInterfaceMod.Key
import web.typings.rcTree.esInterfaceMod.KeyEntities
import web.typings.rcTree.esInterfaceMod.NodeInstance
import web.typings.rcTree.esInterfaceMod.TreeNodeProps
import web.typings.rcTree.esTreeMod.DraggableConfig
import web.typings.rcTree.rcTreeInts.`-1`
import web.typings.rcTree.rcTreeInts.`0`
import web.typings.rcTree.rcTreeInts.`1`
import web.typings.react.mod.Context
import web.typings.react.mod.DragEvent
import org.scalajs.dom.HTMLSpanElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esContextTypesMod {
  
  @JSImport("rc-tree/es/contextTypes", "TreeContext")
  @js.native
  val TreeContext: Context[TreeContextProps[Any] | Null] = js.native
  
  type NodeDragEventHandler[TreeDataType /* <: BasicDataNode */, T] = js.Function3[
    /* e */ DragEvent[T], 
    /* node */ NodeInstance[TreeDataType], 
    /* outsideTree */ js.UndefOr[Boolean], 
    Unit
  ]
  
  @js.native
  trait NodeDragEventParams[TreeDataType /* <: BasicDataNode */, T] extends StObject {
    
    var event: DragEvent[T] = js.native
    
    var node: EventDataNode[TreeDataType] = js.native
  }
  object NodeDragEventParams {
    
    @scala.inline
    def apply[TreeDataType /* <: BasicDataNode */, T](event: DragEvent[T], node: EventDataNode[TreeDataType]): NodeDragEventParams[TreeDataType, T] = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeDragEventParams[TreeDataType, T]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: NodeDragEventParams[_, _], TreeDataType /* <: BasicDataNode */, T] (val x: Self with (NodeDragEventParams[TreeDataType, T])) extends AnyVal {
      
      @scala.inline
      def setEvent(value: DragEvent[T]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: EventDataNode[TreeDataType]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  type NodeMouseEventHandler[TreeDataType /* <: BasicDataNode */, T] = js.Function2[/* e */ SyntheticMouseEvent[T], /* node */ EventDataNode[TreeDataType], Unit]
  
  @js.native
  trait NodeMouseEventParams[TreeDataType /* <: BasicDataNode */, T] extends StObject {
    
    var event: SyntheticMouseEvent[T] = js.native
    
    var node: EventDataNode[TreeDataType] = js.native
  }
  object NodeMouseEventParams {
    
    @scala.inline
    def apply[TreeDataType /* <: BasicDataNode */, T](event: SyntheticMouseEvent[T], node: EventDataNode[TreeDataType]): NodeMouseEventParams[TreeDataType, T] = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeMouseEventParams[TreeDataType, T]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: NodeMouseEventParams[_, _], TreeDataType /* <: BasicDataNode */, T] (val x: Self with (NodeMouseEventParams[TreeDataType, T])) extends AnyVal {
      
      @scala.inline
      def setEvent(value: SyntheticMouseEvent[T]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: EventDataNode[TreeDataType]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TreeContextProps[TreeDataType /* <: BasicDataNode */] extends StObject {
    
    var checkStrictly: Boolean = js.native
    
    var checkable: Boolean | ReactElement = js.native
    
    var direction: Direction = js.native
    
    var disabled: Boolean = js.native
    
    var dragOverNodeKey: Key | Null = js.native
    
    var draggable: js.UndefOr[DraggableConfig] = js.native
    
    var draggingNodeKey: js.UndefOr[Key] = js.native
    
    var dropContainerKey: Key | Null = js.native
    
    def dropIndicatorRender(props: DropPosition): ReactElement = js.native
    
    var dropLevelOffset: js.UndefOr[Double] = js.native
    
    var dropPosition: `-1` | `0` | `1` | Null = js.native
    
    var dropTargetKey: Key | Null = js.native
    
    def filterTreeNode(treeNode: EventDataNode[TreeDataType]): Boolean = js.native
    
    var icon: IconType = js.native
    
    var indent: Double | Null = js.native
    
    var keyEntities: KeyEntities[Any] = js.native
    
    def loadData(treeNode: EventDataNode[TreeDataType]): js.Promise[Unit] = js.native
    
    def onNodeCheck(e: SyntheticMouseEvent[HTMLSpanElement], treeNode: EventDataNode[TreeDataType], checked: Boolean): Unit = js.native
    
    var onNodeClick: NodeMouseEventHandler[TreeDataType, HTMLSpanElement] = js.native
    
    var onNodeContextMenu: NodeMouseEventHandler[TreeDataType, HTMLSpanElement] = js.native
    
    var onNodeDoubleClick: NodeMouseEventHandler[TreeDataType, HTMLSpanElement] = js.native
    
    var onNodeDragEnd: NodeDragEventHandler[Any, Any] = js.native
    
    var onNodeDragEnter: NodeDragEventHandler[Any, Any] = js.native
    
    var onNodeDragLeave: NodeDragEventHandler[Any, Any] = js.native
    
    var onNodeDragOver: NodeDragEventHandler[Any, Any] = js.native
    
    var onNodeDragStart: NodeDragEventHandler[Any, Any] = js.native
    
    var onNodeDrop: NodeDragEventHandler[Any, Any] = js.native
    
    var onNodeExpand: NodeMouseEventHandler[TreeDataType, HTMLSpanElement] = js.native
    
    def onNodeLoad(treeNode: EventDataNode[TreeDataType]): Unit = js.native
    
    var onNodeMouseEnter: NodeMouseEventHandler[TreeDataType, HTMLSpanElement] = js.native
    
    var onNodeMouseLeave: NodeMouseEventHandler[TreeDataType, HTMLSpanElement] = js.native
    
    var onNodeSelect: NodeMouseEventHandler[TreeDataType, HTMLSpanElement] = js.native
    
    var prefixCls: String = js.native
    
    var selectable: Boolean = js.native
    
    var showIcon: Boolean = js.native
    
    var switcherIcon: IconType = js.native
    
    var titleRender: js.UndefOr[js.Function1[/* node */ Any, ReactElement]] = js.native
  }
  object TreeContextProps {
    
    @scala.inline
    def apply[TreeDataType /* <: BasicDataNode */](
      checkStrictly: Boolean,
      checkable: Boolean | ReactElement,
      disabled: Boolean,
      dropIndicatorRender: DropPosition => ReactElement,
      filterTreeNode: EventDataNode[TreeDataType] => Boolean,
      icon: IconType,
      keyEntities: KeyEntities[Any],
      loadData: EventDataNode[TreeDataType] => js.Promise[Unit],
      onNodeCheck: (SyntheticMouseEvent[HTMLSpanElement], EventDataNode[TreeDataType], Boolean) => Unit,
      onNodeClick: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode[TreeDataType]) => Unit,
      onNodeContextMenu: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode[TreeDataType]) => Unit,
      onNodeDoubleClick: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode[TreeDataType]) => Unit,
      onNodeDragEnd: (/* e */ DragEvent[Any], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Unit,
      onNodeDragEnter: (/* e */ DragEvent[Any], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Unit,
      onNodeDragLeave: (/* e */ DragEvent[Any], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Unit,
      onNodeDragOver: (/* e */ DragEvent[Any], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Unit,
      onNodeDragStart: (/* e */ DragEvent[Any], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Unit,
      onNodeDrop: (/* e */ DragEvent[Any], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Unit,
      onNodeExpand: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode[TreeDataType]) => Unit,
      onNodeLoad: EventDataNode[TreeDataType] => Unit,
      onNodeMouseEnter: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode[TreeDataType]) => Unit,
      onNodeMouseLeave: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode[TreeDataType]) => Unit,
      onNodeSelect: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode[TreeDataType]) => Unit,
      prefixCls: String,
      selectable: Boolean,
      showIcon: Boolean,
      switcherIcon: IconType
    ): TreeContextProps[TreeDataType] = {
      val __obj = js.Dynamic.literal(checkStrictly = checkStrictly.asInstanceOf[js.Any], checkable = checkable.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], dropIndicatorRender = js.Any.fromFunction1(dropIndicatorRender), filterTreeNode = js.Any.fromFunction1(filterTreeNode), icon = icon.asInstanceOf[js.Any], keyEntities = keyEntities.asInstanceOf[js.Any], loadData = js.Any.fromFunction1(loadData), onNodeCheck = js.Any.fromFunction3(onNodeCheck), onNodeClick = js.Any.fromFunction2(onNodeClick), onNodeContextMenu = js.Any.fromFunction2(onNodeContextMenu), onNodeDoubleClick = js.Any.fromFunction2(onNodeDoubleClick), onNodeDragEnd = js.Any.fromFunction3(onNodeDragEnd), onNodeDragEnter = js.Any.fromFunction3(onNodeDragEnter), onNodeDragLeave = js.Any.fromFunction3(onNodeDragLeave), onNodeDragOver = js.Any.fromFunction3(onNodeDragOver), onNodeDragStart = js.Any.fromFunction3(onNodeDragStart), onNodeDrop = js.Any.fromFunction3(onNodeDrop), onNodeExpand = js.Any.fromFunction2(onNodeExpand), onNodeLoad = js.Any.fromFunction1(onNodeLoad), onNodeMouseEnter = js.Any.fromFunction2(onNodeMouseEnter), onNodeMouseLeave = js.Any.fromFunction2(onNodeMouseLeave), onNodeSelect = js.Any.fromFunction2(onNodeSelect), prefixCls = prefixCls.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], showIcon = showIcon.asInstanceOf[js.Any], switcherIcon = switcherIcon.asInstanceOf[js.Any], dragOverNodeKey = null, dropContainerKey = null, dropPosition = null, dropTargetKey = null, indent = null)
      __obj.asInstanceOf[TreeContextProps[TreeDataType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TreeContextProps[_], TreeDataType /* <: BasicDataNode */] (val x: Self with TreeContextProps[TreeDataType]) extends AnyVal {
      
      @scala.inline
      def setCheckStrictly(value: Boolean): Self = StObject.set(x, "checkStrictly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckable(value: Boolean | ReactElement): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckableReactElement(value: ReactElement): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragOverNodeKey(value: Key): Self = StObject.set(x, "dragOverNodeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragOverNodeKeyNull: Self = StObject.set(x, "dragOverNodeKey", null)
      
      @scala.inline
      def setDraggable(value: DraggableConfig): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setDraggingNodeKey(value: Key): Self = StObject.set(x, "draggingNodeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggingNodeKeyUndefined: Self = StObject.set(x, "draggingNodeKey", js.undefined)
      
      @scala.inline
      def setDropContainerKey(value: Key): Self = StObject.set(x, "dropContainerKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropContainerKeyNull: Self = StObject.set(x, "dropContainerKey", null)
      
      @scala.inline
      def setDropIndicatorRender(value: DropPosition => ReactElement): Self = StObject.set(x, "dropIndicatorRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDropLevelOffset(value: Double): Self = StObject.set(x, "dropLevelOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropLevelOffsetUndefined: Self = StObject.set(x, "dropLevelOffset", js.undefined)
      
      @scala.inline
      def setDropPosition(value: `-1` | `0` | `1`): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropPositionNull: Self = StObject.set(x, "dropPosition", null)
      
      @scala.inline
      def setDropTargetKey(value: Key): Self = StObject.set(x, "dropTargetKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropTargetKeyNull: Self = StObject.set(x, "dropTargetKey", null)
      
      @scala.inline
      def setFilterTreeNode(value: EventDataNode[TreeDataType] => Boolean): Self = StObject.set(x, "filterTreeNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIcon(value: IconType): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFunction1(value: /* props */ TreeNodeProps[DataNode] => ReactElement): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentNull: Self = StObject.set(x, "indent", null)
      
      @scala.inline
      def setKeyEntities(value: KeyEntities[Any]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadData(value: EventDataNode[TreeDataType] => js.Promise[Unit]): Self = StObject.set(x, "loadData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNodeCheck(value: (SyntheticMouseEvent[HTMLSpanElement], EventDataNode[TreeDataType], Boolean) => Unit): Self = StObject.set(x, "onNodeCheck", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnNodeClick(
        value: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode[TreeDataType]) => Unit
      ): Self = StObject.set(x, "onNodeClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeContextMenu(
        value: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode[TreeDataType]) => Unit
      ): Self = StObject.set(x, "onNodeContextMenu", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeDoubleClick(
        value: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode[TreeDataType]) => Unit
      ): Self = StObject.set(x, "onNodeDoubleClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeDragEnd(
        value: (/* e */ DragEvent[Any], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Unit
      ): Self = StObject.set(x, "onNodeDragEnd", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnNodeDragEnter(
        value: (/* e */ DragEvent[Any], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Unit
      ): Self = StObject.set(x, "onNodeDragEnter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnNodeDragLeave(
        value: (/* e */ DragEvent[Any], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Unit
      ): Self = StObject.set(x, "onNodeDragLeave", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnNodeDragOver(
        value: (/* e */ DragEvent[Any], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Unit
      ): Self = StObject.set(x, "onNodeDragOver", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnNodeDragStart(
        value: (/* e */ DragEvent[Any], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Unit
      ): Self = StObject.set(x, "onNodeDragStart", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnNodeDrop(
        value: (/* e */ DragEvent[Any], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Unit
      ): Self = StObject.set(x, "onNodeDrop", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnNodeExpand(
        value: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode[TreeDataType]) => Unit
      ): Self = StObject.set(x, "onNodeExpand", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeLoad(value: EventDataNode[TreeDataType] => Unit): Self = StObject.set(x, "onNodeLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNodeMouseEnter(
        value: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode[TreeDataType]) => Unit
      ): Self = StObject.set(x, "onNodeMouseEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeMouseLeave(
        value: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode[TreeDataType]) => Unit
      ): Self = StObject.set(x, "onNodeMouseLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnNodeSelect(
        value: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode[TreeDataType]) => Unit
      ): Self = StObject.set(x, "onNodeSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitcherIcon(value: IconType): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitcherIconFunction1(value: /* props */ TreeNodeProps[DataNode] => ReactElement): Self = StObject.set(x, "switcherIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSwitcherIconReactElement(value: ReactElement): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleRender(value: /* node */ Any => ReactElement): Self = StObject.set(x, "titleRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitleRenderUndefined: Self = StObject.set(x, "titleRender", js.undefined)
    }
  }
}
