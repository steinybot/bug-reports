package web.typings.ctrlTinycolor

import web.typings.ctrlTinycolor.distMod._ColorInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesMod {
  
  @js.native
  trait HSL
    extends StObject
       with _ColorInput {
    
    var h: Double | String = js.native
    
    var l: Double | String = js.native
    
    var s: Double | String = js.native
  }
  object HSL {
    
    @scala.inline
    def apply(h: Double | String, l: Double | String, s: Double | String): HSL = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSL]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: HSL] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setH(value: Double | String): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setL(value: Double | String): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: Double | String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `web.typings`.ctrlTinycolor.distMod._ColorInput because Already inherited */ @js.native
  trait HSLA
    extends StObject
       with HSL {
    
    var a: Double = js.native
  }
  object HSLA {
    
    @scala.inline
    def apply(a: Double, h: Double | String, l: Double | String, s: Double | String): HSLA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSLA]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: HSLA] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HSV
    extends StObject
       with _ColorInput {
    
    var h: Double | String = js.native
    
    var s: Double | String = js.native
    
    var v: Double | String = js.native
  }
  object HSV {
    
    @scala.inline
    def apply(h: Double | String, s: Double | String, v: Double | String): HSV = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSV]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: HSV] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setH(value: Double | String): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: Double | String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: Double | String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `web.typings`.ctrlTinycolor.distMod._ColorInput because Already inherited */ @js.native
  trait HSVA
    extends StObject
       with HSV {
    
    var a: Double = js.native
  }
  object HSVA {
    
    @scala.inline
    def apply(a: Double, h: Double | String, s: Double | String, v: Double | String): HSVA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSVA]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: HSVA] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: number}
    }}}
    */
  @js.native
  trait Numberify[T] extends StObject
  
  @js.native
  trait RGB
    extends StObject
       with _ColorInput {
    
    var b: Double | String = js.native
    
    var g: Double | String = js.native
    
    var r: Double | String = js.native
  }
  object RGB {
    
    @scala.inline
    def apply(b: Double | String, g: Double | String, r: Double | String): RGB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGB]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: RGB] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: Double | String): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG(value: Double | String): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double | String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `web.typings`.ctrlTinycolor.distMod._ColorInput because Already inherited */ @js.native
  trait RGBA
    extends StObject
       with RGB {
    
    var a: Double = js.native
  }
  object RGBA {
    
    @scala.inline
    def apply(a: Double, b: Double | String, g: Double | String, r: Double | String): RGBA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGBA]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: RGBA] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    }
  }
}
