def crossPlatform2(id: ModuleID): Def.Initialize[ModuleID] = Def.setting(id)

libraryDependencies ++= Seq.empty[ModuleID].map(crossPlatform2(_).value)
