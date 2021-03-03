# Bug Reports

> ⚠️ If you were linked to this repository from a bug report then you are on the wrong branch.
> Checkout the branch that relates to the specific bug.

This reproduces the bug for TODO.

## Steps to Reproduce

1. `sbt run`
1. Press CTRL+C

```text
sbt:bug-reports> run
[info] Compiling 1 Scala source to /Users/jason/source/bug-reports/target/scala-2.13/classes ...
[info] running Main
Kill me!
Kill me!
Kill me!

[warn] Canceling execution...
[error] Total time: 3 s, completed 3/03/2021, 12:54:34 PM
sbt:bug-reports> Kill me!
Kill me!
Kill me!
Kill me!
Kill me!
Kill me!
```
