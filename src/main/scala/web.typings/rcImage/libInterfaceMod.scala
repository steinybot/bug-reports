package web.typings.rcImage

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
import web.typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInterfaceMod {
  
  /* Inlined std.Pick<react.react.ImgHTMLAttributes<std.HTMLImageElement>, 'src' | 'crossOrigin' | 'decoding' | 'draggable' | 'loading' | 'referrerPolicy' | 'sizes' | 'srcSet' | 'useMap' | 'alt'> */
  @js.native
  trait ImageElementProps extends StObject {
    
    var alt: js.UndefOr[String] = js.native
    
    var crossOrigin: js.UndefOr[anonymous | `use-credentials` | _empty] = js.native
    
    var decoding: js.UndefOr[async | auto | sync] = js.native
    
    var draggable: js.UndefOr[Booleanish] = js.native
    
    var loading: js.UndefOr[eager | `lazy`] = js.native
    
    var referrerPolicy: js.UndefOr[HTMLAttributeReferrerPolicy] = js.native
    
    var sizes: js.UndefOr[String] = js.native
    
    var src: js.UndefOr[String] = js.native
    
    var srcSet: js.UndefOr[String] = js.native
    
    var useMap: js.UndefOr[String] = js.native
  }
  object ImageElementProps {
    
    @scala.inline
    def apply(): ImageElementProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageElementProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ImageElementProps] (val x: Self) extends AnyVal {
      
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
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setUseMap(value: String): Self = StObject.set(x, "useMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseMapUndefined: Self = StObject.set(x, "useMap", js.undefined)
    }
  }
  
  @js.native
  trait InternalItem
    extends StObject
       with PreviewImageElementProps {
    
    var id: js.UndefOr[String] = js.native
  }
  object InternalItem {
    
    @scala.inline
    def apply(canPreview: Boolean, data: ImageElementProps): InternalItem = {
      val __obj = js.Dynamic.literal(canPreview = canPreview.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalItem]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: InternalItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  type OnGroupPreview = js.Function3[/* id */ String, /* mouseX */ Double, /* mouseY */ Double, Unit]
  
  @js.native
  trait PreviewImageElementProps extends StObject {
    
    var canPreview: Boolean = js.native
    
    var data: ImageElementProps = js.native
  }
  object PreviewImageElementProps {
    
    @scala.inline
    def apply(canPreview: Boolean, data: ImageElementProps): PreviewImageElementProps = {
      val __obj = js.Dynamic.literal(canPreview = canPreview.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviewImageElementProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PreviewImageElementProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanPreview(value: Boolean): Self = StObject.set(x, "canPreview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: ImageElementProps): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  type RegisterImage = js.Function2[/* id */ String, /* data */ PreviewImageElementProps, VoidFunction]
}
