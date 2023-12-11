package web.typings.antd

import web.typings.antd.anon.TreeCls
import web.typings.antd.antdStrings.Tree
import web.typings.antd.esThemeInterfaceAliasMod.AliasToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.CSSUtil
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.FullToken
import web.typings.antd.esThemeUtilGenComponentStyleHookMod.GetDefaultToken
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTreeStyleMod {
  
  @JSImport("antd/es/tree/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(prefixCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  @scala.inline
  def default(prefixCls: String, rootCls: String): js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], rootCls.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* node */ ReactElement, ReactElement], String]]
  
  @scala.inline
  def genBaseStyle(prefixCls: String, token: TreeToken): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("genBaseStyle")(prefixCls.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @scala.inline
  def genDirectoryStyle(token: TreeToken): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("genDirectoryStyle")(token.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  def genTreeStyle(prefixCls: String, token: AliasToken with TreeSharedToken with CSSUtil): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("genTreeStyle")(prefixCls.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @scala.inline
  def initComponentToken(token: AliasToken): TreeSharedToken = ^.asInstanceOf[js.Dynamic].applyDynamic("initComponentToken")(token.asInstanceOf[js.Any]).asInstanceOf[TreeSharedToken]
  
  @JSImport("antd/es/tree/style", "prepareComponentToken")
  @js.native
  val prepareComponentToken: GetDefaultToken[Tree] = js.native
  
  @js.native
  trait ComponentToken
    extends StObject
       with TreeSharedToken {
    
    /**
      * @desc 目录树节点选中背景色
      * @descEN Background color of selected directory node
      */
    var directoryNodeSelectedBg: String = js.native
    
    /**
      * @desc 目录树节点选中文字颜色
      * @descEN Text color of selected directory node
      */
    var directoryNodeSelectedColor: String = js.native
  }
  object ComponentToken {
    
    @scala.inline
    def apply(
      directoryNodeSelectedBg: String,
      directoryNodeSelectedColor: String,
      nodeHoverBg: String,
      nodeSelectedBg: String,
      titleHeight: Double
    ): ComponentToken = {
      val __obj = js.Dynamic.literal(directoryNodeSelectedBg = directoryNodeSelectedBg.asInstanceOf[js.Any], directoryNodeSelectedColor = directoryNodeSelectedColor.asInstanceOf[js.Any], nodeHoverBg = nodeHoverBg.asInstanceOf[js.Any], nodeSelectedBg = nodeSelectedBg.asInstanceOf[js.Any], titleHeight = titleHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ComponentToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectoryNodeSelectedBg(value: String): Self = StObject.set(x, "directoryNodeSelectedBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryNodeSelectedColor(value: String): Self = StObject.set(x, "directoryNodeSelectedColor", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TreeSharedToken extends StObject {
    
    /**
      * @desc 节点悬浮态背景色
      * @descEN Background color of hovered node
      */
    var nodeHoverBg: String = js.native
    
    /**
      * @desc 节点选中态背景色
      * @descEN Background color of selected node
      */
    var nodeSelectedBg: String = js.native
    
    /**
      * @desc 节点标题高度
      * @descEN Node title height
      */
    var titleHeight: Double = js.native
  }
  object TreeSharedToken {
    
    @scala.inline
    def apply(nodeHoverBg: String, nodeSelectedBg: String, titleHeight: Double): TreeSharedToken = {
      val __obj = js.Dynamic.literal(nodeHoverBg = nodeHoverBg.asInstanceOf[js.Any], nodeSelectedBg = nodeSelectedBg.asInstanceOf[js.Any], titleHeight = titleHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeSharedToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: TreeSharedToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNodeHoverBg(value: String): Self = StObject.set(x, "nodeHoverBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeSelectedBg(value: String): Self = StObject.set(x, "nodeSelectedBg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleHeight(value: Double): Self = StObject.set(x, "titleHeight", value.asInstanceOf[js.Any])
    }
  }
  
  type TreeToken = FullToken[Tree] with TreeCls
}
