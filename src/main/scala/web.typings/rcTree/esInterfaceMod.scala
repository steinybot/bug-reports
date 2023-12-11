package web.typings.rcTree

import web.typings.rcTree.anon.Active
import web.typings.rcTree.anon.FieldDataNodekeyKeytitleR
import web.typings.rcTree.anon.IsTreeNode
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.Component
import web.typings.react.mod.MouseEventHandler
import web.typings.react.mod.Ref
import web.typings.std.Exclude
import web.typings.std.Partial
import web.typings.std.Record
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLSpanElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInterfaceMod {
  
  @js.native
  trait BasicDataNode extends StObject {
    
    var checkable: js.UndefOr[Boolean] = js.native
    
    /** Set style of TreeNode. This is not recommend if you don't have any force requirement */
    var className: js.UndefOr[String] = js.native
    
    var disableCheckbox: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[IconType] = js.native
    
    var isLeaf: js.UndefOr[Boolean] = js.native
    
    var selectable: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var switcherIcon: js.UndefOr[IconType] = js.native
  }
  object BasicDataNode {
    
    @scala.inline
    def apply(): BasicDataNode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicDataNode]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: BasicDataNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
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
      def setIcon(value: IconType): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFunction1(value: /* props */ TreeNodeProps[DataNode] => ReactElement): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLeafUndefined: Self = StObject.set(x, "isLeaf", js.undefined)
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
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
    }
  }
  
  /* Inlined parent std.Omit<rc-tree.rc-tree/es/interface.Entity, 'node' | 'parent' | 'children'> */
  @js.native
  trait DataEntity[TreeDataType /* <: BasicDataNode */] extends StObject {
    
    var children: js.UndefOr[js.Array[DataEntity[TreeDataType]]] = js.native
    
    var index: Double = js.native
    
    var key: Key = js.native
    
    var level: Double = js.native
    
    var node: TreeDataType = js.native
    
    var nodes: js.Array[TreeDataType] = js.native
    
    var parent: js.UndefOr[DataEntity[TreeDataType]] = js.native
    
    var pos: String = js.native
  }
  object DataEntity {
    
    @scala.inline
    def apply[TreeDataType /* <: BasicDataNode */](
      index: Double,
      key: Key,
      level: Double,
      node: TreeDataType,
      nodes: js.Array[TreeDataType],
      pos: String
    ): DataEntity[TreeDataType] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataEntity[TreeDataType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DataEntity[_], TreeDataType /* <: BasicDataNode */] (val x: Self with DataEntity[TreeDataType]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[DataEntity[TreeDataType]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: DataEntity[TreeDataType]*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: TreeDataType): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodes(value: js.Array[TreeDataType]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesVarargs(value: TreeDataType*): Self = StObject.set(x, "nodes", js.Array(value :_*))
      
      @scala.inline
      def setParent(value: DataEntity[TreeDataType]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined rc-tree.rc-tree/es/interface.FieldDataNode<{  key :rc-tree.rc-tree/es/interface.Key,   title :react.react.ReactNode | (data : rc-tree.rc-tree/es/interface.DataNode): react.react.ReactNode | undefined}, 'children'> */
  @js.native
  trait DataNode extends StObject {
    
    var checkable: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[js.Array[FieldDataNodekeyKeytitleR]] = js.native
    
    /** Set style of TreeNode. This is not recommend if you don't have any force requirement */
    var className: js.UndefOr[String] = js.native
    
    var disableCheckbox: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[IconType] = js.native
    
    var isLeaf: js.UndefOr[Boolean] = js.native
    
    var key: Key = js.native
    
    var selectable: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var switcherIcon: js.UndefOr[IconType] = js.native
    
    var title: js.UndefOr[ReactElement | (js.Function1[/* data */ this.type, ReactElement])] = js.native
  }
  object DataNode {
    
    @scala.inline
    def apply(key: Key): DataNode = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataNode]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DataNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      @scala.inline
      def setChildren(value: js.Array[FieldDataNodekeyKeytitleR]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: FieldDataNodekeyKeytitleR*): Self = StObject.set(x, "children", js.Array(value :_*))
      
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
      def setIcon(value: IconType): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFunction1(value: /* props */ TreeNodeProps[DataNode] => ReactElement): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
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
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
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
      def setTitle(value: ReactElement | (js.Function1[DataNode, ReactElement])): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFunction1(value: DataNode => ReactElement): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcTree.rcTreeStrings.ltr
    - `web.typings`.rcTree.rcTreeStrings.rtl
    - scala.Unit
  */
  type Direction = js.UndefOr[_Direction]
  
  @js.native
  trait Entity extends StObject {
    
    var children: js.UndefOr[js.Array[Entity]] = js.native
    
    var index: Double = js.native
    
    var key: Key = js.native
    
    var node: NodeElement = js.native
    
    var parent: js.UndefOr[Entity] = js.native
    
    var pos: String = js.native
  }
  object Entity {
    
    @scala.inline
    def apply(index: Double, key: Key, node: NodeElement, pos: String): Entity = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entity]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Entity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[Entity]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: Entity*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: NodeElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: Entity): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
  
  type EventDataNode[TreeDataType] = Active with TreeDataType with BasicDataNode
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type FieldDataNode = rc-tree.rc-tree/es/interface.BasicDataNode & T & std.Partial<std.Record<ChildFieldName, std.Array<rc-tree.rc-tree/es/interface.FieldDataNode<T, ChildFieldName>>>>
  }}}
  to avoid circular code involving: 
  - rc-tree.rc-tree/es/interface.FieldDataNode
  */
  type FieldDataNode[T, ChildFieldName /* <: String */] = BasicDataNode with T with (Partial[Record[ChildFieldName, js.Array[Any]]])
  
  @js.native
  trait FieldNames extends StObject {
    
    /** @private Internal usage for `rc-tree-select`, safe to remove if no need */
    var _title: js.UndefOr[js.Array[String]] = js.native
    
    var children: js.UndefOr[String] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object FieldNames {
    
    @scala.inline
    def apply(): FieldNames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldNames]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FieldNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def set_title(value: js.Array[String]): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
      
      @scala.inline
      def set_titleVarargs(value: String*): Self = StObject.set(x, "_title", js.Array(value :_*))
    }
  }
  
  @js.native
  trait FlattenNode[TreeDataType /* <: BasicDataNode */] extends StObject {
    
    var children: js.Array[FlattenNode[TreeDataType]] = js.native
    
    var data: TreeDataType = js.native
    
    var isEnd: js.Array[Boolean] = js.native
    
    var isStart: js.Array[Boolean] = js.native
    
    var key: Key = js.native
    
    var parent: FlattenNode[TreeDataType] | Null = js.native
    
    var pos: String = js.native
    
    var title: ReactElement = js.native
  }
  object FlattenNode {
    
    @scala.inline
    def apply[TreeDataType /* <: BasicDataNode */](
      children: js.Array[FlattenNode[TreeDataType]],
      data: TreeDataType,
      isEnd: js.Array[Boolean],
      isStart: js.Array[Boolean],
      key: Key,
      pos: String,
      title: ReactElement
    ): FlattenNode[TreeDataType] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], isEnd = isEnd.asInstanceOf[js.Any], isStart = isStart.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], parent = null)
      __obj.asInstanceOf[FlattenNode[TreeDataType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FlattenNode[_], TreeDataType /* <: BasicDataNode */] (val x: Self with FlattenNode[TreeDataType]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[FlattenNode[TreeDataType]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: FlattenNode[TreeDataType]*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setData(value: TreeDataType): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEnd(value: js.Array[Boolean]): Self = StObject.set(x, "isEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEndVarargs(value: Boolean*): Self = StObject.set(x, "isEnd", js.Array(value :_*))
      
      @scala.inline
      def setIsStart(value: js.Array[Boolean]): Self = StObject.set(x, "isStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStartVarargs(value: Boolean*): Self = StObject.set(x, "isStart", js.Array(value :_*))
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: FlattenNode[TreeDataType]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentNull: Self = StObject.set(x, "parent", null)
      
      @scala.inline
      def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type GetCheckDisabled[RecordType] = js.Function1[/* record */ RecordType, Boolean]
  
  type GetKey[RecordType] = js.Function2[/* record */ RecordType, /* index */ js.UndefOr[Double], Key]
  
  type IconType = ReactElement | (js.Function1[/* props */ TreeNodeProps[DataNode], ReactElement])
  
  type Key = web.typings.react.mod.Key
  
  type KeyEntities[DateType /* <: BasicDataNode */] = Record[SafeKey, DataEntity[DateType]]
  
  @js.native
  trait NodeElement
    extends StObject
       with web.typings.react.mod.ReactElement {
    
    var selectHandle: js.UndefOr[HTMLSpanElement] = js.native
    
    @JSName("type")
    var type_NodeElement: IsTreeNode = js.native
  }
  object NodeElement {
    
    @scala.inline
    def apply(props: Any, `type`: IsTreeNode): NodeElement = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], key = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeElement]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: NodeElement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelectHandle(value: HTMLSpanElement): Self = StObject.set(x, "selectHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectHandleUndefined: Self = StObject.set(x, "selectHandle", js.undefined)
      
      @scala.inline
      def setType(value: IsTreeNode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NodeInstance[TreeDataType /* <: BasicDataNode */]
    extends Component[TreeNodeProps[TreeDataType], js.Object, Any] {
    
    var selectHandle: js.UndefOr[HTMLSpanElement] = js.native
  }
  
  type SafeKey = Exclude[Key, js.BigInt]
  
  @js.native
  trait TreeNodeProps[TreeDataType /* <: BasicDataNode */] extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var checkable: js.UndefOr[Boolean] = js.native
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    /** New added in Tree for easy data access */
    var data: js.UndefOr[TreeDataType] = js.native
    
    var disableCheckbox: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var domRef: js.UndefOr[Ref[HTMLDivElement]] = js.native
    
    var dragOver: js.UndefOr[Boolean] = js.native
    
    var dragOverGapBottom: js.UndefOr[Boolean] = js.native
    
    var dragOverGapTop: js.UndefOr[Boolean] = js.native
    
    var eventKey: js.UndefOr[Key] = js.native
    
    var expanded: js.UndefOr[Boolean] = js.native
    
    var halfChecked: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[IconType] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var isEnd: js.UndefOr[js.Array[Boolean]] = js.native
    
    var isLeaf: js.UndefOr[Boolean] = js.native
    
    var isStart: js.UndefOr[js.Array[Boolean]] = js.native
    
    var loaded: js.UndefOr[Boolean] = js.native
    
    var loading: js.UndefOr[Boolean] = js.native
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var pos: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var selectable: js.UndefOr[Boolean] = js.native
    
    var selected: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var switcherIcon: js.UndefOr[IconType] = js.native
    
    var title: js.UndefOr[ReactElement | (js.Function1[/* data */ TreeDataType, ReactElement])] = js.native
  }
  object TreeNodeProps {
    
    @scala.inline
    def apply[TreeDataType /* <: BasicDataNode */](): TreeNodeProps[TreeDataType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeNodeProps[TreeDataType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TreeNodeProps[_], TreeDataType /* <: BasicDataNode */] (val x: Self with TreeNodeProps[TreeDataType]) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
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
      def setData(value: TreeDataType): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDisableCheckbox(value: Boolean): Self = StObject.set(x, "disableCheckbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCheckboxUndefined: Self = StObject.set(x, "disableCheckbox", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDomRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "domRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "domRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDomRefNull: Self = StObject.set(x, "domRef", null)
      
      @scala.inline
      def setDomRefReactRef(value: ReactRef[HTMLDivElement]): Self = StObject.set(x, "domRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomRefUndefined: Self = StObject.set(x, "domRef", js.undefined)
      
      @scala.inline
      def setDragOver(value: Boolean): Self = StObject.set(x, "dragOver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragOverGapBottom(value: Boolean): Self = StObject.set(x, "dragOverGapBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragOverGapBottomUndefined: Self = StObject.set(x, "dragOverGapBottom", js.undefined)
      
      @scala.inline
      def setDragOverGapTop(value: Boolean): Self = StObject.set(x, "dragOverGapTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragOverGapTopUndefined: Self = StObject.set(x, "dragOverGapTop", js.undefined)
      
      @scala.inline
      def setDragOverUndefined: Self = StObject.set(x, "dragOver", js.undefined)
      
      @scala.inline
      def setEventKey(value: Key): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      @scala.inline
      def setHalfChecked(value: Boolean): Self = StObject.set(x, "halfChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfCheckedUndefined: Self = StObject.set(x, "halfChecked", js.undefined)
      
      @scala.inline
      def setIcon(value: IconType): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFunction1(value: /* props */ TreeNodeProps[DataNode] => ReactElement): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsEnd(value: js.Array[Boolean]): Self = StObject.set(x, "isEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEndUndefined: Self = StObject.set(x, "isEnd", js.undefined)
      
      @scala.inline
      def setIsEndVarargs(value: Boolean*): Self = StObject.set(x, "isEnd", js.Array(value :_*))
      
      @scala.inline
      def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLeafUndefined: Self = StObject.set(x, "isLeaf", js.undefined)
      
      @scala.inline
      def setIsStart(value: js.Array[Boolean]): Self = StObject.set(x, "isStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStartUndefined: Self = StObject.set(x, "isStart", js.undefined)
      
      @scala.inline
      def setIsStartVarargs(value: Boolean*): Self = StObject.set(x, "isStart", js.Array(value :_*))
      
      @scala.inline
      def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setOnMouseMove(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosUndefined: Self = StObject.set(x, "pos", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
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
      def setTitle(value: ReactElement | (js.Function1[/* data */ TreeDataType, ReactElement])): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFunction1(value: /* data */ TreeDataType => ReactElement): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait _Direction extends StObject
}
