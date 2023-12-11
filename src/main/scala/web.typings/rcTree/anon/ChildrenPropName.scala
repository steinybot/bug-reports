package web.typings.rcTree.anon

import web.typings.rcTree.esInterfaceMod.DataEntity
import web.typings.rcTree.esInterfaceMod.DataNode
import web.typings.rcTree.esInterfaceMod.FieldNames
import web.typings.rcTree.esUtilsTreeUtilMod.ExternalGetKey
import web.typings.rcTree.esUtilsTreeUtilMod.Wrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildrenPropName extends StObject {
  
  var childrenPropName: js.UndefOr[String] = js.native
  
  var externalGetKey: js.UndefOr[ExternalGetKey] = js.native
  
  var fieldNames: js.UndefOr[FieldNames] = js.native
  
  var initWrapper: js.UndefOr[js.Function1[/* wrapper */ Wrapper, Wrapper]] = js.native
  
  var onProcessFinished: js.UndefOr[js.Function1[/* wrapper */ Wrapper, Unit]] = js.native
  
  var processEntity: js.UndefOr[js.Function2[/* entity */ DataEntity[DataNode], /* wrapper */ Wrapper, Unit]] = js.native
}
object ChildrenPropName {
  
  @scala.inline
  def apply(): ChildrenPropName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildrenPropName]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ChildrenPropName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildrenPropName(value: String): Self = StObject.set(x, "childrenPropName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenPropNameUndefined: Self = StObject.set(x, "childrenPropName", js.undefined)
    
    @scala.inline
    def setExternalGetKey(value: ExternalGetKey): Self = StObject.set(x, "externalGetKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalGetKeyFunction2(value: (DataNode, /* index */ js.UndefOr[Double]) => web.typings.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "externalGetKey", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExternalGetKeyUndefined: Self = StObject.set(x, "externalGetKey", js.undefined)
    
    @scala.inline
    def setFieldNames(value: FieldNames): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
    
    @scala.inline
    def setInitWrapper(value: /* wrapper */ Wrapper => Wrapper): Self = StObject.set(x, "initWrapper", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitWrapperUndefined: Self = StObject.set(x, "initWrapper", js.undefined)
    
    @scala.inline
    def setOnProcessFinished(value: /* wrapper */ Wrapper => Unit): Self = StObject.set(x, "onProcessFinished", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnProcessFinishedUndefined: Self = StObject.set(x, "onProcessFinished", js.undefined)
    
    @scala.inline
    def setProcessEntity(value: (/* entity */ DataEntity[DataNode], /* wrapper */ Wrapper) => Unit): Self = StObject.set(x, "processEntity", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProcessEntityUndefined: Self = StObject.set(x, "processEntity", js.undefined)
  }
}
