package web.typings.rcUtil

import web.typings.rcUtil.anon.DefaultValue
import web.typings.rcUtil.esHooksUseMergedStateMod.Updater
import web.typings.rcUtil.esUtilsSetMod.Path
import web.typings.rcUtil.esWarningMod.preMessageFn
import web.typings.react.mod.Ref
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def get(entity: Any, path: js.Array[String | Double | js.Symbol]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(entity.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @scala.inline
  def set[Entity, Output, Value](entity: Entity, paths: Path, value: Value): Output = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(entity.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Output]
  @scala.inline
  def set[Entity, Output, Value](entity: Entity, paths: Path, value: Value, removeIfUndefined: Boolean): Output = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(entity.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], value.asInstanceOf[js.Any], removeIfUndefined.asInstanceOf[js.Any])).asInstanceOf[Output]
  
  @scala.inline
  def supportNodeRef(node: ReactElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportNodeRef")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def supportRef(nodeOrComponent: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportRef")(nodeOrComponent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def useComposeRef[T](refs: Ref[T]*): Ref[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useComposeRef")(refs.asInstanceOf[Seq[js.Any]] :_*)).asInstanceOf[Ref[T]]
  
  @scala.inline
  def useEvent[T /* <: js.Function */](callback: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useEvent")(callback.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def useMergedState[T, R](defaultStateValue: T): js.Tuple2[R, Updater[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMergedState")(defaultStateValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[R, Updater[T]]]
  @scala.inline
  def useMergedState[T, R](defaultStateValue: T, option: DefaultValue[T]): js.Tuple2[R, Updater[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMergedState")(defaultStateValue.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[R, Updater[T]]]
  @scala.inline
  def useMergedState[T, R](defaultStateValue: js.Function0[T]): js.Tuple2[R, Updater[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMergedState")(defaultStateValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[R, Updater[T]]]
  @scala.inline
  def useMergedState[T, R](defaultStateValue: js.Function0[T], option: DefaultValue[T]): js.Tuple2[R, Updater[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMergedState")(defaultStateValue.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[R, Updater[T]]]
  
  object warning {
    
    @scala.inline
    def apply(valid: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].apply(valid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("rc-util", "warning")
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof imported_warning.noteOnce` */
    @scala.inline
    def noteOnce(valid: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noteOnce")(valid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("rc-util", "warning.preMessage")
    @js.native
    def preMessage: js.Function1[/* fn */ preMessageFn, Unit] = js.native
    @scala.inline
    def preMessage_=(x: js.Function1[/* fn */ preMessageFn, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preMessage")(x.asInstanceOf[js.Any])
    
    /* was `typeof imported_warning.resetWarned` */
    @scala.inline
    def resetWarned(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetWarned")().asInstanceOf[Unit]
  }
}
