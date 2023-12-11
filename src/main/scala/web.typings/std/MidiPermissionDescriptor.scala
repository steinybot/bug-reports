package web.typings.std

import web.typings.std.stdStrings.midi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MidiPermissionDescriptor
  extends StObject
     with PermissionDescriptor {
  
  /* standard dom */
  @JSName("name")
  var name_MidiPermissionDescriptor: midi = js.native
  
  /* standard dom */
  var sysex: js.UndefOr[scala.Boolean] = js.native
}
object MidiPermissionDescriptor {
  
  @scala.inline
  def apply(): MidiPermissionDescriptor = {
    val __obj = js.Dynamic.literal(name = "midi")
    __obj.asInstanceOf[MidiPermissionDescriptor]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: MidiPermissionDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: midi): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSysex(value: scala.Boolean): Self = StObject.set(x, "sysex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSysexUndefined: Self = StObject.set(x, "sysex", js.undefined)
  }
}
