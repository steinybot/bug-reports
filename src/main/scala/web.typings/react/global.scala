package web.typings.react

import web.typings.react.anon.Children
import web.typings.react.anon.Default
import web.typings.react.canaryMod.reactAugmentingMod.ServerContext
import web.typings.react.canaryMod.reactAugmentingMod.ServerContextJSONValue
import web.typings.react.canaryMod.reactAugmentingMod.Usable
import web.typings.react.experimentalMod.reactAugmentingMod.SuspenseListProps
import web.typings.react.mod.Attributes
import web.typings.react.mod.CElement
import web.typings.react.mod.CFactory
import web.typings.react.mod.ClassAttributes
import web.typings.react.mod.ClassType
import web.typings.react.mod.ComponentProps
import web.typings.react.mod.Context
import web.typings.react.mod.DOMAttributes
import web.typings.react.mod.DOMFactory
import web.typings.react.mod.DependencyList
import web.typings.react.mod.DetailedReactHTMLElement
import web.typings.react.mod.Dispatch
import web.typings.react.mod.DispatchWithoutAction
import web.typings.react.mod.EffectCallback
import web.typings.react.mod.Factory
import web.typings.react.mod.ForwardRefRenderFunction
import web.typings.react.mod.FunctionComponentElement
import web.typings.react.mod.FunctionComponentFactory
import web.typings.react.mod.HTMLAttributes
import web.typings.react.mod.HTMLFactory
import web.typings.react.mod.InputHTMLAttributes
import web.typings.react.mod.MutableRefObject
import web.typings.react.mod.ProfilerProps
import web.typings.react.mod.PropsWithoutRef
import web.typings.react.mod.ReactHTMLElement
import web.typings.react.mod.ReactSVGElement
import web.typings.react.mod.Reducer
import web.typings.react.mod.ReducerAction
import web.typings.react.mod.ReducerState
import web.typings.react.mod.ReducerStateWithoutAction
import web.typings.react.mod.ReducerWithoutAction
import web.typings.react.mod.Ref
import web.typings.react.mod.RefAttributes
import web.typings.react.mod.SVGAttributes
import web.typings.react.mod.SVGFactory
import web.typings.react.mod.SetStateAction
import web.typings.react.mod.SuspenseProps
import web.typings.react.mod.TransitionFunction
import web.typings.react.mod.TransitionStartFunction
import web.typings.react.reactStrings.input
import web.typings.std.Exclude
import web.typings.std.Partial
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.SVGElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object React {
    
    @JSGlobal("React")
    @js.native
    val ^ : js.Any = js.native
    
    // Sync with `ReactChildren` until `ReactChildren` is removed.
    object Children {
      
      @JSGlobal("React.Children")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def count(children: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(children.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      @scala.inline
      def forEach[C](children: C, fn: js.Function2[/* child */ C, /* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(children.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
      @scala.inline
      def forEach[C](children: js.Array[C], fn: js.Function2[/* child */ C, /* index */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(children.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @scala.inline
      def map[T, C](children: C, fn: js.Function2[/* child */ C, /* index */ Double, T]): /* import warning: importer.ImportType#apply Failed type conversion: C extends null | undefined ? C : std.Array<std.Exclude<T, boolean | null | undefined>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(children.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: C extends null | undefined ? C : std.Array<std.Exclude<T, boolean | null | undefined>> */ js.Any]
      @scala.inline
      def map[T, C](children: js.Array[C], fn: js.Function2[/* child */ C, /* index */ Double, T]): /* import warning: importer.ImportType#apply Failed type conversion: C extends null | undefined ? C : std.Array<std.Exclude<T, boolean | null | undefined>> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(children.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: C extends null | undefined ? C : std.Array<std.Exclude<T, boolean | null | undefined>> */ js.Any]
      
      @scala.inline
      def only[C](children: C): /* import warning: importer.ImportType#apply Failed type conversion: C extends std.Array<any> ? never : C */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("only")(children.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: C extends std.Array<any> ? never : C */ js.Any]
      
      @scala.inline
      def toArray(children: js.Array[ReactElement]): js.Array[Exclude[ReactElement, js.UndefOr[Boolean | Null]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[Exclude[ReactElement, js.UndefOr[Boolean | Null]]]]
      @scala.inline
      def toArray(children: ReactElement): js.Array[Exclude[ReactElement, js.UndefOr[Boolean | Null]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[Exclude[ReactElement, js.UndefOr[Boolean | Null]]]]
    }
    
    // Base component for plain JS classes
    @JSGlobal("React.Component")
    @js.native
    class Component[P, S, SS] protected ()
      extends web.typings.react.mod.Component[P, S, SS] {
      def this(props: P) = this()
      /**
        * @deprecated
        * @see https://legacy.reactjs.org/docs/legacy-context.html
        */
      def this(props: P, context: Any) = this()
    }
    object Component {
      
      @JSGlobal("React.Component")
      @js.native
      val ^ : js.Any = js.native
      
      // tslint won't let me format the sample code in a way that vscode likes it :(
      /**
        * If set, `this.context` will be set at runtime to the current value of the given Context.
        *
        * Usage:
        *
        * ```ts
        * type MyContext = number
        * const Ctx = React.createContext<MyContext>(0)
        *
        * class Foo extends React.Component {
        *   static contextType = Ctx
        *   context!: React.ContextType<typeof Ctx>
        *   render () {
        *     return <>My context's value: {this.context}</>;
        *   }
        * }
        * ```
        *
        * @see https://react.dev/reference/react/Component#static-contexttype
        */
      /* static member */
      @JSGlobal("React.Component.contextType")
      @js.native
      def contextType: js.UndefOr[Context[Any]] = js.native
      @scala.inline
      def contextType_=(x: js.UndefOr[Context[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("React.Fragment")
    @js.native
    val Fragment: ReactComponentClass[Children] = js.native
    
    @JSGlobal("React.Profiler")
    @js.native
    val Profiler: ReactComponentClass[ProfilerProps] = js.native
    
    @JSGlobal("React.PureComponent")
    @js.native
    class PureComponent[P, S, SS] protected ()
      extends web.typings.react.mod.PureComponent[P, S, SS] {
      def this(props: P) = this()
      /**
        * @deprecated
        * @see https://legacy.reactjs.org/docs/legacy-context.html
        */
      def this(props: P, context: Any) = this()
    }
    
    @JSGlobal("React.StrictMode")
    @js.native
    val StrictMode: ReactComponentClass[Children] = js.native
    
    @JSGlobal("React.Suspense")
    @js.native
    val Suspense: ReactComponentClass[SuspenseProps] = js.native
    
    @JSGlobal("React.SuspenseList")
    @js.native
    val SuspenseList: ReactComponentClass[SuspenseListProps] = js.native
    
    @scala.inline
    def cache[CachedFunction /* <: js.Function */](fn: CachedFunction): CachedFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("cache")(fn.asInstanceOf[js.Any]).asInstanceOf[CachedFunction]
    
    // Custom components
    @scala.inline
    def cloneElement[P](element: FunctionComponentElement[P], props: Partial[P] with Attributes, children: ReactElement*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[FunctionComponentElement[P]]
    @scala.inline
    def cloneElement[P](element: FunctionComponentElement[P], props: Unit, children: ReactElement*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[FunctionComponentElement[P]]
    @scala.inline
    def cloneElement[P](element: ReactElement, props: Partial[P] with Attributes, children: ReactElement*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[ReactElement]
    @scala.inline
    def cloneElement[P](element: ReactElement, props: Unit, children: ReactElement*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[ReactElement]
    @scala.inline
    def cloneElement[P, T /* <: ReactComponentClass[P] */](element: CElement[P, T], props: Partial[P] with ClassAttributes[T], children: ReactElement*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[CElement[P, T]]
    @scala.inline
    def cloneElement[P, T /* <: ReactComponentClass[P] */](element: CElement[P, T], props: Unit, children: ReactElement*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[CElement[P, T]]
    // ReactHTMLElement, less specific
    @scala.inline
    def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: P, children: ReactElement*): ReactHTMLElement[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[ReactHTMLElement[T]]
    @scala.inline
    def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: Unit, children: ReactElement*): ReactHTMLElement[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[ReactHTMLElement[T]]
    // SVGElement
    @scala.inline
    def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: P, children: ReactElement*): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[ReactSVGElement]
    @scala.inline
    def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: Unit, children: ReactElement*): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[ReactSVGElement]
    // DOM Element (has to be the last, because type checking stops at first overload that fits)
    @scala.inline
    def cloneElement[P /* <: DOMAttributes[T] */, T /* <: Element */](element: ReactElement, props: DOMAttributes[T] with P, children: ReactElement*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[ReactElement]
    
    @scala.inline
    def cloneElement_PT[P /* <: DOMAttributes[T] */, T /* <: Element */](element: ReactElement, props: Unit, children: ReactElement*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[ReactElement]
    
    // DOM Elements
    // ReactHTMLElement
    @scala.inline
    def cloneElement_PT_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: P, children: ReactElement*): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
    @scala.inline
    def cloneElement_PT_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: Unit, children: ReactElement*): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
    
    @scala.inline
    def createContext[T](
      // If you thought this should be optional, see
    // https://github.com/DefinitelyTyped/DefinitelyTyped/pull/24509#issuecomment-382213106
    defaultValue: T
    ): Context[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[Context[T]]
    
    @scala.inline
    def createElement[P /* <: js.Object */](
      `type`: ClassType[P, ReactComponentClass[P], ReactComponentClass[P]],
      props: ClassAttributes[ReactComponentClass[P]] with P,
      children: ReactElement*
    ): CElement[P, ReactComponentClass[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[CElement[P, ReactComponentClass[P]]]
    @scala.inline
    def createElement[P /* <: js.Object */](
      `type`: ClassType[P, ReactComponentClass[P], ReactComponentClass[P]],
      props: Null,
      children: ReactElement*
    ): CElement[P, ReactComponentClass[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[CElement[P, ReactComponentClass[P]]]
    @scala.inline
    def createElement[P /* <: js.Object */](
      `type`: ClassType[P, ReactComponentClass[P], ReactComponentClass[P]],
      props: Unit,
      children: ReactElement*
    ): CElement[P, ReactComponentClass[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[CElement[P, ReactComponentClass[P]]]
    @scala.inline
    def createElement[P /* <: js.Object */](`type`: String, props: Attributes with P, children: ReactElement*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[ReactElement]
    @scala.inline
    def createElement[P /* <: js.Object */](`type`: String, props: Null, children: ReactElement*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[ReactElement]
    @scala.inline
    def createElement[P /* <: js.Object */](`type`: String, props: Unit, children: ReactElement*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[ReactElement]
    @scala.inline
    def createElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with `web.typings`.react.reactStrings.animate, `web.typings`.react.reactStrings.circle, `web.typings`.react.reactStrings.clipPath */ Any,
      props: ClassAttributes[T] with P,
      children: ReactElement*
    ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[ReactSVGElement]
    @scala.inline
    def createElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with `web.typings`.react.reactStrings.animate, `web.typings`.react.reactStrings.circle, `web.typings`.react.reactStrings.clipPath */ Any,
      props: Null,
      children: ReactElement*
    ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[ReactSVGElement]
    @scala.inline
    def createElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with `web.typings`.react.reactStrings.animate, `web.typings`.react.reactStrings.circle, `web.typings`.react.reactStrings.clipPath */ Any,
      props: Unit,
      children: ReactElement*
    ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[ReactSVGElement]
    
    @scala.inline
    def createElement_PT[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: ClassAttributes[T] with P, children: ReactElement*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[ReactElement]
    @scala.inline
    def createElement_PT[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: Null, children: ReactElement*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[ReactElement]
    @scala.inline
    def createElement_PT[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: Unit, children: ReactElement*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[ReactElement]
    
    @scala.inline
    def createElement_PTC_CElement[P /* <: js.Object */, T /* <: ReactComponentClass[P] */, C /* <: ReactComponentClass[P] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] with P, children: ReactElement*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[CElement[P, T]]
    @scala.inline
    def createElement_PTC_CElement[P /* <: js.Object */, T /* <: ReactComponentClass[P] */, C /* <: ReactComponentClass[P] */](`type`: ClassType[P, T, C], props: Null, children: ReactElement*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[CElement[P, T]]
    @scala.inline
    def createElement_PTC_CElement[P /* <: js.Object */, T /* <: ReactComponentClass[P] */, C /* <: ReactComponentClass[P] */](`type`: ClassType[P, T, C], props: Unit, children: ReactElement*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[CElement[P, T]]
    
    @scala.inline
    def createElement_PT_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118, starting with `web.typings`.react.reactStrings.a_, `web.typings`.react.reactStrings.abbr, `web.typings`.react.reactStrings.address */ Any,
      props: ClassAttributes[T] with P,
      children: ReactElement*
    ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
    @scala.inline
    def createElement_PT_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118, starting with `web.typings`.react.reactStrings.a_, `web.typings`.react.reactStrings.abbr, `web.typings`.react.reactStrings.address */ Any,
      props: Null,
      children: ReactElement*
    ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
    @scala.inline
    def createElement_PT_DetailedReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118, starting with `web.typings`.react.reactStrings.a_, `web.typings`.react.reactStrings.abbr, `web.typings`.react.reactStrings.address */ Any,
      props: Unit,
      children: ReactElement*
    ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
    
    // Custom components
    @scala.inline
    def createElement_P_FunctionComponentElement[P /* <: js.Object */](`type`: ReactComponentClass[P], props: Attributes with P, children: ReactElement*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[FunctionComponentElement[P]]
    @scala.inline
    def createElement_P_FunctionComponentElement[P /* <: js.Object */](`type`: ReactComponentClass[P], props: Null, children: ReactElement*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[FunctionComponentElement[P]]
    @scala.inline
    def createElement_P_FunctionComponentElement[P /* <: js.Object */](`type`: ReactComponentClass[P], props: Unit, children: ReactElement*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[FunctionComponentElement[P]]
    
    @scala.inline
    def createElement_P_ReactElement[P /* <: js.Object */](`type`: ReactComponentClass[P], props: Attributes with P, children: ReactElement*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[ReactElement]
    @scala.inline
    def createElement_P_ReactElement[P /* <: js.Object */](`type`: ReactComponentClass[P], props: Null, children: ReactElement*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[ReactElement]
    @scala.inline
    def createElement_P_ReactElement[P /* <: js.Object */](`type`: ReactComponentClass[P], props: Unit, children: ReactElement*): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[ReactElement]
    
    // DOM Elements
    // TODO: generalize this to everything in `keyof ReactHTML`, not just "input"
    @scala.inline
    def createElement_input(
      `type`: input,
      props: InputHTMLAttributes[HTMLInputElement] with ClassAttributes[HTMLInputElement],
      children: ReactElement*
    ): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
    @scala.inline
    def createElement_input(`type`: input, props: Null, children: ReactElement*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
    @scala.inline
    def createElement_input(`type`: input, props: Unit, children: ReactElement*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
    
    @scala.inline
    def createFactory(
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with `web.typings`.react.reactStrings.animate, `web.typings`.react.reactStrings.circle, `web.typings`.react.reactStrings.clipPath */ Any
    ): SVGFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[SVGFactory]
    // Custom components
    @scala.inline
    def createFactory[P](`type`: ReactComponentClass[P]): FunctionComponentFactory[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[FunctionComponentFactory[P]]
    @scala.inline
    def createFactory[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String): DOMFactory[P, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[DOMFactory[P, T]]
    
    @scala.inline
    def createFactory_PTC_CFactory[P, T /* <: ReactComponentClass[P] */, C /* <: ReactComponentClass[P] */](`type`: ClassType[P, T, C]): CFactory[P, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[CFactory[P, T]]
    
    @scala.inline
    def createFactory_P_CFactory[P](`type`: ClassType[P, ReactComponentClass[P], ReactComponentClass[P]]): CFactory[P, ReactComponentClass[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[CFactory[P, ReactComponentClass[P]]]
    
    @scala.inline
    def createFactory_P_Factory[P](`type`: ReactComponentClass[P]): Factory[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[Factory[P]]
    
    //
    // Top Level API
    // ----------------------------------------------------------------------
    // DOM Elements
    @scala.inline
    def createFactory_T_HTMLFactory[T /* <: HTMLElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118, starting with `web.typings`.react.reactStrings.a_, `web.typings`.react.reactStrings.abbr, `web.typings`.react.reactStrings.address */ Any
    ): HTMLFactory[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[HTMLFactory[T]]
    
    @scala.inline
    def createRef[T](): ReactRef[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRef")().asInstanceOf[ReactRef[T]]
    
    @scala.inline
    def createServerContext(globalName: String, defaultValue: String): ServerContext[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerContext")(globalName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[ServerContext[String]]
    @scala.inline
    def createServerContext(globalName: String, defaultValue: js.Array[ServerContextJSONValue]): ServerContext[js.Array[ServerContextJSONValue]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerContext")(globalName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[ServerContext[js.Array[ServerContextJSONValue]]]
    @scala.inline
    def createServerContext(globalName: String, defaultValue: Boolean): ServerContext[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerContext")(globalName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[ServerContext[Boolean]]
    @scala.inline
    def createServerContext(globalName: String, defaultValue: Double): ServerContext[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerContext")(globalName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[ServerContext[Double]]
    @scala.inline
    def createServerContext(globalName: String, defaultValue: Null): ServerContext[Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerContext")(globalName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[ServerContext[Null]]
    @scala.inline
    def createServerContext[T /* <: StringDictionary[ServerContextJSONValue] */](globalName: String, defaultValue: T): ServerContext[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createServerContext")(globalName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[ServerContext[T]]
    
    @scala.inline
    def experimentalUseEffectEvent[T /* <: js.Function */](event: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("experimental_useEffectEvent")(event.asInstanceOf[js.Any]).asInstanceOf[T]
    
    @scala.inline
    def forwardRef[T, P](render: ForwardRefRenderFunction[T, P]): ReactComponentClass[PropsWithoutRef[P] with RefAttributes[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(render.asInstanceOf[js.Any]).asInstanceOf[ReactComponentClass[PropsWithoutRef[P] with RefAttributes[T]]]
    
    @scala.inline
    def isValidElement[P](): /* is react.react.ReactElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")().asInstanceOf[/* is react.react.ReactElement */ Boolean]
    @scala.inline
    def isValidElement[P](`object`: js.Object): /* is react.react.ReactElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is react.react.ReactElement */ Boolean]
    
    @scala.inline
    def `lazy`[T /* <: ReactComponentClass[Any] */](factory: js.Function0[js.Promise[Default[T]]]): ReactComponentClass[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(factory.asInstanceOf[js.Any]).asInstanceOf[ReactComponentClass[T]]
    
    @scala.inline
    def memo[T /* <: ReactComponentClass[Any] */](Component: T): ReactComponentClass[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[ReactComponentClass[T]]
    @scala.inline
    def memo[T /* <: ReactComponentClass[Any] */](
      Component: T,
      propsAreEqual: js.Function2[/* prevProps */ ComponentProps[T], /* nextProps */ ComponentProps[T], Boolean]
    ): ReactComponentClass[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[ReactComponentClass[T]]
    @scala.inline
    def memo[P /* <: js.Object */](Component: ReactComponentClass[P]): ReactComponentClass[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[ReactComponentClass[P]]
    @scala.inline
    def memo[P /* <: js.Object */](
      Component: ReactComponentClass[P],
      propsAreEqual: js.Function2[/* prevProps */ P, /* nextProps */ P, Boolean]
    ): ReactComponentClass[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[ReactComponentClass[P]]
    
    @scala.inline
    def startTransition(scope: TransitionFunction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startTransition")(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def unstableUseCacheRefresh(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_useCacheRefresh")().asInstanceOf[js.Function0[Unit]]
    
    @scala.inline
    def use[T](usable: Usable[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(usable.asInstanceOf[js.Any]).asInstanceOf[T]
    
    // I made 'inputs' required here and in useMemo as there's no point to memoizing without the memoization key
    // useCallback(X) is identical to just using X, useMemo(() => Y) is identical to just using Y.
    /**
      * `useCallback` will return a memoized version of the callback that only changes if one of the `inputs`
      * has changed.
      *
      * @version 16.8.0
      * @see https://react.dev/reference/react/useCallback
      */
    // A specific function type would not trigger implicit any.
    // See https://github.com/DefinitelyTyped/DefinitelyTyped/issues/52873#issuecomment-845806435 for a comparison between `Function` and more specific types.
    // tslint:disable-next-line ban-types
    @scala.inline
    def useCallback[T /* <: js.Function */](callback: T, deps: DependencyList): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useCallback")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
    
    // This will technically work if you give a Consumer<T> or Provider<T> but it's deprecated and warns
    /**
      * Accepts a context object (the value returned from `React.createContext`) and returns the current
      * context value, as given by the nearest context provider for the given context.
      *
      * @version 16.8.0
      * @see https://react.dev/reference/react/useContext
      */
    @scala.inline
    def useContext[T](context: Context[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(context.asInstanceOf[js.Any]).asInstanceOf[T]
    
    /**
      * `useDebugValue` can be used to display a label for custom hooks in React DevTools.
      *
      * NOTE: We don’t recommend adding debug values to every custom hook.
      * It’s most valuable for custom hooks that are part of shared libraries.
      *
      * @version 16.8.0
      * @see https://react.dev/reference/react/useDebugValue
      */
    // the name of the custom hook is itself derived from the function name at runtime:
    // it's just the function name without the "use" prefix.
    @scala.inline
    def useDebugValue[T](value: T): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useDebugValue")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def useDebugValue[T](value: T, format: js.Function1[/* value */ T, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebugValue")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def useDeferredValue[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useDeferredValue")(value.asInstanceOf[js.Any]).asInstanceOf[T]
    
    /**
      * Accepts a function that contains imperative, possibly effectful code.
      *
      * @param effect Imperative function that can return a cleanup function
      * @param deps If present, effect will only activate if the values in the list change.
      *
      * @version 16.8.0
      * @see https://react.dev/reference/react/useEffect
      */
    @scala.inline
    def useEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def useEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def useId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useId")().asInstanceOf[String]
    
    // NOTE: this does not accept strings, but this will have to be fixed by removing strings from type Ref<T>
    /**
      * `useImperativeHandle` customizes the instance value that is exposed to parent components when using
      * `ref`. As always, imperative code using refs should be avoided in most cases.
      *
      * `useImperativeHandle` should be used with `React.forwardRef`.
      *
      * @version 16.8.0
      * @see https://react.dev/reference/react/useImperativeHandle
      */
    @scala.inline
    def useImperativeHandle[T, R /* <: T */](ref: Ref[T], init: js.Function0[R]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def useImperativeHandle[T, R /* <: T */](ref: Ref[T], init: js.Function0[R], deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def useImperativeHandle[T, R /* <: T */](ref: Unit, init: js.Function0[R]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def useImperativeHandle[T, R /* <: T */](ref: Unit, init: js.Function0[R], deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def useInsertionEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useInsertionEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def useInsertionEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useInsertionEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * The signature is identical to `useEffect`, but it fires synchronously after all DOM mutations.
      * Use this to read layout from the DOM and synchronously re-render. Updates scheduled inside
      * `useLayoutEffect` will be flushed synchronously, before the browser has a chance to paint.
      *
      * Prefer the standard `useEffect` when possible to avoid blocking visual updates.
      *
      * If you’re migrating code from a class component, `useLayoutEffect` fires in the same phase as
      * `componentDidMount` and `componentDidUpdate`.
      *
      * @version 16.8.0
      * @see https://react.dev/reference/react/useLayoutEffect
      */
    @scala.inline
    def useLayoutEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def useLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * `useMemo` will only recompute the memoized value when one of the `deps` has changed.
      *
      * @version 16.8.0
      * @see https://react.dev/reference/react/useMemo
      */
    // allow undefined, but don't make it optional as that is very likely a mistake
    @scala.inline
    def useMemo[T](factory: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(factory.asInstanceOf[js.Any]).asInstanceOf[T]
    @scala.inline
    def useMemo[T](factory: js.Function0[T], deps: DependencyList): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(factory.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * An alternative to `useState`.
      *
      * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
      * multiple sub-values. It also lets you optimize performance for components that trigger deep
      * updates because you can pass `dispatch` down instead of callbacks.
      *
      * @version 16.8.0
      * @see https://react.dev/reference/react/useReducer
      */
    // I'm not sure if I keep this 2-ary or if I make it (2,3)-ary; it's currently (2,3)-ary.
    // The Flow types do have an overload for 3-ary invocation with undefined initializer.
    // NOTE: without the ReducerState indirection, TypeScript would reduce S to be the most common
    // supertype between the reducer's return type and the initialState (or the initializer's return type),
    // which would prevent autocompletion from ever working.
    // TODO: double-check if this weird overload logic is necessary. It is possible it's either a bug
    // in older versions, or a regression in newer versions of the typescript completion service.
    @scala.inline
    def useReducer[R /* <: Reducer[Any, Any] */](reducer: R, initialState: ReducerState[R], initializer: Unit): js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]]]
    /**
      * An alternative to `useState`.
      *
      * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
      * multiple sub-values. It also lets you optimize performance for components that trigger deep
      * updates because you can pass `dispatch` down instead of callbacks.
      *
      * @version 16.8.0
      * @see https://react.dev/reference/react/useReducer
      */
    // overload where dispatch could accept 0 arguments.
    @scala.inline
    def useReducer[R /* <: ReducerWithoutAction[Any] */](reducer: R, initializerArg: ReducerStateWithoutAction[R], initializer: Unit): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction]]
    /**
      * An alternative to `useState`.
      *
      * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
      * multiple sub-values. It also lets you optimize performance for components that trigger deep
      * updates because you can pass `dispatch` down instead of callbacks.
      *
      * @version 16.8.0
      * @see https://react.dev/reference/react/useReducer
      */
    // overload where dispatch could accept 0 arguments.
    // overload where "I" may be a subset of ReducerState<R>; used to provide autocompletion.
    // If "I" matches ReducerState<R> exactly then the last overload will allow initializer to be omitted.
    // the last overload effectively behaves as if the identity function (x => x) is the initializer.
    // overload for free "I"; all goes as long as initializer converts it into "ReducerState<R>".
    @scala.inline
    def useReducer[R /* <: ReducerWithoutAction[Any] */, I](
      reducer: R,
      initializerArg: (I with ReducerState[R]) | I,
      initializer: js.Function1[
          (/* arg */ I with ReducerState[R]) | (/* arg */ I), 
          ReducerState[R] | ReducerStateWithoutAction[R]
        ]
    ): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction]]
    
    // convenience overload for potentially undefined initialValue / call with 0 arguments
    // has a default to stop it from defaulting to {} instead
    /**
      * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
      * (`initialValue`). The returned object will persist for the full lifetime of the component.
      *
      * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
      * value around similar to how you’d use instance fields in classes.
      *
      * @version 16.8.0
      * @see https://react.dev/reference/react/useRef
      */
    @scala.inline
    def useRef[T](): MutableRefObject[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[MutableRefObject[js.UndefOr[T]]]
    /**
      * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
      * (`initialValue`). The returned object will persist for the full lifetime of the component.
      *
      * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
      * value around similar to how you’d use instance fields in classes.
      *
      * @version 16.8.0
      * @see https://react.dev/reference/react/useRef
      */
    @scala.inline
    def useRef[T](initialValue: T): MutableRefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[T]]
    
    // convenience overload for refs given as a ref prop as they typically start with a null value
    /**
      * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
      * (`initialValue`). The returned object will persist for the full lifetime of the component.
      *
      * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
      * value around similar to how you’d use instance fields in classes.
      *
      * Usage note: if you need the result of useRef to be directly mutable, include `| null` in the type
      * of the generic argument.
      *
      * @version 16.8.0
      * @see https://react.dev/reference/react/useRef
      */
    @scala.inline
    def useRef_T_ReactRef[T](): ReactRef[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[ReactRef[T]]
    @scala.inline
    def useRef_T_ReactRef[T](initialValue: T): ReactRef[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[ReactRef[T]]
    
    // convenience overload when first argument is omitted
    /**
      * Returns a stateful value, and a function to update it.
      *
      * @version 16.8.0
      * @see https://react.dev/reference/react/useState
      */
    @scala.inline
    def useState[S](): js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")().asInstanceOf[js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]]]
    /**
      * Returns a stateful value, and a function to update it.
      *
      * @version 16.8.0
      * @see https://react.dev/reference/react/useState
      */
    @scala.inline
    def useState[S](initialState: S): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
    @scala.inline
    def useState[S](initialState: js.Function0[S]): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
    
    @scala.inline
    def useSyncExternalStore[Snapshot](
      subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
      getSnapshot: js.Function0[Snapshot]
    ): Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("useSyncExternalStore")(subscribe.asInstanceOf[js.Any], getSnapshot.asInstanceOf[js.Any])).asInstanceOf[Snapshot]
    @scala.inline
    def useSyncExternalStore[Snapshot](
      subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
      getSnapshot: js.Function0[Snapshot],
      getServerSnapshot: js.Function0[Snapshot]
    ): Snapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("useSyncExternalStore")(subscribe.asInstanceOf[js.Any], getSnapshot.asInstanceOf[js.Any], getServerSnapshot.asInstanceOf[js.Any])).asInstanceOf[Snapshot]
    
    @scala.inline
    def useTransition(): js.Tuple2[Boolean, TransitionStartFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")().asInstanceOf[js.Tuple2[Boolean, TransitionStartFunction]]
    
    @JSGlobal("React.version")
    @js.native
    val version: String = js.native
  }
}
