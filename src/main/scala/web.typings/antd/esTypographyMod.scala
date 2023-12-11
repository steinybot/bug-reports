package web.typings.antd

import web.typings.antd.esTypographyLinkMod.LinkProps
import web.typings.antd.esTypographyParagraphMod.ParagraphProps
import web.typings.antd.esTypographyTextMod.TextProps
import web.typings.antd.esTypographyTitleMod.TitleProps
import web.typings.antd.esTypographyTypographyMod.InternalTypographyProps
import web.typings.react.mod.ForwardRefExoticComponent
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLSpanElement
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTypographyMod extends Shortcut {
  
  @JSImport("antd/es/typography", JSImport.Default)
  @js.native
  val default: TypographyProps = js.native
  
  @js.native
  trait TypographyProps
    extends StObject
       with ForwardRefExoticComponent[
          (InternalTypographyProps[
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with `web.typings`.antd.antdStrings.a, `web.typings`.antd.antdStrings.abbr, `web.typings`.antd.antdStrings.address */ Any
          ]) with RefAttributes[HTMLElement]
        ] {
    
    var Link: ReactComponentClass[LinkProps with RefAttributes[HTMLElement]] = js.native
    
    var Paragraph: ReactComponentClass[ParagraphProps with RefAttributes[HTMLElement]] = js.native
    
    var Text: ReactComponentClass[TextProps with RefAttributes[HTMLSpanElement]] = js.native
    
    var Title: ReactComponentClass[TitleProps with RefAttributes[HTMLElement]] = js.native
  }
  
  type _To = TypographyProps
  
  /* This means you don't have to write `default`, but can instead just say `esTypographyMod.foo` */
  override def _to: TypographyProps = default
}
