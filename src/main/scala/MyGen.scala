object MyGen {

  trait R[+T] {
    def sieve[U >: T]: U => Boolean = _ => true
    protected def result: Option[T]

    def retrieve: Option[T] = result.filter(sieve)

    def copy[U >: T](s: U => Boolean = this.sieve,
                     r: Option[U] = this.result): R[U] = new R[U] {
      override def sieve[V >: U] = { (x: Any) =>
        try s(x.asInstanceOf[U])
        catch { case _: java.lang.ClassCastException => false }
      }
      val result = r
    }
  }

  def r[T](r: Option[T]): R[T] = new R[T] {
    val result = r
  }
}
