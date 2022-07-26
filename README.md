# Bug Reports

> ⚠️ If you were linked to this repository from a bug report then you are on the wrong branch.
> Checkout the branch that relates to the specific bug.

This reproduces the bug for TODO.

## Steps to Reproduce

1. Open IntelliJ and import the project as a BSP project (sbt).
2. Open [Main].
3. Click the ▶️ icon in the gutter.

It will fail with:

> Error running 'Main':
> Cannot start process, the working directory 'file:/Users/bob/src/bug-reports' does not exist

[main]: /src/main/scala/Main.scala
