// this has rough misc methods

var a = List(1,2,3,4,5)
a.min
a.max
var b  =  a.map(math.E * _)
b

case class Event(location:String,dayOfWeek:String,
                 sessionTimeInSeconds:Integer,source:String)

val event1 = Event("US","Wednesday",10,"Twitter")
val event2 = Event("India","Tuesday",10,"Twitter")
val event3 = Event("US","Tuesday",10,"Facebook")
val event4 = Event("India","Tuesday",10,"Facebook")

var ListofEvents = List(event1,event2,event3,event4)

val LocationList = ListofEvents.map(event => event.location)
println(LocationList)

// take a nested list
// add 1 to every element of nested list
// return a single list

val listMain = List(List(1,2,3,4),List(5,6,7))
val addedOne = listMain.map(alist => alist.map(_ + 1)).flatten

// now you still have list of lists
//so you flatten
// we want to be concise
val addedOneOther = listMain.flatMap(alist => alist.map(_ + 1))

