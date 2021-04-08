# Bug Reports

This reproduces the bug for https://github.com/kamon-io/sbt-kanela-runner/issues/12.

## Steps to Reproduce

1. `sbt inspect Compile/run/runner`

## Expected

```text
sbt:bug-reports> inspect Compile/run/runner
[info] Task: sbt.ScalaRun
[info] Description:
[info] 	Implementation used to run a main class.
[info] Provided by:
[info] 	ProjectRef(uri("file:/Users/jason/source/bug-reports/"), "bug-reports") / Compile / run / runner
[info] Defined at:
[info] 	Defaults.scala:2566
[info] 	(kamon.instrumentation.sbt.SbtKanelaRunner.projectSettings) SbtKanelaRunner.scala:48
```

## Actual

```text
sbt:bug-reports> inspect Compile/run/runner
[info] Task: sbt.ScalaRun
[info] Description:
[info] 	Implementation used to run a main class.
[info] Provided by:
[info] 	ProjectRef(uri("file:/Users/jason/source/bug-reports/"), "bug-reports") / Compile / run / runner
[info] Defined at:
[info] 	/Users/jason/source/bug-reports/build.sbt:5
```
