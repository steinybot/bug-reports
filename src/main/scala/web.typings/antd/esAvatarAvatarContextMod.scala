package web.typings.antd

import web.typings.antd.antdStrings.circle
import web.typings.antd.antdStrings.square
import web.typings.react.mod.Context
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAvatarAvatarContextMod extends Shortcut {
  
  @JSImport("antd/es/avatar/AvatarContext", JSImport.Default)
  @js.native
  val default: Context[AvatarContextType] = js.native
  
  @js.native
  trait AvatarContextType extends StObject {
    
    var shape: js.UndefOr[circle | square] = js.native
    
    var size: js.UndefOr[AvatarSize] = js.native
  }
  object AvatarContextType {
    
    @scala.inline
    def apply(): AvatarContextType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarContextType]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AvatarContextType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShape(value: circle | square): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: AvatarSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.large
    - `web.typings`.antd.antdStrings.small
    - `web.typings`.antd.antdStrings.default
    - scala.Double
    - `web.typings`.antd.esUtilResponsiveObserverMod.ScreenSizeMap
  */
  type AvatarSize = _AvatarSize | Double
  
  trait _AvatarSize extends StObject
  
  type _To = Context[AvatarContextType]
  
  /* This means you don't have to write `default`, but can instead just say `esAvatarAvatarContextMod.foo` */
  override def _to: Context[AvatarContextType] = default
}
