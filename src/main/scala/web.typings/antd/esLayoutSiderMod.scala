package web.typings.antd

import web.typings.antd.antdStrings.lg
import web.typings.antd.antdStrings.md
import web.typings.antd.antdStrings.sm
import web.typings.antd.antdStrings.xl
import web.typings.antd.antdStrings.xs
import web.typings.antd.antdStrings.xxl
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.Context
import web.typings.react.mod.HTMLAttributes
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLayoutSiderMod extends Shortcut {
  
  @JSImport("antd/es/layout/Sider", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SiderProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("antd/es/layout/Sider", "SiderContext")
  @js.native
  val SiderContext: Context[SiderContextProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.clickTrigger
    - `web.typings`.antd.antdStrings.responsive
  */
  trait CollapseType extends StObject
  object CollapseType {
    
    @scala.inline
    def clickTrigger: web.typings.antd.antdStrings.clickTrigger = "clickTrigger".asInstanceOf[web.typings.antd.antdStrings.clickTrigger]
    
    @scala.inline
    def responsive: web.typings.antd.antdStrings.responsive = "responsive".asInstanceOf[web.typings.antd.antdStrings.responsive]
  }
  
  @js.native
  trait SiderContextProps extends StObject {
    
    var siderCollapsed: js.UndefOr[Boolean] = js.native
  }
  object SiderContextProps {
    
    @scala.inline
    def apply(): SiderContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SiderContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SiderContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSiderCollapsed(value: Boolean): Self = StObject.set(x, "siderCollapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiderCollapsedUndefined: Self = StObject.set(x, "siderCollapsed", js.undefined)
    }
  }
  
  @js.native
  trait SiderProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var breakpoint: js.UndefOr[xs | sm | md | lg | xl | xxl] = js.native
    
    var collapsed: js.UndefOr[Boolean] = js.native
    
    var collapsedWidth: js.UndefOr[Double | String] = js.native
    
    var collapsible: js.UndefOr[Boolean] = js.native
    
    var defaultCollapsed: js.UndefOr[Boolean] = js.native
    
    var onBreakpoint: js.UndefOr[js.Function1[/* broken */ Boolean, Unit]] = js.native
    
    var onCollapse: js.UndefOr[js.Function2[/* collapsed */ Boolean, /* type */ CollapseType, Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var reverseArrow: js.UndefOr[Boolean] = js.native
    
    var theme: js.UndefOr[SiderTheme] = js.native
    
    var trigger: js.UndefOr[ReactElement] = js.native
    
    var width: js.UndefOr[Double | String] = js.native
    
    var zeroWidthTriggerStyle: js.UndefOr[CSSProperties] = js.native
  }
  object SiderProps {
    
    @scala.inline
    def apply(): SiderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SiderProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SiderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakpoint(value: xs | sm | md | lg | xl | xxl): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
      
      @scala.inline
      def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      @scala.inline
      def setCollapsedWidth(value: Double | String): Self = StObject.set(x, "collapsedWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedWidthUndefined: Self = StObject.set(x, "collapsedWidth", js.undefined)
      
      @scala.inline
      def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      @scala.inline
      def setDefaultCollapsed(value: Boolean): Self = StObject.set(x, "defaultCollapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCollapsedUndefined: Self = StObject.set(x, "defaultCollapsed", js.undefined)
      
      @scala.inline
      def setOnBreakpoint(value: /* broken */ Boolean => Unit): Self = StObject.set(x, "onBreakpoint", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBreakpointUndefined: Self = StObject.set(x, "onBreakpoint", js.undefined)
      
      @scala.inline
      def setOnCollapse(value: (/* collapsed */ Boolean, /* type */ CollapseType) => Unit): Self = StObject.set(x, "onCollapse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCollapseUndefined: Self = StObject.set(x, "onCollapse", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setReverseArrow(value: Boolean): Self = StObject.set(x, "reverseArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseArrowUndefined: Self = StObject.set(x, "reverseArrow", js.undefined)
      
      @scala.inline
      def setTheme(value: SiderTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTrigger(value: ReactElement): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setZeroWidthTriggerStyle(value: CSSProperties): Self = StObject.set(x, "zeroWidthTriggerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZeroWidthTriggerStyleUndefined: Self = StObject.set(x, "zeroWidthTriggerStyle", js.undefined)
    }
  }
  
  @js.native
  trait SiderState extends StObject {
    
    var below: Boolean = js.native
    
    var collapsed: js.UndefOr[Boolean] = js.native
  }
  object SiderState {
    
    @scala.inline
    def apply(below: Boolean): SiderState = {
      val __obj = js.Dynamic.literal(below = below.asInstanceOf[js.Any])
      __obj.asInstanceOf[SiderState]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SiderState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBelow(value: Boolean): Self = StObject.set(x, "below", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.light
    - `web.typings`.antd.antdStrings.dark
  */
  trait SiderTheme extends StObject
  object SiderTheme {
    
    @scala.inline
    def dark: web.typings.antd.antdStrings.dark = "dark".asInstanceOf[web.typings.antd.antdStrings.dark]
    
    @scala.inline
    def light: web.typings.antd.antdStrings.light = "light".asInstanceOf[web.typings.antd.antdStrings.light]
  }
  
  type _To = ReactComponentClass[SiderProps with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esLayoutSiderMod.foo` */
  override def _to: ReactComponentClass[SiderProps with RefAttributes[HTMLDivElement]] = default
}
