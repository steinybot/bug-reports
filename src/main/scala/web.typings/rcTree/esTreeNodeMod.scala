package web.typings.rcTree

import web.typings.rcTree.esContextTypesMod.TreeContextProps
import web.typings.rcTree.esInterfaceMod.DataNode
import web.typings.rcTree.esInterfaceMod.TreeNodeProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTreeNodeMod extends Shortcut {
  
  @JSImport("rc-tree/es/TreeNode", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TreeNodeProps[DataNode]] = js.native
  
  @js.native
  trait InternalTreeNodeProps
    extends StObject
       with TreeNodeProps[DataNode] {
    
    var context: js.UndefOr[TreeContextProps[DataNode]] = js.native
  }
  object InternalTreeNodeProps {
    
    @scala.inline
    def apply(): InternalTreeNodeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternalTreeNodeProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: InternalTreeNodeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: TreeContextProps[DataNode]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    }
  }
  
  @js.native
  trait TreeNodeState extends StObject {
    
    var dragNodeHighlight: Boolean = js.native
  }
  object TreeNodeState {
    
    @scala.inline
    def apply(dragNodeHighlight: Boolean): TreeNodeState = {
      val __obj = js.Dynamic.literal(dragNodeHighlight = dragNodeHighlight.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeNodeState]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TreeNodeState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDragNodeHighlight(value: Boolean): Self = StObject.set(x, "dragNodeHighlight", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[TreeNodeProps[DataNode]]
  
  /* This means you don't have to write `default`, but can instead just say `esTreeNodeMod.foo` */
  override def _to: ReactComponentClass[TreeNodeProps[DataNode]] = default
}
