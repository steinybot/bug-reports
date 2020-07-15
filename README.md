# Bug Reports

This reproduces the bug for https://youtrack.jetbrains.com/issue/IDEA-246001.

## Reproduction

1. Import the SBT project
1. Enable the download of library sources in the SBT settings

### Navigate to Class

1. Navigate to class `BodyParsers`
1. Select the `2.8.1` version

Notice how it will open the `2.8.2` version (if not try the opposite way around).

### Project View

1. In the Project View expand:
  1. `External libraries`
  1. `sbt: com.typesafe.play:play_2.12:2.8.1:jar`
  1. `play_2.12-2.8.1.jar`
  1. `play`
  1. `api`
1. Open `BodyParsers`

Notice how it will open the `2.8.2` version (if not try the opposite way around).
