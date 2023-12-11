package web.typings.antd

import web.typings.antd.anon.PartialRecordBreakpointnu
import web.typings.antd.antdStrings.`space-around`
import web.typings.antd.antdStrings.`space-between`
import web.typings.antd.antdStrings.`space-evenly`
import web.typings.antd.antdStrings.bottom
import web.typings.antd.antdStrings.center
import web.typings.antd.antdStrings.end
import web.typings.antd.antdStrings.middle
import web.typings.antd.antdStrings.start
import web.typings.antd.antdStrings.stretch
import web.typings.antd.antdStrings.top
import web.typings.react.mod.HTMLAttributes
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esGridRowMod extends Shortcut {
  
  @JSImport("antd/es/grid/row", JSImport.Default)
  @js.native
  val default: ReactComponentClass[RowProps with RefAttributes[HTMLDivElement]] = js.native
  
  type Gutter = js.UndefOr[Double | PartialRecordBreakpointnu]
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.xxl
    - `web.typings`.antd.antdStrings.xl
    - `web.typings`.antd.antdStrings.lg
    - `web.typings`.antd.antdStrings.md
    - `web.typings`.antd.antdStrings.sm
    - `web.typings`.antd.antdStrings.xs
  */
  trait Responsive extends StObject
  object Responsive {
    
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
  
  /* Inlined antd.antd/es/grid/row.ResponsiveLike<['top', 'middle', 'bottom', 'stretch'][number]> */
  @js.native
  trait ResponsiveAligns extends StObject {
    
    var lg: js.UndefOr[top | middle | bottom | stretch] = js.native
    
    var md: js.UndefOr[top | middle | bottom | stretch] = js.native
    
    var sm: js.UndefOr[top | middle | bottom | stretch] = js.native
    
    var xl: js.UndefOr[top | middle | bottom | stretch] = js.native
    
    var xs: js.UndefOr[top | middle | bottom | stretch] = js.native
    
    var xxl: js.UndefOr[top | middle | bottom | stretch] = js.native
  }
  object ResponsiveAligns {
    
    @scala.inline
    def apply(): ResponsiveAligns = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveAligns]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ResponsiveAligns] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLg(value: top | middle | bottom | stretch): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      @scala.inline
      def setMd(value: top | middle | bottom | stretch): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      @scala.inline
      def setSm(value: top | middle | bottom | stretch): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      @scala.inline
      def setXl(value: top | middle | bottom | stretch): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      @scala.inline
      def setXs(value: top | middle | bottom | stretch): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
      
      @scala.inline
      def setXxl(value: top | middle | bottom | stretch): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXxlUndefined: Self = StObject.set(x, "xxl", js.undefined)
    }
  }
  
  /* Inlined antd.antd/es/grid/row.ResponsiveLike<['start', 'end', 'center', 'space-around', 'space-between', 'space-evenly'][number]> */
  @js.native
  trait ResponsiveJustify extends StObject {
    
    var lg: js.UndefOr[start | end | center | `space-around` | `space-between` | `space-evenly`] = js.native
    
    var md: js.UndefOr[start | end | center | `space-around` | `space-between` | `space-evenly`] = js.native
    
    var sm: js.UndefOr[start | end | center | `space-around` | `space-between` | `space-evenly`] = js.native
    
    var xl: js.UndefOr[start | end | center | `space-around` | `space-between` | `space-evenly`] = js.native
    
    var xs: js.UndefOr[start | end | center | `space-around` | `space-between` | `space-evenly`] = js.native
    
    var xxl: js.UndefOr[start | end | center | `space-around` | `space-between` | `space-evenly`] = js.native
  }
  object ResponsiveJustify {
    
    @scala.inline
    def apply(): ResponsiveJustify = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveJustify]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ResponsiveJustify] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLg(value: start | end | center | `space-around` | `space-between` | `space-evenly`): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      @scala.inline
      def setMd(value: start | end | center | `space-around` | `space-between` | `space-evenly`): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      @scala.inline
      def setSm(value: start | end | center | `space-around` | `space-between` | `space-evenly`): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      @scala.inline
      def setXl(value: start | end | center | `space-around` | `space-between` | `space-evenly`): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      @scala.inline
      def setXs(value: start | end | center | `space-around` | `space-between` | `space-evenly`): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
      
      @scala.inline
      def setXxl(value: start | end | center | `space-around` | `space-between` | `space-evenly`): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXxlUndefined: Self = StObject.set(x, "xxl", js.undefined)
    }
  }
  
  /* Inlined {[ key in antd.antd/es/grid/row.Responsive ]:? T} */
  @js.native
  trait ResponsiveLike[T] extends StObject {
    
    var lg: js.UndefOr[T] = js.native
    
    var md: js.UndefOr[T] = js.native
    
    var sm: js.UndefOr[T] = js.native
    
    var xl: js.UndefOr[T] = js.native
    
    var xs: js.UndefOr[T] = js.native
    
    var xxl: js.UndefOr[T] = js.native
  }
  object ResponsiveLike {
    
    @scala.inline
    def apply[T](): ResponsiveLike[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveLike[T]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ResponsiveLike[_], T] (val x: Self with ResponsiveLike[T]) extends AnyVal {
      
      @scala.inline
      def setLg(value: T): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      @scala.inline
      def setMd(value: T): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      @scala.inline
      def setSm(value: T): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      @scala.inline
      def setXl(value: T): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      @scala.inline
      def setXs(value: T): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
      
      @scala.inline
      def setXxl(value: T): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXxlUndefined: Self = StObject.set(x, "xxl", js.undefined)
    }
  }
  
  @js.native
  trait RowProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var align: js.UndefOr[top | middle | bottom | stretch | ResponsiveAligns] = js.native
    
    var gutter: js.UndefOr[Gutter | (js.Tuple2[Gutter, Gutter])] = js.native
    
    var justify: js.UndefOr[
        start | end | center | `space-around` | `space-between` | `space-evenly` | ResponsiveJustify
      ] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var wrap: js.UndefOr[Boolean] = js.native
  }
  object RowProps {
    
    @scala.inline
    def apply(): RowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: RowProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: top | middle | bottom | stretch | ResponsiveAligns): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setGutter(value: Gutter | (js.Tuple2[Gutter, Gutter])): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      @scala.inline
      def setJustify(
        value: start | end | center | `space-around` | `space-between` | `space-evenly` | ResponsiveJustify
      ): Self = StObject.set(x, "justify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifyUndefined: Self = StObject.set(x, "justify", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[RowProps with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esGridRowMod.foo` */
  override def _to: ReactComponentClass[RowProps with RefAttributes[HTMLDivElement]] = default
}
