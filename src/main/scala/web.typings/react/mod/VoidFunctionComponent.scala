package web.typings.react.mod

import web.typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @deprecated - Equivalent with `React.FunctionComponent`.
  */
@js.native
trait VoidFunctionComponent[P] extends StObject {
  
  def apply(props: P): slinky.core.facade.ReactElement = js.native
  def apply(props: P, context: Any): slinky.core.facade.ReactElement = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  
  var defaultProps: js.UndefOr[Partial[P]] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMap[P]] = js.native
}
