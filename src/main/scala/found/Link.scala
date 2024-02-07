package found

import typings.found.mod.LinkProps
import typings.react.mod.{ComponentClass, ComponentState}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

// The ST types for Link are annoying. It is a Component instead of a ComponentClass.
// There needs to be an implicit conversion from Component to ComponentClass like there would be in TS.
@JSImport("found", "Link")
@js.native
object Link extends ComponentClass[LinkProps[Nothing, Nothing, Nothing], ComponentState]
