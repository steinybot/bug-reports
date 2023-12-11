package web.typings.antd

import web.typings.antd.esConfigProviderContextMod.DirectionType
import web.typings.rcTextarea.esInterfaceMod.AutoSizeType
import web.typings.react.mod.CSSProperties
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTypographyEditableMod extends Shortcut {
  
  @JSImport("antd/es/typography/Editable", JSImport.Default)
  @js.native
  val default: ReactComponentClass[EditableProps] = js.native
  
  @js.native
  trait EditableProps extends StObject {
    
    var `aria-label`: js.UndefOr[String] = js.native
    
    var autoSize: js.UndefOr[Boolean | AutoSizeType] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var component: js.UndefOr[String] = js.native
    
    var direction: js.UndefOr[DirectionType] = js.native
    
    var enterIcon: js.UndefOr[ReactElement] = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    def onCancel(): Unit = js.native
    
    var onEnd: js.UndefOr[js.Function0[Unit]] = js.native
    
    def onSave(value: String): Unit = js.native
    
    var prefixCls: String = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var value: String = js.native
  }
  object EditableProps {
    
    @scala.inline
    def apply(onCancel: () => Unit, onSave: String => Unit, prefixCls: String, value: String): EditableProps = {
      val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onSave = js.Any.fromFunction1(onSave), prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditableProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: EditableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def setAutoSize(value: Boolean | AutoSizeType): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setDirection(value: DirectionType): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setEnterIcon(value: ReactElement): Self = StObject.set(x, "enterIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterIconUndefined: Self = StObject.set(x, "enterIcon", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnEnd(value: () => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      @scala.inline
      def setOnSave(value: String => Unit): Self = StObject.set(x, "onSave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[EditableProps]
  
  /* This means you don't have to write `default`, but can instead just say `esTypographyEditableMod.foo` */
  override def _to: ReactComponentClass[EditableProps] = default
}
