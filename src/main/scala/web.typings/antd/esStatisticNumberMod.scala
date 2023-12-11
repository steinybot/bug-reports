package web.typings.antd

import web.typings.antd.esStatisticUtilsMod.FormatConfig
import web.typings.antd.esStatisticUtilsMod.valueType
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esStatisticNumberMod extends Shortcut {
  
  @JSImport("antd/es/statistic/Number", JSImport.Default)
  @js.native
  val default: ReactComponentClass[NumberProps] = js.native
  
  @js.native
  trait NumberProps
    extends StObject
       with FormatConfig {
    
    var value: valueType = js.native
  }
  object NumberProps {
    
    @scala.inline
    def apply(value: valueType): NumberProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: NumberProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: valueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[NumberProps]
  
  /* This means you don't have to write `default`, but can instead just say `esStatisticNumberMod.foo` */
  override def _to: ReactComponentClass[NumberProps] = default
}
