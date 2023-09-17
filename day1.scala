def findMaxCalorieSum(calorieStringAll: String, topHowMany: Int = 1): Int =
  calorieStringAll.split("""\n\s+""")
  .map(calorieStringIndividual => calorieStringIndividual.split('\n')
                                  .map(calorie => try calorie.trim.toInt
                                                  catch case e: java.lang.NumberFormatException => 0)
                                  .sum)
  .sorted(Ordering.Int.reverse)
  .take(topHowMany)
  .sum
