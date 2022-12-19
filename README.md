# Bug Reports

This reproduces the bug for https://github.com/japgolly/scalajs-react/issues/1080.

## Steps to Reproduce

1. Run `sbt`
1. Run the sbt task `fastOptJS/startWebpackDevServer`
1. Run the sbt task `~fastOptJS`
1. Go to http://localhost:8081
