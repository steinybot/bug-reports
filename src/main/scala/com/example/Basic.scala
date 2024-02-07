package com.example

import org.scalajs.dom
import typings.found.mod.{Link as _, *}
import typings.react.mod.*
import typings.reactDom.clientMod.createRoot

import scala.scalajs.js

@main
def Basic(): Unit = {

  val routeConfig = js.Array(
    RouteObject()
      .setPath("/")
      .setComponent(js.Any.fromFunction0(() => {
        createElement(
          "div",
          (),
          createElement(
            "h1",
            (),
            "Hello World"
          ),
          // This does not work.
          new typings.found.mod.Link(LinkPropsNodeChild(to = "/about").asInstanceOf[LinkProps[Nothing, Nothing, Nothing]]).render()
          // This works.
          //          createElement(
          //            Link,
          //            LinkPropsNodeChild(to = "/about").asInstanceOf[Attributes with LinkProps[Nothing, Nothing, Nothing]]
          //          ),
        )
      }).asInstanceOf[FunctionComponent[Any]]),
    RouteObject()
      .setPath("/about")
      .setComponent(js.Any.fromFunction0(() => {
        createElement(
          "div",
          (),
          createElement(
            "h1",
            (),
            "About"
          ),
          createElement(
            "p",
            (),
            "Welcome to found"
          )
        )
      }).asInstanceOf[FunctionComponent[Any]])
  )

  val BrowserRouter = createBrowserRouter(BrowserRouterOptions(routeConfig))

  val root = createRoot(dom.document.getElementById("root"))

  root.render(
    createElement[BrowserRouterProps](
      BrowserRouter.asInstanceOf[FunctionComponent[BrowserRouterProps]],
      Attributes().combineWith(BrowserRouterProps()))
  )
}
