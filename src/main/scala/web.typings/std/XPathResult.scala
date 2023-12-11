package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The results generated by evaluating an XPath expression within the context of a given node. */
@js.native
trait XPathResult extends StObject {
  
  /* standard dom */
  val ANY_TYPE: Double = js.native
  
  /* standard dom */
  val ANY_UNORDERED_NODE_TYPE: Double = js.native
  
  /* standard dom */
  val BOOLEAN_TYPE: Double = js.native
  
  /* standard dom */
  val FIRST_ORDERED_NODE_TYPE: Double = js.native
  
  /* standard dom */
  val NUMBER_TYPE: Double = js.native
  
  /* standard dom */
  val ORDERED_NODE_ITERATOR_TYPE: Double = js.native
  
  /* standard dom */
  val ORDERED_NODE_SNAPSHOT_TYPE: Double = js.native
  
  /* standard dom */
  val STRING_TYPE: Double = js.native
  
  /* standard dom */
  val UNORDERED_NODE_ITERATOR_TYPE: Double = js.native
  
  /* standard dom */
  val UNORDERED_NODE_SNAPSHOT_TYPE: Double = js.native
  
  /* standard dom */
  val booleanValue: scala.Boolean = js.native
  
  /* standard dom */
  val invalidIteratorState: scala.Boolean = js.native
  
  /* standard dom */
  def iterateNext(): org.scalajs.dom.Node | Null = js.native
  
  /* standard dom */
  val numberValue: Double = js.native
  
  /* standard dom */
  val resultType: Double = js.native
  
  /* standard dom */
  val singleNodeValue: org.scalajs.dom.Node | Null = js.native
  
  /* standard dom */
  def snapshotItem(index: Double): org.scalajs.dom.Node | Null = js.native
  
  /* standard dom */
  val snapshotLength: Double = js.native
  
  /* standard dom */
  val stringValue: java.lang.String = js.native
}
object XPathResult {
  
  @scala.inline
  def apply(
    ANY_TYPE: Double,
    ANY_UNORDERED_NODE_TYPE: Double,
    BOOLEAN_TYPE: Double,
    FIRST_ORDERED_NODE_TYPE: Double,
    NUMBER_TYPE: Double,
    ORDERED_NODE_ITERATOR_TYPE: Double,
    ORDERED_NODE_SNAPSHOT_TYPE: Double,
    STRING_TYPE: Double,
    UNORDERED_NODE_ITERATOR_TYPE: Double,
    UNORDERED_NODE_SNAPSHOT_TYPE: Double,
    booleanValue: scala.Boolean,
    invalidIteratorState: scala.Boolean,
    iterateNext: () => org.scalajs.dom.Node | Null,
    numberValue: Double,
    resultType: Double,
    snapshotItem: Double => org.scalajs.dom.Node | Null,
    snapshotLength: Double,
    stringValue: java.lang.String
  ): XPathResult = {
    val __obj = js.Dynamic.literal(ANY_TYPE = ANY_TYPE.asInstanceOf[js.Any], ANY_UNORDERED_NODE_TYPE = ANY_UNORDERED_NODE_TYPE.asInstanceOf[js.Any], BOOLEAN_TYPE = BOOLEAN_TYPE.asInstanceOf[js.Any], FIRST_ORDERED_NODE_TYPE = FIRST_ORDERED_NODE_TYPE.asInstanceOf[js.Any], NUMBER_TYPE = NUMBER_TYPE.asInstanceOf[js.Any], ORDERED_NODE_ITERATOR_TYPE = ORDERED_NODE_ITERATOR_TYPE.asInstanceOf[js.Any], ORDERED_NODE_SNAPSHOT_TYPE = ORDERED_NODE_SNAPSHOT_TYPE.asInstanceOf[js.Any], STRING_TYPE = STRING_TYPE.asInstanceOf[js.Any], UNORDERED_NODE_ITERATOR_TYPE = UNORDERED_NODE_ITERATOR_TYPE.asInstanceOf[js.Any], UNORDERED_NODE_SNAPSHOT_TYPE = UNORDERED_NODE_SNAPSHOT_TYPE.asInstanceOf[js.Any], booleanValue = booleanValue.asInstanceOf[js.Any], invalidIteratorState = invalidIteratorState.asInstanceOf[js.Any], iterateNext = js.Any.fromFunction0(iterateNext), numberValue = numberValue.asInstanceOf[js.Any], resultType = resultType.asInstanceOf[js.Any], snapshotItem = js.Any.fromFunction1(snapshotItem), snapshotLength = snapshotLength.asInstanceOf[js.Any], stringValue = stringValue.asInstanceOf[js.Any], singleNodeValue = null)
    __obj.asInstanceOf[XPathResult]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: XPathResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setANY_TYPE(value: Double): Self = StObject.set(x, "ANY_TYPE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setANY_UNORDERED_NODE_TYPE(value: Double): Self = StObject.set(x, "ANY_UNORDERED_NODE_TYPE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBOOLEAN_TYPE(value: Double): Self = StObject.set(x, "BOOLEAN_TYPE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanValue(value: scala.Boolean): Self = StObject.set(x, "booleanValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFIRST_ORDERED_NODE_TYPE(value: Double): Self = StObject.set(x, "FIRST_ORDERED_NODE_TYPE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidIteratorState(value: scala.Boolean): Self = StObject.set(x, "invalidIteratorState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterateNext(value: () => org.scalajs.dom.Node | Null): Self = StObject.set(x, "iterateNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNUMBER_TYPE(value: Double): Self = StObject.set(x, "NUMBER_TYPE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberValue(value: Double): Self = StObject.set(x, "numberValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setORDERED_NODE_ITERATOR_TYPE(value: Double): Self = StObject.set(x, "ORDERED_NODE_ITERATOR_TYPE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setORDERED_NODE_SNAPSHOT_TYPE(value: Double): Self = StObject.set(x, "ORDERED_NODE_SNAPSHOT_TYPE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultType(value: Double): Self = StObject.set(x, "resultType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTRING_TYPE(value: Double): Self = StObject.set(x, "STRING_TYPE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleNodeValue(value: org.scalajs.dom.Node): Self = StObject.set(x, "singleNodeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleNodeValueNull: Self = StObject.set(x, "singleNodeValue", null)
    
    @scala.inline
    def setSnapshotItem(value: Double => org.scalajs.dom.Node | Null): Self = StObject.set(x, "snapshotItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSnapshotLength(value: Double): Self = StObject.set(x, "snapshotLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValue(value: java.lang.String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNORDERED_NODE_ITERATOR_TYPE(value: Double): Self = StObject.set(x, "UNORDERED_NODE_ITERATOR_TYPE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNORDERED_NODE_SNAPSHOT_TYPE(value: Double): Self = StObject.set(x, "UNORDERED_NODE_SNAPSHOT_TYPE", value.asInstanceOf[js.Any])
  }
}
