package web.typings.std

import web.typings.std.stdStrings.payerdetailchange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Payment Request API interface is returned after a user selects a payment method and approves a payment request. */
@js.native
trait PaymentResponse
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_payerdetailchange(
    `type`: payerdetailchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_payerdetailchange(
    `type`: payerdetailchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_payerdetailchange(
    `type`: payerdetailchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /* standard dom */
  def complete(): js.Promise[Unit] = js.native
  def complete(result: PaymentComplete): js.Promise[Unit] = js.native
  
  /* standard dom */
  val details: Any = js.native
  
  /* standard dom */
  val methodName: java.lang.String = js.native
  
  /* standard dom */
  var onpayerdetailchange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard dom */
  val payerEmail: java.lang.String | Null = js.native
  
  /* standard dom */
  val payerName: java.lang.String | Null = js.native
  
  /* standard dom */
  val payerPhone: java.lang.String | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_payerdetailchange(
    `type`: payerdetailchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_payerdetailchange(
    `type`: payerdetailchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_payerdetailchange(
    `type`: payerdetailchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /* standard dom */
  val requestId: java.lang.String = js.native
  
  /* standard dom */
  def retry(): js.Promise[Unit] = js.native
  def retry(errorFields: PaymentValidationErrors): js.Promise[Unit] = js.native
  
  /* standard dom */
  val shippingAddress: PaymentAddress | Null = js.native
  
  /* standard dom */
  val shippingOption: java.lang.String | Null = js.native
  
  /* standard dom */
  def toJSON(): Any = js.native
}
