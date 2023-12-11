package web.typings.rcComponentTour

import web.typings.rcComponentTour.esPlacementsMod.PlacementType
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilMod {
  
  @JSImport("@rc-component/tour/es/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getPlacement(): PlacementType = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlacement")().asInstanceOf[PlacementType]
  @scala.inline
  def getPlacement(targetElement: HTMLElement): PlacementType = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlacement")(targetElement.asInstanceOf[js.Any]).asInstanceOf[PlacementType]
  @scala.inline
  def getPlacement(targetElement: HTMLElement, placement: PlacementType): PlacementType = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlacement")(targetElement.asInstanceOf[js.Any], placement.asInstanceOf[js.Any])).asInstanceOf[PlacementType]
  @scala.inline
  def getPlacement(targetElement: HTMLElement, placement: PlacementType, stepPlacement: PlacementType): PlacementType = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlacement")(targetElement.asInstanceOf[js.Any], placement.asInstanceOf[js.Any], stepPlacement.asInstanceOf[js.Any])).asInstanceOf[PlacementType]
  @scala.inline
  def getPlacement(targetElement: HTMLElement, placement: Unit, stepPlacement: PlacementType): PlacementType = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlacement")(targetElement.asInstanceOf[js.Any], placement.asInstanceOf[js.Any], stepPlacement.asInstanceOf[js.Any])).asInstanceOf[PlacementType]
  @scala.inline
  def getPlacement(targetElement: Null, placement: PlacementType): PlacementType = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlacement")(targetElement.asInstanceOf[js.Any], placement.asInstanceOf[js.Any])).asInstanceOf[PlacementType]
  @scala.inline
  def getPlacement(targetElement: Null, placement: PlacementType, stepPlacement: PlacementType): PlacementType = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlacement")(targetElement.asInstanceOf[js.Any], placement.asInstanceOf[js.Any], stepPlacement.asInstanceOf[js.Any])).asInstanceOf[PlacementType]
  @scala.inline
  def getPlacement(targetElement: Null, placement: Unit, stepPlacement: PlacementType): PlacementType = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlacement")(targetElement.asInstanceOf[js.Any], placement.asInstanceOf[js.Any], stepPlacement.asInstanceOf[js.Any])).asInstanceOf[PlacementType]
  @scala.inline
  def getPlacement(targetElement: Unit, placement: PlacementType): PlacementType = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlacement")(targetElement.asInstanceOf[js.Any], placement.asInstanceOf[js.Any])).asInstanceOf[PlacementType]
  @scala.inline
  def getPlacement(targetElement: Unit, placement: PlacementType, stepPlacement: PlacementType): PlacementType = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlacement")(targetElement.asInstanceOf[js.Any], placement.asInstanceOf[js.Any], stepPlacement.asInstanceOf[js.Any])).asInstanceOf[PlacementType]
  @scala.inline
  def getPlacement(targetElement: Unit, placement: Unit, stepPlacement: PlacementType): PlacementType = (^.asInstanceOf[js.Dynamic].applyDynamic("getPlacement")(targetElement.asInstanceOf[js.Any], placement.asInstanceOf[js.Any], stepPlacement.asInstanceOf[js.Any])).asInstanceOf[PlacementType]
  
  @scala.inline
  def isInViewPort(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInViewPort")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
