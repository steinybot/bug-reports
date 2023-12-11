package web.typings.react

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsxRuntimeMod {
  
  object JSX {
    
    type Element = ReactElement
    
    type ElementAttributesProperty = web.typings.react.mod.JSX.ElementAttributesProperty
    
    type ElementChildrenAttribute = web.typings.react.mod.JSX.ElementChildrenAttribute
    
    type ElementClass = web.typings.react.mod.JSX.ElementClass
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type ElementType = react.react.JSX.ElementType
    }}}
    to avoid circular code involving: 
    - react.react.<global>.JSX.ElementType
    - react.react.GlobalJSXElementType
    - react.react.JSX.ElementType
    - react.react.JSXElementConstructor
    - react.react.ReactNode
    - react.react/experimental.react.PromiseLikeOfReactNode
    - react.react/jsx-runtime.JSX.ElementType
    */
    type ElementType = Any
    
    type IntrinsicAttributes = web.typings.react.mod.JSX.IntrinsicAttributes
    
    type IntrinsicClassAttributes[T] = web.typings.react.mod.JSX.IntrinsicClassAttributes[T]
    
    type IntrinsicElements = web.typings.react.mod.JSX.IntrinsicElements
    
    type LibraryManagedAttributes[C, P] = web.typings.react.mod.JSX.LibraryManagedAttributes[C, P]
  }
}
