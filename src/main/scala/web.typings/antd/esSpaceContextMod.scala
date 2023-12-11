package web.typings.antd

import web.typings.react.mod.Context
import web.typings.react.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSpaceContextMod {
  
  @JSImport("antd/es/space/context", "SpaceContext")
  @js.native
  val SpaceContext: Context[SpaceContextType] = js.native
  
  @JSImport("antd/es/space/context", "SpaceContextProvider")
  @js.native
  val SpaceContextProvider: Provider[SpaceContextType] = js.native
  
  @js.native
  trait SpaceContextType extends StObject {
    
    var latestIndex: Double = js.native
  }
  object SpaceContextType {
    
    @scala.inline
    def apply(latestIndex: Double): SpaceContextType = {
      val __obj = js.Dynamic.literal(latestIndex = latestIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpaceContextType]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SpaceContextType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLatestIndex(value: Double): Self = StObject.set(x, "latestIndex", value.asInstanceOf[js.Any])
    }
  }
}
