package web.typings.antd

import web.typings.react.mod.CSSProperties
import web.typings.react.mod.ForwardRefExoticComponent
import web.typings.react.mod.HTMLAttributes
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esListItemMod extends Shortcut {
  
  @JSImport("antd/es/list/Item", JSImport.Default)
  @js.native
  val default: ListItemTypeProps = js.native
  
  @JSImport("antd/es/list/Item", "Meta")
  @js.native
  val Meta: ReactComponentClass[ListItemMetaProps] = js.native
  
  @js.native
  trait ListItemMetaProps extends StObject {
    
    var avatar: js.UndefOr[ReactElement] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var description: js.UndefOr[ReactElement] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var title: js.UndefOr[ReactElement] = js.native
  }
  object ListItemMetaProps {
    
    @scala.inline
    def apply(): ListItemMetaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemMetaProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ListItemMetaProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvatar(value: ReactElement): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDescription(value: ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait ListItemProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var actions: js.UndefOr[js.Array[ReactElement]] = js.native
    
    var colStyle: js.UndefOr[CSSProperties] = js.native
    
    var extra: js.UndefOr[ReactElement] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
  }
  object ListItemProps {
    
    @scala.inline
    def apply(): ListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ListItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: js.Array[ReactElement]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setActionsVarargs(value: ReactElement*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setColStyle(value: CSSProperties): Self = StObject.set(x, "colStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColStyleUndefined: Self = StObject.set(x, "colStyle", js.undefined)
      
      @scala.inline
      def setExtra(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  @js.native
  trait ListItemTypeProps
    extends StObject
       with ForwardRefExoticComponent[ListItemProps with RefAttributes[HTMLElement]] {
    
    var Meta: ReactComponentClass[ListItemMetaProps] = js.native
  }
  
  type _To = ListItemTypeProps
  
  /* This means you don't have to write `default`, but can instead just say `esListItemMod.foo` */
  override def _to: ListItemTypeProps = default
}
