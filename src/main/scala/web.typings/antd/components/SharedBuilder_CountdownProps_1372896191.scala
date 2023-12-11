package web.typings.antd.components

import web.typings.StBuildingComponent
import web.typings.antd.esStatisticUtilsMod.FormatConfig
import web.typings.antd.esStatisticUtilsMod.Formatter
import web.typings.antd.esStatisticUtilsMod.valueType
import web.typings.react.mod.CSSProperties
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_CountdownProps_1372896191 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def decimalSeparator(value: String): this.type = set("decimalSeparator", value.asInstanceOf[js.Any])
  
  @scala.inline
  def format(value: String): this.type = set("format", value.asInstanceOf[js.Any])
  
  @scala.inline
  def formatter(value: Formatter): this.type = set("formatter", value.asInstanceOf[js.Any])
  
  @scala.inline
  def formatterFunction2(value: (/* value */ valueType, /* config */ js.UndefOr[FormatConfig]) => ReactElement): this.type = set("formatter", js.Any.fromFunction2(value))
  
  @scala.inline
  def groupSeparator(value: String): this.type = set("groupSeparator", value.asInstanceOf[js.Any])
  
  @scala.inline
  def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onChange(value: /* value */ js.UndefOr[valueType] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onFinish(value: () => Unit): this.type = set("onFinish", js.Any.fromFunction0(value))
  
  @scala.inline
  def onMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
  
  @scala.inline
  def precision(value: Double): this.type = set("precision", value.asInstanceOf[js.Any])
  
  @scala.inline
  def prefix(value: ReactElement): this.type = set("prefix", value.asInstanceOf[js.Any])
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def suffix(value: ReactElement): this.type = set("suffix", value.asInstanceOf[js.Any])
  
  @scala.inline
  def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  
  @scala.inline
  def value(value: valueType): this.type = set("value", value.asInstanceOf[js.Any])
  
  @scala.inline
  def valueRender(value: /* node */ ReactElement => ReactElement): this.type = set("valueRender", js.Any.fromFunction1(value))
  
  @scala.inline
  def valueStyle(value: CSSProperties): this.type = set("valueStyle", value.asInstanceOf[js.Any])
}
