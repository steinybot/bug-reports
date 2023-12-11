package web.typings.antd

import web.typings.antd.esListMod.ListGridType
import web.typings.react.mod.Consumer
import web.typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esListContextMod {
  
  @JSImport("antd/es/list/context", "ListConsumer")
  @js.native
  val ListConsumer: Consumer[ListConsumerProps] = js.native
  
  @JSImport("antd/es/list/context", "ListContext")
  @js.native
  val ListContext: Context[ListConsumerProps] = js.native
  
  @js.native
  trait ListConsumerProps extends StObject {
    
    var grid: js.UndefOr[ListGridType] = js.native
    
    var itemLayout: js.UndefOr[String] = js.native
  }
  object ListConsumerProps {
    
    @scala.inline
    def apply(): ListConsumerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListConsumerProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ListConsumerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGrid(value: ListGridType): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def setItemLayout(value: String): Self = StObject.set(x, "itemLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemLayoutUndefined: Self = StObject.set(x, "itemLayout", js.undefined)
    }
  }
}
