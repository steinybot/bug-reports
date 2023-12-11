package web.typings.react.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mixin[P, S]
  extends StObject
     with ComponentLifecycle[P, S, Any] {
  
  var childContextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var getDefaultProps: js.UndefOr[js.Function0[P]] = js.native
  
  var getInitialState: js.UndefOr[js.Function0[S]] = js.native
  
  var mixins: js.UndefOr[js.Array[Mixin[P, S]]] = js.native
  
  var propTypes: js.UndefOr[ValidationMap[Any]] = js.native
  
  var statics: js.UndefOr[StringDictionary[Any]] = js.native
}
object Mixin {
  
  @scala.inline
  def apply[P, S](): Mixin[P, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mixin[P, S]]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Mixin[_, _], P, S] (val x: Self with (Mixin[P, S])) extends AnyVal {
    
    @scala.inline
    def setChildContextTypes(value: ValidationMap[Any]): Self = StObject.set(x, "childContextTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildContextTypesUndefined: Self = StObject.set(x, "childContextTypes", js.undefined)
    
    @scala.inline
    def setContextTypes(value: ValidationMap[Any]): Self = StObject.set(x, "contextTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextTypesUndefined: Self = StObject.set(x, "contextTypes", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setGetDefaultProps(value: () => P): Self = StObject.set(x, "getDefaultProps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultPropsUndefined: Self = StObject.set(x, "getDefaultProps", js.undefined)
    
    @scala.inline
    def setGetInitialState(value: () => S): Self = StObject.set(x, "getInitialState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInitialStateUndefined: Self = StObject.set(x, "getInitialState", js.undefined)
    
    @scala.inline
    def setMixins(value: js.Array[Mixin[P, S]]): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
    
    @scala.inline
    def setMixinsVarargs(value: (Mixin[P, S])*): Self = StObject.set(x, "mixins", js.Array(value :_*))
    
    @scala.inline
    def setPropTypes(value: ValidationMap[Any]): Self = StObject.set(x, "propTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropTypesUndefined: Self = StObject.set(x, "propTypes", js.undefined)
    
    @scala.inline
    def setStatics(value: StringDictionary[Any]): Self = StObject.set(x, "statics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticsUndefined: Self = StObject.set(x, "statics", js.undefined)
  }
}
