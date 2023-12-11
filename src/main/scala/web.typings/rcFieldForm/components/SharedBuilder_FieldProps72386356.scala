package web.typings.rcFieldForm.components

import web.typings.StBuildingComponent
import web.typings.rcFieldForm.anon.Source
import web.typings.rcFieldForm.esFieldMod.ChildProps
import web.typings.rcFieldForm.esFieldMod.MetaEvent
import web.typings.rcFieldForm.esFieldMod.ShouldUpdate
import web.typings.rcFieldForm.esInterfaceMod.EventArgs
import web.typings.rcFieldForm.esInterfaceMod.FormInstance
import web.typings.rcFieldForm.esInterfaceMod.Meta
import web.typings.rcFieldForm.esInterfaceMod.NamePath
import web.typings.rcFieldForm.esInterfaceMod.Rule
import web.typings.rcFieldForm.esInterfaceMod.Store
import web.typings.rcFieldForm.esInterfaceMod.StoreValue
import web.typings.rcFieldForm.rcFieldFormBooleans.`false`
import web.typings.rcFieldForm.rcFieldFormStrings.parallel
import web.typings.std.Record
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_FieldProps72386356[Values] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def children(
    value: ReactElement | (js.Function3[
      /* control */ ChildProps, 
      /* meta */ Meta, 
      /* form */ FormInstance[Values], 
      ReactElement
    ])
  ): this.type = set("children", value.asInstanceOf[js.Any])
  
  @scala.inline
  def childrenFunction3(
    value: (/* control */ ChildProps, /* meta */ Meta, /* form */ FormInstance[Values]) => ReactElement
  ): this.type = set("children", js.Any.fromFunction3(value))
  
  @scala.inline
  def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dependencies(value: js.Array[NamePath[Any]]): this.type = set("dependencies", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dependenciesVarargs(value: NamePath[Any]*): this.type = set("dependencies", js.Array(value :_*))
  
  @scala.inline
  def getValueFromEvent(value: /* args */ EventArgs => StoreValue): this.type = set("getValueFromEvent", js.Any.fromFunction1(value))
  
  @scala.inline
  def getValueProps(value: /* value */ StoreValue => Record[String, Any]): this.type = set("getValueProps", js.Any.fromFunction1(value))
  
  @scala.inline
  def initialValue(value: Any): this.type = set("initialValue", value.asInstanceOf[js.Any])
  
  @scala.inline
  def isList(value: Boolean): this.type = set("isList", value.asInstanceOf[js.Any])
  
  @scala.inline
  def isListField(value: Boolean): this.type = set("isListField", value.asInstanceOf[js.Any])
  
  @scala.inline
  def messageVariables(value: Record[String, String]): this.type = set("messageVariables", value.asInstanceOf[js.Any])
  
  @scala.inline
  def name(value: NamePath[Values]): this.type = set("name", value.asInstanceOf[js.Any])
  
  @scala.inline
  def nameVarargs(value: (String | Double | Boolean)*): this.type = set("name", js.Array(value :_*))
  
  @scala.inline
  def normalize(value: (/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store) => StoreValue): this.type = set("normalize", js.Any.fromFunction3(value))
  
  @scala.inline
  def onMetaChange(value: /* meta */ MetaEvent => Unit): this.type = set("onMetaChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onReset(value: () => Unit): this.type = set("onReset", js.Any.fromFunction0(value))
  
  @scala.inline
  def preserve(value: Boolean): this.type = set("preserve", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rules(value: js.Array[Rule]): this.type = set("rules", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rulesVarargs(value: Rule*): this.type = set("rules", js.Array(value :_*))
  
  @scala.inline
  def shouldUpdate(value: ShouldUpdate[Values]): this.type = set("shouldUpdate", value.asInstanceOf[js.Any])
  
  @scala.inline
  def shouldUpdateFunction3(value: (Values, Values, /* info */ Source) => Boolean): this.type = set("shouldUpdate", js.Any.fromFunction3(value))
  
  @scala.inline
  def trigger(value: String): this.type = set("trigger", value.asInstanceOf[js.Any])
  
  @scala.inline
  def validateDebounce(value: Double): this.type = set("validateDebounce", value.asInstanceOf[js.Any])
  
  @scala.inline
  def validateFirst(value: Boolean | parallel): this.type = set("validateFirst", value.asInstanceOf[js.Any])
  
  @scala.inline
  def validateTrigger(value: String | js.Array[String] | `false`): this.type = set("validateTrigger", value.asInstanceOf[js.Any])
  
  @scala.inline
  def validateTriggerVarargs(value: String*): this.type = set("validateTrigger", js.Array(value :_*))
  
  @scala.inline
  def valuePropName(value: String): this.type = set("valuePropName", value.asInstanceOf[js.Any])
}
