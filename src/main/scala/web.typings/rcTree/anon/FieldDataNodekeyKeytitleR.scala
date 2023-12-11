package web.typings.rcTree.anon

import web.typings.rcTree.esInterfaceMod.DataNode
import web.typings.rcTree.esInterfaceMod.FieldDataNode
import web.typings.rcTree.esInterfaceMod.IconType
import web.typings.rcTree.esInterfaceMod.TreeNodeProps
import web.typings.rcTree.rcTreeStrings.children
import web.typings.react.mod.CSSProperties
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined rc-tree.rc-tree/es/interface.FieldDataNode<{  key :rc-tree.rc-tree/es/interface.Key,   title :react.react.ReactNode | (data : rc-tree.rc-tree/es/interface.DataNode): react.react.ReactNode | undefined}, 'children'> */
@js.native
trait FieldDataNodekeyKeytitleR extends StObject {
  
  var checkable: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[js.Array[FieldDataNode[Key, web.typings.rcTree.rcTreeStrings.children]]] = js.native
  
  /** Set style of TreeNode. This is not recommend if you don't have any force requirement */
  var className: js.UndefOr[String] = js.native
  
  var disableCheckbox: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var icon: js.UndefOr[IconType] = js.native
  
  var isLeaf: js.UndefOr[Boolean] = js.native
  
  var key: web.typings.rcTree.esInterfaceMod.Key = js.native
  
  var selectable: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var switcherIcon: js.UndefOr[IconType] = js.native
  
  var title: js.UndefOr[ReactElement | (js.Function1[/* data */ this.type, ReactElement])] = js.native
}
object FieldDataNodekeyKeytitleR {
  
  @scala.inline
  def apply(key: web.typings.rcTree.esInterfaceMod.Key): FieldDataNodekeyKeytitleR = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldDataNodekeyKeytitleR]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: FieldDataNodekeyKeytitleR] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
    
    @scala.inline
    def setChildren(value: js.Array[FieldDataNode[Key, children]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: (FieldDataNode[Key, children])*): Self = StObject.set(x, "children", js.Array(value :_*))
    
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
    def setKey(value: web.typings.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
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
    def setTitle(value: ReactElement | (js.Function1[FieldDataNodekeyKeytitleR, ReactElement])): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFunction1(value: FieldDataNodekeyKeytitleR => ReactElement): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
