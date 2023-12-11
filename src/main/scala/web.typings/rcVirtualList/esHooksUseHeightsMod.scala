package web.typings.rcVirtualList

import web.typings.rcVirtualList.esInterfaceMod.GetKey
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseHeightsMod {
  
  @JSImport("rc-virtual-list/es/hooks/useHeights", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](getKey: GetKey[T]): js.Tuple4[
    /* setInstanceRef */ js.Function2[/* item */ T, /* instance */ HTMLElement, Unit], 
    /* collectHeight */ js.Function1[/* sync */ js.UndefOr[Boolean], Unit], 
    /* cacheMap */ web.typings.rcVirtualList.esUtilsCacheMapMod.default, 
    /* updatedMark */ Double
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(getKey.asInstanceOf[js.Any]).asInstanceOf[js.Tuple4[
    /* setInstanceRef */ js.Function2[/* item */ T, /* instance */ HTMLElement, Unit], 
    /* collectHeight */ js.Function1[/* sync */ js.UndefOr[Boolean], Unit], 
    /* cacheMap */ web.typings.rcVirtualList.esUtilsCacheMapMod.default, 
    /* updatedMark */ Double
  ]]
  @scala.inline
  def default[T](getKey: GetKey[T], onItemAdd: js.Function1[/* item */ T, Unit]): js.Tuple4[
    /* setInstanceRef */ js.Function2[/* item */ T, /* instance */ HTMLElement, Unit], 
    /* collectHeight */ js.Function1[/* sync */ js.UndefOr[Boolean], Unit], 
    /* cacheMap */ web.typings.rcVirtualList.esUtilsCacheMapMod.default, 
    /* updatedMark */ Double
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(getKey.asInstanceOf[js.Any], onItemAdd.asInstanceOf[js.Any])).asInstanceOf[js.Tuple4[
    /* setInstanceRef */ js.Function2[/* item */ T, /* instance */ HTMLElement, Unit], 
    /* collectHeight */ js.Function1[/* sync */ js.UndefOr[Boolean], Unit], 
    /* cacheMap */ web.typings.rcVirtualList.esUtilsCacheMapMod.default, 
    /* updatedMark */ Double
  ]]
  @scala.inline
  def default[T](
    getKey: GetKey[T],
    onItemAdd: js.Function1[/* item */ T, Unit],
    onItemRemove: js.Function1[/* item */ T, Unit]
  ): js.Tuple4[
    /* setInstanceRef */ js.Function2[/* item */ T, /* instance */ HTMLElement, Unit], 
    /* collectHeight */ js.Function1[/* sync */ js.UndefOr[Boolean], Unit], 
    /* cacheMap */ web.typings.rcVirtualList.esUtilsCacheMapMod.default, 
    /* updatedMark */ Double
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(getKey.asInstanceOf[js.Any], onItemAdd.asInstanceOf[js.Any], onItemRemove.asInstanceOf[js.Any])).asInstanceOf[js.Tuple4[
    /* setInstanceRef */ js.Function2[/* item */ T, /* instance */ HTMLElement, Unit], 
    /* collectHeight */ js.Function1[/* sync */ js.UndefOr[Boolean], Unit], 
    /* cacheMap */ web.typings.rcVirtualList.esUtilsCacheMapMod.default, 
    /* updatedMark */ Double
  ]]
  @scala.inline
  def default[T](getKey: GetKey[T], onItemAdd: Unit, onItemRemove: js.Function1[/* item */ T, Unit]): js.Tuple4[
    /* setInstanceRef */ js.Function2[/* item */ T, /* instance */ HTMLElement, Unit], 
    /* collectHeight */ js.Function1[/* sync */ js.UndefOr[Boolean], Unit], 
    /* cacheMap */ web.typings.rcVirtualList.esUtilsCacheMapMod.default, 
    /* updatedMark */ Double
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(getKey.asInstanceOf[js.Any], onItemAdd.asInstanceOf[js.Any], onItemRemove.asInstanceOf[js.Any])).asInstanceOf[js.Tuple4[
    /* setInstanceRef */ js.Function2[/* item */ T, /* instance */ HTMLElement, Unit], 
    /* collectHeight */ js.Function1[/* sync */ js.UndefOr[Boolean], Unit], 
    /* cacheMap */ web.typings.rcVirtualList.esUtilsCacheMapMod.default, 
    /* updatedMark */ Double
  ]]
}
