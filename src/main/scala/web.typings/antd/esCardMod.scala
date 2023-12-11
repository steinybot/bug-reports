package web.typings.antd

import web.typings.antd.esCardCardMod.CardProps
import web.typings.antd.esCardGridMod.CardGridProps
import web.typings.antd.esCardMetaMod.CardMetaProps
import web.typings.react.mod.ForwardRefExoticComponent
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esCardMod extends Shortcut {
  
  @JSImport("antd/es/card", JSImport.Default)
  @js.native
  val default: CardInterface = js.native
  
  @js.native
  trait CardInterface
    extends StObject
       with ForwardRefExoticComponent[CardProps with RefAttributes[HTMLDivElement]] {
    
    var Grid: ReactComponentClass[CardGridProps] = js.native
    
    var Meta: ReactComponentClass[CardMetaProps] = js.native
  }
  
  type InternalCardType = ReactComponentClass[CardProps with RefAttributes[HTMLDivElement]]
  
  type _To = CardInterface
  
  /* This means you don't have to write `default`, but can instead just say `esCardMod.foo` */
  override def _to: CardInterface = default
}
