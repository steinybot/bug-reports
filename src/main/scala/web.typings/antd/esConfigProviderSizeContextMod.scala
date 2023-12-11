package web.typings.antd

import web.typings.react.mod.Context
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esConfigProviderSizeContextMod extends Shortcut {
  
  @JSImport("antd/es/config-provider/SizeContext", JSImport.Default)
  @js.native
  val default: Context[SizeType] = js.native
  
  @JSImport("antd/es/config-provider/SizeContext", "SizeContextProvider")
  @js.native
  val SizeContextProvider: ReactComponentClass[SizeContextProps] = js.native
  
  @js.native
  trait SizeContextProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var size: js.UndefOr[SizeType] = js.native
  }
  object SizeContextProps {
    
    @scala.inline
    def apply(): SizeContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizeContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SizeContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.small
    - `web.typings`.antd.antdStrings.middle
    - `web.typings`.antd.antdStrings.large
    - scala.Unit
  */
  type SizeType = js.UndefOr[_SizeType]
  
  trait _SizeType extends StObject
  
  type _To = Context[SizeType]
  
  /* This means you don't have to write `default`, but can instead just say `esConfigProviderSizeContextMod.foo` */
  override def _to: Context[SizeType] = default
}
