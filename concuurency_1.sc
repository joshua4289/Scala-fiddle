import java.util.Date

import scala.concurrent.Future
// this will be expected to fail

//val fut = Future{Thread.sleep(10000);21+21}

//because we need an execution context

import scala.concurrent.ExecutionContext.Implicits.global
val fut = Future{Thread.sleep(10000);21+21}

println(fut.isCompleted)

new Date()


println(fut.isCompleted)

// we can get the value out from the future
// when it is completed
import scala.util.{Success,Failure}
fut.onComplete(
  {
    case Success(result) => println("got "+result+ " " + new Date())
    case Failure(e) => println("failure " + e)
  }
)
