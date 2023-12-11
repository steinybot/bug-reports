package web.typings.antd

import web.typings.antd.esThemeInterfacePresetColorsMod.PresetColorType
import web.typings.antd.esThemeInterfaceSeedsMod.SeedToken
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esThemeThemesSeedMod extends Shortcut {
  
  @JSImport("antd/es/theme/themes/seed", JSImport.Default)
  @js.native
  val default: SeedToken = js.native
  
  @JSImport("antd/es/theme/themes/seed", "defaultPresetColors")
  @js.native
  val defaultPresetColors: PresetColorType = js.native
  
  type _To = SeedToken
  
  /* This means you don't have to write `default`, but can instead just say `esThemeThemesSeedMod.foo` */
  override def _to: SeedToken = default
}
