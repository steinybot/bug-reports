package web.typings.antd

import web.typings.react.mod.CSSProperties
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Element
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDrawerDrawerPanelMod extends Shortcut {
  
  @JSImport("antd/es/drawer/DrawerPanel", JSImport.Default)
  @js.native
  val default: ReactComponentClass[DrawerPanelProps] = js.native
  
  @js.native
  trait DrawerClassNames extends StObject {
    
    var body: js.UndefOr[String] = js.native
    
    var content: js.UndefOr[String] = js.native
    
    var footer: js.UndefOr[String] = js.native
    
    var header: js.UndefOr[String] = js.native
    
    var mask: js.UndefOr[String] = js.native
  }
  object DrawerClassNames {
    
    @scala.inline
    def apply(): DrawerClassNames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerClassNames]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DrawerClassNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    }
  }
  
  @js.native
  trait DrawerPanelProps extends StObject {
    
    /** @deprecated Please use `styles.body` instead */
    var bodyStyle: js.UndefOr[CSSProperties] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var classNames: js.UndefOr[DrawerClassNames] = js.native
    
    /**
      * Recommend to use closeIcon instead
      *
      * e.g.
      *
      * `<Drawer closeIcon={false} />`
      */
    var closable: js.UndefOr[Boolean] = js.native
    
    var closeIcon: js.UndefOr[Boolean | ReactElement] = js.native
    
    /** Wrapper dom node style of header and body */
    var drawerStyle: js.UndefOr[CSSProperties] = js.native
    
    var extra: js.UndefOr[ReactElement] = js.native
    
    var footer: js.UndefOr[ReactElement] = js.native
    
    /** @deprecated Please use `styles.footer` instead */
    var footerStyle: js.UndefOr[CSSProperties] = js.native
    
    /** @deprecated Please use `styles.header` instead */
    var headerStyle: js.UndefOr[CSSProperties] = js.native
    
    var onClose: js.UndefOr[
        js.Function1[/* e */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element], Unit]
      ] = js.native
    
    var prefixCls: String = js.native
    
    var styles: js.UndefOr[DrawerStyles] = js.native
    
    var title: js.UndefOr[ReactElement] = js.native
  }
  object DrawerPanelProps {
    
    @scala.inline
    def apply(prefixCls: String): DrawerPanelProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawerPanelProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DrawerPanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBodyStyle(value: CSSProperties): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassNames(value: DrawerClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      @scala.inline
      def setCloseIcon(value: Boolean | ReactElement): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconReactElement(value: ReactElement): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      @scala.inline
      def setDrawerStyle(value: CSSProperties): Self = StObject.set(x, "drawerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerStyleUndefined: Self = StObject.set(x, "drawerStyle", js.undefined)
      
      @scala.inline
      def setExtra(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setFooter(value: ReactElement): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterStyle(value: CSSProperties): Self = StObject.set(x, "footerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterStyleUndefined: Self = StObject.set(x, "footerStyle", js.undefined)
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setHeaderStyle(value: CSSProperties): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
      
      @scala.inline
      def setOnClose(value: /* e */ SyntheticMouseEvent[Element] | SyntheticKeyboardEvent[Element] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyles(value: DrawerStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait DrawerStyles extends StObject {
    
    var body: js.UndefOr[CSSProperties] = js.native
    
    var content: js.UndefOr[CSSProperties] = js.native
    
    var footer: js.UndefOr[CSSProperties] = js.native
    
    var header: js.UndefOr[CSSProperties] = js.native
    
    var mask: js.UndefOr[CSSProperties] = js.native
  }
  object DrawerStyles {
    
    @scala.inline
    def apply(): DrawerStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerStyles]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DrawerStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: CSSProperties): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setContent(value: CSSProperties): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setFooter(value: CSSProperties): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setHeader(value: CSSProperties): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setMask(value: CSSProperties): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[DrawerPanelProps]
  
  /* This means you don't have to write `default`, but can instead just say `esDrawerDrawerPanelMod.foo` */
  override def _to: ReactComponentClass[DrawerPanelProps] = default
}
