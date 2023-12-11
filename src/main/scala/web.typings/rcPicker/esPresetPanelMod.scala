package web.typings.rcPicker

import web.typings.rcPicker.esInterfaceMod.PresetDate
import web.typings.react.mod.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPresetPanelMod {
  
  @JSImport("rc-picker/es/PresetPanel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](props: PresetPanelProps[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait PresetPanelProps[T] extends StObject {
    
    def onClick(value: T): Unit = js.native
    
    var onHover: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.native
    
    var prefixCls: String = js.native
    
    var presets: js.Array[PresetDate[T]] = js.native
  }
  object PresetPanelProps {
    
    @scala.inline
    def apply[T](onClick: T => Unit, prefixCls: String, presets: js.Array[PresetDate[T]]): PresetPanelProps[T] = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), prefixCls = prefixCls.asInstanceOf[js.Any], presets = presets.asInstanceOf[js.Any])
      __obj.asInstanceOf[PresetPanelProps[T]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PresetPanelProps[_], T] (val x: Self with PresetPanelProps[T]) extends AnyVal {
      
      @scala.inline
      def setOnClick(value: T => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnHover(value: /* value */ T => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresets(value: js.Array[PresetDate[T]]): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresetsVarargs(value: PresetDate[T]*): Self = StObject.set(x, "presets", js.Array(value :_*))
    }
  }
}
