package web.typings.react.mod

import web.typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Sync with `ReactChildren` until `ReactChildren` is removed.
object Children {
  
  @JSImport("react", "Children")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def count(children: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(children.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def forEach[C](children: C, fn: js.Function2[/* child */ C, /* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(children.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def forEach[C](children: js.Array[C], fn: js.Function2[/* child */ C, /* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(children.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def map[T, C](children: C, fn: js.Function2[/* child */ C, /* index */ Double, T]): /* import warning: importer.ImportType#apply Failed type conversion: C extends null | undefined ? C : std.Array<std.Exclude<T, boolean | null | undefined>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(children.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: C extends null | undefined ? C : std.Array<std.Exclude<T, boolean | null | undefined>> */ js.Any]
  @scala.inline
  def map[T, C](children: js.Array[C], fn: js.Function2[/* child */ C, /* index */ Double, T]): /* import warning: importer.ImportType#apply Failed type conversion: C extends null | undefined ? C : std.Array<std.Exclude<T, boolean | null | undefined>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(children.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: C extends null | undefined ? C : std.Array<std.Exclude<T, boolean | null | undefined>> */ js.Any]
  
  @scala.inline
  def only[C](children: C): /* import warning: importer.ImportType#apply Failed type conversion: C extends std.Array<any> ? never : C */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("only")(children.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: C extends std.Array<any> ? never : C */ js.Any]
  
  @scala.inline
  def toArray(children: js.Array[slinky.core.facade.ReactElement]): js.Array[Exclude[slinky.core.facade.ReactElement, js.UndefOr[Boolean | Null]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[Exclude[slinky.core.facade.ReactElement, js.UndefOr[Boolean | Null]]]]
  @scala.inline
  def toArray(children: slinky.core.facade.ReactElement): js.Array[Exclude[slinky.core.facade.ReactElement, js.UndefOr[Boolean | Null]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[Exclude[slinky.core.facade.ReactElement, js.UndefOr[Boolean | Null]]]]
}
