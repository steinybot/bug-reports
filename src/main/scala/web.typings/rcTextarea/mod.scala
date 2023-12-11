package web.typings.rcTextarea

import web.typings.rcTextarea.anon.OmitHTMLTextareaPropsvalu
import web.typings.rcTextarea.anon.OmitHTMLTextareaPropsvaluAbout
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-textarea", JSImport.Default)
  @js.native
  val default: ReactComponentClass[OmitHTMLTextareaPropsvaluAbout] = js.native
  
  @JSImport("rc-textarea", "ResizableTextArea")
  @js.native
  val ResizableTextArea: ReactComponentClass[OmitHTMLTextareaPropsvalu] = js.native
  
  type _To = ReactComponentClass[OmitHTMLTextareaPropsvaluAbout]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ReactComponentClass[OmitHTMLTextareaPropsvaluAbout] = default
}
