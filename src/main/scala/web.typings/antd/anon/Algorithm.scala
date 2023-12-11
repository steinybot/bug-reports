package web.typings.antd.anon

import web.typings.antd.esThemeInterfaceMod.MappingAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Algorithm extends StObject {
  
  var algorithm: js.UndefOr[Boolean | MappingAlgorithm | js.Array[MappingAlgorithm]] = js.native
}
object Algorithm {
  
  @scala.inline
  def apply(): Algorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Algorithm]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Algorithm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: Boolean | MappingAlgorithm | js.Array[MappingAlgorithm]): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    @scala.inline
    def setAlgorithmVarargs(value: MappingAlgorithm*): Self = StObject.set(x, "algorithm", js.Array(value :_*))
  }
}
