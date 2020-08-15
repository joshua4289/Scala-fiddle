// the collections library big
// we are aiming only to nderstand the basics

val a  = List(1,2,3,4,5)
a :+ 6

// list of list

a :+(8,9,10)

// a List in scala is a linked list
a.head
a.tail

// the expressions are immutable so
// if  you need the value of an expression
// you assign it to a val

val b = a :+(8,9,10)
// same property of immutability

b.drop(1)
b
val b1 = b.drop(1)
b1
// you can filter if all the elements are Int
a.dropWhile(1 < _)
// is a mixed collection
// b[Any] instead of b[Int]
// this expression will fail because it does
// not know how to compare a list and a number
//b.dropWhile(a < _)
