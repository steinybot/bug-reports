package web.typings.std

import web.typings.std.stdStrings.paymentmethodchange
import web.typings.std.stdStrings.shippingaddresschange
import web.typings.std.stdStrings.shippingoptionchange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Payment Request API interface is the primary access point into the API, and lets web content and apps accept payments from the end user. */
@js.native
trait PaymentRequest
  extends StObject
     with EventTarget {
  
  /* standard dom */
  def abort(): js.Promise[Unit] = js.native
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_paymentmethodchange(
    `type`: paymentmethodchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paymentmethodchange(
    `type`: paymentmethodchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paymentmethodchange(
    `type`: paymentmethodchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shippingaddresschange(
    `type`: shippingaddresschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shippingaddresschange(
    `type`: shippingaddresschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shippingaddresschange(
    `type`: shippingaddresschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shippingoptionchange(
    `type`: shippingoptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shippingoptionchange(
    `type`: shippingoptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shippingoptionchange(
    `type`: shippingoptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /* standard dom */
  def canMakePayment(): js.Promise[scala.Boolean] = js.native
  
  /* standard dom */
  val id: java.lang.String = js.native
  
  /* standard dom */
  var onpaymentmethodchange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard dom */
  var onshippingaddresschange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard dom */
  var onshippingoptionchange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_paymentmethodchange(
    `type`: paymentmethodchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paymentmethodchange(
    `type`: paymentmethodchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paymentmethodchange(
    `type`: paymentmethodchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shippingaddresschange(
    `type`: shippingaddresschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shippingaddresschange(
    `type`: shippingaddresschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shippingaddresschange(
    `type`: shippingaddresschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shippingoptionchange(
    `type`: shippingoptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shippingoptionchange(
    `type`: shippingoptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shippingoptionchange(
    `type`: shippingoptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /* standard dom */
  val shippingAddress: PaymentAddress | Null = js.native
  
  /* standard dom */
  val shippingOption: java.lang.String | Null = js.native
  
  /* standard dom */
  val shippingType: PaymentShippingType | Null = js.native
  
  /* standard dom */
  def show(detailsPromise: PaymentDetailsUpdate): js.Promise[PaymentResponse] = js.native
  def show(detailsPromise: js.Promise[PaymentDetailsUpdate]): js.Promise[PaymentResponse] = js.native
}
