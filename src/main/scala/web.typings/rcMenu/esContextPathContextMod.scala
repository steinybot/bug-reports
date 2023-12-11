package web.typings.rcMenu

import web.typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esContextPathContextMod {
  
  @JSImport("rc-menu/es/context/PathContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-menu/es/context/PathContext", "PathRegisterContext")
  @js.native
  val PathRegisterContext: Context[PathRegisterContextProps] = js.native
  
  @JSImport("rc-menu/es/context/PathContext", "PathTrackerContext")
  @js.native
  val PathTrackerContext: Context[js.Array[String]] = js.native
  
  @JSImport("rc-menu/es/context/PathContext", "PathUserContext")
  @js.native
  val PathUserContext: Context[PathUserContextProps] = js.native
  
  @scala.inline
  def useFullPath(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFullPath")().asInstanceOf[js.Array[String]]
  @scala.inline
  def useFullPath(eventKey: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFullPath")(eventKey.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def useMeasure(): PathRegisterContextProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useMeasure")().asInstanceOf[PathRegisterContextProps]
  
  @js.native
  trait PathRegisterContextProps extends StObject {
    
    def registerPath(key: String, keyPath: js.Array[String]): Unit = js.native
    
    def unregisterPath(key: String, keyPath: js.Array[String]): Unit = js.native
  }
  object PathRegisterContextProps {
    
    @scala.inline
    def apply(
      registerPath: (String, js.Array[String]) => Unit,
      unregisterPath: (String, js.Array[String]) => Unit
    ): PathRegisterContextProps = {
      val __obj = js.Dynamic.literal(registerPath = js.Any.fromFunction2(registerPath), unregisterPath = js.Any.fromFunction2(unregisterPath))
      __obj.asInstanceOf[PathRegisterContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PathRegisterContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegisterPath(value: (String, js.Array[String]) => Unit): Self = StObject.set(x, "registerPath", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUnregisterPath(value: (String, js.Array[String]) => Unit): Self = StObject.set(x, "unregisterPath", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait PathUserContextProps extends StObject {
    
    def isSubPathKey(pathKeys: js.Array[String], eventKey: String): Boolean = js.native
  }
  object PathUserContextProps {
    
    @scala.inline
    def apply(isSubPathKey: (js.Array[String], String) => Boolean): PathUserContextProps = {
      val __obj = js.Dynamic.literal(isSubPathKey = js.Any.fromFunction2(isSubPathKey))
      __obj.asInstanceOf[PathUserContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PathUserContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsSubPathKey(value: (js.Array[String], String) => Boolean): Self = StObject.set(x, "isSubPathKey", js.Any.fromFunction2(value))
    }
  }
}
