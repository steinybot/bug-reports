package web.typings.antd

import web.typings.rcImage.libPreviewGroupMod.GroupConsumerProps
import web.typings.react.mod.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esImagePreviewGroupMod extends Shortcut {
  
  @JSImport("antd/es/image/PreviewGroup", JSImport.Default)
  @js.native
  val default: ReactComponentClass[GroupConsumerProps] = js.native
  
  object icons {
    
    @JSImport("antd/es/image/PreviewGroup", "icons")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/es/image/PreviewGroup", "icons.close")
    @js.native
    def close: Element = js.native
    @scala.inline
    def close_=(x: Element): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("close")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/image/PreviewGroup", "icons.flipX")
    @js.native
    def flipX: Element = js.native
    @scala.inline
    def flipX_=(x: Element): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flipX")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/image/PreviewGroup", "icons.flipY")
    @js.native
    def flipY: Element = js.native
    @scala.inline
    def flipY_=(x: Element): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flipY")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/image/PreviewGroup", "icons.left")
    @js.native
    def left: Element = js.native
    @scala.inline
    def left_=(x: Element): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("left")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/image/PreviewGroup", "icons.right")
    @js.native
    def right: Element = js.native
    @scala.inline
    def right_=(x: Element): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("right")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/image/PreviewGroup", "icons.rotateLeft")
    @js.native
    def rotateLeft: Element = js.native
    @scala.inline
    def rotateLeft_=(x: Element): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rotateLeft")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/image/PreviewGroup", "icons.rotateRight")
    @js.native
    def rotateRight: Element = js.native
    @scala.inline
    def rotateRight_=(x: Element): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rotateRight")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/image/PreviewGroup", "icons.zoomIn")
    @js.native
    def zoomIn: Element = js.native
    @scala.inline
    def zoomIn_=(x: Element): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zoomIn")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/image/PreviewGroup", "icons.zoomOut")
    @js.native
    def zoomOut: Element = js.native
    @scala.inline
    def zoomOut_=(x: Element): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zoomOut")(x.asInstanceOf[js.Any])
  }
  
  type _To = ReactComponentClass[GroupConsumerProps]
  
  /* This means you don't have to write `default`, but can instead just say `esImagePreviewGroupMod.foo` */
  override def _to: ReactComponentClass[GroupConsumerProps] = default
}
