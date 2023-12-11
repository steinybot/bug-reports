package web.typings.rcVirtualList

import web.typings.rcVirtualList.esHooksUseScrollToMod.ScrollAlign
import web.typings.rcVirtualList.esHooksUseScrollToMod.ScrollTarget
import web.typings.rcVirtualList.esListMod.ListRef
import web.typings.react.mod.CSSProperties
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Align
    extends StObject
       with ScrollTarget {
    
    var align: js.UndefOr[ScrollAlign] = js.native
    
    var index: Double = js.native
    
    var offset: js.UndefOr[Double] = js.native
  }
  object Align {
    
    @scala.inline
    def apply(index: Double): Align = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[Align]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Align] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: ScrollAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  @js.native
  trait Bottom extends StObject {
    
    var bottom: Double = js.native
    
    var top: Double = js.native
  }
  object Bottom {
    
    @scala.inline
    def apply(bottom: Double, top: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Children extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var ref: js.UndefOr[web.typings.react.mod.Ref[ListRef]] = js.native
  }
  object Children {
    
    @scala.inline
    def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setRef(value: web.typings.react.mod.Ref[ListRef]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ ListRef | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefReactRef(value: ReactRef[ListRef]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  @js.native
  trait HorizontalScrollBar extends StObject {
    
    var horizontalScrollBar: js.UndefOr[CSSProperties] = js.native
    
    var horizontalScrollBarThumb: js.UndefOr[CSSProperties] = js.native
    
    var verticalScrollBar: js.UndefOr[CSSProperties] = js.native
    
    var verticalScrollBarThumb: js.UndefOr[CSSProperties] = js.native
  }
  object HorizontalScrollBar {
    
    @scala.inline
    def apply(): HorizontalScrollBar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HorizontalScrollBar]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: HorizontalScrollBar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHorizontalScrollBar(value: CSSProperties): Self = StObject.set(x, "horizontalScrollBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalScrollBarThumb(value: CSSProperties): Self = StObject.set(x, "horizontalScrollBarThumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalScrollBarThumbUndefined: Self = StObject.set(x, "horizontalScrollBarThumb", js.undefined)
      
      @scala.inline
      def setHorizontalScrollBarUndefined: Self = StObject.set(x, "horizontalScrollBar", js.undefined)
      
      @scala.inline
      def setVerticalScrollBar(value: CSSProperties): Self = StObject.set(x, "verticalScrollBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalScrollBarThumb(value: CSSProperties): Self = StObject.set(x, "verticalScrollBarThumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalScrollBarThumbUndefined: Self = StObject.set(x, "verticalScrollBarThumb", js.undefined)
      
      @scala.inline
      def setVerticalScrollBarUndefined: Self = StObject.set(x, "verticalScrollBar", js.undefined)
    }
  }
  
  @js.native
  trait Index extends StObject {
    
    var index: Double = js.native
    
    var multiple: Boolean = js.native
  }
  object Index {
    
    @scala.inline
    def apply(index: Double, multiple: Boolean): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Key
    extends StObject
       with ScrollTarget {
    
    var align: js.UndefOr[ScrollAlign] = js.native
    
    var key: web.typings.react.mod.Key = js.native
    
    var offset: js.UndefOr[Double] = js.native
  }
  object Key {
    
    @scala.inline
    def apply(key: web.typings.react.mod.Key): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: ScrollAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setKey(value: web.typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  @js.native
  trait Ref extends StObject {
    
    var ref: js.UndefOr[web.typings.react.mod.Ref[ListRef]] = js.native
  }
  object Ref {
    
    @scala.inline
    def apply(): Ref = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ref]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Ref] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRef(value: web.typings.react.mod.Ref[ListRef]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ ListRef | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefReactRef(value: ReactRef[ListRef]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  @js.native
  trait Style extends StObject {
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object Style {
    
    @scala.inline
    def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
