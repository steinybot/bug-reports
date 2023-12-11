package web.typings.antd

import web.typings.antd.anon.Indicator
import web.typings.antd.anon.Root
import web.typings.antd.antdStrings.small
import web.typings.antd.esBadgeRibbonMod.RibbonProps
import web.typings.antd.esThemeInterfacePresetColorsMod.PresetColorKey
import web.typings.antd.esUtilColorsMod.PresetStatusColorType
import web.typings.antd.esUtilTypeMod.LiteralUnion
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.ForwardRefExoticComponent
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLSpanElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esBadgeMod extends Shortcut {
  
  @JSImport("antd/es/badge", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  @js.native
  trait BadgeProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var classNames: js.UndefOr[Indicator] = js.native
    
    var color: js.UndefOr[LiteralUnion[PresetColorKey]] = js.native
    
    /** Number to show in badge */
    var count: js.UndefOr[ReactElement] = js.native
    
    /** Whether to show red dot without number */
    var dot: js.UndefOr[Boolean] = js.native
    
    var offset: js.UndefOr[js.Tuple2[Double | String, Double | String]] = js.native
    
    /** Max count to show */
    var overflowCount: js.UndefOr[Double] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var scrollNumberPrefixCls: js.UndefOr[String] = js.native
    
    var showZero: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[web.typings.antd.antdStrings.default | small] = js.native
    
    var status: js.UndefOr[PresetStatusColorType] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var styles: js.UndefOr[Root] = js.native
    
    var text: js.UndefOr[ReactElement] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object BadgeProps {
    
    @scala.inline
    def apply(): BadgeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BadgeProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: BadgeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClassNames(value: Indicator): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setColor(value: LiteralUnion[PresetColorKey]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCount(value: ReactElement): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      @scala.inline
      def setOffset(value: js.Tuple2[Double | String, Double | String]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOverflowCount(value: Double): Self = StObject.set(x, "overflowCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowCountUndefined: Self = StObject.set(x, "overflowCount", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setScrollNumberPrefixCls(value: String): Self = StObject.set(x, "scrollNumberPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollNumberPrefixClsUndefined: Self = StObject.set(x, "scrollNumberPrefixCls", js.undefined)
      
      @scala.inline
      def setShowZero(value: Boolean): Self = StObject.set(x, "showZero", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowZeroUndefined: Self = StObject.set(x, "showZero", js.undefined)
      
      @scala.inline
      def setSize(value: web.typings.antd.antdStrings.default | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStatus(value: PresetStatusColorType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyles(value: Root): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setText(value: ReactElement): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait CompoundedComponent
    extends StObject
       with ForwardRefExoticComponent[BadgeProps with RefAttributes[HTMLSpanElement]] {
    
    var Ribbon: ReactComponentClass[RibbonProps] = js.native
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `esBadgeMod.foo` */
  override def _to: CompoundedComponent = default
}
