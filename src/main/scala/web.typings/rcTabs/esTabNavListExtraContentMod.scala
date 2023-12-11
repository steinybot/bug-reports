package web.typings.rcTabs

import web.typings.rcTabs.esInterfaceMod.TabBarExtraContent
import web.typings.rcTabs.esInterfaceMod.TabBarExtraPosition
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTabNavListExtraContentMod extends Shortcut {
  
  @JSImport("rc-tabs/es/TabNavList/ExtraContent", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ExtraContentProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait ExtraContentProps extends StObject {
    
    var extra: js.UndefOr[TabBarExtraContent] = js.native
    
    var position: TabBarExtraPosition = js.native
    
    var prefixCls: String = js.native
  }
  object ExtraContentProps {
    
    @scala.inline
    def apply(position: TabBarExtraPosition, prefixCls: String): ExtraContentProps = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtraContentProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ExtraContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtra(value: TabBarExtraContent): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraReactElement(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setPosition(value: TabBarExtraPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[ExtraContentProps with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esTabNavListExtraContentMod.foo` */
  override def _to: ReactComponentClass[ExtraContentProps with RefAttributes[HTMLDivElement]] = default
}
