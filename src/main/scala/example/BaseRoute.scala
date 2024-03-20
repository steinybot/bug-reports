package example

import example.BuilderSyntax.BuilderOps
import slinky.core.facade.ReactElement

import scala.scalajs.js
import scala.scalajs.js.UndefOr

trait BaseRoute {

  val parent: UndefOr[BaseRoute]

  val title: UndefOr[String] = js.undefined

  /** Path relative to the parent without a leading slash.
   *
   * May be `js.undefined` if this is the index page of a parent or some other intermediate layout component.
   *
   * Parameters will only match multiple segments if it has a pattern than matches a `/`.
   */
  val path: UndefOr[String] = js.undefined

  /** The absolute pathname for the page starting with a leading slash.
   */
  def fullPath: String = {
    val parentPath = parent.fold("")(_.fullPath)
    path.fold(parentPath) { child =>
      if (parentPath.isEmpty || parentPath.endsWith("/")) parentPath + child
      else parentPath + "/" + child
    }
  }

  val errorElement: ReactElement = null

//  val action: UndefOr[ActionFunctionArgs[Any] => js.Promise[DataFunctionValue]] = js.undefined

  def config: EntryPointRouteObject = {
    IndexRouteObject()
      .setIfDefined(path)(_.setPath)
      .setErrorElement(errorElement)
//      .setIfDefined(action)(config =>
//        action =>
//          config.setAction(
//            action.asInstanceOf[ActionFunctionArgs[Any] => js.Promise[DataFunctionValue] | DataFunctionValue]
//          )
//      )
      .setIfDefined(title)(config =>
        routeTitle =>
          config.setHandle(new TitleHandle {
            override def title(m: UIMatch[Any, Any]): UndefOr[String] = routeTitle
          })
      )
  }
}

object BaseRoute {

  def staticTitle(title: String): UndefOr[UIMatch[Any, Any] => UndefOr[String]] =
    (_: UIMatch[Any, Any]) => title
}
