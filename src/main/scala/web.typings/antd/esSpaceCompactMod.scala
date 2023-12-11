package web.typings.antd

import web.typings.antd.anon.CompactDirection
import web.typings.antd.anon.PropsWithChildren
import web.typings.antd.antdStrings.horizontal
import web.typings.antd.antdStrings.vertical
import web.typings.antd.esConfigProviderContextMod.DirectionType
import web.typings.antd.esConfigProviderSizeContextMod.SizeType
import web.typings.react.mod.Context
import web.typings.react.mod.HTMLAttributes
import org.scalajs.dom.HTMLDivElement
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSpaceCompactMod {
  
  @JSImport("antd/es/space/Compact", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd/es/space/Compact", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SpaceCompactProps] = js.native
  
  @JSImport("antd/es/space/Compact", "NoCompactStyle")
  @js.native
  val NoCompactStyle: ReactComponentClass[PropsWithChildren] = js.native
  
  @JSImport("antd/es/space/Compact", "SpaceCompactItemContext")
  @js.native
  val SpaceCompactItemContext: Context[SpaceCompactItemContextType | Null] = js.native
  
  @scala.inline
  def useCompactItemContext(prefixCls: String, direction: DirectionType): CompactDirection = (^.asInstanceOf[js.Dynamic].applyDynamic("useCompactItemContext")(prefixCls.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[CompactDirection]
  
  @js.native
  trait SpaceCompactItemContextType extends StObject {
    
    var compactDirection: js.UndefOr[horizontal | vertical] = js.native
    
    var compactSize: js.UndefOr[SizeType] = js.native
    
    var isFirstItem: js.UndefOr[Boolean] = js.native
    
    var isLastItem: js.UndefOr[Boolean] = js.native
  }
  object SpaceCompactItemContextType {
    
    @scala.inline
    def apply(): SpaceCompactItemContextType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpaceCompactItemContextType]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SpaceCompactItemContextType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompactDirection(value: horizontal | vertical): Self = StObject.set(x, "compactDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactDirectionUndefined: Self = StObject.set(x, "compactDirection", js.undefined)
      
      @scala.inline
      def setCompactSize(value: SizeType): Self = StObject.set(x, "compactSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactSizeUndefined: Self = StObject.set(x, "compactSize", js.undefined)
      
      @scala.inline
      def setIsFirstItem(value: Boolean): Self = StObject.set(x, "isFirstItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFirstItemUndefined: Self = StObject.set(x, "isFirstItem", js.undefined)
      
      @scala.inline
      def setIsLastItem(value: Boolean): Self = StObject.set(x, "isLastItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLastItemUndefined: Self = StObject.set(x, "isLastItem", js.undefined)
    }
  }
  
  @js.native
  trait SpaceCompactProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var block: js.UndefOr[Boolean] = js.native
    
    var direction: js.UndefOr[horizontal | vertical] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[SizeType] = js.native
  }
  object SpaceCompactProps {
    
    @scala.inline
    def apply(): SpaceCompactProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpaceCompactProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SpaceCompactProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      @scala.inline
      def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
