package web.typings.rcInputNumber

import web.typings.rcComponentMiniDecimal.esInterfaceMod.ValueType
import web.typings.rcInputNumber.rcInputNumberStrings.down
import web.typings.rcInputNumber.rcInputNumberStrings.up
import web.typings.react.mod.Ref
import org.scalajs.dom.HTMLInputElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AffixWrapper extends StObject {
    
    var affixWrapper: js.UndefOr[String] = js.native
    
    var group: js.UndefOr[String] = js.native
    
    var wrapper: js.UndefOr[String] = js.native
  }
  object AffixWrapper {
    
    @scala.inline
    def apply(): AffixWrapper = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AffixWrapper]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: AffixWrapper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAffixWrapper(value: String): Self = StObject.set(x, "affixWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAffixWrapperUndefined: Self = StObject.set(x, "affixWrapper", js.undefined)
      
      @scala.inline
      def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setWrapper(value: String): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  @js.native
  trait Children extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var ref: js.UndefOr[Ref[HTMLInputElement]] = js.native
  }
  object Children {
    
    @scala.inline
    def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefReactRef(value: ReactRef[HTMLInputElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  @js.native
  trait DisplayName extends StObject {
    
    var displayName: js.UndefOr[String] = js.native
  }
  object DisplayName {
    
    @scala.inline
    def apply(): DisplayName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisplayName]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: DisplayName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    }
  }
  
  @js.native
  trait Group extends StObject {
    
    var affixWrapper: js.UndefOr[String] = js.native
    
    var group: js.UndefOr[String] = js.native
    
    var input: js.UndefOr[String] = js.native
    
    var wrapper: js.UndefOr[String] = js.native
  }
  object Group {
    
    @scala.inline
    def apply(): Group = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Group]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAffixWrapper(value: String): Self = StObject.set(x, "affixWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAffixWrapperUndefined: Self = StObject.set(x, "affixWrapper", js.undefined)
      
      @scala.inline
      def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setWrapper(value: String): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  @js.native
  trait Input extends StObject {
    
    var input: String = js.native
    
    var userTyping: Boolean = js.native
  }
  object Input {
    
    @scala.inline
    def apply(input: String, userTyping: Boolean): Input = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], userTyping = userTyping.asInstanceOf[js.Any])
      __obj.asInstanceOf[Input]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserTyping(value: Boolean): Self = StObject.set(x, "userTyping", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Offset extends StObject {
    
    var offset: ValueType = js.native
    
    var `type`: up | down = js.native
  }
  object Offset {
    
    @scala.inline
    def apply(offset: ValueType, `type`: up | down): Offset = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Offset]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOffset(value: ValueType): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: up | down): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
