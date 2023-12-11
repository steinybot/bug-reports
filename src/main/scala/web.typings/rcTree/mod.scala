package web.typings.rcTree

import web.typings.rcTree.anon.DropLevelOffset
import web.typings.rcTree.anon.PartialTreeStateDataNode
import web.typings.rcTree.esInterfaceMod.BasicDataNode
import web.typings.rcTree.esInterfaceMod.DataNode
import web.typings.rcTree.esInterfaceMod.TreeNodeProps
import web.typings.rcTree.esTreeMod.TreeProps
import web.typings.rcTree.esTreeMod.TreeState
import web.typings.react.mod.JSX.Element
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-tree", JSImport.Default)
  @js.native
  class default[TreeDataType /* <: DataNode | BasicDataNode */] ()
    extends web.typings.rcTree.esTreeMod.default[TreeDataType]
  object default {
    
    @JSImport("rc-tree", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("rc-tree", "default.TreeNode")
    @js.native
    def TreeNode: ReactComponentClass[TreeNodeProps[DataNode]] = js.native
    @scala.inline
    def TreeNode_=(x: ReactComponentClass[TreeNodeProps[DataNode]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TreeNode")(x.asInstanceOf[js.Any])
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-tree", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def allowDrop(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("allowDrop")().asInstanceOf[Boolean]
      
      @JSImport("rc-tree", "default.defaultProps.autoExpandParent")
      @js.native
      def autoExpandParent: Boolean = js.native
      @scala.inline
      def autoExpandParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoExpandParent")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.checkStrictly")
      @js.native
      def checkStrictly: Boolean = js.native
      @scala.inline
      def checkStrictly_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checkStrictly")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.checkable")
      @js.native
      def checkable: Boolean = js.native
      @scala.inline
      def checkable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checkable")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.defaultCheckedKeys")
      @js.native
      def defaultCheckedKeys: js.Array[Any] = js.native
      @scala.inline
      def defaultCheckedKeys_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultCheckedKeys")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.defaultExpandAll")
      @js.native
      def defaultExpandAll: Boolean = js.native
      @scala.inline
      def defaultExpandAll_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultExpandAll")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.defaultExpandParent")
      @js.native
      def defaultExpandParent: Boolean = js.native
      @scala.inline
      def defaultExpandParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultExpandParent")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.defaultExpandedKeys")
      @js.native
      def defaultExpandedKeys: js.Array[Any] = js.native
      @scala.inline
      def defaultExpandedKeys_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultExpandedKeys")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.defaultSelectedKeys")
      @js.native
      def defaultSelectedKeys: js.Array[Any] = js.native
      @scala.inline
      def defaultSelectedKeys_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedKeys")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      @scala.inline
      def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.draggable")
      @js.native
      def draggable: Boolean = js.native
      @scala.inline
      def draggable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("draggable")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.dropIndicatorRender")
      @js.native
      def dropIndicatorRender: js.Function1[/* param0 */ DropLevelOffset, Element] = js.native
      @scala.inline
      def dropIndicatorRender_=(x: js.Function1[/* param0 */ DropLevelOffset, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dropIndicatorRender")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.expandAction")
      @js.native
      def expandAction: Boolean = js.native
      @scala.inline
      def expandAction_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expandAction")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.multiple")
      @js.native
      def multiple: Boolean = js.native
      @scala.inline
      def multiple_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multiple")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      @scala.inline
      def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.selectable")
      @js.native
      def selectable: Boolean = js.native
      @scala.inline
      def selectable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectable")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.showIcon")
      @js.native
      def showIcon: Boolean = js.native
      @scala.inline
      def showIcon_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showIcon")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.showLine")
      @js.native
      def showLine: Boolean = js.native
      @scala.inline
      def showLine_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showLine")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @scala.inline
    def getDerivedStateFromProps(props: TreeProps[DataNode], prevState: TreeState[DataNode]): PartialTreeStateDataNode = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[PartialTreeStateDataNode]
  }
  
  @JSImport("rc-tree", "TreeNode")
  @js.native
  val TreeNode: ReactComponentClass[TreeNodeProps[DataNode]] = js.native
}
