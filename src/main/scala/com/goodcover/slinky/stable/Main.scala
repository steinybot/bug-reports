package com.goodcover.slinky.stable

sealed trait ImplicitlyStable[-A, +B]

object ImplicitlyStable {

  implicit def convertibleToStable[A, B](implicit
                                         aToB: A => B,
                                         bToB: ImplicitlyStable[B, B]
                                        ): ImplicitlyStable[A, B] = ???
}

object Test {

  def testConvertibleToStable[A, B](implicit
                                    aToB: A => B,
                                    bToB: ImplicitlyStable[B, B]
                                   ): ImplicitlyStable[A, B] =
    implicitly[ImplicitlyStable[A, B]]
}
