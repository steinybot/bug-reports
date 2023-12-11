package web.typings.rcTreeSelect

import web.typings.rcTreeSelect.anon.Children
import web.typings.rcTreeSelect.anon.SHOWALL
import web.typings.rcTreeSelect.esTreeNodeMod.TreeNodeProps
import web.typings.rcTreeSelect.esTreeSelectMod.DefaultOptionType
import web.typings.rcTreeSelect.esTreeSelectMod.TreeSelectProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-tree-select", JSImport.Default)
  @js.native
  val default: (js.Function1[/* props */ Children with (TreeSelectProps[Any, DefaultOptionType]), ReactElement]) with SHOWALL = js.native
  
  @JSImport("rc-tree-select", "SHOW_ALL")
  @js.native
  val SHOW_ALL: /* "SHOW_ALL" */ String = js.native
  
  @JSImport("rc-tree-select", "SHOW_CHILD")
  @js.native
  val SHOW_CHILD: /* "SHOW_CHILD" */ String = js.native
  
  @JSImport("rc-tree-select", "SHOW_PARENT")
  @js.native
  val SHOW_PARENT: /* "SHOW_PARENT" */ String = js.native
  
  /** This is a placeholder, not real render in dom */
  @JSImport("rc-tree-select", "TreeNode")
  @js.native
  val TreeNode: ReactComponentClass[TreeNodeProps] = js.native
  
  type _To = (js.Function1[/* props */ Children with (TreeSelectProps[Any, DefaultOptionType]), ReactElement]) with SHOWALL
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: (js.Function1[/* props */ Children with (TreeSelectProps[Any, DefaultOptionType]), ReactElement]) with SHOWALL = default
}
