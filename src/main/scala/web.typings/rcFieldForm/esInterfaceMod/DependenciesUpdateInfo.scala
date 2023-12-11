package web.typings.rcFieldForm.esInterfaceMod

import web.typings.rcFieldForm.rcFieldFormStrings.dependenciesUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DependenciesUpdateInfo
  extends StObject
     with NotifyInfo {
  
  /**
    * Contains all the related `InternalNamePath[]`.
    * a <- b <- c : change `a`
    * relatedFields=[a, b, c]
    */
  var relatedFields: js.Array[InternalNamePath] = js.native
  
  var `type`: dependenciesUpdate = js.native
}
object DependenciesUpdateInfo {
  
  @scala.inline
  def apply(relatedFields: js.Array[InternalNamePath]): DependenciesUpdateInfo = {
    val __obj = js.Dynamic.literal(relatedFields = relatedFields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dependenciesUpdate")
    __obj.asInstanceOf[DependenciesUpdateInfo]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: DependenciesUpdateInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelatedFields(value: js.Array[InternalNamePath]): Self = StObject.set(x, "relatedFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedFieldsVarargs(value: InternalNamePath*): Self = StObject.set(x, "relatedFields", js.Array(value :_*))
    
    @scala.inline
    def setType(value: dependenciesUpdate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
