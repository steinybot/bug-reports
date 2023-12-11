package web.typings.antd

import web.typings.antd.anon.PickBaseButtonPropsdanger
import web.typings.antd.esButtonButtonHelpersMod.ButtonType
import web.typings.antd.esButtonButtonMod.CompoundedComponent
import web.typings.antd.esButtonButtonMod.LegacyButtonType
import web.typings.react.mod.JSX.Element
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esButtonMod {
  
  @JSImport("antd/es/button", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd/es/button", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  @scala.inline
  def convertLegacyProps(): PickBaseButtonPropsdanger = ^.asInstanceOf[js.Dynamic].applyDynamic("convertLegacyProps")().asInstanceOf[PickBaseButtonPropsdanger]
  @scala.inline
  def convertLegacyProps(`type`: LegacyButtonType): PickBaseButtonPropsdanger = ^.asInstanceOf[js.Dynamic].applyDynamic("convertLegacyProps")(`type`.asInstanceOf[js.Any]).asInstanceOf[PickBaseButtonPropsdanger]
  
  @scala.inline
  def isString(str: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(str.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  @JSImport("antd/es/button", "isTwoCNChar")
  @js.native
  val isTwoCNChar: Any = js.native
  
  @scala.inline
  def isUnBorderedButtonType(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnBorderedButtonType")().asInstanceOf[Boolean]
  @scala.inline
  def isUnBorderedButtonType(`type`: ButtonType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnBorderedButtonType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def spaceChildren(children: ReactElement, needInserted: Boolean): js.UndefOr[(js.Array[Double | Element]) | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("spaceChildren")(children.asInstanceOf[js.Any], needInserted.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[(js.Array[Double | Element]) | Null]]
}
