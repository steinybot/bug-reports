package web.typings.rcSteps

import web.typings.rcSteps.libInterfaceMod.Status
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Description extends StObject {
    
    var description: ReactElement = js.native
    
    var index: Double = js.native
    
    var node: ReactElement = js.native
    
    var status: Status = js.native
    
    var title: ReactElement = js.native
  }
  object Description {
    
    @scala.inline
    def apply(description: ReactElement, index: Double, node: ReactElement, status: Status, title: ReactElement): Description = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: ReactElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Index extends StObject {
    
    var description: ReactElement = js.native
    
    var index: Double = js.native
    
    var status: Status = js.native
    
    var title: ReactElement = js.native
  }
  object Index {
    
    @scala.inline
    def apply(description: ReactElement, index: Double, status: Status, title: ReactElement): Index = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
