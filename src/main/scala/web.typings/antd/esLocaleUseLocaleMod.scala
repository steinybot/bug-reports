package web.typings.antd

import web.typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLocaleUseLocaleMod {
  
  @JSImport("antd/es/locale/useLocale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[C /* <: LocaleComponentName */](componentName: C): js.Tuple2[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/es/locale.Locale[C] */ js.Any
    ], 
    String
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(componentName.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/es/locale.Locale[C] */ js.Any
    ], 
    String
  ]]
  @scala.inline
  def default[C /* <: LocaleComponentName */](
    componentName: C,
    defaultLocale: /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/es/locale.Locale[C] */ js.Any
  ): js.Tuple2[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/es/locale.Locale[C] */ js.Any
    ], 
    String
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(componentName.asInstanceOf[js.Any], defaultLocale.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/es/locale.Locale[C] */ js.Any
    ], 
    String
  ]]
  @scala.inline
  def default[C /* <: LocaleComponentName */](
    componentName: C,
    defaultLocale: js.Function0[
      /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/es/locale.Locale[C] */ js.Any
    ]
  ): js.Tuple2[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/es/locale.Locale[C] */ js.Any
    ], 
    String
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(componentName.asInstanceOf[js.Any], defaultLocale.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/es/locale.Locale[C] */ js.Any
    ], 
    String
  ]]
  
  /* Inlined std.Exclude<keyof antd.antd/es/locale.Locale, 'locale'> */
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.PageHeader
    - `web.typings`.antd.antdStrings.QRCode
    - `web.typings`.antd.antdStrings.Empty
    - `web.typings`.antd.antdStrings.Text
    - `web.typings`.antd.antdStrings.Pagination
    - `web.typings`.antd.antdStrings.global
    - `web.typings`.antd.antdStrings.Form
    - `web.typings`.antd.antdStrings.Select
    - `web.typings`.antd.antdStrings.Modal
    - `web.typings`.antd.antdStrings.Icon
    - `web.typings`.antd.antdStrings.TimePicker
    - `web.typings`.antd.antdStrings.Image
    - `web.typings`.antd.antdStrings.Transfer
    - `web.typings`.antd.antdStrings.Table
    - `web.typings`.antd.antdStrings.Tour
    - `web.typings`.antd.antdStrings.DatePicker
    - `web.typings`.antd.antdStrings.Calendar
    - `web.typings`.antd.antdStrings.ColorPicker
    - `web.typings`.antd.antdStrings.Upload
    - `web.typings`.antd.antdStrings.Popconfirm
  */
  trait LocaleComponentName extends StObject
  object LocaleComponentName {
    
    @scala.inline
    def Calendar: web.typings.antd.antdStrings.Calendar = "Calendar".asInstanceOf[web.typings.antd.antdStrings.Calendar]
    
    @scala.inline
    def ColorPicker: web.typings.antd.antdStrings.ColorPicker = "ColorPicker".asInstanceOf[web.typings.antd.antdStrings.ColorPicker]
    
    @scala.inline
    def DatePicker: web.typings.antd.antdStrings.DatePicker = "DatePicker".asInstanceOf[web.typings.antd.antdStrings.DatePicker]
    
    @scala.inline
    def Empty: web.typings.antd.antdStrings.Empty = "Empty".asInstanceOf[web.typings.antd.antdStrings.Empty]
    
    @scala.inline
    def Form: web.typings.antd.antdStrings.Form = "Form".asInstanceOf[web.typings.antd.antdStrings.Form]
    
    @scala.inline
    def Icon: web.typings.antd.antdStrings.Icon = "Icon".asInstanceOf[web.typings.antd.antdStrings.Icon]
    
    @scala.inline
    def Image: web.typings.antd.antdStrings.Image = "Image".asInstanceOf[web.typings.antd.antdStrings.Image]
    
    @scala.inline
    def Modal: web.typings.antd.antdStrings.Modal = "Modal".asInstanceOf[web.typings.antd.antdStrings.Modal]
    
    @scala.inline
    def PageHeader: web.typings.antd.antdStrings.PageHeader = "PageHeader".asInstanceOf[web.typings.antd.antdStrings.PageHeader]
    
    @scala.inline
    def Pagination: web.typings.antd.antdStrings.Pagination = "Pagination".asInstanceOf[web.typings.antd.antdStrings.Pagination]
    
    @scala.inline
    def Popconfirm: web.typings.antd.antdStrings.Popconfirm = "Popconfirm".asInstanceOf[web.typings.antd.antdStrings.Popconfirm]
    
    @scala.inline
    def QRCode: web.typings.antd.antdStrings.QRCode = "QRCode".asInstanceOf[web.typings.antd.antdStrings.QRCode]
    
    @scala.inline
    def Select: web.typings.antd.antdStrings.Select = "Select".asInstanceOf[web.typings.antd.antdStrings.Select]
    
    @scala.inline
    def Table: web.typings.antd.antdStrings.Table = "Table".asInstanceOf[web.typings.antd.antdStrings.Table]
    
    @scala.inline
    def Text: web.typings.antd.antdStrings.Text = "Text".asInstanceOf[web.typings.antd.antdStrings.Text]
    
    @scala.inline
    def TimePicker: web.typings.antd.antdStrings.TimePicker = "TimePicker".asInstanceOf[web.typings.antd.antdStrings.TimePicker]
    
    @scala.inline
    def Tour: web.typings.antd.antdStrings.Tour = "Tour".asInstanceOf[web.typings.antd.antdStrings.Tour]
    
    @scala.inline
    def Transfer: web.typings.antd.antdStrings.Transfer = "Transfer".asInstanceOf[web.typings.antd.antdStrings.Transfer]
    
    @scala.inline
    def Upload: web.typings.antd.antdStrings.Upload = "Upload".asInstanceOf[web.typings.antd.antdStrings.Upload]
    
    @scala.inline
    def global: web.typings.antd.antdStrings.global = "global".asInstanceOf[web.typings.antd.antdStrings.global]
  }
}
