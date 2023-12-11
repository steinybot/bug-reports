package web.typings.antd

import web.typings.antd.anon.PartialAppPropsAnyObject
import web.typings.antd.anon.WeakValidationMapAppProps
import web.typings.antd.antdBooleans.`false`
import web.typings.antd.esAppContextMod.AppConfig
import web.typings.antd.esAppContextMod.useAppProps
import web.typings.antd.esUtilTypeMod.AnyObject
import web.typings.antd.esUtilTypeMod.CustomComponent
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.ValidationMap
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAppMod {
  
  /* Inlined react.react.FC<antd.antd/es/app.AppProps<antd.antd/es/_util/type.AnyObject>> & {useApp (): antd.antd/es/app/context.useAppProps} */
  object default {
    
    @scala.inline
    def apply(props: AppProps[AnyObject]): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    @scala.inline
    def apply(props: AppProps[AnyObject], context: Any): ReactElement = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
    
    @JSImport("antd/es/app", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/es/app", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/app", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialAppPropsAnyObject] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialAppPropsAnyObject]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/app", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/app", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapAppProps] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapAppProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def useApp(): useAppProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useApp")().asInstanceOf[useAppProps]
  }
  
  @js.native
  trait AppProps[P]
    extends StObject
       with AppConfig {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var component: js.UndefOr[CustomComponent[P] | `false`] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object AppProps {
    
    @scala.inline
    def apply[P](): AppProps[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppProps[P]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AppProps[_], P] (val x: Self with AppProps[P]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponent(value: CustomComponent[P] | `false`): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentReactComponentClass(value: ReactComponentClass[P]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
