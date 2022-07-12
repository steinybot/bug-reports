def foo(id: ModuleID): Def.Initialize[ModuleID] = Def.setting(id)

libraryDependencies ++= Seq.empty[ModuleID].map(foo(_).value)
