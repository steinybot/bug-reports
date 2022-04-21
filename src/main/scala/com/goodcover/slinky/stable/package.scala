package com.goodcover.slinky

import io.estatico.newtype.macros.newsubtype

package object stable {

  @newsubtype final case class Stable[+A] private(unwrap: A)
}

