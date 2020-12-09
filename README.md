# Bug Reports

This reproduces the bug for TODO.

## Steps to Reproduce

```shell
sbt fullOptJS
```

## Expected

Compiles without error

## Actual

```text
❯ sbt fullOptJS
[info] Loading settings for project global-plugins from license-report.sbt,compile-quick.sbt,metals.sbt ...
[info] Loading global plugins from /Users/jason/.sbt/1.0/plugins
[info] Loading settings for project bug-reports-build from plugins.sbt ...
[info] Loading project definition from /Users/jason/source/bug-reports/project
[info] Loading settings for project bug-reports from build.sbt ...
[info] Set current project to bug-reports (in build file:/Users/jason/source/bug-reports/)
[info] Full optimizing /Users/jason/source/bug-reports/target/scala-2.13/bug-reports-opt.js
[info] Closure: 0 error(s), 0 warning(s)
[error] java.lang.NullPointerException
[error] 	at com.google.javascript.jscomp.SourceFile.findLineOffsets(SourceFile.java:134)
[error] 	at com.google.javascript.jscomp.SourceFile.getLineOffset(SourceFile.java:114)
[error] 	at com.google.javascript.rhino.Node.getSourceOffset(Node.java:1554)
[error] 	at com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter.getNumberFromSource(CodePrinter.java:535)
[error] 	at com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter.addNumber(CodePrinter.java:326)
[error] 	at com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:333)
[error] 	at com.google.javascript.jscomp.CodeGenerator.addExpr(CodeGenerator.java:1613)
[error] 	at com.google.javascript.jscomp.CodeGenerator.unrollBinaryOperator(CodeGenerator.java:1478)
[error] 	at com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:152)
[error] 	at com.google.javascript.jscomp.CodeGenerator.addExpr(CodeGenerator.java:1610)
[error] 	at com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:345)
[error] 	at com.google.javascript.jscomp.CodeGenerator.addExpr(CodeGenerator.java:1610)
[error] 	at com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:793)
[error] 	at com.google.javascript.jscomp.CodeGenerator.addExpr(CodeGenerator.java:1613)
[error] 	at com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:859)
[error] 	at com.google.javascript.jscomp.CodeGenerator.addExpr(CodeGenerator.java:1613)
[error] 	at com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:286)
[error] 	at com.google.javascript.jscomp.CodeGenerator.addExpr(CodeGenerator.java:1613)
[error] 	at com.google.javascript.jscomp.CodeGenerator.addList(CodeGenerator.java:1652)
[error] 	at com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:233)
[error] 	at com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:662)
[error] 	at com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:104)
[error] 	at com.google.javascript.jscomp.CodeGenerator.addFunction(CodeGenerator.java:1421)
[error] 	at com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:403)
[error] 	at com.google.javascript.jscomp.CodeGenerator.addExpr(CodeGenerator.java:1613)
[error] 	at com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:150)
[error] 	at com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:976)
[error] 	at com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:662)
[error] 	at com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:104)
[error] 	at com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:878)
[error] 	at com.google.javascript.jscomp.CodePrinter.access$300(CodePrinter.java:40)
[error] 	at com.google.javascript.jscomp.CodePrinter$Builder.build(CodePrinter.java:813)
[error] 	at com.google.javascript.jscomp.Compiler.toSource(Compiler.java:2240)
[error] 	at com.google.javascript.jscomp.Compiler.lambda$toSource$9(Compiler.java:2201)
[error] 	at com.google.javascript.jscomp.CompilerExecutor.runInCompilerThread(CompilerExecutor.java:129)
[error] 	at com.google.javascript.jscomp.Compiler.runInCompilerThread(Compiler.java:807)
[error] 	at com.google.javascript.jscomp.Compiler.toSource(Compiler.java:2163)
[error] 	at com.google.javascript.jscomp.Compiler.lambda$toSource$7(Compiler.java:2120)
[error] 	at com.google.javascript.jscomp.CompilerExecutor$2.call(CompilerExecutor.java:102)
[error] 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
[error] 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
[error] 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
[error] 	at java.base/java.lang.Thread.run(Thread.java:834)
[error] (Compile / fullOptJS) java.lang.NullPointerException
[error] Total time: 3 s, completed 9/12/2020, 6:45:29 PM
```
