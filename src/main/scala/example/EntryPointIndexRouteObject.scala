package example

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
  trait EntryPointIndexRouteObject
    extends StObject
       with _EntryPointRouteObject {

    var ErrorBoundary: js.UndefOr[ReactComponentClass[js.Object] | Null] = js.native

    var HydrateFallback: js.UndefOr[ReactComponentClass[js.Object] | Null] = js.native

    var caseSensitive: js.UndefOr[Boolean] = js.native

    var children: Unit = js.native

//    var entryPoint: BadEntryPointType | JSResourceReference[BadEntryPointType] = js.native

    var errorElement: js.UndefOr[ReactElement | Null] = js.native

    var handle: js.UndefOr[Any] = js.native

    var hasErrorBoundary: js.UndefOr[Boolean] = js.native

    var hydrateFallbackElement: js.UndefOr[ReactElement | Null] = js.native

    var id: js.UndefOr[String] = js.native

//    var index: `true` = js.native

    var path: js.UndefOr[String] = js.native

//    var shouldRevalidate: js.UndefOr[ShouldRevalidateFunction] = js.native
  }
  object EntryPointIndexRouteObject {

//    @scala.inline
//    def apply(children: Unit, entryPoint: BadEntryPointType | JSResourceReference[BadEntryPointType]): EntryPointIndexRouteObject = {
//      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], entryPoint = entryPoint.asInstanceOf[js.Any], index = true)
//      __obj.asInstanceOf[EntryPointIndexRouteObject]
//    }

    @scala.inline
    implicit class MutableBuilder[Self <: EntryPointIndexRouteObject] (val x: Self) extends AnyVal {

      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])

      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)

      @scala.inline
      def setChildren(value: Unit): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])

//      @scala.inline
//      def setEntryPoint(value: BadEntryPointType | JSResourceReference[BadEntryPointType]): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])

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

//      @scala.inline
//      def setIndex(value: `true`): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])

      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])

      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)

//      @scala.inline
//      def setShouldRevalidate(value: /* args */ ShouldRevalidateFunctionArgs => Boolean): Self = StObject.set(x, "shouldRevalidate", js.Any.fromFunction1(value))

      @scala.inline
      def setShouldRevalidateUndefined: Self = StObject.set(x, "shouldRevalidate", js.undefined)
    }
  }
