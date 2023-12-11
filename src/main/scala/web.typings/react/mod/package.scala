package web.typings.react

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def Fragment: slinky.core.ReactComponentClass[web.typings.react.anon.Children] = web.typings.react.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Fragment").asInstanceOf[slinky.core.ReactComponentClass[web.typings.react.anon.Children]]
  
  @scala.inline
  def Profiler: slinky.core.ReactComponentClass[web.typings.react.mod.ProfilerProps] = web.typings.react.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Profiler").asInstanceOf[slinky.core.ReactComponentClass[web.typings.react.mod.ProfilerProps]]
  
  @scala.inline
  def StrictMode: slinky.core.ReactComponentClass[web.typings.react.anon.Children] = web.typings.react.mod.^.asInstanceOf[js.Dynamic].selectDynamic("StrictMode").asInstanceOf[slinky.core.ReactComponentClass[web.typings.react.anon.Children]]
  
  @scala.inline
  def Suspense: slinky.core.ReactComponentClass[web.typings.react.mod.SuspenseProps] = web.typings.react.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Suspense").asInstanceOf[slinky.core.ReactComponentClass[web.typings.react.mod.SuspenseProps]]
  
  @scala.inline
  def SuspenseList: slinky.core.ReactComponentClass[web.typings.react.experimentalMod.reactAugmentingMod.SuspenseListProps] = web.typings.react.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SuspenseList").asInstanceOf[slinky.core.ReactComponentClass[web.typings.react.experimentalMod.reactAugmentingMod.SuspenseListProps]]
  
  @scala.inline
  def cache[CachedFunction /* <: js.Function */](fn: CachedFunction): CachedFunction = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cache")(fn.asInstanceOf[js.Any]).asInstanceOf[CachedFunction]
  
  // Custom components
  @scala.inline
  def cloneElement[P](
    element: web.typings.react.mod.FunctionComponentElement[P],
    props: web.typings.std.Partial[P] with web.typings.react.mod.Attributes,
    children: slinky.core.facade.ReactElement*
  ): web.typings.react.mod.FunctionComponentElement[P] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[web.typings.react.mod.FunctionComponentElement[P]]
  @scala.inline
  def cloneElement[P](
    element: web.typings.react.mod.FunctionComponentElement[P],
    props: scala.Unit,
    children: slinky.core.facade.ReactElement*
  ): web.typings.react.mod.FunctionComponentElement[P] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[web.typings.react.mod.FunctionComponentElement[P]]
  @scala.inline
  def cloneElement[P](
    element: slinky.core.facade.ReactElement,
    props: web.typings.std.Partial[P] with web.typings.react.mod.Attributes,
    children: slinky.core.facade.ReactElement*
  ): slinky.core.facade.ReactElement = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[slinky.core.facade.ReactElement]
  @scala.inline
  def cloneElement[P](
    element: slinky.core.facade.ReactElement,
    props: scala.Unit,
    children: slinky.core.facade.ReactElement*
  ): slinky.core.facade.ReactElement = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[slinky.core.facade.ReactElement]
  @scala.inline
  def cloneElement[P, T /* <: slinky.core.ReactComponentClass[P] */](
    element: web.typings.react.mod.CElement[P, T],
    props: web.typings.std.Partial[P] with web.typings.react.mod.ClassAttributes[T],
    children: slinky.core.facade.ReactElement*
  ): web.typings.react.mod.CElement[P, T] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[web.typings.react.mod.CElement[P, T]]
  @scala.inline
  def cloneElement[P, T /* <: slinky.core.ReactComponentClass[P] */](
    element: web.typings.react.mod.CElement[P, T],
    props: scala.Unit,
    children: slinky.core.facade.ReactElement*
  ): web.typings.react.mod.CElement[P, T] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[web.typings.react.mod.CElement[P, T]]
  // ReactHTMLElement, less specific
  @scala.inline
  def cloneElement[P /* <: web.typings.react.mod.HTMLAttributes[T] */, T /* <: org.scalajs.dom.HTMLElement */](
    element: web.typings.react.mod.ReactHTMLElement[T],
    props: P,
    children: slinky.core.facade.ReactElement*
  ): web.typings.react.mod.ReactHTMLElement[T] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[web.typings.react.mod.ReactHTMLElement[T]]
  @scala.inline
  def cloneElement[P /* <: web.typings.react.mod.HTMLAttributes[T] */, T /* <: org.scalajs.dom.HTMLElement */](
    element: web.typings.react.mod.ReactHTMLElement[T],
    props: scala.Unit,
    children: slinky.core.facade.ReactElement*
  ): web.typings.react.mod.ReactHTMLElement[T] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[web.typings.react.mod.ReactHTMLElement[T]]
  // SVGElement
  @scala.inline
  def cloneElement[P /* <: web.typings.react.mod.SVGAttributes[T] */, T /* <: org.scalajs.dom.SVGElement */](
    element: web.typings.react.mod.ReactSVGElement,
    props: P,
    children: slinky.core.facade.ReactElement*
  ): web.typings.react.mod.ReactSVGElement = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[web.typings.react.mod.ReactSVGElement]
  @scala.inline
  def cloneElement[P /* <: web.typings.react.mod.SVGAttributes[T] */, T /* <: org.scalajs.dom.SVGElement */](
    element: web.typings.react.mod.ReactSVGElement,
    props: scala.Unit,
    children: slinky.core.facade.ReactElement*
  ): web.typings.react.mod.ReactSVGElement = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[web.typings.react.mod.ReactSVGElement]
  // DOM Element (has to be the last, because type checking stops at first overload that fits)
  @scala.inline
  def cloneElement[P /* <: web.typings.react.mod.DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](
    element: slinky.core.facade.ReactElement,
    props: web.typings.react.mod.DOMAttributes[T] with P,
    children: slinky.core.facade.ReactElement*
  ): slinky.core.facade.ReactElement = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[slinky.core.facade.ReactElement]
  
  @scala.inline
  def cloneElement_PT[P /* <: web.typings.react.mod.DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](
    element: slinky.core.facade.ReactElement,
    props: scala.Unit,
    children: slinky.core.facade.ReactElement*
  ): slinky.core.facade.ReactElement = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[slinky.core.facade.ReactElement]
  
  // DOM Elements
  // ReactHTMLElement
  @scala.inline
  def cloneElement_PT_DetailedReactHTMLElement[P /* <: web.typings.react.mod.HTMLAttributes[T] */, T /* <: org.scalajs.dom.HTMLElement */](
    element: web.typings.react.mod.DetailedReactHTMLElement[P, T],
    props: P,
    children: slinky.core.facade.ReactElement*
  ): web.typings.react.mod.DetailedReactHTMLElement[P, T] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[web.typings.react.mod.DetailedReactHTMLElement[P, T]]
  @scala.inline
  def cloneElement_PT_DetailedReactHTMLElement[P /* <: web.typings.react.mod.HTMLAttributes[T] */, T /* <: org.scalajs.dom.HTMLElement */](
    element: web.typings.react.mod.DetailedReactHTMLElement[P, T],
    props: scala.Unit,
    children: slinky.core.facade.ReactElement*
  ): web.typings.react.mod.DetailedReactHTMLElement[P, T] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[web.typings.react.mod.DetailedReactHTMLElement[P, T]]
  
  @scala.inline
  def createContext[T](
    // If you thought this should be optional, see
  // https://github.com/DefinitelyTyped/DefinitelyTyped/pull/24509#issuecomment-382213106
  defaultValue: T
  ): web.typings.react.mod.Context[T] = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[web.typings.react.mod.Context[T]]
  
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: web.typings.react.mod.ClassType[P, slinky.core.ReactComponentClass[P], slinky.core.ReactComponentClass[P]],
    props: web.typings.react.mod.ClassAttributes[slinky.core.ReactComponentClass[P]] with P,
    children: slinky.core.facade.ReactElement*
  ): web.typings.react.mod.CElement[P, slinky.core.ReactComponentClass[P]] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[web.typings.react.mod.CElement[P, slinky.core.ReactComponentClass[P]]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: web.typings.react.mod.ClassType[P, slinky.core.ReactComponentClass[P], slinky.core.ReactComponentClass[P]],
    props: scala.Null,
    children: slinky.core.facade.ReactElement*
  ): web.typings.react.mod.CElement[P, slinky.core.ReactComponentClass[P]] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[web.typings.react.mod.CElement[P, slinky.core.ReactComponentClass[P]]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: web.typings.react.mod.ClassType[P, slinky.core.ReactComponentClass[P], slinky.core.ReactComponentClass[P]],
    props: scala.Unit,
    children: slinky.core.facade.ReactElement*
  ): web.typings.react.mod.CElement[P, slinky.core.ReactComponentClass[P]] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[web.typings.react.mod.CElement[P, slinky.core.ReactComponentClass[P]]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: java.lang.String,
    props: web.typings.react.mod.Attributes with P,
    children: slinky.core.facade.ReactElement*
  ): slinky.core.facade.ReactElement = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[slinky.core.facade.ReactElement]
  @scala.inline
  def createElement[P /* <: js.Object */](`type`: java.lang.String, props: scala.Null, children: slinky.core.facade.ReactElement*): slinky.core.facade.ReactElement = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[slinky.core.facade.ReactElement]
  @scala.inline
  def createElement[P /* <: js.Object */](`type`: java.lang.String, props: scala.Unit, children: slinky.core.facade.ReactElement*): slinky.core.facade.ReactElement = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[slinky.core.facade.ReactElement]
  @scala.inline
  def createElement[P /* <: web.typings.react.mod.SVGAttributes[T] */, T /* <: org.scalajs.dom.SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with `web.typings`.react.reactStrings.animate, `web.typings`.react.reactStrings.circle, `web.typings`.react.reactStrings.clipPath */ scala.Any,
    props: web.typings.react.mod.ClassAttributes[T] with P,
    children: slinky.core.facade.ReactElement*
  ): web.typings.react.mod.ReactSVGElement = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[web.typings.react.mod.ReactSVGElement]
  @scala.inline
  def createElement[P /* <: web.typings.react.mod.SVGAttributes[T] */, T /* <: org.scalajs.dom.SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with `web.typings`.react.reactStrings.animate, `web.typings`.react.reactStrings.circle, `web.typings`.react.reactStrings.clipPath */ scala.Any,
    props: scala.Null,
    children: slinky.core.facade.ReactElement*
  ): web.typings.react.mod.ReactSVGElement = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[web.typings.react.mod.ReactSVGElement]
  @scala.inline
  def createElement[P /* <: web.typings.react.mod.SVGAttributes[T] */, T /* <: org.scalajs.dom.SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with `web.typings`.react.reactStrings.animate, `web.typings`.react.reactStrings.circle, `web.typings`.react.reactStrings.clipPath */ scala.Any,
    props: scala.Unit,
    children: slinky.core.facade.ReactElement*
  ): web.typings.react.mod.ReactSVGElement = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[web.typings.react.mod.ReactSVGElement]
  
  @scala.inline
  def createElement_PT[P /* <: web.typings.react.mod.DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](
    `type`: java.lang.String,
    props: web.typings.react.mod.ClassAttributes[T] with P,
    children: slinky.core.facade.ReactElement*
  ): slinky.core.facade.ReactElement = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[slinky.core.facade.ReactElement]
  @scala.inline
  def createElement_PT[P /* <: web.typings.react.mod.DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](`type`: java.lang.String, props: scala.Null, children: slinky.core.facade.ReactElement*): slinky.core.facade.ReactElement = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[slinky.core.facade.ReactElement]
  @scala.inline
  def createElement_PT[P /* <: web.typings.react.mod.DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](`type`: java.lang.String, props: scala.Unit, children: slinky.core.facade.ReactElement*): slinky.core.facade.ReactElement = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[slinky.core.facade.ReactElement]
  
  @scala.inline
  def createElement_PTC_CElement[P /* <: js.Object */, T /* <: slinky.core.ReactComponentClass[P] */, C /* <: slinky.core.ReactComponentClass[P] */](
    `type`: web.typings.react.mod.ClassType[P, T, C],
    props: web.typings.react.mod.ClassAttributes[T] with P,
    children: slinky.core.facade.ReactElement*
  ): web.typings.react.mod.CElement[P, T] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[web.typings.react.mod.CElement[P, T]]
  @scala.inline
  def createElement_PTC_CElement[P /* <: js.Object */, T /* <: slinky.core.ReactComponentClass[P] */, C /* <: slinky.core.ReactComponentClass[P] */](
    `type`: web.typings.react.mod.ClassType[P, T, C],
    props: scala.Null,
    children: slinky.core.facade.ReactElement*
  ): web.typings.react.mod.CElement[P, T] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[web.typings.react.mod.CElement[P, T]]
  @scala.inline
  def createElement_PTC_CElement[P /* <: js.Object */, T /* <: slinky.core.ReactComponentClass[P] */, C /* <: slinky.core.ReactComponentClass[P] */](
    `type`: web.typings.react.mod.ClassType[P, T, C],
    props: scala.Unit,
    children: slinky.core.facade.ReactElement*
  ): web.typings.react.mod.CElement[P, T] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[web.typings.react.mod.CElement[P, T]]
  
  @scala.inline
  def createElement_PT_DetailedReactHTMLElement[P /* <: web.typings.react.mod.HTMLAttributes[T] */, T /* <: org.scalajs.dom.HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118, starting with `web.typings`.react.reactStrings.a_, `web.typings`.react.reactStrings.abbr, `web.typings`.react.reactStrings.address */ scala.Any,
    props: web.typings.react.mod.ClassAttributes[T] with P,
    children: slinky.core.facade.ReactElement*
  ): web.typings.react.mod.DetailedReactHTMLElement[P, T] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[web.typings.react.mod.DetailedReactHTMLElement[P, T]]
  @scala.inline
  def createElement_PT_DetailedReactHTMLElement[P /* <: web.typings.react.mod.HTMLAttributes[T] */, T /* <: org.scalajs.dom.HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118, starting with `web.typings`.react.reactStrings.a_, `web.typings`.react.reactStrings.abbr, `web.typings`.react.reactStrings.address */ scala.Any,
    props: scala.Null,
    children: slinky.core.facade.ReactElement*
  ): web.typings.react.mod.DetailedReactHTMLElement[P, T] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[web.typings.react.mod.DetailedReactHTMLElement[P, T]]
  @scala.inline
  def createElement_PT_DetailedReactHTMLElement[P /* <: web.typings.react.mod.HTMLAttributes[T] */, T /* <: org.scalajs.dom.HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118, starting with `web.typings`.react.reactStrings.a_, `web.typings`.react.reactStrings.abbr, `web.typings`.react.reactStrings.address */ scala.Any,
    props: scala.Unit,
    children: slinky.core.facade.ReactElement*
  ): web.typings.react.mod.DetailedReactHTMLElement[P, T] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[web.typings.react.mod.DetailedReactHTMLElement[P, T]]
  
  // Custom components
  @scala.inline
  def createElement_P_FunctionComponentElement[P /* <: js.Object */](
    `type`: slinky.core.ReactComponentClass[P],
    props: web.typings.react.mod.Attributes with P,
    children: slinky.core.facade.ReactElement*
  ): web.typings.react.mod.FunctionComponentElement[P] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[web.typings.react.mod.FunctionComponentElement[P]]
  @scala.inline
  def createElement_P_FunctionComponentElement[P /* <: js.Object */](
    `type`: slinky.core.ReactComponentClass[P],
    props: scala.Null,
    children: slinky.core.facade.ReactElement*
  ): web.typings.react.mod.FunctionComponentElement[P] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[web.typings.react.mod.FunctionComponentElement[P]]
  @scala.inline
  def createElement_P_FunctionComponentElement[P /* <: js.Object */](
    `type`: slinky.core.ReactComponentClass[P],
    props: scala.Unit,
    children: slinky.core.facade.ReactElement*
  ): web.typings.react.mod.FunctionComponentElement[P] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[web.typings.react.mod.FunctionComponentElement[P]]
  
  @scala.inline
  def createElement_P_ReactElement[P /* <: js.Object */](
    `type`: slinky.core.ReactComponentClass[P],
    props: web.typings.react.mod.Attributes with P,
    children: slinky.core.facade.ReactElement*
  ): slinky.core.facade.ReactElement = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[slinky.core.facade.ReactElement]
  @scala.inline
  def createElement_P_ReactElement[P /* <: js.Object */](
    `type`: slinky.core.ReactComponentClass[P],
    props: scala.Null,
    children: slinky.core.facade.ReactElement*
  ): slinky.core.facade.ReactElement = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[slinky.core.facade.ReactElement]
  @scala.inline
  def createElement_P_ReactElement[P /* <: js.Object */](
    `type`: slinky.core.ReactComponentClass[P],
    props: scala.Unit,
    children: slinky.core.facade.ReactElement*
  ): slinky.core.facade.ReactElement = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[slinky.core.facade.ReactElement]
  
  // DOM Elements
  // TODO: generalize this to everything in `keyof ReactHTML`, not just "input"
  @scala.inline
  def createElement_input(
    `type`: web.typings.react.reactStrings.input,
    props: web.typings.react.mod.InputHTMLAttributes[org.scalajs.dom.HTMLInputElement] with web.typings.react.mod.ClassAttributes[org.scalajs.dom.HTMLInputElement],
    children: slinky.core.facade.ReactElement*
  ): web.typings.react.mod.DetailedReactHTMLElement[
    web.typings.react.mod.InputHTMLAttributes[org.scalajs.dom.HTMLInputElement], 
    org.scalajs.dom.HTMLInputElement
  ] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[web.typings.react.mod.DetailedReactHTMLElement[
    web.typings.react.mod.InputHTMLAttributes[org.scalajs.dom.HTMLInputElement], 
    org.scalajs.dom.HTMLInputElement
  ]]
  @scala.inline
  def createElement_input(
    `type`: web.typings.react.reactStrings.input,
    props: scala.Null,
    children: slinky.core.facade.ReactElement*
  ): web.typings.react.mod.DetailedReactHTMLElement[
    web.typings.react.mod.InputHTMLAttributes[org.scalajs.dom.HTMLInputElement], 
    org.scalajs.dom.HTMLInputElement
  ] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[web.typings.react.mod.DetailedReactHTMLElement[
    web.typings.react.mod.InputHTMLAttributes[org.scalajs.dom.HTMLInputElement], 
    org.scalajs.dom.HTMLInputElement
  ]]
  @scala.inline
  def createElement_input(
    `type`: web.typings.react.reactStrings.input,
    props: scala.Unit,
    children: slinky.core.facade.ReactElement*
  ): web.typings.react.mod.DetailedReactHTMLElement[
    web.typings.react.mod.InputHTMLAttributes[org.scalajs.dom.HTMLInputElement], 
    org.scalajs.dom.HTMLInputElement
  ] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[scala.Seq[js.Any]]) :_*)).asInstanceOf[web.typings.react.mod.DetailedReactHTMLElement[
    web.typings.react.mod.InputHTMLAttributes[org.scalajs.dom.HTMLInputElement], 
    org.scalajs.dom.HTMLInputElement
  ]]
  
  @scala.inline
  def createFactory(
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with `web.typings`.react.reactStrings.animate, `web.typings`.react.reactStrings.circle, `web.typings`.react.reactStrings.clipPath */ scala.Any
  ): web.typings.react.mod.SVGFactory = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[web.typings.react.mod.SVGFactory]
  // Custom components
  @scala.inline
  def createFactory[P](`type`: slinky.core.ReactComponentClass[P]): web.typings.react.mod.FunctionComponentFactory[P] = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[web.typings.react.mod.FunctionComponentFactory[P]]
  @scala.inline
  def createFactory[P /* <: web.typings.react.mod.DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](`type`: java.lang.String): web.typings.react.mod.DOMFactory[P, T] = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[web.typings.react.mod.DOMFactory[P, T]]
  
  @scala.inline
  def createFactory_PTC_CFactory[P, T /* <: slinky.core.ReactComponentClass[P] */, C /* <: slinky.core.ReactComponentClass[P] */](`type`: web.typings.react.mod.ClassType[P, T, C]): web.typings.react.mod.CFactory[P, T] = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[web.typings.react.mod.CFactory[P, T]]
  
  @scala.inline
  def createFactory_P_CFactory[P](
    `type`: web.typings.react.mod.ClassType[P, slinky.core.ReactComponentClass[P], slinky.core.ReactComponentClass[P]]
  ): web.typings.react.mod.CFactory[P, slinky.core.ReactComponentClass[P]] = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[web.typings.react.mod.CFactory[P, slinky.core.ReactComponentClass[P]]]
  
  @scala.inline
  def createFactory_P_Factory[P](`type`: slinky.core.ReactComponentClass[P]): web.typings.react.mod.Factory[P] = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[web.typings.react.mod.Factory[P]]
  
  //
  // Top Level API
  // ----------------------------------------------------------------------
  // DOM Elements
  @scala.inline
  def createFactory_T_HTMLFactory[T /* <: org.scalajs.dom.HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118, starting with `web.typings`.react.reactStrings.a_, `web.typings`.react.reactStrings.abbr, `web.typings`.react.reactStrings.address */ scala.Any
  ): web.typings.react.mod.HTMLFactory[T] = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[web.typings.react.mod.HTMLFactory[T]]
  
  @scala.inline
  def createRef[T](): slinky.core.facade.ReactRef[T] = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createRef")().asInstanceOf[slinky.core.facade.ReactRef[T]]
  
  @scala.inline
  def createServerContext(globalName: java.lang.String, defaultValue: java.lang.String): web.typings.react.canaryMod.reactAugmentingMod.ServerContext[java.lang.String] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerContext")(globalName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[web.typings.react.canaryMod.reactAugmentingMod.ServerContext[java.lang.String]]
  @scala.inline
  def createServerContext(
    globalName: java.lang.String,
    defaultValue: js.Array[web.typings.react.canaryMod.reactAugmentingMod.ServerContextJSONValue]
  ): web.typings.react.canaryMod.reactAugmentingMod.ServerContext[js.Array[web.typings.react.canaryMod.reactAugmentingMod.ServerContextJSONValue]] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerContext")(globalName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[web.typings.react.canaryMod.reactAugmentingMod.ServerContext[js.Array[web.typings.react.canaryMod.reactAugmentingMod.ServerContextJSONValue]]]
  @scala.inline
  def createServerContext(globalName: java.lang.String, defaultValue: scala.Boolean): web.typings.react.canaryMod.reactAugmentingMod.ServerContext[scala.Boolean] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerContext")(globalName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[web.typings.react.canaryMod.reactAugmentingMod.ServerContext[scala.Boolean]]
  @scala.inline
  def createServerContext(globalName: java.lang.String, defaultValue: scala.Double): web.typings.react.canaryMod.reactAugmentingMod.ServerContext[scala.Double] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerContext")(globalName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[web.typings.react.canaryMod.reactAugmentingMod.ServerContext[scala.Double]]
  @scala.inline
  def createServerContext(globalName: java.lang.String, defaultValue: scala.Null): web.typings.react.canaryMod.reactAugmentingMod.ServerContext[scala.Null] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerContext")(globalName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[web.typings.react.canaryMod.reactAugmentingMod.ServerContext[scala.Null]]
  @scala.inline
  def createServerContext[T /* <: org.scalablytyped.runtime.StringDictionary[web.typings.react.canaryMod.reactAugmentingMod.ServerContextJSONValue] */](globalName: java.lang.String, defaultValue: T): web.typings.react.canaryMod.reactAugmentingMod.ServerContext[T] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServerContext")(globalName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[web.typings.react.canaryMod.reactAugmentingMod.ServerContext[T]]
  
  @scala.inline
  def experimentalUseEffectEvent[T /* <: js.Function */](event: T): T = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("experimental_useEffectEvent")(event.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def forwardRef[T, P](render: web.typings.react.mod.ForwardRefRenderFunction[T, P]): slinky.core.ReactComponentClass[
    web.typings.react.mod.PropsWithoutRef[P] with web.typings.react.mod.RefAttributes[T]
  ] = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(render.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[
    web.typings.react.mod.PropsWithoutRef[P] with web.typings.react.mod.RefAttributes[T]
  ]]
  
  @scala.inline
  def isValidElement[P](): /* is react.react.ReactElement */ scala.Boolean = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")().asInstanceOf[/* is react.react.ReactElement */ scala.Boolean]
  @scala.inline
  def isValidElement[P](`object`: js.Object): /* is react.react.ReactElement */ scala.Boolean = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is react.react.ReactElement */ scala.Boolean]
  
  @scala.inline
  def `lazy`[T /* <: slinky.core.ReactComponentClass[scala.Any] */](factory: js.Function0[js.Promise[web.typings.react.anon.Default[T]]]): slinky.core.ReactComponentClass[T] = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(factory.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[T]]
  
  @scala.inline
  def memo[T /* <: slinky.core.ReactComponentClass[scala.Any] */](Component: T): slinky.core.ReactComponentClass[T] = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[T]]
  @scala.inline
  def memo[T /* <: slinky.core.ReactComponentClass[scala.Any] */](
    Component: T,
    propsAreEqual: js.Function2[
      /* prevProps */ web.typings.react.mod.ComponentProps[T], 
      /* nextProps */ web.typings.react.mod.ComponentProps[T], 
      scala.Boolean
    ]
  ): slinky.core.ReactComponentClass[T] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[slinky.core.ReactComponentClass[T]]
  @scala.inline
  def memo[P /* <: js.Object */](Component: slinky.core.ReactComponentClass[P]): slinky.core.ReactComponentClass[P] = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[P]]
  @scala.inline
  def memo[P /* <: js.Object */](
    Component: slinky.core.ReactComponentClass[P],
    propsAreEqual: js.Function2[/* prevProps */ P, /* nextProps */ P, scala.Boolean]
  ): slinky.core.ReactComponentClass[P] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[slinky.core.ReactComponentClass[P]]
  
  @scala.inline
  def startTransition(scope: web.typings.react.mod.TransitionFunction): scala.Unit = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("startTransition")(scope.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def unstableUseCacheRefresh(): js.Function0[scala.Unit] = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unstable_useCacheRefresh")().asInstanceOf[js.Function0[scala.Unit]]
  
  @scala.inline
  def use[T](usable: web.typings.react.canaryMod.reactAugmentingMod.Usable[T]): T = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("use")(usable.asInstanceOf[js.Any]).asInstanceOf[T]
  
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
  def useCallback[T /* <: js.Function */](callback: T, deps: web.typings.react.mod.DependencyList): T = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useCallback")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
  
  // This will technically work if you give a Consumer<T> or Provider<T> but it's deprecated and warns
  /**
    * Accepts a context object (the value returned from `React.createContext`) and returns the current
    * context value, as given by the nearest context provider for the given context.
    *
    * @version 16.8.0
    * @see https://react.dev/reference/react/useContext
    */
  @scala.inline
  def useContext[T](context: web.typings.react.mod.Context[T]): T = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(context.asInstanceOf[js.Any]).asInstanceOf[T]
  
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
  def useDebugValue[T](value: T): scala.Unit = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useDebugValue")(value.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def useDebugValue[T](value: T, format: js.Function1[/* value */ T, scala.Any]): scala.Unit = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useDebugValue")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def useDeferredValue[T](value: T): T = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useDeferredValue")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
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
  def useEffect(effect: web.typings.react.mod.EffectCallback): scala.Unit = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def useEffect(effect: web.typings.react.mod.EffectCallback, deps: web.typings.react.mod.DependencyList): scala.Unit = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def useId(): java.lang.String = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useId")().asInstanceOf[java.lang.String]
  
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
  def useImperativeHandle[T, R /* <: T */](ref: web.typings.react.mod.Ref[T], init: js.Function0[R]): scala.Unit = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def useImperativeHandle[T, R /* <: T */](
    ref: web.typings.react.mod.Ref[T],
    init: js.Function0[R],
    deps: web.typings.react.mod.DependencyList
  ): scala.Unit = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def useImperativeHandle[T, R /* <: T */](ref: scala.Unit, init: js.Function0[R]): scala.Unit = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def useImperativeHandle[T, R /* <: T */](ref: scala.Unit, init: js.Function0[R], deps: web.typings.react.mod.DependencyList): scala.Unit = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def useInsertionEffect(effect: web.typings.react.mod.EffectCallback): scala.Unit = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useInsertionEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def useInsertionEffect(effect: web.typings.react.mod.EffectCallback, deps: web.typings.react.mod.DependencyList): scala.Unit = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useInsertionEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
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
  def useLayoutEffect(effect: web.typings.react.mod.EffectCallback): scala.Unit = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def useLayoutEffect(effect: web.typings.react.mod.EffectCallback, deps: web.typings.react.mod.DependencyList): scala.Unit = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * `useMemo` will only recompute the memoized value when one of the `deps` has changed.
    *
    * @version 16.8.0
    * @see https://react.dev/reference/react/useMemo
    */
  // allow undefined, but don't make it optional as that is very likely a mistake
  @scala.inline
  def useMemo[T](factory: js.Function0[T]): T = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(factory.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def useMemo[T](factory: js.Function0[T], deps: web.typings.react.mod.DependencyList): T = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(factory.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
  
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
  def useReducer[R /* <: web.typings.react.mod.Reducer[scala.Any, scala.Any] */](reducer: R, initialState: web.typings.react.mod.ReducerState[R], initializer: scala.Unit): js.Tuple2[
    web.typings.react.mod.ReducerState[R], 
    web.typings.react.mod.Dispatch[web.typings.react.mod.ReducerAction[R]]
  ] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    web.typings.react.mod.ReducerState[R], 
    web.typings.react.mod.Dispatch[web.typings.react.mod.ReducerAction[R]]
  ]]
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
  def useReducer[R /* <: web.typings.react.mod.ReducerWithoutAction[scala.Any] */](
    reducer: R,
    initializerArg: web.typings.react.mod.ReducerStateWithoutAction[R],
    initializer: scala.Unit
  ): js.Tuple2[
    web.typings.react.mod.ReducerStateWithoutAction[R], 
    web.typings.react.mod.DispatchWithoutAction
  ] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    web.typings.react.mod.ReducerStateWithoutAction[R], 
    web.typings.react.mod.DispatchWithoutAction
  ]]
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
  def useReducer[R /* <: web.typings.react.mod.ReducerWithoutAction[scala.Any] */, I](
    reducer: R,
    initializerArg: (I with web.typings.react.mod.ReducerState[R]) | I,
    initializer: js.Function1[
      (/* arg */ I with web.typings.react.mod.ReducerState[R]) | (/* arg */ I), 
      web.typings.react.mod.ReducerState[R] | web.typings.react.mod.ReducerStateWithoutAction[R]
    ]
  ): js.Tuple2[
    web.typings.react.mod.ReducerStateWithoutAction[R], 
    web.typings.react.mod.DispatchWithoutAction
  ] = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    web.typings.react.mod.ReducerStateWithoutAction[R], 
    web.typings.react.mod.DispatchWithoutAction
  ]]
  
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
  def useRef[T](): web.typings.react.mod.MutableRefObject[js.UndefOr[T]] = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[web.typings.react.mod.MutableRefObject[js.UndefOr[T]]]
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
  def useRef[T](initialValue: T): web.typings.react.mod.MutableRefObject[T] = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[web.typings.react.mod.MutableRefObject[T]]
  
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
  def useRef_T_ReactRef[T](): slinky.core.facade.ReactRef[T] = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[slinky.core.facade.ReactRef[T]]
  @scala.inline
  def useRef_T_ReactRef[T](initialValue: T): slinky.core.facade.ReactRef[T] = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[slinky.core.facade.ReactRef[T]]
  
  // convenience overload when first argument is omitted
  /**
    * Returns a stateful value, and a function to update it.
    *
    * @version 16.8.0
    * @see https://react.dev/reference/react/useState
    */
  @scala.inline
  def useState[S](): js.Tuple2[
    js.UndefOr[S], 
    web.typings.react.mod.Dispatch[web.typings.react.mod.SetStateAction[js.UndefOr[S]]]
  ] = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useState")().asInstanceOf[js.Tuple2[
    js.UndefOr[S], 
    web.typings.react.mod.Dispatch[web.typings.react.mod.SetStateAction[js.UndefOr[S]]]
  ]]
  /**
    * Returns a stateful value, and a function to update it.
    *
    * @version 16.8.0
    * @see https://react.dev/reference/react/useState
    */
  @scala.inline
  def useState[S](initialState: S): js.Tuple2[S, web.typings.react.mod.Dispatch[web.typings.react.mod.SetStateAction[S]]] = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, web.typings.react.mod.Dispatch[web.typings.react.mod.SetStateAction[S]]]]
  @scala.inline
  def useState[S](initialState: js.Function0[S]): js.Tuple2[S, web.typings.react.mod.Dispatch[web.typings.react.mod.SetStateAction[S]]] = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, web.typings.react.mod.Dispatch[web.typings.react.mod.SetStateAction[S]]]]
  
  @scala.inline
  def useSyncExternalStore[Snapshot](
    subscribe: js.Function1[/* onStoreChange */ js.Function0[scala.Unit], js.Function0[scala.Unit]],
    getSnapshot: js.Function0[Snapshot]
  ): Snapshot = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useSyncExternalStore")(subscribe.asInstanceOf[js.Any], getSnapshot.asInstanceOf[js.Any])).asInstanceOf[Snapshot]
  @scala.inline
  def useSyncExternalStore[Snapshot](
    subscribe: js.Function1[/* onStoreChange */ js.Function0[scala.Unit], js.Function0[scala.Unit]],
    getSnapshot: js.Function0[Snapshot],
    getServerSnapshot: js.Function0[Snapshot]
  ): Snapshot = (web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useSyncExternalStore")(subscribe.asInstanceOf[js.Any], getSnapshot.asInstanceOf[js.Any], getServerSnapshot.asInstanceOf[js.Any])).asInstanceOf[Snapshot]
  
  @scala.inline
  def useTransition(): js.Tuple2[scala.Boolean, web.typings.react.mod.TransitionStartFunction] = web.typings.react.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")().asInstanceOf[js.Tuple2[scala.Boolean, web.typings.react.mod.TransitionStartFunction]]
  
  @scala.inline
  def version: java.lang.String = web.typings.react.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
  
  type AnimationEventHandler[T] = web.typings.react.mod.EventHandler[slinky.web.SyntheticAnimationEvent[T]]
  
  // All the WAI-ARIA 1.1 role attribute values from https://www.w3.org/TR/wai-aria-1.1/#role_definitions
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.react.reactStrings.alert
    - `web.typings`.react.reactStrings.alertdialog
    - `web.typings`.react.reactStrings.application
    - `web.typings`.react.reactStrings.article
    - `web.typings`.react.reactStrings.banner
    - `web.typings`.react.reactStrings.button
    - `web.typings`.react.reactStrings.cell
    - `web.typings`.react.reactStrings.checkbox
    - `web.typings`.react.reactStrings.columnheader
    - `web.typings`.react.reactStrings.combobox
    - `web.typings`.react.reactStrings.complementary
    - `web.typings`.react.reactStrings.contentinfo
    - `web.typings`.react.reactStrings.definition
    - `web.typings`.react.reactStrings.dialog
    - `web.typings`.react.reactStrings.directory
    - `web.typings`.react.reactStrings.document
    - `web.typings`.react.reactStrings.feed
    - `web.typings`.react.reactStrings.figure
    - `web.typings`.react.reactStrings.form
    - `web.typings`.react.reactStrings.grid
    - `web.typings`.react.reactStrings.gridcell
    - `web.typings`.react.reactStrings.group
    - `web.typings`.react.reactStrings.heading
    - `web.typings`.react.reactStrings.img
    - `web.typings`.react.reactStrings.link
    - `web.typings`.react.reactStrings.list
    - `web.typings`.react.reactStrings.listbox
    - `web.typings`.react.reactStrings.listitem
    - `web.typings`.react.reactStrings.log
    - `web.typings`.react.reactStrings.main
    - `web.typings`.react.reactStrings.marquee
    - `web.typings`.react.reactStrings.math
    - `web.typings`.react.reactStrings.menu
    - `web.typings`.react.reactStrings.menubar
    - `web.typings`.react.reactStrings.menuitem
    - `web.typings`.react.reactStrings.menuitemcheckbox
    - `web.typings`.react.reactStrings.menuitemradio
    - `web.typings`.react.reactStrings.navigation
    - `web.typings`.react.reactStrings.none
    - `web.typings`.react.reactStrings.note
    - `web.typings`.react.reactStrings.option
    - `web.typings`.react.reactStrings.presentation
    - `web.typings`.react.reactStrings.progressbar
    - `web.typings`.react.reactStrings.radio
    - `web.typings`.react.reactStrings.radiogroup
    - `web.typings`.react.reactStrings.region
    - `web.typings`.react.reactStrings.row
    - `web.typings`.react.reactStrings.rowgroup
    - `web.typings`.react.reactStrings.rowheader
    - `web.typings`.react.reactStrings.scrollbar
    - `web.typings`.react.reactStrings.search
    - `web.typings`.react.reactStrings.searchbox
    - `web.typings`.react.reactStrings.separator
    - `web.typings`.react.reactStrings.slider
    - `web.typings`.react.reactStrings.spinbutton
    - `web.typings`.react.reactStrings.status
    - `web.typings`.react.reactStrings.switch
    - `web.typings`.react.reactStrings.tab
    - `web.typings`.react.reactStrings.table
    - `web.typings`.react.reactStrings.tablist
    - `web.typings`.react.reactStrings.tabpanel
    - `web.typings`.react.reactStrings.term
    - `web.typings`.react.reactStrings.textbox
    - `web.typings`.react.reactStrings.timer
    - `web.typings`.react.reactStrings.toolbar
    - `web.typings`.react.reactStrings.tooltip
    - `web.typings`.react.reactStrings.tree
    - `web.typings`.react.reactStrings.treegrid
    - `web.typings`.react.reactStrings.treeitem
    - java.lang.String
  */
  type AriaRole = web.typings.react.mod._AriaRole | java.lang.String
  
  type AudioHTMLAttributes[T] = web.typings.react.mod.MediaHTMLAttributes[T]
  
  type Booleanish = scala.Boolean
  
  type CElement[P, T /* <: slinky.core.ReactComponentClass[P] */] = web.typings.react.mod.ComponentElement[P, T]
  
  type CFactory[P, T /* <: slinky.core.ReactComponentClass[P] */] = web.typings.react.mod.ComponentFactory[P, T]
  
  type ChangeEventHandler[T] = web.typings.react.mod.EventHandler[web.typings.react.mod.ChangeEvent[T]]
  
  /**
    * We use an intersection type to infer multiple type parameters from
    * a single argument, which is useful for many top-level API defs.
    * See https://github.com/Microsoft/TypeScript/issues/7234 for more info.
    */
  type ClassType[P, T /* <: slinky.core.ReactComponentClass[P] */, C /* <: slinky.core.ReactComponentClass[P] */] = C with (org.scalablytyped.runtime.Instantiable2[/* props */ P, /* context */ js.UndefOr[scala.Any], T])
  
  type ClassicElement[P] = web.typings.react.mod.CElement[P, slinky.core.ReactComponentClass[P]]
  
  type ClassicFactory[P] = web.typings.react.mod.CFactory[P, slinky.core.ReactComponentClass[P]]
  
  type ClipboardEventHandler[T] = web.typings.react.mod.EventHandler[slinky.web.SyntheticClipboardEvent[T]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends new (props : infer P): react.react.Component<any, any, any> ? react.react.PropsWithoutRef<P> & react.react.RefAttributes<std.InstanceType<T>> : react.react.PropsWithRef<react.react.ComponentProps<T>>
    }}}
    */
  type ComponentPropsWithRef[T /* <: slinky.core.facade.ReactElement */] = web.typings.react.mod.ComponentProps[T]
  
  type ComponentPropsWithoutRef[T /* <: slinky.core.facade.ReactElement */] = web.typings.react.mod.PropsWithoutRef[web.typings.react.mod.ComponentProps[T]]
  
  type ComponentState = scala.Any
  
  type ComponentType[P] = slinky.core.ReactComponentClass[P]
  
  type CompositionEventHandler[T] = web.typings.react.mod.EventHandler[slinky.web.SyntheticCompositionEvent[T]]
  
  type Consumer[T] = slinky.core.ReactComponentClass[web.typings.react.mod.ConsumerProps[T]]
  
  // Any prop that has a default prop becomes optional, but its type is unchanged
  // Undeclared default props are augmented into the resulting allowable attributes
  // If declared props have indexed properties, ignore default props entirely as keyof gets widened
  // Wrap in an outer-level conditional type to allow distribution over props that are unions
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    P extends any ? string extends keyof P ? P : std.Pick<P, std.Exclude<keyof P, keyof D>> & react.react.InexactPartial<std.Pick<P, std.Extract<keyof P, keyof D>>> & react.react.InexactPartial<std.Pick<D, std.Exclude<keyof D, keyof P>>> : never
    }}}
    */
  type Defaultize[P, D] = P
  
  type DependencyList = js.Array[scala.Any]
  
  // Destructors are only allowed to return void.
  type Destructor = js.Function0[scala.Unit | web.typings.react.anon.UNDEFINEDVOIDONLY]
  
  type DetailedHTMLProps[E /* <: web.typings.react.mod.HTMLAttributes[T] */, T] = web.typings.react.mod.ClassAttributes[T] with E
  
  // this technically does accept a second argument, but it's already under a deprecation warning
  // and it's not even released so probably better to not define it.
  type Dispatch[A] = js.Function1[/* value */ A, scala.Unit]
  
  // Since action _can_ be undefined, dispatch may be called without any parameters.
  type DispatchWithoutAction = js.Function0[scala.Unit]
  
  type DragEventHandler[T] = web.typings.react.mod.EventHandler[web.typings.react.mod.DragEvent[T]]
  
  // NOTE: callbacks are _only_ allowed to return either void, or a destructor.
  type EffectCallback = js.Function0[scala.Unit | web.typings.react.mod.Destructor]
  
  //
  // React Elements
  // ----------------------------------------------------------------------
  type ElementType[P] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof react.react.JSX.IntrinsicElements ]: P extends react.react.JSX.IntrinsicElements[K]? K : never}[keyof react.react.JSX.IntrinsicElements] */ js.Any) | slinky.core.ReactComponentClass[P]
  
  //
  // Event Handler Types
  // ----------------------------------------------------------------------
  type EventHandler[E /* <: slinky.core.SyntheticEvent[org.scalajs.dom.Event, scala.Any] */] = js.Function1[/* event */ E, scala.Unit]
  
  type ExactlyAnyPropertyKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: react.react.IsExactlyAny<T[K]> extends true? K : never}[keyof T] */ js.Any
  
  //
  // Class Interfaces
  // ----------------------------------------------------------------------
  type FC[P] = slinky.core.ReactComponentClass[P]
  
  type FocusEventHandler[T] = web.typings.react.mod.EventHandler[slinky.web.SyntheticFocusEvent[T]]
  
  type FormEvent[T] = slinky.core.SyntheticEvent[org.scalajs.dom.Event, T]
  
  type FormEventHandler[T] = web.typings.react.mod.EventHandler[
    slinky.core.SyntheticEvent[org.scalajs.dom.EventTarget with T, org.scalajs.dom.Event]
  ]
  
  type ForwardedRef[T] = (js.Function1[/* instance */ T | scala.Null, scala.Unit]) | (web.typings.react.mod.MutableRefObject[T | scala.Null]) | scala.Null
  
  type GetDerivedStateFromError[P, S] = /**
    * This lifecycle is invoked after an error has been thrown by a descendant component.
    * It receives the error that was thrown as a parameter and should return a value to update state.
    *
    * Note: its presence prevents any of the deprecated lifecycle methods from being invoked
    */
  js.Function1[/* error */ scala.Any, web.typings.std.Partial[S] | scala.Null]
  
  type GetDerivedStateFromProps[P, S] = /**
    * Returns an update to a component's state based on its new props and old state.
    *
    * Note: its presence prevents any of the deprecated lifecycle methods from being invoked
    */
  js.Function2[/* nextProps */ P, /* prevState */ S, web.typings.std.Partial[S] | scala.Null]
  
  type GlobalJSXElement = slinky.core.facade.ReactElement
  
  type GlobalJSXElementAttributesProperty = web.typings.react.mod.global.JSX.ElementAttributesProperty
  
  type GlobalJSXElementChildrenAttribute = web.typings.react.mod.global.JSX.ElementChildrenAttribute
  
  type GlobalJSXElementClass = web.typings.react.mod.global.JSX.ElementClass
  
  // React.JSX needs to point to global.JSX to keep global module augmentations intact.
  // But we can't access global.JSX so we need to create these aliases instead.
  // Once the global JSX namespace will be removed we replace React.JSX with the contents of global.JSX
  type GlobalJSXElementType = web.typings.react.mod.global.JSX.ElementType
  
  type GlobalJSXIntrinsicAttributes = web.typings.react.mod.global.JSX.IntrinsicAttributes
  
  type GlobalJSXIntrinsicClassAttributes[T] = web.typings.react.mod.global.JSX.IntrinsicClassAttributes[T]
  
  type GlobalJSXIntrinsicElements = web.typings.react.mod.global.JSX.IntrinsicElements
  
  type GlobalJSXLibraryManagedAttributes[C, P] = web.typings.react.mod.global.JSX.LibraryManagedAttributes[C, P]
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.react.reactStrings._self
    - `web.typings`.react.reactStrings._blank
    - `web.typings`.react.reactStrings._parent
    - `web.typings`.react.reactStrings._top
    - java.lang.String
  */
  type HTMLAttributeAnchorTarget = web.typings.react.mod._HTMLAttributeAnchorTarget | java.lang.String
  
  type HTMLFactory[T /* <: org.scalajs.dom.HTMLElement */] = web.typings.react.mod.DetailedHTMLFactory[web.typings.react.mod.AllHTMLAttributes[T], T]
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.react.reactStrings.button
    - `web.typings`.react.reactStrings.checkbox
    - `web.typings`.react.reactStrings.color
    - `web.typings`.react.reactStrings.date
    - `web.typings`.react.reactStrings.`datetime-local`
    - `web.typings`.react.reactStrings.email
    - `web.typings`.react.reactStrings.file
    - `web.typings`.react.reactStrings.hidden
    - `web.typings`.react.reactStrings.image
    - `web.typings`.react.reactStrings.month
    - `web.typings`.react.reactStrings.number
    - `web.typings`.react.reactStrings.password
    - `web.typings`.react.reactStrings.radio
    - `web.typings`.react.reactStrings.range
    - `web.typings`.react.reactStrings.reset
    - `web.typings`.react.reactStrings.search
    - `web.typings`.react.reactStrings.submit
    - `web.typings`.react.reactStrings.tel
    - `web.typings`.react.reactStrings.text
    - `web.typings`.react.reactStrings.time
    - `web.typings`.react.reactStrings.url
    - `web.typings`.react.reactStrings.week
    - java.lang.String
  */
  type HTMLInputTypeAttribute = web.typings.react.mod._HTMLInputTypeAttribute | java.lang.String
  
  // naked 'any' type in a conditional type will short circuit and union both the then/else branches
  // so boolean is only resolved for T = any
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    boolean extends T extends never ? true : false ? true : false
    }}}
    */
  type IsExactlyAny[T] = web.typings.react.reactBooleans.`true`
  
  type JSXElementConstructor[P] = (js.Function2[
    /* props */ P, 
    /* deprecatedLegacyContext */ js.UndefOr[scala.Any], 
    slinky.core.facade.ReactElement
  ]) | (org.scalablytyped.runtime.Instantiable1[/* props */ P, slinky.core.ReactComponentClass[scala.Any]])
  
  type Key = java.lang.String | scala.Double
  
  type KeyboardEventHandler[T] = web.typings.react.mod.EventHandler[slinky.web.SyntheticKeyboardEvent[T]]
  
  type LegacyRef[T] = java.lang.String | web.typings.react.mod.Ref[T]
  
  // Try to resolve ill-defined props like for JS users: props can be any, or sometimes objects with properties of type any
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    // Distribute over P in case it is a union type
  P extends any ? react.react.IsExactlyAny<P> extends true ? T : // If declared props have indexed properties, ignore inferred props entirely as keyof gets widened
  string extends keyof P ? P : std.Pick<P, react.react.NotExactlyAnyPropertyKeys<P>> & std.Pick<T, std.Exclude<keyof T, react.react.NotExactlyAnyPropertyKeys<P>>> & std.Pick<P, std.Exclude<keyof P, keyof T>> : never
    }}}
    */
  type MergePropTypes[P, T] = T
  
  type MouseEventHandler[T] = web.typings.react.mod.EventHandler[slinky.web.SyntheticMouseEvent[T]]
  
  type NativeAnimationEvent = org.scalajs.dom.AnimationEvent
  
  type NativeClipboardEvent = org.scalajs.dom.ClipboardEvent
  
  type NativeCompositionEvent = org.scalajs.dom.CompositionEvent
  
  type NativeDragEvent = org.scalajs.dom.DragEvent
  
  type NativeFocusEvent = org.scalajs.dom.FocusEvent
  
  type NativeKeyboardEvent = org.scalajs.dom.KeyboardEvent
  
  type NativeMouseEvent = org.scalajs.dom.MouseEvent
  
  type NativePointerEvent = org.scalajs.dom.PointerEvent
  
  type NativeTouchEvent = org.scalajs.dom.TouchEvent
  
  type NativeTransitionEvent = org.scalajs.dom.TransitionEvent
  
  type NativeUIEvent = org.scalajs.dom.UIEvent
  
  type NativeWheelEvent = org.scalajs.dom.WheelEvent
  
  type NotExactlyAnyPropertyKeys[T] = web.typings.std.Exclude[/* keyof T */ java.lang.String, web.typings.react.mod.ExactlyAnyPropertyKeys[T]]
  
  type PointerEventHandler[T] = web.typings.react.mod.EventHandler[slinky.web.SyntheticPointerEvent[T]]
  
  /**
    * {@link https://react.dev/reference/react/Profiler#onrender-callback Profiler API}
    */
  type ProfilerOnRenderCallback = js.Function7[
    /* id */ java.lang.String, 
    /* phase */ web.typings.react.reactStrings.mount | web.typings.react.reactStrings.update, 
    /* actualDuration */ scala.Double, 
    /* baseDuration */ scala.Double, 
    /* startTime */ scala.Double, 
    /* commitTime */ scala.Double, 
    /* interactions */ web.typings.std.Set[web.typings.scheduler.tracingMod.Interaction], 
    scala.Unit
  ]
  
  // Need an interface to not cause ReactNode to be a self-referential type.
  type PromiseLikeOfReactNode = web.typings.std.PromiseLike[slinky.core.facade.ReactElement]
  
  type PropsWithChildren[P] = P with web.typings.react.anon.Children
  
  /** Ensures that the props do not include string ref, which cannot be forwarded */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    'ref' extends keyof P ? P extends {  ref :infer R | undefined} ? string extends R ? react.react.PropsWithoutRef<P> & {  ref :std.Exclude<R, string> | undefined} : P : P : P
    }}}
    */
  type PropsWithRef[P] = P
  
  /** Ensures that the props do not include ref at all */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    // Omit would not be sufficient for this. We'd like to avoid unnecessary mapping and need a distributive conditional to support unions.
  // see: https://www.typescriptlang.org/docs/handbook/2/conditional-types.html#distributive-conditional-types
  // https://github.com/Microsoft/TypeScript/issues/28339
  P extends any ? 'ref' extends keyof P ? std.Omit<P, 'ref'> : P : P
    }}}
    */
  type PropsWithoutRef[P] = P
  
  // NOTE: only the Context object itself can get a displayName
  // https://github.com/facebook/react-devtools/blob/e0b854e4c/backend/attachRendererFiber.js#L310-L325
  type Provider[T] = slinky.core.ReactComponentClass[web.typings.react.mod.ProviderProps[T]]
  
  /**
    * @deprecated - This type is not relevant when using React. Inline the type instead to make the intent clear.
    */
  type ReactChild = slinky.core.facade.ReactElement | java.lang.String | scala.Double
  
  type ReactComponentElement[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178, starting with `web.typings`.react.reactStrings.a_, `web.typings`.react.reactStrings.abbr, `web.typings`.react.reactStrings.address */ scala.Any */, P] = slinky.core.facade.ReactElement
  
  type ReactEventHandler[T] = web.typings.react.mod.EventHandler[slinky.core.SyntheticEvent[org.scalajs.dom.Event, T]]
  
  /**
    * @deprecated - This type is not relevant when using React. Inline the type instead to make the intent clear.
    */
  type ReactFragment = js.Iterable[slinky.core.facade.ReactElement]
  
  // ReactHTML for ReactHTMLElement
  type ReactHTMLElement[T /* <: org.scalajs.dom.HTMLElement */] = web.typings.react.mod.DetailedReactHTMLElement[web.typings.react.mod.AllHTMLAttributes[T], T]
  
  //
  // Component API
  // ----------------------------------------------------------------------
  type ReactInstance = slinky.core.ReactComponentClass[scala.Any] | org.scalajs.dom.Element
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    C extends {  propTypes :infer T,   defaultProps :infer D} ? react.react.Defaultize<react.react.MergePropTypes<P, prop-types.prop-types.InferProps<T>>, D> : C extends {  propTypes :infer T} ? react.react.MergePropTypes<P, prop-types.prop-types.InferProps<T>> : C extends {  defaultProps :infer D} ? react.react.Defaultize<P, D> : P
    }}}
    */
  type ReactManagedAttributes[C, P] = P
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ReactNode = react.react.ReactElement | string | number | std.Iterable<react.react.ReactNode> | react.react.ReactPortal | boolean | undefined | react.react/experimental.react.PromiseLikeOfReactNode
  }}}
  to avoid circular code involving: 
  - react.react.<global>.JSX.ElementType
  - react.react.GlobalJSXElementType
  - react.react.JSX.ElementType
  - react.react.JSXElementConstructor
  - react.react.PromiseLikeOfReactNode
  - react.react.ReactFragment
  - react.react.ReactNode
  */
  /* Rewritten from type alias, can be one of: 
    - slinky.core.facade.ReactElement
    - java.lang.String
    - scala.Double
    - js.Iterable[scala.Any]
    - `web.typings`.react.mod.ReactPortal
    - scala.Boolean
    - scala.Unit
    - `web.typings`.react.experimentalMod.reactAugmentingMod.PromiseLikeOfReactNode
  */
  type ReactNode = js.UndefOr[
    web.typings.react.mod._ReactNode | js.Iterable[scala.Any] | slinky.core.facade.ReactElement | java.lang.String | scala.Double | scala.Boolean
  ]
  
  /**
    * @deprecated - This type is not relevant when using React. Inline the type instead to make the intent clear.
    */
  type ReactText = java.lang.String | scala.Double
  
  // Unlike redux, the actions _can_ be anything
  type Reducer[S, A] = js.Function2[/* prevState */ S, /* action */ A, S]
  
  // If useReducer accepts a reducer without action, dispatch may be called without any parameters.
  type ReducerWithoutAction[S] = js.Function1[/* prevState */ S, S]
  
  type Ref[T] = web.typings.react.mod.RefCallback[T] | slinky.core.facade.ReactRef[T] | scala.Null
  
  // Bivariance hack for consistent unsoundness with RefObject
  type RefCallback[T] = js.Function1[/* instance */ T | scala.Null, scala.Unit]
  
  type Requireable[T] = web.typings.propTypes.mod.Requireable[T]
  
  /**
    * @deprecated Please use `FunctionComponentFactory`
    */
  type SFCFactory[P] = web.typings.react.mod.FunctionComponentFactory[P]
  
  type SVGLineElementAttributes[T] = web.typings.react.mod.SVGProps[T]
  
  type SVGTextElementAttributes[T] = web.typings.react.mod.SVGProps[T]
  
  type ServerContextJSONArray = js.Array[web.typings.react.canaryMod.reactAugmentingMod.ServerContextJSONValue]
  
  type ServerContextJSONValue = java.lang.String | scala.Boolean | scala.Double | scala.Null | web.typings.react.canaryMod.reactAugmentingMod.ServerContextJSONArray | org.scalablytyped.runtime.StringDictionary[web.typings.react.canaryMod.reactAugmentingMod.ServerContextJSONValue]
  
  //
  // React Hooks
  // ----------------------------------------------------------------------
  // based on the code in https://github.com/facebook/react/pull/13968
  // Unlike the class component setState, the updates are not allowed to be partial
  type SetStateAction[S] = S | (js.Function1[/* prevState */ S, S])
  
  /**
    * currentTarget - a reference to the element on which the event listener is registered.
    *
    * target - a reference to the element from which the event was originally dispatched.
    * This might be a child element to the element on which the event listener is registered.
    * If you thought this should be `EventTarget & T`, see https://github.com/DefinitelyTyped/DefinitelyTyped/issues/11508#issuecomment-256045682
    */
  type SyntheticEvent[T, E] = slinky.core.SyntheticEvent[org.scalajs.dom.EventTarget with T, E]
  
  type TouchEventHandler[T] = web.typings.react.mod.EventHandler[slinky.web.SyntheticTouchEvent[T]]
  
  type TransitionEventHandler[T] = web.typings.react.mod.EventHandler[slinky.web.SyntheticTransitionEvent[T]]
  
  type TransitionFunction = js.Function0[web.typings.react.mod.VoidOrUndefinedOnly]
  
  type UIEventHandler[T] = web.typings.react.mod.EventHandler[slinky.web.SyntheticUIEvent[T]]
  
  /**
    * @deprecated - Equivalent with `React.FC`.
    */
  type VFC[P] = web.typings.react.mod.VoidFunctionComponent[P]
  
  type ValidationMap[T] = web.typings.propTypes.mod.ValidationMap[T]
  
  //
  // React.PropTypes
  // ----------------------------------------------------------------------
  type Validator[T] = web.typings.propTypes.mod.Validator[T]
  
  type VoidOrUndefinedOnly = scala.Unit | web.typings.react.anon.UNDEFINEDVOIDONLY
  
  type WheelEventHandler[T] = web.typings.react.mod.EventHandler[slinky.web.SyntheticWheelEvent[T]]
}
