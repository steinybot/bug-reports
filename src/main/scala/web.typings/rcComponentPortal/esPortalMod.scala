package web.typings.rcComponentPortal

import web.typings.rcComponentPortal.rcComponentPortalBooleans.`false`
import web.typings.react.mod.RefAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.Element
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPortalMod extends Shortcut {
  
  @JSImport("@rc-component/portal/es/Portal", JSImport.Default)
  @js.native
  val default: ReactComponentClass[PortalProps with RefAttributes[Any]] = js.native
  
  type ContainerType = Element | DocumentFragment
  
  type GetContainer = String | ContainerType | js.Function0[ContainerType] | `false`
  
  @js.native
  trait PortalProps extends StObject {
    
    /** Remove `children` when `open` is `false`. Set `false` will not handle remove process */
    var autoDestroy: js.UndefOr[Boolean] = js.native
    
    /** Lock screen scroll when open */
    var autoLock: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    /** @private debug name. Do not use in prod */
    var debug: js.UndefOr[String] = js.native
    
    /** Customize container element. Default will create a div in document.body when `open` */
    var getContainer: js.UndefOr[GetContainer] = js.native
    
    /** Show the portal children */
    var open: js.UndefOr[Boolean] = js.native
  }
  object PortalProps {
    
    @scala.inline
    def apply(): PortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortalProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PortalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoDestroy(value: Boolean): Self = StObject.set(x, "autoDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDestroyUndefined: Self = StObject.set(x, "autoDestroy", js.undefined)
      
      @scala.inline
      def setAutoLock(value: Boolean): Self = StObject.set(x, "autoLock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoLockUndefined: Self = StObject.set(x, "autoLock", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDebug(value: String): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setGetContainer(value: GetContainer): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetContainerFunction0(value: () => ContainerType): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[PortalProps with RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `esPortalMod.foo` */
  override def _to: ReactComponentClass[PortalProps with RefAttributes[Any]] = default
}
