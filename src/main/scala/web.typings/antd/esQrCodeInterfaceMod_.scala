package web.typings.antd

import web.typings.antd.antdStrings.H
import web.typings.antd.antdStrings.L
import web.typings.antd.antdStrings.M
import web.typings.antd.antdStrings.Q
import web.typings.antd.antdStrings.active
import web.typings.antd.antdStrings.canvas
import web.typings.antd.antdStrings.expired
import web.typings.antd.antdStrings.loading
import web.typings.antd.antdStrings.svg
import web.typings.react.mod.AriaAttributes
import web.typings.react.mod.AriaRole
import web.typings.react.mod.Booleanish
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.DOMAttributes
import web.typings.react.reactStrings._empty
import web.typings.react.reactStrings.`after-edge`
import web.typings.react.reactStrings.`before-edge`
import web.typings.react.reactStrings.`text-after-edge`
import web.typings.react.reactStrings.`text-before-edge`
import web.typings.react.reactStrings.`use-credentials`
import web.typings.react.reactStrings.alphabetic
import web.typings.react.reactStrings.anonymous
import web.typings.react.reactStrings.auto
import web.typings.react.reactStrings.baseline
import web.typings.react.reactStrings.bevel
import web.typings.react.reactStrings.butt
import web.typings.react.reactStrings.central
import web.typings.react.reactStrings.decimal
import web.typings.react.reactStrings.email
import web.typings.react.reactStrings.evenodd
import web.typings.react.reactStrings.hanging
import web.typings.react.reactStrings.ideographic
import web.typings.react.reactStrings.inherit
import web.typings.react.reactStrings.initial
import web.typings.react.reactStrings.isolated
import web.typings.react.reactStrings.linearRGB
import web.typings.react.reactStrings.mathematical
import web.typings.react.reactStrings.medial
import web.typings.react.reactStrings.middle
import web.typings.react.reactStrings.miter
import web.typings.react.reactStrings.no
import web.typings.react.reactStrings.none
import web.typings.react.reactStrings.nonzero
import web.typings.react.reactStrings.numeric
import web.typings.react.reactStrings.off
import web.typings.react.reactStrings.on
import web.typings.react.reactStrings.replace
import web.typings.react.reactStrings.round
import web.typings.react.reactStrings.sRGB
import web.typings.react.reactStrings.search
import web.typings.react.reactStrings.square
import web.typings.react.reactStrings.sum
import web.typings.react.reactStrings.tel
import web.typings.react.reactStrings.terminal
import web.typings.react.reactStrings.text
import web.typings.react.reactStrings.url
import web.typings.react.reactStrings.yes
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esQrCodeInterfaceMod_ {
  
  @js.native
  trait ImageSettings extends StObject {
    
    var excavate: Boolean = js.native
    
    var height: Double = js.native
    
    var src: String = js.native
    
    var width: Double = js.native
    
    var x: js.UndefOr[Double] = js.native
    
    var y: js.UndefOr[Double] = js.native
  }
  object ImageSettings {
    
    @scala.inline
    def apply(excavate: Boolean, height: Double, src: String, width: Double): ImageSettings = {
      val __obj = js.Dynamic.literal(excavate = excavate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageSettings]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ImageSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExcavate(value: Boolean): Self = StObject.set(x, "excavate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait QRCodeProps
    extends StObject
       with QRProps {
    
    var bordered: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var errorLevel: js.UndefOr[L | M | Q | H] = js.native
    
    var icon: js.UndefOr[String] = js.native
    
    var iconSize: js.UndefOr[Double] = js.native
    
    var onRefresh: js.UndefOr[js.Function0[Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var status: js.UndefOr[active | expired | loading] = js.native
  }
  object QRCodeProps {
    
    @scala.inline
    def apply(value: String): QRCodeProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[QRCodeProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: QRCodeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setErrorLevel(value: L | M | Q | H): Self = StObject.set(x, "errorLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorLevelUndefined: Self = StObject.set(x, "errorLevel", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setOnRefresh(value: () => Unit): Self = StObject.set(x, "onRefresh", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setStatus(value: active | expired | loading): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  @js.native
  trait QRProps extends StObject {
    
    var bgColor: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var imageSettings: js.UndefOr[ImageSettings] = js.native
    
    var includeMargin: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var `type`: js.UndefOr[canvas | svg] = js.native
    
    var value: String = js.native
  }
  object QRProps {
    
    @scala.inline
    def apply(value: String): QRProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[QRProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: QRProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setImageSettings(value: ImageSettings): Self = StObject.set(x, "imageSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSettingsUndefined: Self = StObject.set(x, "imageSettings", js.undefined)
      
      @scala.inline
      def setIncludeMargin(value: Boolean): Self = StObject.set(x, "includeMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeMarginUndefined: Self = StObject.set(x, "includeMargin", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setType(value: canvas | svg): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `web.typings`.react.mod.HTMLAttributes because var conflicts: color, style. Inlined contextMenu, vocab, typeof, inputMode, is, about, accessKey, content, nonce, itemScope, security, defaultValue, autoSave, prefix, resource, suppressHydrationWarning, itemType, spellCheck, tabIndex, slot, autoCapitalize, rev, placeholder, rel, radioGroup, id, lang, suppressContentEditableWarning, translate, itemID, dir, draggable, contentEditable, itemRef, hidden, inlist, property, defaultChecked, className, autoFocus, unselectable, role, datatype, itemProp, title, autoCorrect, results
  - `web.typings`.react.mod.CanvasHTMLAttributes because var conflicts: color, style. Inlined width, height */ @js.native
  trait QRPropsCanvas
    extends StObject
       with QRProps
       with AriaAttributes
       with DOMAttributes[HTMLCanvasElement] {
    
    // RDFa Attributes
    var about: js.UndefOr[String] = js.native
    
    // Standard HTML Attributes
    var accessKey: js.UndefOr[String] = js.native
    
    // Non-standard Attributes
    var autoCapitalize: js.UndefOr[String] = js.native
    
    var autoCorrect: js.UndefOr[String] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var autoSave: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var content: js.UndefOr[String] = js.native
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
    
    var contextMenu: js.UndefOr[String] = js.native
    
    var datatype: js.UndefOr[String] = js.native
    
    // React-specific Attributes
    var defaultChecked: js.UndefOr[Boolean] = js.native
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
    
    var dir: js.UndefOr[String] = js.native
    
    var draggable: js.UndefOr[Booleanish] = js.native
    
    var height: js.UndefOr[Double | String] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var inlist: js.UndefOr[Any] = js.native
    
    // Living Standard
    /**
      * Hints at the type of data that might be entered by the user while editing the element or its contents
      * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
      */
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
    
    /**
      * Specify that a standard HTML element should behave like a defined custom built-in element
      * @see https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is
      */
    var is: js.UndefOr[String] = js.native
    
    var itemID: js.UndefOr[String] = js.native
    
    var itemProp: js.UndefOr[String] = js.native
    
    var itemRef: js.UndefOr[String] = js.native
    
    var itemScope: js.UndefOr[Boolean] = js.native
    
    var itemType: js.UndefOr[String] = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    var nonce: js.UndefOr[String] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var property: js.UndefOr[String] = js.native
    
    // Unknown
    var radioGroup: js.UndefOr[String] = js.native
    
    var rel: js.UndefOr[String] = js.native
    
    var resource: js.UndefOr[String] = js.native
    
    var results: js.UndefOr[Double] = js.native
    
    var rev: js.UndefOr[String] = js.native
    
    // <command>, <menuitem>
    // WAI-ARIA
    var role: js.UndefOr[AriaRole] = js.native
    
    var security: js.UndefOr[String] = js.native
    
    var slot: js.UndefOr[String] = js.native
    
    var spellCheck: js.UndefOr[Booleanish] = js.native
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var translate: js.UndefOr[yes | no] = js.native
    
    var typeof: js.UndefOr[String] = js.native
    
    var unselectable: js.UndefOr[on | off] = js.native
    
    var vocab: js.UndefOr[String] = js.native
    
    var width: js.UndefOr[Double | String] = js.native
  }
  object QRPropsCanvas {
    
    @scala.inline
    def apply(value: String): QRPropsCanvas = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[QRPropsCanvas]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: QRPropsCanvas] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      @scala.inline
      def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      @scala.inline
      def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      @scala.inline
      def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      @scala.inline
      def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      @scala.inline
      def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      @scala.inline
      def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      @scala.inline
      def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      @scala.inline
      def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      @scala.inline
      def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      @scala.inline
      def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      @scala.inline
      def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      @scala.inline
      def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      @scala.inline
      def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      @scala.inline
      def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      @scala.inline
      def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      @scala.inline
      def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevUndefined: Self = StObject.set(x, "rev", js.undefined)
      
      @scala.inline
      def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      @scala.inline
      def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      @scala.inline
      def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      @scala.inline
      def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      @scala.inline
      def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      @scala.inline
      def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      @scala.inline
      def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `web.typings`.react.mod.SVGAttributes because var conflicts: color, style, `type`. Inlined fontFamily, x, points, slope, textAnchor, panose1, pointerEvents, shapeRendering, fontSize, max, pathLength, markerStart, in, strokeLinecap, repeatDur, strokeDashoffset, radius, alphabetic, vertOriginX, textLength, xmlBase, keyTimes, k3, fontVariant, lightingColor, overlinePosition, calcMode, contentScriptType, filterUnits, requiredExtensions, xlinkType, height, yChannelSelector, fillOpacity, g2, y2, kerning, viewBox, begin, colorRendering, xmlSpace, dy, method, floodColor, seed, targetY, xlinkHref, rx, fontSizeAdjust, maskUnits, y, strokeWidth, stitchTiles, underlinePosition, decelerate, keySplines, target, cx, requiredFeatures, strokeOpacity, paintOrder, allowReorder, local, mathematical, pointsAtY, xChannelSelector, min, exponent, from, kernelUnitLength, writingMode, d, unicodeBidi, ascent, strokeLinejoin, arabicForm, k, xlinkActuate, dur, by, viewTarget, format, media, edgeMode, attributeType, refY, u2, string, vMathematical, specularConstant, bbox, stroke, fontStretch, overflow, ry, stdDeviation, vAlphabetic, amplitude, elevation, tabIndex, vertAdvY, textRendering, ideographic, targetX, divisor, scale, xlinkArcrole, x1, repeatCount, fx, unitsPerEm, spreadMethod, xHeight, visibility, glyphName, limitingConeAngle, kernelMatrix, markerEnd, systemLanguage, numOctaves, stopColor, operator, patternContentUnits, capHeight, id, tableValues, lang, vIdeographic, end, startOffset, externalResourcesRequired, xmlns, clip, dominantBaseline, spacing, xlinkShow, restart, focusable, r, u1, version, g1, origin, refX, strikethroughPosition, attributeName, x2, descent, stemh, fr, gradientTransform, path, dx, baseFrequency, overlineThickness, specularExponent, baselineShift, surfaceScale, stopOpacity, to, orient, order, fontWeight, underlineThickness, letterSpacing, hanging, name, horizOriginX, mask, widths, z, fillRule, clipRule, glyphRef, accumulate, unicode, patternUnits, azimuth, xmlnsXlink, direction, xlinkTitle, k2, width, speed, colorInterpolation, maskContentUnits, cursor, markerUnits, colorProfile, colorInterpolationFilters, fill, intercept, glyphOrientationVertical, href, mode, rotate, pointsAtX, wordSpacing, y1, alignmentBaseline, className, clipPathUnits, fontStyle, vectorEffect, vHanging, values, in2, diffuseConstant, horizAdvX, pointsAtZ, strikethroughThickness, strokeDasharray, role, k4, vertOriginY, result, accentHeight, lengthAdjust, filterRes, imageRendering, crossOrigin, gradientUnits, patternTransform, markerMid, markerHeight, stemv, strokeMiterlimit, renderingIntent, preserveAlpha, preserveAspectRatio, fy, zoomAndPan, cy, primitiveUnits, display, xmlLang, clipPath, textDecoration, orientation, unicodeRange, k1, markerWidth, offset, opacity, baseProfile, enableBackground, filter, xlinkRole, floodOpacity, contentStyleType, autoReverse, bias, additive, transform, glyphOrientationHorizontal, keyPoints */ @js.native
  trait QRPropsSvg
    extends StObject
       with QRProps
       with AriaAttributes
       with DOMAttributes[SVGSVGElement] {
    
    // SVG Specific attributes
    var accentHeight: js.UndefOr[Double | String] = js.native
    
    var accumulate: js.UndefOr[none | sum] = js.native
    
    var additive: js.UndefOr[replace | sum] = js.native
    
    var alignmentBaseline: js.UndefOr[
        auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
      ] = js.native
    
    var allowReorder: js.UndefOr[no | yes] = js.native
    
    var alphabetic: js.UndefOr[Double | String] = js.native
    
    var amplitude: js.UndefOr[Double | String] = js.native
    
    var arabicForm: js.UndefOr[initial | medial | terminal | isolated] = js.native
    
    var ascent: js.UndefOr[Double | String] = js.native
    
    var attributeName: js.UndefOr[String] = js.native
    
    var attributeType: js.UndefOr[String] = js.native
    
    var autoReverse: js.UndefOr[Booleanish] = js.native
    
    var azimuth: js.UndefOr[Double | String] = js.native
    
    var baseFrequency: js.UndefOr[Double | String] = js.native
    
    var baseProfile: js.UndefOr[Double | String] = js.native
    
    var baselineShift: js.UndefOr[Double | String] = js.native
    
    var bbox: js.UndefOr[Double | String] = js.native
    
    var begin: js.UndefOr[Double | String] = js.native
    
    var bias: js.UndefOr[Double | String] = js.native
    
    var by: js.UndefOr[Double | String] = js.native
    
    var calcMode: js.UndefOr[Double | String] = js.native
    
    var capHeight: js.UndefOr[Double | String] = js.native
    
    // Attributes which also defined in HTMLAttributes
    // See comment in SVGDOMPropertyConfig.js
    var className: js.UndefOr[String] = js.native
    
    var clip: js.UndefOr[Double | String] = js.native
    
    var clipPath: js.UndefOr[String] = js.native
    
    var clipPathUnits: js.UndefOr[Double | String] = js.native
    
    var clipRule: js.UndefOr[Double | String] = js.native
    
    var colorInterpolation: js.UndefOr[Double | String] = js.native
    
    var colorInterpolationFilters: js.UndefOr[auto | sRGB | linearRGB | inherit] = js.native
    
    var colorProfile: js.UndefOr[Double | String] = js.native
    
    var colorRendering: js.UndefOr[Double | String] = js.native
    
    var contentScriptType: js.UndefOr[Double | String] = js.native
    
    var contentStyleType: js.UndefOr[Double | String] = js.native
    
    var crossOrigin: js.UndefOr[anonymous | `use-credentials` | _empty] = js.native
    
    var cursor: js.UndefOr[Double | String] = js.native
    
    var cx: js.UndefOr[Double | String] = js.native
    
    var cy: js.UndefOr[Double | String] = js.native
    
    var d: js.UndefOr[String] = js.native
    
    var decelerate: js.UndefOr[Double | String] = js.native
    
    var descent: js.UndefOr[Double | String] = js.native
    
    var diffuseConstant: js.UndefOr[Double | String] = js.native
    
    var direction: js.UndefOr[Double | String] = js.native
    
    var display: js.UndefOr[Double | String] = js.native
    
    var divisor: js.UndefOr[Double | String] = js.native
    
    var dominantBaseline: js.UndefOr[Double | String] = js.native
    
    var dur: js.UndefOr[Double | String] = js.native
    
    var dx: js.UndefOr[Double | String] = js.native
    
    var dy: js.UndefOr[Double | String] = js.native
    
    var edgeMode: js.UndefOr[Double | String] = js.native
    
    var elevation: js.UndefOr[Double | String] = js.native
    
    var enableBackground: js.UndefOr[Double | String] = js.native
    
    var end: js.UndefOr[Double | String] = js.native
    
    var exponent: js.UndefOr[Double | String] = js.native
    
    var externalResourcesRequired: js.UndefOr[Booleanish] = js.native
    
    var fill: js.UndefOr[String] = js.native
    
    var fillOpacity: js.UndefOr[Double | String] = js.native
    
    var fillRule: js.UndefOr[nonzero | evenodd | inherit] = js.native
    
    var filter: js.UndefOr[String] = js.native
    
    var filterRes: js.UndefOr[Double | String] = js.native
    
    var filterUnits: js.UndefOr[Double | String] = js.native
    
    var floodColor: js.UndefOr[Double | String] = js.native
    
    var floodOpacity: js.UndefOr[Double | String] = js.native
    
    var focusable: js.UndefOr[Booleanish | auto] = js.native
    
    var fontFamily: js.UndefOr[String] = js.native
    
    var fontSize: js.UndefOr[Double | String] = js.native
    
    var fontSizeAdjust: js.UndefOr[Double | String] = js.native
    
    var fontStretch: js.UndefOr[Double | String] = js.native
    
    var fontStyle: js.UndefOr[Double | String] = js.native
    
    var fontVariant: js.UndefOr[Double | String] = js.native
    
    var fontWeight: js.UndefOr[Double | String] = js.native
    
    var format: js.UndefOr[Double | String] = js.native
    
    var fr: js.UndefOr[Double | String] = js.native
    
    var from: js.UndefOr[Double | String] = js.native
    
    var fx: js.UndefOr[Double | String] = js.native
    
    var fy: js.UndefOr[Double | String] = js.native
    
    var g1: js.UndefOr[Double | String] = js.native
    
    var g2: js.UndefOr[Double | String] = js.native
    
    var glyphName: js.UndefOr[Double | String] = js.native
    
    var glyphOrientationHorizontal: js.UndefOr[Double | String] = js.native
    
    var glyphOrientationVertical: js.UndefOr[Double | String] = js.native
    
    var glyphRef: js.UndefOr[Double | String] = js.native
    
    var gradientTransform: js.UndefOr[String] = js.native
    
    var gradientUnits: js.UndefOr[String] = js.native
    
    var hanging: js.UndefOr[Double | String] = js.native
    
    var height: js.UndefOr[Double | String] = js.native
    
    var horizAdvX: js.UndefOr[Double | String] = js.native
    
    var horizOriginX: js.UndefOr[Double | String] = js.native
    
    var href: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var ideographic: js.UndefOr[Double | String] = js.native
    
    var imageRendering: js.UndefOr[Double | String] = js.native
    
    var in: js.UndefOr[String] = js.native
    
    var in2: js.UndefOr[Double | String] = js.native
    
    var intercept: js.UndefOr[Double | String] = js.native
    
    var k: js.UndefOr[Double | String] = js.native
    
    var k1: js.UndefOr[Double | String] = js.native
    
    var k2: js.UndefOr[Double | String] = js.native
    
    var k3: js.UndefOr[Double | String] = js.native
    
    var k4: js.UndefOr[Double | String] = js.native
    
    var kernelMatrix: js.UndefOr[Double | String] = js.native
    
    var kernelUnitLength: js.UndefOr[Double | String] = js.native
    
    var kerning: js.UndefOr[Double | String] = js.native
    
    var keyPoints: js.UndefOr[Double | String] = js.native
    
    var keySplines: js.UndefOr[Double | String] = js.native
    
    var keyTimes: js.UndefOr[Double | String] = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    var lengthAdjust: js.UndefOr[Double | String] = js.native
    
    var letterSpacing: js.UndefOr[Double | String] = js.native
    
    var lightingColor: js.UndefOr[Double | String] = js.native
    
    var limitingConeAngle: js.UndefOr[Double | String] = js.native
    
    var local: js.UndefOr[Double | String] = js.native
    
    var markerEnd: js.UndefOr[String] = js.native
    
    var markerHeight: js.UndefOr[Double | String] = js.native
    
    var markerMid: js.UndefOr[String] = js.native
    
    var markerStart: js.UndefOr[String] = js.native
    
    var markerUnits: js.UndefOr[Double | String] = js.native
    
    var markerWidth: js.UndefOr[Double | String] = js.native
    
    var mask: js.UndefOr[String] = js.native
    
    var maskContentUnits: js.UndefOr[Double | String] = js.native
    
    var maskUnits: js.UndefOr[Double | String] = js.native
    
    var mathematical: js.UndefOr[Double | String] = js.native
    
    var max: js.UndefOr[Double | String] = js.native
    
    var media: js.UndefOr[String] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var min: js.UndefOr[Double | String] = js.native
    
    var mode: js.UndefOr[Double | String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var numOctaves: js.UndefOr[Double | String] = js.native
    
    var offset: js.UndefOr[Double | String] = js.native
    
    var opacity: js.UndefOr[Double | String] = js.native
    
    var operator: js.UndefOr[Double | String] = js.native
    
    var order: js.UndefOr[Double | String] = js.native
    
    var orient: js.UndefOr[Double | String] = js.native
    
    var orientation: js.UndefOr[Double | String] = js.native
    
    var origin: js.UndefOr[Double | String] = js.native
    
    var overflow: js.UndefOr[Double | String] = js.native
    
    var overlinePosition: js.UndefOr[Double | String] = js.native
    
    var overlineThickness: js.UndefOr[Double | String] = js.native
    
    var paintOrder: js.UndefOr[Double | String] = js.native
    
    var panose1: js.UndefOr[Double | String] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var pathLength: js.UndefOr[Double | String] = js.native
    
    var patternContentUnits: js.UndefOr[String] = js.native
    
    var patternTransform: js.UndefOr[Double | String] = js.native
    
    var patternUnits: js.UndefOr[String] = js.native
    
    var pointerEvents: js.UndefOr[Double | String] = js.native
    
    var points: js.UndefOr[String] = js.native
    
    var pointsAtX: js.UndefOr[Double | String] = js.native
    
    var pointsAtY: js.UndefOr[Double | String] = js.native
    
    var pointsAtZ: js.UndefOr[Double | String] = js.native
    
    var preserveAlpha: js.UndefOr[Booleanish] = js.native
    
    var preserveAspectRatio: js.UndefOr[String] = js.native
    
    var primitiveUnits: js.UndefOr[Double | String] = js.native
    
    var r: js.UndefOr[Double | String] = js.native
    
    var radius: js.UndefOr[Double | String] = js.native
    
    var refX: js.UndefOr[Double | String] = js.native
    
    var refY: js.UndefOr[Double | String] = js.native
    
    var renderingIntent: js.UndefOr[Double | String] = js.native
    
    var repeatCount: js.UndefOr[Double | String] = js.native
    
    var repeatDur: js.UndefOr[Double | String] = js.native
    
    var requiredExtensions: js.UndefOr[Double | String] = js.native
    
    var requiredFeatures: js.UndefOr[Double | String] = js.native
    
    var restart: js.UndefOr[Double | String] = js.native
    
    var result: js.UndefOr[String] = js.native
    
    // Other HTML properties supported by SVG elements in browsers
    var role: js.UndefOr[AriaRole] = js.native
    
    var rotate: js.UndefOr[Double | String] = js.native
    
    var rx: js.UndefOr[Double | String] = js.native
    
    var ry: js.UndefOr[Double | String] = js.native
    
    var scale: js.UndefOr[Double | String] = js.native
    
    var seed: js.UndefOr[Double | String] = js.native
    
    var shapeRendering: js.UndefOr[Double | String] = js.native
    
    var slope: js.UndefOr[Double | String] = js.native
    
    var spacing: js.UndefOr[Double | String] = js.native
    
    var specularConstant: js.UndefOr[Double | String] = js.native
    
    var specularExponent: js.UndefOr[Double | String] = js.native
    
    var speed: js.UndefOr[Double | String] = js.native
    
    var spreadMethod: js.UndefOr[String] = js.native
    
    var startOffset: js.UndefOr[Double | String] = js.native
    
    var stdDeviation: js.UndefOr[Double | String] = js.native
    
    var stemh: js.UndefOr[Double | String] = js.native
    
    var stemv: js.UndefOr[Double | String] = js.native
    
    var stitchTiles: js.UndefOr[Double | String] = js.native
    
    var stopColor: js.UndefOr[String] = js.native
    
    var stopOpacity: js.UndefOr[Double | String] = js.native
    
    var strikethroughPosition: js.UndefOr[Double | String] = js.native
    
    var strikethroughThickness: js.UndefOr[Double | String] = js.native
    
    var string: js.UndefOr[Double | String] = js.native
    
    var stroke: js.UndefOr[String] = js.native
    
    var strokeDasharray: js.UndefOr[String | Double] = js.native
    
    var strokeDashoffset: js.UndefOr[String | Double] = js.native
    
    var strokeLinecap: js.UndefOr[butt | round | square | inherit] = js.native
    
    var strokeLinejoin: js.UndefOr[miter | round | bevel | inherit] = js.native
    
    var strokeMiterlimit: js.UndefOr[Double | String] = js.native
    
    var strokeOpacity: js.UndefOr[Double | String] = js.native
    
    var strokeWidth: js.UndefOr[Double | String] = js.native
    
    var surfaceScale: js.UndefOr[Double | String] = js.native
    
    var systemLanguage: js.UndefOr[Double | String] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var tableValues: js.UndefOr[Double | String] = js.native
    
    var target: js.UndefOr[String] = js.native
    
    var targetX: js.UndefOr[Double | String] = js.native
    
    var targetY: js.UndefOr[Double | String] = js.native
    
    var textAnchor: js.UndefOr[String] = js.native
    
    var textDecoration: js.UndefOr[Double | String] = js.native
    
    var textLength: js.UndefOr[Double | String] = js.native
    
    var textRendering: js.UndefOr[Double | String] = js.native
    
    var to: js.UndefOr[Double | String] = js.native
    
    var transform: js.UndefOr[String] = js.native
    
    var u1: js.UndefOr[Double | String] = js.native
    
    var u2: js.UndefOr[Double | String] = js.native
    
    var underlinePosition: js.UndefOr[Double | String] = js.native
    
    var underlineThickness: js.UndefOr[Double | String] = js.native
    
    var unicode: js.UndefOr[Double | String] = js.native
    
    var unicodeBidi: js.UndefOr[Double | String] = js.native
    
    var unicodeRange: js.UndefOr[Double | String] = js.native
    
    var unitsPerEm: js.UndefOr[Double | String] = js.native
    
    var vAlphabetic: js.UndefOr[Double | String] = js.native
    
    var vHanging: js.UndefOr[Double | String] = js.native
    
    var vIdeographic: js.UndefOr[Double | String] = js.native
    
    var vMathematical: js.UndefOr[Double | String] = js.native
    
    var values: js.UndefOr[String] = js.native
    
    var vectorEffect: js.UndefOr[Double | String] = js.native
    
    var version: js.UndefOr[String] = js.native
    
    var vertAdvY: js.UndefOr[Double | String] = js.native
    
    var vertOriginX: js.UndefOr[Double | String] = js.native
    
    var vertOriginY: js.UndefOr[Double | String] = js.native
    
    var viewBox: js.UndefOr[String] = js.native
    
    var viewTarget: js.UndefOr[Double | String] = js.native
    
    var visibility: js.UndefOr[Double | String] = js.native
    
    var width: js.UndefOr[Double | String] = js.native
    
    var widths: js.UndefOr[Double | String] = js.native
    
    var wordSpacing: js.UndefOr[Double | String] = js.native
    
    var writingMode: js.UndefOr[Double | String] = js.native
    
    var x: js.UndefOr[Double | String] = js.native
    
    var x1: js.UndefOr[Double | String] = js.native
    
    var x2: js.UndefOr[Double | String] = js.native
    
    var xChannelSelector: js.UndefOr[String] = js.native
    
    var xHeight: js.UndefOr[Double | String] = js.native
    
    var xlinkActuate: js.UndefOr[String] = js.native
    
    var xlinkArcrole: js.UndefOr[String] = js.native
    
    var xlinkHref: js.UndefOr[String] = js.native
    
    var xlinkRole: js.UndefOr[String] = js.native
    
    var xlinkShow: js.UndefOr[String] = js.native
    
    var xlinkTitle: js.UndefOr[String] = js.native
    
    var xlinkType: js.UndefOr[String] = js.native
    
    var xmlBase: js.UndefOr[String] = js.native
    
    var xmlLang: js.UndefOr[String] = js.native
    
    var xmlSpace: js.UndefOr[String] = js.native
    
    var xmlns: js.UndefOr[String] = js.native
    
    var xmlnsXlink: js.UndefOr[String] = js.native
    
    var y: js.UndefOr[Double | String] = js.native
    
    var y1: js.UndefOr[Double | String] = js.native
    
    var y2: js.UndefOr[Double | String] = js.native
    
    var yChannelSelector: js.UndefOr[String] = js.native
    
    var z: js.UndefOr[Double | String] = js.native
    
    var zoomAndPan: js.UndefOr[String] = js.native
  }
  object QRPropsSvg {
    
    @scala.inline
    def apply(Object: js.Object, QRProps: QRProps): QRPropsSvg = {
      val __obj = js.Dynamic.literal()
      js.Dynamic.global.Object.assign(__obj, Object)
      js.Dynamic.global.Object.assign(__obj, QRProps)
      __obj.asInstanceOf[QRPropsSvg]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: QRPropsSvg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccentHeight(value: Double | String): Self = StObject.set(x, "accentHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccentHeightUndefined: Self = StObject.set(x, "accentHeight", js.undefined)
      
      @scala.inline
      def setAccumulate(value: none | sum): Self = StObject.set(x, "accumulate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccumulateUndefined: Self = StObject.set(x, "accumulate", js.undefined)
      
      @scala.inline
      def setAdditive(value: replace | sum): Self = StObject.set(x, "additive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditiveUndefined: Self = StObject.set(x, "additive", js.undefined)
      
      @scala.inline
      def setAlignmentBaseline(
        value: auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
      ): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", js.undefined)
      
      @scala.inline
      def setAllowReorder(value: no | yes): Self = StObject.set(x, "allowReorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowReorderUndefined: Self = StObject.set(x, "allowReorder", js.undefined)
      
      @scala.inline
      def setAlphabetic(value: Double | String): Self = StObject.set(x, "alphabetic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphabeticUndefined: Self = StObject.set(x, "alphabetic", js.undefined)
      
      @scala.inline
      def setAmplitude(value: Double | String): Self = StObject.set(x, "amplitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmplitudeUndefined: Self = StObject.set(x, "amplitude", js.undefined)
      
      @scala.inline
      def setArabicForm(value: initial | medial | terminal | isolated): Self = StObject.set(x, "arabicForm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArabicFormUndefined: Self = StObject.set(x, "arabicForm", js.undefined)
      
      @scala.inline
      def setAscent(value: Double | String): Self = StObject.set(x, "ascent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAscentUndefined: Self = StObject.set(x, "ascent", js.undefined)
      
      @scala.inline
      def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", js.undefined)
      
      @scala.inline
      def setAttributeType(value: String): Self = StObject.set(x, "attributeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeTypeUndefined: Self = StObject.set(x, "attributeType", js.undefined)
      
      @scala.inline
      def setAutoReverse(value: Booleanish): Self = StObject.set(x, "autoReverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoReverseUndefined: Self = StObject.set(x, "autoReverse", js.undefined)
      
      @scala.inline
      def setAzimuth(value: Double | String): Self = StObject.set(x, "azimuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAzimuthUndefined: Self = StObject.set(x, "azimuth", js.undefined)
      
      @scala.inline
      def setBaseFrequency(value: Double | String): Self = StObject.set(x, "baseFrequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseFrequencyUndefined: Self = StObject.set(x, "baseFrequency", js.undefined)
      
      @scala.inline
      def setBaseProfile(value: Double | String): Self = StObject.set(x, "baseProfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseProfileUndefined: Self = StObject.set(x, "baseProfile", js.undefined)
      
      @scala.inline
      def setBaselineShift(value: Double | String): Self = StObject.set(x, "baselineShift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaselineShiftUndefined: Self = StObject.set(x, "baselineShift", js.undefined)
      
      @scala.inline
      def setBbox(value: Double | String): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
      
      @scala.inline
      def setBegin(value: Double | String): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
      
      @scala.inline
      def setBias(value: Double | String): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
      
      @scala.inline
      def setBy(value: Double | String): Self = StObject.set(x, "by", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByUndefined: Self = StObject.set(x, "by", js.undefined)
      
      @scala.inline
      def setCalcMode(value: Double | String): Self = StObject.set(x, "calcMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalcModeUndefined: Self = StObject.set(x, "calcMode", js.undefined)
      
      @scala.inline
      def setCapHeight(value: Double | String): Self = StObject.set(x, "capHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapHeightUndefined: Self = StObject.set(x, "capHeight", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClip(value: Double | String): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipPath(value: String): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
      
      @scala.inline
      def setClipPathUnits(value: Double | String): Self = StObject.set(x, "clipPathUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipPathUnitsUndefined: Self = StObject.set(x, "clipPathUnits", js.undefined)
      
      @scala.inline
      def setClipRule(value: Double | String): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
      
      @scala.inline
      def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      @scala.inline
      def setColorInterpolation(value: Double | String): Self = StObject.set(x, "colorInterpolation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorInterpolationFilters(value: auto | sRGB | linearRGB | inherit): Self = StObject.set(x, "colorInterpolationFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorInterpolationFiltersUndefined: Self = StObject.set(x, "colorInterpolationFilters", js.undefined)
      
      @scala.inline
      def setColorInterpolationUndefined: Self = StObject.set(x, "colorInterpolation", js.undefined)
      
      @scala.inline
      def setColorProfile(value: Double | String): Self = StObject.set(x, "colorProfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorProfileUndefined: Self = StObject.set(x, "colorProfile", js.undefined)
      
      @scala.inline
      def setColorRendering(value: Double | String): Self = StObject.set(x, "colorRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorRenderingUndefined: Self = StObject.set(x, "colorRendering", js.undefined)
      
      @scala.inline
      def setContentScriptType(value: Double | String): Self = StObject.set(x, "contentScriptType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentScriptTypeUndefined: Self = StObject.set(x, "contentScriptType", js.undefined)
      
      @scala.inline
      def setContentStyleType(value: Double | String): Self = StObject.set(x, "contentStyleType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentStyleTypeUndefined: Self = StObject.set(x, "contentStyleType", js.undefined)
      
      @scala.inline
      def setCrossOrigin(value: anonymous | `use-credentials` | _empty): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      @scala.inline
      def setCursor(value: Double | String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      @scala.inline
      def setCx(value: Double | String): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
      
      @scala.inline
      def setCy(value: Double | String): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
      
      @scala.inline
      def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      @scala.inline
      def setDecelerate(value: Double | String): Self = StObject.set(x, "decelerate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecelerateUndefined: Self = StObject.set(x, "decelerate", js.undefined)
      
      @scala.inline
      def setDescent(value: Double | String): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescentUndefined: Self = StObject.set(x, "descent", js.undefined)
      
      @scala.inline
      def setDiffuseConstant(value: Double | String): Self = StObject.set(x, "diffuseConstant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiffuseConstantUndefined: Self = StObject.set(x, "diffuseConstant", js.undefined)
      
      @scala.inline
      def setDirection(value: Double | String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisplay(value: Double | String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setDivisor(value: Double | String): Self = StObject.set(x, "divisor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDivisorUndefined: Self = StObject.set(x, "divisor", js.undefined)
      
      @scala.inline
      def setDominantBaseline(value: Double | String): Self = StObject.set(x, "dominantBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDominantBaselineUndefined: Self = StObject.set(x, "dominantBaseline", js.undefined)
      
      @scala.inline
      def setDur(value: Double | String): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurUndefined: Self = StObject.set(x, "dur", js.undefined)
      
      @scala.inline
      def setDx(value: Double | String): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      @scala.inline
      def setDy(value: Double | String): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      @scala.inline
      def setEdgeMode(value: Double | String): Self = StObject.set(x, "edgeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeModeUndefined: Self = StObject.set(x, "edgeMode", js.undefined)
      
      @scala.inline
      def setElevation(value: Double | String): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
      
      @scala.inline
      def setEnableBackground(value: Double | String): Self = StObject.set(x, "enableBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableBackgroundUndefined: Self = StObject.set(x, "enableBackground", js.undefined)
      
      @scala.inline
      def setEnd(value: Double | String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setExponent(value: Double | String): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExponentUndefined: Self = StObject.set(x, "exponent", js.undefined)
      
      @scala.inline
      def setExternalResourcesRequired(value: Booleanish): Self = StObject.set(x, "externalResourcesRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalResourcesRequiredUndefined: Self = StObject.set(x, "externalResourcesRequired", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacity(value: Double | String): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFillRule(value: nonzero | evenodd | inherit): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterRes(value: Double | String): Self = StObject.set(x, "filterRes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterResUndefined: Self = StObject.set(x, "filterRes", js.undefined)
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFilterUnits(value: Double | String): Self = StObject.set(x, "filterUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUnitsUndefined: Self = StObject.set(x, "filterUnits", js.undefined)
      
      @scala.inline
      def setFloodColor(value: Double | String): Self = StObject.set(x, "floodColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloodColorUndefined: Self = StObject.set(x, "floodColor", js.undefined)
      
      @scala.inline
      def setFloodOpacity(value: Double | String): Self = StObject.set(x, "floodOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloodOpacityUndefined: Self = StObject.set(x, "floodOpacity", js.undefined)
      
      @scala.inline
      def setFocusable(value: Booleanish | auto): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeAdjust(value: Double | String): Self = StObject.set(x, "fontSizeAdjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeAdjustUndefined: Self = StObject.set(x, "fontSizeAdjust", js.undefined)
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontStretch(value: Double | String): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
      
      @scala.inline
      def setFontStyle(value: Double | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontVariant(value: Double | String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      @scala.inline
      def setFontWeight(value: Double | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setFormat(value: Double | String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setFr(value: Double | String): Self = StObject.set(x, "fr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrUndefined: Self = StObject.set(x, "fr", js.undefined)
      
      @scala.inline
      def setFrom(value: Double | String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setFx(value: Double | String): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFxUndefined: Self = StObject.set(x, "fx", js.undefined)
      
      @scala.inline
      def setFy(value: Double | String): Self = StObject.set(x, "fy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFyUndefined: Self = StObject.set(x, "fy", js.undefined)
      
      @scala.inline
      def setG1(value: Double | String): Self = StObject.set(x, "g1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG1Undefined: Self = StObject.set(x, "g1", js.undefined)
      
      @scala.inline
      def setG2(value: Double | String): Self = StObject.set(x, "g2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG2Undefined: Self = StObject.set(x, "g2", js.undefined)
      
      @scala.inline
      def setGlyphName(value: Double | String): Self = StObject.set(x, "glyphName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyphNameUndefined: Self = StObject.set(x, "glyphName", js.undefined)
      
      @scala.inline
      def setGlyphOrientationHorizontal(value: Double | String): Self = StObject.set(x, "glyphOrientationHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyphOrientationHorizontalUndefined: Self = StObject.set(x, "glyphOrientationHorizontal", js.undefined)
      
      @scala.inline
      def setGlyphOrientationVertical(value: Double | String): Self = StObject.set(x, "glyphOrientationVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyphOrientationVerticalUndefined: Self = StObject.set(x, "glyphOrientationVertical", js.undefined)
      
      @scala.inline
      def setGlyphRef(value: Double | String): Self = StObject.set(x, "glyphRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyphRefUndefined: Self = StObject.set(x, "glyphRef", js.undefined)
      
      @scala.inline
      def setGradientTransform(value: String): Self = StObject.set(x, "gradientTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientTransformUndefined: Self = StObject.set(x, "gradientTransform", js.undefined)
      
      @scala.inline
      def setGradientUnits(value: String): Self = StObject.set(x, "gradientUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientUnitsUndefined: Self = StObject.set(x, "gradientUnits", js.undefined)
      
      @scala.inline
      def setHanging(value: Double | String): Self = StObject.set(x, "hanging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHangingUndefined: Self = StObject.set(x, "hanging", js.undefined)
      
      @scala.inline
      def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHorizAdvX(value: Double | String): Self = StObject.set(x, "horizAdvX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizAdvXUndefined: Self = StObject.set(x, "horizAdvX", js.undefined)
      
      @scala.inline
      def setHorizOriginX(value: Double | String): Self = StObject.set(x, "horizOriginX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizOriginXUndefined: Self = StObject.set(x, "horizOriginX", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIdeographic(value: Double | String): Self = StObject.set(x, "ideographic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdeographicUndefined: Self = StObject.set(x, "ideographic", js.undefined)
      
      @scala.inline
      def setImageRendering(value: Double | String): Self = StObject.set(x, "imageRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageRenderingUndefined: Self = StObject.set(x, "imageRendering", js.undefined)
      
      @scala.inline
      def setIn(value: String): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIn2(value: Double | String): Self = StObject.set(x, "in2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIn2Undefined: Self = StObject.set(x, "in2", js.undefined)
      
      @scala.inline
      def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      @scala.inline
      def setIntercept(value: Double | String): Self = StObject.set(x, "intercept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterceptUndefined: Self = StObject.set(x, "intercept", js.undefined)
      
      @scala.inline
      def setK(value: Double | String): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK1(value: Double | String): Self = StObject.set(x, "k1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK1Undefined: Self = StObject.set(x, "k1", js.undefined)
      
      @scala.inline
      def setK2(value: Double | String): Self = StObject.set(x, "k2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK2Undefined: Self = StObject.set(x, "k2", js.undefined)
      
      @scala.inline
      def setK3(value: Double | String): Self = StObject.set(x, "k3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK3Undefined: Self = StObject.set(x, "k3", js.undefined)
      
      @scala.inline
      def setK4(value: Double | String): Self = StObject.set(x, "k4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK4Undefined: Self = StObject.set(x, "k4", js.undefined)
      
      @scala.inline
      def setKUndefined: Self = StObject.set(x, "k", js.undefined)
      
      @scala.inline
      def setKernelMatrix(value: Double | String): Self = StObject.set(x, "kernelMatrix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelMatrixUndefined: Self = StObject.set(x, "kernelMatrix", js.undefined)
      
      @scala.inline
      def setKernelUnitLength(value: Double | String): Self = StObject.set(x, "kernelUnitLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelUnitLengthUndefined: Self = StObject.set(x, "kernelUnitLength", js.undefined)
      
      @scala.inline
      def setKerning(value: Double | String): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
      
      @scala.inline
      def setKeyPoints(value: Double | String): Self = StObject.set(x, "keyPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPointsUndefined: Self = StObject.set(x, "keyPoints", js.undefined)
      
      @scala.inline
      def setKeySplines(value: Double | String): Self = StObject.set(x, "keySplines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySplinesUndefined: Self = StObject.set(x, "keySplines", js.undefined)
      
      @scala.inline
      def setKeyTimes(value: Double | String): Self = StObject.set(x, "keyTimes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyTimesUndefined: Self = StObject.set(x, "keyTimes", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setLengthAdjust(value: Double | String): Self = StObject.set(x, "lengthAdjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthAdjustUndefined: Self = StObject.set(x, "lengthAdjust", js.undefined)
      
      @scala.inline
      def setLetterSpacing(value: Double | String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      @scala.inline
      def setLightingColor(value: Double | String): Self = StObject.set(x, "lightingColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightingColorUndefined: Self = StObject.set(x, "lightingColor", js.undefined)
      
      @scala.inline
      def setLimitingConeAngle(value: Double | String): Self = StObject.set(x, "limitingConeAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitingConeAngleUndefined: Self = StObject.set(x, "limitingConeAngle", js.undefined)
      
      @scala.inline
      def setLocal(value: Double | String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
      
      @scala.inline
      def setMarkerEnd(value: String): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
      
      @scala.inline
      def setMarkerHeight(value: Double | String): Self = StObject.set(x, "markerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerHeightUndefined: Self = StObject.set(x, "markerHeight", js.undefined)
      
      @scala.inline
      def setMarkerMid(value: String): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
      
      @scala.inline
      def setMarkerStart(value: String): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
      
      @scala.inline
      def setMarkerUnits(value: Double | String): Self = StObject.set(x, "markerUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerUnitsUndefined: Self = StObject.set(x, "markerUnits", js.undefined)
      
      @scala.inline
      def setMarkerWidth(value: Double | String): Self = StObject.set(x, "markerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerWidthUndefined: Self = StObject.set(x, "markerWidth", js.undefined)
      
      @scala.inline
      def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskContentUnits(value: Double | String): Self = StObject.set(x, "maskContentUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskContentUnitsUndefined: Self = StObject.set(x, "maskContentUnits", js.undefined)
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setMaskUnits(value: Double | String): Self = StObject.set(x, "maskUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskUnitsUndefined: Self = StObject.set(x, "maskUnits", js.undefined)
      
      @scala.inline
      def setMathematical(value: Double | String): Self = StObject.set(x, "mathematical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMathematicalUndefined: Self = StObject.set(x, "mathematical", js.undefined)
      
      @scala.inline
      def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setMode(value: Double | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNumOctaves(value: Double | String): Self = StObject.set(x, "numOctaves", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumOctavesUndefined: Self = StObject.set(x, "numOctaves", js.undefined)
      
      @scala.inline
      def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double | String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOperator(value: Double | String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      @scala.inline
      def setOrder(value: Double | String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setOrient(value: Double | String): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      @scala.inline
      def setOrientation(value: Double | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setOrigin(value: Double | String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setOverflow(value: Double | String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      @scala.inline
      def setOverlinePosition(value: Double | String): Self = StObject.set(x, "overlinePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlinePositionUndefined: Self = StObject.set(x, "overlinePosition", js.undefined)
      
      @scala.inline
      def setOverlineThickness(value: Double | String): Self = StObject.set(x, "overlineThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlineThicknessUndefined: Self = StObject.set(x, "overlineThickness", js.undefined)
      
      @scala.inline
      def setPaintOrder(value: Double | String): Self = StObject.set(x, "paintOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaintOrderUndefined: Self = StObject.set(x, "paintOrder", js.undefined)
      
      @scala.inline
      def setPanose1(value: Double | String): Self = StObject.set(x, "panose1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanose1Undefined: Self = StObject.set(x, "panose1", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathLength(value: Double | String): Self = StObject.set(x, "pathLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathLengthUndefined: Self = StObject.set(x, "pathLength", js.undefined)
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPatternContentUnits(value: String): Self = StObject.set(x, "patternContentUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternContentUnitsUndefined: Self = StObject.set(x, "patternContentUnits", js.undefined)
      
      @scala.inline
      def setPatternTransform(value: Double | String): Self = StObject.set(x, "patternTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternTransformUndefined: Self = StObject.set(x, "patternTransform", js.undefined)
      
      @scala.inline
      def setPatternUnits(value: String): Self = StObject.set(x, "patternUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUnitsUndefined: Self = StObject.set(x, "patternUnits", js.undefined)
      
      @scala.inline
      def setPointerEvents(value: Double | String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      @scala.inline
      def setPoints(value: String): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsAtX(value: Double | String): Self = StObject.set(x, "pointsAtX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsAtXUndefined: Self = StObject.set(x, "pointsAtX", js.undefined)
      
      @scala.inline
      def setPointsAtY(value: Double | String): Self = StObject.set(x, "pointsAtY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsAtYUndefined: Self = StObject.set(x, "pointsAtY", js.undefined)
      
      @scala.inline
      def setPointsAtZ(value: Double | String): Self = StObject.set(x, "pointsAtZ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsAtZUndefined: Self = StObject.set(x, "pointsAtZ", js.undefined)
      
      @scala.inline
      def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      @scala.inline
      def setPreserveAlpha(value: Booleanish): Self = StObject.set(x, "preserveAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveAlphaUndefined: Self = StObject.set(x, "preserveAlpha", js.undefined)
      
      @scala.inline
      def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
      
      @scala.inline
      def setPrimitiveUnits(value: Double | String): Self = StObject.set(x, "primitiveUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimitiveUnitsUndefined: Self = StObject.set(x, "primitiveUnits", js.undefined)
      
      @scala.inline
      def setR(value: Double | String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      @scala.inline
      def setRadius(value: Double | String): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setRefX(value: Double | String): Self = StObject.set(x, "refX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefXUndefined: Self = StObject.set(x, "refX", js.undefined)
      
      @scala.inline
      def setRefY(value: Double | String): Self = StObject.set(x, "refY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefYUndefined: Self = StObject.set(x, "refY", js.undefined)
      
      @scala.inline
      def setRenderingIntent(value: Double | String): Self = StObject.set(x, "renderingIntent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderingIntentUndefined: Self = StObject.set(x, "renderingIntent", js.undefined)
      
      @scala.inline
      def setRepeatCount(value: Double | String): Self = StObject.set(x, "repeatCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatCountUndefined: Self = StObject.set(x, "repeatCount", js.undefined)
      
      @scala.inline
      def setRepeatDur(value: Double | String): Self = StObject.set(x, "repeatDur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatDurUndefined: Self = StObject.set(x, "repeatDur", js.undefined)
      
      @scala.inline
      def setRequiredExtensions(value: Double | String): Self = StObject.set(x, "requiredExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredExtensionsUndefined: Self = StObject.set(x, "requiredExtensions", js.undefined)
      
      @scala.inline
      def setRequiredFeatures(value: Double | String): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredFeaturesUndefined: Self = StObject.set(x, "requiredFeatures", js.undefined)
      
      @scala.inline
      def setRestart(value: Double | String): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestartUndefined: Self = StObject.set(x, "restart", js.undefined)
      
      @scala.inline
      def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      @scala.inline
      def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setRotate(value: Double | String): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setRx(value: Double | String): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      @scala.inline
      def setRy(value: Double | String): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
      
      @scala.inline
      def setScale(value: Double | String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setSeed(value: Double | String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      @scala.inline
      def setShapeRendering(value: Double | String): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", js.undefined)
      
      @scala.inline
      def setSlope(value: Double | String): Self = StObject.set(x, "slope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlopeUndefined: Self = StObject.set(x, "slope", js.undefined)
      
      @scala.inline
      def setSpacing(value: Double | String): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      @scala.inline
      def setSpecularConstant(value: Double | String): Self = StObject.set(x, "specularConstant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecularConstantUndefined: Self = StObject.set(x, "specularConstant", js.undefined)
      
      @scala.inline
      def setSpecularExponent(value: Double | String): Self = StObject.set(x, "specularExponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecularExponentUndefined: Self = StObject.set(x, "specularExponent", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double | String): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      @scala.inline
      def setSpreadMethod(value: String): Self = StObject.set(x, "spreadMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpreadMethodUndefined: Self = StObject.set(x, "spreadMethod", js.undefined)
      
      @scala.inline
      def setStartOffset(value: Double | String): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
      
      @scala.inline
      def setStdDeviation(value: Double | String): Self = StObject.set(x, "stdDeviation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdDeviationUndefined: Self = StObject.set(x, "stdDeviation", js.undefined)
      
      @scala.inline
      def setStemh(value: Double | String): Self = StObject.set(x, "stemh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStemhUndefined: Self = StObject.set(x, "stemh", js.undefined)
      
      @scala.inline
      def setStemv(value: Double | String): Self = StObject.set(x, "stemv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStemvUndefined: Self = StObject.set(x, "stemv", js.undefined)
      
      @scala.inline
      def setStitchTiles(value: Double | String): Self = StObject.set(x, "stitchTiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStitchTilesUndefined: Self = StObject.set(x, "stitchTiles", js.undefined)
      
      @scala.inline
      def setStopColor(value: String): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopColorUndefined: Self = StObject.set(x, "stopColor", js.undefined)
      
      @scala.inline
      def setStopOpacity(value: Double | String): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopOpacityUndefined: Self = StObject.set(x, "stopOpacity", js.undefined)
      
      @scala.inline
      def setStrikethroughPosition(value: Double | String): Self = StObject.set(x, "strikethroughPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrikethroughPositionUndefined: Self = StObject.set(x, "strikethroughPosition", js.undefined)
      
      @scala.inline
      def setStrikethroughThickness(value: Double | String): Self = StObject.set(x, "strikethroughThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrikethroughThicknessUndefined: Self = StObject.set(x, "strikethroughThickness", js.undefined)
      
      @scala.inline
      def setString(value: Double | String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      @scala.inline
      def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDasharray(value: String | Double): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
      
      @scala.inline
      def setStrokeDashoffset(value: String | Double): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
      
      @scala.inline
      def setStrokeLinecap(value: butt | round | square | inherit): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      @scala.inline
      def setStrokeLinejoin(value: miter | round | bevel | inherit): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
      
      @scala.inline
      def setStrokeMiterlimit(value: Double | String): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", js.undefined)
      
      @scala.inline
      def setStrokeOpacity(value: Double | String): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setStrokeWidth(value: Double | String): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setSurfaceScale(value: Double | String): Self = StObject.set(x, "surfaceScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSurfaceScaleUndefined: Self = StObject.set(x, "surfaceScale", js.undefined)
      
      @scala.inline
      def setSystemLanguage(value: Double | String): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemLanguageUndefined: Self = StObject.set(x, "systemLanguage", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTableValues(value: Double | String): Self = StObject.set(x, "tableValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableValuesUndefined: Self = StObject.set(x, "tableValues", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTargetX(value: Double | String): Self = StObject.set(x, "targetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetXUndefined: Self = StObject.set(x, "targetX", js.undefined)
      
      @scala.inline
      def setTargetY(value: Double | String): Self = StObject.set(x, "targetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetYUndefined: Self = StObject.set(x, "targetY", js.undefined)
      
      @scala.inline
      def setTextAnchor(value: String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
      
      @scala.inline
      def setTextDecoration(value: Double | String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
      
      @scala.inline
      def setTextLength(value: Double | String): Self = StObject.set(x, "textLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextLengthUndefined: Self = StObject.set(x, "textLength", js.undefined)
      
      @scala.inline
      def setTextRendering(value: Double | String): Self = StObject.set(x, "textRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextRenderingUndefined: Self = StObject.set(x, "textRendering", js.undefined)
      
      @scala.inline
      def setTo(value: Double | String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      @scala.inline
      def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setU1(value: Double | String): Self = StObject.set(x, "u1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setU1Undefined: Self = StObject.set(x, "u1", js.undefined)
      
      @scala.inline
      def setU2(value: Double | String): Self = StObject.set(x, "u2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setU2Undefined: Self = StObject.set(x, "u2", js.undefined)
      
      @scala.inline
      def setUnderlinePosition(value: Double | String): Self = StObject.set(x, "underlinePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlinePositionUndefined: Self = StObject.set(x, "underlinePosition", js.undefined)
      
      @scala.inline
      def setUnderlineThickness(value: Double | String): Self = StObject.set(x, "underlineThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlineThicknessUndefined: Self = StObject.set(x, "underlineThickness", js.undefined)
      
      @scala.inline
      def setUnicode(value: Double | String): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicodeBidi(value: Double | String): Self = StObject.set(x, "unicodeBidi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicodeBidiUndefined: Self = StObject.set(x, "unicodeBidi", js.undefined)
      
      @scala.inline
      def setUnicodeRange(value: Double | String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicodeRangeUndefined: Self = StObject.set(x, "unicodeRange", js.undefined)
      
      @scala.inline
      def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
      
      @scala.inline
      def setUnitsPerEm(value: Double | String): Self = StObject.set(x, "unitsPerEm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitsPerEmUndefined: Self = StObject.set(x, "unitsPerEm", js.undefined)
      
      @scala.inline
      def setVAlphabetic(value: Double | String): Self = StObject.set(x, "vAlphabetic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVAlphabeticUndefined: Self = StObject.set(x, "vAlphabetic", js.undefined)
      
      @scala.inline
      def setVHanging(value: Double | String): Self = StObject.set(x, "vHanging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVHangingUndefined: Self = StObject.set(x, "vHanging", js.undefined)
      
      @scala.inline
      def setVIdeographic(value: Double | String): Self = StObject.set(x, "vIdeographic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVIdeographicUndefined: Self = StObject.set(x, "vIdeographic", js.undefined)
      
      @scala.inline
      def setVMathematical(value: Double | String): Self = StObject.set(x, "vMathematical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVMathematicalUndefined: Self = StObject.set(x, "vMathematical", js.undefined)
      
      @scala.inline
      def setValues(value: String): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setVectorEffect(value: Double | String): Self = StObject.set(x, "vectorEffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVectorEffectUndefined: Self = StObject.set(x, "vectorEffect", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def setVertAdvY(value: Double | String): Self = StObject.set(x, "vertAdvY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertAdvYUndefined: Self = StObject.set(x, "vertAdvY", js.undefined)
      
      @scala.inline
      def setVertOriginX(value: Double | String): Self = StObject.set(x, "vertOriginX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertOriginXUndefined: Self = StObject.set(x, "vertOriginX", js.undefined)
      
      @scala.inline
      def setVertOriginY(value: Double | String): Self = StObject.set(x, "vertOriginY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertOriginYUndefined: Self = StObject.set(x, "vertOriginY", js.undefined)
      
      @scala.inline
      def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
      
      @scala.inline
      def setViewTarget(value: Double | String): Self = StObject.set(x, "viewTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewTargetUndefined: Self = StObject.set(x, "viewTarget", js.undefined)
      
      @scala.inline
      def setVisibility(value: Double | String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWidths(value: Double | String): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
      
      @scala.inline
      def setWordSpacing(value: Double | String): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
      
      @scala.inline
      def setWritingMode(value: Double | String): Self = StObject.set(x, "writingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritingModeUndefined: Self = StObject.set(x, "writingMode", js.undefined)
      
      @scala.inline
      def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX1(value: Double | String): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
      
      @scala.inline
      def setX2(value: Double | String): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
      
      @scala.inline
      def setXChannelSelector(value: String): Self = StObject.set(x, "xChannelSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXChannelSelectorUndefined: Self = StObject.set(x, "xChannelSelector", js.undefined)
      
      @scala.inline
      def setXHeight(value: Double | String): Self = StObject.set(x, "xHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXHeightUndefined: Self = StObject.set(x, "xHeight", js.undefined)
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setXlinkActuate(value: String): Self = StObject.set(x, "xlinkActuate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlinkActuateUndefined: Self = StObject.set(x, "xlinkActuate", js.undefined)
      
      @scala.inline
      def setXlinkArcrole(value: String): Self = StObject.set(x, "xlinkArcrole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlinkArcroleUndefined: Self = StObject.set(x, "xlinkArcrole", js.undefined)
      
      @scala.inline
      def setXlinkHref(value: String): Self = StObject.set(x, "xlinkHref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlinkHrefUndefined: Self = StObject.set(x, "xlinkHref", js.undefined)
      
      @scala.inline
      def setXlinkRole(value: String): Self = StObject.set(x, "xlinkRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlinkRoleUndefined: Self = StObject.set(x, "xlinkRole", js.undefined)
      
      @scala.inline
      def setXlinkShow(value: String): Self = StObject.set(x, "xlinkShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlinkShowUndefined: Self = StObject.set(x, "xlinkShow", js.undefined)
      
      @scala.inline
      def setXlinkTitle(value: String): Self = StObject.set(x, "xlinkTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlinkTitleUndefined: Self = StObject.set(x, "xlinkTitle", js.undefined)
      
      @scala.inline
      def setXlinkType(value: String): Self = StObject.set(x, "xlinkType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlinkTypeUndefined: Self = StObject.set(x, "xlinkType", js.undefined)
      
      @scala.inline
      def setXmlBase(value: String): Self = StObject.set(x, "xmlBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlBaseUndefined: Self = StObject.set(x, "xmlBase", js.undefined)
      
      @scala.inline
      def setXmlLang(value: String): Self = StObject.set(x, "xmlLang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlLangUndefined: Self = StObject.set(x, "xmlLang", js.undefined)
      
      @scala.inline
      def setXmlSpace(value: String): Self = StObject.set(x, "xmlSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlSpaceUndefined: Self = StObject.set(x, "xmlSpace", js.undefined)
      
      @scala.inline
      def setXmlns(value: String): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
      
      @scala.inline
      def setXmlnsXlink(value: String): Self = StObject.set(x, "xmlnsXlink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlnsXlinkUndefined: Self = StObject.set(x, "xmlnsXlink", js.undefined)
      
      @scala.inline
      def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY1(value: Double | String): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
      
      @scala.inline
      def setY2(value: Double | String): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
      
      @scala.inline
      def setYChannelSelector(value: String): Self = StObject.set(x, "yChannelSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYChannelSelectorUndefined: Self = StObject.set(x, "yChannelSelector", js.undefined)
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      @scala.inline
      def setZ(value: Double | String): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZUndefined: Self = StObject.set(x, "z", js.undefined)
      
      @scala.inline
      def setZoomAndPan(value: String): Self = StObject.set(x, "zoomAndPan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomAndPanUndefined: Self = StObject.set(x, "zoomAndPan", js.undefined)
    }
  }
}
