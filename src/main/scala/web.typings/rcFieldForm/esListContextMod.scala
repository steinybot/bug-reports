package web.typings.rcFieldForm

import web.typings.rcFieldForm.esInterfaceMod.InternalNamePath
import web.typings.react.mod.Context
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esListContextMod extends Shortcut {
  
  @JSImport("rc-field-form/es/ListContext", JSImport.Default)
  @js.native
  val default: Context[ListContextProps] = js.native
  
  @js.native
  trait ListContextProps extends StObject {
    
    def getKey(namePath: InternalNamePath): js.Tuple2[
        /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/interface.InternalNamePath[number] */ js.Any, 
        InternalNamePath
      ] = js.native
  }
  object ListContextProps {
    
    @scala.inline
    def apply(
      getKey: InternalNamePath => js.Tuple2[
          /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/interface.InternalNamePath[number] */ js.Any, 
          InternalNamePath
        ]
    ): ListContextProps = {
      val __obj = js.Dynamic.literal(getKey = js.Any.fromFunction1(getKey))
      __obj.asInstanceOf[ListContextProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ListContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetKey(
        value: InternalNamePath => js.Tuple2[
              /* import warning: importer.ImportType#apply Failed type conversion: rc-field-form.rc-field-form/es/interface.InternalNamePath[number] */ js.Any, 
              InternalNamePath
            ]
      ): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Context[ListContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esListContextMod.foo` */
  override def _to: Context[ListContextProps] = default
}
