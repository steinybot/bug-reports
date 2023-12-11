package web.typings.react.mod

import web.typings.propTypes.mod.ReactElementLike
import web.typings.propTypes.mod.ReactNodeLike
import web.typings.react.anon.Fn0
import web.typings.react.anon.Fn1
import web.typings.react.anon.Fn2
import web.typings.react.anon.Fn3
import web.typings.react.anon.FnCall
import web.typings.react.anon.FnCallType
import web.typings.react.anon.FnCallTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactPropTypes extends StObject {
  
  var any: web.typings.propTypes.mod.Requireable[Any] = js.native
  
  var array: web.typings.propTypes.mod.Requireable[js.Array[Any]] = js.native
  
  var arrayOf: FnCallType = js.native
  
  var bool: web.typings.propTypes.mod.Requireable[Boolean] = js.native
  
  var element: web.typings.propTypes.mod.Requireable[ReactElementLike] = js.native
  
  var exact: Fn3 = js.native
  
  var func: web.typings.propTypes.mod.Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
  
  var instanceOf: FnCall = js.native
  
  var node: web.typings.propTypes.mod.Requireable[ReactNodeLike] = js.native
  
  var number: web.typings.propTypes.mod.Requireable[Double] = js.native
  
  var `object`: web.typings.propTypes.mod.Requireable[js.Object] = js.native
  
  var objectOf: Fn1 = js.native
  
  var oneOf: FnCallTypes = js.native
  
  var oneOfType: Fn0 = js.native
  
  var shape: Fn2 = js.native
  
  var string: web.typings.propTypes.mod.Requireable[String] = js.native
}
object ReactPropTypes {
  
  @scala.inline
  def apply(
    any: web.typings.propTypes.mod.Requireable[Any],
    array: web.typings.propTypes.mod.Requireable[js.Array[Any]],
    arrayOf: FnCallType,
    bool: web.typings.propTypes.mod.Requireable[Boolean],
    element: web.typings.propTypes.mod.Requireable[ReactElementLike],
    exact: Fn3,
    func: web.typings.propTypes.mod.Requireable[js.Function1[/* repeated */ Any, Any]],
    instanceOf: FnCall,
    node: web.typings.propTypes.mod.Requireable[ReactNodeLike],
    number: web.typings.propTypes.mod.Requireable[Double],
    `object`: web.typings.propTypes.mod.Requireable[js.Object],
    objectOf: Fn1,
    oneOf: FnCallTypes,
    oneOfType: Fn0,
    shape: Fn2,
    string: web.typings.propTypes.mod.Requireable[String]
  ): ReactPropTypes = {
    val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], arrayOf = arrayOf.asInstanceOf[js.Any], bool = bool.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], func = func.asInstanceOf[js.Any], instanceOf = instanceOf.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], objectOf = objectOf.asInstanceOf[js.Any], oneOf = oneOf.asInstanceOf[js.Any], oneOfType = oneOfType.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactPropTypes]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: ReactPropTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAny(value: web.typings.propTypes.mod.Requireable[Any]): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArray(value: web.typings.propTypes.mod.Requireable[js.Array[Any]]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayOf(value: FnCallType): Self = StObject.set(x, "arrayOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBool(value: web.typings.propTypes.mod.Requireable[Boolean]): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: web.typings.propTypes.mod.Requireable[ReactElementLike]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExact(value: Fn3): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunc(value: web.typings.propTypes.mod.Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceOf(value: FnCall): Self = StObject.set(x, "instanceOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: web.typings.propTypes.mod.Requireable[ReactNodeLike]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: web.typings.propTypes.mod.Requireable[Double]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: web.typings.propTypes.mod.Requireable[js.Object]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectOf(value: Fn1): Self = StObject.set(x, "objectOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneOf(value: FnCallTypes): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneOfType(value: Fn0): Self = StObject.set(x, "oneOfType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShape(value: Fn2): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: web.typings.propTypes.mod.Requireable[String]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
  }
}
