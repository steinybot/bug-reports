package web.typings.rcComponentContext

import web.typings.std.Partial
import web.typings.std.Set
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esContextMod {
  
  @JSImport("@rc-component/context/es/context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createContext[ContextProps](): SelectorContext[ContextProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")().asInstanceOf[SelectorContext[ContextProps]]
  @scala.inline
  def createContext[ContextProps](defaultValue: ContextProps): SelectorContext[ContextProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[SelectorContext[ContextProps]]
  
  @scala.inline
  def useContext[ContextProps](holder: SelectorContext[ContextProps]): ContextProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(holder.asInstanceOf[js.Any]).asInstanceOf[ContextProps]
  @scala.inline
  def useContext[ContextProps, PropName /* <: /* keyof ContextProps */ String */](holder: SelectorContext[ContextProps], selector: PropName): /* import warning: importer.ImportType#apply Failed type conversion: ContextProps[PropName] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(holder.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: ContextProps[PropName] */ js.Any]
  @scala.inline
  def useContext[ContextProps, SelectorValue](holder: SelectorContext[ContextProps], selector: Selector[ContextProps, SelectorValue]): SelectorValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(holder.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[SelectorValue]
  @scala.inline
  def useContext[ContextProps, SelectorValue /* <: Partial[ContextProps] */](holder: SelectorContext[ContextProps], selector: js.Array[/* keyof ContextProps */ String]): SelectorValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(holder.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[SelectorValue]
  
  @js.native
  trait Context[ContextProps] extends StObject {
    
    def getValue(): ContextProps = js.native
    
    var listeners: Listeners[ContextProps] = js.native
  }
  object Context {
    
    @scala.inline
    def apply[ContextProps](getValue: () => ContextProps, listeners: Listeners[ContextProps]): Context[ContextProps] = {
      val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue), listeners = listeners.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context[ContextProps]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Context[_], ContextProps] (val x: Self with Context[ContextProps]) extends AnyVal {
      
      @scala.inline
      def setGetValue(value: () => ContextProps): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setListeners(value: Listeners[ContextProps]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ContextSelectorProviderProps[T] extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var value: T = js.native
  }
  object ContextSelectorProviderProps {
    
    @scala.inline
    def apply[T](value: T): ContextSelectorProviderProps[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextSelectorProviderProps[T]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ContextSelectorProviderProps[_], T] (val x: Self with ContextSelectorProviderProps[T]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type Listeners[ContextProps] = Set[Trigger[ContextProps]]
  
  type Selector[ContextProps, SelectorValue] = js.Function1[/* value */ ContextProps, SelectorValue]
  
  @js.native
  trait SelectorContext[ContextProps] extends StObject {
    
    var Context: web.typings.react.mod.Context[web.typings.rcComponentContext.esContextMod.Context[ContextProps]] = js.native
    
    var Provider: ReactComponentClass[ContextSelectorProviderProps[ContextProps]] = js.native
    
    var defaultValue: js.UndefOr[ContextProps] = js.native
  }
  object SelectorContext {
    
    @scala.inline
    def apply[ContextProps](
      Context: web.typings.react.mod.Context[Context[ContextProps]],
      Provider: ReactComponentClass[ContextSelectorProviderProps[ContextProps]]
    ): SelectorContext[ContextProps] = {
      val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectorContext[ContextProps]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SelectorContext[_], ContextProps] (val x: Self with SelectorContext[ContextProps]) extends AnyVal {
      
      @scala.inline
      def setContext(value: web.typings.react.mod.Context[Context[ContextProps]]): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValue(value: ContextProps): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setProvider(value: ReactComponentClass[ContextSelectorProviderProps[ContextProps]]): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
    }
  }
  
  type Trigger[ContextProps] = js.Function1[/* value */ ContextProps, Unit]
}
