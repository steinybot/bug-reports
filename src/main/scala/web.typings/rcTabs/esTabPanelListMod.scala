package web.typings.rcTabs

import web.typings.rcTabs.esInterfaceMod.AnimatedConfig
import web.typings.rcTabs.esInterfaceMod.TabPosition
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTabPanelListMod extends Shortcut {
  
  @JSImport("rc-tabs/es/TabPanelList", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TabPanelListProps] = js.native
  
  @js.native
  trait TabPanelListProps extends StObject {
    
    var activeKey: String = js.native
    
    var animated: js.UndefOr[AnimatedConfig] = js.native
    
    var destroyInactiveTabPane: js.UndefOr[Boolean] = js.native
    
    var id: String = js.native
    
    var tabPosition: js.UndefOr[TabPosition] = js.native
  }
  object TabPanelListProps {
    
    @scala.inline
    def apply(activeKey: String, id: String): TabPanelListProps = {
      val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabPanelListProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TabPanelListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveKey(value: String): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimated(value: AnimatedConfig): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      @scala.inline
      def setDestroyInactiveTabPane(value: Boolean): Self = StObject.set(x, "destroyInactiveTabPane", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyInactiveTabPaneUndefined: Self = StObject.set(x, "destroyInactiveTabPane", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabPosition(value: TabPosition): Self = StObject.set(x, "tabPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabPositionUndefined: Self = StObject.set(x, "tabPosition", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[TabPanelListProps]
  
  /* This means you don't have to write `default`, but can instead just say `esTabPanelListMod.foo` */
  override def _to: ReactComponentClass[TabPanelListProps] = default
}
