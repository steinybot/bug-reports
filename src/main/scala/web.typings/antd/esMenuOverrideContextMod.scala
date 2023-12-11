package web.typings.antd

import web.typings.antd.anon.PickMenuPropsmode
import web.typings.rcMenu.esInterfaceMod.MenuMode
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMenuOverrideContextMod {
  
  @js.native
  trait OverrideContextProps extends StObject {
    
    var expandIcon: js.UndefOr[ReactElement] = js.native
    
    var mode: js.UndefOr[MenuMode] = js.native
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var selectable: js.UndefOr[Boolean] = js.native
    
    var validator: js.UndefOr[js.Function1[/* menuProps */ PickMenuPropsmode, Unit]] = js.native
  }
  object OverrideContextProps {
    
    @scala.inline
    def apply(): OverrideContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverrideContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: OverrideContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpandIcon(value: ReactElement): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      @scala.inline
      def setMode(value: MenuMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      @scala.inline
      def setValidator(value: /* menuProps */ PickMenuPropsmode => Unit): Self = StObject.set(x, "validator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    }
  }
}
