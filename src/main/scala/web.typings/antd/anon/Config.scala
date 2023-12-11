package web.typings.antd.anon

import web.typings.antd.esModalUseModalMod.HookAPI
import web.typings.react.mod.JSX.Element
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends StObject {
  
  /** @private Internal Component. Do not use in your production. */
  var _InternalPanelDoNotUseOrYouWillBeFired: js.Function1[/* props */ Any, Element] = js.native
  
  var config: js.Function1[/* param0 */ RootPrefixCls, scala.Unit] = js.native
  
  def destroyAll(): scala.Unit = js.native
  
  var useModal: js.Function0[js.Tuple2[/* instance */ HookAPI, /* contextHolder */ ReactElement]] = js.native
}
object Config {
  
  @scala.inline
  def apply(
    _InternalPanelDoNotUseOrYouWillBeFired: /* props */ Any => Element,
    config: /* param0 */ RootPrefixCls => scala.Unit,
    destroyAll: () => scala.Unit,
    useModal: () => js.Tuple2[/* instance */ HookAPI, /* contextHolder */ ReactElement]
  ): Config = {
    val __obj = js.Dynamic.literal(_InternalPanelDoNotUseOrYouWillBeFired = js.Any.fromFunction1(_InternalPanelDoNotUseOrYouWillBeFired), config = js.Any.fromFunction1(config), destroyAll = js.Any.fromFunction0(destroyAll), useModal = js.Any.fromFunction0(useModal))
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: /* param0 */ RootPrefixCls => scala.Unit): Self = StObject.set(x, "config", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroyAll(value: () => scala.Unit): Self = StObject.set(x, "destroyAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUseModal(value: () => js.Tuple2[/* instance */ HookAPI, /* contextHolder */ ReactElement]): Self = StObject.set(x, "useModal", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_InternalPanelDoNotUseOrYouWillBeFired(value: /* props */ Any => Element): Self = StObject.set(x, "_InternalPanelDoNotUseOrYouWillBeFired", js.Any.fromFunction1(value))
  }
}
