package web.typings.rcDialog

import web.typings.rcDialog.anon.motionNamestringariaIdstr
import web.typings.rcDialog.esDialogContentPanelMod.PanelProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDialogContentMod extends Shortcut {
  
  @JSImport("rc-dialog/es/Dialog/Content", JSImport.Default)
  @js.native
  val default: ReactComponentClass[motionNamestringariaIdstr] = js.native
  
  @js.native
  trait ContentProps
    extends StObject
       with PanelProps {
    
    @JSName("ariaId")
    var ariaId_ContentProps: String = js.native
    
    var motionName: String = js.native
    
    def onVisibleChanged(visible: Boolean): Unit = js.native
  }
  object ContentProps {
    
    @scala.inline
    def apply(ariaId: String, motionName: String, onVisibleChanged: Boolean => Unit, prefixCls: String): ContentProps = {
      val __obj = js.Dynamic.literal(ariaId = ariaId.asInstanceOf[js.Any], motionName = motionName.asInstanceOf[js.Any], onVisibleChanged = js.Any.fromFunction1(onVisibleChanged), prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaId(value: String): Self = StObject.set(x, "ariaId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionName(value: String): Self = StObject.set(x, "motionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnVisibleChanged(value: Boolean => Unit): Self = StObject.set(x, "onVisibleChanged", js.Any.fromFunction1(value))
    }
  }
  
  type _To = ReactComponentClass[motionNamestringariaIdstr]
  
  /* This means you don't have to write `default`, but can instead just say `esDialogContentMod.foo` */
  override def _to: ReactComponentClass[motionNamestringariaIdstr] = default
}
