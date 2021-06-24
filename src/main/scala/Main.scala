object Main extends App {

  final case class Config()

  import scopt.OParser
  val builder = OParser.builder[Config]
  val parser = {
    import builder._
    OParser.sequence(
      cmd("foo")
        .children(
          cmd("bar")
            .children(
              arg[String]("barArg")
            ),
          cmd("baz")
            .children(
              arg[String]("bazArg")
            )
        )
    )
  }

  OParser.parse(parser, args, Config()) match {
    case Some(config) => println(config)
    case _ => ()
  }
}
