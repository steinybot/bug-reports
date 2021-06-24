# Bug Reports

This reproduces the bug for https://github.com/scopt/scopt/issues/264.

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
