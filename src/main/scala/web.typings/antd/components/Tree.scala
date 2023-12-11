package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.anon.Checked
import web.typings.antd.anon.ShowLeafIcon
import web.typings.antd.esTreeTreeMod.AntTreeNodeProps
import web.typings.antd.esTreeTreeMod.AntdTreeNodeAttribute
import web.typings.antd.esTreeTreeMod.DraggableConfig
import web.typings.antd.esTreeTreeMod.DraggableFn
import web.typings.antd.esTreeTreeMod.SwitcherIcon
import web.typings.antd.esTreeTreeMod.TreeProps
import web.typings.rcTree.anon.Direction
import web.typings.rcTree.anon.DragNode
import web.typings.rcTree.anon.Event
import web.typings.rcTree.anon.EventMouseEvent
import web.typings.rcTree.anon.EventNode
import web.typings.rcTree.anon.Expanded
import web.typings.rcTree.anon.ExpandedKeys
import web.typings.rcTree.esContextTypesMod.NodeDragEventParams
import web.typings.rcTree.esContextTypesMod.NodeMouseEventParams
import web.typings.rcTree.esInterfaceMod.DataNode
import web.typings.rcTree.esInterfaceMod.EventDataNode
import web.typings.rcTree.esInterfaceMod.FieldNames
import web.typings.rcTree.esInterfaceMod.IconType
import web.typings.rcTree.esInterfaceMod.Key
import web.typings.rcTree.esInterfaceMod.TreeNodeProps
import web.typings.rcTree.esTreeMod.AllowDropOptions
import web.typings.rcTree.esTreeMod.CheckInfo
import web.typings.rcTree.esTreeMod.ExpandAction
import web.typings.rcTree.mod.default
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLSpanElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticUIEvent
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tree {
  
  @JSImport("antd/es/tree/Tree", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[DataNode]] {
    
    @scala.inline
    def activeKey(value: Key): this.type = set("activeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def activeKeyNull: this.type = set("activeKey", null)
    
    @scala.inline
    def allowDrop(value: /* options */ AllowDropOptions[DataNode] => Boolean): this.type = set("allowDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def autoExpandParent(value: Boolean): this.type = set("autoExpandParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def blockNode(value: Boolean): this.type = set("blockNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def checkStrictly(value: Boolean): this.type = set("checkStrictly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def checkable(value: Boolean): this.type = set("checkable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def checkedKeys(value: js.Array[Key] | Checked): this.type = set("checkedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def checkedKeysVarargs(value: Key*): this.type = set("checkedKeys", js.Array(value :_*))
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultCheckedKeys(value: js.Array[Key]): this.type = set("defaultCheckedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultCheckedKeysVarargs(value: Key*): this.type = set("defaultCheckedKeys", js.Array(value :_*))
    
    @scala.inline
    def defaultExpandAll(value: Boolean): this.type = set("defaultExpandAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultExpandParent(value: Boolean): this.type = set("defaultExpandParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultExpandedKeys(value: js.Array[Key]): this.type = set("defaultExpandedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultExpandedKeysVarargs(value: Key*): this.type = set("defaultExpandedKeys", js.Array(value :_*))
    
    @scala.inline
    def defaultSelectedKeys(value: js.Array[Key]): this.type = set("defaultSelectedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultSelectedKeysVarargs(value: Key*): this.type = set("defaultSelectedKeys", js.Array(value :_*))
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def draggable(value: DraggableFn | Boolean | DraggableConfig): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def draggableFunction1(value: /* node */ DataNode => Boolean): this.type = set("draggable", js.Any.fromFunction1(value))
    
    @scala.inline
    def dropIndicatorRender(value: /* props */ Direction => ReactElement): this.type = set("dropIndicatorRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def expandAction(value: ExpandAction): this.type = set("expandAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandedKeys(value: js.Array[Key]): this.type = set("expandedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandedKeysVarargs(value: Key*): this.type = set("expandedKeys", js.Array(value :_*))
    
    @scala.inline
    def fieldNames(value: FieldNames): this.type = set("fieldNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterAntTreeNode(value: ReactComponentClass[AntTreeNodeProps] => Boolean): this.type = set("filterAntTreeNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def filterTreeNode(value: /* treeNode */ EventDataNode[DataNode] => Boolean): this.type = set("filterTreeNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(
      value: (js.Function1[/* nodeProps */ AntdTreeNodeAttribute, ReactElement]) | ReactElement | IconType
    ): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconFunction1(
      value: (/* nodeProps */ AntdTreeNodeAttribute) | (/* props */ TreeNodeProps[DataNode]) => ReactElement
    ): this.type = set("icon", js.Any.fromFunction1(value))
    
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemHeight(value: Double): this.type = set("itemHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemScrollOffset(value: Double): this.type = set("itemScrollOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loadData(value: /* treeNode */ EventDataNode[DataNode] => js.Promise[Any]): this.type = set("loadData", js.Any.fromFunction1(value))
    
    @scala.inline
    def loadedKeys(value: js.Array[Key]): this.type = set("loadedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loadedKeysVarargs(value: Key*): this.type = set("loadedKeys", js.Array(value :_*))
    
    @scala.inline
    def motion(value: Any): this.type = set("motion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onActiveChange(value: /* key */ Key => Unit): this.type = set("onActiveChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCheck(
      value: (/* checked */ web.typings.rcTree.anon.Checked | js.Array[Key], /* info */ CheckInfo[DataNode]) => Unit
    ): this.type = set("onCheck", js.Any.fromFunction2(value))
    
    @scala.inline
    def onClick(value: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode[DataNode]) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onContextMenu(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDoubleClick(value: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode[DataNode]) => Unit): this.type = set("onDoubleClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onDragEnd(value: /* info */ NodeDragEventParams[DataNode, HTMLDivElement] => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragEnter(value: /* info */ (NodeDragEventParams[DataNode, HTMLDivElement]) with ExpandedKeys => Unit): this.type = set("onDragEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragLeave(value: /* info */ NodeDragEventParams[DataNode, HTMLDivElement] => Unit): this.type = set("onDragLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragOver(value: /* info */ NodeDragEventParams[DataNode, HTMLDivElement] => Unit): this.type = set("onDragOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragStart(value: /* info */ NodeDragEventParams[DataNode, HTMLDivElement] => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDrop(value: /* info */ (NodeDragEventParams[DataNode, HTMLDivElement]) with DragNode[DataNode] => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def onExpand(value: (/* expandedKeys */ js.Array[Key], /* info */ Expanded[DataNode]) => Unit): this.type = set("onExpand", js.Any.fromFunction2(value))
    
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDown(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoad(value: (/* loadedKeys */ js.Array[Key], /* info */ EventNode[DataNode]) => Unit): this.type = set("onLoad", js.Any.fromFunction2(value))
    
    @scala.inline
    def onMouseEnter(value: /* info */ NodeMouseEventParams[DataNode, HTMLSpanElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseLeave(value: /* info */ NodeMouseEventParams[DataNode, HTMLSpanElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRightClick(value: /* info */ EventMouseEvent[DataNode] => Unit): this.type = set("onRightClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onScroll(value: SyntheticUIEvent[HTMLElement] => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSelect(value: (/* selectedKeys */ js.Array[Key], /* info */ Event[DataNode]) => Unit): this.type = set("onSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rootStyle(value: CSSProperties): this.type = set("rootStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedKeys(value: js.Array[Key]): this.type = set("selectedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedKeysVarargs(value: Key*): this.type = set("selectedKeys", js.Array(value :_*))
    
    @scala.inline
    def showIcon(value: Boolean): this.type = set("showIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showLine(value: Boolean | ShowLeafIcon): this.type = set("showLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def switcherIcon(value: SwitcherIcon | IconType): this.type = set("switcherIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def switcherIconFunction1(value: (/* props */ AntTreeNodeProps) | (/* props */ TreeNodeProps[DataNode]) => ReactElement): this.type = set("switcherIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def switcherIconReactElement(value: ReactElement): this.type = set("switcherIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleRender(value: DataNode => ReactElement): this.type = set("titleRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def treeData(value: js.Array[DataNode]): this.type = set("treeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def treeDataVarargs(value: DataNode*): this.type = set("treeData", js.Array(value :_*))
    
    @scala.inline
    def virtual(value: Boolean): this.type = set("virtual", value.asInstanceOf[js.Any])
  }
  
  type Props = TreeProps[DataNode] with RefAttributes[default[DataNode]]
  
  implicit def make(companion: Tree.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TreeProps[DataNode] with RefAttributes[default[DataNode]]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
