package web.typings.antd

import web.typings.antd.anon.PickAntdIconPropscitedata
import web.typings.react.mod.CSSProperties
import web.typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esResultMod extends Shortcut {
  
  @JSImport("antd/es/result", JSImport.Default)
  @js.native
  val default: ResultType = js.native
  
  object ExceptionMap {
    
    @JSImport("antd/es/result", "ExceptionMap.403")
    @js.native
    val `403`: ReactComponentClass[js.Object] = js.native
    
    @JSImport("antd/es/result", "ExceptionMap.404")
    @js.native
    val `404`: ReactComponentClass[js.Object] = js.native
    
    @JSImport("antd/es/result", "ExceptionMap.500")
    @js.native
    val `500`: ReactComponentClass[js.Object] = js.native
  }
  
  object IconMap {
    
    @JSImport("antd/es/result", "IconMap")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/es/result", "IconMap.error")
    @js.native
    def error: ReactComponentClass[PickAntdIconPropscitedata] = js.native
    @scala.inline
    def error_=(x: ReactComponentClass[PickAntdIconPropscitedata]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/result", "IconMap.info")
    @js.native
    def info: ReactComponentClass[PickAntdIconPropscitedata] = js.native
    @scala.inline
    def info_=(x: ReactComponentClass[PickAntdIconPropscitedata]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/result", "IconMap.success")
    @js.native
    def success: ReactComponentClass[PickAntdIconPropscitedata] = js.native
    @scala.inline
    def success_=(x: ReactComponentClass[PickAntdIconPropscitedata]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("success")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/es/result", "IconMap.warning")
    @js.native
    def warning: ReactComponentClass[PickAntdIconPropscitedata] = js.native
    @scala.inline
    def warning_=(x: ReactComponentClass[PickAntdIconPropscitedata]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warning")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.antdInts.`403`
    - `web.typings`.antd.antdInts.`404`
    - `web.typings`.antd.antdInts.`500`
    - `web.typings`.antd.antdStrings.`403`
    - `web.typings`.antd.antdStrings.`404`
    - `web.typings`.antd.antdStrings.`500`
  */
  trait ExceptionStatusType
    extends StObject
       with ResultStatusType
  object ExceptionStatusType {
    
    @scala.inline
    def `403`: web.typings.antd.antdInts.`403` = 403.asInstanceOf[web.typings.antd.antdInts.`403`]
    
    @scala.inline
    def `404`: web.typings.antd.antdInts.`404` = 404.asInstanceOf[web.typings.antd.antdInts.`404`]
    
    @scala.inline
    def `500`: web.typings.antd.antdInts.`500` = 500.asInstanceOf[web.typings.antd.antdInts.`500`]
  }
  
  @js.native
  trait ResultProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var extra: js.UndefOr[ReactElement] = js.native
    
    var icon: js.UndefOr[ReactElement] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var rootClassName: js.UndefOr[String] = js.native
    
    var status: js.UndefOr[ResultStatusType] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var subTitle: js.UndefOr[ReactElement] = js.native
    
    var title: js.UndefOr[ReactElement] = js.native
  }
  object ResultProps {
    
    @scala.inline
    def apply(): ResultProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResultProps]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ResultProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setExtra(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setStatus(value: ResultStatusType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSubTitle(value: ReactElement): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `web.typings`.antd.esResultMod.ExceptionStatusType
    - `web.typings`.antd.antdStrings.success
    - `web.typings`.antd.antdStrings.error
    - `web.typings`.antd.antdStrings.info
    - `web.typings`.antd.antdStrings.warning
  */
  trait ResultStatusType extends StObject
  
  @js.native
  trait ResultType
    extends StObject
       with FunctionComponent[ResultProps] {
    
    var PRESENTED_IMAGE_403: ReactComponentClass[js.Object] = js.native
    
    var PRESENTED_IMAGE_404: ReactComponentClass[js.Object] = js.native
    
    var PRESENTED_IMAGE_500: ReactComponentClass[js.Object] = js.native
  }
  
  type _To = ResultType
  
  /* This means you don't have to write `default`, but can instead just say `esResultMod.foo` */
  override def _to: ResultType = default
}
