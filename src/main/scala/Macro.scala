import scala.language.experimental.macros
import scala.reflect.macros.blackbox

trait Bob[A]

object MacroImpl {

  def myMacroImpl[A, B](
    c: blackbox.Context
  )()(bob: c.Expr[Bob[B]]): c.Expr[Unit] = {
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

  def myMacro[B]()(implicit bob: Bob[B]): Slot[B] = macro MacroImpl.myMacroImpl[A, B]
}
