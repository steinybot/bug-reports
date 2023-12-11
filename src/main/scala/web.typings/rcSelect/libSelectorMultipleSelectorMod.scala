package web.typings.rcSelect

import web.typings.rcSelect.libBaseSelectMod.CustomTagProps
import web.typings.rcSelect.libInterfaceMod.DisplayValueType
import web.typings.rcSelect.libInterfaceMod.RenderNode
import web.typings.rcSelect.libSelectorMod.InnerSelectorProps
import web.typings.rcSelect.rcSelectStrings.responsive
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSelectorMultipleSelectorMod extends Shortcut {
  
  @JSImport("rc-select/lib/Selector/MultipleSelector", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SelectorProps] = js.native
  
  @js.native
  trait SelectorProps
    extends StObject
       with InnerSelectorProps {
    
    var choiceTransitionName: js.UndefOr[String] = js.native
    
    var maxTagCount: js.UndefOr[Double | responsive] = js.native
    
    var maxTagPlaceholder: js.UndefOr[
        ReactElement | (js.Function1[/* omittedValues */ js.Array[DisplayValueType], ReactElement])
      ] = js.native
    
    var maxTagTextLength: js.UndefOr[Double] = js.native
    
    def onRemove(value: DisplayValueType): Unit = js.native
    
    def onToggleOpen(): Unit = js.native
    def onToggleOpen(open: Boolean): Unit = js.native
    
    var removeIcon: js.UndefOr[RenderNode] = js.native
    
    var tagRender: js.UndefOr[js.Function1[/* props */ CustomTagProps, ReactElement]] = js.native
    
    var tokenSeparators: js.UndefOr[js.Array[String]] = js.native
  }
  
  type _To = ReactComponentClass[SelectorProps]
  
  /* This means you don't have to write `default`, but can instead just say `libSelectorMultipleSelectorMod.foo` */
  override def _to: ReactComponentClass[SelectorProps] = default
}
