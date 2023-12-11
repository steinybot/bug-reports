package web.typings.rcMenu

import web.typings.rcMotion.esCssmotionMod.CSSMotionProps
import web.typings.react.mod.ReactInstance
import web.typings.std.Map
import web.typings.std.Set
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Active extends StObject {
    
    var active: Boolean = js.native
    
    var disabled: Boolean = js.native
    
    var open: Boolean = js.native
    
    var selected: Boolean = js.native
  }
  object Active {
    
    @scala.inline
    def apply(active: Boolean, disabled: Boolean, open: Boolean, selected: Boolean): Active = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[Active]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Active] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AdjustX extends StObject {
    
    var adjustX: Double = js.native
    
    var adjustY: Double = js.native
  }
  object AdjustX {
    
    @scala.inline
    def apply(adjustX: Double, adjustY: Double): AdjustX = {
      val __obj = js.Dynamic.literal(adjustX = adjustX.asInstanceOf[js.Any], adjustY = adjustY.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdjustX]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AdjustX] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjustX(value: Double): Self = StObject.set(x, "adjustX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjustY(value: Double): Self = StObject.set(x, "adjustY", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DomEvent extends StObject {
    
    var domEvent: SyntheticMouseEvent[HTMLElement] = js.native
    
    var key: String = js.native
  }
  object DomEvent {
    
    @scala.inline
    def apply(domEvent: SyntheticMouseEvent[HTMLElement], key: String): DomEvent = {
      val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomEvent]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DomEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomEvent(value: SyntheticMouseEvent[HTMLElement]): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Element2key extends StObject {
    
    var element2key: Map[HTMLElement, String] = js.native
    
    var elements: Set[HTMLElement] = js.native
    
    var key2element: Map[String, HTMLElement] = js.native
  }
  object Element2key {
    
    @scala.inline
    def apply(
      element2key: Map[HTMLElement, String],
      elements: Set[HTMLElement],
      key2element: Map[String, HTMLElement]
    ): Element2key = {
      val __obj = js.Dynamic.literal(element2key = element2key.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], key2element = key2element.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element2key]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Element2key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement2key(value: Map[HTMLElement, String]): Self = StObject.set(x, "element2key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElements(value: Set[HTMLElement]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey2element(value: Map[String, HTMLElement]): Self = StObject.set(x, "key2element", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetKeyPath extends StObject {
    
    def getKeyPath(eventKey: String): js.Array[String] = js.native
    def getKeyPath(eventKey: String, includeOverflow: Boolean): js.Array[String] = js.native
    
    def getKeys(): js.Array[String] = js.native
    
    def getSubPathKeys(key: String): Set[String] = js.native
    
    def isSubPathKey(pathKeys: js.Array[String], eventKey: String): Boolean = js.native
    
    def refreshOverflowKeys(keys: js.Array[String]): Unit = js.native
    
    def registerPath(key: String, keyPath: js.Array[String]): Unit = js.native
    
    def unregisterPath(key: String, keyPath: js.Array[String]): Unit = js.native
  }
  
  @js.native
  trait Item extends StObject {
    
    var item: ReactInstance = js.native
  }
  object Item {
    
    @scala.inline
    def apply(item: ReactInstance): Item = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: ReactInstance): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemReactComponentClass(value: ReactComponentClass[Any]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Overflow extends StObject {
    
    var overflow: AdjustX = js.native
    
    var points: js.Array[String] = js.native
  }
  object Overflow {
    
    @scala.inline
    def apply(overflow: AdjustX, points: js.Array[String]): Overflow = {
      val __obj = js.Dynamic.literal(overflow = overflow.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[Overflow]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Overflow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOverflow(value: AdjustX): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoints(value: js.Array[String]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsVarargs(value: String*): Self = StObject.set(x, "points", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Partial<{[ key in rc-menu.rc-menu/es/interface.MenuMode | 'other' ]: rc-motion.rc-motion.CSSMotionProps}> */
  @js.native
  trait PartialkeyinMenuModeother extends StObject {
    
    var horizontal: js.UndefOr[CSSMotionProps] = js.native
    
    var `inline`: js.UndefOr[CSSMotionProps] = js.native
    
    var other: js.UndefOr[CSSMotionProps] = js.native
    
    var vertical: js.UndefOr[CSSMotionProps] = js.native
  }
  object PartialkeyinMenuModeother {
    
    @scala.inline
    def apply(): PartialkeyinMenuModeother = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialkeyinMenuModeother]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PartialkeyinMenuModeother] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHorizontal(value: CSSMotionProps): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setInline(value: CSSMotionProps): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setOther(value: CSSMotionProps): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
      
      @scala.inline
      def setVertical(value: CSSMotionProps): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  @js.native
  trait Selected extends StObject {
    
    var selected: Boolean = js.native
  }
  object Selected {
    
    @scala.inline
    def apply(selected: Boolean): Selected = {
      val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[Selected]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Selected] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
