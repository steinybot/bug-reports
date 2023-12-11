package web.typings.rcTable

import web.typings.rcTable.libHooksUseFlattenRecordsMod.FlattenData
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.Key
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVirtualTableBodyLineMod extends Shortcut {
  
  @JSImport("rc-table/lib/VirtualTable/BodyLine", JSImport.Default)
  @js.native
  val default: ReactComponentClass[BodyLineProps[Any] with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait BodyLineProps[RecordType] extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var data: FlattenData[RecordType] = js.native
    
    /** Render cell only when it has `rowSpan > 1` */
    var extra: js.UndefOr[Boolean] = js.native
    
    var getHeight: js.UndefOr[js.Function1[/* rowSpan */ Double, Double]] = js.native
    
    var index: Double = js.native
    
    var rowKey: Key = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object BodyLineProps {
    
    @scala.inline
    def apply[RecordType](data: FlattenData[RecordType], index: Double, rowKey: Key): BodyLineProps[RecordType] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], rowKey = rowKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[BodyLineProps[RecordType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: BodyLineProps[_], RecordType] (val x: Self with BodyLineProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setData(value: FlattenData[RecordType]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtra(value: Boolean): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setGetHeight(value: /* rowSpan */ Double => Double): Self = StObject.set(x, "getHeight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetHeightUndefined: Self = StObject.set(x, "getHeight", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowKey(value: Key): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[BodyLineProps[Any] with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `libVirtualTableBodyLineMod.foo` */
  override def _to: ReactComponentClass[BodyLineProps[Any] with RefAttributes[HTMLDivElement]] = default
}
