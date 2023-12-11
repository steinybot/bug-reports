package web.typings.antd

import org.scalajs.dom.DOMRect
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAffixUtilsMod {
  
  @JSImport("antd/es/affix/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getFixedBottom(placeholderRect: DOMRect, targetRect: DOMRect): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedBottom")(placeholderRect.asInstanceOf[js.Any], targetRect.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  @scala.inline
  def getFixedBottom(placeholderRect: DOMRect, targetRect: DOMRect, offsetBottom: Double): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedBottom")(placeholderRect.asInstanceOf[js.Any], targetRect.asInstanceOf[js.Any], offsetBottom.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  @scala.inline
  def getFixedTop(placeholderRect: DOMRect, targetRect: DOMRect): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedTop")(placeholderRect.asInstanceOf[js.Any], targetRect.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  @scala.inline
  def getFixedTop(placeholderRect: DOMRect, targetRect: DOMRect, offsetTop: Double): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFixedTop")(placeholderRect.asInstanceOf[js.Any], targetRect.asInstanceOf[js.Any], offsetTop.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  @scala.inline
  def getTargetRect(target: BindElement): DOMRect = ^.asInstanceOf[js.Dynamic].applyDynamic("getTargetRect")(target.asInstanceOf[js.Any]).asInstanceOf[DOMRect]
  
  type BindElement = js.UndefOr[HTMLElement | Window | Null]
}
