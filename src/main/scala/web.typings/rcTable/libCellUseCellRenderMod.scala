package web.typings.rcTable

import web.typings.rcTable.libInterfaceMod.CellType
import web.typings.rcTable.libInterfaceMod.DataIndex
import web.typings.rcTable.libInterfaceMod.RenderedCell
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCellUseCellRenderMod {
  
  @JSImport("rc-table/lib/Cell/useCellRender", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[RecordType](record: RecordType, dataIndex: DataIndex, renderIndex: Double): (js.Tuple2[ReactElement, CellType[RecordType]]) | js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(record.asInstanceOf[js.Any], dataIndex.asInstanceOf[js.Any], renderIndex.asInstanceOf[js.Any])).asInstanceOf[(js.Tuple2[ReactElement, CellType[RecordType]]) | js.Array[ReactElement]]
  @scala.inline
  def default[RecordType](
    record: RecordType,
    dataIndex: DataIndex,
    renderIndex: Double,
    children: Unit,
    render: js.UndefOr[
      js.Function3[
        /* value */ Any, 
        /* record */ RecordType, 
        /* index */ Double, 
        ReactElement | RenderedCell[RecordType]
      ]
    ]
  ): (js.Tuple2[ReactElement, CellType[RecordType]]) | js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(record.asInstanceOf[js.Any], dataIndex.asInstanceOf[js.Any], renderIndex.asInstanceOf[js.Any], children.asInstanceOf[js.Any], render.asInstanceOf[js.Any])).asInstanceOf[(js.Tuple2[ReactElement, CellType[RecordType]]) | js.Array[ReactElement]]
  @scala.inline
  def default[RecordType](
    record: RecordType,
    dataIndex: DataIndex,
    renderIndex: Double,
    children: Unit,
    render: js.UndefOr[
      js.Function3[
        /* value */ Any, 
        /* record */ RecordType, 
        /* index */ Double, 
        ReactElement | RenderedCell[RecordType]
      ]
    ],
    shouldCellUpdate: js.UndefOr[js.Function2[/* record */ RecordType, /* prevRecord */ RecordType, Boolean]]
  ): (js.Tuple2[ReactElement, CellType[RecordType]]) | js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(record.asInstanceOf[js.Any], dataIndex.asInstanceOf[js.Any], renderIndex.asInstanceOf[js.Any], children.asInstanceOf[js.Any], render.asInstanceOf[js.Any], shouldCellUpdate.asInstanceOf[js.Any])).asInstanceOf[(js.Tuple2[ReactElement, CellType[RecordType]]) | js.Array[ReactElement]]
  @scala.inline
  def default[RecordType](
    record: RecordType,
    dataIndex: DataIndex,
    renderIndex: Double,
    children: Unit,
    render: Unit,
    shouldCellUpdate: js.UndefOr[js.Function2[/* record */ RecordType, /* prevRecord */ RecordType, Boolean]]
  ): (js.Tuple2[ReactElement, CellType[RecordType]]) | js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(record.asInstanceOf[js.Any], dataIndex.asInstanceOf[js.Any], renderIndex.asInstanceOf[js.Any], children.asInstanceOf[js.Any], render.asInstanceOf[js.Any], shouldCellUpdate.asInstanceOf[js.Any])).asInstanceOf[(js.Tuple2[ReactElement, CellType[RecordType]]) | js.Array[ReactElement]]
  @scala.inline
  def default[RecordType](record: RecordType, dataIndex: DataIndex, renderIndex: Double, children: ReactElement): (js.Tuple2[ReactElement, CellType[RecordType]]) | js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(record.asInstanceOf[js.Any], dataIndex.asInstanceOf[js.Any], renderIndex.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[(js.Tuple2[ReactElement, CellType[RecordType]]) | js.Array[ReactElement]]
  @scala.inline
  def default[RecordType](
    record: RecordType,
    dataIndex: DataIndex,
    renderIndex: Double,
    children: ReactElement,
    render: js.UndefOr[
      js.Function3[
        /* value */ Any, 
        /* record */ RecordType, 
        /* index */ Double, 
        ReactElement | RenderedCell[RecordType]
      ]
    ]
  ): (js.Tuple2[ReactElement, CellType[RecordType]]) | js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(record.asInstanceOf[js.Any], dataIndex.asInstanceOf[js.Any], renderIndex.asInstanceOf[js.Any], children.asInstanceOf[js.Any], render.asInstanceOf[js.Any])).asInstanceOf[(js.Tuple2[ReactElement, CellType[RecordType]]) | js.Array[ReactElement]]
  @scala.inline
  def default[RecordType](
    record: RecordType,
    dataIndex: DataIndex,
    renderIndex: Double,
    children: ReactElement,
    render: js.UndefOr[
      js.Function3[
        /* value */ Any, 
        /* record */ RecordType, 
        /* index */ Double, 
        ReactElement | RenderedCell[RecordType]
      ]
    ],
    shouldCellUpdate: js.UndefOr[js.Function2[/* record */ RecordType, /* prevRecord */ RecordType, Boolean]]
  ): (js.Tuple2[ReactElement, CellType[RecordType]]) | js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(record.asInstanceOf[js.Any], dataIndex.asInstanceOf[js.Any], renderIndex.asInstanceOf[js.Any], children.asInstanceOf[js.Any], render.asInstanceOf[js.Any], shouldCellUpdate.asInstanceOf[js.Any])).asInstanceOf[(js.Tuple2[ReactElement, CellType[RecordType]]) | js.Array[ReactElement]]
  @scala.inline
  def default[RecordType](
    record: RecordType,
    dataIndex: DataIndex,
    renderIndex: Double,
    children: ReactElement,
    render: Unit,
    shouldCellUpdate: js.UndefOr[js.Function2[/* record */ RecordType, /* prevRecord */ RecordType, Boolean]]
  ): (js.Tuple2[ReactElement, CellType[RecordType]]) | js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(record.asInstanceOf[js.Any], dataIndex.asInstanceOf[js.Any], renderIndex.asInstanceOf[js.Any], children.asInstanceOf[js.Any], render.asInstanceOf[js.Any], shouldCellUpdate.asInstanceOf[js.Any])).asInstanceOf[(js.Tuple2[ReactElement, CellType[RecordType]]) | js.Array[ReactElement]]
}
