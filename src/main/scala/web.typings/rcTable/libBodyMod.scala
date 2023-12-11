package web.typings.rcTable

import web.typings.react.mod.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBodyMod {
  
  /* was `typeof Body` */
  object default {
    
    @scala.inline
    def apply[RecordType](props: BodyProps[RecordType]): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("rc-table/lib/Body", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-table/lib/Body", "default.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait BodyProps[RecordType] extends StObject {
    
    var data: js.Array[RecordType] = js.native
    
    var measureColumnWidth: Boolean = js.native
  }
  object BodyProps {
    
    @scala.inline
    def apply[RecordType](data: js.Array[RecordType], measureColumnWidth: Boolean): BodyProps[RecordType] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], measureColumnWidth = measureColumnWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[BodyProps[RecordType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: BodyProps[_], RecordType] (val x: Self with BodyProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[RecordType]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: RecordType*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setMeasureColumnWidth(value: Boolean): Self = StObject.set(x, "measureColumnWidth", value.asInstanceOf[js.Any])
    }
  }
}
