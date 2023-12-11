package web.typings.rcCollapse

import web.typings.rcCollapse.esInterfaceMod.CollapsibleType
import web.typings.rcCollapse.esInterfaceMod.ItemType
import web.typings.rcMotion.esCssmotionMod.CSSMotionProps
import web.typings.react.mod.Key
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseItemsMod {
  
  @JSImport("rc-collapse/es/hooks/useItems", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): js.Array[ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Array[ReactElement]]
  @scala.inline
  def default(items: js.Array[ItemType]): js.Array[ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[ReactElement]]
  @scala.inline
  def default(items: js.Array[ItemType], rawChildren: Unit, props: Props): js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any], rawChildren.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactElement]]
  @scala.inline
  def default(items: js.Array[ItemType], rawChildren: ReactElement): js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any], rawChildren.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactElement]]
  @scala.inline
  def default(items: js.Array[ItemType], rawChildren: ReactElement, props: Props): js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any], rawChildren.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactElement]]
  @scala.inline
  def default(items: Unit, rawChildren: Unit, props: Props): js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any], rawChildren.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactElement]]
  @scala.inline
  def default(items: Unit, rawChildren: ReactElement): js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any], rawChildren.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactElement]]
  @scala.inline
  def default(items: Unit, rawChildren: ReactElement, props: Props): js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any], rawChildren.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactElement]]
  
  /* Inlined std.Pick<rc-collapse.rc-collapse/es/interface.CollapsePanelProps, 'prefixCls' | 'onItemClick' | 'openMotion' | 'expandIcon'> & std.Pick<rc-collapse.rc-collapse/es/interface.CollapseProps, 'accordion' | 'collapsible' | 'destroyInactivePanel'> & {  activeKey :std.Array<react.react.Key>} */
  @js.native
  trait Props extends StObject {
    
    var accordion: js.UndefOr[Boolean] = js.native
    
    var activeKey: js.Array[Key] = js.native
    
    var collapsible: js.UndefOr[CollapsibleType] = js.native
    
    var destroyInactivePanel: js.UndefOr[Boolean] = js.native
    
    var expandIcon: js.UndefOr[js.Function1[/* props */ js.Object, ReactElement]] = js.native
    
    var onItemClick: js.UndefOr[js.Function1[/* panelKey */ Key, Unit]] = js.native
    
    var openMotion: js.UndefOr[CSSMotionProps] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(activeKey: js.Array[Key]): Props = {
      val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccordion(value: Boolean): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccordionUndefined: Self = StObject.set(x, "accordion", js.undefined)
      
      @scala.inline
      def setActiveKey(value: js.Array[Key]): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveKeyVarargs(value: Key*): Self = StObject.set(x, "activeKey", js.Array(value :_*))
      
      @scala.inline
      def setCollapsible(value: CollapsibleType): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      @scala.inline
      def setDestroyInactivePanel(value: Boolean): Self = StObject.set(x, "destroyInactivePanel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyInactivePanelUndefined: Self = StObject.set(x, "destroyInactivePanel", js.undefined)
      
      @scala.inline
      def setExpandIcon(value: /* props */ js.Object => ReactElement): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      @scala.inline
      def setOnItemClick(value: /* panelKey */ Key => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      @scala.inline
      def setOpenMotion(value: CSSMotionProps): Self = StObject.set(x, "openMotion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenMotionUndefined: Self = StObject.set(x, "openMotion", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
}
