package web.typings.rcUtil

import web.typings.rcUtil.rcUtilStrings.note
import web.typings.rcUtil.rcUtilStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esWarningMod {
  
  @JSImport("rc-util/es/warning", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @scala.inline
    def apply(valid: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].apply(valid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("rc-util/es/warning", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof imported_warning.noteOnce` */
    @scala.inline
    def noteOnce(valid: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noteOnce")(valid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("rc-util/es/warning", "default.preMessage")
    @js.native
    def preMessage: js.Function1[/* fn */ preMessageFn, Unit] = js.native
    @scala.inline
    def preMessage_=(x: js.Function1[/* fn */ preMessageFn, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preMessage")(x.asInstanceOf[js.Any])
    
    /* was `typeof imported_warning.resetWarned` */
    @scala.inline
    def resetWarned(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetWarned")().asInstanceOf[Unit]
  }
  
  @scala.inline
  def call(
    method: js.Function2[/* valid */ Boolean, /* message */ String, Unit],
    valid: Boolean,
    message: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(method.asInstanceOf[js.Any], valid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def note(valid: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("note")(valid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def noteOnce(valid: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noteOnce")(valid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def preMessage(fn: preMessageFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preMessage")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def resetWarned(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetWarned")().asInstanceOf[Unit]
  
  @scala.inline
  def warning(valid: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warning")(valid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object warningOnce {
    
    @scala.inline
    def apply(valid: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].apply(valid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("rc-util/es/warning", "warningOnce")
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof imported_warning.noteOnce` */
    @scala.inline
    def noteOnce(valid: Boolean, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("noteOnce")(valid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("rc-util/es/warning", "warningOnce.preMessage")
    @js.native
    def preMessage: js.Function1[/* fn */ preMessageFn, Unit] = js.native
    @scala.inline
    def preMessage_=(x: js.Function1[/* fn */ preMessageFn, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preMessage")(x.asInstanceOf[js.Any])
    
    /* was `typeof imported_warning.resetWarned` */
    @scala.inline
    def resetWarned(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetWarned")().asInstanceOf[Unit]
  }
  
  type preMessageFn = js.Function2[/* message */ String, /* type */ warning | note, js.UndefOr[String | Null | Double]]
}
