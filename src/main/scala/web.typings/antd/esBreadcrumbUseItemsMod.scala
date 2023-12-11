package web.typings.antd

import web.typings.antd.anon.PartialMergedTypeBreadcru
import web.typings.antd.esBreadcrumbBreadcrumbMod.BreadcrumbItemType
import web.typings.antd.esBreadcrumbBreadcrumbMod.ItemType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esBreadcrumbUseItemsMod {
  
  @JSImport("antd/es/breadcrumb/useItems", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): js.Array[PartialMergedTypeBreadcru] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Array[PartialMergedTypeBreadcru] | Null]
  @scala.inline
  def default(items: js.Array[ItemType]): js.Array[PartialMergedTypeBreadcru] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[PartialMergedTypeBreadcru] | Null]
  @scala.inline
  def default(items: js.Array[ItemType], routes: js.Array[ItemType]): js.Array[PartialMergedTypeBreadcru] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any], routes.asInstanceOf[js.Any])).asInstanceOf[js.Array[PartialMergedTypeBreadcru] | Null]
  @scala.inline
  def default(items: Unit, routes: js.Array[ItemType]): js.Array[PartialMergedTypeBreadcru] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any], routes.asInstanceOf[js.Any])).asInstanceOf[js.Array[PartialMergedTypeBreadcru] | Null]
  
  @js.native
  trait MergedType
    extends StObject
       with BreadcrumbItemType
  object MergedType {
    
    @scala.inline
    def apply(): MergedType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergedType]
    }
  }
}
