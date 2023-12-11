package web.typings.antd

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilWaveMod extends Shortcut {
  
  @JSImport("antd/es/_util/wave", JSImport.Default)
  @js.native
  val default: ReactComponentClass[WaveProps] = js.native
  
  @js.native
  trait WaveProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var component: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
  }
  object WaveProps {
    
    @scala.inline
    def apply(): WaveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WaveProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: WaveProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[WaveProps]
  
  /* This means you don't have to write `default`, but can instead just say `esUtilWaveMod.foo` */
  override def _to: ReactComponentClass[WaveProps] = default
}
