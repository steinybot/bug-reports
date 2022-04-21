package com.goodcover.slinky.stable

import scala.annotation.unused

sealed trait ImplicitlyStable[-A, +B] {
  @inline final def apply(a: A): Stable[B] = a.asInstanceOf[Stable[B]]
}

object ImplicitlyStable {

  @inline implicit def convertibleToStable[A, B](implicit
                                                 @unused aToB: A => B,
                                                 @unused bToB: ImplicitlyStable[B, B],
                                                ): ImplicitlyStable[A, B] = ???
}
