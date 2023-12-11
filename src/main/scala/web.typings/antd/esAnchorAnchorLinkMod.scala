package web.typings.antd

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAnchorAnchorLinkMod extends Shortcut {
  
  @JSImport("antd/es/anchor/AnchorLink", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AnchorLinkProps] = js.native
  
  @js.native
  trait AnchorLinkBaseProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var href: String = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var replace: js.UndefOr[Boolean] = js.native
    
    var target: js.UndefOr[String] = js.native
    
    var title: ReactElement = js.native
  }
  object AnchorLinkBaseProps {
    
    @scala.inline
    def apply(href: String, title: ReactElement): AnchorLinkBaseProps = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnchorLinkBaseProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AnchorLinkBaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AnchorLinkProps
    extends StObject
       with AnchorLinkBaseProps {
    
    var children: js.UndefOr[ReactElement] = js.native
  }
  object AnchorLinkProps {
    
    @scala.inline
    def apply(href: String, title: ReactElement): AnchorLinkProps = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnchorLinkProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AnchorLinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[AnchorLinkProps]
  
  /* This means you don't have to write `default`, but can instead just say `esAnchorAnchorLinkMod.foo` */
  override def _to: ReactComponentClass[AnchorLinkProps] = default
}
