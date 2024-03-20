package example

object Main extends App {

//  val titleHandle = new TitleHandle {
//    override def title(m: UIMatch[Any, Any]): UndefOr[String] = "My Title"
//  }
//  val freshchatHandle = FreshchatHandle(js.Array("claims-page"))
//  val combination =  combineObjects[js.Object, FreshchatHandle](titleHandle.asInstanceOf[js.Object], freshchatHandle)
//  TitleHandle.fromAny(combination).foreach(h => println(h.title(null)))

  val handle = AllPages.FnolPage.handle
  val titleHandle = TitleHandle.fromAny(handle)
  println(titleHandle.get.title())
}
