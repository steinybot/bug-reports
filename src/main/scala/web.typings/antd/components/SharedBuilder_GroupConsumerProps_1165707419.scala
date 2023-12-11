package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.rcImage.anon.Close
import web.typings.rcImage.libInterfaceMod.ImageElementProps
import web.typings.rcImage.libPreviewGroupMod.PreviewGroupPreview
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_GroupConsumerProps_1165707419 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def fallback(value: String): this.type = set("fallback", value.asInstanceOf[js.Any])
  
  @scala.inline
  def icons(value: Close): this.type = set("icons", value.asInstanceOf[js.Any])
  
  @scala.inline
  def items(value: js.Array[String | ImageElementProps]): this.type = set("items", value.asInstanceOf[js.Any])
  
  @scala.inline
  def itemsVarargs(value: (String | ImageElementProps)*): this.type = set("items", js.Array(value :_*))
  
  @scala.inline
  def preview(value: Boolean | PreviewGroupPreview): this.type = set("preview", value.asInstanceOf[js.Any])
  
  @scala.inline
  def previewPrefixCls(value: String): this.type = set("previewPrefixCls", value.asInstanceOf[js.Any])
}
