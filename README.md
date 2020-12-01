# Bug Reports

This reproduces the bug for TODO.

## Reproduction

1. Run:
   ```shell
   sbt ';reload plugins; updateClassifiers'
   ```
1. Open the sbt project in IntelliJ
   > Leave `sbt sources` option disabled even though it currently makes no difference because of
   > [SCL17825](https://youtrack.jetbrains.com/issue/SCL-17825).
1. Open a random class from Commons Lang like `RandomStringUtils`
1. In the project view, right-click on `commons-lang3-3.11.jar`
1. Select `Open In -> Finder` (or whatever your OS equivalent is)
1. Back in `RandomStringUtils.class` click `Choose Sources...`
1. Switch back to the previous file explorer
1. Drag `commons-lang3-3.11-sources.jar` onto IntelliJ's file chooser
1. Select the sources JAR

## Expected

The sources are attached and `RandomStringUtils.class` would be replaced with `RandomStringUtils.java`.

## Actual

Nothing happens.
