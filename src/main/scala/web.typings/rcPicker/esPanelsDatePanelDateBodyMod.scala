package web.typings.rcPicker

import web.typings.rcPicker.esGenerateMod.GenerateConfig
import web.typings.rcPicker.esInterfaceMod.CellRender
import web.typings.rcPicker.esInterfaceMod.CellRenderInfo
import web.typings.rcPicker.esInterfaceMod.Locale
import web.typings.react.mod.JSX.Element
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelsDatePanelDateBodyMod {
  
  @JSImport("rc-picker/es/panels/DatePanel/DateBody", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[DateType](props: DateBodyProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait DateBodyPassProps[DateType] extends StObject {
    
    var cellRender: js.UndefOr[CellRender[DateType, DateType | Double]] = js.native
    
    var disabledDate: js.UndefOr[js.Function1[/* date */ DateType, Boolean]] = js.native
    
    var isSameCell: js.UndefOr[js.Function2[/* current */ DateType, /* target */ DateType, Boolean]] = js.native
    
    var prefixColumn: js.UndefOr[js.Function1[/* date */ DateType, ReactElement]] = js.native
    
    var rowClassName: js.UndefOr[js.Function1[/* date */ DateType, String]] = js.native
  }
  object DateBodyPassProps {
    
    @scala.inline
    def apply[DateType](): DateBodyPassProps[DateType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateBodyPassProps[DateType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DateBodyPassProps[_], DateType] (val x: Self with DateBodyPassProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setCellRender(value: (DateType | Double, /* info */ CellRenderInfo[DateType]) => ReactElement): Self = StObject.set(x, "cellRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCellRenderUndefined: Self = StObject.set(x, "cellRender", js.undefined)
      
      @scala.inline
      def setDisabledDate(value: /* date */ DateType => Boolean): Self = StObject.set(x, "disabledDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisabledDateUndefined: Self = StObject.set(x, "disabledDate", js.undefined)
      
      @scala.inline
      def setIsSameCell(value: (/* current */ DateType, /* target */ DateType) => Boolean): Self = StObject.set(x, "isSameCell", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsSameCellUndefined: Self = StObject.set(x, "isSameCell", js.undefined)
      
      @scala.inline
      def setPrefixColumn(value: /* date */ DateType => ReactElement): Self = StObject.set(x, "prefixColumn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrefixColumnUndefined: Self = StObject.set(x, "prefixColumn", js.undefined)
      
      @scala.inline
      def setRowClassName(value: /* date */ DateType => String): Self = StObject.set(x, "rowClassName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowClassNameUndefined: Self = StObject.set(x, "rowClassName", js.undefined)
    }
  }
  
  @js.native
  trait DateBodyProps[DateType]
    extends StObject
       with DateBodyPassProps[DateType] {
    
    var generateConfig: GenerateConfig[DateType] = js.native
    
    var locale: Locale = js.native
    
    def onSelect(value: DateType): Unit = js.native
    
    var prefixCls: String = js.native
    
    var rowCount: Double = js.native
    
    var value: js.UndefOr[DateType | Null] = js.native
    
    var viewDate: DateType = js.native
  }
  object DateBodyProps {
    
    @scala.inline
    def apply[DateType](
      generateConfig: GenerateConfig[DateType],
      locale: Locale,
      onSelect: DateType => Unit,
      prefixCls: String,
      rowCount: Double,
      viewDate: DateType
    ): DateBodyProps[DateType] = {
      val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onSelect = js.Any.fromFunction1(onSelect), prefixCls = prefixCls.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateBodyProps[DateType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DateBodyProps[_], DateType] (val x: Self with DateBodyProps[DateType]) extends AnyVal {
      
      @scala.inline
      def setGenerateConfig(value: GenerateConfig[DateType]): Self = StObject.set(x, "generateConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelect(value: DateType => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: DateType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setViewDate(value: DateType): Self = StObject.set(x, "viewDate", value.asInstanceOf[js.Any])
    }
  }
  
  type DateRender[DateType] = js.Function2[/* currentDate */ DateType, /* today */ DateType, ReactElement]
}
