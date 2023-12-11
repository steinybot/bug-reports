package web.typings.dayjs

import web.typings.dayjs.anon.D
import web.typings.dayjs.esmMod.PluginFunc
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmPluginObjectSupportMod extends Shortcut {
  
  @JSImport("dayjs/esm/plugin/objectSupport", JSImport.Namespace)
  @js.native
  val ^ : PluginFunc[Any] = js.native
  
  type _To = PluginFunc[Any]
  
  /* This means you don't have to write `^`, but can instead just say `esmPluginObjectSupportMod.foo` */
  override def _to: PluginFunc[Any] = ^
  
  /* augmented module */
  object dayjsEsmAugmentingMod {
    
    @js.native
    trait ConfigTypeMap extends StObject {
      
      var objectSupport: D = js.native
    }
    object ConfigTypeMap {
      
      @scala.inline
      def apply(objectSupport: D): ConfigTypeMap = {
        val __obj = js.Dynamic.literal(objectSupport = objectSupport.asInstanceOf[js.Any])
        __obj.asInstanceOf[ConfigTypeMap]
      }
      
      @scala.inline
      implicit class MutableBuilder[Self <: ConfigTypeMap] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setObjectSupport(value: D): Self = StObject.set(x, "objectSupport", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Dayjs extends StObject {
      
      def add(argument: js.Object): Dayjs = js.native
      
      def set(argument: js.Object): Dayjs = js.native
      
      def subtract(argument: js.Object): Dayjs = js.native
    }
    object Dayjs {
      
      @scala.inline
      def apply(add: js.Object => Dayjs, set: js.Object => Dayjs, subtract: js.Object => Dayjs): Dayjs = {
        val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), set = js.Any.fromFunction1(set), subtract = js.Any.fromFunction1(subtract))
        __obj.asInstanceOf[Dayjs]
      }
      
      @scala.inline
      implicit class MutableBuilder[Self <: Dayjs] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdd(value: js.Object => Dayjs): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSet(value: js.Object => Dayjs): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSubtract(value: js.Object => Dayjs): Self = StObject.set(x, "subtract", js.Any.fromFunction1(value))
      }
    }
  }
}
