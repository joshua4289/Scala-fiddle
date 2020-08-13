// Start writing your ScalaFiddle code here
val number = 59 
val m = number match {
  case 0 => "zero"
  case 1 => "one"
  case 5 => "five"
  case _ => "nil"
}
println(m)


// case class is like a struct 
// it holds fields and creates obhects with apply

case class Book(title:String,
yearPublished:Integer,
author: String,isbn: String)

val proginScala = Book("Functional Programming in Scala",
2011,"Lobo","12345")


val n = proginScala match{
  
  case Book(title,yearPublished,author,isbn) => println(s"$title <=> $yearPublished <=> $author <=> $isbn")
  case _ => "No match Found "
}
