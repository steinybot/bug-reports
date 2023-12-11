package web.typings.antd

import web.typings.antd.anon.ShowLeafIcon
import web.typings.antd.esTreeTreeMod.AntTreeNodeProps
import web.typings.antd.esTreeTreeMod.SwitcherIcon
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTreeUtilsIconUtilMod extends Shortcut {
  
  @JSImport("antd/es/tree/utils/iconUtil", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SwitcherIconProps] = js.native
  
  @js.native
  trait SwitcherIconProps extends StObject {
    
    var prefixCls: String = js.native
    
    var showLine: js.UndefOr[Boolean | ShowLeafIcon] = js.native
    
    var switcherIcon: js.UndefOr[SwitcherIcon] = js.native
    
    var treeNodeProps: AntTreeNodeProps = js.native
  }
  object SwitcherIconProps {
    
    @scala.inline
    def apply(prefixCls: String, treeNodeProps: AntTreeNodeProps): SwitcherIconProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], treeNodeProps = treeNodeProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwitcherIconProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SwitcherIconProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLine(value: Boolean | ShowLeafIcon): Self = StObject.set(x, "showLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLineUndefined: Self = StObject.set(x, "showLine", js.undefined)
      
      @scala.inline
      def setSwitcherIcon(value: SwitcherIcon): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitcherIconFunction1(value: /* props */ AntTreeNodeProps => ReactElement): Self = StObject.set(x, "switcherIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSwitcherIconReactElement(value: ReactElement): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitcherIconUndefined: Self = StObject.set(x, "switcherIcon", js.undefined)
      
      @scala.inline
      def setTreeNodeProps(value: AntTreeNodeProps): Self = StObject.set(x, "treeNodeProps", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[SwitcherIconProps]
  
  /* This means you don't have to write `default`, but can instead just say `esTreeUtilsIconUtilMod.foo` */
  override def _to: ReactComponentClass[SwitcherIconProps] = default
}
