package example

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait IndexRouteObject
  extends StObject
    with RouteObject {

  var Component: js.UndefOr[ReactComponentClass[js.Object] | Null] = js.native

  var ErrorBoundary: js.UndefOr[ReactComponentClass[js.Object] | Null] = js.native

  var HydrateFallback: js.UndefOr[ReactComponentClass[js.Object] | Null] = js.native

//  var action: js.UndefOr[ActionFunction[Any]] = js.native

  var caseSensitive: js.UndefOr[Boolean] = js.native

  var children: Unit = js.native

  var element: js.UndefOr[ReactElement | Null] = js.native

  var errorElement: js.UndefOr[ReactElement | Null] = js.native

  var handle: js.UndefOr[Any] = js.native

  var hasErrorBoundary: js.UndefOr[Boolean] = js.native

  var hydrateFallbackElement: js.UndefOr[ReactElement | Null] = js.native

  var id: js.UndefOr[String] = js.native

//  var index: `true` = js.native
//
//  var `lazy`: js.UndefOr[LazyRouteFunction[RouteObject]] = js.native
//
//  var loader: js.UndefOr[LoaderFunction[Any]] = js.native

  var path: js.UndefOr[String] = js.native

//  var shouldRevalidate: js.UndefOr[ShouldRevalidateFunction] = js.native
}

object IndexRouteObject {

  @scala.inline
  def apply(children: Unit): IndexRouteObject = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], index = true)
    __obj.asInstanceOf[IndexRouteObject]
  }

  @scala.inline
  implicit class MutableBuilder[Self <: IndexRouteObject] (val x: Self) extends AnyVal {

//    @scala.inline
//    def setAction(value: /* args */ ActionFunctionArgs[Any] => js.Promise[DataFunctionValue] | DataFunctionValue): Self = StObject.set(x, "action", js.Any.fromFunction1(value))

    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)

    @scala.inline
    def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])

    @scala.inline
    def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)

    @scala.inline
    def setChildren(value: Unit): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])

    @scala.inline
    def setComponent(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])

    @scala.inline
    def setComponentNull: Self = StObject.set(x, "Component", null)

    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)

    @scala.inline
    def setElement(value: ReactElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])

    @scala.inline
    def setElementNull: Self = StObject.set(x, "element", null)

    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)

    @scala.inline
    def setErrorBoundary(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "ErrorBoundary", value.asInstanceOf[js.Any])

    @scala.inline
    def setErrorBoundaryNull: Self = StObject.set(x, "ErrorBoundary", null)

    @scala.inline
    def setErrorBoundaryUndefined: Self = StObject.set(x, "ErrorBoundary", js.undefined)

    @scala.inline
    def setErrorElement(value: ReactElement): Self = StObject.set(x, "errorElement", value.asInstanceOf[js.Any])

    @scala.inline
    def setErrorElementNull: Self = StObject.set(x, "errorElement", null)

    @scala.inline
    def setErrorElementUndefined: Self = StObject.set(x, "errorElement", js.undefined)

    @scala.inline
    def setHandle(value: Any): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])

    @scala.inline
    def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)

    @scala.inline
    def setHasErrorBoundary(value: Boolean): Self = StObject.set(x, "hasErrorBoundary", value.asInstanceOf[js.Any])

    @scala.inline
    def setHasErrorBoundaryUndefined: Self = StObject.set(x, "hasErrorBoundary", js.undefined)

    @scala.inline
    def setHydrateFallback(value: ReactComponentClass[js.Object]): Self = StObject.set(x, "HydrateFallback", value.asInstanceOf[js.Any])

    @scala.inline
    def setHydrateFallbackElement(value: ReactElement): Self = StObject.set(x, "hydrateFallbackElement", value.asInstanceOf[js.Any])

    @scala.inline
    def setHydrateFallbackElementNull: Self = StObject.set(x, "hydrateFallbackElement", null)

    @scala.inline
    def setHydrateFallbackElementUndefined: Self = StObject.set(x, "hydrateFallbackElement", js.undefined)

    @scala.inline
    def setHydrateFallbackNull: Self = StObject.set(x, "HydrateFallback", null)

    @scala.inline
    def setHydrateFallbackUndefined: Self = StObject.set(x, "HydrateFallback", js.undefined)

    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])

    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)

//    @scala.inline
//    def setIndex(value: `true`): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])

//    @scala.inline
//    def setLazy(
//                 value: () => js.Promise[
//                   RequireOne[
//                     Omit[RouteObject, ImmutableRouteKey],
//                     /* keyof std.Omit<R, @remix-run/router.@remix-run/router/dist/utils.ImmutableRouteKey> */ String
//                   ]
//                 ]
//               ): Self = StObject.set(x, "lazy", js.Any.fromFunction0(value))

    @scala.inline
    def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)

//    @scala.inline
//    def setLoader(value: LoaderFunction[Any]): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])

    @scala.inline
    def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)

    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])

    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)

//    @scala.inline
//    def setShouldRevalidate(value: /* args */ ShouldRevalidateFunctionArgs => Boolean): Self = StObject.set(x, "shouldRevalidate", js.Any.fromFunction1(value))

    @scala.inline
    def setShouldRevalidateUndefined: Self = StObject.set(x, "shouldRevalidate", js.undefined)
  }
}
