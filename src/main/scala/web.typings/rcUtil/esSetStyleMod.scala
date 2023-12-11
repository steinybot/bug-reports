package web.typings.rcUtil

import web.typings.react.mod.CSSProperties
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSetStyleMod {
  
  @JSImport("rc-util/es/setStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Easy to set element style, return previous style
    * IE browser compatible(IE browser doesn't merge overflow style, need to set it separately)
    * https://github.com/ant-design/ant-design/issues/19393
    *
    */
  @scala.inline
  def default(style: CSSProperties): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(style.asInstanceOf[js.Any]).asInstanceOf[CSSProperties]
  @scala.inline
  def default(style: CSSProperties, options: SetStyleOptions): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(style.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  
  @js.native
  trait SetStyleOptions extends StObject {
    
    var element: js.UndefOr[HTMLElement] = js.native
  }
  object SetStyleOptions {
    
    @scala.inline
    def apply(): SetStyleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetStyleOptions]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SetStyleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
}
