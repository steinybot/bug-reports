package web.typings.rcSlider

import web.typings.react.mod.CSSProperties
import org.scalajs.dom.Element
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInterfaceMod {
  
  type AriaValueFormat = js.Function1[/* value */ Double, String]
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcSlider.rcSliderStrings.rtl
    - `web.typings`.rcSlider.rcSliderStrings.ltr
    - `web.typings`.rcSlider.rcSliderStrings.ttb
    - `web.typings`.rcSlider.rcSliderStrings.btt
  */
  trait Direction extends StObject
  object Direction {
    
    @scala.inline
    def btt: web.typings.rcSlider.rcSliderStrings.btt = "btt".asInstanceOf[web.typings.rcSlider.rcSliderStrings.btt]
    
    @scala.inline
    def ltr: web.typings.rcSlider.rcSliderStrings.ltr = "ltr".asInstanceOf[web.typings.rcSlider.rcSliderStrings.ltr]
    
    @scala.inline
    def rtl: web.typings.rcSlider.rcSliderStrings.rtl = "rtl".asInstanceOf[web.typings.rcSlider.rcSliderStrings.rtl]
    
    @scala.inline
    def ttb: web.typings.rcSlider.rcSliderStrings.ttb = "ttb".asInstanceOf[web.typings.rcSlider.rcSliderStrings.ttb]
  }
  
  type OnStartMove = js.Function3[
    /* e */ SyntheticMouseEvent[Element] | SyntheticTouchEvent[Element], 
    /* valueIndex */ Double, 
    /* startValues */ js.UndefOr[js.Array[Double]], 
    Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcSlider.rcSliderStrings.tracks
    - `web.typings`.rcSlider.rcSliderStrings.track
    - `web.typings`.rcSlider.rcSliderStrings.rail
    - `web.typings`.rcSlider.rcSliderStrings.handle
  */
  trait SemanticName extends StObject
  object SemanticName {
    
    @scala.inline
    def handle: web.typings.rcSlider.rcSliderStrings.handle = "handle".asInstanceOf[web.typings.rcSlider.rcSliderStrings.handle]
    
    @scala.inline
    def rail: web.typings.rcSlider.rcSliderStrings.rail = "rail".asInstanceOf[web.typings.rcSlider.rcSliderStrings.rail]
    
    @scala.inline
    def track: web.typings.rcSlider.rcSliderStrings.track = "track".asInstanceOf[web.typings.rcSlider.rcSliderStrings.track]
    
    @scala.inline
    def tracks: web.typings.rcSlider.rcSliderStrings.tracks = "tracks".asInstanceOf[web.typings.rcSlider.rcSliderStrings.tracks]
  }
  
  /* Inlined std.Partial<std.Record<rc-slider.rc-slider/lib/interface.SemanticName, string>> */
  @js.native
  trait SliderClassNames extends StObject {
    
    var handle: js.UndefOr[String] = js.native
    
    var rail: js.UndefOr[String] = js.native
    
    var track: js.UndefOr[String] = js.native
    
    var tracks: js.UndefOr[String] = js.native
  }
  object SliderClassNames {
    
    @scala.inline
    def apply(): SliderClassNames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderClassNames]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SliderClassNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      @scala.inline
      def setRail(value: String): Self = StObject.set(x, "rail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRailUndefined: Self = StObject.set(x, "rail", js.undefined)
      
      @scala.inline
      def setTrack(value: String): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
      
      @scala.inline
      def setTracks(value: String): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Record<rc-slider.rc-slider/lib/interface.SemanticName, react.react.CSSProperties>> */
  @js.native
  trait SliderStyles extends StObject {
    
    var handle: js.UndefOr[CSSProperties] = js.native
    
    var rail: js.UndefOr[CSSProperties] = js.native
    
    var track: js.UndefOr[CSSProperties] = js.native
    
    var tracks: js.UndefOr[CSSProperties] = js.native
  }
  object SliderStyles {
    
    @scala.inline
    def apply(): SliderStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderStyles]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SliderStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandle(value: CSSProperties): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      @scala.inline
      def setRail(value: CSSProperties): Self = StObject.set(x, "rail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRailUndefined: Self = StObject.set(x, "rail", js.undefined)
      
      @scala.inline
      def setTrack(value: CSSProperties): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
      
      @scala.inline
      def setTracks(value: CSSProperties): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    }
  }
}
