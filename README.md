# Bug Reports

This reproduces the bug for TODO.

## Steps to Reproduce

1. `sbt runIt`

## Expected

```text
sbt:bug-reports> runIt
Gotcha!
[success] Total time: 0 s, completed 8/04/2021, 1:41:54 PM```

## Actual

```text
sbt:bug-reports> runIt
[info] compiling 1 Scala source to /Users/jason/source/bug-reports/target/scala-2.12/classes ...
[info] Non-compiled module 'compiler-bridge_2.12' for Scala 2.12.13. Compiling...
[info]   Compilation completed in 11.305s.
[info] running foo
[error] (run-main-0) java.lang.ClassNotFoundException: foo
[success] Total time: 12 s, completed 8/04/2021, 1:42:18 PM
```
