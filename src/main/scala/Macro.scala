import scala.language.experimental.macros
import scala.reflect.macros.blackbox

trait F[A]

object MacroImpl {

  def myMacroImpl(c: blackbox.Context)()(bob: c.Expr[F[_]]): c.Expr[Unit] = {
    import c.universe._
    c.Expr[Unit](q"""()""")
  }
}

object Macro {

  def myMacro[B]()(implicit bob: F[B]): Unit = macro MacroImpl.myMacroImpl
}
