package web.typings.antd

import web.typings.antd.anon.`114`
import web.typings.antd.anon.`2`
import web.typings.antd.esTreeTreeMod.TreeProps
import web.typings.rcTree.esInterfaceMod.BasicDataNode
import web.typings.rcTree.esInterfaceMod.DataNode
import web.typings.rcTree.esInterfaceMod.Key
import web.typings.react.mod.PropsWithChildren
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTreeDirectoryTreeMod extends Shortcut {
  
  @JSImport("antd/es/tree/DirectoryTree", JSImport.Default)
  @js.native
  val default: DirectoryTreeCompoundedComponent = js.native
  
  type DirectoryTreeCompoundedComponent = (js.Function1[
    /* props */ PropsWithChildren[DirectoryTreeProps[DataNode]] with `114`, 
    ReactElement
  ]) with `2`
  
  @js.native
  trait DirectoryTreeProps[T /* <: BasicDataNode */]
    extends StObject
       with TreeProps[T] {
    
    @JSName("expandAction")
    var expandAction_DirectoryTreeProps: js.UndefOr[ExpandAction] = js.native
  }
  object DirectoryTreeProps {
    
    @scala.inline
    def apply[T /* <: BasicDataNode */](): DirectoryTreeProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectoryTreeProps[T]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DirectoryTreeProps[_], T /* <: BasicDataNode */] (val x: Self with DirectoryTreeProps[T]) extends AnyVal {
      
      @scala.inline
      def setExpandAction(value: ExpandAction): Self = StObject.set(x, "expandAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandActionUndefined: Self = StObject.set(x, "expandAction", js.undefined)
    }
  }
  
  @js.native
  trait DirectoryTreeState extends StObject {
    
    var expandedKeys: js.UndefOr[js.Array[Key]] = js.native
    
    var selectedKeys: js.UndefOr[js.Array[Key]] = js.native
  }
  object DirectoryTreeState {
    
    @scala.inline
    def apply(): DirectoryTreeState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectoryTreeState]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DirectoryTreeState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedKeysUndefined: Self = StObject.set(x, "expandedKeys", js.undefined)
      
      @scala.inline
      def setExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "expandedKeys", js.Array(value :_*))
      
      @scala.inline
      def setSelectedKeys(value: js.Array[Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
      
      @scala.inline
      def setSelectedKeysVarargs(value: Key*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdBooleans.`false`
    - `web.typings`.antd.antdStrings.click
    - `web.typings`.antd.antdStrings.doubleClick
  */
  trait ExpandAction extends StObject
  object ExpandAction {
    
    @scala.inline
    def click: web.typings.antd.antdStrings.click = "click".asInstanceOf[web.typings.antd.antdStrings.click]
    
    @scala.inline
    def doubleClick: web.typings.antd.antdStrings.doubleClick = "doubleClick".asInstanceOf[web.typings.antd.antdStrings.doubleClick]
    
    @scala.inline
    def `false`: web.typings.antd.antdBooleans.`false` = false.asInstanceOf[web.typings.antd.antdBooleans.`false`]
  }
  
  type _To = DirectoryTreeCompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `esTreeDirectoryTreeMod.foo` */
  override def _to: DirectoryTreeCompoundedComponent = default
}
