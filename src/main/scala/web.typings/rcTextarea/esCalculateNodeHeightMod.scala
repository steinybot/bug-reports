package web.typings.rcTextarea

import web.typings.react.mod.CSSProperties
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esCalculateNodeHeightMod {
  
  @JSImport("rc-textarea/es/calculateNodeHeight", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(uiTextNode: HTMLTextAreaElement): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(uiTextNode.asInstanceOf[js.Any]).asInstanceOf[CSSProperties]
  @scala.inline
  def default(uiTextNode: HTMLTextAreaElement, useCache: Boolean): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(uiTextNode.asInstanceOf[js.Any], useCache.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  @scala.inline
  def default(uiTextNode: HTMLTextAreaElement, useCache: Boolean, minRows: Double): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(uiTextNode.asInstanceOf[js.Any], useCache.asInstanceOf[js.Any], minRows.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  @scala.inline
  def default(uiTextNode: HTMLTextAreaElement, useCache: Boolean, minRows: Double, maxRows: Double): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(uiTextNode.asInstanceOf[js.Any], useCache.asInstanceOf[js.Any], minRows.asInstanceOf[js.Any], maxRows.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  @scala.inline
  def default(uiTextNode: HTMLTextAreaElement, useCache: Boolean, minRows: Null, maxRows: Double): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(uiTextNode.asInstanceOf[js.Any], useCache.asInstanceOf[js.Any], minRows.asInstanceOf[js.Any], maxRows.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  @scala.inline
  def default(uiTextNode: HTMLTextAreaElement, useCache: Boolean, minRows: Unit, maxRows: Double): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(uiTextNode.asInstanceOf[js.Any], useCache.asInstanceOf[js.Any], minRows.asInstanceOf[js.Any], maxRows.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  @scala.inline
  def default(uiTextNode: HTMLTextAreaElement, useCache: Unit, minRows: Double): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(uiTextNode.asInstanceOf[js.Any], useCache.asInstanceOf[js.Any], minRows.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  @scala.inline
  def default(uiTextNode: HTMLTextAreaElement, useCache: Unit, minRows: Double, maxRows: Double): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(uiTextNode.asInstanceOf[js.Any], useCache.asInstanceOf[js.Any], minRows.asInstanceOf[js.Any], maxRows.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  @scala.inline
  def default(uiTextNode: HTMLTextAreaElement, useCache: Unit, minRows: Null, maxRows: Double): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(uiTextNode.asInstanceOf[js.Any], useCache.asInstanceOf[js.Any], minRows.asInstanceOf[js.Any], maxRows.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  @scala.inline
  def default(uiTextNode: HTMLTextAreaElement, useCache: Unit, minRows: Unit, maxRows: Double): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(uiTextNode.asInstanceOf[js.Any], useCache.asInstanceOf[js.Any], minRows.asInstanceOf[js.Any], maxRows.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  
  @scala.inline
  def calculateNodeStyling(node: HTMLElement): NodeType = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateNodeStyling")(node.asInstanceOf[js.Any]).asInstanceOf[NodeType]
  @scala.inline
  def calculateNodeStyling(node: HTMLElement, useCache: Boolean): NodeType = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateNodeStyling")(node.asInstanceOf[js.Any], useCache.asInstanceOf[js.Any])).asInstanceOf[NodeType]
  
  @js.native
  trait NodeType extends StObject {
    
    var borderSize: Double = js.native
    
    var boxSizing: String = js.native
    
    var paddingSize: Double = js.native
    
    var sizingStyle: String = js.native
  }
  object NodeType {
    
    @scala.inline
    def apply(borderSize: Double, boxSizing: String, paddingSize: Double, sizingStyle: String): NodeType = {
      val __obj = js.Dynamic.literal(borderSize = borderSize.asInstanceOf[js.Any], boxSizing = boxSizing.asInstanceOf[js.Any], paddingSize = paddingSize.asInstanceOf[js.Any], sizingStyle = sizingStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeType]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: NodeType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderSize(value: Double): Self = StObject.set(x, "borderSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxSizing(value: String): Self = StObject.set(x, "boxSizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingSize(value: Double): Self = StObject.set(x, "paddingSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizingStyle(value: String): Self = StObject.set(x, "sizingStyle", value.asInstanceOf[js.Any])
    }
  }
}
