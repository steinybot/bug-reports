package web.typings.rcComponentContext

import web.typings.rcComponentContext.esImmutableMod.CompareProps
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait MakeImmutable extends StObject {
    
    def makeImmutable[T /* <: ReactComponentClass[Any] */](Component: T): T = js.native
    def makeImmutable[T /* <: ReactComponentClass[Any] */](Component: T, shouldTriggerRender: CompareProps[T]): T = js.native
    
    def responseImmutable[T_1 /* <: ReactComponentClass[Any] */](Component: T_1): T_1 = js.native
    def responseImmutable[T_1 /* <: ReactComponentClass[Any] */](Component: T_1, propsAreEqual: CompareProps[T_1]): T_1 = js.native
    
    def useImmutableMark(): Double = js.native
  }
}
