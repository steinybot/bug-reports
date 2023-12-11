package web.typings.antd

import web.typings.antd.anon.Item
import web.typings.antd.anon.ItemCSSProperties
import web.typings.antd.antdStrings.baseline
import web.typings.antd.antdStrings.center
import web.typings.antd.antdStrings.end
import web.typings.antd.antdStrings.horizontal
import web.typings.antd.antdStrings.start
import web.typings.antd.antdStrings.vertical
import web.typings.antd.esConfigProviderSizeContextMod.SizeType
import web.typings.antd.esSpaceCompactMod.SpaceCompactProps
import web.typings.antd.esSpaceContextMod.SpaceContextType
import web.typings.react.mod.Context
import web.typings.react.mod.ForwardRefExoticComponent
import web.typings.react.mod.HTMLAttributes
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSpaceMod extends Shortcut {
  
  @JSImport("antd/es/space", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  @JSImport("antd/es/space", "SpaceContext")
  @js.native
  val SpaceContext: Context[SpaceContextType] = js.native
  
  @js.native
  trait CompoundedComponent
    extends StObject
       with ForwardRefExoticComponent[SpaceProps with RefAttributes[HTMLDivElement]] {
    
    var Compact: ReactComponentClass[SpaceCompactProps] = js.native
  }
  
  @js.native
  trait SpaceProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var align: js.UndefOr[start | end | center | baseline] = js.native
    
    var classNames: js.UndefOr[Item] = js.native
    
    var direction: js.UndefOr[horizontal | vertical] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[SpaceSize | (js.Tuple2[SpaceSize, SpaceSize])] = js.native
    
    var split: js.UndefOr[ReactElement] = js.native
    
    var styles: js.UndefOr[ItemCSSProperties] = js.native
    
    var wrap: js.UndefOr[Boolean] = js.native
  }
  object SpaceProps {
    
    @scala.inline
    def apply(): SpaceProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpaceProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SpaceProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: start | end | center | baseline): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setClassNames(value: Item): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setSize(value: SpaceSize | (js.Tuple2[SpaceSize, SpaceSize])): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSplit(value: ReactElement): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
      
      @scala.inline
      def setStyles(value: ItemCSSProperties): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  type SpaceSize = SizeType | Double
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `esSpaceMod.foo` */
  override def _to: CompoundedComponent = default
}
