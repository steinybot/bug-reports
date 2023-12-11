package web.typings.antd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esModalLocaleMod {
  
  @JSImport("antd/es/modal/locale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def changeConfirmLocale(): js.UndefOr[js.Function0[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("changeConfirmLocale")().asInstanceOf[js.UndefOr[js.Function0[Unit]]]
  @scala.inline
  def changeConfirmLocale(newLocale: ModalLocale): js.UndefOr[js.Function0[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("changeConfirmLocale")(newLocale.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Function0[Unit]]]
  
  @scala.inline
  def getConfirmLocale(): ModalLocale = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfirmLocale")().asInstanceOf[ModalLocale]
  
  @js.native
  trait ModalLocale extends StObject {
    
    var cancelText: String = js.native
    
    var justOkText: String = js.native
    
    var okText: String = js.native
  }
  object ModalLocale {
    
    @scala.inline
    def apply(cancelText: String, justOkText: String, okText: String): ModalLocale = {
      val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], justOkText = justOkText.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalLocale]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ModalLocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustOkText(value: String): Self = StObject.set(x, "justOkText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
    }
  }
}
