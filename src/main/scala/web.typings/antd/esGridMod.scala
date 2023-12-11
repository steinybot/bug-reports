package web.typings.antd

import web.typings.antd.anon.PartialRecordBreakpointbo
import web.typings.antd.esGridColMod.ColProps
import web.typings.antd.esGridRowMod.RowProps
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esGridMod {
  
  object default {
    
    @JSImport("antd/es/grid", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/es/grid", "default.useBreakpoint")
    @js.native
    def useBreakpoint: js.Function0[PartialRecordBreakpointbo] = js.native
    @scala.inline
    def useBreakpoint_=(x: js.Function0[PartialRecordBreakpointbo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useBreakpoint")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("antd/es/grid", "Col")
  @js.native
  val Col: ReactComponentClass[ColProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("antd/es/grid", "Row")
  @js.native
  val Row: ReactComponentClass[RowProps with RefAttributes[HTMLDivElement]] = js.native
}
