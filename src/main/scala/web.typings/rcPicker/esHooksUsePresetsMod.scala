package web.typings.rcPicker

import web.typings.rcPicker.esInterfaceMod.PresetDate
import web.typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUsePresetsMod {
  
  @JSImport("rc-picker/es/hooks/usePresets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](): js.Array[PresetDate[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Array[PresetDate[T]]]
  @scala.inline
  def default[T](presets: js.Array[PresetDate[T]]): js.Array[PresetDate[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(presets.asInstanceOf[js.Any]).asInstanceOf[js.Array[PresetDate[T]]]
  @scala.inline
  def default[T](presets: js.Array[PresetDate[T]], legacyRanges: Record[String, T | js.Function0[T]]): js.Array[PresetDate[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(presets.asInstanceOf[js.Any], legacyRanges.asInstanceOf[js.Any])).asInstanceOf[js.Array[PresetDate[T]]]
  @scala.inline
  def default[T](presets: Unit, legacyRanges: Record[String, T | js.Function0[T]]): js.Array[PresetDate[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(presets.asInstanceOf[js.Any], legacyRanges.asInstanceOf[js.Any])).asInstanceOf[js.Array[PresetDate[T]]]
}
