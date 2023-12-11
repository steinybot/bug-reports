package web.typings.rcTree

import web.typings.rcTree.esInterfaceMod.BasicDataNode
import web.typings.rcTree.esInterfaceMod.DataEntity
import web.typings.rcTree.esInterfaceMod.DataNode
import web.typings.rcTree.esInterfaceMod.FlattenNode
import web.typings.rcTree.esInterfaceMod.Key
import web.typings.rcTree.esInterfaceMod.KeyEntities
import web.typings.rcVirtualList.esListMod.ScrollConfig
import web.typings.rcVirtualList.esListMod.ScrollTo
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.FocusEventHandler
import web.typings.react.mod.KeyboardEventHandler
import web.typings.react.mod.RefAttributes
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esNodeListMod {
  
  @JSImport("rc-tree/es/NodeList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-tree/es/NodeList", JSImport.Default)
  @js.native
  val default: ReactComponentClass[NodeListProps[Any] with RefAttributes[NodeListRef]] = js.native
  
  @JSImport("rc-tree/es/NodeList", "MOTION_KEY")
  @js.native
  val MOTION_KEY: String = js.native
  
  @JSImport("rc-tree/es/NodeList", "MotionEntity")
  @js.native
  val MotionEntity: DataEntity[DataNode] = js.native
  
  @scala.inline
  def getMinimumRangeTransitionRange(list: js.Array[FlattenNode[DataNode]], virtual: Boolean, height: Double, itemHeight: Double): js.Array[FlattenNode[DataNode]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMinimumRangeTransitionRange")(list.asInstanceOf[js.Any], virtual.asInstanceOf[js.Any], height.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any])).asInstanceOf[js.Array[FlattenNode[DataNode]]]
  
  @js.native
  trait NodeListProps[TreeDataType /* <: BasicDataNode */] extends StObject {
    
    var activeItem: FlattenNode[TreeDataType] = js.native
    
    var checkable: js.UndefOr[Boolean] = js.native
    
    var checkedKeys: js.Array[Key] = js.native
    
    var data: js.Array[FlattenNode[TreeDataType]] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var dragOverNodeKey: Key = js.native
    
    var dragging: Boolean = js.native
    
    var dropPosition: Double = js.native
    
    var expandedKeys: js.Array[Key] = js.native
    
    var focusable: js.UndefOr[Boolean] = js.native
    
    var focused: js.UndefOr[Boolean] = js.native
    
    var halfCheckedKeys: js.Array[Key] = js.native
    
    var height: Double = js.native
    
    var itemHeight: Double = js.native
    
    var keyEntities: KeyEntities[Any] = js.native
    
    var loadedKeys: js.Array[Key] = js.native
    
    var loadingKeys: js.Array[Key] = js.native
    
    var motion: Any = js.native
    
    def onActiveChange(key: Key): Unit = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    def onListChangeEnd(): Unit = js.native
    
    def onListChangeStart(): Unit = js.native
    
    var prefixCls: String = js.native
    
    var selectable: js.UndefOr[Boolean] = js.native
    
    var selectedKeys: js.Array[Key] = js.native
    
    var style: CSSProperties = js.native
    
    var tabIndex: Double = js.native
    
    var virtual: js.UndefOr[Boolean] = js.native
  }
  object NodeListProps {
    
    @scala.inline
    def apply[TreeDataType /* <: BasicDataNode */](
      activeItem: FlattenNode[TreeDataType],
      checkedKeys: js.Array[Key],
      data: js.Array[FlattenNode[TreeDataType]],
      dragOverNodeKey: Key,
      dragging: Boolean,
      dropPosition: Double,
      expandedKeys: js.Array[Key],
      halfCheckedKeys: js.Array[Key],
      height: Double,
      itemHeight: Double,
      keyEntities: KeyEntities[Any],
      loadedKeys: js.Array[Key],
      loadingKeys: js.Array[Key],
      motion: Any,
      onActiveChange: Key => Unit,
      onListChangeEnd: () => Unit,
      onListChangeStart: () => Unit,
      prefixCls: String,
      selectedKeys: js.Array[Key],
      style: CSSProperties,
      tabIndex: Double
    ): NodeListProps[TreeDataType] = {
      val __obj = js.Dynamic.literal(activeItem = activeItem.asInstanceOf[js.Any], checkedKeys = checkedKeys.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dragOverNodeKey = dragOverNodeKey.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], itemHeight = itemHeight.asInstanceOf[js.Any], keyEntities = keyEntities.asInstanceOf[js.Any], loadedKeys = loadedKeys.asInstanceOf[js.Any], loadingKeys = loadingKeys.asInstanceOf[js.Any], motion = motion.asInstanceOf[js.Any], onActiveChange = js.Any.fromFunction1(onActiveChange), onListChangeEnd = js.Any.fromFunction0(onListChangeEnd), onListChangeStart = js.Any.fromFunction0(onListChangeStart), prefixCls = prefixCls.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeListProps[TreeDataType]]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: NodeListProps[_], TreeDataType /* <: BasicDataNode */] (val x: Self with NodeListProps[TreeDataType]) extends AnyVal {
      
      @scala.inline
      def setActiveItem(value: FlattenNode[TreeDataType]): Self = StObject.set(x, "activeItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      @scala.inline
      def setCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "checkedKeys", js.Array(value :_*))
      
      @scala.inline
      def setData(value: js.Array[FlattenNode[TreeDataType]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: FlattenNode[TreeDataType]*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDragOverNodeKey(value: Key): Self = StObject.set(x, "dragOverNodeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropPosition(value: Double): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "expandedKeys", js.Array(value :_*))
      
      @scala.inline
      def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      @scala.inline
      def setHalfCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "halfCheckedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "halfCheckedKeys", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyEntities(value: KeyEntities[Any]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedKeys(value: js.Array[Key]): Self = StObject.set(x, "loadedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedKeysVarargs(value: Key*): Self = StObject.set(x, "loadedKeys", js.Array(value :_*))
      
      @scala.inline
      def setLoadingKeys(value: js.Array[Key]): Self = StObject.set(x, "loadingKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingKeysVarargs(value: Key*): Self = StObject.set(x, "loadingKeys", js.Array(value :_*))
      
      @scala.inline
      def setMotion(value: Any): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnActiveChange(value: Key => Unit): Self = StObject.set(x, "onActiveChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnListChangeEnd(value: () => Unit): Self = StObject.set(x, "onListChangeEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnListChangeStart(value: () => Unit): Self = StObject.set(x, "onListChangeStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      @scala.inline
      def setSelectedKeys(value: js.Array[Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedKeysVarargs(value: Key*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
  
  @js.native
  trait NodeListRef extends StObject {
    
    def getIndentWidth(): Double = js.native
    
    var scrollTo: ScrollTo = js.native
  }
  object NodeListRef {
    
    @scala.inline
    def apply(getIndentWidth: () => Double, scrollTo: /* arg */ Double | ScrollConfig => Unit): NodeListRef = {
      val __obj = js.Dynamic.literal(getIndentWidth = js.Any.fromFunction0(getIndentWidth), scrollTo = js.Any.fromFunction1(scrollTo))
      __obj.asInstanceOf[NodeListRef]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: NodeListRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetIndentWidth(value: () => Double): Self = StObject.set(x, "getIndentWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setScrollTo(value: /* arg */ Double | ScrollConfig => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1(value))
    }
  }
}
