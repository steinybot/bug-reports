package web.typings.rcImage

import web.typings.rcImage.anon.OmitInternalItemcanPrevie
import web.typings.rcImage.libInterfaceMod.ImageElementProps
import web.typings.rcImage.libInterfaceMod.RegisterImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUsePreviewItemsMod {
  
  @JSImport("rc-image/lib/hooks/usePreviewItems", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): js.Tuple2[/* items */ Items, /* registerImage */ RegisterImage] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Tuple2[/* items */ Items, /* registerImage */ RegisterImage]]
  @scala.inline
  def default(items: js.UndefOr[js.Array[String | ImageElementProps]]): js.Tuple2[/* items */ Items, /* registerImage */ RegisterImage] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[/* items */ Items, /* registerImage */ RegisterImage]]
  
  type Items = js.Array[OmitInternalItemcanPrevie]
}
