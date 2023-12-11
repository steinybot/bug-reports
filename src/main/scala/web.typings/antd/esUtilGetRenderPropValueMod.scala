package web.typings.antd

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilGetRenderPropValueMod {
  
  @JSImport("antd/es/_util/getRenderPropValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getRenderPropValue(): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getRenderPropValue")().asInstanceOf[ReactElement]
  @scala.inline
  def getRenderPropValue(propValue: RenderFunction): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getRenderPropValue")(propValue.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  @scala.inline
  def getRenderPropValue(propValue: ReactElement): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getRenderPropValue")(propValue.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  type RenderFunction = js.Function0[ReactElement]
}
