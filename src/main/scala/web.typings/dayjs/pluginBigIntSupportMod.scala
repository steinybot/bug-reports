package web.typings.dayjs

import web.typings.dayjs.mod.PluginFunc
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginBigIntSupportMod extends Shortcut {
  
  @JSImport("dayjs/plugin/bigIntSupport", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `pluginBigIntSupportMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsAugmentingMod {
    
    @js.native
    trait ConfigTypeMap extends StObject {
      
      var bigIntSupport: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigInt */ Any = js.native
    }
    object ConfigTypeMap {
      
      @scala.inline
      def apply(
        bigIntSupport: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigInt */ Any
      ): ConfigTypeMap = {
        val __obj = js.Dynamic.literal(bigIntSupport = bigIntSupport.asInstanceOf[js.Any])
        __obj.asInstanceOf[ConfigTypeMap]
      }
      
      @scala.inline
      implicit class MutableBuilder[Self <: ConfigTypeMap] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBigIntSupport(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigInt */ Any
        ): Self = StObject.set(x, "bigIntSupport", value.asInstanceOf[js.Any])
      }
    }
  }
}
