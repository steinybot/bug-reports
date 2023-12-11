package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelMergerOptions
  extends StObject
     with AudioNodeOptions {
  
  /* standard dom */
  var numberOfInputs: js.UndefOr[Double] = js.native
}
object ChannelMergerOptions {
  
  @scala.inline
  def apply(): ChannelMergerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMergerOptions]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ChannelMergerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumberOfInputs(value: Double): Self = StObject.set(x, "numberOfInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfInputsUndefined: Self = StObject.set(x, "numberOfInputs", js.undefined)
  }
}
