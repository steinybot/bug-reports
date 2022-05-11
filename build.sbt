scalaVersion := "2.13.8"

Compile / sourceManaged := file("src_managed")

Compile / sourceGenerators += Def.task {
  val file = (Compile / sourceManaged).value / "demo" / "Test.scala"
  IO.write(file, """object Test extends App { println("Hi") }""")
  Seq(file)
}.taskValue

Compile / sourceGenerators += Def.task {
  val f = file("src_managed2") / "demo" / "Test2.scala"
  IO.write(f, """object Test2 extends App { println("Hi 2") }""")
  Seq(f)
}.taskValue
