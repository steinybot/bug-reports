package web.typings.antDesignIcons

import web.typings.antDesignIcons.esComponentsIconMod.IconBaseProps
import web.typings.antDesignIcons.esComponentsTwoTonePrimaryColorMod.TwoToneColor
import web.typings.antDesignIconsSvg.esTypesMod.IconDefinition
import web.typings.react.mod.ForwardRefExoticComponent
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsAntdIconMod extends Shortcut {
  
  @JSImport("@ant-design/icons/es/components/AntdIcon", JSImport.Default)
  @js.native
  val default: IconBaseComponent[IconComponentProps] = js.native
  
  @js.native
  trait AntdIconProps
    extends StObject
       with IconBaseProps {
    
    var twoToneColor: js.UndefOr[TwoToneColor] = js.native
  }
  object AntdIconProps {
    
    @scala.inline
    def apply(): AntdIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AntdIconProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AntdIconProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTwoToneColor(value: TwoToneColor): Self = StObject.set(x, "twoToneColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwoToneColorUndefined: Self = StObject.set(x, "twoToneColor", js.undefined)
    }
  }
  
  @js.native
  trait IconBaseComponent[Props]
    extends StObject
       with ForwardRefExoticComponent[Props with RefAttributes[HTMLSpanElement]] {
    
    var getTwoToneColor: js.Function0[TwoToneColor] = js.native
    
    var setTwoToneColor: js.Function1[/* twoToneColor */ TwoToneColor, Unit] = js.native
  }
  
  @js.native
  trait IconComponentProps
    extends StObject
       with AntdIconProps {
    
    var icon: IconDefinition = js.native
  }
  object IconComponentProps {
    
    @scala.inline
    def apply(icon: IconDefinition): IconComponentProps = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconComponentProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: IconComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: IconDefinition): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = IconBaseComponent[IconComponentProps]
  
  /* This means you don't have to write `default`, but can instead just say `esComponentsAntdIconMod.foo` */
  override def _to: IconBaseComponent[IconComponentProps] = default
}
