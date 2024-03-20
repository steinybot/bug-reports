package example

import scala.scalajs.js
import scala.scalajs.js.JSConverters.JSRichOption
import scala.scalajs.js.UndefOr

final class MergeObjectOps[A <: js.Object](private val obj: A) extends AnyVal {

  def applyOverrides(overrides: Override*): A = {
    Options.applyOverrides(obj, overrides: _*)
  }

  def combineObjects[B <: js.Object](second: B): A with B = {
    Options.combineObjects[A, B](obj, second)
  }
}

final class OptionOps[A](private val option: Option[A]) extends AnyVal {

  @inline def convert[B](implicit conv: A => B): Option[B] =
    option.map(conv)
}

@js.native
trait Override extends js.Object

object Override {

  @inline implicit def fromObject(obj: js.Object): Override           = obj.asInstanceOf[Override]
  @inline implicit def fromUndefOr(obj: UndefOr[js.Object]): Override = obj.asInstanceOf[Override]
//  @inline implicit def fromOrNull(obj: OrNull[js.Object]): Override   = obj.asInstanceOf[Override]
  @inline implicit def fromOption(obj: Option[js.Object]): Override   = obj.orUndefined
}

trait Options {

  implicit def mergeObjectOps[A <: js.Object](obj: A): MergeObjectOps[A] = new MergeObjectOps[A](obj)

  implicit def toOptionSyntax[A](option: Option[A]): OptionOps[A] = new OptionOps[A](option)

  /** Applies overrides onto a default object.
    *
    * @param default
    *   the default object
    * @param overrides
    *   overrides applied from left to right
    * @tparam A
    *   the type of the default object
    * @return
    *   the default object with all the overrides
    * @see
    *   [[combineObjects]]
    */
  def applyOverrides[A <: js.Object](default: A, overrides: Override*): A = {
    val result = js.Object.assign(js.Dynamic.literal(), (default +: overrides): _*)
    result.asInstanceOf[A]
  }

  /** Merges two objects into an object containing the properties of both objects.
    *
    * Properties from the second object will override properties from the first object.
    *
    * @param first
    *   the first object
    * @param second
    *   the second object
    * @tparam A
    *   the type of the first object
    * @tparam B
    *   the type of the second object
    * @return
    *   the combination of both objects
    * @see
    *   [[applyOverrides]]
    */
  def combineObjects[A <: js.Object, B <: js.Object](first: A, second: B): A with B = {
    val result = js.Object.assign(js.Dynamic.literal(), first, second)
    result.asInstanceOf[A with B]
  }
}

object Options extends Options
