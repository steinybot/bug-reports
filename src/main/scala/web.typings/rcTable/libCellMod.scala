package web.typings.rcTable

import web.typings.rcTable.anon.FnCallProps
import web.typings.rcTable.libInterfaceMod.AlignType
import web.typings.rcTable.libInterfaceMod.CellEllipsisType
import web.typings.rcTable.libInterfaceMod.CustomizeComponent
import web.typings.rcTable.libInterfaceMod.DataIndex
import web.typings.rcTable.libInterfaceMod.DefaultRecordType
import web.typings.rcTable.libInterfaceMod.RenderedCell
import web.typings.rcTable.libInterfaceMod.ScopeType
import web.typings.rcTable.rcTableBooleans.`false`
import web.typings.rcTable.rcTableStrings.body
import web.typings.rcTable.rcTableStrings.footer
import web.typings.rcTable.rcTableStrings.header
import web.typings.react.mod.TdHTMLAttributes
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLTableCellElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCellMod extends Shortcut {
  
  @JSImport("rc-table/lib/Cell", JSImport.Default)
  @js.native
  val default: ReactComponentClass[FnCallProps] = js.native
  
  @js.native
  trait CellProps[RecordType /* <: DefaultRecordType */] extends StObject {
    
    var additionalProps: js.UndefOr[TdHTMLAttributes[HTMLTableCellElement]] = js.native
    
    var align: js.UndefOr[AlignType] = js.native
    
    var allColsFixedLeft: js.UndefOr[Boolean] = js.native
    
    /** @private Used for `expandable` with nest tree */
    var appendNode: js.UndefOr[ReactElement] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var colSpan: js.UndefOr[Double] = js.native
    
    var component: js.UndefOr[CustomizeComponent] = js.native
    
    var dataIndex: js.UndefOr[DataIndex] = js.native
    
    var ellipsis: js.UndefOr[CellEllipsisType] = js.native
    
    var firstFixLeft: js.UndefOr[Boolean] = js.native
    
    var firstFixRight: js.UndefOr[Boolean] = js.native
    
    var fixLeft: js.UndefOr[Double | `false`] = js.native
    
    var fixRight: js.UndefOr[Double | `false`] = js.native
    
    /** `column` index is the real show rowIndex */
    var index: js.UndefOr[Double] = js.native
    
    var isSticky: js.UndefOr[Boolean] = js.native
    
    var lastFixLeft: js.UndefOr[Boolean] = js.native
    
    var lastFixRight: js.UndefOr[Boolean] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var record: js.UndefOr[RecordType] = js.native
    
    var render: js.UndefOr[
        js.Function3[
          /* value */ Any, 
          /* record */ RecordType, 
          /* index */ Double, 
          ReactElement | RenderedCell[RecordType]
        ]
      ] = js.native
    
    /** the index of the record. For the render(value, record, renderIndex) */
    var renderIndex: js.UndefOr[Double] = js.native
    
    var rowSpan: js.UndefOr[Double] = js.native
    
    var rowType: js.UndefOr[header | body | footer] = js.native
    
    var scope: js.UndefOr[ScopeType] = js.native
    
    var shouldCellUpdate: js.UndefOr[js.Function2[/* record */ RecordType, /* prevRecord */ RecordType, Boolean]] = js.native
  }
  object CellProps {
    
    @scala.inline
    def apply[RecordType /* <: DefaultRecordType */](): CellProps[RecordType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellProps[RecordType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CellProps[_], RecordType /* <: DefaultRecordType */] (val x: Self with CellProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setAdditionalProps(value: TdHTMLAttributes[HTMLTableCellElement]): Self = StObject.set(x, "additionalProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalPropsUndefined: Self = StObject.set(x, "additionalProps", js.undefined)
      
      @scala.inline
      def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setAllColsFixedLeft(value: Boolean): Self = StObject.set(x, "allColsFixedLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllColsFixedLeftUndefined: Self = StObject.set(x, "allColsFixedLeft", js.undefined)
      
      @scala.inline
      def setAppendNode(value: ReactElement): Self = StObject.set(x, "appendNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendNodeUndefined: Self = StObject.set(x, "appendNode", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      @scala.inline
      def setComponent(value: CustomizeComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentReactComponentClass(value: ReactComponentClass[Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setDataIndex(value: DataIndex): Self = StObject.set(x, "dataIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataIndexUndefined: Self = StObject.set(x, "dataIndex", js.undefined)
      
      @scala.inline
      def setDataIndexVarargs(value: (String | Double)*): Self = StObject.set(x, "dataIndex", js.Array(value :_*))
      
      @scala.inline
      def setEllipsis(value: CellEllipsisType): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      @scala.inline
      def setFirstFixLeft(value: Boolean): Self = StObject.set(x, "firstFixLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstFixLeftUndefined: Self = StObject.set(x, "firstFixLeft", js.undefined)
      
      @scala.inline
      def setFirstFixRight(value: Boolean): Self = StObject.set(x, "firstFixRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstFixRightUndefined: Self = StObject.set(x, "firstFixRight", js.undefined)
      
      @scala.inline
      def setFixLeft(value: Double | `false`): Self = StObject.set(x, "fixLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixLeftUndefined: Self = StObject.set(x, "fixLeft", js.undefined)
      
      @scala.inline
      def setFixRight(value: Double | `false`): Self = StObject.set(x, "fixRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixRightUndefined: Self = StObject.set(x, "fixRight", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setIsSticky(value: Boolean): Self = StObject.set(x, "isSticky", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStickyUndefined: Self = StObject.set(x, "isSticky", js.undefined)
      
      @scala.inline
      def setLastFixLeft(value: Boolean): Self = StObject.set(x, "lastFixLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastFixLeftUndefined: Self = StObject.set(x, "lastFixLeft", js.undefined)
      
      @scala.inline
      def setLastFixRight(value: Boolean): Self = StObject.set(x, "lastFixRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastFixRightUndefined: Self = StObject.set(x, "lastFixRight", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRecord(value: RecordType): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
      
      @scala.inline
      def setRender(
        value: (/* value */ Any, /* record */ RecordType, /* index */ Double) => ReactElement | RenderedCell[RecordType]
      ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRenderIndex(value: Double): Self = StObject.set(x, "renderIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderIndexUndefined: Self = StObject.set(x, "renderIndex", js.undefined)
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      @scala.inline
      def setRowType(value: header | body | footer): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowTypeUndefined: Self = StObject.set(x, "rowType", js.undefined)
      
      @scala.inline
      def setScope(value: ScopeType): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setShouldCellUpdate(value: (/* record */ RecordType, /* prevRecord */ RecordType) => Boolean): Self = StObject.set(x, "shouldCellUpdate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setShouldCellUpdateUndefined: Self = StObject.set(x, "shouldCellUpdate", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[FnCallProps]
  
  /* This means you don't have to write `default`, but can instead just say `libCellMod.foo` */
  override def _to: ReactComponentClass[FnCallProps] = default
}
