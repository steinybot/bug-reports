package web.typings.antd

import web.typings.antd.antdStrings.icon_
import web.typings.antd.antdStrings.textSlashhtml
import web.typings.antd.antdStrings.textSlashplain
import web.typings.antd.antdStrings.text_
import web.typings.antd.esTooltipMod.TooltipProps
import web.typings.antd.esTypographyTypographyMod.TypographyProps
import web.typings.rcTextarea.esInterfaceMod.AutoSizeType
import web.typings.react.mod.MouseEventHandler
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTypographyBaseMod extends Shortcut {
  
  @JSImport("antd/es/typography/Base", JSImport.Default)
  @js.native
  val default: ReactComponentClass[
    (BlockProps[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with `web.typings`.antd.antdStrings.a, `web.typings`.antd.antdStrings.abbr, `web.typings`.antd.antdStrings.address */ Any
    ]) with RefAttributes[HTMLElement]
  ] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.secondary
    - `web.typings`.antd.antdStrings.success
    - `web.typings`.antd.antdStrings.warning
    - `web.typings`.antd.antdStrings.danger
  */
  trait BaseType extends StObject
  object BaseType {
    
    @scala.inline
    def danger: web.typings.antd.antdStrings.danger = "danger".asInstanceOf[web.typings.antd.antdStrings.danger]
    
    @scala.inline
    def secondary: web.typings.antd.antdStrings.secondary = "secondary".asInstanceOf[web.typings.antd.antdStrings.secondary]
    
    @scala.inline
    def success: web.typings.antd.antdStrings.success = "success".asInstanceOf[web.typings.antd.antdStrings.success]
    
    @scala.inline
    def warning: web.typings.antd.antdStrings.warning = "warning".asInstanceOf[web.typings.antd.antdStrings.warning]
  }
  
  @js.native
  trait BlockProps[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with `web.typings`.antd.antdStrings.a, `web.typings`.antd.antdStrings.abbr, `web.typings`.antd.antdStrings.address */ Any */]
    extends StObject
       with TypographyProps[C] {
    
    var code: js.UndefOr[Boolean] = js.native
    
    var copyable: js.UndefOr[Boolean | CopyConfig] = js.native
    
    var delete: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var editable: js.UndefOr[Boolean | EditConfig] = js.native
    
    var ellipsis: js.UndefOr[Boolean | EllipsisConfig] = js.native
    
    var italic: js.UndefOr[Boolean] = js.native
    
    var keyboard: js.UndefOr[Boolean] = js.native
    
    var mark: js.UndefOr[Boolean] = js.native
    
    var strong: js.UndefOr[Boolean] = js.native
    
    var `type`: js.UndefOr[BaseType] = js.native
    
    var underline: js.UndefOr[Boolean] = js.native
  }
  object BlockProps {
    
    @scala.inline
    def apply[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with `web.typings`.antd.antdStrings.a, `web.typings`.antd.antdStrings.abbr, `web.typings`.antd.antdStrings.address */ Any */](): BlockProps[C] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockProps[C]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: BlockProps[_], C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with `web.typings`.antd.antdStrings.a, `web.typings`.antd.antdStrings.abbr, `web.typings`.antd.antdStrings.address */ Any */] (val x: Self with BlockProps[C]) extends AnyVal {
      
      @scala.inline
      def setCode(value: Boolean): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setCopyable(value: Boolean | CopyConfig): Self = StObject.set(x, "copyable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyableUndefined: Self = StObject.set(x, "copyable", js.undefined)
      
      @scala.inline
      def setDelete(value: Boolean): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEditable(value: Boolean | EditConfig): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      @scala.inline
      def setEllipsis(value: Boolean | EllipsisConfig): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      @scala.inline
      def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
      
      @scala.inline
      def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setMark(value: Boolean): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      @scala.inline
      def setStrong(value: Boolean): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
      
      @scala.inline
      def setType(value: BaseType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    }
  }
  
  @js.native
  trait CopyConfig extends StObject {
    
    var format: js.UndefOr[textSlashplain | textSlashhtml] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var onCopy: js.UndefOr[js.Function1[/* event */ js.UndefOr[SyntheticMouseEvent[HTMLDivElement]], Unit]] = js.native
    
    var text: js.UndefOr[String] = js.native
    
    var tooltips: js.UndefOr[Boolean | ReactElement] = js.native
  }
  object CopyConfig {
    
    @scala.inline
    def apply(): CopyConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CopyConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CopyConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: textSlashplain | textSlashhtml): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setOnCopy(value: /* event */ js.UndefOr[SyntheticMouseEvent[HTMLDivElement]] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTooltips(value: Boolean | ReactElement): Self = StObject.set(x, "tooltips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipsReactElement(value: ReactElement): Self = StObject.set(x, "tooltips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipsUndefined: Self = StObject.set(x, "tooltips", js.undefined)
    }
  }
  
  @js.native
  trait EditConfig extends StObject {
    
    var autoSize: js.UndefOr[Boolean | AutoSizeType] = js.native
    
    var editing: js.UndefOr[Boolean] = js.native
    
    var enterIcon: js.UndefOr[ReactElement] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var onCancel: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
    
    var onEnd: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onStart: js.UndefOr[js.Function0[Unit]] = js.native
    
    var text: js.UndefOr[String] = js.native
    
    var tooltip: js.UndefOr[Boolean | ReactElement] = js.native
    
    var triggerType: js.UndefOr[js.Array[icon_ | text_]] = js.native
  }
  object EditConfig {
    
    @scala.inline
    def apply(): EditConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: EditConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoSize(value: Boolean | AutoSizeType): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
      
      @scala.inline
      def setEditing(value: Boolean): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditingUndefined: Self = StObject.set(x, "editing", js.undefined)
      
      @scala.inline
      def setEnterIcon(value: ReactElement): Self = StObject.set(x, "enterIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterIconUndefined: Self = StObject.set(x, "enterIcon", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnEnd(value: () => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      @scala.inline
      def setOnStart(value: () => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTooltip(value: Boolean | ReactElement): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipReactElement(value: ReactElement): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setTriggerType(value: js.Array[icon_ | text_]): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerTypeUndefined: Self = StObject.set(x, "triggerType", js.undefined)
      
      @scala.inline
      def setTriggerTypeVarargs(value: (icon_ | text_)*): Self = StObject.set(x, "triggerType", js.Array(value :_*))
    }
  }
  
  @js.native
  trait EllipsisConfig extends StObject {
    
    var expandable: js.UndefOr[Boolean] = js.native
    
    var onEllipsis: js.UndefOr[js.Function1[/* ellipsis */ Boolean, Unit]] = js.native
    
    var onExpand: js.UndefOr[MouseEventHandler[HTMLElement]] = js.native
    
    var rows: js.UndefOr[Double] = js.native
    
    var suffix: js.UndefOr[String] = js.native
    
    var symbol: js.UndefOr[ReactElement] = js.native
    
    var tooltip: js.UndefOr[ReactElement | TooltipProps] = js.native
  }
  object EllipsisConfig {
    
    @scala.inline
    def apply(): EllipsisConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EllipsisConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: EllipsisConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
      
      @scala.inline
      def setOnEllipsis(value: /* ellipsis */ Boolean => Unit): Self = StObject.set(x, "onEllipsis", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEllipsisUndefined: Self = StObject.set(x, "onEllipsis", js.undefined)
      
      @scala.inline
      def setOnExpand(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setSymbol(value: ReactElement): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      @scala.inline
      def setTooltip(value: ReactElement | TooltipProps): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipReactElement(value: ReactElement): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[
    (BlockProps[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with `web.typings`.antd.antdStrings.a, `web.typings`.antd.antdStrings.abbr, `web.typings`.antd.antdStrings.address */ Any
    ]) with RefAttributes[HTMLElement]
  ]
  
  /* This means you don't have to write `default`, but can instead just say `esTypographyBaseMod.foo` */
  override def _to: ReactComponentClass[
    (BlockProps[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with `web.typings`.antd.antdStrings.a, `web.typings`.antd.antdStrings.abbr, `web.typings`.antd.antdStrings.address */ Any
    ]) with RefAttributes[HTMLElement]
  ] = default
}
