import scala.language.experimental.macros
import scala.reflect.macros.blackbox

trait Bob[B] {}

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

final case class Slot[A] protected (
  get: A,
  private val _modify: (A => A) => Unit,
  private val _getNow: () => A,
  private val _onModify: (A, A) => Unit
) {

  /** Create a new slot by focusing down a path of sub fields. */
  def focus[B](path: A => B)(implicit bob: Bob[B]): Slot[B] = macro MacroImpl.focus_impl[A, B]
}
