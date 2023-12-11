package web.typings.rcMotion

import web.typings.rcMotion.anon.Status
import web.typings.rcMotion.rcMotionStrings.add
import web.typings.rcMotion.rcMotionStrings.keep
import web.typings.rcMotion.rcMotionStrings.remove
import web.typings.rcMotion.rcMotionStrings.removed
import web.typings.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilDiffMod {
  
  @JSImport("rc-motion/es/util/diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-motion/es/util/diff", "STATUS_ADD")
  @js.native
  val STATUS_ADD: add = js.native
  
  @JSImport("rc-motion/es/util/diff", "STATUS_KEEP")
  @js.native
  val STATUS_KEEP: keep = js.native
  
  @JSImport("rc-motion/es/util/diff", "STATUS_REMOVE")
  @js.native
  val STATUS_REMOVE: remove = js.native
  
  @JSImport("rc-motion/es/util/diff", "STATUS_REMOVED")
  @js.native
  val STATUS_REMOVED: removed = js.native
  
  @scala.inline
  def diffKeys(): js.Array[KeyObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("diffKeys")().asInstanceOf[js.Array[KeyObject]]
  @scala.inline
  def diffKeys(prevKeys: js.Array[KeyObject]): js.Array[KeyObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("diffKeys")(prevKeys.asInstanceOf[js.Any]).asInstanceOf[js.Array[KeyObject]]
  @scala.inline
  def diffKeys(prevKeys: js.Array[KeyObject], currentKeys: js.Array[KeyObject]): js.Array[KeyObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffKeys")(prevKeys.asInstanceOf[js.Any], currentKeys.asInstanceOf[js.Any])).asInstanceOf[js.Array[KeyObject]]
  @scala.inline
  def diffKeys(prevKeys: Unit, currentKeys: js.Array[KeyObject]): js.Array[KeyObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffKeys")(prevKeys.asInstanceOf[js.Any], currentKeys.asInstanceOf[js.Any])).asInstanceOf[js.Array[KeyObject]]
  
  @scala.inline
  def parseKeys(): js.Array[Status] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseKeys")().asInstanceOf[js.Array[Status]]
  @scala.inline
  def parseKeys(keys: js.Array[Any]): js.Array[Status] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseKeys")(keys.asInstanceOf[js.Any]).asInstanceOf[js.Array[Status]]
  
  @scala.inline
  def wrapKeyToObject(key: KeyObject): Status = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapKeyToObject")(key.asInstanceOf[js.Any]).asInstanceOf[Status]
  @scala.inline
  def wrapKeyToObject(key: Key): Status = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapKeyToObject")(key.asInstanceOf[js.Any]).asInstanceOf[Status]
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.rcMotion.rcMotionStrings.add
    - `web.typings`.rcMotion.rcMotionStrings.keep
    - `web.typings`.rcMotion.rcMotionStrings.remove
    - `web.typings`.rcMotion.rcMotionStrings.removed
  */
  trait DiffStatus extends StObject
  object DiffStatus {
    
    @scala.inline
    def add: web.typings.rcMotion.rcMotionStrings.add = "add".asInstanceOf[web.typings.rcMotion.rcMotionStrings.add]
    
    @scala.inline
    def keep: web.typings.rcMotion.rcMotionStrings.keep = "keep".asInstanceOf[web.typings.rcMotion.rcMotionStrings.keep]
    
    @scala.inline
    def remove: web.typings.rcMotion.rcMotionStrings.remove = "remove".asInstanceOf[web.typings.rcMotion.rcMotionStrings.remove]
    
    @scala.inline
    def removed: web.typings.rcMotion.rcMotionStrings.removed = "removed".asInstanceOf[web.typings.rcMotion.rcMotionStrings.removed]
  }
  
  @js.native
  trait KeyObject extends StObject {
    
    var key: Key = js.native
    
    var status: js.UndefOr[DiffStatus] = js.native
  }
  object KeyObject {
    
    @scala.inline
    def apply(key: Key): KeyObject = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyObject]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: KeyObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: DiffStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
}
