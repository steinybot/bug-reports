package web.typings.antd

import web.typings.rcRate.esRateMod.RateRef
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esRateMod extends Shortcut {
  
  @JSImport("antd/es/rate", JSImport.Default)
  @js.native
  val default: ReactComponentClass[RateProps with RefAttributes[RateRef]] = js.native
  
  @js.native
  trait RateProps
    extends StObject
       with web.typings.rcRate.esRateMod.RateProps {
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var tooltips: js.UndefOr[js.Array[String]] = js.native
  }
  object RateProps {
    
    @scala.inline
    def apply(): RateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RateProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: RateProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setTooltips(value: js.Array[String]): Self = StObject.set(x, "tooltips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipsUndefined: Self = StObject.set(x, "tooltips", js.undefined)
      
      @scala.inline
      def setTooltipsVarargs(value: String*): Self = StObject.set(x, "tooltips", js.Array(value :_*))
    }
  }
  
  type _To = ReactComponentClass[RateProps with RefAttributes[RateRef]]
  
  /* This means you don't have to write `default`, but can instead just say `esRateMod.foo` */
  override def _to: ReactComponentClass[RateProps with RefAttributes[RateRef]] = default
}
