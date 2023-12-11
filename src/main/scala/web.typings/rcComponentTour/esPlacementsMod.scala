package web.typings.rcComponentTour

import web.typings.rcComponentTrigger.esInterfaceMod.BuildInPlacements
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPlacementsMod {
  
  @JSImport("@rc-component/tour/es/placements", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getPlacements(): BuildInPlacements = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlacements")().asInstanceOf[BuildInPlacements]
  @scala.inline
  def getPlacements(arrowPointAtCenter: Boolean): BuildInPlacements = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlacements")(arrowPointAtCenter.asInstanceOf[js.Any]).asInstanceOf[BuildInPlacements]
  
  @JSImport("@rc-component/tour/es/placements", "placements")
  @js.native
  val placements: BuildInPlacements = js.native
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcComponentTour.rcComponentTourStrings.left
    - `web.typings`.rcComponentTour.rcComponentTourStrings.leftTop
    - `web.typings`.rcComponentTour.rcComponentTourStrings.leftBottom
    - `web.typings`.rcComponentTour.rcComponentTourStrings.right
    - `web.typings`.rcComponentTour.rcComponentTourStrings.rightTop
    - `web.typings`.rcComponentTour.rcComponentTourStrings.rightBottom
    - `web.typings`.rcComponentTour.rcComponentTourStrings.top
    - `web.typings`.rcComponentTour.rcComponentTourStrings.topLeft
    - `web.typings`.rcComponentTour.rcComponentTourStrings.topRight
    - `web.typings`.rcComponentTour.rcComponentTourStrings.bottom
    - `web.typings`.rcComponentTour.rcComponentTourStrings.bottomLeft
    - `web.typings`.rcComponentTour.rcComponentTourStrings.bottomRight
    - `web.typings`.rcComponentTour.rcComponentTourStrings.center
  */
  trait PlacementType extends StObject
  object PlacementType {
    
    @scala.inline
    def bottom: web.typings.rcComponentTour.rcComponentTourStrings.bottom = "bottom".asInstanceOf[web.typings.rcComponentTour.rcComponentTourStrings.bottom]
    
    @scala.inline
    def bottomLeft: web.typings.rcComponentTour.rcComponentTourStrings.bottomLeft = "bottomLeft".asInstanceOf[web.typings.rcComponentTour.rcComponentTourStrings.bottomLeft]
    
    @scala.inline
    def bottomRight: web.typings.rcComponentTour.rcComponentTourStrings.bottomRight = "bottomRight".asInstanceOf[web.typings.rcComponentTour.rcComponentTourStrings.bottomRight]
    
    @scala.inline
    def center: web.typings.rcComponentTour.rcComponentTourStrings.center = "center".asInstanceOf[web.typings.rcComponentTour.rcComponentTourStrings.center]
    
    @scala.inline
    def left: web.typings.rcComponentTour.rcComponentTourStrings.left = "left".asInstanceOf[web.typings.rcComponentTour.rcComponentTourStrings.left]
    
    @scala.inline
    def leftBottom: web.typings.rcComponentTour.rcComponentTourStrings.leftBottom = "leftBottom".asInstanceOf[web.typings.rcComponentTour.rcComponentTourStrings.leftBottom]
    
    @scala.inline
    def leftTop: web.typings.rcComponentTour.rcComponentTourStrings.leftTop = "leftTop".asInstanceOf[web.typings.rcComponentTour.rcComponentTourStrings.leftTop]
    
    @scala.inline
    def right: web.typings.rcComponentTour.rcComponentTourStrings.right = "right".asInstanceOf[web.typings.rcComponentTour.rcComponentTourStrings.right]
    
    @scala.inline
    def rightBottom: web.typings.rcComponentTour.rcComponentTourStrings.rightBottom = "rightBottom".asInstanceOf[web.typings.rcComponentTour.rcComponentTourStrings.rightBottom]
    
    @scala.inline
    def rightTop: web.typings.rcComponentTour.rcComponentTourStrings.rightTop = "rightTop".asInstanceOf[web.typings.rcComponentTour.rcComponentTourStrings.rightTop]
    
    @scala.inline
    def top: web.typings.rcComponentTour.rcComponentTourStrings.top = "top".asInstanceOf[web.typings.rcComponentTour.rcComponentTourStrings.top]
    
    @scala.inline
    def topLeft: web.typings.rcComponentTour.rcComponentTourStrings.topLeft = "topLeft".asInstanceOf[web.typings.rcComponentTour.rcComponentTourStrings.topLeft]
    
    @scala.inline
    def topRight: web.typings.rcComponentTour.rcComponentTourStrings.topRight = "topRight".asInstanceOf[web.typings.rcComponentTour.rcComponentTourStrings.topRight]
  }
}
