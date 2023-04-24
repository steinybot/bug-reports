import scala.reflect.macros.blackbox

object MacroImpl {

  def focus_impl[A, B: c.WeakTypeTag](
    c: blackbox.Context
  )(path: c.Expr[A => B])(bob: c.Expr[Bob[B]]): c.Expr[Unit] = {
    import c.universe._

    val subj = c.prefix.tree

    val _ = bob

    c.Expr[Unit](q"""()""")
  }
}
