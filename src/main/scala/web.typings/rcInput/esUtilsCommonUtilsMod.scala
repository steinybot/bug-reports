package web.typings.rcInput

import web.typings.rcInput.esInterfaceMod.BaseInputProps
import web.typings.rcInput.esInterfaceMod.InputProps
import web.typings.rcInput.rcInputStrings.all
import web.typings.rcInput.rcInputStrings.end
import web.typings.rcInput.rcInputStrings.start
import web.typings.react.mod.ChangeEvent
import web.typings.std.FocusOptions
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsCommonUtilsMod {
  
  @JSImport("rc-input/es/utils/commonUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def hasAddon(props: BaseInputProps): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasAddon")(props.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def hasAddon(props: InputProps): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasAddon")(props.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def hasPrefixSuffix(props: BaseInputProps): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasPrefixSuffix")(props.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def hasPrefixSuffix(props: InputProps): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasPrefixSuffix")(props.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def resolveOnChange(target: HTMLInputElement, e: ChangeEvent[HTMLInputElement]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolveOnChange(
    target: HTMLInputElement,
    e: ChangeEvent[HTMLInputElement],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLInputElement], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolveOnChange(
    target: HTMLInputElement,
    e: ChangeEvent[HTMLInputElement],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLInputElement], Unit],
    targetValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolveOnChange(target: HTMLInputElement, e: ChangeEvent[HTMLInputElement], onChange: Unit, targetValue: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolveOnChange(target: HTMLInputElement, e: SyntheticCompositionEvent[HTMLElement]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolveOnChange(
    target: HTMLInputElement,
    e: SyntheticCompositionEvent[HTMLElement],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLInputElement], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolveOnChange(
    target: HTMLInputElement,
    e: SyntheticCompositionEvent[HTMLElement],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLInputElement], Unit],
    targetValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolveOnChange(
    target: HTMLInputElement,
    e: SyntheticCompositionEvent[HTMLElement],
    onChange: Unit,
    targetValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolveOnChange(target: HTMLInputElement, e: SyntheticMouseEvent[HTMLElement]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolveOnChange(
    target: HTMLInputElement,
    e: SyntheticMouseEvent[HTMLElement],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLInputElement], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolveOnChange(
    target: HTMLInputElement,
    e: SyntheticMouseEvent[HTMLElement],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLInputElement], Unit],
    targetValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolveOnChange(target: HTMLInputElement, e: SyntheticMouseEvent[HTMLElement], onChange: Unit, targetValue: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolveOnChange(target: HTMLTextAreaElement, e: ChangeEvent[HTMLTextAreaElement]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolveOnChange(
    target: HTMLTextAreaElement,
    e: ChangeEvent[HTMLTextAreaElement],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLTextAreaElement], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolveOnChange(
    target: HTMLTextAreaElement,
    e: ChangeEvent[HTMLTextAreaElement],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLTextAreaElement], Unit],
    targetValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolveOnChange(
    target: HTMLTextAreaElement,
    e: ChangeEvent[HTMLTextAreaElement],
    onChange: Unit,
    targetValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolveOnChange(target: HTMLTextAreaElement, e: SyntheticCompositionEvent[HTMLElement]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolveOnChange(
    target: HTMLTextAreaElement,
    e: SyntheticCompositionEvent[HTMLElement],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLTextAreaElement], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolveOnChange(
    target: HTMLTextAreaElement,
    e: SyntheticCompositionEvent[HTMLElement],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLTextAreaElement], Unit],
    targetValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolveOnChange(
    target: HTMLTextAreaElement,
    e: SyntheticCompositionEvent[HTMLElement],
    onChange: Unit,
    targetValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolveOnChange(target: HTMLTextAreaElement, e: SyntheticMouseEvent[HTMLElement]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolveOnChange(
    target: HTMLTextAreaElement,
    e: SyntheticMouseEvent[HTMLElement],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLTextAreaElement], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolveOnChange(
    target: HTMLTextAreaElement,
    e: SyntheticMouseEvent[HTMLElement],
    onChange: js.Function1[/* event */ ChangeEvent[HTMLTextAreaElement], Unit],
    targetValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolveOnChange(
    target: HTMLTextAreaElement,
    e: SyntheticMouseEvent[HTMLElement],
    onChange: Unit,
    targetValue: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveOnChange")(target.asInstanceOf[js.Any], e.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def triggerFocus(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("triggerFocus")().asInstanceOf[Unit]
  @scala.inline
  def triggerFocus(element: HTMLInputElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("triggerFocus")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def triggerFocus(element: HTMLInputElement, option: InputFocusOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerFocus")(element.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def triggerFocus(element: HTMLTextAreaElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("triggerFocus")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def triggerFocus(element: HTMLTextAreaElement, option: InputFocusOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerFocus")(element.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def triggerFocus(element: Unit, option: InputFocusOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerFocus")(element.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait InputFocusOptions
    extends StObject
       with FocusOptions {
    
    var cursor: js.UndefOr[start | end | all] = js.native
  }
  object InputFocusOptions {
    
    @scala.inline
    def apply(): InputFocusOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputFocusOptions]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: InputFocusOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCursor(value: start | end | all): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    }
  }
}
