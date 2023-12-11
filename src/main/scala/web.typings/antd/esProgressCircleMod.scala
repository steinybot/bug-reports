package web.typings.antd

import web.typings.antd.esProgressProgressMod.ProgressGradient
import web.typings.antd.esProgressProgressMod.ProgressProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esProgressCircleMod extends Shortcut {
  
  @JSImport("antd/es/progress/Circle", JSImport.Default)
  @js.native
  val default: ReactComponentClass[CircleProps] = js.native
  
  @js.native
  trait CircleProps
    extends StObject
       with ProgressProps {
    
    @JSName("children")
    var children_CircleProps: ReactElement = js.native
    
    @JSName("prefixCls")
    var prefixCls_CircleProps: String = js.native
    
    var progressStatus: String = js.native
    
    @JSName("strokeColor")
    var strokeColor_CircleProps: js.UndefOr[String | ProgressGradient] = js.native
  }
  object CircleProps {
    
    @scala.inline
    def apply(children: ReactElement, prefixCls: String, progressStatus: String): CircleProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], progressStatus = progressStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[CircleProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CircleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressStatus(value: String): Self = StObject.set(x, "progressStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeColor(value: String | ProgressGradient): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[CircleProps]
  
  /* This means you don't have to write `default`, but can instead just say `esProgressCircleMod.foo` */
  override def _to: ReactComponentClass[CircleProps] = default
}
