package web.typings.std

import web.typings.std.stdStrings.anyfunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebAssembly {
  
  @js.native
  trait CompileError extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - js.Function
    - `web.typings`.std.WebAssembly.Global
    - `web.typings`.std.WebAssembly.Memory
    - `web.typings`.std.WebAssembly.Table
  */
  type ExportValue = _ExportValue | js.Function
  
  type Exports = Record[java.lang.String, ExportValue]
  
  @js.native
  trait Global
    extends StObject
       with _ExportValue {
    
    /* standard dom */
    var value: Any = js.native
  }
  object Global {
    
    @scala.inline
    def apply(value: Any): Global = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Global]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Global] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GlobalDescriptor extends StObject {
    
    /* standard dom */
    var mutable: js.UndefOr[scala.Boolean] = js.native
    
    /* standard dom */
    var value: ValueType = js.native
  }
  object GlobalDescriptor {
    
    @scala.inline
    def apply(value: ValueType): GlobalDescriptor = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalDescriptor]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: GlobalDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMutable(value: scala.Boolean): Self = StObject.set(x, "mutable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutableUndefined: Self = StObject.set(x, "mutable", js.undefined)
      
      @scala.inline
      def setValue(value: ValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.std.stdStrings.function
    - `web.typings`.std.stdStrings.global
    - `web.typings`.std.stdStrings.memory
    - `web.typings`.std.stdStrings.table
  */
  trait ImportExportKind extends StObject
  object ImportExportKind {
    
    @scala.inline
    def function: web.typings.std.stdStrings.function = "function".asInstanceOf[web.typings.std.stdStrings.function]
    
    @scala.inline
    def global: web.typings.std.stdStrings.global = "global".asInstanceOf[web.typings.std.stdStrings.global]
    
    @scala.inline
    def memory: web.typings.std.stdStrings.memory = "memory".asInstanceOf[web.typings.std.stdStrings.memory]
    
    @scala.inline
    def table: web.typings.std.stdStrings.table = "table".asInstanceOf[web.typings.std.stdStrings.table]
  }
  
  type ImportValue = ExportValue | Double
  
  type Imports = Record[java.lang.String, ModuleImports]
  
  @js.native
  trait Instance extends StObject {
    
    /* standard dom */
    val exports: Exports = js.native
  }
  object Instance {
    
    @scala.inline
    def apply(exports: Exports): Instance = {
      val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any])
      __obj.asInstanceOf[Instance]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExports(value: Exports): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LinkError extends StObject
  
  @js.native
  trait Memory
    extends StObject
       with _ExportValue {
    
    /* standard dom */
    val buffer: js.typedarray.ArrayBuffer = js.native
    
    /* standard dom */
    def grow(delta: Double): Double = js.native
  }
  object Memory {
    
    @scala.inline
    def apply(buffer: js.typedarray.ArrayBuffer, grow: Double => Double): Memory = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], grow = js.Any.fromFunction1(grow))
      __obj.asInstanceOf[Memory]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Memory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrow(value: Double => Double): Self = StObject.set(x, "grow", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait MemoryDescriptor extends StObject {
    
    /* standard dom */
    var initial: Double = js.native
    
    /* standard dom */
    var maximum: js.UndefOr[Double] = js.native
    
    /* standard dom */
    var shared: js.UndefOr[scala.Boolean] = js.native
  }
  object MemoryDescriptor {
    
    @scala.inline
    def apply(initial: Double): MemoryDescriptor = {
      val __obj = js.Dynamic.literal(initial = initial.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemoryDescriptor]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MemoryDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      @scala.inline
      def setShared(value: scala.Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
    }
  }
  
  @js.native
  trait Module extends StObject
  
  @js.native
  trait ModuleExportDescriptor extends StObject {
    
    /* standard dom */
    var kind: ImportExportKind = js.native
    
    /* standard dom */
    var name: java.lang.String = js.native
  }
  object ModuleExportDescriptor {
    
    @scala.inline
    def apply(kind: ImportExportKind, name: java.lang.String): ModuleExportDescriptor = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleExportDescriptor]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ModuleExportDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKind(value: ImportExportKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ModuleImportDescriptor extends StObject {
    
    /* standard dom */
    var kind: ImportExportKind = js.native
    
    /* standard dom */
    var module: java.lang.String = js.native
    
    /* standard dom */
    var name: java.lang.String = js.native
  }
  object ModuleImportDescriptor {
    
    @scala.inline
    def apply(kind: ImportExportKind, module: java.lang.String, name: java.lang.String): ModuleImportDescriptor = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleImportDescriptor]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ModuleImportDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKind(value: ImportExportKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModule(value: java.lang.String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type ModuleImports = Record[java.lang.String, ImportValue]
  
  @js.native
  trait RuntimeError extends StObject
  
  @js.native
  trait Table
    extends StObject
       with _ExportValue {
    
    /* standard dom */
    def get(index: Double): js.Function | Null = js.native
    
    /* standard dom */
    def grow(delta: Double): Double = js.native
    
    /* standard dom */
    val length: Double = js.native
    
    /* standard dom */
    def set(index: Double): Unit = js.native
    def set(index: Double, value: js.Function): Unit = js.native
  }
  
  @js.native
  trait TableDescriptor extends StObject {
    
    /* standard dom */
    var element: TableKind = js.native
    
    /* standard dom */
    var initial: Double = js.native
    
    /* standard dom */
    var maximum: js.UndefOr[Double] = js.native
  }
  object TableDescriptor {
    
    @scala.inline
    def apply(element: TableKind, initial: Double): TableDescriptor = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableDescriptor]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TableDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: TableKind): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    }
  }
  
  type TableKind = anyfunc
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.std.stdStrings.f32
    - `web.typings`.std.stdStrings.f64
    - `web.typings`.std.stdStrings.i32
    - `web.typings`.std.stdStrings.i64
  */
  trait ValueType extends StObject
  object ValueType {
    
    @scala.inline
    def f32: web.typings.std.stdStrings.f32 = "f32".asInstanceOf[web.typings.std.stdStrings.f32]
    
    @scala.inline
    def f64: web.typings.std.stdStrings.f64 = "f64".asInstanceOf[web.typings.std.stdStrings.f64]
    
    @scala.inline
    def i32: web.typings.std.stdStrings.i32 = "i32".asInstanceOf[web.typings.std.stdStrings.i32]
    
    @scala.inline
    def i64: web.typings.std.stdStrings.i64 = "i64".asInstanceOf[web.typings.std.stdStrings.i64]
  }
  
  @js.native
  trait WebAssemblyInstantiatedSource extends StObject {
    
    /* standard dom */
    var instance: Instance = js.native
    
    /* standard dom */
    var module: Module = js.native
  }
  object WebAssemblyInstantiatedSource {
    
    @scala.inline
    def apply(instance: Instance, module: Module): WebAssemblyInstantiatedSource = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebAssemblyInstantiatedSource]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: WebAssemblyInstantiatedSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstance(value: Instance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModule(value: Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    }
  }
  
  trait _ExportValue extends StObject
}
