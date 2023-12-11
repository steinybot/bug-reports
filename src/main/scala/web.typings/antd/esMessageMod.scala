package web.typings.antd

import web.typings.antd.esMessageInterfaceMod.ArgsProps
import web.typings.antd.esMessageInterfaceMod.ConfigOptions
import web.typings.antd.esMessageInterfaceMod.JointContent
import web.typings.antd.esMessageInterfaceMod.MessageInstance
import web.typings.antd.esMessageInterfaceMod.MessageType
import web.typings.antd.esMessageInterfaceMod.TypeOpen
import web.typings.antd.esMessagePurePanelMod.PurePanelProps
import web.typings.react.mod.Key
import web.typings.std.VoidFunction
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMessageMod extends Shortcut {
  
  @JSImport("antd/es/message", JSImport.Default)
  @js.native
  val default: MessageMethods with BaseMethods = js.native
  
  @js.native
  trait BaseMethods extends StObject {
    
    /** @private Internal Component. Do not use in your production. */
    var _InternalPanelDoNotUseOrYouWillBeFired: ReactComponentClass[PurePanelProps] = js.native
    
    var config: js.Function1[/* config */ ConfigOptions, Unit] = js.native
    
    def destroy(): Unit = js.native
    def destroy(key: Key): Unit = js.native
    
    def open(config: ArgsProps): MessageType = js.native
    
    var useMessage: js.Function1[
        /* messageConfig */ js.UndefOr[ConfigOptions], 
        js.Tuple2[MessageInstance, ReactElement]
      ] = js.native
  }
  
  @js.native
  trait MessageMethods extends StObject {
    
    var error: TypeOpen = js.native
    
    var info: TypeOpen = js.native
    
    var loading: TypeOpen = js.native
    
    var success: TypeOpen = js.native
    
    var warning: TypeOpen = js.native
  }
  object MessageMethods {
    
    @scala.inline
    def apply(
      error: (/* content */ JointContent, /* duration */ js.UndefOr[Double | VoidFunction], /* onClose */ js.UndefOr[VoidFunction]) => MessageType,
      info: (/* content */ JointContent, /* duration */ js.UndefOr[Double | VoidFunction], /* onClose */ js.UndefOr[VoidFunction]) => MessageType,
      loading: (/* content */ JointContent, /* duration */ js.UndefOr[Double | VoidFunction], /* onClose */ js.UndefOr[VoidFunction]) => MessageType,
      success: (/* content */ JointContent, /* duration */ js.UndefOr[Double | VoidFunction], /* onClose */ js.UndefOr[VoidFunction]) => MessageType,
      warning: (/* content */ JointContent, /* duration */ js.UndefOr[Double | VoidFunction], /* onClose */ js.UndefOr[VoidFunction]) => MessageType
    ): MessageMethods = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction3(error), info = js.Any.fromFunction3(info), loading = js.Any.fromFunction3(loading), success = js.Any.fromFunction3(success), warning = js.Any.fromFunction3(warning))
      __obj.asInstanceOf[MessageMethods]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MessageMethods] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(
        value: (/* content */ JointContent, /* duration */ js.UndefOr[Double | VoidFunction], /* onClose */ js.UndefOr[VoidFunction]) => MessageType
      ): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
      
      @scala.inline
      def setInfo(
        value: (/* content */ JointContent, /* duration */ js.UndefOr[Double | VoidFunction], /* onClose */ js.UndefOr[VoidFunction]) => MessageType
      ): Self = StObject.set(x, "info", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLoading(
        value: (/* content */ JointContent, /* duration */ js.UndefOr[Double | VoidFunction], /* onClose */ js.UndefOr[VoidFunction]) => MessageType
      ): Self = StObject.set(x, "loading", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSuccess(
        value: (/* content */ JointContent, /* duration */ js.UndefOr[Double | VoidFunction], /* onClose */ js.UndefOr[VoidFunction]) => MessageType
      ): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
      
      @scala.inline
      def setWarning(
        value: (/* content */ JointContent, /* duration */ js.UndefOr[Double | VoidFunction], /* onClose */ js.UndefOr[VoidFunction]) => MessageType
      ): Self = StObject.set(x, "warning", js.Any.fromFunction3(value))
    }
  }
  
  type _To = MessageMethods with BaseMethods
  
  /* This means you don't have to write `default`, but can instead just say `esMessageMod.foo` */
  override def _to: MessageMethods with BaseMethods = default
}
