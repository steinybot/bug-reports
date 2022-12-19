import japgolly.scalajs.react.extra.router.SetRouteVia.HistoryReplace
import japgolly.scalajs.react.extra.router._
import japgolly.scalajs.react.vdom.html_<^._
import org.scalajs.dom

object Main {

  sealed trait MyPages

  case object Products extends MyPages

  case object AddProduct extends MyPages

  case class ProductInfo(id: Option[Int]) extends MyPages

  private val routerConfig = RouterConfigDsl[MyPages].buildConfig { dsl =>
    import dsl._

    (emptyRule
      | staticRoute("products", Products) ~> render(<.div("Products"))
      | staticRoute("products" / "add", AddProduct) ~> render(<.div("Add Product"))
      | dynamicRouteCT("products" / int.option.caseClass[ProductInfo]) ~> dynRender((info: ProductInfo) => <.div(s"Product ${info.id}"))
      ).notFound(redirectToPage(AddProduct)(HistoryReplace))
  }

  def main(args: Array[String]): Unit = {
    println("Hello world!")

    val baseUrl = BaseUrl("http://localhost:8081/")
    val router = Router(baseUrl, routerConfig)
    router().renderIntoDOM(dom.document.body)
  }
}
