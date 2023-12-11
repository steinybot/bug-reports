package web.typings.antd

import web.typings.antd.antdStrings.blue
import web.typings.antd.antdStrings.cyan
import web.typings.antd.antdStrings.geekblue
import web.typings.antd.antdStrings.gold
import web.typings.antd.antdStrings.green
import web.typings.antd.antdStrings.lime
import web.typings.antd.antdStrings.magenta
import web.typings.antd.antdStrings.orange
import web.typings.antd.antdStrings.pink
import web.typings.antd.antdStrings.purple
import web.typings.antd.antdStrings.red
import web.typings.antd.antdStrings.volcano
import web.typings.antd.antdStrings.yellow
import web.typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esThemeInterfacePresetColorsMod {
  
  @JSImport("antd/es/theme/interface/presetColors", "PresetColors")
  @js.native
  val PresetColors: js.Tuple13[blue, purple, cyan, green, magenta, pink, red, orange, yellow, volcano, geekblue, lime, gold] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdInts.`1`
    - `web.typings`.antd.antdInts.`2`
    - `web.typings`.antd.antdInts.`3`
    - `web.typings`.antd.antdInts.`4`
    - `web.typings`.antd.antdInts.`5`
    - `web.typings`.antd.antdInts.`6`
    - `web.typings`.antd.antdInts.`7`
    - `web.typings`.antd.antdInts.`8`
    - `web.typings`.antd.antdInts.`9`
    - `web.typings`.antd.antdInts.`10`
  */
  trait ColorPaletteKeyIndex extends StObject
  object ColorPaletteKeyIndex {
    
    @scala.inline
    def `1`: web.typings.antd.antdInts.`1` = 1.asInstanceOf[web.typings.antd.antdInts.`1`]
    
    @scala.inline
    def `10`: web.typings.antd.antdInts.`10` = 10.asInstanceOf[web.typings.antd.antdInts.`10`]
    
    @scala.inline
    def `2`: web.typings.antd.antdInts.`2` = 2.asInstanceOf[web.typings.antd.antdInts.`2`]
    
    @scala.inline
    def `3`: web.typings.antd.antdInts.`3` = 3.asInstanceOf[web.typings.antd.antdInts.`3`]
    
    @scala.inline
    def `4`: web.typings.antd.antdInts.`4` = 4.asInstanceOf[web.typings.antd.antdInts.`4`]
    
    @scala.inline
    def `5`: web.typings.antd.antdInts.`5` = 5.asInstanceOf[web.typings.antd.antdInts.`5`]
    
    @scala.inline
    def `6`: web.typings.antd.antdInts.`6` = 6.asInstanceOf[web.typings.antd.antdInts.`6`]
    
    @scala.inline
    def `7`: web.typings.antd.antdInts.`7` = 7.asInstanceOf[web.typings.antd.antdInts.`7`]
    
    @scala.inline
    def `8`: web.typings.antd.antdInts.`8` = 8.asInstanceOf[web.typings.antd.antdInts.`8`]
    
    @scala.inline
    def `9`: web.typings.antd.antdInts.`9` = 9.asInstanceOf[web.typings.antd.antdInts.`9`]
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ key in / * template literal string: ${keyofPresetColorType}${ColorPaletteKeyIndex} * / string ]: string}
    }}}
    */
  @js.native
  trait ColorPalettes extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ key in / * template literal string: ${keyofPresetColorType}-${ColorPaletteKeyIndex} * / string ]: string}
    }}}
    */
  @js.native
  trait LegacyColorPalettes extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.blue
    - `web.typings`.antd.antdStrings.purple
    - `web.typings`.antd.antdStrings.cyan
    - `web.typings`.antd.antdStrings.green
    - `web.typings`.antd.antdStrings.magenta
    - `web.typings`.antd.antdStrings.pink
    - `web.typings`.antd.antdStrings.red
    - `web.typings`.antd.antdStrings.orange
    - `web.typings`.antd.antdStrings.yellow
    - `web.typings`.antd.antdStrings.volcano
    - `web.typings`.antd.antdStrings.geekblue
    - `web.typings`.antd.antdStrings.lime
    - `web.typings`.antd.antdStrings.gold
  */
  trait PresetColorKey extends StObject
  
  type PresetColorType = Record[PresetColorKey, String]
}
