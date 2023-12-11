package web.typings.react.mod

import web.typings.react.reactStrings.backwards
import web.typings.react.reactStrings.forwards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - `web.typings`.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps
  - `web.typings`.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps
*/
trait SuspenseListProps extends StObject
object SuspenseListProps {
  
  @scala.inline
  def DirectionalSuspenseListProps(
    children: slinky.core.facade.ReactElement | js.Iterable[slinky.core.facade.ReactElement],
    revealOrder: forwards | backwards
  ): web.typings.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[web.typings.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps]
  }
  
  @scala.inline
  def NonDirectionalSuspenseListProps(children: slinky.core.facade.ReactElement | js.Iterable[slinky.core.facade.ReactElement]): web.typings.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[web.typings.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps]
  }
}
