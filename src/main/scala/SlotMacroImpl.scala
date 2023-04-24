import scala.reflect.macros.blackbox

object SlotMacroImpl {

  def focus_impl[Slot[_], A, B: c.WeakTypeTag](
    c: blackbox.Context
  )(path: c.Expr[A => B])(bob: c.Expr[Bob[B]]): c.Expr[Slot[B]] = {
    import c.universe._

    val subj = c.prefix.tree

    val _ = bob

    c.Expr[Slot[B]](q"""$subj.refocus(_root_.monocle.macros.GenLens[${c.weakTypeOf[A]}]($path))""")
  }
}
