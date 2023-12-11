package web.typings.antd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esThemeInterfaceMapsSizeMod {
  
  @js.native
  trait HeightMapToken extends StObject {
    
    /**
      * @nameZH 较高的组件高度
      * @nameEN LG component height
      * @desc 较高的组件高度
      * @descEN LG component height
      */
    var controlHeightLG: Double = js.native
    
    /**
      * @nameZH 较小的组件高度
      * @nameEN SM component height
      * @desc 较小的组件高度
      * @descEN SM component height
      */
    var controlHeightSM: Double = js.native
    
    /** Only Used for control inside component like Multiple Select inner selection item */
    /**
      * @nameZH 更小的组件高度
      * @nameEN XS component height
      * @desc 更小的组件高度
      * @descEN XS component height
      */
    var controlHeightXS: Double = js.native
  }
  object HeightMapToken {
    
    @scala.inline
    def apply(controlHeightLG: Double, controlHeightSM: Double, controlHeightXS: Double): HeightMapToken = {
      val __obj = js.Dynamic.literal(controlHeightLG = controlHeightLG.asInstanceOf[js.Any], controlHeightSM = controlHeightSM.asInstanceOf[js.Any], controlHeightXS = controlHeightXS.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeightMapToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: HeightMapToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setControlHeightLG(value: Double): Self = StObject.set(x, "controlHeightLG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlHeightSM(value: Double): Self = StObject.set(x, "controlHeightSM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlHeightXS(value: Double): Self = StObject.set(x, "controlHeightXS", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SizeMapToken extends StObject {
    
    /**
      * @nameZH 默认
      * @desc 默认尺寸
      * @default 16
      */
    var size: Double = js.native
    
    /**
      * @nameZH LG
      * @default 24
      */
    var sizeLG: Double = js.native
    
    /**
      * @nameZH MD
      * @default 20
      */
    var sizeMD: Double = js.native
    
    /** Same as size by default, but could be larger in compact mode */
    var sizeMS: Double = js.native
    
    /**
      * @nameZH SM
      * @default 12
      */
    var sizeSM: Double = js.native
    
    /**
      * @nameZH XL
      * @default 32
      */
    var sizeXL: Double = js.native
    
    /**
      * @nameZH XS
      * @default 8
      */
    var sizeXS: Double = js.native
    
    /**
      * @nameZH XXL
      * @default 48
      */
    var sizeXXL: Double = js.native
    
    /**
      * @nameZH XXS
      * @default 4
      */
    var sizeXXS: Double = js.native
  }
  object SizeMapToken {
    
    @scala.inline
    def apply(
      size: Double,
      sizeLG: Double,
      sizeMD: Double,
      sizeMS: Double,
      sizeSM: Double,
      sizeXL: Double,
      sizeXS: Double,
      sizeXXL: Double,
      sizeXXS: Double
    ): SizeMapToken = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], sizeLG = sizeLG.asInstanceOf[js.Any], sizeMD = sizeMD.asInstanceOf[js.Any], sizeMS = sizeMS.asInstanceOf[js.Any], sizeSM = sizeSM.asInstanceOf[js.Any], sizeXL = sizeXL.asInstanceOf[js.Any], sizeXS = sizeXS.asInstanceOf[js.Any], sizeXXL = sizeXXL.asInstanceOf[js.Any], sizeXXS = sizeXXS.asInstanceOf[js.Any])
      __obj.asInstanceOf[SizeMapToken]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: SizeMapToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeLG(value: Double): Self = StObject.set(x, "sizeLG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeMD(value: Double): Self = StObject.set(x, "sizeMD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeMS(value: Double): Self = StObject.set(x, "sizeMS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeSM(value: Double): Self = StObject.set(x, "sizeSM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeXL(value: Double): Self = StObject.set(x, "sizeXL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeXS(value: Double): Self = StObject.set(x, "sizeXS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeXXL(value: Double): Self = StObject.set(x, "sizeXXL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeXXS(value: Double): Self = StObject.set(x, "sizeXXS", value.asInstanceOf[js.Any])
    }
  }
}
