package web.typings.rcMentions

import web.typings.rcMentions.esMentionsMod.DataDrivenOptionProps
import web.typings.rcMentions.esMentionsMod.Direction
import web.typings.rcMentions.esMentionsMod.Placement
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esKeywordTriggerMod extends Shortcut {
  
  @JSImport("rc-mentions/es/KeywordTrigger", JSImport.Default)
  @js.native
  val default: ReactComponentClass[KeywordTriggerProps] = js.native
  
  @js.native
  trait KeywordTriggerProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var direction: js.UndefOr[Direction] = js.native
    
    var dropdownClassName: js.UndefOr[String] = js.native
    
    var getPopupContainer: js.UndefOr[js.Function0[HTMLElement]] = js.native
    
    var loading: js.UndefOr[Boolean] = js.native
    
    var options: js.Array[DataDrivenOptionProps] = js.native
    
    var placement: js.UndefOr[Placement] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var transitionName: js.UndefOr[String] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
  }
  object KeywordTriggerProps {
    
    @scala.inline
    def apply(options: js.Array[DataDrivenOptionProps]): KeywordTriggerProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeywordTriggerProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: KeywordTriggerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDropdownClassName(value: String): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownClassNameUndefined: Self = StObject.set(x, "dropdownClassName", js.undefined)
      
      @scala.inline
      def setGetPopupContainer(value: () => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[DataDrivenOptionProps]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: DataDrivenOptionProps*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[KeywordTriggerProps]
  
  /* This means you don't have to write `default`, but can instead just say `esKeywordTriggerMod.foo` */
  override def _to: ReactComponentClass[KeywordTriggerProps] = default
}
