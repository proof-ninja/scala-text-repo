object NextDayOfWeek {
  def main(args: Array[String]): Unit = {
    val d = Friday
    println(nextDayOfWeek(d))
  }
  def nextDayOfWeek(d: DayOfWeek): DayOfWeek = {
    d match {
      case Sunday => Monday
      case Monday => Tuesday
      case Tuesday => Wednesday
      case Wednesday => Thursday
      case Thursday => Friday
      case Friday => Saturday
      case Saturday => Sunday
    }
  }
}
