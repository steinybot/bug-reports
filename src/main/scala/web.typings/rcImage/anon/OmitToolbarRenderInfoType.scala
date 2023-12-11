package web.typings.rcImage.anon

import web.typings.rcImage.libHooksUseImageTransformMod.TransformType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<rc-image.rc-image/lib/Preview.ToolbarRenderInfoType, 'current' | 'total'> */
@js.native
trait OmitToolbarRenderInfoType extends StObject {
  
  var actions: OnFlipX = js.native
  
  var icons: FlipXIcon = js.native
  
  var transform: TransformType = js.native
}
object OmitToolbarRenderInfoType {
  
  @scala.inline
  def apply(actions: OnFlipX, icons: FlipXIcon, transform: TransformType): OmitToolbarRenderInfoType = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], icons = icons.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitToolbarRenderInfoType]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: OmitToolbarRenderInfoType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: OnFlipX): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcons(value: FlipXIcon): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: TransformType): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}
