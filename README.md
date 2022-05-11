# Bug Reports

> ⚠️ If you were linked to this repository from a bug report then you are on the wrong branch.
> Checkout the branch that relates to the specific bug.

This reproduces the bug for https://github.com/sbt/sbt/issues/6895.

## Steps to Reproduce

1. `sbt compile;clean`
2. These should not exist:
   - [src_managed/demo/Test.scala](src_managed/demo/Test.scala)
   - [src_managed2/demo/Test2.scala](src_managed2/demo/Test2.scala)
3. `sbt compile;managedSourcePaths/clean`
4. These should not exist:
   - [src_managed/demo/Test.scala](src_managed/demo/Test.scala)
   - [src_managed2/demo/Test2.scala](src_managed2/demo/Test2.scala)
