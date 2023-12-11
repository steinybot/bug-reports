package web.typings.antd

import web.typings.antd.anon.Dispatch
import web.typings.antd.esAvatarAvatarContextMod._AvatarSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilResponsiveObserverMod {
  
  @JSImport("antd/es/_util/responsiveObserver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): Dispatch = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Dispatch]
  
  @scala.inline
  def matchScreen(screens: ScreenMap): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchScreen")(screens.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  @scala.inline
  def matchScreen(screens: ScreenMap, screenSizes: ScreenSizeMap): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchScreen")(screens.asInstanceOf[js.Any], screenSizes.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  @JSImport("antd/es/_util/responsiveObserver", "responsiveArray")
  @js.native
  val responsiveArray: js.Array[Breakpoint] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.xxl
    - `web.typings`.antd.antdStrings.xl
    - `web.typings`.antd.antdStrings.lg
    - `web.typings`.antd.antdStrings.md
    - `web.typings`.antd.antdStrings.sm
    - `web.typings`.antd.antdStrings.xs
  */
  trait Breakpoint extends StObject
  object Breakpoint {
    
    @scala.inline
    def lg: web.typings.antd.antdStrings.lg = "lg".asInstanceOf[web.typings.antd.antdStrings.lg]
    
    @scala.inline
    def md: web.typings.antd.antdStrings.md = "md".asInstanceOf[web.typings.antd.antdStrings.md]
    
    @scala.inline
    def sm: web.typings.antd.antdStrings.sm = "sm".asInstanceOf[web.typings.antd.antdStrings.sm]
    
    @scala.inline
    def xl: web.typings.antd.antdStrings.xl = "xl".asInstanceOf[web.typings.antd.antdStrings.xl]
    
    @scala.inline
    def xs: web.typings.antd.antdStrings.xs = "xs".asInstanceOf[web.typings.antd.antdStrings.xs]
    
    @scala.inline
    def xxl: web.typings.antd.antdStrings.xxl = "xxl".asInstanceOf[web.typings.antd.antdStrings.xxl]
  }
  
  /* Inlined std.Record<antd.antd/es/_util/responsiveObserver.Breakpoint, string> */
  @js.native
  trait BreakpointMap extends StObject {
    
    var lg: String = js.native
    
    var md: String = js.native
    
    var sm: String = js.native
    
    var xl: String = js.native
    
    var xs: String = js.native
    
    var xxl: String = js.native
  }
  object BreakpointMap {
    
    @scala.inline
    def apply(lg: String, md: String, sm: String, xl: String, xs: String, xxl: String): BreakpointMap = {
      val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], xs = xs.asInstanceOf[js.Any], xxl = xxl.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreakpointMap]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: BreakpointMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLg(value: String): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMd(value: String): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSm(value: String): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXl(value: String): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXs(value: String): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXxl(value: String): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<std.Record<antd.antd/es/_util/responsiveObserver.Breakpoint, boolean>> */
  @js.native
  trait ScreenMap extends StObject {
    
    var lg: js.UndefOr[Boolean] = js.native
    
    var md: js.UndefOr[Boolean] = js.native
    
    var sm: js.UndefOr[Boolean] = js.native
    
    var xl: js.UndefOr[Boolean] = js.native
    
    var xs: js.UndefOr[Boolean] = js.native
    
    var xxl: js.UndefOr[Boolean] = js.native
  }
  object ScreenMap {
    
    @scala.inline
    def apply(): ScreenMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScreenMap]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ScreenMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLg(value: Boolean): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      @scala.inline
      def setMd(value: Boolean): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      @scala.inline
      def setSm(value: Boolean): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      @scala.inline
      def setXl(value: Boolean): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      @scala.inline
      def setXs(value: Boolean): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
      
      @scala.inline
      def setXxl(value: Boolean): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXxlUndefined: Self = StObject.set(x, "xxl", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Record<antd.antd/es/_util/responsiveObserver.Breakpoint, number>> */
  @js.native
  trait ScreenSizeMap
    extends StObject
       with _AvatarSize {
    
    var lg: js.UndefOr[Double] = js.native
    
    var md: js.UndefOr[Double] = js.native
    
    var sm: js.UndefOr[Double] = js.native
    
    var xl: js.UndefOr[Double] = js.native
    
    var xs: js.UndefOr[Double] = js.native
    
    var xxl: js.UndefOr[Double] = js.native
  }
  object ScreenSizeMap {
    
    @scala.inline
    def apply(): ScreenSizeMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScreenSizeMap]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ScreenSizeMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLg(value: Double): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      @scala.inline
      def setMd(value: Double): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      @scala.inline
      def setSm(value: Double): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      @scala.inline
      def setXl(value: Double): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      @scala.inline
      def setXs(value: Double): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
      
      @scala.inline
      def setXxl(value: Double): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXxlUndefined: Self = StObject.set(x, "xxl", js.undefined)
    }
  }
  
  type SubscribeFunc = js.Function1[/* screens */ ScreenMap, Unit]
}
