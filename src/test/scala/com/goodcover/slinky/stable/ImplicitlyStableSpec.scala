package com.goodcover.slinky.stable

import scala.annotation.unused

object ImplicitlyStableSpec {

  @inline def testConvertibleToStable[A, B](implicit aToB: A => B, @unused bToB: ImplicitlyStable[B, B]): ImplicitlyStable[A, B] =
    implicitly

}
