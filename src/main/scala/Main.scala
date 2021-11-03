object Main {

  /// Shapeless

  trait Lazy[T]

  object Lazy {
    implicit def apply[T](t: => T): Lazy[T] = ???
  }

  /// Newtype

  trait Coercible[A]

  /// Slinky

  trait FunctionalComponentName

  object FunctionalComponentName {
    implicit def get: FunctionalComponentName = ???
  }

  object FunctionalComponent {
    def apply[P](fn: P => Any)(implicit name: FunctionalComponentName): Any =
      ???
  }

  ///

  val component: Any = FunctionalComponent[Unit] { _ =>
    IsStable.stableUnion[Unit](
      IsStable.unitIsStable
    )
  }

  type Stable[A] = Stable.Type[A]

  object Stable {

    type Base[A] = A

    type Type[A] <: Base[A]

    implicit def from[A, B](value: A)(implicit
        isStable: IsStable[A]
    ): Stable[B] = ???
  }

  trait IsStable[A] extends Coercible[Stable[A]]

  object IsStable extends LowPriorityIsStableImplicits {

    implicit def stableUnion[A](implicit
        bIsStable: Lazy[IsStable[A]]
    ): IsStable[A] = ???
  }

  trait LowPriorityIsStableImplicits {

    implicit def unitIsStable: IsStable[Unit] = ???

    implicit def transitiveIsStable[A](implicit
        aToB: IsStable[A]
    ): IsStable[A] = ???
  }
}
