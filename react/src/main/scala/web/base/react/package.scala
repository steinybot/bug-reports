package web.base

import scala.scalajs.js.|

package object react {

  opaque type Stable[A] = A

  object Stable {
    implicit def from[A](value: A)(implicit isStable: IsStable[A, A]): Stable[A] = ???
  }

  sealed trait IsStable[A, B]

  object IsStable {
    implicit def orNullIsStable[A, B]: IsStable[A | Null, B | Null] = ???
  }
}
