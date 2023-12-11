package web.typings.antd

import web.typings.react.mod.CSSProperties
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esButtonLoadingIconMod extends Shortcut {
  
  @JSImport("antd/es/button/LoadingIcon", JSImport.Default)
  @js.native
  val default: ReactComponentClass[LoadingIconProps] = js.native
  
  @js.native
  trait LoadingIconProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var existIcon: Boolean = js.native
    
    var loading: js.UndefOr[Boolean | js.Object] = js.native
    
    var prefixCls: String = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object LoadingIconProps {
    
    @scala.inline
    def apply(existIcon: Boolean, prefixCls: String): LoadingIconProps = {
      val __obj = js.Dynamic.literal(existIcon = existIcon.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadingIconProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: LoadingIconProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setExistIcon(value: Boolean): Self = StObject.set(x, "existIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoading(value: Boolean | js.Object): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[LoadingIconProps]
  
  /* This means you don't have to write `default`, but can instead just say `esButtonLoadingIconMod.foo` */
  override def _to: ReactComponentClass[LoadingIconProps] = default
}
