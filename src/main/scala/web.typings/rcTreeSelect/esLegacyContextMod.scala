package web.typings.rcTreeSelect

import web.typings.rcTree.esInterfaceMod.DataEntity
import web.typings.rcTree.esInterfaceMod.DataNode
import web.typings.rcTree.esInterfaceMod.IconType
import web.typings.rcTree.esInterfaceMod.TreeNodeProps
import web.typings.rcTreeSelect.esInterfaceMod.Key
import web.typings.rcTreeSelect.esInterfaceMod.LegacyDataNode
import web.typings.rcTreeSelect.esInterfaceMod.RawValueType
import web.typings.react.mod.Context
import web.typings.std.Record
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLegacyContextMod extends Shortcut {
  
  @JSImport("rc-tree-select/es/LegacyContext", JSImport.Default)
  @js.native
  val default: Context[LegacyContextProps] = js.native
  
  @js.native
  trait LegacyContextProps extends StObject {
    
    var checkable: Boolean | ReactElement = js.native
    
    var checkedKeys: js.Array[Key] = js.native
    
    var halfCheckedKeys: js.Array[Key] = js.native
    
    var keyEntities: Record[RawValueType, DataEntity[Any]] = js.native
    
    def loadData(treeNode: LegacyDataNode): js.Promise[Any] = js.native
    
    def onTreeExpand(keys: js.Array[Key]): Unit = js.native
    
    def onTreeLoad(loadedKeys: js.Array[Key]): Unit = js.native
    
    var showTreeIcon: Boolean = js.native
    
    var switcherIcon: IconType = js.native
    
    var treeDefaultExpandAll: Boolean = js.native
    
    var treeDefaultExpandedKeys: js.Array[Key] = js.native
    
    var treeExpandedKeys: js.Array[Key] = js.native
    
    var treeIcon: IconType = js.native
    
    var treeLine: Boolean = js.native
    
    var treeLoadedKeys: js.Array[Key] = js.native
    
    var treeMotion: Any = js.native
    
    var treeNodeFilterProp: String = js.native
  }
  object LegacyContextProps {
    
    @scala.inline
    def apply(
      checkable: Boolean | ReactElement,
      checkedKeys: js.Array[Key],
      halfCheckedKeys: js.Array[Key],
      keyEntities: Record[RawValueType, DataEntity[Any]],
      loadData: LegacyDataNode => js.Promise[Any],
      onTreeExpand: js.Array[Key] => Unit,
      onTreeLoad: js.Array[Key] => Unit,
      showTreeIcon: Boolean,
      switcherIcon: IconType,
      treeDefaultExpandAll: Boolean,
      treeDefaultExpandedKeys: js.Array[Key],
      treeExpandedKeys: js.Array[Key],
      treeIcon: IconType,
      treeLine: Boolean,
      treeLoadedKeys: js.Array[Key],
      treeMotion: Any,
      treeNodeFilterProp: String
    ): LegacyContextProps = {
      val __obj = js.Dynamic.literal(checkable = checkable.asInstanceOf[js.Any], checkedKeys = checkedKeys.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any], keyEntities = keyEntities.asInstanceOf[js.Any], loadData = js.Any.fromFunction1(loadData), onTreeExpand = js.Any.fromFunction1(onTreeExpand), onTreeLoad = js.Any.fromFunction1(onTreeLoad), showTreeIcon = showTreeIcon.asInstanceOf[js.Any], switcherIcon = switcherIcon.asInstanceOf[js.Any], treeDefaultExpandAll = treeDefaultExpandAll.asInstanceOf[js.Any], treeDefaultExpandedKeys = treeDefaultExpandedKeys.asInstanceOf[js.Any], treeExpandedKeys = treeExpandedKeys.asInstanceOf[js.Any], treeIcon = treeIcon.asInstanceOf[js.Any], treeLine = treeLine.asInstanceOf[js.Any], treeLoadedKeys = treeLoadedKeys.asInstanceOf[js.Any], treeMotion = treeMotion.asInstanceOf[js.Any], treeNodeFilterProp = treeNodeFilterProp.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegacyContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: LegacyContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckable(value: Boolean | ReactElement): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckableReactElement(value: ReactElement): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "checkedKeys", js.Array(value :_*))
      
      @scala.inline
      def setHalfCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "halfCheckedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "halfCheckedKeys", js.Array(value :_*))
      
      @scala.inline
      def setKeyEntities(value: Record[RawValueType, DataEntity[Any]]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadData(value: LegacyDataNode => js.Promise[Any]): Self = StObject.set(x, "loadData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTreeExpand(value: js.Array[Key] => Unit): Self = StObject.set(x, "onTreeExpand", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTreeLoad(value: js.Array[Key] => Unit): Self = StObject.set(x, "onTreeLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowTreeIcon(value: Boolean): Self = StObject.set(x, "showTreeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitcherIcon(value: IconType): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitcherIconFunction1(value: /* props */ TreeNodeProps[DataNode] => ReactElement): Self = StObject.set(x, "switcherIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSwitcherIconReactElement(value: ReactElement): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeDefaultExpandAll(value: Boolean): Self = StObject.set(x, "treeDefaultExpandAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeDefaultExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "treeDefaultExpandedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeDefaultExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "treeDefaultExpandedKeys", js.Array(value :_*))
      
      @scala.inline
      def setTreeExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "treeExpandedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "treeExpandedKeys", js.Array(value :_*))
      
      @scala.inline
      def setTreeIcon(value: IconType): Self = StObject.set(x, "treeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeIconFunction1(value: /* props */ TreeNodeProps[DataNode] => ReactElement): Self = StObject.set(x, "treeIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTreeIconReactElement(value: ReactElement): Self = StObject.set(x, "treeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeLine(value: Boolean): Self = StObject.set(x, "treeLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeLoadedKeys(value: js.Array[Key]): Self = StObject.set(x, "treeLoadedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeLoadedKeysVarargs(value: Key*): Self = StObject.set(x, "treeLoadedKeys", js.Array(value :_*))
      
      @scala.inline
      def setTreeMotion(value: Any): Self = StObject.set(x, "treeMotion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeNodeFilterProp(value: String): Self = StObject.set(x, "treeNodeFilterProp", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Context[LegacyContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esLegacyContextMod.foo` */
  override def _to: Context[LegacyContextProps] = default
}
