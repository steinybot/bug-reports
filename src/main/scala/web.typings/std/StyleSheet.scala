package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A single style sheet. CSS style sheets will further implement the more specialized CSSStyleSheet interface. */
@js.native
trait StyleSheet extends StObject {
  
  /* standard dom */
  var disabled: scala.Boolean = js.native
  
  /* standard dom */
  val href: java.lang.String | Null = js.native
  
  /* standard dom */
  val media: org.scalajs.dom.MediaList = js.native
  
  /* standard dom */
  val ownerNode: org.scalajs.dom.Element | org.scalajs.dom.ProcessingInstruction | Null = js.native
  
  /* standard dom */
  val parentStyleSheet: org.scalajs.dom.CSSStyleSheet | Null = js.native
  
  /* standard dom */
  val title: java.lang.String | Null = js.native
  
  /* standard dom */
  val `type`: java.lang.String = js.native
}
object StyleSheet {
  
  @scala.inline
  def apply(disabled: scala.Boolean, media: org.scalajs.dom.MediaList, `type`: java.lang.String): StyleSheet = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], href = null, ownerNode = null, parentStyleSheet = null, title = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheet]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: StyleSheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: scala.Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHref(value: java.lang.String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefNull: Self = StObject.set(x, "href", null)
    
    @scala.inline
    def setMedia(value: org.scalajs.dom.MediaList): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerNode(value: org.scalajs.dom.Element | org.scalajs.dom.ProcessingInstruction): Self = StObject.set(x, "ownerNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerNodeNull: Self = StObject.set(x, "ownerNode", null)
    
    @scala.inline
    def setParentStyleSheet(value: org.scalajs.dom.CSSStyleSheet): Self = StObject.set(x, "parentStyleSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentStyleSheetNull: Self = StObject.set(x, "parentStyleSheet", null)
    
    @scala.inline
    def setTitle(value: java.lang.String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleNull: Self = StObject.set(x, "title", null)
    
    @scala.inline
    def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
