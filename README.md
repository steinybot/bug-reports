# Bug Reports

This reproduces the bug for https://github.com/scala-js/scala-js/issues/4325.

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
[info] Full optimizing /Users/jason/source/bug-reports/target/scala-2.13/bug-reports-opt
[info] Closure: 0 error(s), 0 warning(s)
[error] java.lang.NullPointerException
[error] 	at com.google.javascript.jscomp.SourceFile.findLineOffsets(SourceFile.java:132)
[error] 	at com.google.javascript.jscomp.SourceFile.getLineOffset(SourceFile.java:112)
[error] 	at com.google.javascript.rhino.Node.getSourceOffset(Node.java:1646)
[error] 	at com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter.getNumberFromSource(CodePrinter.java:535)
[error] 	at com.google.javascript.jscomp.CodePrinter$PrettyCodePrinter.addNumber(CodePrinter.java:326)
[error] 	at com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:353)
[error] 	at com.google.javascript.jscomp.CodeGenerator.addExpr(CodeGenerator.java:1753)
[error] 	at com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:306)
[error] 	at com.google.javascript.jscomp.CodeGenerator.addExpr(CodeGenerator.java:1753)
[error] 	at com.google.javascript.jscomp.CodeGenerator.addList(CodeGenerator.java:1810)
[error] 	at com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:253)
[error] 	at com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:717)
[error] 	at com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:113)
[error] 	at com.google.javascript.jscomp.CodeGenerator.addAllSiblings(CodeGenerator.java:1908)
[error] 	at com.google.javascript.jscomp.CodeGenerator.addCaseBody(CodeGenerator.java:1902)
[error] 	at com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:1242)
[error] 	at com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:113)
[error] 	at com.google.javascript.jscomp.CodeGenerator.addAllSiblings(CodeGenerator.java:1908)
[error] 	at com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:1234)
[error] 	at com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:693)
[error] 	at com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:113)
[error] 	at com.google.javascript.jscomp.CodeGenerator.addFunction(CodeGenerator.java:1561)
[error] 	at com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:428)
[error] 	at com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:693)
[error] 	at com.google.javascript.jscomp.CodeGenerator.add(CodeGenerator.java:113)
[error] 	at com.google.javascript.jscomp.CodePrinter.toSource(CodePrinter.java:843)
[error] 	at com.google.javascript.jscomp.CodePrinter.access$300(CodePrinter.java:40)
[error] 	at com.google.javascript.jscomp.CodePrinter$Builder.build(CodePrinter.java:778)
[error] 	at com.google.javascript.jscomp.Compiler.toSource(Compiler.java:2294)
[error] 	at com.google.javascript.jscomp.Compiler.lambda$toSource$11(Compiler.java:2255)
[error] 	at com.google.javascript.jscomp.CompilerExecutor.runInCompilerThread(CompilerExecutor.java:129)
[error] 	at com.google.javascript.jscomp.Compiler.runInCompilerThread(Compiler.java:843)
[error] 	at com.google.javascript.jscomp.Compiler.toSource(Compiler.java:2217)
[error] 	at com.google.javascript.jscomp.Compiler.lambda$toSource$9(Compiler.java:2174)
[error] 	at com.google.javascript.jscomp.CompilerExecutor$2.call(CompilerExecutor.java:102)
[error] 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
[error] 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
[error] 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
[error] 	at java.base/java.lang.Thread.run(Thread.java:834)
[error] (Compile / fullLinkJS) java.lang.NullPointerException
[error] Total time: 3 s, completed 9/12/2020, 6:51:41 PM
```
