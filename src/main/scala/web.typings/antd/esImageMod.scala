package web.typings.antd

import web.typings.rcImage.libImageMod.ImageProps
import web.typings.rcImage.libPreviewGroupMod.GroupConsumerProps
import web.typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esImageMod extends Shortcut {
  
  @JSImport("antd/es/image", JSImport.Default)
  @js.native
  val default: CompositionImage[ImageProps] = js.native
  
  @js.native
  trait CompositionImage[P]
    extends StObject
       with FunctionComponent[P] {
    
    var PreviewGroup: ReactComponentClass[GroupConsumerProps] = js.native
  }
  
  type _To = CompositionImage[ImageProps]
  
  /* This means you don't have to write `default`, but can instead just say `esImageMod.foo` */
  override def _to: CompositionImage[ImageProps] = default
}
