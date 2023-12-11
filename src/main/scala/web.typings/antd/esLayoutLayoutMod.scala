package web.typings.antd

import web.typings.antd.antdStrings.div
import web.typings.antd.antdStrings.footer
import web.typings.antd.antdStrings.header
import web.typings.antd.antdStrings.main
import web.typings.react.mod.HTMLAttributes
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLayoutLayoutMod extends Shortcut {
  
  @JSImport("antd/es/layout/layout", JSImport.Default)
  @js.native
  val default: ReactComponentClass[BasicProps with RefAttributes[HTMLElement]] = js.native
  
  @JSImport("antd/es/layout/layout", "Content")
  @js.native
  val Content: ReactComponentClass[BasicProps with RefAttributes[HTMLElement]] = js.native
  
  @JSImport("antd/es/layout/layout", "Footer")
  @js.native
  val Footer: ReactComponentClass[BasicProps with RefAttributes[HTMLElement]] = js.native
  
  @JSImport("antd/es/layout/layout", "Header")
  @js.native
  val Header: ReactComponentClass[BasicProps with RefAttributes[HTMLElement]] = js.native
  
  @js.native
  trait BasicProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var hasSider: js.UndefOr[Boolean] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var suffixCls: js.UndefOr[String] = js.native
  }
  object BasicProps {
    
    @scala.inline
    def apply(): BasicProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: BasicProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasSider(value: Boolean): Self = StObject.set(x, "hasSider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasSiderUndefined: Self = StObject.set(x, "hasSider", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setSuffixCls(value: String): Self = StObject.set(x, "suffixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixClsUndefined: Self = StObject.set(x, "suffixCls", js.undefined)
    }
  }
  
  @js.native
  trait GeneratorProps extends StObject {
    
    var displayName: String = js.native
    
    var suffixCls: js.UndefOr[String] = js.native
    
    var tagName: header | footer | main | div = js.native
  }
  object GeneratorProps {
    
    @scala.inline
    def apply(displayName: String, tagName: header | footer | main | div): GeneratorProps = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeneratorProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: GeneratorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixCls(value: String): Self = StObject.set(x, "suffixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixClsUndefined: Self = StObject.set(x, "suffixCls", js.undefined)
      
      @scala.inline
      def setTagName(value: header | footer | main | div): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[BasicProps with RefAttributes[HTMLElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esLayoutLayoutMod.foo` */
  override def _to: ReactComponentClass[BasicProps with RefAttributes[HTMLElement]] = default
}
