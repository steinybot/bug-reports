package web.typings.antd

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLayoutHooksUseHasSiderMod {
  
  @JSImport("antd/es/layout/hooks/useHasSider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(siders: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(siders.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def default(siders: js.Array[String], children: Unit, hasSider: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(siders.asInstanceOf[js.Any], children.asInstanceOf[js.Any], hasSider.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def default(siders: js.Array[String], children: ReactElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(siders.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def default(siders: js.Array[String], children: ReactElement, hasSider: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(siders.asInstanceOf[js.Any], children.asInstanceOf[js.Any], hasSider.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
