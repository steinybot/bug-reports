package web.typings.antd

import web.typings.antd.esButtonButtonMod.ButtonProps
import web.typings.react.mod.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDatePickerGeneratePickerComponentsMod {
  
  object default {
    
    @JSImport("antd/es/date-picker/generatePicker/Components", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/es/date-picker/generatePicker/Components", "default.button")
    @js.native
    def button: js.Function1[/* props */ ButtonProps, Element] = js.native
    @scala.inline
    def button_=(x: js.Function1[/* props */ ButtonProps, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("button")(x.asInstanceOf[js.Any])
  }
}
