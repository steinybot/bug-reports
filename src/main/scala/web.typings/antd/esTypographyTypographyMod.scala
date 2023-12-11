package web.typings.antd

import web.typings.antd.esConfigProviderContextMod.DirectionType
import web.typings.react.mod.HTMLAttributes
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTypographyTypographyMod extends Shortcut {
  
  @JSImport("antd/es/typography/Typography", JSImport.Default)
  @js.native
  val default: ReactComponentClass[
    (InternalTypographyProps[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with `web.typings`.antd.antdStrings.a, `web.typings`.antd.antdStrings.abbr, `web.typings`.antd.antdStrings.address */ Any
    ]) with RefAttributes[HTMLElement]
  ] = js.native
  
  @js.native
  trait InternalTypographyProps[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with `web.typings`.antd.antdStrings.a, `web.typings`.antd.antdStrings.abbr, `web.typings`.antd.antdStrings.address */ Any */]
    extends StObject
       with TypographyProps[C] {
    
    /** @deprecated Use `ref` directly if using React 16 */
    var setContentRef: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
  }
  object InternalTypographyProps {
    
    @scala.inline
    def apply[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with `web.typings`.antd.antdStrings.a, `web.typings`.antd.antdStrings.abbr, `web.typings`.antd.antdStrings.address */ Any */](): InternalTypographyProps[C] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternalTypographyProps[C]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: InternalTypographyProps[_], C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with `web.typings`.antd.antdStrings.a, `web.typings`.antd.antdStrings.abbr, `web.typings`.antd.antdStrings.address */ Any */] (val x: Self with InternalTypographyProps[C]) extends AnyVal {
      
      @scala.inline
      def setSetContentRef(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "setContentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetContentRefUndefined: Self = StObject.set(x, "setContentRef", js.undefined)
    }
  }
  
  @js.native
  trait TypographyProps[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with `web.typings`.antd.antdStrings.a, `web.typings`.antd.antdStrings.abbr, `web.typings`.antd.antdStrings.address */ Any */]
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    var direction: js.UndefOr[DirectionType] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
  }
  object TypographyProps {
    
    @scala.inline
    def apply[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with `web.typings`.antd.antdStrings.a, `web.typings`.antd.antdStrings.abbr, `web.typings`.antd.antdStrings.address */ Any */](): TypographyProps[C] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypographyProps[C]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TypographyProps[_], C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with `web.typings`.antd.antdStrings.a, `web.typings`.antd.antdStrings.abbr, `web.typings`.antd.antdStrings.address */ Any */] (val x: Self with TypographyProps[C]) extends AnyVal {
      
      @scala.inline
      def setDirection(value: DirectionType): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
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
    }
  }
  
  type _To = ReactComponentClass[
    (InternalTypographyProps[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with `web.typings`.antd.antdStrings.a, `web.typings`.antd.antdStrings.abbr, `web.typings`.antd.antdStrings.address */ Any
    ]) with RefAttributes[HTMLElement]
  ]
  
  /* This means you don't have to write `default`, but can instead just say `esTypographyTypographyMod.foo` */
  override def _to: ReactComponentClass[
    (InternalTypographyProps[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with `web.typings`.antd.antdStrings.a, `web.typings`.antd.antdStrings.abbr, `web.typings`.antd.antdStrings.address */ Any
    ]) with RefAttributes[HTMLElement]
  ] = default
}
