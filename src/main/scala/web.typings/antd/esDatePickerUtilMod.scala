package web.typings.antd

import web.typings.antd.anon.DisabledHours
import web.typings.antd.anon.Format
import web.typings.antd.anon.ShowTime
import web.typings.antd.antdBooleans.`false`
import web.typings.antd.antdStrings.disabledTime
import web.typings.antd.esConfigProviderContextMod.DirectionType
import web.typings.antd.esDatePickerGeneratePickerMod.PickerLocale
import web.typings.antd.esUtilMotionMod.SelectCommonPlacement
import web.typings.rcComponentTrigger.esInterfaceMod.AlignType
import web.typings.rcPicker.esInterfaceMod.PickerMode
import web.typings.rcPicker.esPanelsTimePanelMod.SharedTimeProps
import web.typings.std.NonNullable
import web.typings.std.Omit
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDatePickerUtilMod {
  
  @JSImport("antd/es/date-picker/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getPlaceholder(locale: PickerLocale): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlaceholder")(locale.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def getPlaceholder(locale: PickerLocale, picker: PickerMode): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlaceholder")(locale.asInstanceOf[js.Any], picker.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def getPlaceholder(locale: PickerLocale, picker: PickerMode, customizePlaceholder: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlaceholder")(locale.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], customizePlaceholder.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def getPlaceholder(locale: PickerLocale, picker: Unit, customizePlaceholder: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlaceholder")(locale.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], customizePlaceholder.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getRangePlaceholder(locale: PickerLocale): js.UndefOr[js.Tuple2[String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRangePlaceholder")(locale.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Tuple2[String, String]]]
  @scala.inline
  def getRangePlaceholder(locale: PickerLocale, picker: PickerMode): js.UndefOr[js.Tuple2[String, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRangePlaceholder")(locale.asInstanceOf[js.Any], picker.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[String, String]]]
  @scala.inline
  def getRangePlaceholder(locale: PickerLocale, picker: PickerMode, customizePlaceholder: js.Tuple2[String, String]): js.UndefOr[js.Tuple2[String, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRangePlaceholder")(locale.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], customizePlaceholder.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[String, String]]]
  @scala.inline
  def getRangePlaceholder(locale: PickerLocale, picker: Unit, customizePlaceholder: js.Tuple2[String, String]): js.UndefOr[js.Tuple2[String, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRangePlaceholder")(locale.asInstanceOf[js.Any], picker.asInstanceOf[js.Any], customizePlaceholder.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[String, String]]]
  
  @scala.inline
  def getTimeProps_disabledTime[DateType, DisabledTime](props: Format[DisabledTime] with (Omit[SharedTimeProps[DateType], disabledTime])): (DisabledHours[DateType, DisabledTime]) | (ShowTime[DateType, DisabledTime]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeProps")(props.asInstanceOf[js.Any]).asInstanceOf[(DisabledHours[DateType, DisabledTime]) | (ShowTime[DateType, DisabledTime])]
  
  @scala.inline
  def mergeAllowClear(allowClear: AllowClear, clearIcon: ClearIcon, defaultClearIcon: NonNullable[ClearIcon]): `false` | web.typings.antd.anon.ClearIcon = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeAllowClear")(allowClear.asInstanceOf[js.Any], clearIcon.asInstanceOf[js.Any], defaultClearIcon.asInstanceOf[js.Any])).asInstanceOf[`false` | web.typings.antd.anon.ClearIcon]
  
  @scala.inline
  def transPlacement2DropdownAlign(direction: DirectionType): AlignType = ^.asInstanceOf[js.Dynamic].applyDynamic("transPlacement2DropdownAlign")(direction.asInstanceOf[js.Any]).asInstanceOf[AlignType]
  @scala.inline
  def transPlacement2DropdownAlign(direction: DirectionType, placement: SelectCommonPlacement): AlignType = (^.asInstanceOf[js.Dynamic].applyDynamic("transPlacement2DropdownAlign")(direction.asInstanceOf[js.Any], placement.asInstanceOf[js.Any])).asInstanceOf[AlignType]
  
  type AllowClear = js.UndefOr[Boolean | web.typings.rcPicker.anon.ClearIcon]
  
  type ClearIcon = js.UndefOr[ReactElement]
}
