package web.typings.antd

import web.typings.antd.esStatisticStatisticMod.StatisticProps
import web.typings.antd.esStatisticUtilsMod.valueType
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esStatisticCountdownMod extends Shortcut {
  
  @JSImport("antd/es/statistic/Countdown", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CountdownProps] = js.native
  
  @js.native
  trait CountdownProps
    extends StObject
       with StatisticProps {
    
    var format: js.UndefOr[String] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[valueType], Unit]] = js.native
    
    var onFinish: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object CountdownProps {
    
    @scala.inline
    def apply(): CountdownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CountdownProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CountdownProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ js.UndefOr[valueType] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFinish(value: () => Unit): Self = StObject.set(x, "onFinish", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[CountdownProps]
  
  /* This means you don't have to write `default`, but can instead just say `esStatisticCountdownMod.foo` */
  override def _to: ReactComponentClass[CountdownProps] = default
}
