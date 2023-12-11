package web.typings.antd

import web.typings.antd.esUtilTypeMod.AnyObject
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilReactNodeMod {
  
  @JSImport("antd/es/_util/reactNode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def cloneElement(element: ReactElement): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  @scala.inline
  def cloneElement(element: ReactElement, props: RenderProps): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  
  @scala.inline
  def isFragment(child: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(child.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidElement[P](): /* is react.react.ReactElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")().asInstanceOf[/* is react.react.ReactElement */ Boolean]
  @scala.inline
  def isValidElement[P](`object`: js.Object): /* is react.react.ReactElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is react.react.ReactElement */ Boolean]
  
  @scala.inline
  def replaceElement(element: ReactElement, replacement: ReactElement): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceElement")(element.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  @scala.inline
  def replaceElement(element: ReactElement, replacement: ReactElement, props: RenderProps): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceElement")(element.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  
  type RenderProps = AnyObject | (js.Function1[/* originProps */ AnyObject, AnyObject | Unit])
}
