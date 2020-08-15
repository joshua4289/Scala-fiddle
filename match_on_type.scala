 // define a class

 case class Trip(to:String)
 case class  Car(model:String)
 case class  Cash(amount:Integer)
 case class NoPrize()
 val magicBucket = List(NoPrize(),Car("Tesla"),Trip("New Zealand"),
  NoPrize(),Trip("California"),Cash(1000),Cash(500))


 // now pick a random item

 import scala.util.Random
 // match on type of class


 Random.shuffle(magicBucket).take(1).head match {
  case t : Trip => println(s"You won a trip to ${t.to}")
  case c : Car => println(s"You won a car ${c.model}")
  case ca : Cash => println(s"You won ${ca.amount}")
  case _ : NoPrize => println("Hard luck,you did not win anything ")
 }
