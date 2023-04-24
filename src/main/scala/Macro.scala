import scala.language.experimental.macros
import scala.reflect.macros.blackbox

trait Bob[A]

object MacroImpl {

  def myMacroImpl[B](
    c: blackbox.Context
  )()(bob: c.Expr[Bob[B]]): c.Expr[Unit] = {
    import c.universe._
    c.Expr[Unit](q"""()""")
  }
}

object Macro {

  def myMacro[B]()(implicit bob: Bob[B]): Unit = macro MacroImpl.myMacroImpl[B]
}
