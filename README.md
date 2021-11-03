# Bug Reports

This reproduces the bug for TODO.

## Steps to Reproduce

1. `sbt compile`

## Expected

Expected it to compile.

## Actual

```text
❯ sbt compile
[info] welcome to sbt 1.5.0 (AdoptOpenJDK Java 11.0.8)
[info] loading settings for project global-plugins from compile-quick.sbt,depedency-graph.sbt,license-report.sbt,metals.sbt,sbt-updates.sbt ...
[info] loading global plugins from /Users/jason/.sbt/1.0/plugins
[info] loading project definition from /Users/jason/source/bug-reports/project
[info] loading settings for project bug-reports from build.sbt ...
[info] set current project to bug-reports (in build file:/Users/jason/source/bug-reports/)
[info] Executing in batch mode. For better performance use sbt's shell
[info] compiling 1 Scala source to /Users/jason/source/bug-reports/target/scala-2.13/classes ...
exception when typing Main.this.FunctionalComponent.apply({
  final <artifact> def $anonfun$component(x$1: scala.runtime.BoxedUnit): Main.IsStable = Main.IsStable.stableUnion(Main.Lazy.apply({
    final <artifact> def $anonfun$component(): Main.IsStable = Main.IsStable.unitIsStable();
    (() => $anonfun$component())
  }));
  ((x$1: scala.runtime.BoxedUnit) => $anonfun$component(x$1))
})/class scala.reflect.internal.Trees$Apply
not enough arguments for method apply: (fn: Function1, name: Main.FunctionalComponentName): Object in object FunctionalComponent.
Unspecified value parameter name. in file /Users/jason/source/bug-reports/src/main/scala/Main.scala
scala.reflect.internal.Types$TypeError: not enough arguments for method apply: (fn: Function1, name: Main.FunctionalComponentName): Object in object FunctionalComponent.
Unspecified value parameter name.mpileIncremental 2s
[error]
[error]   unrecoverable error
[error]      while compiling: /Users/jason/source/bug-reports/src/main/scala/Main.scala
[error]         during phase: globalPhase=erasure, enteringPhase=posterasure
[error]      library version: version 2.13.6
[error]     compiler version: version 2.13.6
[error]   reconstructed args: -bootclasspath /Users/jason/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.6/scala-library-2.13.6.jar -classpath /Users/jason/source/bug-reports/target/scala-2.13/classes
[error]
[error]   last tree to typer: Function(value $anonfun)
[error]        tree position: line 32 of /Users/jason/source/bug-reports/src/main/scala/Main.scala
[error]             tree tpe: () => Main.IsStable[Unit]
[error]               symbol: value $anonfun
[error]    symbol definition: val $anonfun: <notype> (a TermSymbol)
[error]       symbol package: <empty>
[error]        symbol owners: value $anonfun -> method $anonfun$component -> value component -> object Main
[error]            call site: object Main in package <empty>
[error]
[error] == Source file context for tree position ==
[error]
[error]     29
[error]     30   val component: Any = FunctionalComponent[Unit] { _ =>
[error]     31     IsStable.stableUnion[Unit](
[error]     32       IsStable.unitIsStable
[error]     33     )
[error]     34   }
[error]     35
exception when typing private[this] val component: Object = Main.this.FunctionalComponent.apply({
  final <artifact> def $anonfun$component(x$1: scala.runtime.BoxedUnit): Main.IsStable = Main.IsStable.stableUnion(Main.Lazy.apply({
    final <artifact> def $anonfun$component(): Main.IsStable = Main.IsStable.unitIsStable();
    (() => $anonfun$component())
  }));
  ((x$1: scala.runtime.BoxedUnit) => $anonfun$component(x$1))
})
exception when typing object Main extends Object {
  def <init>(): Main.type = {
    Main.super.<init>();
    ()
  };
  abstract trait Lazy extends Object;
  object Lazy extends Object {
    def <init>(): Main.Lazy.type = {
      Lazy.super.<init>();
      ()
    };
    implicit def apply(t: Function0): Main.Lazy = scala.Predef.???()
  };
  abstract trait Coercible extends Object;
  abstract trait FunctionalComponentName extends Object;
  object FunctionalComponentName extends Object {
    def <init>(): Main.FunctionalComponentName.type = {
      FunctionalComponentName.super.<init>();
      ()
    };
    implicit def get(): Main.FunctionalComponentName = scala.Predef.???()
  };
  object FunctionalComponent extends Object {
    def <init>(): Main.FunctionalComponent.type = {
      FunctionalComponent.super.<init>();
      ()
    };
    def apply(fn: Function1, name: Main.FunctionalComponentName): Object = scala.Predef.???()
  };
  private[this] val component: Object = Main.this.FunctionalComponent.apply({
    final <artifact> def $anonfun$component(x$1: scala.runtime.BoxedUnit): Main.IsStable = Main.IsStable.stableUnion(Main.Lazy.apply({
      final <artifact> def $anonfun$component(): Main.IsStable = Main.IsStable.unitIsStable();
      (() => $anonfun$component())
    }));
    ((x$1: scala.runtime.BoxedUnit) => $anonfun$component(x$1))
  });
  <stable> <accessor> def component(): Object = Main.this.component;
  object Stable extends Object {
    def <init>(): Main.Stable.type = {
      Stable.super.<init>();
      ()
    };
    implicit def from(value: Object, isStable: Main.IsStable): Object = scala.Predef.???()
  };
  abstract trait IsStable extends Object with Main.Coercible;
  object IsStable extends Object with Main.LowPriorityIsStableImplicits {
    def <init>(): Main.IsStable.type = {
      IsStable.super.<init>();
      ()
    };
    implicit def stableUnion(implicit bIsStable: Main.Lazy): Main.IsStable = scala.Predef.???()
  };
  abstract trait LowPriorityIsStableImplicits extends Object {
    def /*LowPriorityIsStableImplicits*/$init$(): Unit = {
      ()
    };
    implicit def unitIsStable(): Main.IsStable = scala.Predef.???();
    implicit def transitiveIsStable(implicit aToB: Main.IsStable): Main.IsStable = scala.Predef.???()
  }
}
exception when typing package <empty> {
  object Main extends Object {
    def <init>(): Main.type = {
      Main.super.<init>();
      ()
    };
    abstract trait Lazy extends Object;
    object Lazy extends Object {
      def <init>(): Main.Lazy.type = {
        Lazy.super.<init>();
        ()
      };
      implicit def apply(t: Function0): Main.Lazy = scala.Predef.???()
    };
    abstract trait Coercible extends Object;
    abstract trait FunctionalComponentName extends Object;
    object FunctionalComponentName extends Object {
      def <init>(): Main.FunctionalComponentName.type = {
        FunctionalComponentName.super.<init>();
        ()
      };
      implicit def get(): Main.FunctionalComponentName = scala.Predef.???()
    };
    object FunctionalComponent extends Object {
      def <init>(): Main.FunctionalComponent.type = {
        FunctionalComponent.super.<init>();
        ()
      };
      def apply(fn: Function1, name: Main.FunctionalComponentName): Object = scala.Predef.???()
    };
    private[this] val component: Object = Main.this.FunctionalComponent.apply({
      final <artifact> def $anonfun$component(x$1: scala.runtime.BoxedUnit): Main.IsStable = Main.IsStable.stableUnion(Main.Lazy.apply({
        final <artifact> def $anonfun$component(): Main.IsStable = Main.IsStable.unitIsStable();
        (() => $anonfun$component())
      }));
      ((x$1: scala.runtime.BoxedUnit) => $anonfun$component(x$1))
    });
    <stable> <accessor> def component(): Object = Main.this.component;
    object Stable extends Object {
      def <init>(): Main.Stable.type = {
        Stable.super.<init>();
        ()
      };
      implicit def from(value: Object, isStable: Main.IsStable): Object = scala.Predef.???()
    };
    abstract trait IsStable extends Object with Main.Coercible;
    object IsStable extends Object with Main.LowPriorityIsStableImplicits {
      def <init>(): Main.IsStable.type = {
        IsStable.super.<init>();
        ()
      };
      implicit def stableUnion(implicit bIsStable: Main.Lazy): Main.IsStable = scala.Predef.???()
    };
    abstract trait LowPriorityIsStableImplicits extends Object {
      def /*LowPriorityIsStableImplicits*/$init$(): Unit = {
        ()
      };
      implicit def unitIsStable(): Main.IsStable = scala.Predef.???();
      implicit def transitiveIsStable(implicit aToB: Main.IsStable): Main.IsStable = scala.Predef.???()
    }
  }
}
[error] ## Exception when compiling 1 sources to /Users/jason/source/bug-reports/target/scala-2.13/classes
[error] scala.reflect.internal.FatalError:
[error]   unrecoverable error
[error]      while compiling: /Users/jason/source/bug-reports/src/main/scala/Main.scala
[error]         during phase: globalPhase=erasure, enteringPhase=posterasure
[error]      library version: version 2.13.6
[error]     compiler version: version 2.13.6
[error]   reconstructed args: -bootclasspath /Users/jason/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.6/scala-library-2.13.6.jar -classpath /Users/jason/source/bug-reports/target/scala-2.13/classes
[error]
[error]   last tree to typer: Function(value $anonfun)
[error]        tree position: line 32 of /Users/jason/source/bug-reports/src/main/scala/Main.scala
[error]             tree tpe: () => Main.IsStable[Unit]
[error]               symbol: value $anonfun
[error]    symbol definition: val $anonfun: <notype> (a TermSymbol)
[error]       symbol package: <empty>
[error]        symbol owners: value $anonfun -> method $anonfun$component -> value component -> object Main
[error]            call site: object Main in package <empty>
[error]
[error] == Source file context for tree position ==
[error]
[error]     29
[error]     30   val component: Any = FunctionalComponent[Unit] { _ =>
[error]     31     IsStable.stableUnion[Unit](
[error]     32       IsStable.unitIsStable
[error]     33     )
[error]     34   }
[error]     35
[error] scala.reflect.internal.Reporting.abort(Reporting.scala:69)
[error] scala.reflect.internal.Reporting.abort$(Reporting.scala:65)
[error] scala.reflect.internal.SymbolTable.abort(SymbolTable.scala:28)
[error] scala.tools.nsc.transform.Erasure$Eraser.typed1(Erasure.scala:813)
[error] scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6041)
[error] scala.tools.nsc.typechecker.Typers$Typer.typedValDefImpl(Typers.scala:6318)
[error] scala.tools.nsc.typechecker.Typers$Typer.typedValDef(Typers.scala:2111)
[error] scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:5949)
[error] scala.tools.nsc.transform.Erasure$Eraser.typed1(Erasure.scala:806)
[error] scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6041)
[error] scala.tools.nsc.typechecker.Typers$Typer.typedStat$1(Typers.scala:6119)
[error] scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typedStats$8(Typers.scala:3410)
[error] scala.tools.nsc.typechecker.Typers$Typer.typedStats(Typers.scala:3410)
[error] scala.tools.nsc.typechecker.Typers$Typer.typedTemplate(Typers.scala:2064)
[error] scala.tools.nsc.typechecker.Typers$Typer.typedClassDef(Typers.scala:1895)
[error] scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:5951)
[error] scala.tools.nsc.transform.Erasure$Eraser.typed1(Erasure.scala:806)
[error] scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6041)
[error] scala.tools.nsc.typechecker.Typers$Typer.typedStat$1(Typers.scala:6119)
[error] scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typedStats$8(Typers.scala:3410)
[error] scala.tools.nsc.typechecker.Typers$Typer.typedStats(Typers.scala:3410)
[error] scala.tools.nsc.typechecker.Typers$Typer.typedPackageDef$1(Typers.scala:5634)
[error] scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:5954)
[error] scala.tools.nsc.transform.Erasure$Eraser.typed1(Erasure.scala:806)
[error] scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6041)
[error] scala.tools.nsc.transform.Erasure$ErasureTransformer.$anonfun$transform$2(Erasure.scala:1380)
[error] scala.tools.nsc.transform.Erasure$ErasureTransformer.transform(Erasure.scala:1380)
[error] scala.tools.nsc.ast.Trees$Transformer.transformUnit(Trees.scala:183)
[error] scala.tools.nsc.transform.Transform$Phase.apply(Transform.scala:32)
[error] scala.tools.nsc.Global$GlobalPhase.applyPhase(Global.scala:454)
[error] scala.tools.nsc.Global$GlobalPhase.run(Global.scala:401)
[error] scala.tools.nsc.Global$Run.compileUnitsInternal(Global.scala:1519)
[error] scala.tools.nsc.Global$Run.compileUnits(Global.scala:1503)
[error] scala.tools.nsc.Global$Run.compileSources(Global.scala:1495)
[error] scala.tools.nsc.Global$Run.compileFiles(Global.scala:1609)
[error] xsbt.CachedCompiler0.run(CompilerBridge.scala:163)
[error] xsbt.CachedCompiler0.run(CompilerBridge.scala:134)
[error] xsbt.CompilerBridge.run(CompilerBridge.scala:39)
[error] sbt.internal.inc.AnalyzingCompiler.compile(AnalyzingCompiler.scala:91)
[error] sbt.internal.inc.MixedAnalyzingCompiler.$anonfun$compile$7(MixedAnalyzingCompiler.scala:186)
[error] scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.java:23)
[error] sbt.internal.inc.MixedAnalyzingCompiler.timed(MixedAnalyzingCompiler.scala:241)
[error] sbt.internal.inc.MixedAnalyzingCompiler.$anonfun$compile$4(MixedAnalyzingCompiler.scala:176)
[error] sbt.internal.inc.MixedAnalyzingCompiler.$anonfun$compile$4$adapted(MixedAnalyzingCompiler.scala:157)
[error] sbt.internal.inc.JarUtils$.withPreviousJar(JarUtils.scala:239)
[error] sbt.internal.inc.MixedAnalyzingCompiler.compileScala$1(MixedAnalyzingCompiler.scala:157)
[error] sbt.internal.inc.MixedAnalyzingCompiler.compile(MixedAnalyzingCompiler.scala:204)
[error] sbt.internal.inc.IncrementalCompilerImpl.$anonfun$compileInternal$1(IncrementalCompilerImpl.scala:528)
[error] sbt.internal.inc.IncrementalCompilerImpl.$anonfun$compileInternal$1$adapted(IncrementalCompilerImpl.scala:528)
[error] sbt.internal.inc.Incremental$.$anonfun$apply$5(Incremental.scala:174)
[error] sbt.internal.inc.Incremental$.$anonfun$apply$5$adapted(Incremental.scala:172)
[error] sbt.internal.inc.Incremental$$anon$2.run(Incremental.scala:457)
[error] sbt.internal.inc.IncrementalCommon$CycleState.next(IncrementalCommon.scala:116)
[error] sbt.internal.inc.IncrementalCommon$$anon$1.next(IncrementalCommon.scala:56)
[error] sbt.internal.inc.IncrementalCommon$$anon$1.next(IncrementalCommon.scala:52)
[error] sbt.internal.inc.IncrementalCommon.cycle(IncrementalCommon.scala:261)
[error] sbt.internal.inc.Incremental$.$anonfun$incrementalCompile$8(Incremental.scala:412)
[error] sbt.internal.inc.Incremental$.withClassfileManager(Incremental.scala:499)
[error] sbt.internal.inc.Incremental$.incrementalCompile(Incremental.scala:399)
[error] sbt.internal.inc.Incremental$.apply(Incremental.scala:166)
[error] sbt.internal.inc.IncrementalCompilerImpl.compileInternal(IncrementalCompilerImpl.scala:528)
[error] sbt.internal.inc.IncrementalCompilerImpl.$anonfun$compileIncrementally$1(IncrementalCompilerImpl.scala:482)
[error] sbt.internal.inc.IncrementalCompilerImpl.handleCompilationError(IncrementalCompilerImpl.scala:332)
[error] sbt.internal.inc.IncrementalCompilerImpl.compileIncrementally(IncrementalCompilerImpl.scala:420)
[error] sbt.internal.inc.IncrementalCompilerImpl.compile(IncrementalCompilerImpl.scala:137)
[error] sbt.Defaults$.compileIncrementalTaskImpl(Defaults.scala:2346)
[error] sbt.Defaults$.$anonfun$compileIncrementalTask$2(Defaults.scala:2303)
[error] sbt.internal.io.Retry$.apply(Retry.scala:46)
[error] sbt.internal.io.Retry$.apply(Retry.scala:28)
[error] sbt.internal.io.Retry$.apply(Retry.scala:23)
[error] sbt.internal.server.BspCompileTask$.compute(BspCompileTask.scala:31)
[error] sbt.Defaults$.$anonfun$compileIncrementalTask$1(Defaults.scala:2299)
[error] scala.Function1.$anonfun$compose$1(Function1.scala:49)
[error] sbt.internal.util.$tilde$greater.$anonfun$$u2219$1(TypeFunctions.scala:62)
[error] sbt.std.Transform$$anon$4.work(Transform.scala:68)
[error] sbt.Execute.$anonfun$submit$2(Execute.scala:282)
[error] sbt.internal.util.ErrorHandling$.wideConvert(ErrorHandling.scala:23)
[error] sbt.Execute.work(Execute.scala:291)
[error] sbt.Execute.$anonfun$submit$1(Execute.scala:282)
[error] sbt.ConcurrentRestrictions$$anon$4.$anonfun$submitValid$1(ConcurrentRestrictions.scala:265)
[error] sbt.CompletionService$$anon$2.call(CompletionService.scala:64)
[error] java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
[error] java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
[error] java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
[error] java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
[error] java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
[error] java.base/java.lang.Thread.run(Thread.java:834)
[error]
[error] scala.reflect.internal.FatalError:
[error]   unrecoverable error
[error]      while compiling: /Users/jason/source/bug-reports/src/main/scala/Main.scala
[error]         during phase: globalPhase=erasure, enteringPhase=posterasure
[error]      library version: version 2.13.6
[error]     compiler version: version 2.13.6
[error]   reconstructed args: -bootclasspath /Users/jason/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.6/scala-library-2.13.6.jar -classpath /Users/jason/source/bug-reports/target/scala-2.13/classes
[error]
[error]   last tree to typer: Function(value $anonfun)
[error]        tree position: line 32 of /Users/jason/source/bug-reports/src/main/scala/Main.scala
[error]             tree tpe: () => Main.IsStable[Unit]
[error]               symbol: value $anonfun
[error]    symbol definition: val $anonfun: <notype> (a TermSymbol)
[error]       symbol package: <empty>
[error]        symbol owners: value $anonfun -> method $anonfun$component -> value component -> object Main
[error]            call site: object Main in package <empty>
[error]
[error] == Source file context for tree position ==
[error]
[error]     29
[error]     30   val component: Any = FunctionalComponent[Unit] { _ =>
[error]     31     IsStable.stableUnion[Unit](
[error]     32       IsStable.unitIsStable
[error]     33     )
[error]     34   }
[error]     35
[error] 	at scala.reflect.internal.Reporting.abort(Reporting.scala:69)
[error] 	at scala.reflect.internal.Reporting.abort$(Reporting.scala:65)
[error] 	at scala.reflect.internal.SymbolTable.abort(SymbolTable.scala:28)
[error] 	at scala.tools.nsc.transform.Erasure$Eraser.typed1(Erasure.scala:813)
[error] 	at scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6041)
[error] 	at scala.tools.nsc.typechecker.Typers$Typer.typedValDefImpl(Typers.scala:6318)
[error] 	at scala.tools.nsc.typechecker.Typers$Typer.typedValDef(Typers.scala:2111)
[error] 	at scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:5949)
[error] 	at scala.tools.nsc.transform.Erasure$Eraser.typed1(Erasure.scala:806)
[error] 	at scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6041)
[error] 	at scala.tools.nsc.typechecker.Typers$Typer.typedStat$1(Typers.scala:6119)
[error] 	at scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typedStats$8(Typers.scala:3410)
[error] 	at scala.tools.nsc.typechecker.Typers$Typer.typedStats(Typers.scala:3410)
[error] 	at scala.tools.nsc.typechecker.Typers$Typer.typedTemplate(Typers.scala:2064)
[error] 	at scala.tools.nsc.typechecker.Typers$Typer.typedClassDef(Typers.scala:1895)
[error] 	at scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:5951)
[error] 	at scala.tools.nsc.transform.Erasure$Eraser.typed1(Erasure.scala:806)
[error] 	at scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6041)
[error] 	at scala.tools.nsc.typechecker.Typers$Typer.typedStat$1(Typers.scala:6119)
[error] 	at scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typedStats$8(Typers.scala:3410)
[error] 	at scala.tools.nsc.typechecker.Typers$Typer.typedStats(Typers.scala:3410)
[error] 	at scala.tools.nsc.typechecker.Typers$Typer.typedPackageDef$1(Typers.scala:5634)
[error] 	at scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:5954)
[error] 	at scala.tools.nsc.transform.Erasure$Eraser.typed1(Erasure.scala:806)
[error] 	at scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6041)
[error] 	at scala.tools.nsc.transform.Erasure$ErasureTransformer.$anonfun$transform$2(Erasure.scala:1380)
[error] 	at scala.tools.nsc.transform.Erasure$ErasureTransformer.transform(Erasure.scala:1380)
[error] 	at scala.tools.nsc.ast.Trees$Transformer.transformUnit(Trees.scala:183)
[error] 	at scala.tools.nsc.transform.Transform$Phase.apply(Transform.scala:32)
[error] 	at scala.tools.nsc.Global$GlobalPhase.applyPhase(Global.scala:454)
[error] 	at scala.tools.nsc.Global$GlobalPhase.run(Global.scala:401)
[error] 	at scala.tools.nsc.Global$Run.compileUnitsInternal(Global.scala:1519)
[error] 	at scala.tools.nsc.Global$Run.compileUnits(Global.scala:1503)
[error] 	at scala.tools.nsc.Global$Run.compileSources(Global.scala:1495)
[error] 	at scala.tools.nsc.Global$Run.compileFiles(Global.scala:1609)
[error] 	at xsbt.CachedCompiler0.run(CompilerBridge.scala:163)
[error] 	at xsbt.CachedCompiler0.run(CompilerBridge.scala:134)
[error] 	at xsbt.CompilerBridge.run(CompilerBridge.scala:39)
[error] 	at sbt.internal.inc.AnalyzingCompiler.compile(AnalyzingCompiler.scala:91)
[error] 	at sbt.internal.inc.MixedAnalyzingCompiler.$anonfun$compile$7(MixedAnalyzingCompiler.scala:186)
[error] 	at scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.java:23)
[error] 	at sbt.internal.inc.MixedAnalyzingCompiler.timed(MixedAnalyzingCompiler.scala:241)
[error] 	at sbt.internal.inc.MixedAnalyzingCompiler.$anonfun$compile$4(MixedAnalyzingCompiler.scala:176)
[error] 	at sbt.internal.inc.MixedAnalyzingCompiler.$anonfun$compile$4$adapted(MixedAnalyzingCompiler.scala:157)
[error] 	at sbt.internal.inc.JarUtils$.withPreviousJar(JarUtils.scala:239)
[error] 	at sbt.internal.inc.MixedAnalyzingCompiler.compileScala$1(MixedAnalyzingCompiler.scala:157)
[error] 	at sbt.internal.inc.MixedAnalyzingCompiler.compile(MixedAnalyzingCompiler.scala:204)
[error] 	at sbt.internal.inc.IncrementalCompilerImpl.$anonfun$compileInternal$1(IncrementalCompilerImpl.scala:528)
[error] 	at sbt.internal.inc.IncrementalCompilerImpl.$anonfun$compileInternal$1$adapted(IncrementalCompilerImpl.scala:528)
[error] 	at sbt.internal.inc.Incremental$.$anonfun$apply$5(Incremental.scala:174)
[error] 	at sbt.internal.inc.Incremental$.$anonfun$apply$5$adapted(Incremental.scala:172)
[error] 	at sbt.internal.inc.Incremental$$anon$2.run(Incremental.scala:457)
[error] 	at sbt.internal.inc.IncrementalCommon$CycleState.next(IncrementalCommon.scala:116)
[error] 	at sbt.internal.inc.IncrementalCommon$$anon$1.next(IncrementalCommon.scala:56)
[error] 	at sbt.internal.inc.IncrementalCommon$$anon$1.next(IncrementalCommon.scala:52)
[error] 	at sbt.internal.inc.IncrementalCommon.cycle(IncrementalCommon.scala:261)
[error] 	at sbt.internal.inc.Incremental$.$anonfun$incrementalCompile$8(Incremental.scala:412)
[error] 	at sbt.internal.inc.Incremental$.withClassfileManager(Incremental.scala:499)
[error] 	at sbt.internal.inc.Incremental$.incrementalCompile(Incremental.scala:399)
[error] 	at sbt.internal.inc.Incremental$.apply(Incremental.scala:166)
[error] 	at sbt.internal.inc.IncrementalCompilerImpl.compileInternal(IncrementalCompilerImpl.scala:528)
[error] 	at sbt.internal.inc.IncrementalCompilerImpl.$anonfun$compileIncrementally$1(IncrementalCompilerImpl.scala:482)
[error] 	at sbt.internal.inc.IncrementalCompilerImpl.handleCompilationError(IncrementalCompilerImpl.scala:332)
[error] 	at sbt.internal.inc.IncrementalCompilerImpl.compileIncrementally(IncrementalCompilerImpl.scala:420)
[error] 	at sbt.internal.inc.IncrementalCompilerImpl.compile(IncrementalCompilerImpl.scala:137)
[error] 	at sbt.Defaults$.compileIncrementalTaskImpl(Defaults.scala:2346)
[error] 	at sbt.Defaults$.$anonfun$compileIncrementalTask$2(Defaults.scala:2303)
[error] 	at sbt.internal.io.Retry$.apply(Retry.scala:46)
[error] 	at sbt.internal.io.Retry$.apply(Retry.scala:28)
[error] 	at sbt.internal.io.Retry$.apply(Retry.scala:23)
[error] 	at sbt.internal.server.BspCompileTask$.compute(BspCompileTask.scala:31)
[error] 	at sbt.Defaults$.$anonfun$compileIncrementalTask$1(Defaults.scala:2299)
[error] 	at scala.Function1.$anonfun$compose$1(Function1.scala:49)
[error] 	at sbt.internal.util.$tilde$greater.$anonfun$$u2219$1(TypeFunctions.scala:62)
[error] 	at sbt.std.Transform$$anon$4.work(Transform.scala:68)
[error] 	at sbt.Execute.$anonfun$submit$2(Execute.scala:282)
[error] 	at sbt.internal.util.ErrorHandling$.wideConvert(ErrorHandling.scala:23)
[error] 	at sbt.Execute.work(Execute.scala:291)
[error] 	at sbt.Execute.$anonfun$submit$1(Execute.scala:282)
[error] 	at sbt.ConcurrentRestrictions$$anon$4.$anonfun$submitValid$1(ConcurrentRestrictions.scala:265)
[error] 	at sbt.CompletionService$$anon$2.call(CompletionService.scala:64)
[error] 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
[error] 	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
[error] 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
[error] 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
[error] 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
[error] 	at java.base/java.lang.Thread.run(Thread.java:834)
[error] (Compile / compileIncremental) scala.reflect.internal.FatalError:
[error]   unrecoverable error
[error]      while compiling: /Users/jason/source/bug-reports/src/main/scala/Main.scala
[error]         during phase: globalPhase=erasure, enteringPhase=posterasure
[error]      library version: version 2.13.6
[error]     compiler version: version 2.13.6
[error]   reconstructed args: -bootclasspath /Users/jason/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.6/scala-library-2.13.6.jar -classpath /Users/jason/source/bug-reports/target/scala-2.13/classes
[error]
[error]   last tree to typer: Function(value $anonfun)
[error]        tree position: line 32 of /Users/jason/source/bug-reports/src/main/scala/Main.scala
[error]             tree tpe: () => Main.IsStable[Unit]
[error]               symbol: value $anonfun
[error]    symbol definition: val $anonfun: <notype> (a TermSymbol)
[error]       symbol package: <empty>
[error]        symbol owners: value $anonfun -> method $anonfun$component -> value component -> object Main
[error]            call site: object Main in package <empty>
[error]
[error] == Source file context for tree position ==
[error]
[error]     29
[error]     30   val component: Any = FunctionalComponent[Unit] { _ =>
[error]     31     IsStable.stableUnion[Unit](
[error]     32       IsStable.unitIsStable
[error]     33     )
[error]     34   }
[error]     35
[error] Total time: 3 s, completed 3/11/2021, 7:48:13 PM
```
