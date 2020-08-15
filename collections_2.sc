// an example of Sets and maps

val a = Set(1,2,3,4,5)
val b = a+5
val c = b + 5
val d  = c ++ Set(0,1,10)

val weekday = Map(1->"Monday",2->"Monday",3->"Tuesday")
weekday(1)
// iterate over the map
// indexes start from 1 not 0

weekday.foreach(entry => println(s"${entry._1} => ${entry._2}"))


// similar with tuples

val tup = (10,20,30)
println(tup._1)
println(tup._2)
println(tup._3)
