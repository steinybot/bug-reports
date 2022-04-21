package com.goodcover.slinky.stable

import scala.annotation.unused

final case class Stable[+A] private(unwrap: A)

sealed trait ImplicitlyStable[-A, +B]

object ImplicitlyStable {

  @inline implicit def convertibleToStable[A, B](implicit
                                                 @unused aToB: A => B,
                                                 @unused bToB: ImplicitlyStable[B, B],
                                                ): ImplicitlyStable[A, B] = ???
}

object Test {

  @inline def testConvertibleToStable[A, B](implicit aToB: A => B, @unused bToB: ImplicitlyStable[B, B]): ImplicitlyStable[A, B] =
    implicitly
}
