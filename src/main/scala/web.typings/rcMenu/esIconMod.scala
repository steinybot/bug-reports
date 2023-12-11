package web.typings.rcMenu

import web.typings.rcMenu.esInterfaceMod.RenderIconInfo
import web.typings.rcMenu.esInterfaceMod.RenderIconType
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esIconMod {
  
  @JSImport("rc-menu/es/Icon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(param0: IconProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @js.native
  trait IconProps extends StObject {
    
    /** Fallback of icon if provided */
    var children: js.UndefOr[ReactElement] = js.native
    
    var icon: js.UndefOr[RenderIconType] = js.native
    
    var props: RenderIconInfo = js.native
  }
  object IconProps {
    
    @scala.inline
    def apply(props: RenderIconInfo): IconProps = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: IconProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setIcon(value: RenderIconType): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFunction1(value: /* props */ RenderIconInfo => ReactElement): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setProps(value: RenderIconInfo): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
