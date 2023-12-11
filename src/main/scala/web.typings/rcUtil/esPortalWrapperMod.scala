package web.typings.rcUtil

import web.typings.rcUtil.anon.AfterClose
import web.typings.rcUtil.anon.PartialPortalWrapperProps
import web.typings.rcUtil.esPortalMod.PortalRef
import web.typings.react.mod.Component
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPortalWrapperMod {
  
  @JSImport("rc-util/es/PortalWrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-util/es/PortalWrapper", JSImport.Default)
  @js.native
  class default protected () extends PortalWrapper {
    def this(props: PortalWrapperProps) = this()
  }
  
  @scala.inline
  def getOpenCount(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getOpenCount")().asInstanceOf[Double]
  
  type GetContainer = String | HTMLElement | js.Function0[HTMLElement]
  
  @js.native
  trait PortalWrapper
    extends Component[PortalWrapperProps, js.Object, Any] {
    
    def attachToParent(): Boolean = js.native
    def attachToParent(force: Boolean): Boolean = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPortalWrapper(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPortalWrapper(prevProps: PortalWrapperProps): Unit = js.native
    
    var componentRef: ReactRef[PortalRef] = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPortalWrapper(): Unit = js.native
    
    var container: js.UndefOr[HTMLElement] = js.native
    
    def getContainer(): HTMLElement = js.native
    
    var rafId: js.UndefOr[Double] = js.native
    
    def removeCurrentContainer(): Unit = js.native
    
    var renderComponent: js.UndefOr[js.Function1[/* info */ AfterClose, Unit]] = js.native
    
    var scrollLocker: web.typings.rcUtil.esDomScrollLockerMod.default = js.native
    
    def setWrapperClassName(): Unit = js.native
    
    /**
      * Enhance ./switchScrollingEffect
      * 1. Simulate document body scroll bar with
      * 2. Record body has overflow style and recover when all of PortalWrapper invisible
      * 3. Disable body scroll when PortalWrapper has open
      *
      * @memberof PortalWrapper
      */
    def switchScrollingEffect(): Unit = js.native
    
    def updateOpenCount(): Unit = js.native
    def updateOpenCount(prevProps: PartialPortalWrapperProps): Unit = js.native
    
    def updateScrollLocker(): Unit = js.native
    def updateScrollLocker(prevProps: PartialPortalWrapperProps): Unit = js.native
  }
  
  @js.native
  trait PortalWrapperProps extends StObject {
    
    def children(info: web.typings.rcUtil.anon.GetContainer): ReactElement = js.native
    
    var forceRender: js.UndefOr[Boolean] = js.native
    
    var getContainer: js.UndefOr[GetContainer] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
    
    var wrapperClassName: js.UndefOr[String] = js.native
  }
  object PortalWrapperProps {
    
    @scala.inline
    def apply(children: web.typings.rcUtil.anon.GetContainer => ReactElement): PortalWrapperProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[PortalWrapperProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: PortalWrapperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: web.typings.rcUtil.anon.GetContainer => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      @scala.inline
      def setGetContainer(value: GetContainer): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetContainerFunction0(value: () => HTMLElement): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWrapperClassName(value: String): Self = StObject.set(x, "wrapperClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperClassNameUndefined: Self = StObject.set(x, "wrapperClassName", js.undefined)
    }
  }
}
