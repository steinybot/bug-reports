package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antDesignReactSlick.mod.LazyLoadTypes
import web.typings.antDesignReactSlick.mod.ResponsiveObject
import web.typings.antDesignReactSlick.mod.SwipeDirection
import web.typings.antd.anon.`1`
import web.typings.antd.esCarouselMod.CarouselEffect
import web.typings.antd.esCarouselMod.CarouselProps
import web.typings.antd.esCarouselMod.CarouselRef
import web.typings.antd.esCarouselMod.DotPosition
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.RefAttributes
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Carousel {
  
  @JSImport("antd", "Carousel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, CarouselRef] {
    
    @scala.inline
    def accessibility(value: Boolean): this.type = set("accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def adaptiveHeight(value: Boolean): this.type = set("adaptiveHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def afterChange(value: /* currentSlide */ Double => Unit): this.type = set("afterChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def appendDots(value: /* dots */ ReactElement => web.typings.react.mod.global.JSX.Element): this.type = set("appendDots", js.Any.fromFunction1(value))
    
    @scala.inline
    def arrows(value: Boolean): this.type = set("arrows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def asNavFor(value: web.typings.antDesignReactSlick.mod.Slider): this.type = set("asNavFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoplay(value: Boolean): this.type = set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoplaySpeed(value: Double): this.type = set("autoplaySpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def beforeChange(value: (/* currentSlide */ Double, /* nextSlide */ Double) => Unit): this.type = set("beforeChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def centerMode(value: Boolean): this.type = set("centerMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def centerPadding(value: String): this.type = set("centerPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cssEase(value: String): this.type = set("cssEase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customPaging(value: /* index */ Double => web.typings.react.mod.global.JSX.Element): this.type = set("customPaging", js.Any.fromFunction1(value))
    
    @scala.inline
    def dotPosition(value: DotPosition): this.type = set("dotPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dots(value: Boolean | `1`): this.type = set("dots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def easing(value: String): this.type = set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def edgeFriction(value: Double): this.type = set("edgeFriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def effect(value: CarouselEffect): this.type = set("effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fade(value: Boolean): this.type = set("fade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def focusOnSelect(value: Boolean): this.type = set("focusOnSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def infinite(value: Boolean): this.type = set("infinite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialSlide(value: Double): this.type = set("initialSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def lazyLoad(value: LazyLoadTypes): this.type = set("lazyLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nextArrow(value: web.typings.react.mod.global.JSX.Element): this.type = set("nextArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onEdge(value: /* swipeDirection */ SwipeDirection => Unit): this.type = set("onEdge", js.Any.fromFunction1(value))
    
    @scala.inline
    def onInit(value: () => Unit): this.type = set("onInit", js.Any.fromFunction0(value))
    
    @scala.inline
    def onLazyLoad(value: /* slidesToLoad */ js.Array[Double] => Unit): this.type = set("onLazyLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def onReInit(value: () => Unit): this.type = set("onReInit", js.Any.fromFunction0(value))
    
    @scala.inline
    def onSwipe(value: /* swipeDirection */ SwipeDirection => Unit): this.type = set("onSwipe", js.Any.fromFunction1(value))
    
    @scala.inline
    def pauseOnDotsHover(value: Boolean): this.type = set("pauseOnDotsHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pauseOnFocus(value: Boolean): this.type = set("pauseOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pauseOnHover(value: Boolean): this.type = set("pauseOnHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prevArrow(value: web.typings.react.mod.global.JSX.Element): this.type = set("prevArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def responsive(value: js.Array[ResponsiveObject]): this.type = set("responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def responsiveVarargs(value: ResponsiveObject*): this.type = set("responsive", js.Array(value :_*))
    
    @scala.inline
    def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rtl(value: Boolean): this.type = set("rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def slickGoTo(value: Double): this.type = set("slickGoTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def slide(value: String): this.type = set("slide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def slidesPerRow(value: Double): this.type = set("slidesPerRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def slidesToScroll(value: Double): this.type = set("slidesToScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def slidesToShow(value: Double): this.type = set("slidesToShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def speed(value: Double): this.type = set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def swipe(value: Boolean): this.type = set("swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def swipeEvent(value: /* swipeDirection */ SwipeDirection => Unit): this.type = set("swipeEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def swipeToSlide(value: Boolean): this.type = set("swipeToSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def touchMove(value: Boolean): this.type = set("touchMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def touchThreshold(value: Double): this.type = set("touchThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useCSS(value: Boolean): this.type = set("useCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def useTransform(value: Boolean): this.type = set("useTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def variableWidth(value: Boolean): this.type = set("variableWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def verticalSwiping(value: Boolean): this.type = set("verticalSwiping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def waitForAnimate(value: Boolean): this.type = set("waitForAnimate", value.asInstanceOf[js.Any])
  }
  
  type Props = CarouselProps with RefAttributes[CarouselRef]
  
  implicit def make(companion: Carousel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CarouselProps with RefAttributes[CarouselRef]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
