package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The SVGTransformList defines a list of SVGTransform objects. */
@js.native
trait SVGTransformList extends StObject {
  
  /* standard dom */
  def appendItem(newItem: org.scalajs.dom.SVGTransform): org.scalajs.dom.SVGTransform = js.native
  
  /* standard dom */
  def clear(): Unit = js.native
  
  /* standard dom */
  def consolidate(): org.scalajs.dom.SVGTransform = js.native
  
  /* standard dom */
  def createSVGTransformFromMatrix(matrix: org.scalajs.dom.SVGMatrix): org.scalajs.dom.SVGTransform = js.native
  
  /* standard dom */
  def getItem(index: Double): org.scalajs.dom.SVGTransform = js.native
  
  /* standard dom */
  def initialize(newItem: org.scalajs.dom.SVGTransform): org.scalajs.dom.SVGTransform = js.native
  
  /* standard dom */
  def insertItemBefore(newItem: org.scalajs.dom.SVGTransform, index: Double): org.scalajs.dom.SVGTransform = js.native
  
  /* standard dom */
  val numberOfItems: Double = js.native
  
  /* standard dom */
  def removeItem(index: Double): org.scalajs.dom.SVGTransform = js.native
  
  /* standard dom */
  def replaceItem(newItem: org.scalajs.dom.SVGTransform, index: Double): org.scalajs.dom.SVGTransform = js.native
}
object SVGTransformList {
  
  @scala.inline
  def apply(
    appendItem: org.scalajs.dom.SVGTransform => org.scalajs.dom.SVGTransform,
    clear: () => Unit,
    consolidate: () => org.scalajs.dom.SVGTransform,
    createSVGTransformFromMatrix: org.scalajs.dom.SVGMatrix => org.scalajs.dom.SVGTransform,
    getItem: Double => org.scalajs.dom.SVGTransform,
    initialize: org.scalajs.dom.SVGTransform => org.scalajs.dom.SVGTransform,
    insertItemBefore: (org.scalajs.dom.SVGTransform, Double) => org.scalajs.dom.SVGTransform,
    numberOfItems: Double,
    removeItem: Double => org.scalajs.dom.SVGTransform,
    replaceItem: (org.scalajs.dom.SVGTransform, Double) => org.scalajs.dom.SVGTransform
  ): SVGTransformList = {
    val __obj = js.Dynamic.literal(appendItem = js.Any.fromFunction1(appendItem), clear = js.Any.fromFunction0(clear), consolidate = js.Any.fromFunction0(consolidate), createSVGTransformFromMatrix = js.Any.fromFunction1(createSVGTransformFromMatrix), getItem = js.Any.fromFunction1(getItem), initialize = js.Any.fromFunction1(initialize), insertItemBefore = js.Any.fromFunction2(insertItemBefore), numberOfItems = numberOfItems.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), replaceItem = js.Any.fromFunction2(replaceItem))
    __obj.asInstanceOf[SVGTransformList]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: SVGTransformList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendItem(value: org.scalajs.dom.SVGTransform => org.scalajs.dom.SVGTransform): Self = StObject.set(x, "appendItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConsolidate(value: () => org.scalajs.dom.SVGTransform): Self = StObject.set(x, "consolidate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateSVGTransformFromMatrix(value: org.scalajs.dom.SVGMatrix => org.scalajs.dom.SVGTransform): Self = StObject.set(x, "createSVGTransformFromMatrix", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItem(value: Double => org.scalajs.dom.SVGTransform): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitialize(value: org.scalajs.dom.SVGTransform => org.scalajs.dom.SVGTransform): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsertItemBefore(value: (org.scalajs.dom.SVGTransform, Double) => org.scalajs.dom.SVGTransform): Self = StObject.set(x, "insertItemBefore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNumberOfItems(value: Double): Self = StObject.set(x, "numberOfItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveItem(value: Double => org.scalajs.dom.SVGTransform): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReplaceItem(value: (org.scalajs.dom.SVGTransform, Double) => org.scalajs.dom.SVGTransform): Self = StObject.set(x, "replaceItem", js.Any.fromFunction2(value))
  }
}
