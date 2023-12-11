package web.typings.antd

import web.typings.react.mod.CSSProperties
import web.typings.react.mod.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilPurePanelMod {
  
  @JSImport("antd/es/_util/PurePanel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[ComponentProps /* <: BaseProps */](Component: Any): js.Function1[/* props */ Any, Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ Any, Element]]
  @scala.inline
  def default[ComponentProps /* <: BaseProps */](Component: Any, defaultPrefixCls: String): js.Function1[/* props */ Any, Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any], defaultPrefixCls.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* props */ Any, Element]]
  @scala.inline
  def default[ComponentProps /* <: BaseProps */](
    Component: Any,
    defaultPrefixCls: String,
    getDropdownCls: js.Function1[/* prefixCls */ String, String]
  ): js.Function1[/* props */ Any, Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any], defaultPrefixCls.asInstanceOf[js.Any], getDropdownCls.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* props */ Any, Element]]
  @scala.inline
  def default[ComponentProps /* <: BaseProps */](
    Component: Any,
    defaultPrefixCls: String,
    getDropdownCls: js.Function1[/* prefixCls */ String, String],
    postProps: js.Function1[/* props */ ComponentProps, ComponentProps]
  ): js.Function1[/* props */ Any, Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any], defaultPrefixCls.asInstanceOf[js.Any], getDropdownCls.asInstanceOf[js.Any], postProps.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* props */ Any, Element]]
  @scala.inline
  def default[ComponentProps /* <: BaseProps */](
    Component: Any,
    defaultPrefixCls: String,
    getDropdownCls: Null,
    postProps: js.Function1[/* props */ ComponentProps, ComponentProps]
  ): js.Function1[/* props */ Any, Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any], defaultPrefixCls.asInstanceOf[js.Any], getDropdownCls.asInstanceOf[js.Any], postProps.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* props */ Any, Element]]
  @scala.inline
  def default[ComponentProps /* <: BaseProps */](
    Component: Any,
    defaultPrefixCls: String,
    getDropdownCls: Unit,
    postProps: js.Function1[/* props */ ComponentProps, ComponentProps]
  ): js.Function1[/* props */ Any, Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any], defaultPrefixCls.asInstanceOf[js.Any], getDropdownCls.asInstanceOf[js.Any], postProps.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* props */ Any, Element]]
  @scala.inline
  def default[ComponentProps /* <: BaseProps */](
    Component: Any,
    defaultPrefixCls: Unit,
    getDropdownCls: js.Function1[/* prefixCls */ String, String]
  ): js.Function1[/* props */ Any, Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any], defaultPrefixCls.asInstanceOf[js.Any], getDropdownCls.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* props */ Any, Element]]
  @scala.inline
  def default[ComponentProps /* <: BaseProps */](
    Component: Any,
    defaultPrefixCls: Unit,
    getDropdownCls: js.Function1[/* prefixCls */ String, String],
    postProps: js.Function1[/* props */ ComponentProps, ComponentProps]
  ): js.Function1[/* props */ Any, Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any], defaultPrefixCls.asInstanceOf[js.Any], getDropdownCls.asInstanceOf[js.Any], postProps.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* props */ Any, Element]]
  @scala.inline
  def default[ComponentProps /* <: BaseProps */](
    Component: Any,
    defaultPrefixCls: Unit,
    getDropdownCls: Null,
    postProps: js.Function1[/* props */ ComponentProps, ComponentProps]
  ): js.Function1[/* props */ Any, Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any], defaultPrefixCls.asInstanceOf[js.Any], getDropdownCls.asInstanceOf[js.Any], postProps.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* props */ Any, Element]]
  @scala.inline
  def default[ComponentProps /* <: BaseProps */](
    Component: Any,
    defaultPrefixCls: Unit,
    getDropdownCls: Unit,
    postProps: js.Function1[/* props */ ComponentProps, ComponentProps]
  ): js.Function1[/* props */ Any, Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any], defaultPrefixCls.asInstanceOf[js.Any], getDropdownCls.asInstanceOf[js.Any], postProps.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* props */ Any, Element]]
  
  @scala.inline
  def withPureRenderTheme(Component: Any): js.Function1[/* props */ Any, Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("withPureRenderTheme")(Component.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ Any, Element]]
  
  @js.native
  trait BaseProps extends StObject {
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object BaseProps {
    
    @scala.inline
    def apply(): BaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: BaseProps] (val x: Self) extends AnyVal {
      
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
}
