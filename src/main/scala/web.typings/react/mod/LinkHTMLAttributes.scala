package web.typings.react.mod

import web.typings.react.reactStrings._empty
import web.typings.react.reactStrings.`use-credentials`
import web.typings.react.reactStrings.anonymous
import web.typings.react.reactStrings.auto
import web.typings.react.reactStrings.high
import web.typings.react.reactStrings.low
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var as: js.UndefOr[String] = js.native
  
  var charSet: js.UndefOr[String] = js.native
  
  var crossOrigin: js.UndefOr[anonymous | `use-credentials` | _empty] = js.native
  
  var fetchpriority: js.UndefOr[high | low | auto] = js.native
  
  var href: js.UndefOr[String] = js.native
  
  var hrefLang: js.UndefOr[String] = js.native
  
  var imageSizes: js.UndefOr[String] = js.native
  
  var imageSrcSet: js.UndefOr[String] = js.native
  
  var integrity: js.UndefOr[String] = js.native
  
  var media: js.UndefOr[String] = js.native
  
  var referrerPolicy: js.UndefOr[HTMLAttributeReferrerPolicy] = js.native
  
  var sizes: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object LinkHTMLAttributes {
  
  @scala.inline
  def apply[T](): LinkHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: LinkHTMLAttributes[_], T] (val x: Self with LinkHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: anonymous | `use-credentials` | _empty): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    @scala.inline
    def setFetchpriority(value: high | low | auto): Self = StObject.set(x, "fetchpriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchpriorityUndefined: Self = StObject.set(x, "fetchpriority", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefLang(value: String): Self = StObject.set(x, "hrefLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefLangUndefined: Self = StObject.set(x, "hrefLang", js.undefined)
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setImageSizes(value: String): Self = StObject.set(x, "imageSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageSizesUndefined: Self = StObject.set(x, "imageSizes", js.undefined)
    
    @scala.inline
    def setImageSrcSet(value: String): Self = StObject.set(x, "imageSrcSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageSrcSetUndefined: Self = StObject.set(x, "imageSrcSet", js.undefined)
    
    @scala.inline
    def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
    
    @scala.inline
    def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def setReferrerPolicy(value: HTMLAttributeReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
    
    @scala.inline
    def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
