package web.typings.rcUtil

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esReactRenderMod {
  
  @JSImport("rc-util/es/React/render", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def r(node: ReactElement, container: ContainerType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_r")(node.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def render(node: ReactElement, container: ContainerType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(node.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def u(container: ContainerType): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_u")(container.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def unmount(container: ContainerType): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unmount")(container.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcUtil.anon.ElementMARKanyundefined
    - `web.typings`.rcUtil.anon.DocumentFragmentMARKanyun
  */
  trait ContainerType extends StObject
}
