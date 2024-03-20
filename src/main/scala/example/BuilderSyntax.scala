package example

import example.BuilderSyntax.BuilderOps

import scala.scalajs.js.UndefOr

trait BuilderSyntax {

  @inline final implicit def builderOps[B](builder: B): BuilderOps[B] = new BuilderOps(builder)
}

object BuilderSyntax {

  final implicit class BuilderOps[B](val builder: B) extends AnyVal {

    def setWhen(cond: Boolean)(set: B => B, setUndefined: B => B = _ => builder): B =
      if (cond) set(builder) else setUndefined(builder)

    def setUnless(cond: Boolean)(set: B => B, setUndefined: B => B = _ => builder): B =
      setWhen(!cond)(set, setUndefined)

    def setIfDefined[A](value: UndefOr[A])(set: B => A => B, setUndefined: B => B = _ => builder): B =
      value.fold(setUndefined(builder))(a => set(builder)(a))

    def setIfSome[A](value: Option[A])(set: B => A => B, setUndefined: B => B = _ => builder): B =
      value.fold(setUndefined(builder))(a => set(builder)(a))
  }
}
