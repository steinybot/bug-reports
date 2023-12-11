package web.typings.antd

import web.typings.antd.esTagCheckableTagMod.CheckableTagProps
import web.typings.antd.esUtilColorsMod.PresetColorType
import web.typings.antd.esUtilColorsMod.PresetStatusColorType
import web.typings.antd.esUtilTypeMod.LiteralUnion
import web.typings.react.mod.ForwardRefExoticComponent
import web.typings.react.mod.HTMLAttributes
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLSpanElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTagMod extends Shortcut {
  
  @JSImport("antd/es/tag", JSImport.Default)
  @js.native
  val default: TagType = js.native
  
  @js.native
  trait TagProps
    extends StObject
       with HTMLAttributes[HTMLSpanElement] {
    
    var bordered: js.UndefOr[Boolean] = js.native
    
    var closable: js.UndefOr[Boolean] = js.native
    
    /** Advised to use closeIcon instead. */
    var closeIcon: js.UndefOr[Boolean | ReactElement] = js.native
    
    @JSName("color")
    var color_TagProps: js.UndefOr[LiteralUnion[PresetColorType | PresetStatusColorType]] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var onClose: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLElement], Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    /** @deprecated `visible` will be removed in next major version. */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object TagProps {
    
    @scala.inline
    def apply(): TagProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TagProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      @scala.inline
      def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      @scala.inline
      def setCloseIcon(value: Boolean | ReactElement): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconReactElement(value: ReactElement): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      @scala.inline
      def setColor(value: LiteralUnion[PresetColorType | PresetStatusColorType]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setOnClose(value: /* e */ SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait TagType
    extends StObject
       with ForwardRefExoticComponent[TagProps with RefAttributes[HTMLElement]] {
    
    var CheckableTag: ReactComponentClass[CheckableTagProps with RefAttributes[HTMLSpanElement]] = js.native
  }
  
  type _To = TagType
  
  /* This means you don't have to write `default`, but can instead just say `esTagMod.foo` */
  override def _to: TagType = default
}
