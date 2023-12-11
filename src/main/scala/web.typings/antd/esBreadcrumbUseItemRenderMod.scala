package web.typings.antd

import web.typings.antd.esBreadcrumbBreadcrumbMod.ItemType
import web.typings.antd.esUtilTypeMod.AnyObject
import web.typings.react.mod.JSX.Element
import web.typings.std.NonNullable
import web.typings.std.ReturnType
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esBreadcrumbUseItemRenderMod {
  
  @JSImport("antd/es/breadcrumb/useItemRender", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): InternalItemRenderParams = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[InternalItemRenderParams]
  @scala.inline
  def default(prefixCls: String, itemRender: ItemRender): InternalItemRenderParams = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], itemRender.asInstanceOf[js.Any])).asInstanceOf[InternalItemRenderParams]
  
  @scala.inline
  def renderItem(prefixCls: String, item: ItemType, children: ReactElement): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("renderItem")(prefixCls.asInstanceOf[js.Any], item.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  @scala.inline
  def renderItem(prefixCls: String, item: ItemType, children: ReactElement, href: String): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("renderItem")(prefixCls.asInstanceOf[js.Any], item.asInstanceOf[js.Any], children.asInstanceOf[js.Any], href.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  
  type AddParameters[TFunction /* <: js.Function1[/* args */ Any, Any] */, TParameters /* <: /* import warning: importer.ImportType#apply c repeated non-array type: any */ /* args */ js.Array[Any] */] = js.Function1[
    /* import warning: importer.ImportType#apply c repeated non-array type: TFunction extends (args : infer P): any ? P : never */ /* args */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: TFunction extends (args : infer P): any ? P : never */ js.Any
    ], 
    ReturnType[TFunction]
  ]
  
  type InternalItemRenderParams = AddParameters[ItemRender, js.Array[/* href */ js.UndefOr[String]]]
  
  type ItemRender = NonNullable[
    js.UndefOr[
      js.Function4[
        /* route */ ItemType, 
        /* params */ AnyObject, 
        /* routes */ js.Array[ItemType], 
        /* paths */ js.Array[String], 
        ReactElement
      ]
    ]
  ]
}
