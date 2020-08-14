val employee = Set("John","Sam","Mary","Stacie")
employee.find(_ == "John").get
// when not found None
//employee.find(_ == "Frank").get
// this blows up

val maybeFrank = employee.find(_ =="Frank")
if (maybeFrank.isDefined) println(maybeFrank.get)

// better way of doing it
employee.find(_ == "Frank").getOrElse("employee  not found")

import scala.util.{Try,Success,Failure}
val outcome = Try(10/0)
outcome.isSuccess
outcome.isFailure
// this is the nice matching syntax

outcome match {
  case Failure(exception) => println("Computation failed" + exception.getLocalizedMessage)
  case Success(value) => println("value of computation is " + value)
}

// this is a nice example of what we can do
// right side is a success
//left is opposite of success == fail

import scala.util.Either
def stringToInt(in:String): Either[String,Int] ={
  try{
    Right(in.toInt)
  } catch {
    case e: NumberFormatException => Left("Error: "+ e.getLocalizedMessage)
  }
}
val fivetoInt = stringToInt("5")
val hellotoInt = stringToInt("hello")
