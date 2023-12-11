package web.typings.antd

import web.typings.antd.esConfigProviderContextMod.DirectionType
import web.typings.antd.esProgressProgressMod.ProgressGradient
import web.typings.antd.esProgressProgressMod.ProgressProps
import web.typings.antd.esProgressProgressMod.StringGradients
import web.typings.react.mod.CSSProperties
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esProgressLineMod {
  
  @JSImport("antd/es/progress/Line", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd/es/progress/Line", JSImport.Default)
  @js.native
  val default: ReactComponentClass[LineProps] = js.native
  
  @scala.inline
  def handleGradient(strokeColor: ProgressGradient): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("handleGradient")(strokeColor.asInstanceOf[js.Any]).asInstanceOf[CSSProperties]
  @scala.inline
  def handleGradient(strokeColor: ProgressGradient, directionConfig: DirectionType): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("handleGradient")(strokeColor.asInstanceOf[js.Any], directionConfig.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  
  @scala.inline
  def sortGradient(gradients: StringGradients): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sortGradient")(gradients.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @js.native
  trait LineProps
    extends StObject
       with ProgressProps {
    
    @JSName("children")
    var children_LineProps: ReactElement = js.native
    
    var direction: js.UndefOr[DirectionType] = js.native
    
    @JSName("prefixCls")
    var prefixCls_LineProps: String = js.native
    
    @JSName("strokeColor")
    var strokeColor_LineProps: js.UndefOr[String | ProgressGradient] = js.native
  }
  object LineProps {
    
    @scala.inline
    def apply(children: ReactElement, prefixCls: String): LineProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: LineProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirection(value: DirectionType): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeColor(value: String | ProgressGradient): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    }
  }
}
