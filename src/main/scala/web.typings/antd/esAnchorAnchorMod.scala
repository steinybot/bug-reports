package web.typings.antd

import web.typings.antd.anon.Href
import web.typings.antd.esAnchorAnchorLinkMod.AnchorLinkBaseProps
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.Key
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAnchorAnchorMod extends Shortcut {
  
  @JSImport("antd/es/anchor/Anchor", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AnchorProps] = js.native
  
  type AnchorContainer = HTMLElement | Window
  
  @js.native
  trait AnchorDefaultProps
    extends StObject
       with AnchorProps {
    
    @JSName("affix")
    var affix_AnchorDefaultProps: Boolean = js.native
    
    @JSName("getContainer")
    def getContainer_MAnchorDefaultProps(): AnchorContainer = js.native
    
    @JSName("prefixCls")
    var prefixCls_AnchorDefaultProps: String = js.native
    
    @JSName("showInkInFixed")
    var showInkInFixed_AnchorDefaultProps: Boolean = js.native
  }
  object AnchorDefaultProps {
    
    @scala.inline
    def apply(affix: Boolean, getContainer: () => AnchorContainer, prefixCls: String, showInkInFixed: Boolean): AnchorDefaultProps = {
      val __obj = js.Dynamic.literal(affix = affix.asInstanceOf[js.Any], getContainer = js.Any.fromFunction0(getContainer), prefixCls = prefixCls.asInstanceOf[js.Any], showInkInFixed = showInkInFixed.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnchorDefaultProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AnchorDefaultProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAffix(value: Boolean): Self = StObject.set(x, "affix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetContainer(value: () => AnchorContainer): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowInkInFixed(value: Boolean): Self = StObject.set(x, "showInkInFixed", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.vertical
    - `web.typings`.antd.antdStrings.horizontal
  */
  trait AnchorDirection extends StObject
  object AnchorDirection {
    
    @scala.inline
    def horizontal: web.typings.antd.antdStrings.horizontal = "horizontal".asInstanceOf[web.typings.antd.antdStrings.horizontal]
    
    @scala.inline
    def vertical: web.typings.antd.antdStrings.vertical = "vertical".asInstanceOf[web.typings.antd.antdStrings.vertical]
  }
  
  @js.native
  trait AnchorLinkItemProps
    extends StObject
       with AnchorLinkBaseProps {
    
    var children: js.UndefOr[js.Array[AnchorLinkItemProps]] = js.native
    
    var key: Key = js.native
  }
  object AnchorLinkItemProps {
    
    @scala.inline
    def apply(href: String, key: Key, title: ReactElement): AnchorLinkItemProps = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnchorLinkItemProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AnchorLinkItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[AnchorLinkItemProps]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: AnchorLinkItemProps*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AnchorProps extends StObject {
    
    var affix: js.UndefOr[Boolean] = js.native
    
    var bounds: js.UndefOr[Double] = js.native
    
    /**
      * @deprecated Please use `items` instead.
      */
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var direction: js.UndefOr[AnchorDirection] = js.native
    
    var getContainer: js.UndefOr[js.Function0[AnchorContainer]] = js.native
    
    /** Return customize highlight anchor */
    var getCurrentAnchor: js.UndefOr[js.Function1[/* activeLink */ String, String]] = js.native
    
    var items: js.UndefOr[js.Array[AnchorLinkItemProps]] = js.native
    
    var offsetTop: js.UndefOr[Double] = js.native
    
    /** Listening event when scrolling change active link */
    var onChange: js.UndefOr[js.Function1[/* currentActiveLink */ String, Unit]] = js.native
    
    var onClick: js.UndefOr[js.Function2[/* e */ SyntheticMouseEvent[HTMLElement], /* link */ Href, Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var replace: js.UndefOr[Boolean] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var showInkInFixed: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    /** Scroll to target offset value, if none, it's offsetTop prop value or 0. */
    var targetOffset: js.UndefOr[Double] = js.native
  }
  object AnchorProps {
    
    @scala.inline
    def apply(): AnchorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnchorProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AnchorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAffix(value: Boolean): Self = StObject.set(x, "affix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAffixUndefined: Self = StObject.set(x, "affix", js.undefined)
      
      @scala.inline
      def setBounds(value: Double): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDirection(value: AnchorDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setGetContainer(value: () => AnchorContainer): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      @scala.inline
      def setGetCurrentAnchor(value: /* activeLink */ String => String): Self = StObject.set(x, "getCurrentAnchor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetCurrentAnchorUndefined: Self = StObject.set(x, "getCurrentAnchor", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[AnchorLinkItemProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: AnchorLinkItemProps*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetTopUndefined: Self = StObject.set(x, "offsetTop", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* currentActiveLink */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: (/* e */ SyntheticMouseEvent[HTMLElement], /* link */ Href) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setShowInkInFixed(value: Boolean): Self = StObject.set(x, "showInkInFixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowInkInFixedUndefined: Self = StObject.set(x, "showInkInFixed", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTargetOffset(value: Double): Self = StObject.set(x, "targetOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetOffsetUndefined: Self = StObject.set(x, "targetOffset", js.undefined)
    }
  }
  
  @js.native
  trait AnchorState extends StObject {
    
    var activeLink: Null | String = js.native
  }
  object AnchorState {
    
    @scala.inline
    def apply(): AnchorState = {
      val __obj = js.Dynamic.literal(activeLink = null)
      __obj.asInstanceOf[AnchorState]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AnchorState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveLink(value: String): Self = StObject.set(x, "activeLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveLinkNull: Self = StObject.set(x, "activeLink", null)
    }
  }
  
  @js.native
  trait AntAnchor extends StObject {
    
    var activeLink: String | Null = js.native
    
    var direction: AnchorDirection = js.native
    
    var onClick: js.UndefOr[
        js.Function2[/* e */ SyntheticMouseEvent[HTMLAnchorElement], /* link */ Href, Unit]
      ] = js.native
    
    def registerLink(link: String): Unit = js.native
    
    def scrollTo(link: String): Unit = js.native
    
    def unregisterLink(link: String): Unit = js.native
  }
  object AntAnchor {
    
    @scala.inline
    def apply(
      direction: AnchorDirection,
      registerLink: String => Unit,
      scrollTo: String => Unit,
      unregisterLink: String => Unit
    ): AntAnchor = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], registerLink = js.Any.fromFunction1(registerLink), scrollTo = js.Any.fromFunction1(scrollTo), unregisterLink = js.Any.fromFunction1(unregisterLink), activeLink = null)
      __obj.asInstanceOf[AntAnchor]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AntAnchor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveLink(value: String): Self = StObject.set(x, "activeLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveLinkNull: Self = StObject.set(x, "activeLink", null)
      
      @scala.inline
      def setDirection(value: AnchorDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: (/* e */ SyntheticMouseEvent[HTMLAnchorElement], /* link */ Href) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setRegisterLink(value: String => Unit): Self = StObject.set(x, "registerLink", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollTo(value: String => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnregisterLink(value: String => Unit): Self = StObject.set(x, "unregisterLink", js.Any.fromFunction1(value))
    }
  }
  
  type _To = ReactComponentClass[AnchorProps]
  
  /* This means you don't have to write `default`, but can instead just say `esAnchorAnchorMod.foo` */
  override def _to: ReactComponentClass[AnchorProps] = default
}
