package web.typings.antd

import web.typings.antd.esSelectMod.SelectProps
import web.typings.rcSelect.libSelectMod.DefaultOptionType
import web.typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPaginationSelectMod {
  
  @JSImport("antd/es/pagination/Select", "MiddleSelect")
  @js.native
  val MiddleSelect: CompoundedComponent = js.native
  
  @JSImport("antd/es/pagination/Select", "MiniSelect")
  @js.native
  val MiniSelect: CompoundedComponent = js.native
  
  @js.native
  trait CompoundedComponent
    extends StObject
       with FunctionComponent[SelectProps[Any, DefaultOptionType]] {
    
    var Option: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Select.Option */ Any = js.native
  }
}
