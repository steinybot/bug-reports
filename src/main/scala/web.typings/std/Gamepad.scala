package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Gamepad API interface defines an individual gamepad or other controller, allowing access to information such as button presses, axis positions, and id. */
@js.native
trait Gamepad extends StObject {
  
  /* standard dom */
  val axes: js.Array[Double] = js.native
  
  /* standard dom */
  val buttons: js.Array[org.scalajs.dom.GamepadButton] = js.native
  
  /* standard dom */
  val connected: scala.Boolean = js.native
  
  /* standard dom */
  val hand: GamepadHand = js.native
  
  /* standard dom */
  val hapticActuators: js.Array[GamepadHapticActuator] = js.native
  
  /* standard dom */
  val id: java.lang.String = js.native
  
  /* standard dom */
  val index: Double = js.native
  
  /* standard dom */
  val mapping: org.scalajs.dom.GamepadMappingType = js.native
  
  /* standard dom */
  val pose: GamepadPose | Null = js.native
  
  /* standard dom */
  val timestamp: Double = js.native
}
object Gamepad {
  
  @scala.inline
  def apply(
    axes: js.Array[Double],
    buttons: js.Array[org.scalajs.dom.GamepadButton],
    connected: scala.Boolean,
    hand: GamepadHand,
    hapticActuators: js.Array[GamepadHapticActuator],
    id: java.lang.String,
    index: Double,
    mapping: org.scalajs.dom.GamepadMappingType,
    timestamp: Double
  ): Gamepad = {
    val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], hand = hand.asInstanceOf[js.Any], hapticActuators = hapticActuators.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], mapping = mapping.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], pose = null)
    __obj.asInstanceOf[Gamepad]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Gamepad] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxes(value: js.Array[Double]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxesVarargs(value: Double*): Self = StObject.set(x, "axes", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[org.scalajs.dom.GamepadButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsVarargs(value: org.scalajs.dom.GamepadButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setConnected(value: scala.Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHand(value: GamepadHand): Self = StObject.set(x, "hand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHapticActuators(value: js.Array[GamepadHapticActuator]): Self = StObject.set(x, "hapticActuators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHapticActuatorsVarargs(value: GamepadHapticActuator*): Self = StObject.set(x, "hapticActuators", js.Array(value :_*))
    
    @scala.inline
    def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapping(value: org.scalajs.dom.GamepadMappingType): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPose(value: GamepadPose): Self = StObject.set(x, "pose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoseNull: Self = StObject.set(x, "pose", null)
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
