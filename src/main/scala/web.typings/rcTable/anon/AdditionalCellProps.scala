package web.typings.rcTable.anon

import web.typings.rcTable.libUtilsFixUtilMod.FixedInfo
import web.typings.react.mod.Key
import web.typings.react.mod.TdHTMLAttributes
import org.scalajs.dom.HTMLElement
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdditionalCellProps extends StObject {
  
  var additionalCellProps: TdHTMLAttributes[HTMLElement] = js.native
  
  var appendCellNode: ReactElement = js.native
  
  var fixedInfo: FixedInfo = js.native
  
  var key: Key = js.native
}
object AdditionalCellProps {
  
  @scala.inline
  def apply(
    additionalCellProps: TdHTMLAttributes[HTMLElement],
    appendCellNode: ReactElement,
    fixedInfo: FixedInfo,
    key: Key
  ): AdditionalCellProps = {
    val __obj = js.Dynamic.literal(additionalCellProps = additionalCellProps.asInstanceOf[js.Any], appendCellNode = appendCellNode.asInstanceOf[js.Any], fixedInfo = fixedInfo.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalCellProps]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: AdditionalCellProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalCellProps(value: TdHTMLAttributes[HTMLElement]): Self = StObject.set(x, "additionalCellProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendCellNode(value: ReactElement): Self = StObject.set(x, "appendCellNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedInfo(value: FixedInfo): Self = StObject.set(x, "fixedInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
