package com.lightbend.console.refined

import scala.annotation.{implicitAmbiguous, implicitNotFound}

@implicitNotFound("""Could not find an implicit Show for type ${T}, predicate ${P} and result ${R}.
                    | You may want to define it as an implicit function that is polymorphic function over R.""".stripMargin)
@implicitAmbiguous(
  "Found ambiguous implicit Show for type ${T}, predicate ${P} and result ${R}. You should only have for each combination of T and P."
)
trait Show[T, P, R]
