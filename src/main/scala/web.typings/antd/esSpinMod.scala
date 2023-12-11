package web.typings.antd

import web.typings.react.mod.CSSProperties
import web.typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSpinMod extends Shortcut {
  
  @JSImport("antd/es/spin", JSImport.Default)
  @js.native
  val default: SpinFCType = js.native
  
  @js.native
  trait SpinClassProps
    extends StObject
       with SpinProps {
    
    var hashId: String = js.native
    
    var spinPrefixCls: String = js.native
  }
  object SpinClassProps {
    
    @scala.inline
    def apply(hashId: String, spinPrefixCls: String): SpinClassProps = {
      val __obj = js.Dynamic.literal(hashId = hashId.asInstanceOf[js.Any], spinPrefixCls = spinPrefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpinClassProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SpinClassProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHashId(value: String): Self = StObject.set(x, "hashId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinPrefixCls(value: String): Self = StObject.set(x, "spinPrefixCls", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SpinFCType
    extends StObject
       with FunctionComponent[SpinProps] {
    
    def setDefaultIndicator(indicator: ReactElement): Unit = js.native
  }
  
  type SpinIndicator = ReactElement
  
  @js.native
  trait SpinProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var delay: js.UndefOr[Double] = js.native
    
    var fullscreen: js.UndefOr[Boolean] = js.native
    
    var indicator: js.UndefOr[ReactElement] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[SpinSize] = js.native
    
    var spinning: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tip: js.UndefOr[ReactElement] = js.native
    
    var wrapperClassName: js.UndefOr[String] = js.native
  }
  object SpinProps {
    
    @scala.inline
    def apply(): SpinProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpinProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SpinProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
      
      @scala.inline
      def setIndicator(value: ReactElement): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setSize(value: SpinSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSpinning(value: Boolean): Self = StObject.set(x, "spinning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinningUndefined: Self = StObject.set(x, "spinning", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTip(value: ReactElement): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTipUndefined: Self = StObject.set(x, "tip", js.undefined)
      
      @scala.inline
      def setWrapperClassName(value: String): Self = StObject.set(x, "wrapperClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperClassNameUndefined: Self = StObject.set(x, "wrapperClassName", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.small
    - `web.typings`.antd.antdStrings.default
    - `web.typings`.antd.antdStrings.large
  */
  trait SpinSize extends StObject
  
  type _To = SpinFCType
  
  /* This means you don't have to write `default`, but can instead just say `esSpinMod.foo` */
  override def _to: SpinFCType = default
}
