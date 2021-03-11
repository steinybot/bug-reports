case class PreparedLayout(typeFullName: Any, name: String, layout: Layout[_, _, _], readOnly: Boolean, varsState: Any) {

  def copy2(layout: Layout[_, _, _]): PreparedLayout = copy(layout = layout)
}
