package web.typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("webkitURL")
@js.native
class webkitURL protected ()
  extends StObject
     with web.typings.std.URL {
  /* standard dom */
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, base: java.lang.String) = this()
  def this(url: java.lang.String, base: org.scalajs.dom.URL) = this()
}
/* was `typeof URL` */
object webkitURL {
  
  @JSGlobal("webkitURL")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard dom */
  @scala.inline
  def createObjectURL(`object`: Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("createObjectURL")(`object`.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /* standard dom */
  @scala.inline
  def revokeObjectURL(url: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("revokeObjectURL")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
