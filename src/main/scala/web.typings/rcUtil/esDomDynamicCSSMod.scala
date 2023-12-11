package web.typings.rcUtil

import web.typings.rcUtil.anon.Nonce
import web.typings.rcUtil.rcUtilStrings.queue
import web.typings.std.ShadowRoot
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLStyleElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDomDynamicCSSMod {
  
  @JSImport("rc-util/es/Dom/dynamicCSS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def clearContainerCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearContainerCache")().asInstanceOf[Unit]
  
  @scala.inline
  def injectCSS(css: String): HTMLStyleElement = ^.asInstanceOf[js.Dynamic].applyDynamic("injectCSS")(css.asInstanceOf[js.Any]).asInstanceOf[HTMLStyleElement]
  @scala.inline
  def injectCSS(css: String, option: Options): HTMLStyleElement = (^.asInstanceOf[js.Dynamic].applyDynamic("injectCSS")(css.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[HTMLStyleElement]
  
  @scala.inline
  def removeCSS(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCSS")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def removeCSS(key: String, option: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCSS")(key.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def updateCSS(css: String, key: String): HTMLStyleElement = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCSS")(css.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[HTMLStyleElement]
  @scala.inline
  def updateCSS(css: String, key: String, option: Options): HTMLStyleElement = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCSS")(css.asInstanceOf[js.Any], key.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[HTMLStyleElement]
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcUtil.rcUtilStrings.prependQueue
    - `web.typings`.rcUtil.rcUtilStrings.append
    - `web.typings`.rcUtil.rcUtilStrings.prepend
  */
  trait AppendType extends StObject
  object AppendType {
    
    @scala.inline
    def append: web.typings.rcUtil.rcUtilStrings.append = "append".asInstanceOf[web.typings.rcUtil.rcUtilStrings.append]
    
    @scala.inline
    def prepend: web.typings.rcUtil.rcUtilStrings.prepend = "prepend".asInstanceOf[web.typings.rcUtil.rcUtilStrings.prepend]
    
    @scala.inline
    def prependQueue: web.typings.rcUtil.rcUtilStrings.prependQueue = "prependQueue".asInstanceOf[web.typings.rcUtil.rcUtilStrings.prependQueue]
  }
  
  type ContainerType = Element | ShadowRoot
  
  @js.native
  trait Options extends StObject {
    
    var attachTo: js.UndefOr[ContainerType] = js.native
    
    var csp: js.UndefOr[Nonce] = js.native
    
    var mark: js.UndefOr[String] = js.native
    
    var prepend: js.UndefOr[Prepend] = js.native
    
    /**
      * Config the `priority` of `prependQueue`. Default is `0`.
      * It's useful if you need to insert style before other style.
      */
    var priority: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachTo(value: ContainerType): Self = StObject.set(x, "attachTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachToUndefined: Self = StObject.set(x, "attachTo", js.undefined)
      
      @scala.inline
      def setCsp(value: Nonce): Self = StObject.set(x, "csp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCspUndefined: Self = StObject.set(x, "csp", js.undefined)
      
      @scala.inline
      def setMark(value: String): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      @scala.inline
      def setPrepend(value: Prepend): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
  
  type Prepend = Boolean | queue
}
