package web.typings.rcFieldForm

import web.typings.rcFieldForm.esInterfaceMod.EventArgs
import web.typings.rcFieldForm.esInterfaceMod.InternalNamePath
import web.typings.rcFieldForm.esInterfaceMod.NamePath
import web.typings.rcFieldForm.esInterfaceMod.Store
import web.typings.rcUtil.esUtilsSetMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsValueUtilMod {
  
  @JSImport("rc-field-form/es/utils/valueUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def cloneByNamePathList(store: Store, namePathList: js.Array[InternalNamePath]): Store = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneByNamePathList")(store.asInstanceOf[js.Any], namePathList.asInstanceOf[js.Any])).asInstanceOf[Store]
  
  @scala.inline
  def containsNamePath(namePathList: js.Array[InternalNamePath], namePath: InternalNamePath): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsNamePath")(namePathList.asInstanceOf[js.Any], namePath.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def containsNamePath(namePathList: js.Array[InternalNamePath], namePath: InternalNamePath, partialMatch: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containsNamePath")(namePathList.asInstanceOf[js.Any], namePath.asInstanceOf[js.Any], partialMatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def defaultGetValueFromEvent(
    valuePropName: String,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventArgs is not an array type */ args: EventArgs
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultGetValueFromEvent")(valuePropName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @scala.inline
  def getNamePath(): InternalNamePath = ^.asInstanceOf[js.Dynamic].applyDynamic("getNamePath")().asInstanceOf[InternalNamePath]
  @scala.inline
  def getNamePath(path: NamePath[Any]): InternalNamePath = ^.asInstanceOf[js.Dynamic].applyDynamic("getNamePath")(path.asInstanceOf[js.Any]).asInstanceOf[InternalNamePath]
  
  @scala.inline
  def getValue(entity: Any, path: js.Array[String | Double | js.Symbol]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getValue")(entity.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @scala.inline
  def isSimilar(source: SimilarObject, target: SimilarObject): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSimilar")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def matchNamePath(namePath: InternalNamePath): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("matchNamePath")(namePath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def matchNamePath(namePath: InternalNamePath, subNamePath: InternalNamePath): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchNamePath")(namePath.asInstanceOf[js.Any], subNamePath.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def matchNamePath(namePath: InternalNamePath, subNamePath: InternalNamePath, partialMatch: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchNamePath")(namePath.asInstanceOf[js.Any], subNamePath.asInstanceOf[js.Any], partialMatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def matchNamePath(namePath: InternalNamePath, subNamePath: Null, partialMatch: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchNamePath")(namePath.asInstanceOf[js.Any], subNamePath.asInstanceOf[js.Any], partialMatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def move[T](array: js.Array[T], moveIndex: Double, toIndex: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(array.asInstanceOf[js.Any], moveIndex.asInstanceOf[js.Any], toIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def setValue[Entity, Output, Value](entity: Entity, paths: Path, value: Value): Output = (^.asInstanceOf[js.Dynamic].applyDynamic("setValue")(entity.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Output]
  @scala.inline
  def setValue[Entity, Output, Value](entity: Entity, paths: Path, value: Value, removeIfUndefined: Boolean): Output = (^.asInstanceOf[js.Dynamic].applyDynamic("setValue")(entity.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], value.asInstanceOf[js.Any], removeIfUndefined.asInstanceOf[js.Any])).asInstanceOf[Output]
  
  type SimilarObject = String | Double | js.Object
}
