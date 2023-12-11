package web.typings.rcTabs

import web.typings.rcTabs.esInterfaceMod.EditableConfig
import web.typings.react.mod.Key
import web.typings.std.Map
import web.typings.std.Record
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilMod {
  
  @JSImport("rc-tabs/es/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def genDataNodeKey(key: Key): String = ^.asInstanceOf[js.Dynamic].applyDynamic("genDataNodeKey")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getRemovable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getRemovable")().asInstanceOf[Boolean]
  @scala.inline
  def getRemovable(closable: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getRemovable")(closable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def getRemovable(closable: Boolean, closeIcon: Unit, editable: EditableConfig): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getRemovable")(closable.asInstanceOf[js.Any], closeIcon.asInstanceOf[js.Any], editable.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def getRemovable(closable: Boolean, closeIcon: Unit, editable: EditableConfig, disabled: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getRemovable")(closable.asInstanceOf[js.Any], closeIcon.asInstanceOf[js.Any], editable.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def getRemovable(closable: Boolean, closeIcon: Unit, editable: Unit, disabled: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getRemovable")(closable.asInstanceOf[js.Any], closeIcon.asInstanceOf[js.Any], editable.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def getRemovable(closable: Boolean, closeIcon: ReactElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getRemovable")(closable.asInstanceOf[js.Any], closeIcon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def getRemovable(closable: Boolean, closeIcon: ReactElement, editable: EditableConfig): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getRemovable")(closable.asInstanceOf[js.Any], closeIcon.asInstanceOf[js.Any], editable.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def getRemovable(closable: Boolean, closeIcon: ReactElement, editable: EditableConfig, disabled: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getRemovable")(closable.asInstanceOf[js.Any], closeIcon.asInstanceOf[js.Any], editable.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def getRemovable(closable: Boolean, closeIcon: ReactElement, editable: Unit, disabled: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getRemovable")(closable.asInstanceOf[js.Any], closeIcon.asInstanceOf[js.Any], editable.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def getRemovable(closable: Unit, closeIcon: Unit, editable: EditableConfig): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getRemovable")(closable.asInstanceOf[js.Any], closeIcon.asInstanceOf[js.Any], editable.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def getRemovable(closable: Unit, closeIcon: Unit, editable: EditableConfig, disabled: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getRemovable")(closable.asInstanceOf[js.Any], closeIcon.asInstanceOf[js.Any], editable.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def getRemovable(closable: Unit, closeIcon: Unit, editable: Unit, disabled: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getRemovable")(closable.asInstanceOf[js.Any], closeIcon.asInstanceOf[js.Any], editable.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def getRemovable(closable: Unit, closeIcon: ReactElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getRemovable")(closable.asInstanceOf[js.Any], closeIcon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def getRemovable(closable: Unit, closeIcon: ReactElement, editable: EditableConfig): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getRemovable")(closable.asInstanceOf[js.Any], closeIcon.asInstanceOf[js.Any], editable.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def getRemovable(closable: Unit, closeIcon: ReactElement, editable: EditableConfig, disabled: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getRemovable")(closable.asInstanceOf[js.Any], closeIcon.asInstanceOf[js.Any], editable.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def getRemovable(closable: Unit, closeIcon: ReactElement, editable: Unit, disabled: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getRemovable")(closable.asInstanceOf[js.Any], closeIcon.asInstanceOf[js.Any], editable.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def stringify[K /* <: String | Double | js.Symbol */, V](obj: Map[K, V]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def stringify[K /* <: String | Double | js.Symbol */, V](obj: Record[K, V]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
}
