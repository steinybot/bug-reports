package web.typings.rcImage.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlipXIcon extends StObject {
  
  var flipXIcon: ReactElement = js.native
  
  var flipYIcon: ReactElement = js.native
  
  var rotateLeftIcon: ReactElement = js.native
  
  var rotateRightIcon: ReactElement = js.native
  
  var zoomInIcon: ReactElement = js.native
  
  var zoomOutIcon: ReactElement = js.native
}
object FlipXIcon {
  
  @scala.inline
  def apply(
    flipXIcon: ReactElement,
    flipYIcon: ReactElement,
    rotateLeftIcon: ReactElement,
    rotateRightIcon: ReactElement,
    zoomInIcon: ReactElement,
    zoomOutIcon: ReactElement
  ): FlipXIcon = {
    val __obj = js.Dynamic.literal(flipXIcon = flipXIcon.asInstanceOf[js.Any], flipYIcon = flipYIcon.asInstanceOf[js.Any], rotateLeftIcon = rotateLeftIcon.asInstanceOf[js.Any], rotateRightIcon = rotateRightIcon.asInstanceOf[js.Any], zoomInIcon = zoomInIcon.asInstanceOf[js.Any], zoomOutIcon = zoomOutIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlipXIcon]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: FlipXIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlipXIcon(value: ReactElement): Self = StObject.set(x, "flipXIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlipYIcon(value: ReactElement): Self = StObject.set(x, "flipYIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateLeftIcon(value: ReactElement): Self = StObject.set(x, "rotateLeftIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateRightIcon(value: ReactElement): Self = StObject.set(x, "rotateRightIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomInIcon(value: ReactElement): Self = StObject.set(x, "zoomInIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomOutIcon(value: ReactElement): Self = StObject.set(x, "zoomOutIcon", value.asInstanceOf[js.Any])
  }
}
