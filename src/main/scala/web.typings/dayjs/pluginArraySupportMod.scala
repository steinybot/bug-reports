package web.typings.dayjs

import web.typings.dayjs.mod.PluginFunc
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginArraySupportMod extends Shortcut {
  
  @JSImport("dayjs/plugin/arraySupport", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `pluginArraySupportMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsAugmentingMod {
    
    @js.native
    trait ConfigTypeMap extends StObject {
      
      var arraySupport: js.Tuple7[
            js.UndefOr[Double], 
            js.UndefOr[Double], 
            js.UndefOr[Double], 
            js.UndefOr[Double], 
            js.UndefOr[Double], 
            js.UndefOr[Double], 
            js.UndefOr[Double]
          ] = js.native
    }
    object ConfigTypeMap {
      
      @scala.inline
      def apply(
        arraySupport: js.Tuple7[
              js.UndefOr[Double], 
              js.UndefOr[Double], 
              js.UndefOr[Double], 
              js.UndefOr[Double], 
              js.UndefOr[Double], 
              js.UndefOr[Double], 
              js.UndefOr[Double]
            ]
      ): ConfigTypeMap = {
        val __obj = js.Dynamic.literal(arraySupport = arraySupport.asInstanceOf[js.Any])
        __obj.asInstanceOf[ConfigTypeMap]
      }
      
      @scala.inline
      implicit class MutableBuilder[Self <: ConfigTypeMap] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setArraySupport(
          value: js.Tuple7[
                  js.UndefOr[Double], 
                  js.UndefOr[Double], 
                  js.UndefOr[Double], 
                  js.UndefOr[Double], 
                  js.UndefOr[Double], 
                  js.UndefOr[Double], 
                  js.UndefOr[Double]
                ]
        ): Self = StObject.set(x, "arraySupport", value.asInstanceOf[js.Any])
      }
    }
  }
}
