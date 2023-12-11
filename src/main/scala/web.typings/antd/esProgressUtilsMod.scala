package web.typings.antd

import web.typings.antd.anon.PartialCircleProps
import web.typings.antd.anon.Steps
import web.typings.antd.antdStrings.step
import web.typings.antd.esProgressProgressMod.ProgressProps
import web.typings.antd.esProgressProgressMod.ProgressSize
import web.typings.antd.esProgressProgressMod.ProgressType
import web.typings.std.PropertyKey
import web.typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esProgressUtilsMod {
  
  @JSImport("antd/es/progress/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getPercentage(param0: ProgressProps): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPercentage")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def getSize(size: ProgressSize, `type`: js.UndefOr[ProgressType]): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  @scala.inline
  def getSize(size: ProgressSize, `type`: js.UndefOr[ProgressType], extra: Steps): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  @scala.inline
  def getSize(size: js.Tuple2[Double | String, Double], `type`: js.UndefOr[ProgressType]): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  @scala.inline
  def getSize(size: js.Tuple2[Double | String, Double], `type`: js.UndefOr[ProgressType], extra: Steps): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  @scala.inline
  def getSize(size: Double, `type`: js.UndefOr[ProgressType]): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  @scala.inline
  def getSize(size: Double, `type`: js.UndefOr[ProgressType], extra: Steps): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  @scala.inline
  def getSize(size: Unit, `type`: js.UndefOr[ProgressType]): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  @scala.inline
  def getSize(size: Unit, `type`: js.UndefOr[ProgressType], extra: Steps): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  @scala.inline
  def getSize_step(size: ProgressSize, `type`: step): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  @scala.inline
  def getSize_step(size: ProgressSize, `type`: step, extra: Steps): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  @scala.inline
  def getSize_step(size: js.Tuple2[Double | String, Double], `type`: step): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  @scala.inline
  def getSize_step(size: js.Tuple2[Double | String, Double], `type`: step, extra: Steps): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  @scala.inline
  def getSize_step(size: Double, `type`: step): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  @scala.inline
  def getSize_step(size: Double, `type`: step, extra: Steps): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  @scala.inline
  def getSize_step(size: Unit, `type`: step): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  @scala.inline
  def getSize_step(size: Unit, `type`: step, extra: Steps): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  @scala.inline
  def getStrokeColor(param0: PartialCircleProps): js.Array[String | (Record[PropertyKey, String])] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeColor")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[String | (Record[PropertyKey, String])]]
  
  @scala.inline
  def getSuccessPercent(param0: ProgressProps): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSuccessPercent")(param0.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  @scala.inline
  def validProgress(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("validProgress")().asInstanceOf[Double]
  @scala.inline
  def validProgress(progress: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("validProgress")(progress.asInstanceOf[js.Any]).asInstanceOf[Double]
}
