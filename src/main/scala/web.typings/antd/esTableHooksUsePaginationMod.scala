package web.typings.antd

import web.typings.antd.antdBooleans.`false`
import web.typings.antd.esTableInterfaceMod.TablePaginationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTableHooksUsePaginationMod {
  
  @JSImport("antd/es/table/hooks/usePagination", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(total: Double, onChange: js.Function2[/* current */ Double, /* pageSize */ Double, Unit]): js.Tuple2[
    TablePaginationConfig, 
    js.Function2[/* current */ js.UndefOr[Double], /* pageSize */ js.UndefOr[Double], Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(total.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    TablePaginationConfig, 
    js.Function2[/* current */ js.UndefOr[Double], /* pageSize */ js.UndefOr[Double], Unit]
  ]]
  @scala.inline
  def default(
    total: Double,
    onChange: js.Function2[/* current */ Double, /* pageSize */ Double, Unit],
    pagination: TablePaginationConfig
  ): js.Tuple2[
    TablePaginationConfig, 
    js.Function2[/* current */ js.UndefOr[Double], /* pageSize */ js.UndefOr[Double], Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(total.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], pagination.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    TablePaginationConfig, 
    js.Function2[/* current */ js.UndefOr[Double], /* pageSize */ js.UndefOr[Double], Unit]
  ]]
  
  @JSImport("antd/es/table/hooks/usePagination", "DEFAULT_PAGE_SIZE")
  @js.native
  val DEFAULT_PAGE_SIZE: /* 10 */ Double = js.native
  
  @scala.inline
  def default_false(
    total: Double,
    onChange: js.Function2[/* current */ Double, /* pageSize */ Double, Unit],
    pagination: `false`
  ): js.Tuple2[
    TablePaginationConfig, 
    js.Function2[/* current */ js.UndefOr[Double], /* pageSize */ js.UndefOr[Double], Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(total.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], pagination.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    TablePaginationConfig, 
    js.Function2[/* current */ js.UndefOr[Double], /* pageSize */ js.UndefOr[Double], Unit]
  ]]
  
  @scala.inline
  def getPaginationParam(mergedPagination: TablePaginationConfig): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPaginationParam")(mergedPagination.asInstanceOf[js.Any]).asInstanceOf[Any]
  @scala.inline
  def getPaginationParam(mergedPagination: TablePaginationConfig, pagination: TablePaginationConfig): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPaginationParam")(mergedPagination.asInstanceOf[js.Any], pagination.asInstanceOf[js.Any])).asInstanceOf[Any]
  @scala.inline
  def getPaginationParam(mergedPagination: TablePaginationConfig, pagination: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPaginationParam")(mergedPagination.asInstanceOf[js.Any], pagination.asInstanceOf[js.Any])).asInstanceOf[Any]
}
