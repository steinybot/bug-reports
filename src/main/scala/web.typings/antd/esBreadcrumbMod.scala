package web.typings.antd

import web.typings.antd.anon.FCBreadcrumbItemPropsANTB
import web.typings.antd.anon.FCchildrenReactNodeundefi
import web.typings.antd.esBreadcrumbBreadcrumbMod.BreadcrumbProps
import web.typings.antd.esUtilTypeMod.AnyObject
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esBreadcrumbMod {
  
  object default {
    
    @scala.inline
    def apply[T /* <: AnyObject */](props: BreadcrumbProps[T]): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("antd/es/breadcrumb", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/es/breadcrumb", "default.Item")
    @js.native
    def Item: FCBreadcrumbItemPropsANTB = js.native
    @scala.inline
    def Item_=(x: FCBreadcrumbItemPropsANTB): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/breadcrumb", "default.Separator")
    @js.native
    def Separator: FCchildrenReactNodeundefi = js.native
    @scala.inline
    def Separator_=(x: FCchildrenReactNodeundefi): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Separator")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/breadcrumb", "default.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
