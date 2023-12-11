package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSNavigatorDoNotTrack extends StObject {
  
  /* standard dom */
  def confirmSiteSpecificTrackingException(args: ConfirmSiteSpecificExceptionsInformation): scala.Boolean = js.native
  
  /* standard dom */
  def confirmWebWideTrackingException(args: ExceptionInformation): scala.Boolean = js.native
  
  /* standard dom */
  def removeSiteSpecificTrackingException(args: ExceptionInformation): Unit = js.native
  
  /* standard dom */
  def removeWebWideTrackingException(args: ExceptionInformation): Unit = js.native
  
  /* standard dom */
  def storeSiteSpecificTrackingException(args: StoreSiteSpecificExceptionsInformation): Unit = js.native
  
  /* standard dom */
  def storeWebWideTrackingException(args: StoreExceptionsInformation): Unit = js.native
}
object MSNavigatorDoNotTrack {
  
  @scala.inline
  def apply(
    confirmSiteSpecificTrackingException: ConfirmSiteSpecificExceptionsInformation => scala.Boolean,
    confirmWebWideTrackingException: ExceptionInformation => scala.Boolean,
    removeSiteSpecificTrackingException: ExceptionInformation => Unit,
    removeWebWideTrackingException: ExceptionInformation => Unit,
    storeSiteSpecificTrackingException: StoreSiteSpecificExceptionsInformation => Unit,
    storeWebWideTrackingException: StoreExceptionsInformation => Unit
  ): MSNavigatorDoNotTrack = {
    val __obj = js.Dynamic.literal(confirmSiteSpecificTrackingException = js.Any.fromFunction1(confirmSiteSpecificTrackingException), confirmWebWideTrackingException = js.Any.fromFunction1(confirmWebWideTrackingException), removeSiteSpecificTrackingException = js.Any.fromFunction1(removeSiteSpecificTrackingException), removeWebWideTrackingException = js.Any.fromFunction1(removeWebWideTrackingException), storeSiteSpecificTrackingException = js.Any.fromFunction1(storeSiteSpecificTrackingException), storeWebWideTrackingException = js.Any.fromFunction1(storeWebWideTrackingException))
    __obj.asInstanceOf[MSNavigatorDoNotTrack]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: MSNavigatorDoNotTrack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfirmSiteSpecificTrackingException(value: ConfirmSiteSpecificExceptionsInformation => scala.Boolean): Self = StObject.set(x, "confirmSiteSpecificTrackingException", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConfirmWebWideTrackingException(value: ExceptionInformation => scala.Boolean): Self = StObject.set(x, "confirmWebWideTrackingException", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveSiteSpecificTrackingException(value: ExceptionInformation => Unit): Self = StObject.set(x, "removeSiteSpecificTrackingException", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveWebWideTrackingException(value: ExceptionInformation => Unit): Self = StObject.set(x, "removeWebWideTrackingException", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStoreSiteSpecificTrackingException(value: StoreSiteSpecificExceptionsInformation => Unit): Self = StObject.set(x, "storeSiteSpecificTrackingException", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStoreWebWideTrackingException(value: StoreExceptionsInformation => Unit): Self = StObject.set(x, "storeWebWideTrackingException", js.Any.fromFunction1(value))
  }
}
