enablePlugins(SbtPlugin)

scriptedLaunchOpts += "-Dsrc.dir=" + (LocalRootProject / sourceDirectory).value
