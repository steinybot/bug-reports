package web.typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegExpConstructor
  extends StObject
     with /* standard es2015.core */
/* standard es5 */
Instantiable1[(/* pattern */ js.RegExp) | (/* pattern */ java.lang.String), js.RegExp]
     with Instantiable2[
      (/* pattern */ js.RegExp) | (/* pattern */ java.lang.String), 
      /* flags */ java.lang.String, 
      js.RegExp
    ] {
  
  def apply(pattern: java.lang.String): js.RegExp = js.native
  def apply(pattern: java.lang.String, flags: java.lang.String): js.RegExp = js.native
  /* standard es5 */
  def apply(pattern: js.RegExp): js.RegExp = js.native
  def apply(pattern: js.RegExp, flags: java.lang.String): js.RegExp = js.native
  
  // Non-standard extensions
  /* standard es5 */
  @JSName("$1")
  var $1: java.lang.String = js.native
  
  /* standard es5 */
  @JSName("$2")
  var $2: java.lang.String = js.native
  
  /* standard es5 */
  @JSName("$3")
  var $3: java.lang.String = js.native
  
  /* standard es5 */
  @JSName("$4")
  var $4: java.lang.String = js.native
  
  /* standard es5 */
  @JSName("$5")
  var $5: java.lang.String = js.native
  
  /* standard es5 */
  @JSName("$6")
  var $6: java.lang.String = js.native
  
  /* standard es5 */
  @JSName("$7")
  var $7: java.lang.String = js.native
  
  /* standard es5 */
  @JSName("$8")
  var $8: java.lang.String = js.native
  
  /* standard es5 */
  @JSName("$9")
  var $9: java.lang.String = js.native
  
  /* standard es5 */
  var lastMatch: java.lang.String = js.native
  
  /* standard es2015.symbol.wellknown */
  @JSName(js.Symbol.species)
  val species: RegExpConstructor = js.native
}
