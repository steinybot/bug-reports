package web.typings.antd

import web.typings.react.mod.CSSProperties
import web.typings.react.mod.Key
import web.typings.std.PromiseLike
import web.typings.std.VoidFunction
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMessageInterfaceMod {
  
  @js.native
  trait ArgsProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var content: ReactElement = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var key: js.UndefOr[String | Double] = js.native
    
    var onClick: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLDivElement], Unit]] = js.native
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var `type`: js.UndefOr[NoticeType] = js.native
  }
  object ArgsProps {
    
    @scala.inline
    def apply(content: ReactElement): ArgsProps = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgsProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ArgsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* e */ SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setType(value: NoticeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ConfigOptions extends StObject {
    
    var duration: js.UndefOr[Double] = js.native
    
    var getContainer: js.UndefOr[js.Function0[HTMLElement]] = js.native
    
    var maxCount: js.UndefOr[Double] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rtl: js.UndefOr[Boolean] = js.native
    
    var top: js.UndefOr[Double] = js.native
    
    var transitionName: js.UndefOr[String] = js.native
  }
  object ConfigOptions {
    
    @scala.inline
    def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setGetContainer(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      @scala.inline
      def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
    }
  }
  
  type JointContent = ReactElement | ArgsProps
  
  @js.native
  trait MessageInstance extends StObject {
    
    def destroy(): Unit = js.native
    def destroy(key: Key): Unit = js.native
    
    var error: TypeOpen = js.native
    
    var info: TypeOpen = js.native
    
    var loading: TypeOpen = js.native
    
    def open(args: ArgsProps): MessageType = js.native
    
    var success: TypeOpen = js.native
    
    var warning: TypeOpen = js.native
  }
  
  @js.native
  trait MessageType
    extends StObject
       with PromiseLike[Boolean] {
    
    def apply(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdStrings.info
    - `web.typings`.antd.antdStrings.success
    - `web.typings`.antd.antdStrings.error
    - `web.typings`.antd.antdStrings.warning
    - `web.typings`.antd.antdStrings.loading
  */
  trait NoticeType extends StObject
  object NoticeType {
    
    @scala.inline
    def error: web.typings.antd.antdStrings.error = "error".asInstanceOf[web.typings.antd.antdStrings.error]
    
    @scala.inline
    def info: web.typings.antd.antdStrings.info = "info".asInstanceOf[web.typings.antd.antdStrings.info]
    
    @scala.inline
    def loading: web.typings.antd.antdStrings.loading = "loading".asInstanceOf[web.typings.antd.antdStrings.loading]
    
    @scala.inline
    def success: web.typings.antd.antdStrings.success = "success".asInstanceOf[web.typings.antd.antdStrings.success]
    
    @scala.inline
    def warning: web.typings.antd.antdStrings.warning = "warning".asInstanceOf[web.typings.antd.antdStrings.warning]
  }
  
  type TypeOpen = js.Function3[
    /* content */ JointContent, 
    /* duration */ js.UndefOr[Double | VoidFunction], 
    /* onClose */ js.UndefOr[VoidFunction], 
    MessageType
  ]
}
