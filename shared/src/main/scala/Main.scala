object Child extends App with Parent {

  override def childMethod: OneTypeParam[_] = ???

  parentMethod
}

trait Parent {

  type L = TwoTypeParam[_, _]

  def childMethod: L

  def parentMethod: Any = childMethod
}

trait TwoTypeParam[X, Y]

class OneTypeParam[X] extends TwoTypeParam[X, Any]
