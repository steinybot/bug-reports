package web.typings.antd

import web.typings.antd.anon.DirectoryTree
import web.typings.antd.anon.`114`
import web.typings.antd.esTreeTreeMod.TreeProps
import web.typings.rcTree.esInterfaceMod.DataNode
import web.typings.react.mod.PropsWithChildren
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTreeMod extends Shortcut {
  
  @JSImport("antd/es/tree", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  type CompoundedComponent = (js.Function1[/* props */ PropsWithChildren[TreeProps[DataNode]] with `114`, ReactElement]) with DirectoryTree
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `esTreeMod.foo` */
  override def _to: CompoundedComponent = default
}
