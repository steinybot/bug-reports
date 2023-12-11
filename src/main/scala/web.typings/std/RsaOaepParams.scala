package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RsaOaepParams
  extends StObject
     with Algorithm {
  
  /* standard dom */
  var label: js.UndefOr[
    js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer
  ] = js.native
}
object RsaOaepParams {
  
  @scala.inline
  def apply(name: java.lang.String): RsaOaepParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaOaepParams]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: RsaOaepParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(
      value: js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer
    ): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
