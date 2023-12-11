package web.typings.react

import web.typings.react.anon.UNDEFINEDVOIDONLY
import web.typings.react.mod._ReactNode
import web.typings.react.reactStrings.backwards
import web.typings.react.reactStrings.forwards
import web.typings.std.Exclude
import web.typings.std.PromiseLike
import org.scalajs.dom.FormData
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experimentalMod {
  
  /* augmented module */
  object reactAugmentingMod {
    
    @JSImport("react", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react", "SuspenseList")
    @js.native
    val SuspenseList: ReactComponentClass[SuspenseListProps] = js.native
    
    @scala.inline
    def experimentalUseEffectEvent[T /* <: js.Function */](event: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("experimental_useEffectEvent")(event.asInstanceOf[js.Any]).asInstanceOf[T]
    
    @js.native
    trait DO_NOT_USE_OR_YOU_WILL_BE_FIRED_EXPERIMENTAL_FORM_ACTIONS extends StObject {
      
      def functions(formData: FormData): Unit = js.native
    }
    object DO_NOT_USE_OR_YOU_WILL_BE_FIRED_EXPERIMENTAL_FORM_ACTIONS {
      
      @scala.inline
      def apply(functions: FormData => Unit): DO_NOT_USE_OR_YOU_WILL_BE_FIRED_EXPERIMENTAL_FORM_ACTIONS = {
        val __obj = js.Dynamic.literal(functions = js.Any.fromFunction1(functions))
        __obj.asInstanceOf[DO_NOT_USE_OR_YOU_WILL_BE_FIRED_EXPERIMENTAL_FORM_ACTIONS]
      }
      
      @scala.inline
      implicit class MutableBuilder[Self <: DO_NOT_USE_OR_YOU_WILL_BE_FIRED_EXPERIMENTAL_FORM_ACTIONS] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFunctions(value: FormData => Unit): Self = StObject.set(x, "functions", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait DO_NOT_USE_OR_YOU_WILL_BE_FIRED_EXPERIMENTAL_REACT_NODES extends StObject {
      
      var promises: PromiseLikeOfReactNode = js.native
    }
    object DO_NOT_USE_OR_YOU_WILL_BE_FIRED_EXPERIMENTAL_REACT_NODES {
      
      @scala.inline
      def apply(promises: PromiseLikeOfReactNode): DO_NOT_USE_OR_YOU_WILL_BE_FIRED_EXPERIMENTAL_REACT_NODES = {
        val __obj = js.Dynamic.literal(promises = promises.asInstanceOf[js.Any])
        __obj.asInstanceOf[DO_NOT_USE_OR_YOU_WILL_BE_FIRED_EXPERIMENTAL_REACT_NODES]
      }
      
      @scala.inline
      implicit class MutableBuilder[Self <: DO_NOT_USE_OR_YOU_WILL_BE_FIRED_EXPERIMENTAL_REACT_NODES] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPromises(value: PromiseLikeOfReactNode): Self = StObject.set(x, "promises", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait DirectionalSuspenseListProps
      extends StObject
         with SuspenseListCommonProps
         with web.typings.react.mod.SuspenseListProps
         with SuspenseListProps {
      
      /**
        * Defines the order in which the `SuspenseList` children should be revealed.
        */
      var revealOrder: forwards | backwards = js.native
      
      /**
        * Dictates how unloaded items in a SuspenseList is shown.
        *
        * - By default, `SuspenseList` will show all fallbacks in the list.
        * - `collapsed` shows only the next fallback in the list.
        * - `hidden` doesn’t show any unloaded items.
        */
      var tail: js.UndefOr[SuspenseListTailMode] = js.native
    }
    object DirectionalSuspenseListProps {
      
      @scala.inline
      def apply(children: ReactElement | js.Iterable[ReactElement], revealOrder: forwards | backwards): DirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
        __obj.asInstanceOf[DirectionalSuspenseListProps]
      }
      
      @scala.inline
      implicit class MutableBuilder[Self <: DirectionalSuspenseListProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRevealOrder(value: forwards | backwards): Self = StObject.set(x, "revealOrder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTail(value: SuspenseListTailMode): Self = StObject.set(x, "tail", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTailUndefined: Self = StObject.set(x, "tail", js.undefined)
      }
    }
    
    @js.native
    trait NonDirectionalSuspenseListProps
      extends StObject
         with SuspenseListCommonProps
         with web.typings.react.mod.SuspenseListProps
         with SuspenseListProps {
      
      /**
        * Defines the order in which the `SuspenseList` children should be revealed.
        */
      var revealOrder: js.UndefOr[Exclude[SuspenseListRevealOrder, forwards | backwards]] = js.native
      
      /**
        * The tail property is invalid when not using the `forwards` or `backwards` reveal orders.
        */
      var tail: js.UndefOr[scala.Nothing] = js.native
    }
    object NonDirectionalSuspenseListProps {
      
      @scala.inline
      def apply(children: ReactElement | js.Iterable[ReactElement]): NonDirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
        __obj.asInstanceOf[NonDirectionalSuspenseListProps]
      }
      
      @scala.inline
      implicit class MutableBuilder[Self <: NonDirectionalSuspenseListProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRevealOrder(value: Exclude[SuspenseListRevealOrder, forwards | backwards]): Self = StObject.set(x, "revealOrder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRevealOrderUndefined: Self = StObject.set(x, "revealOrder", js.undefined)
      }
    }
    
    // Need an interface to not cause ReactNode to be a self-referential type.
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type PromiseLikeOfReactNode = std.PromiseLike<react.react.ReactNode>
    }}}
    to avoid circular code involving: 
    - react.react.<global>.JSX.ElementType
    - react.react.GlobalJSXElementType
    - react.react.JSX.ElementType
    - react.react.JSXElementConstructor
    - react.react.PromiseLikeOfReactNode
    - react.react.ReactFragment
    - react.react.ReactNode
    - react.react.ReactNodeArray
    - react.react/experimental.react.PromiseLikeOfReactNode
    */
    @js.native
    trait PromiseLikeOfReactNode
      extends StObject
         with PromiseLike[ReactElement]
         with _ReactNode
    
    @js.native
    trait SuspenseListCommonProps extends StObject {
      
      /**
        * Note that SuspenseList require more than one child;
        * it is a runtime warning to provide only a single child.
        *
        * It does, however, allow those children to be wrapped inside a single
        * level of `<React.Fragment>`.
        */
      var children: ReactElement | js.Iterable[ReactElement] = js.native
    }
    object SuspenseListCommonProps {
      
      @scala.inline
      def apply(children: ReactElement | js.Iterable[ReactElement]): SuspenseListCommonProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
        __obj.asInstanceOf[SuspenseListCommonProps]
      }
      
      @scala.inline
      implicit class MutableBuilder[Self <: SuspenseListCommonProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildren(value: ReactElement | js.Iterable[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - `web.typings`.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps
      - `web.typings`.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps
    */
    trait SuspenseListProps extends StObject
    object SuspenseListProps {
      
      @scala.inline
      def DirectionalSuspenseListProps(children: ReactElement | js.Iterable[ReactElement], revealOrder: forwards | backwards): web.typings.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
        __obj.asInstanceOf[web.typings.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps]
      }
      
      @scala.inline
      def NonDirectionalSuspenseListProps(children: ReactElement | js.Iterable[ReactElement]): web.typings.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
        __obj.asInstanceOf[web.typings.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps]
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - `web.typings`.react.reactStrings.forwards
      - `web.typings`.react.reactStrings.backwards
      - `web.typings`.react.reactStrings.together
    */
    trait SuspenseListRevealOrder extends StObject
    object SuspenseListRevealOrder {
      
      @scala.inline
      def backwards: web.typings.react.reactStrings.backwards = "backwards".asInstanceOf[web.typings.react.reactStrings.backwards]
      
      @scala.inline
      def forwards: web.typings.react.reactStrings.forwards = "forwards".asInstanceOf[web.typings.react.reactStrings.forwards]
      
      @scala.inline
      def together: web.typings.react.reactStrings.together = "together".asInstanceOf[web.typings.react.reactStrings.together]
    }
    
    /* Rewritten from type alias, can be one of: 
      - `web.typings`.react.reactStrings.collapsed
      - `web.typings`.react.reactStrings.hidden
    */
    trait SuspenseListTailMode extends StObject
    object SuspenseListTailMode {
      
      @scala.inline
      def collapsed: web.typings.react.reactStrings.collapsed = "collapsed".asInstanceOf[web.typings.react.reactStrings.collapsed]
      
      @scala.inline
      def hidden: web.typings.react.reactStrings.hidden = "hidden".asInstanceOf[web.typings.react.reactStrings.hidden]
    }
    
    @js.native
    trait SuspenseProps extends StObject {
      
      /**
        * The presence of this prop indicates that the content is computationally expensive to render.
        * In other words, the tree is CPU bound and not I/O bound (e.g. due to fetching data).
        * @see {@link https://github.com/facebook/react/pull/19936}
        */
      var unstable_expectedLoadTime: js.UndefOr[Double] = js.native
    }
    object SuspenseProps {
      
      @scala.inline
      def apply(): SuspenseProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SuspenseProps]
      }
      
      @scala.inline
      implicit class MutableBuilder[Self <: SuspenseProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setUnstable_expectedLoadTime(value: Double): Self = StObject.set(x, "unstable_expectedLoadTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnstable_expectedLoadTimeUndefined: Self = StObject.set(x, "unstable_expectedLoadTime", js.undefined)
      }
    }
    
    type TransitionStartFunction = js.Function1[
        /* callback */ js.Function0[js.Promise[web.typings.react.mod.VoidOrUndefinedOnly]], 
        Unit
      ]
  }
  
  type VoidOrUndefinedOnly = Unit | UNDEFINEDVOIDONLY
}
