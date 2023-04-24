import scala.language.experimental.macros

final case class Slot[A] protected (
  get: A,
  private val _modify: (A => A) => Unit,
  private val _getNow: () => A,
  private val _onModify: (A, A) => Unit
) {

  /** Create a new slot by focusing down a path of sub fields. */
  def focus[B](path: A => B)(implicit bob: Bob[B]): Slot[B] = macro SlotMacroImpl.focus_impl[Slot, A, B]
}
