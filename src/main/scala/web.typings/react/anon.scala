package web.typings.react

import web.typings.propTypes.mod.InferProps
import web.typings.propTypes.mod.InferType
import web.typings.propTypes.mod.Requireable
import web.typings.propTypes.mod.ValidationMap
import web.typings.propTypes.mod.Validator
import web.typings.std.NonNullable
import web.typings.std.Required
import org.scalablytyped.runtime.Instantiable1
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Children extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
  }
  object Children {
    
    @scala.inline
    def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  @js.native
  trait Default[T /* <: ReactComponentClass[Any] */] extends StObject {
    
    var default: T = js.native
  }
  object Default {
    
    @scala.inline
    def apply[T /* <: ReactComponentClass[Any] */](default: T): Default[T] = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default[T]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Default[_], T /* <: ReactComponentClass[Any] */] (val x: Self with Default[T]) extends AnyVal {
      
      @scala.inline
      def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Fn0 extends StObject {
    
    def apply[T /* <: Validator[Any] */](types: js.Array[T]): Requireable[NonNullable[InferType[T]]] = js.native
  }
  
  @js.native
  trait Fn1 extends StObject {
    
    def apply[T](`type`: Validator[T]): Requireable[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof any ]: T} */ js.Any
      ] = js.native
  }
  
  @js.native
  trait Fn2 extends StObject {
    
    def apply[P /* <: ValidationMap[Any] */](`type`: P): Requireable[InferProps[P]] = js.native
  }
  
  @js.native
  trait Fn3 extends StObject {
    
    def apply[P /* <: ValidationMap[Any] */](`type`: P): Requireable[Required[InferProps[P]]] = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T](expectedClass: Instantiable1[/* args (repeated) */ Any, T]): Requireable[T] = js.native
  }
  
  @js.native
  trait FnCallType extends StObject {
    
    def apply[T](`type`: Validator[T]): Requireable[js.Array[T]] = js.native
  }
  
  @js.native
  trait FnCallTypes extends StObject {
    
    def apply[T](types: js.Array[T]): Requireable[T] = js.native
  }
  
  @js.native
  trait Html extends StObject {
    
    // Should be InnerHTML['innerHTML'].
    // But unfortunately we're mixing renderer-specific type declarations.
    var __html: String | TrustedHTML = js.native
  }
  object Html {
    
    @scala.inline
    def apply(__html: String | TrustedHTML): Html = {
      val __obj = js.Dynamic.literal(__html = __html.asInstanceOf[js.Any])
      __obj.asInstanceOf[Html]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Html] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set__html(value: String | TrustedHTML): Self = StObject.set(x, "__html", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[/* props */ Any, ReactComponentClass[Any]]
  
  @js.native
  trait UNDEFINEDVOIDONLY extends StObject
}
