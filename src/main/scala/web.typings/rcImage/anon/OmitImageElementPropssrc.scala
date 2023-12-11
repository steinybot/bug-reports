package web.typings.rcImage.anon

import web.typings.rcImage.rcImageStrings._empty
import web.typings.rcImage.rcImageStrings.`lazy`
import web.typings.rcImage.rcImageStrings.`use-credentials`
import web.typings.rcImage.rcImageStrings.anonymous
import web.typings.rcImage.rcImageStrings.async
import web.typings.rcImage.rcImageStrings.auto
import web.typings.rcImage.rcImageStrings.eager
import web.typings.rcImage.rcImageStrings.sync
import web.typings.react.mod.Booleanish
import web.typings.react.mod.HTMLAttributeReferrerPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<rc-image.rc-image/lib/interface.ImageElementProps, 'src'> */
@js.native
trait OmitImageElementPropssrc extends StObject {
  
  var alt: js.UndefOr[String] = js.native
  
  var crossOrigin: js.UndefOr[anonymous | `use-credentials` | _empty] = js.native
  
  var decoding: js.UndefOr[async | auto | sync] = js.native
  
  var draggable: js.UndefOr[Booleanish] = js.native
  
  var loading: js.UndefOr[eager | `lazy`] = js.native
  
  var referrerPolicy: js.UndefOr[HTMLAttributeReferrerPolicy] = js.native
  
  var sizes: js.UndefOr[String] = js.native
  
  var srcSet: js.UndefOr[String] = js.native
  
  var useMap: js.UndefOr[String] = js.native
}
object OmitImageElementPropssrc {
  
  @scala.inline
  def apply(): OmitImageElementPropssrc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitImageElementPropssrc]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: OmitImageElementPropssrc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: anonymous | `use-credentials` | _empty): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    @scala.inline
    def setDecoding(value: async | auto | sync): Self = StObject.set(x, "decoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecodingUndefined: Self = StObject.set(x, "decoding", js.undefined)
    
    @scala.inline
    def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setLoading(value: eager | `lazy`): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    @scala.inline
    def setReferrerPolicy(value: HTMLAttributeReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
    
    @scala.inline
    def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    @scala.inline
    def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
    
    @scala.inline
    def setUseMap(value: String): Self = StObject.set(x, "useMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseMapUndefined: Self = StObject.set(x, "useMap", js.undefined)
  }
}
