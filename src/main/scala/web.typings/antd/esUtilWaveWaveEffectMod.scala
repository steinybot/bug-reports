package web.typings.antd

import web.typings.antd.esUtilWaveInterfaceMod.ShowWaveEffect
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilWaveWaveEffectMod extends Shortcut {
  
  @JSImport("antd/es/_util/wave/WaveEffect", JSImport.Default)
  @js.native
  val default: ShowWaveEffect = js.native
  
  @js.native
  trait WaveEffectProps extends StObject {
    
    var className: String = js.native
    
    var component: js.UndefOr[String] = js.native
    
    var target: HTMLElement = js.native
  }
  object WaveEffectProps {
    
    @scala.inline
    def apply(className: String, target: HTMLElement): WaveEffectProps = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[WaveEffectProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: WaveEffectProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ShowWaveEffect
  
  /* This means you don't have to write `default`, but can instead just say `esUtilWaveWaveEffectMod.foo` */
  override def _to: ShowWaveEffect = default
}
