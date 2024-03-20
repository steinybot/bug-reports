# Bug Reports

> ⚠️ If you were linked to this repository from a bug report then you are on the wrong branch.
> Checkout the branch that relates to the specific bug.

This reproduces the bug for TODO.

## Steps to Reproduce

1. 
   ```shell
   sbt run
   ```

Fails with:
```text
sbt:bug-reports> run
[info] compiling 1 Scala source to /Users/jason/src/bug-reports/target/scala-2.13/classes ...
[info] Fast optimizing /Users/jason/src/bug-reports/target/scala-2.13/bug-reports-fastopt
[info] Running example.Main.
TypeError: Cannot read properties of undefined (reading 'routeTitle$1')
    at Object.title (file:///Users/jason/src/bug-reports/target/scala-2.13/bug-reports-fastopt/example.-Main$.js:33:232)
    at $c_Lexample_Main$.delayedEndpoint$example$Main$1__V (file:///Users/jason/src/bug-reports/target/scala-2.13/bug-reports-fastopt/example.-Main$.js:39:104)
    at $c_Lexample_Main$delayedInit$body.apply__O (file:///Users/jason/src/bug-reports/target/scala-2.13/bug-reports-fastopt/example.-Main$delayed-Init$body.js:18:110)
    at Module.$f_s_App__main__AT__V (file:///Users/jason/src/bug-reports/target/scala-2.13/bug-reports-fastopt/internal-3ebfae0cba70adf981029a0da5b1e4b5ab5d02c6.js:2037:12)
    at Module.$s_Lexample_Main__main__AT__V (file:///Users/jason/src/bug-reports/target/scala-2.13/bug-reports-fastopt/example.-Main.js:6:60)
    at file:///Users/jason/src/bug-reports/target/scala-2.13/bug-reports-fastopt/main.js:4:26
    at ModuleJob.run (node:internal/modules/esm/module_job:222:25)
    at async ModuleLoader.import (node:internal/modules/esm/loader:323:24)
[error] org.scalajs.jsenv.ExternalJSRun$NonZeroExitException: exited with code 1
[error] 	at org.scalajs.jsenv.ExternalJSRun$$anon$1.run(ExternalJSRun.scala:200)
[error] stack trace is suppressed; run last Compile / run for the full output
[error] (Compile / run) org.scalajs.jsenv.ExternalJSRun$NonZeroExitException: exited with code 1
[error] Total time: 3 s, completed 21/03/2024, 12:13:20 pm
```