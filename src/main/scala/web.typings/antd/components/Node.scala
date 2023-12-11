package web.typings.antd.components

import web.typings.antd.esSkeletonNodeMod.SkeletonNodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Node {
  
  @JSImport("antd/es/skeleton/Node", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  type Props = SkeletonNodeProps
  
  implicit def make(companion: Node.type): SharedBuilder_SkeletonNodeProps667483374 = new SharedBuilder_SkeletonNodeProps667483374(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SkeletonNodeProps): SharedBuilder_SkeletonNodeProps667483374 = new SharedBuilder_SkeletonNodeProps667483374(js.Array(this.component, p.asInstanceOf[js.Any]))
}
