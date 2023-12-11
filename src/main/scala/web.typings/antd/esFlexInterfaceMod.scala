package web.typings.antd

import web.typings.antd.esConfigProviderSizeContextMod.SizeType
import web.typings.antd.esUtilTypeMod.CustomComponent
import web.typings.react.mod.HTMLAttributes
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esFlexInterfaceMod {
  
  @js.native
  trait FlexProps[P]
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    var align: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['alignItems'] */ js.Any
      ] = js.native
    
    @JSName("children")
    var children_FlexProps: ReactElement = js.native
    
    var component: js.UndefOr[CustomComponent[P]] = js.native
    
    var flex: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['flex'] */ js.Any
      ] = js.native
    
    var gap: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['gap'] */ js.Any) | SizeType
      ] = js.native
    
    var justify: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['justifyContent'] */ js.Any
      ] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var vertical: js.UndefOr[Boolean] = js.native
    
    var wrap: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['flexWrap'] */ js.Any
      ] = js.native
  }
  object FlexProps {
    
    @scala.inline
    def apply[P](children: ReactElement): FlexProps[P] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlexProps[P]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FlexProps[_], P] (val x: Self with FlexProps[P]) extends AnyVal {
      
      @scala.inline
      def setAlign(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['alignItems'] */ js.Any
      ): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponent(value: CustomComponent[P]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentReactComponentClass(value: ReactComponentClass[P]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setFlex(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['flex'] */ js.Any
      ): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      @scala.inline
      def setGap(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['gap'] */ js.Any) | SizeType
      ): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      @scala.inline
      def setJustify(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['justifyContent'] */ js.Any
      ): Self = StObject.set(x, "justify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifyUndefined: Self = StObject.set(x, "justify", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      
      @scala.inline
      def setWrap(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['flexWrap'] */ js.Any
      ): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
}
