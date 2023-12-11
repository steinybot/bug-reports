package web.typings.antd

import web.typings.antd.antdStrings.Space
import web.typings.antd.esThemeInterfaceMod.GenerateStyle
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.FullToken
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSpaceStyleCompactMod extends Shortcut {
  
  @JSImport("antd/es/space/style/compact", JSImport.Default)
  @js.native
  val default: GenerateStyle[
    SpaceToken, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSInterpolation */ Any
  ] = js.native
  
  @js.native
  trait ComponentToken extends StObject
  
  type SpaceToken = FullToken[Space]
  
  type _To = GenerateStyle[
    SpaceToken, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSInterpolation */ Any
  ]
  
  /* This means you don't have to write `default`, but can instead just say `esSpaceStyleCompactMod.foo` */
  override def _to: GenerateStyle[
    SpaceToken, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSInterpolation */ Any
  ] = default
}
