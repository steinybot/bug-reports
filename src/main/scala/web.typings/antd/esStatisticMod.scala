package web.typings.antd

import web.typings.antd.esStatisticCountdownMod.CountdownProps
import web.typings.antd.esStatisticStatisticMod.StatisticProps
import web.typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esStatisticMod extends Shortcut {
  
  @JSImport("antd/es/statistic", JSImport.Default)
  @js.native
  val default: CompoundedStatistic = js.native
  
  @js.native
  trait CompoundedComponent extends StObject {
    
    var Countdown: ReactComponentClass[CountdownProps] = js.native
  }
  object CompoundedComponent {
    
    @scala.inline
    def apply(Countdown: ReactComponentClass[CountdownProps]): CompoundedComponent = {
      val __obj = js.Dynamic.literal(Countdown = Countdown.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompoundedComponent]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CompoundedComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountdown(value: ReactComponentClass[CountdownProps]): Self = StObject.set(x, "Countdown", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CompoundedStatistic
    extends StObject
       with FunctionComponent[StatisticProps]
       with CompoundedComponent
  
  type _To = CompoundedStatistic
  
  /* This means you don't have to write `default`, but can instead just say `esStatisticMod.foo` */
  override def _to: CompoundedStatistic = default
}
