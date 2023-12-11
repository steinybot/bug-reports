package web.typings.rcComponentColorPicker

import web.typings.rcComponentColorPicker.esComponentsHandlerMod.HandlerSize
import web.typings.rcComponentColorPicker.esHooksUseColorStateMod.ColorValue
import web.typings.rcComponentColorPicker.esInterfaceMod.HsbaColorType
import web.typings.rcComponentColorPicker.esInterfaceMod.TransformOffset
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.Key
import web.typings.react.mod.Ref
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Children extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var colors: js.Array[web.typings.rcComponentColorPicker.esColorMod.Color | String] = js.native
    
    var direction: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[HsbaColorType] = js.native
  }
  object Children {
    
    @scala.inline
    def apply(colors: js.Array[web.typings.rcComponentColorPicker.esColorMod.Color | String]): Children = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setColors(value: js.Array[web.typings.rcComponentColorPicker.esColorMod.Color | String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsVarargs(value: (web.typings.rcComponentColorPicker.esColorMod.Color | String)*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      @scala.inline
      def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setType(value: HsbaColorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Color extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[HandlerSize] = js.native
  }
  object Color {
    
    @scala.inline
    def apply(): Color = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setSize(value: HandlerSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait ContainerRef extends StObject {
    
    var color: js.UndefOr[web.typings.rcComponentColorPicker.esColorMod.Color] = js.native
    
    var containerRef: ReactRef[HTMLDivElement] = js.native
    
    var offset: TransformOffset = js.native
    
    var targetRef: ReactRef[HTMLDivElement] = js.native
    
    var `type`: js.UndefOr[HsbaColorType] = js.native
  }
  object ContainerRef {
    
    @scala.inline
    def apply(
      containerRef: ReactRef[HTMLDivElement],
      offset: TransformOffset,
      targetRef: ReactRef[HTMLDivElement]
    ): ContainerRef = {
      val __obj = js.Dynamic.literal(containerRef = containerRef.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerRef]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ContainerRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: web.typings.rcComponentColorPicker.esColorMod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setContainerRef(value: ReactRef[HTMLDivElement]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: TransformOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetRef(value: ReactRef[HTMLDivElement]): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: HsbaColorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DefaultValue extends StObject {
    
    var defaultValue: js.UndefOr[ColorValue] = js.native
    
    var value: js.UndefOr[ColorValue] = js.native
  }
  object DefaultValue {
    
    @scala.inline
    def apply(): DefaultValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultValue]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DefaultValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: ColorValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setValue(value: ColorValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined @ctrl/tinycolor.@ctrl/tinycolor.Numberify<@rc-component/color-picker.@rc-component/color-picker/es/interface.HSBA> */
  @js.native
  trait NumberifyHSBA extends StObject {
    
    var a: Double = js.native
    
    var b: Double = js.native
    
    var h: Double = js.native
    
    var s: Double = js.native
  }
  object NumberifyHSBA {
    
    @scala.inline
    def apply(a: Double, b: Double, h: Double, s: Double): NumberifyHSBA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberifyHSBA]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: NumberifyHSBA] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PrefixCls extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object PrefixCls {
    
    @scala.inline
    def apply(): PrefixCls = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrefixCls]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PrefixCls] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Inlined {  offset :@rc-component/color-picker.@rc-component/color-picker/es/interface.TransformOffset | undefined,   children :react.react.ReactNode | undefined} & react.react.RefAttributes<std.HTMLDivElement> */
  @js.native
  trait offsetTransformOffsetunde extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var key: js.UndefOr[Key | Null] = js.native
    
    var offset: js.UndefOr[TransformOffset] = js.native
    
    /**
      * Allows getting a ref to the component instance.
      * Once the component unmounts, React will set `ref.current` to `null` (or call the ref with `null` if you passed a callback ref).
      * @see https://react.dev/learn/referencing-values-with-refs#refs-and-the-dom
      */
    var ref: js.UndefOr[Ref[HTMLDivElement]] = js.native
  }
  object offsetTransformOffsetunde {
    
    @scala.inline
    def apply(): offsetTransformOffsetunde = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[offsetTransformOffsetunde]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: offsetTransformOffsetunde] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNull: Self = StObject.set(x, "key", null)
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOffset(value: TransformOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefReactRef(value: ReactRef[HTMLDivElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
