package web.typings.rcUtil

import web.typings.react.mod.Ref
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esRefMod {
  
  @JSImport("rc-util/es/ref", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def composeRef[T](refs: Ref[T]*): Ref[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("composeRef")(refs.asInstanceOf[Seq[js.Any]] :_*)).asInstanceOf[Ref[T]]
  
  @scala.inline
  def fillRef[T](ref: Ref[T], node: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillRef")(ref.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def supportNodeRef(node: ReactElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportNodeRef")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def supportRef(nodeOrComponent: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportRef")(nodeOrComponent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def useComposeRef[T](refs: Ref[T]*): Ref[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useComposeRef")(refs.asInstanceOf[Seq[js.Any]] :_*)).asInstanceOf[Ref[T]]
}
