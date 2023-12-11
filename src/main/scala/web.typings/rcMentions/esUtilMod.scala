package web.typings.rcMentions

import web.typings.rcMentions.anon.SelectionLocation
import web.typings.rcMentions.esOptionMod.OptionProps
import org.scalajs.dom.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilMod {
  
  @JSImport("rc-mentions/es/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def filterOption(input: String, param1: OptionProps): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOption")(input.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def getBeforeSelectionText(input: HTMLTextAreaElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBeforeSelectionText")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getLastMeasureIndex(text: String, prefix: js.Array[String]): MeasureIndex = (^.asInstanceOf[js.Dynamic].applyDynamic("getLastMeasureIndex")(text.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[MeasureIndex]
  
  @scala.inline
  def replaceWithMeasure(text: String, measureConfig: MeasureConfig): SelectionLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceWithMeasure")(text.asInstanceOf[js.Any], measureConfig.asInstanceOf[js.Any])).asInstanceOf[SelectionLocation]
  
  @scala.inline
  def setInputSelection(input: HTMLTextAreaElement, location: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setInputSelection")(input.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def validateSearch(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateSearch")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def validateSearch(text: String, split: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateSearch")(text.asInstanceOf[js.Any], split.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @js.native
  trait MeasureConfig extends StObject {
    
    var measureLocation: Double = js.native
    
    var prefix: String = js.native
    
    var selectionStart: Double = js.native
    
    var split: String = js.native
    
    var targetText: String = js.native
  }
  object MeasureConfig {
    
    @scala.inline
    def apply(measureLocation: Double, prefix: String, selectionStart: Double, split: String, targetText: String): MeasureConfig = {
      val __obj = js.Dynamic.literal(measureLocation = measureLocation.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any], split = split.asInstanceOf[js.Any], targetText = targetText.asInstanceOf[js.Any])
      __obj.asInstanceOf[MeasureConfig]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MeasureConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMeasureLocation(value: Double): Self = StObject.set(x, "measureLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionStart(value: Double): Self = StObject.set(x, "selectionStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplit(value: String): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetText(value: String): Self = StObject.set(x, "targetText", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MeasureIndex extends StObject {
    
    var location: Double = js.native
    
    var prefix: String = js.native
  }
  object MeasureIndex {
    
    @scala.inline
    def apply(location: Double, prefix: String): MeasureIndex = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[MeasureIndex]
    }
    
    @scala.inline
    implicit class MutableBuilder[Self <: MeasureIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
}
