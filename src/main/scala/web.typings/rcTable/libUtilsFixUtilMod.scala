package web.typings.rcTable

import web.typings.rcTable.anon.Fixed
import web.typings.rcTable.libInterfaceMod.ColumnGroupType
import web.typings.rcTable.libInterfaceMod.ColumnType
import web.typings.rcTable.libInterfaceMod.Direction
import web.typings.rcTable.libInterfaceMod.StickyOffsets
import web.typings.rcTable.rcTableBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsFixUtilMod {
  
  @JSImport("rc-table/lib/utils/fixUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getCellFixedInfo[RecordType](
    colStart: Double,
    colEnd: Double,
    columns: js.Array[Fixed],
    stickyOffsets: StickyOffsets,
    direction: Direction
  ): FixedInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getCellFixedInfo")(colStart.asInstanceOf[js.Any], colEnd.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], stickyOffsets.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[FixedInfo]
  @scala.inline
  def getCellFixedInfo[RecordType](
    colStart: Double,
    colEnd: Double,
    columns: js.Array[Fixed],
    stickyOffsets: StickyOffsets,
    direction: Direction,
    curColumns: ColumnGroupType[RecordType]
  ): FixedInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getCellFixedInfo")(colStart.asInstanceOf[js.Any], colEnd.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], stickyOffsets.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], curColumns.asInstanceOf[js.Any])).asInstanceOf[FixedInfo]
  @scala.inline
  def getCellFixedInfo[RecordType](
    colStart: Double,
    colEnd: Double,
    columns: js.Array[Fixed],
    stickyOffsets: StickyOffsets,
    direction: Direction,
    curColumns: ColumnType[RecordType]
  ): FixedInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getCellFixedInfo")(colStart.asInstanceOf[js.Any], colEnd.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], stickyOffsets.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], curColumns.asInstanceOf[js.Any])).asInstanceOf[FixedInfo]
  
  @js.native
  trait FixedInfo extends StObject {
    
    var firstFixLeft: Boolean = js.native
    
    var firstFixRight: Boolean = js.native
    
    var fixLeft: Double | `false` = js.native
    
    var fixRight: Double | `false` = js.native
    
    var isSticky: Boolean = js.native
    
    var lastFixLeft: Boolean = js.native
    
    var lastFixRight: Boolean = js.native
  }
  object FixedInfo {
    
    @scala.inline
    def apply(
      firstFixLeft: Boolean,
      firstFixRight: Boolean,
      fixLeft: Double | `false`,
      fixRight: Double | `false`,
      isSticky: Boolean,
      lastFixLeft: Boolean,
      lastFixRight: Boolean
    ): FixedInfo = {
      val __obj = js.Dynamic.literal(firstFixLeft = firstFixLeft.asInstanceOf[js.Any], firstFixRight = firstFixRight.asInstanceOf[js.Any], fixLeft = fixLeft.asInstanceOf[js.Any], fixRight = fixRight.asInstanceOf[js.Any], isSticky = isSticky.asInstanceOf[js.Any], lastFixLeft = lastFixLeft.asInstanceOf[js.Any], lastFixRight = lastFixRight.asInstanceOf[js.Any])
      __obj.asInstanceOf[FixedInfo]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: FixedInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFirstFixLeft(value: Boolean): Self = StObject.set(x, "firstFixLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstFixRight(value: Boolean): Self = StObject.set(x, "firstFixRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixLeft(value: Double | `false`): Self = StObject.set(x, "fixLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixRight(value: Double | `false`): Self = StObject.set(x, "fixRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSticky(value: Boolean): Self = StObject.set(x, "isSticky", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastFixLeft(value: Boolean): Self = StObject.set(x, "lastFixLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastFixRight(value: Boolean): Self = StObject.set(x, "lastFixRight", value.asInstanceOf[js.Any])
    }
  }
}
