package web.typings.rcComponentColorPicker

import web.typings.rcComponentColorPicker.anon.ContainerRef
import web.typings.rcComponentColorPicker.esColorMod.Color
import web.typings.rcComponentColorPicker.esInterfaceMod.ColorGenInput
import web.typings.rcComponentColorPicker.esInterfaceMod.HsbaColorType
import web.typings.rcComponentColorPicker.esInterfaceMod.TransformOffset
import org.scalajs.dom.HTMLDivElement
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilMod {
  
  @JSImport("@rc-component/color-picker/es/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@rc-component/color-picker/es/util", "ColorPickerPrefixCls")
  @js.native
  val ColorPickerPrefixCls: /* "rc-color-picker" */ String = js.native
  
  @scala.inline
  def calculateColor(props: ContainerRef): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateColor")(props.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  @scala.inline
  def calculateOffset(containerRef: ReactRef[HTMLDivElement], targetRef: ReactRef[HTMLDivElement]): TransformOffset = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateOffset")(containerRef.asInstanceOf[js.Any], targetRef.asInstanceOf[js.Any])).asInstanceOf[TransformOffset]
  @scala.inline
  def calculateOffset(containerRef: ReactRef[HTMLDivElement], targetRef: ReactRef[HTMLDivElement], color: Color): TransformOffset = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateOffset")(containerRef.asInstanceOf[js.Any], targetRef.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[TransformOffset]
  @scala.inline
  def calculateOffset(
    containerRef: ReactRef[HTMLDivElement],
    targetRef: ReactRef[HTMLDivElement],
    color: Color,
    `type`: HsbaColorType
  ): TransformOffset = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateOffset")(containerRef.asInstanceOf[js.Any], targetRef.asInstanceOf[js.Any], color.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[TransformOffset]
  @scala.inline
  def calculateOffset(
    containerRef: ReactRef[HTMLDivElement],
    targetRef: ReactRef[HTMLDivElement],
    color: Unit,
    `type`: HsbaColorType
  ): TransformOffset = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateOffset")(containerRef.asInstanceOf[js.Any], targetRef.asInstanceOf[js.Any], color.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[TransformOffset]
  
  @JSImport("@rc-component/color-picker/es/util", "defaultColor")
  @js.native
  val defaultColor: Color = js.native
  
  @scala.inline
  def generateColor(color: ColorGenInput[Color]): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("generateColor")(color.asInstanceOf[js.Any]).asInstanceOf[Color]
}
