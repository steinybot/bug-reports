package web.typings.rcComponentContext

import web.typings.rcComponentContext.anon.MakeImmutable
import web.typings.rcComponentContext.esContextMod.Selector
import web.typings.rcComponentContext.esContextMod.SelectorContext
import web.typings.rcComponentContext.esImmutableMod.CompareProps
import web.typings.std.Partial
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rc-component/context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createContext[ContextProps](): SelectorContext[ContextProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")().asInstanceOf[SelectorContext[ContextProps]]
  @scala.inline
  def createContext[ContextProps](defaultValue: ContextProps): SelectorContext[ContextProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[SelectorContext[ContextProps]]
  
  @scala.inline
  def createImmutable(): MakeImmutable = ^.asInstanceOf[js.Dynamic].applyDynamic("createImmutable")().asInstanceOf[MakeImmutable]
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(responseImmutable, useImmutableMark) */ @scala.inline
  def makeImmutable[T /* <: ReactComponentClass[Any] */](Component: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("makeImmutable")(Component.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def makeImmutable[T /* <: ReactComponentClass[Any] */](Component: T, shouldTriggerRender: CompareProps[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("makeImmutable")(Component.asInstanceOf[js.Any], shouldTriggerRender.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def useContext[ContextProps](holder: SelectorContext[ContextProps]): ContextProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(holder.asInstanceOf[js.Any]).asInstanceOf[ContextProps]
  @scala.inline
  def useContext[ContextProps, PropName /* <: /* keyof ContextProps */ String */](holder: SelectorContext[ContextProps], selector: PropName): /* import warning: importer.ImportType#apply Failed type conversion: ContextProps[PropName] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(holder.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: ContextProps[PropName] */ js.Any]
  @scala.inline
  def useContext[ContextProps, SelectorValue](holder: SelectorContext[ContextProps], selector: Selector[ContextProps, SelectorValue]): SelectorValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(holder.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[SelectorValue]
  @scala.inline
  def useContext[ContextProps, SelectorValue /* <: Partial[ContextProps] */](holder: SelectorContext[ContextProps], selector: js.Array[/* keyof ContextProps */ String]): SelectorValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(holder.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[SelectorValue]
}
