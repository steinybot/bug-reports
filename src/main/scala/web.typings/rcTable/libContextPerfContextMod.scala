package web.typings.rcTable

import web.typings.react.mod.Context
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextPerfContextMod extends Shortcut {
  
  @JSImport("rc-table/lib/context/PerfContext", JSImport.Default)
  @js.native
  val default: Context[PerfRecord] = js.native
  
  @js.native
  trait PerfRecord extends StObject {
    
    var renderWithProps: Boolean = js.native
  }
  object PerfRecord {
    
    @scala.inline
    def apply(renderWithProps: Boolean): PerfRecord = {
      val __obj = js.Dynamic.literal(renderWithProps = renderWithProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[PerfRecord]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PerfRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRenderWithProps(value: Boolean): Self = StObject.set(x, "renderWithProps", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Context[PerfRecord]
  
  /* This means you don't have to write `default`, but can instead just say `libContextPerfContextMod.foo` */
  override def _to: Context[PerfRecord] = default
}
