package web.typings.rcNotification.components

import web.typings.StBuildingComponent
import web.typings.rcNotification.anon.NoticePropstimesnumberund
import web.typings.rcNotification.anon.keyinNoticeSemanticPropsC
import web.typings.rcNotification.anon.keyinNoticeSemanticPropss
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.HTMLAttributes
import web.typings.react.mod.Key
import web.typings.std.Record
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Notice {
  
  @scala.inline
  def apply(eventKey: Key, prefixCls: String): Builder = {
    val __props = js.Dynamic.literal(eventKey = eventKey.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[NoticePropstimesnumberund]))
  }
  
  @JSImport("rc-notification", "Notice")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLDivElement] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def classNames(value: keyinNoticeSemanticPropss): this.type = set("classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closable(value: Boolean): this.type = set("closable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def closeIcon(value: ReactElement): this.type = set("closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def content(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def durationNull: this.type = set("duration", null)
    
    @scala.inline
    def hovering(value: Boolean): this.type = set("hovering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onNoticeClose(value: /* key */ Key => Unit): this.type = set("onNoticeClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def props(value: HTMLAttributes[HTMLDivElement] with (Record[String, Any])): this.type = set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styles(value: keyinNoticeSemanticPropsC): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def times(value: Double): this.type = set("times", value.asInstanceOf[js.Any])
  }
  
  type Props = NoticePropstimesnumberund
  
  def withProps(p: NoticePropstimesnumberund): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
