package web.typings.rcUtil

import web.typings.rcUtil.anon.MockRestore
import web.typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTestDomHookMod {
  
  @JSImport("rc-util/es/test/domHook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def spyElementPrototype(Element: ElementClass, propName: String, property: Property): MockRestore = (^.asInstanceOf[js.Dynamic].applyDynamic("spyElementPrototype")(Element.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[MockRestore]
  
  @scala.inline
  def spyElementPrototypes[T /* <: ElementClass */](elementClass: T, properties: Record[String, Property]): MockRestore = (^.asInstanceOf[js.Dynamic].applyDynamic("spyElementPrototypes")(elementClass.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[MockRestore]
  
  type ElementClass = js.Function
  
  type Property = js.PropertyDescriptor | js.Function
}
