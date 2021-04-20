# Bug Reports

> ⚠️ If you were linked to this repository from a bug report then you are on the wrong branch.
> Checkout the branch that relates to the specific bug.

This reproduces the bug for https://youtrack.jetbrains.com/issue/SCL-18952.

## Steps to Reproduce

1. Run:
   
   ```shell
   sbt run
   ```
   
   > ℹ️ Note that it runs successfully and prints `5`.

1. Import into IntelliJ as an sbt project.
1. Run the `Main` class.
