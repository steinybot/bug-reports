package example

import example.AnySyntax.toAnyOps

import scala.language.{dynamics, implicitConversions}
import scala.scalajs.js
import scala.scalajs.js.UndefOr

final class QuestionMark(val any: Any) extends AnyVal with scala.Dynamic {

  def selectDynamic(name: String): Any =
    any.toDynamic.map(_.selectDynamic(name))

  def applyDynamic(name: String)(args: js.Any*): Any =
    any.toDynamic.map(_.applyDynamic(name)(args: _*))

  def updateDynamic(name: String)(value: js.Any): Unit =
    any.toDynamic.foreach(_.updateDynamic(name)(value))
}

final class AnyOps(val any: Any) extends AnyVal {

  def ? : QuestionMark = new QuestionMark(any)

  def toStr: UndefOr[String] =
    if (any != null && js.typeOf(any) == "string") any.asInstanceOf[String]
    else js.undefined

  def toObject: UndefOr[js.Object] =
    if (any != null && js.typeOf(any) == "object" || js.typeOf(any) == "function") any.asInstanceOf[js.Object]
    else js.undefined

  def toArray[A]: UndefOr[js.Array[A]] =
    if (js.Array.isArray(any)) any.asInstanceOf[js.Array[A]]
    else js.undefined

  def toFunction: UndefOr[js.Function] =
    if (any != null && js.typeOf(any) == "function") any.asInstanceOf[js.Function]
    else js.undefined

  def toFunction0[R]: UndefOr[js.Function0[R]] =
    toFunction.asInstanceOf[UndefOr[js.Function0[R]]]

  def toFunction1[T1, R]: UndefOr[js.Function1[T1, R]] =
    toFunction.asInstanceOf[UndefOr[js.Function1[T1, R]]]

  def toDynamic: UndefOr[js.Dynamic] =
    toObject.map(_.asInstanceOf[js.Dynamic])

  def toDictionary: UndefOr[js.Dictionary[Any]] =
    toObject.map(_.asInstanceOf[js.Dictionary[Any]])
}

trait AnySyntax {
  implicit def toAnyOps(any: Any): AnyOps = new AnyOps(any)
}

object AnySyntax extends AnySyntax
