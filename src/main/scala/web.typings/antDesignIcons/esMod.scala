package web.typings.antDesignIcons

import web.typings.antDesignIcons.anon.PickIconComponentPropssta
import web.typings.antDesignIcons.esComponentsContextMod.IconContextProps
import web.typings.antDesignIcons.esComponentsIconFontMod.CustomIconOptions
import web.typings.antDesignIcons.esComponentsIconFontMod.IconFontProps
import web.typings.antDesignIcons.esComponentsTwoTonePrimaryColorMod.TwoToneColor
import web.typings.react.mod.Provider
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMod {
  
  @JSImport("@ant-design/icons/es", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/icons/es", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PickIconComponentPropssta] = js.native
  
  @JSImport("@ant-design/icons/es", "IconProvider")
  @js.native
  val IconProvider: Provider[IconContextProps] = js.native
  
  @scala.inline
  def createFromIconfontCN[T /* <: String */](): ReactComponentClass[IconFontProps[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromIconfontCN")().asInstanceOf[ReactComponentClass[IconFontProps[T]]]
  @scala.inline
  def createFromIconfontCN[T /* <: String */](options: CustomIconOptions): ReactComponentClass[IconFontProps[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromIconfontCN")(options.asInstanceOf[js.Any]).asInstanceOf[ReactComponentClass[IconFontProps[T]]]
  
  @scala.inline
  def getTwoToneColor(): TwoToneColor = ^.asInstanceOf[js.Dynamic].applyDynamic("getTwoToneColor")().asInstanceOf[TwoToneColor]
  
  @scala.inline
  def setTwoToneColor(twoToneColor: TwoToneColor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTwoToneColor")(twoToneColor.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
