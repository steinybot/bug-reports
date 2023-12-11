package web.typings.computeScrollIntoView

import web.typings.computeScrollIntoView.mod.ScrollMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computeScrollIntoViewStrings {
  
  @js.native
  sealed trait always
    extends StObject
       with ScrollMode
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait `if-needed`
    extends StObject
       with ScrollMode
  @scala.inline
  def `if-needed`: `if-needed` = "if-needed".asInstanceOf[`if-needed`]
}
