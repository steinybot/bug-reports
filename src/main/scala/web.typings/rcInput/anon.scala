package web.typings.rcInput

import web.typings.rcInput.esInterfaceMod.DataAttr
import web.typings.rcInput.esInterfaceMod.ShowCountFormatter
import web.typings.rcInput.rcInputStrings.div
import web.typings.rcInput.rcInputStrings.span
import web.typings.react.mod.CSSProperties
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    var affixWrapper: js.UndefOr[DataAttr] = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAffixWrapper(value: DataAttr): Self = StObject.set(x, "affixWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAffixWrapperUndefined: Self = StObject.set(x, "affixWrapper", js.undefined)
    }
  }
  
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
  trait ClearIcon extends StObject {
    
    var clearIcon: js.UndefOr[ReactElement] = js.native
  }
  object ClearIcon {
    
    @scala.inline
    def apply(): ClearIcon = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClearIcon]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: ClearIcon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearIcon(value: ReactElement): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
    }
  }
  
  @js.native
  trait Count extends StObject {
    
    var count: Double = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var value: String = js.native
  }
  object Count {
    
    @scala.inline
    def apply(count: Double, value: String): Count = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Count]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CountInput extends StObject {
    
    var count: js.UndefOr[CSSProperties] = js.native
    
    var input: js.UndefOr[CSSProperties] = js.native
  }
  object CountInput {
    
    @scala.inline
    def apply(): CountInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CountInput]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: CountInput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: CSSProperties): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setInput(value: CSSProperties): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    }
  }
  
  @js.native
  trait Formatter extends StObject {
    
    var formatter: ShowCountFormatter = js.native
  }
  object Formatter {
    
    @scala.inline
    def apply(formatter: /* args */ Count => ReactElement): Formatter = {
      val __obj = js.Dynamic.literal(formatter = js.Any.fromFunction1(formatter))
      __obj.asInstanceOf[Formatter]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Formatter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormatter(value: /* args */ Count => ReactElement): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait GroupAddon extends StObject {
    
    var affixWrapper: js.UndefOr[span | div] = js.native
    
    var groupAddon: js.UndefOr[span | div] = js.native
    
    var groupWrapper: js.UndefOr[span | div] = js.native
    
    var wrapper: js.UndefOr[span | div] = js.native
  }
  object GroupAddon {
    
    @scala.inline
    def apply(): GroupAddon = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupAddon]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: GroupAddon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAffixWrapper(value: span | div): Self = StObject.set(x, "affixWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAffixWrapperUndefined: Self = StObject.set(x, "affixWrapper", js.undefined)
      
      @scala.inline
      def setGroupAddon(value: span | div): Self = StObject.set(x, "groupAddon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupAddonUndefined: Self = StObject.set(x, "groupAddon", js.undefined)
      
      @scala.inline
      def setGroupWrapper(value: span | div): Self = StObject.set(x, "groupWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupWrapperUndefined: Self = StObject.set(x, "groupWrapper", js.undefined)
      
      @scala.inline
      def setWrapper(value: span | div): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  @js.native
  trait Input extends StObject {
    
    var count: js.UndefOr[String] = js.native
    
    var input: js.UndefOr[String] = js.native
  }
  object Input {
    
    @scala.inline
    def apply(): Input = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Input]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    }
  }
  
  @js.native
  trait Max extends StObject {
    
    var max: Double = js.native
  }
  object Max {
    
    @scala.inline
    def apply(max: Double): Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Prefix extends StObject {
    
    var affixWrapper: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var suffix: js.UndefOr[String] = js.native
  }
  object Prefix {
    
    @scala.inline
    def apply(): Prefix = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Prefix]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Prefix] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAffixWrapper(value: String): Self = StObject.set(x, "affixWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAffixWrapperUndefined: Self = StObject.set(x, "affixWrapper", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  @js.native
  trait Suffix extends StObject {
    
    var affixWrapper: js.UndefOr[CSSProperties] = js.native
    
    var prefix: js.UndefOr[CSSProperties] = js.native
    
    var suffix: js.UndefOr[CSSProperties] = js.native
  }
  object Suffix {
    
    @scala.inline
    def apply(): Suffix = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Suffix]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: Suffix] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAffixWrapper(value: CSSProperties): Self = StObject.set(x, "affixWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAffixWrapperUndefined: Self = StObject.set(x, "affixWrapper", js.undefined)
      
      @scala.inline
      def setPrefix(value: CSSProperties): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setSuffix(value: CSSProperties): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
}
