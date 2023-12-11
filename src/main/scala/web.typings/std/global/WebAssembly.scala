package web.typings.std.global

import web.typings.std.BufferSource
import web.typings.std.PromiseLike
import web.typings.std.WebAssembly.CompileError
import web.typings.std.WebAssembly.Global
import web.typings.std.WebAssembly.GlobalDescriptor
import web.typings.std.WebAssembly.Imports
import web.typings.std.WebAssembly.Instance
import web.typings.std.WebAssembly.LinkError
import web.typings.std.WebAssembly.Memory
import web.typings.std.WebAssembly.MemoryDescriptor
import web.typings.std.WebAssembly.Module
import web.typings.std.WebAssembly.ModuleExportDescriptor
import web.typings.std.WebAssembly.ModuleImportDescriptor
import web.typings.std.WebAssembly.RuntimeError
import web.typings.std.WebAssembly.Table
import web.typings.std.WebAssembly.TableDescriptor
import web.typings.std.WebAssembly.WebAssemblyInstantiatedSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebAssembly {
  
  @JSGlobal("WebAssembly")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.CompileError")
  @js.native
  /* standard dom */
  class CompileErrorCls ()
    extends StObject
       with CompileError
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Global")
  @js.native
  class GlobalCls protected ()
    extends StObject
       with Global {
    /* standard dom */
    def this(descriptor: GlobalDescriptor) = this()
    def this(descriptor: GlobalDescriptor, v: Any) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Instance")
  @js.native
  class InstanceCls protected ()
    extends StObject
       with Instance {
    /* standard dom */
    def this(module: Module) = this()
    def this(module: Module, importObject: Imports) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.LinkError")
  @js.native
  /* standard dom */
  class LinkErrorCls ()
    extends StObject
       with LinkError
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Memory")
  @js.native
  class MemoryCls protected ()
    extends StObject
       with Memory {
    /* standard dom */
    def this(descriptor: MemoryDescriptor) = this()
  }
  
  object Module {
    
    @JSGlobal("WebAssembly.Module")
    @js.native
    val ^ : js.Any = js.native
    
    /* standard dom */
    @scala.inline
    def customSections(moduleObject: web.typings.std.WebAssembly.Module, sectionName: java.lang.String): js.Array[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("customSections")(moduleObject.asInstanceOf[js.Any], sectionName.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.typedarray.ArrayBuffer]]
    
    /* standard dom */
    @scala.inline
    def exports(moduleObject: web.typings.std.WebAssembly.Module): js.Array[ModuleExportDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("exports")(moduleObject.asInstanceOf[js.Any]).asInstanceOf[js.Array[ModuleExportDescriptor]]
    
    /* standard dom */
    @scala.inline
    def imports(moduleObject: web.typings.std.WebAssembly.Module): js.Array[ModuleImportDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("imports")(moduleObject.asInstanceOf[js.Any]).asInstanceOf[js.Array[ModuleImportDescriptor]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Module")
  @js.native
  class ModuleCls protected ()
    extends StObject
       with Module {
    /* standard dom */
    def this(bytes: BufferSource) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.RuntimeError")
  @js.native
  /* standard dom */
  class RuntimeErrorCls ()
    extends StObject
       with RuntimeError
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Table")
  @js.native
  class TableCls protected ()
    extends StObject
       with Table {
    /* standard dom */
    def this(descriptor: TableDescriptor) = this()
  }
  
  @scala.inline
  def compile(bytes: BufferSource): js.Promise[Module] = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Module]]
  
  @scala.inline
  def compileStreaming(source: js.Promise[org.scalajs.dom.Response]): js.Promise[Module] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileStreaming")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Module]]
  @scala.inline
  def compileStreaming(source: org.scalajs.dom.Response): js.Promise[Module] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileStreaming")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Module]]
  
  @scala.inline
  def instantiate(bytes: BufferSource): js.Promise[WebAssemblyInstantiatedSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebAssemblyInstantiatedSource]]
  @scala.inline
  def instantiate(bytes: BufferSource, importObject: Imports): js.Promise[WebAssemblyInstantiatedSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(bytes.asInstanceOf[js.Any], importObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebAssemblyInstantiatedSource]]
  @scala.inline
  def instantiate(moduleObject: Module): js.Promise[Instance] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(moduleObject.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Instance]]
  @scala.inline
  def instantiate(moduleObject: Module, importObject: Imports): js.Promise[Instance] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(moduleObject.asInstanceOf[js.Any], importObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Instance]]
  
  @scala.inline
  def instantiateStreaming(response: PromiseLike[org.scalajs.dom.Response]): js.Promise[WebAssemblyInstantiatedSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(response.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebAssemblyInstantiatedSource]]
  @scala.inline
  def instantiateStreaming(response: PromiseLike[org.scalajs.dom.Response], importObject: Imports): js.Promise[WebAssemblyInstantiatedSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(response.asInstanceOf[js.Any], importObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebAssemblyInstantiatedSource]]
  @scala.inline
  def instantiateStreaming(response: org.scalajs.dom.Response): js.Promise[WebAssemblyInstantiatedSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(response.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebAssemblyInstantiatedSource]]
  @scala.inline
  def instantiateStreaming(response: org.scalajs.dom.Response, importObject: Imports): js.Promise[WebAssemblyInstantiatedSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(response.asInstanceOf[js.Any], importObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebAssemblyInstantiatedSource]]
  
  @scala.inline
  def validate(bytes: BufferSource): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(bytes.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
}
