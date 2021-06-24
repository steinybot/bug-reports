# Bug Reports

> ⚠️ If you were linked to this repository from a bug report then you are on the wrong branch.
> Checkout the branch that relates to the specific bug.

This reproduces the bug for TODO.

## Steps to Reproduce

1. Run:

   ```shell
   sbt run foo bar thing
   ```
   
## Result

```text
Error: Missing argument bazArg
Usage:  [foo] <args>...

Command: foo [bar|baz] barArg bazArg

Command: foo bar

  barArg
Command: foo baz

  bazArg
```
