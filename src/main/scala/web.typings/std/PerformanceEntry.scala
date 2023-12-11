package web.typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Encapsulates a single performance metric that is part of the performance timeline. A performance entry can be directly created by making a performance mark or measure (for example by calling the mark() method) at an explicit point in an application. Performance entries are also created in indirect ways such as loading a resource (such as an image). */
@js.native
trait PerformanceEntry extends StObject {
  
  /* standard dom */
  val duration: Double = js.native
  
  /* standard dom */
  val entryType: java.lang.String = js.native
  
  /* standard dom */
  val name: java.lang.String = js.native
  
  /* standard dom */
  val startTime: Double = js.native
  
  /* standard dom */
  def toJSON(): Any = js.native
}
object PerformanceEntry {
  
  @scala.inline
  def apply(
    duration: Double,
    entryType: java.lang.String,
    name: java.lang.String,
    startTime: Double,
    toJSON: () => Any
  ): PerformanceEntry = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[PerformanceEntry]
  }
  
  @scala.inline
  implicit class MutableBuilder[Self <: PerformanceEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryType(value: java.lang.String): Self = StObject.set(x, "entryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
