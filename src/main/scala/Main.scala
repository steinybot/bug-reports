import java.time._
import java.time.zone.ZoneOffsetTransition
import java.time.zone.ZoneOffsetTransitionRule
import java.time.zone.ZoneRules
import java.util.Collections

// Bug report for bug 9063277
object Main extends App {

  val maxLocalDateTime: Instant = LocalDateTime.of(Year.MAX_VALUE, 12, 31, 23, 59, 59, 999999999).toInstant(ZoneOffset.UTC)
  val offsetZero: ZoneOffset = ZoneOffset.ofHours(0)
  val offsetPlusOneHour: ZoneOffset = ZoneOffset.ofHours(1)
  val zoneRulesA: ZoneRules = ZoneRules.of(offsetPlusOneHour)
  val transition: ZoneOffsetTransition = ZoneOffsetTransition.of(LocalDateTime.ofEpochSecond(0, 0, offsetZero), offsetZero, offsetPlusOneHour)
  val transitionRule: ZoneOffsetTransitionRule = ZoneOffsetTransitionRule.of(Month.JANUARY, 1, DayOfWeek.SUNDAY, LocalTime.MIDNIGHT, true, ZoneOffsetTransitionRule.TimeDefinition.STANDARD, offsetZero, offsetZero, offsetPlusOneHour)
  val zoneRulesB: ZoneRules = ZoneRules.of(offsetZero, offsetZero, Collections.singletonList(transition), Collections.singletonList(transition), Collections.singletonList(transitionRule))
  val offsetA: ZoneOffset = zoneRulesA.getOffset(maxLocalDateTime)
  val offsetB: ZoneOffset = zoneRulesB.getOffset(maxLocalDateTime)
  val areEqual: Boolean = offsetA == offsetB
  System.out.println(areEqual)
}
