package web.typings.antd

import web.typings.antd.anon.Back
import web.typings.antd.anon.Copied
import web.typings.antd.anon.DefaultValidateMessages
import web.typings.antd.anon.Expired
import web.typings.antd.anon.PresetEmpty
import web.typings.antd.anon.Preview
import web.typings.antd.esDatePickerGeneratePickerMod.PickerLocale
import web.typings.antd.esEmptyMod.TransferLocale
import web.typings.antd.esLocaleUseLocaleMod.LocaleComponentName
import web.typings.antd.esModalLocaleMod.ModalLocale
import web.typings.antd.esPopconfirmPurePanelMod.PopconfirmLocale
import web.typings.antd.esTableInterfaceMod.TableLocale
import web.typings.antd.esTourInterfaceMod.TourLocale
import web.typings.antd.esUploadInterfaceMod.UploadLocale
import web.typings.rcPagination.esInterfaceMod.PaginationLocale
import web.typings.std.NonNullable
import web.typings.std.Record
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLocaleMod {
  
  @JSImport("antd/es/locale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd/es/locale", JSImport.Default)
  @js.native
  val default: ReactComponentClass[LocaleProviderProps] = js.native
  
  @JSImport("antd/es/locale", "ANT_MARK")
  @js.native
  val ANT_MARK: /* "internalMark" */ String = js.native
  
  @scala.inline
  def useLocale[C /* <: LocaleComponentName */](componentName: C): js.Tuple2[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/es/locale.Locale[C] */ js.Any
    ], 
    String
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocale")(componentName.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/es/locale.Locale[C] */ js.Any
    ], 
    String
  ]]
  @scala.inline
  def useLocale[C /* <: LocaleComponentName */](
    componentName: C,
    defaultLocale: /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/es/locale.Locale[C] */ js.Any
  ): js.Tuple2[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/es/locale.Locale[C] */ js.Any
    ], 
    String
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocale")(componentName.asInstanceOf[js.Any], defaultLocale.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/es/locale.Locale[C] */ js.Any
    ], 
    String
  ]]
  @scala.inline
  def useLocale[C /* <: LocaleComponentName */](
    componentName: C,
    defaultLocale: js.Function0[
      /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/es/locale.Locale[C] */ js.Any
    ]
  ): js.Tuple2[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/es/locale.Locale[C] */ js.Any
    ], 
    String
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocale")(componentName.asInstanceOf[js.Any], defaultLocale.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/es/locale.Locale[C] */ js.Any
    ], 
    String
  ]]
  
  @js.native
  trait Locale extends StObject {
    
    var Calendar: js.UndefOr[Record[String, Any]] = js.native
    
    var ColorPicker: js.UndefOr[PresetEmpty] = js.native
    
    var DatePicker: js.UndefOr[PickerLocale] = js.native
    
    var Empty: js.UndefOr[TransferLocale] = js.native
    
    var Form: js.UndefOr[DefaultValidateMessages] = js.native
    
    var Icon: js.UndefOr[Record[String, Any]] = js.native
    
    var Image: js.UndefOr[Preview] = js.native
    
    var Modal: js.UndefOr[ModalLocale] = js.native
    
    var PageHeader: js.UndefOr[Back] = js.native
    
    var Pagination: js.UndefOr[PaginationLocale] = js.native
    
    var Popconfirm: js.UndefOr[PopconfirmLocale] = js.native
    
    var QRCode: js.UndefOr[Expired] = js.native
    
    var Select: js.UndefOr[Record[String, Any]] = js.native
    
    var Table: js.UndefOr[TableLocale] = js.native
    
    var Text: js.UndefOr[Copied] = js.native
    
    var TimePicker: js.UndefOr[Record[String, Any]] = js.native
    
    var Tour: js.UndefOr[TourLocale] = js.native
    
    var Transfer: js.UndefOr[web.typings.antd.esTransferMod.TransferLocale] = js.native
    
    var Upload: js.UndefOr[UploadLocale] = js.native
    
    var global: js.UndefOr[Record[String, Any]] = js.native
    
    var locale: String = js.native
  }
  object Locale {
    
    @scala.inline
    def apply(locale: String): Locale = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalendar(value: Record[String, Any]): Self = StObject.set(x, "Calendar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarUndefined: Self = StObject.set(x, "Calendar", js.undefined)
      
      @scala.inline
      def setColorPicker(value: PresetEmpty): Self = StObject.set(x, "ColorPicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPickerUndefined: Self = StObject.set(x, "ColorPicker", js.undefined)
      
      @scala.inline
      def setDatePicker(value: PickerLocale): Self = StObject.set(x, "DatePicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatePickerUndefined: Self = StObject.set(x, "DatePicker", js.undefined)
      
      @scala.inline
      def setEmpty(value: TransferLocale): Self = StObject.set(x, "Empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyUndefined: Self = StObject.set(x, "Empty", js.undefined)
      
      @scala.inline
      def setForm(value: DefaultValidateMessages): Self = StObject.set(x, "Form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "Form", js.undefined)
      
      @scala.inline
      def setGlobal(value: Record[String, Any]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      @scala.inline
      def setIcon(value: Record[String, Any]): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
      
      @scala.inline
      def setImage(value: Preview): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "Image", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModal(value: ModalLocale): Self = StObject.set(x, "Modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalUndefined: Self = StObject.set(x, "Modal", js.undefined)
      
      @scala.inline
      def setPageHeader(value: Back): Self = StObject.set(x, "PageHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageHeaderUndefined: Self = StObject.set(x, "PageHeader", js.undefined)
      
      @scala.inline
      def setPagination(value: PaginationLocale): Self = StObject.set(x, "Pagination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaginationUndefined: Self = StObject.set(x, "Pagination", js.undefined)
      
      @scala.inline
      def setPopconfirm(value: PopconfirmLocale): Self = StObject.set(x, "Popconfirm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopconfirmUndefined: Self = StObject.set(x, "Popconfirm", js.undefined)
      
      @scala.inline
      def setQRCode(value: Expired): Self = StObject.set(x, "QRCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQRCodeUndefined: Self = StObject.set(x, "QRCode", js.undefined)
      
      @scala.inline
      def setSelect(value: Record[String, Any]): Self = StObject.set(x, "Select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "Select", js.undefined)
      
      @scala.inline
      def setTable(value: TableLocale): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
      
      @scala.inline
      def setText(value: Copied): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
      
      @scala.inline
      def setTimePicker(value: Record[String, Any]): Self = StObject.set(x, "TimePicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePickerUndefined: Self = StObject.set(x, "TimePicker", js.undefined)
      
      @scala.inline
      def setTour(value: TourLocale): Self = StObject.set(x, "Tour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTourUndefined: Self = StObject.set(x, "Tour", js.undefined)
      
      @scala.inline
      def setTransfer(value: web.typings.antd.esTransferMod.TransferLocale): Self = StObject.set(x, "Transfer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransferUndefined: Self = StObject.set(x, "Transfer", js.undefined)
      
      @scala.inline
      def setUpload(value: UploadLocale): Self = StObject.set(x, "Upload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadUndefined: Self = StObject.set(x, "Upload", js.undefined)
    }
  }
  
  @js.native
  trait LocaleProviderProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var locale: Locale = js.native
  }
  object LocaleProviderProps {
    
    @scala.inline
    def apply(locale: Locale): LocaleProviderProps = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocaleProviderProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: LocaleProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
}
